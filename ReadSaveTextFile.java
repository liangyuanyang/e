public class ReadSaveTextFile implements IReadSaveData {

    @Override
    public void saveData(String data) {
        System.out.println("将数据保存到了文本文件中");
    }

    @Override
    public String getData() {
        System.out.println("从文本文件中读取了数据");
        return null;
    }
}

 class ReadSaveWordFile implements IReadSaveData{

    @Override
    public void saveData(String data) {
        System.out.println("将数据保存到了word文件中");
    }

    @Override
    public String getData() {
        System.out.println("从word文件中读取了数据");
        return null;
    }
}
