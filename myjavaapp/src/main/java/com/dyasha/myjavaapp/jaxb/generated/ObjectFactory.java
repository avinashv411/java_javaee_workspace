//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.12.02 at 06:09:25 AM IST 
//


package com.dyasha.myjavaapp.jaxb.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CollegeInfo_QNAME = new QName("", "college-info");
    private final static QName _StudentInfo_QNAME = new QName("", "studentInfo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link College }
     * 
     */
    public College createCollege() {
        return new College();
    }

    /**
     * Create an instance of {@link StudentInfo }
     * 
     */
    public StudentInfo createStudentInfo() {
        return new StudentInfo();
    }

    /**
     * Create an instance of {@link College.StudentsData }
     * 
     */
    public College.StudentsData createCollegeStudentsData() {
        return new College.StudentsData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link College }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "college-info")
    public JAXBElement<College> createCollegeInfo(College value) {
        return new JAXBElement<College>(_CollegeInfo_QNAME, College.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "studentInfo")
    public JAXBElement<StudentInfo> createStudentInfo(StudentInfo value) {
        return new JAXBElement<StudentInfo>(_StudentInfo_QNAME, StudentInfo.class, null, value);
    }

}
