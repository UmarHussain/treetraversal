package com;

import com.umar.tree.traversal.Folder;
import com.umar.tree.traversal.MyFile;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.MapUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DriverClass {
    public static void main(String[] args){

       // addFolders();
        Folder folder = new Folder("Root",generateFilesSet3(),generateFolders());

        DriverClass  dc = new DriverClass();
        dc.iterateFolders(folder,"",0);
    }

    public  int iterateFolders(Folder rootFolder,String space,int depth){

        System.out.println(space+"Folder :"+rootFolder.getFolderName());

       if(MapUtils.isNotEmpty(rootFolder.getHashMapHashmap()))
       {
           for (Map.Entry<String,MyFile> entry : rootFolder.getHashMapHashmap().entrySet()) {
               System.out.println(space+entry.getValue().getFileName() + " - " + depth);
           }
       }
           //rootFolder.getHashMapHashmap().forEach((k,v) -> System.out.println(("filename :"+v.getFileName())));


       if(CollectionUtils.isNotEmpty(rootFolder.getFolderList())){
        for(Folder folder: rootFolder.getFolderList()){
           iterateFolders(folder,space+" ", depth++);
        }
       }

       return depth;
    }


//    public List<Folder> getFoldersList(){
//       // addFolders(generateFolders(),generateFiles());
//    }

    public static List<Folder> generateFolders(){
        Folder folder1 = new Folder("Folder1",generateFilesSet1(),null);


        Folder folder2Child = new Folder("Folder2Child",generateFilesSet1(),null);

        List<Folder>childList = new ArrayList<>();
        childList.add(folder2Child);


        Folder folder2 = new Folder("Folder2",generateFilesSet2(),childList);
        Folder folder3 = new Folder("Folder3",generateFilesSet1(),null);


        List<Folder> foldersList = new ArrayList<>();
        foldersList.add(folder1);
        foldersList.add(folder2);
        foldersList.add(folder3);


        return foldersList;
    }


    public static Map<String, MyFile> generateFilesSet1(){

        MyFile myFile1 = new MyFile("File1");
        MyFile myFile2 = new MyFile("File2");
        MyFile myFile3 = new MyFile("File3");
        MyFile myFile4 = new MyFile("File4");
        MyFile myFile5 = new MyFile("File5");

        Map<String, MyFile> stringMyFileMap = new HashMap<>();

        stringMyFileMap.put(myFile1.getFileName(),myFile1);
        stringMyFileMap.put(myFile2.getFileName(),myFile2);
        stringMyFileMap.put(myFile3.getFileName(),myFile3);
        stringMyFileMap.put(myFile4.getFileName(),myFile4);
        stringMyFileMap.put(myFile5.getFileName(),myFile5);

        return stringMyFileMap;
    }

    public static Map<String, MyFile> generateFilesSet2(){

        MyFile myFile1 = new MyFile("File6");
        MyFile myFile2 = new MyFile("File7");
        MyFile myFile3 = new MyFile("File8");
        MyFile myFile4 = new MyFile("File9");
        MyFile myFile5 = new MyFile("File10");

        Map<String, MyFile> stringMyFileMap = new HashMap<>();

        stringMyFileMap.put(myFile1.getFileName(),myFile1);
        stringMyFileMap.put(myFile2.getFileName(),myFile2);
        stringMyFileMap.put(myFile3.getFileName(),myFile3);
        stringMyFileMap.put(myFile4.getFileName(),myFile4);
        stringMyFileMap.put(myFile5.getFileName(),myFile5);

        return stringMyFileMap;
    }

    public static Map<String, MyFile> generateFilesSet3(){

        MyFile myFile1 = new MyFile("File10");
        MyFile myFile2 = new MyFile("File11");
        MyFile myFile3 = new MyFile("File12");
        MyFile myFile4 = new MyFile("File13");
        MyFile myFile5 = new MyFile("File14");

        Map<String, MyFile> stringMyFileMap = new HashMap<>();

        stringMyFileMap.put(myFile1.getFileName(),myFile1);
        stringMyFileMap.put(myFile2.getFileName(),myFile2);
        stringMyFileMap.put(myFile3.getFileName(),myFile3);
        stringMyFileMap.put(myFile4.getFileName(),myFile4);
        stringMyFileMap.put(myFile5.getFileName(),myFile5);

        return stringMyFileMap;
    }


}
