// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: addressBook.proto

package com.example.addressBook.proto;

public interface AddressBookOrBuilder extends
    // @@protoc_insertion_point(interface_extends:addressBook.AddressBook)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .addressBook.Person people = 1;</code>
   */
  java.util.List<com.example.addressBook.proto.Person> 
      getPeopleList();
  /**
   * <code>repeated .addressBook.Person people = 1;</code>
   */
  com.example.addressBook.proto.Person getPeople(int index);
  /**
   * <code>repeated .addressBook.Person people = 1;</code>
   */
  int getPeopleCount();
  /**
   * <code>repeated .addressBook.Person people = 1;</code>
   */
  java.util.List<? extends com.example.addressBook.proto.PersonOrBuilder> 
      getPeopleOrBuilderList();
  /**
   * <code>repeated .addressBook.Person people = 1;</code>
   */
  com.example.addressBook.proto.PersonOrBuilder getPeopleOrBuilder(
      int index);
}
