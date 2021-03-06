package org.domain;

import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlType(namespace = "http://schema.domain.org/integration/1.0",
        name = "importItems",
        propOrder = {"someImportItems", "someOtherImportItems"})
@XmlRootElement(namespace = "http://schema.domain.org/integration/1.0",
        name = "importItems")
public class ImportItemsDTO {

    @XmlElementRef
    private List<SomeImportItemDTO> someImportItems =
            new ArrayList<SomeImportItemDTO>();

    public List<SomeImportItemDTO> getSomeImportItems() {
        return someImportItems;
    }

    @XmlElementRef
    private List<SomeOtherImportItemDTO> someOtherImportItems =
            new ArrayList<SomeOtherImportItemDTO>();

    public List<SomeOtherImportItemDTO> getSomeOtherImportItems() {
        return someOtherImportItems;
    }
}
