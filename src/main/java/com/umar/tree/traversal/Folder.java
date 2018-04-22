package com.umar.tree.traversal;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Folder {

    private String FolderName;
    private List<MyFile> myFileList;
    private List<Folder> folderList;
    private Map<String,MyFile> hashMapHashmap;


    public Folder(){}

    /*public com.umar.tree.traversal.Folder(String folderName, List<com.umar.tree.traversal.MyFile> myFileList, List<com.umar.tree.traversal.Folder> folderList) {
        FolderName = folderName;
        this.myFileList = myFileList;
        this.folderList = folderList;
    }*/

    public Folder(String folderName, Map<String ,MyFile> myFileMap, List<Folder> folderList) {
        FolderName = folderName;
        this.hashMapHashmap = myFileMap;
        this.folderList = folderList;
    }

    public void setHashMapHashmap(String fileName, MyFile file) {
        this.hashMapHashmap.put(fileName,file);
    }

    public Map<String, MyFile> getHashMapHashmap() {
        return hashMapHashmap;
    }

    public String getFolderName() {
        return FolderName;
    }

    public void setFolderName(String folderName) {
        FolderName = folderName;
    }

    public List<MyFile> getMyFileList() {
        return myFileList;
    }

    public void setMyFileList(List<MyFile> myFileList) {
        this.myFileList = myFileList;
    }

    public List<Folder> getFolderList() {
        return folderList;
    }

    public void setFolderList(List<Folder> folderList) {
        this.folderList = folderList;
    }

    public void setHashMapHashmap(HashMap<String, MyFile> hashMapHashmap) {
        this.hashMapHashmap = hashMapHashmap;
    }
}
