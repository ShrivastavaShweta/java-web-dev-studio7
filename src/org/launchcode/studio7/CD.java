package org.launchcode.studio7;

public class CD extends BaseDisc{

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

    private final String genre;
    private final String productionCo;

    public CD(String title, String author, String discType, String genre, String productionCo) {
        super(title, author, discType);
        this.genre = genre;
        this.productionCo = productionCo;
    }

    @Override
    public String toString(){
        StringBuilder fileList = new StringBuilder();
        for (File file: getFiles()){
            fileList.append(file);
        }
        return super.toString() +
                "\nGenre: " + genre +
                "\nProduction Company: " + productionCo +
                "\nTracks: \n" +
                fileList;
    }
    @Override
    public void readData() {
        System.out.println(this);
    }

    @Override
    public void runFile(File file) {
        System.out.println("You are now enjoying " + file.getName() + " by" + getAuthor());
    }

    @Override
    public void writeData(File file){
        if (!file.getFileType().equals("audio")){
            System.out.println("The " + file.getFileType() + "type cannot be written to a CD");
        } else if (getSpaceUsed() + file.getSize() > CAPACITIES.get(getDiscType())){
            System.out.println("There is not enough space on the " + getDiscType() + " for " + file.getSize());
        } else {
            getFiles().add(file);
        }
    }

}
