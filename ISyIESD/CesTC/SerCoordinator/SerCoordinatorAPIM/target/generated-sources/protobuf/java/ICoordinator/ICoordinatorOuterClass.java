// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ICoordinator.proto

package ICoordinator;

public final class ICoordinatorOuterClass {
  private ICoordinatorOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_forum_Result_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_forum_Result_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_forum_ServiceEndpoint_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_forum_ServiceEndpoint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_forum_VectorServices_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_forum_VectorServices_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_forum_Number_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_forum_Number_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022ICoordinator.proto\022\005forum\032\033google/prot" +
      "obuf/empty.proto\"\030\n\006Result\022\016\n\006status\030\001 \001" +
      "(\010\"9\n\017ServiceEndpoint\022\n\n\002ip\030\001 \001(\t\022\014\n\004por" +
      "t\030\002 \001(\005\022\014\n\004name\030\003 \001(\t\"9\n\016VectorServices\022" +
      "\'\n\007vectors\030\001 \003(\0132\026.forum.ServiceEndpoint" +
      "\"\027\n\006Number\022\r\n\005value\030\001 \001(\0052\212\004\n\014ICoordinat" +
      "or\022G\n\025registerVectorService\022\026.forum.Serv" +
      "iceEndpoint\032\026.google.protobuf.Empty\022B\n\021g" +
      "etVectorServices\022\026.google.protobuf.Empty" +
      "\032\025.forum.VectorServices\022<\n\nregisterTM\022\026." +
      "forum.ServiceEndpoint\032\026.google.protobuf." +
      "Empty\0227\n\005getTM\022\026.google.protobuf.Empty\032\026" +
      ".forum.ServiceEndpoint\022>\n\014registerTPLM\022\026" +
      ".forum.ServiceEndpoint\032\026.google.protobuf" +
      ".Empty\0229\n\007getTPLM\022\026.google.protobuf.Empt" +
      "y\032\026.forum.ServiceEndpoint\022B\n\031getNumberOf" +
      "VectorServices\022\026.google.protobuf.Empty\032\r" +
      ".forum.Number\0227\n\016checkInvariant\022\026.google" +
      ".protobuf.Empty\032\r.forum.ResultB\020\n\014ICoord" +
      "inatorP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.EmptyProto.getDescriptor(),
        });
    internal_static_forum_Result_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_forum_Result_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_forum_Result_descriptor,
        new java.lang.String[] { "Status", });
    internal_static_forum_ServiceEndpoint_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_forum_ServiceEndpoint_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_forum_ServiceEndpoint_descriptor,
        new java.lang.String[] { "Ip", "Port", "Name", });
    internal_static_forum_VectorServices_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_forum_VectorServices_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_forum_VectorServices_descriptor,
        new java.lang.String[] { "Vectors", });
    internal_static_forum_Number_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_forum_Number_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_forum_Number_descriptor,
        new java.lang.String[] { "Value", });
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
