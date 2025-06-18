package springmvc.upload.domain;

import lombok.Data;

import java.util.List;

@Data
public class Item {

    private Long id;
    private String name;
    private UploadFile attachFile;
    private List<UploadFile> files;
}
