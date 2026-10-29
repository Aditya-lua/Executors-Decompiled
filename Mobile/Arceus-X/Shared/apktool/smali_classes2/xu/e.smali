.class public final Lxu/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxu/g;
.implements Lxu/f;
.implements Ljava/lang/Cloneable;
.implements Ljava/nio/channels/ByteChannel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxu/e$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00b6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u0005\n\u0002\u0008\u0005\n\u0002\u0010\n\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u0012\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u001a\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0019\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001_B\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0000H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000f\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u000f\u0010\u000c\u001a\u00020\u0000H\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\u0008J\u000f\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0001H\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\'\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ!\u0010 \u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\t2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0010H\u0007\u00a2\u0006\u0004\u0008 \u0010!J\r\u0010\"\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016\u00a2\u0006\u0004\u0008%\u0010&J\u0018\u0010(\u001a\u00020$2\u0006\u0010\'\u001a\u00020\u0010H\u0087\u0002\u00a2\u0006\u0004\u0008(\u0010)J\u000f\u0010+\u001a\u00020*H\u0016\u00a2\u0006\u0004\u0008+\u0010,J\u000f\u0010.\u001a\u00020-H\u0016\u00a2\u0006\u0004\u0008.\u0010/J\u000f\u00100\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u00080\u0010#J\u000f\u00101\u001a\u00020*H\u0016\u00a2\u0006\u0004\u00081\u0010,J\u000f\u00102\u001a\u00020-H\u0016\u00a2\u0006\u0004\u00082\u0010/J\u000f\u00103\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u00083\u0010#J\u000f\u00104\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u00084\u0010#J\u000f\u00105\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u00085\u0010#J\u000f\u00107\u001a\u000206H\u0016\u00a2\u0006\u0004\u00087\u00108J\u0017\u00109\u001a\u0002062\u0006\u0010\u0011\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u00089\u0010:J\u0017\u0010=\u001a\u00020-2\u0006\u0010<\u001a\u00020;H\u0016\u00a2\u0006\u0004\u0008=\u0010>J\u001f\u0010@\u001a\u00020\u00122\u0006\u0010?\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008@\u0010AJ\u0017\u0010C\u001a\u00020\u00102\u0006\u0010?\u001a\u00020BH\u0016\u00a2\u0006\u0004\u0008C\u0010DJ\u000f\u0010F\u001a\u00020EH\u0016\u00a2\u0006\u0004\u0008F\u0010GJ\u0017\u0010H\u001a\u00020E2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008H\u0010IJ\u0017\u0010L\u001a\u00020E2\u0006\u0010K\u001a\u00020JH\u0016\u00a2\u0006\u0004\u0008L\u0010MJ\u001f\u0010N\u001a\u00020E2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010K\u001a\u00020JH\u0016\u00a2\u0006\u0004\u0008N\u0010OJ\u000f\u0010P\u001a\u00020EH\u0016\u00a2\u0006\u0004\u0008P\u0010GJ\u0017\u0010R\u001a\u00020E2\u0006\u0010Q\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008R\u0010IJ\u000f\u0010S\u001a\u00020-H\u0016\u00a2\u0006\u0004\u0008S\u0010/J\u000f\u0010U\u001a\u00020TH\u0016\u00a2\u0006\u0004\u0008U\u0010VJ\u0017\u0010W\u001a\u00020T2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008W\u0010XJ\u0017\u0010Y\u001a\u00020\u00122\u0006\u0010?\u001a\u00020TH\u0016\u00a2\u0006\u0004\u0008Y\u0010ZJ\'\u0010[\u001a\u00020-2\u0006\u0010?\u001a\u00020T2\u0006\u0010\u001d\u001a\u00020-2\u0006\u0010\u0011\u001a\u00020-H\u0016\u00a2\u0006\u0004\u0008[\u0010\\J\u0017\u0010[\u001a\u00020-2\u0006\u0010?\u001a\u00020]H\u0016\u00a2\u0006\u0004\u0008[\u0010^J\r\u0010_\u001a\u00020\u0012\u00a2\u0006\u0004\u0008_\u0010\u0006J\u0017\u0010`\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008`\u0010\u0014J\u0017\u0010b\u001a\u00020\u00002\u0006\u0010a\u001a\u000206H\u0016\u00a2\u0006\u0004\u0008b\u0010cJ\u0017\u0010e\u001a\u00020\u00002\u0006\u0010d\u001a\u00020EH\u0016\u00a2\u0006\u0004\u0008e\u0010fJ\'\u0010i\u001a\u00020\u00002\u0006\u0010d\u001a\u00020E2\u0006\u0010g\u001a\u00020-2\u0006\u0010h\u001a\u00020-H\u0016\u00a2\u0006\u0004\u0008i\u0010jJ\u0017\u0010l\u001a\u00020\u00002\u0006\u0010k\u001a\u00020-H\u0016\u00a2\u0006\u0004\u0008l\u0010mJ\u001f\u0010n\u001a\u00020\u00002\u0006\u0010d\u001a\u00020E2\u0006\u0010K\u001a\u00020JH\u0016\u00a2\u0006\u0004\u0008n\u0010oJ/\u0010p\u001a\u00020\u00002\u0006\u0010d\u001a\u00020E2\u0006\u0010g\u001a\u00020-2\u0006\u0010h\u001a\u00020-2\u0006\u0010K\u001a\u00020JH\u0016\u00a2\u0006\u0004\u0008p\u0010qJ\u0017\u0010s\u001a\u00020\u00002\u0006\u0010r\u001a\u00020TH\u0016\u00a2\u0006\u0004\u0008s\u0010tJ\'\u0010u\u001a\u00020\u00002\u0006\u0010r\u001a\u00020T2\u0006\u0010\u001d\u001a\u00020-2\u0006\u0010\u0011\u001a\u00020-H\u0016\u00a2\u0006\u0004\u0008u\u0010vJ\u0017\u0010w\u001a\u00020-2\u0006\u0010r\u001a\u00020]H\u0016\u00a2\u0006\u0004\u0008w\u0010^J\u0017\u0010y\u001a\u00020\u00102\u0006\u0010r\u001a\u00020xH\u0016\u00a2\u0006\u0004\u0008y\u0010zJ\u001f\u0010{\u001a\u00020\u00002\u0006\u0010r\u001a\u00020x2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008{\u0010|J\u0017\u0010~\u001a\u00020\u00002\u0006\u0010}\u001a\u00020-H\u0016\u00a2\u0006\u0004\u0008~\u0010mJ\u0019\u0010\u0080\u0001\u001a\u00020\u00002\u0006\u0010\u007f\u001a\u00020-H\u0016\u00a2\u0006\u0005\u0008\u0080\u0001\u0010mJ\u001a\u0010\u0082\u0001\u001a\u00020\u00002\u0007\u0010\u0081\u0001\u001a\u00020-H\u0016\u00a2\u0006\u0005\u0008\u0082\u0001\u0010mJ\u001a\u0010\u0083\u0001\u001a\u00020\u00002\u0007\u0010\u0081\u0001\u001a\u00020-H\u0016\u00a2\u0006\u0005\u0008\u0083\u0001\u0010mJ\u001b\u0010\u0085\u0001\u001a\u00020\u00002\u0007\u0010\u0084\u0001\u001a\u00020\u0010H\u0016\u00a2\u0006\u0006\u0008\u0085\u0001\u0010\u0086\u0001J\u001b\u0010\u0087\u0001\u001a\u00020\u00002\u0007\u0010\u0084\u0001\u001a\u00020\u0010H\u0016\u00a2\u0006\u0006\u0008\u0087\u0001\u0010\u0086\u0001J\u001b\u0010\u0088\u0001\u001a\u00020\u00002\u0007\u0010\u0084\u0001\u001a\u00020\u0010H\u0016\u00a2\u0006\u0006\u0008\u0088\u0001\u0010\u0086\u0001J\u001c\u0010\u008b\u0001\u001a\u00030\u008a\u00012\u0007\u0010\u0089\u0001\u001a\u00020-H\u0000\u00a2\u0006\u0006\u0008\u008b\u0001\u0010\u008c\u0001J\u001f\u0010w\u001a\u00020\u00122\u0006\u0010r\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008w\u0010AJ \u0010[\u001a\u00020\u00102\u0006\u0010?\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0016\u00a2\u0006\u0005\u0008[\u0010\u008d\u0001J,\u0010\u0090\u0001\u001a\u00020\u00102\u0006\u0010}\u001a\u00020$2\u0007\u0010\u008e\u0001\u001a\u00020\u00102\u0007\u0010\u008f\u0001\u001a\u00020\u0010H\u0016\u00a2\u0006\u0006\u0008\u0090\u0001\u0010\u0091\u0001J\u001b\u0010\u0093\u0001\u001a\u00020\u00102\u0007\u0010\u0092\u0001\u001a\u000206H\u0016\u00a2\u0006\u0006\u0008\u0093\u0001\u0010\u0094\u0001J$\u0010\u0095\u0001\u001a\u00020\u00102\u0007\u0010\u0092\u0001\u001a\u0002062\u0007\u0010\u008e\u0001\u001a\u00020\u0010H\u0016\u00a2\u0006\u0006\u0008\u0095\u0001\u0010\u0096\u0001J-\u0010\u0097\u0001\u001a\u00020\u00102\u0007\u0010\u0092\u0001\u001a\u0002062\u0007\u0010\u008e\u0001\u001a\u00020\u00102\u0007\u0010\u008f\u0001\u001a\u00020\u0010H\u0016\u00a2\u0006\u0006\u0008\u0097\u0001\u0010\u0098\u0001J\u001b\u0010\u009a\u0001\u001a\u00020\u00102\u0007\u0010\u0099\u0001\u001a\u000206H\u0016\u00a2\u0006\u0006\u0008\u009a\u0001\u0010\u0094\u0001J$\u0010\u009b\u0001\u001a\u00020\u00102\u0007\u0010\u0099\u0001\u001a\u0002062\u0007\u0010\u008e\u0001\u001a\u00020\u0010H\u0016\u00a2\u0006\u0006\u0008\u009b\u0001\u0010\u0096\u0001J#\u0010\u009c\u0001\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u00102\u0007\u0010\u0092\u0001\u001a\u000206H\u0016\u00a2\u0006\u0006\u0008\u009c\u0001\u0010\u009d\u0001J4\u0010\u009f\u0001\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u00102\u0007\u0010\u0092\u0001\u001a\u0002062\u0007\u0010\u009e\u0001\u001a\u00020-2\u0006\u0010\u0011\u001a\u00020-H\u0016\u00a2\u0006\u0006\u0008\u009f\u0001\u0010\u00a0\u0001J\u0011\u0010\u00a1\u0001\u001a\u00020\u0012H\u0016\u00a2\u0006\u0005\u0008\u00a1\u0001\u0010\u0006J\u0011\u0010\u00a2\u0001\u001a\u00020\rH\u0016\u00a2\u0006\u0005\u0008\u00a2\u0001\u0010\u000fJ\u0011\u0010\u00a3\u0001\u001a\u00020\u0012H\u0016\u00a2\u0006\u0005\u0008\u00a3\u0001\u0010\u0006J\u0013\u0010\u00a5\u0001\u001a\u00030\u00a4\u0001H\u0016\u00a2\u0006\u0006\u0008\u00a5\u0001\u0010\u00a6\u0001J\u001f\u0010\u00a9\u0001\u001a\u00020\r2\n\u0010\u00a8\u0001\u001a\u0005\u0018\u00010\u00a7\u0001H\u0096\u0002\u00a2\u0006\u0006\u0008\u00a9\u0001\u0010\u00aa\u0001J\u0011\u0010\u00ab\u0001\u001a\u00020-H\u0016\u00a2\u0006\u0005\u0008\u00ab\u0001\u0010/J\u0011\u0010\u00ac\u0001\u001a\u00020EH\u0016\u00a2\u0006\u0005\u0008\u00ac\u0001\u0010GJ\u000f\u0010\u00ad\u0001\u001a\u00020\u0000\u00a2\u0006\u0005\u0008\u00ad\u0001\u0010\u0008J\u000f\u0010}\u001a\u00020\u0000H\u0016\u00a2\u0006\u0004\u0008}\u0010\u0008J\u000f\u0010\u00ae\u0001\u001a\u000206\u00a2\u0006\u0005\u0008\u00ae\u0001\u00108J\u0018\u0010\u00af\u0001\u001a\u0002062\u0006\u0010\u0011\u001a\u00020-\u00a2\u0006\u0006\u0008\u00af\u0001\u0010\u00b0\u0001J\u001d\u0010\u007f\u001a\u00030\u00b1\u00012\n\u0008\u0002\u0010\u00b2\u0001\u001a\u00030\u00b1\u0001H\u0007\u00a2\u0006\u0005\u0008\u007f\u0010\u00b3\u0001R\u001b\u0010\u00b5\u0001\u001a\u0005\u0018\u00010\u008a\u00018\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0007\n\u0005\u0008_\u0010\u00b4\u0001R/\u0010\u00b8\u0001\u001a\u00020\u00102\u0007\u0010\u00b6\u0001\u001a\u00020\u00108\u0007@@X\u0086\u000e\u00a2\u0006\u0015\n\u0005\u0008}\u0010\u00b7\u0001\u001a\u0005\u0008\u00b8\u0001\u0010#\"\u0005\u0008\u00b9\u0001\u0010\u0014R\u0016\u0010\u00bb\u0001\u001a\u00020\u00008VX\u0096\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00ba\u0001\u0010\u0008\u00a8\u0006\u00bc\u0001"
    }
    d2 = {
        "Lxu/e;",
        "Lxu/g;",
        "Lxu/f;",
        "",
        "Ljava/nio/channels/ByteChannel;",
        "<init>",
        "()V",
        "O",
        "()Lxu/e;",
        "Ljava/io/OutputStream;",
        "j3",
        "()Ljava/io/OutputStream;",
        "h",
        "",
        "Z1",
        "()Z",
        "",
        "byteCount",
        "",
        "w1",
        "(J)V",
        "request",
        "(J)Z",
        "peek",
        "()Lxu/g;",
        "Ljava/io/InputStream;",
        "s3",
        "()Ljava/io/InputStream;",
        "out",
        "offset",
        "f",
        "(Lxu/e;JJ)Lxu/e;",
        "E0",
        "(Ljava/io/OutputStream;J)Lxu/e;",
        "c",
        "()J",
        "",
        "readByte",
        "()B",
        "pos",
        "j",
        "(J)B",
        "",
        "readShort",
        "()S",
        "",
        "readInt",
        "()I",
        "readLong",
        "k1",
        "M2",
        "n1",
        "i2",
        "o3",
        "Lxu/h;",
        "F2",
        "()Lxu/h;",
        "K1",
        "(J)Lxu/h;",
        "Lxu/f0;",
        "options",
        "l3",
        "(Lxu/f0;)I",
        "sink",
        "F1",
        "(Lxu/e;J)V",
        "Lxu/p0;",
        "K2",
        "(Lxu/p0;)J",
        "",
        "R2",
        "()Ljava/lang/String;",
        "G1",
        "(J)Ljava/lang/String;",
        "Ljava/nio/charset/Charset;",
        "charset",
        "z2",
        "(Ljava/nio/charset/Charset;)Ljava/lang/String;",
        "P",
        "(JLjava/nio/charset/Charset;)Ljava/lang/String;",
        "b1",
        "limit",
        "n0",
        "A2",
        "",
        "X1",
        "()[B",
        "w",
        "(J)[B",
        "readFully",
        "([B)V",
        "read",
        "([BII)I",
        "Ljava/nio/ByteBuffer;",
        "(Ljava/nio/ByteBuffer;)I",
        "a",
        "skip",
        "byteString",
        "a0",
        "(Lxu/h;)Lxu/e;",
        "string",
        "H0",
        "(Ljava/lang/String;)Lxu/e;",
        "beginIndex",
        "endIndex",
        "J0",
        "(Ljava/lang/String;II)Lxu/e;",
        "codePoint",
        "L0",
        "(I)Lxu/e;",
        "D0",
        "(Ljava/lang/String;Ljava/nio/charset/Charset;)Lxu/e;",
        "A0",
        "(Ljava/lang/String;IILjava/nio/charset/Charset;)Lxu/e;",
        "source",
        "e0",
        "([B)Lxu/e;",
        "f0",
        "([BII)Lxu/e;",
        "write",
        "Lxu/r0;",
        "g2",
        "(Lxu/r0;)J",
        "b0",
        "(Lxu/r0;J)Lxu/e;",
        "b",
        "i0",
        "s",
        "z0",
        "i",
        "t0",
        "x0",
        "v",
        "y0",
        "(J)Lxu/e;",
        "l0",
        "r0",
        "minimumCapacity",
        "Lxu/m0;",
        "Z",
        "(I)Lxu/m0;",
        "(Lxu/e;J)J",
        "fromIndex",
        "toIndex",
        "n",
        "(BJJ)J",
        "bytes",
        "V",
        "(Lxu/h;)J",
        "o",
        "(Lxu/h;J)J",
        "s1",
        "(Lxu/h;JJ)J",
        "targetBytes",
        "h0",
        "q",
        "o0",
        "(JLxu/h;)Z",
        "bytesOffset",
        "r",
        "(JLxu/h;II)Z",
        "flush",
        "isOpen",
        "close",
        "Lxu/s0;",
        "timeout",
        "()Lxu/s0;",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "hashCode",
        "toString",
        "e",
        "X",
        "Y",
        "(I)Lxu/h;",
        "Lxu/e$a;",
        "unsafeCursor",
        "(Lxu/e$a;)Lxu/e$a;",
        "Lxu/m0;",
        "head",
        "value",
        "J",
        "size",
        "U",
        "k",
        "buffer",
        "okio"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public a:Lxu/m0;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public b:J


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic F0(Lxu/e;Ljava/io/OutputStream;JILjava/lang/Object;)Lxu/e;
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    iget-wide p2, p0, Lxu/e;->b:J

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lxu/e;->E0(Ljava/io/OutputStream;J)Lxu/e;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic v(Lxu/e;Lxu/e$a;ILjava/lang/Object;)Lxu/e$a;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    invoke-static {}, Lxu/b;->d()Lxu/e$a;

    move-result-object p1

    :cond_0
    invoke-virtual {p0, p1}, Lxu/e;->s(Lxu/e$a;)Lxu/e$a;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public A0(Ljava/lang/String;IILjava/nio/charset/Charset;)Lxu/e;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Ljava/nio/charset/Charset;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "string"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "charset"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-ltz p2, :cond_3

    if-lt p3, p2, :cond_2

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-gt p3, v0, :cond_1

    sget-object v0, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1, p2, p3}, Lxu/e;->J0(Ljava/lang/String;II)Lxu/e;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p1, p2, p3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    const-string p2, "substring(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p4}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    const-string p2, "getBytes(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, 0x0

    array-length p3, p1

    invoke-virtual {p0, p1, p2, p3}, Lxu/e;->f0([BII)Lxu/e;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "endIndex > string.length: "

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, " > "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "endIndex < beginIndex: "

    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, " < "

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_3
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "beginIndex < 0: "

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public A2()I
    .locals 12

    invoke-virtual {p0}, Lxu/e;->size()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_a

    invoke-virtual {p0, v2, v3}, Lxu/e;->j(J)B

    move-result v0

    and-int/lit16 v1, v0, 0x80

    const/4 v2, 0x1

    const/16 v3, 0x80

    const v4, 0xfffd

    if-nez v1, :cond_0

    and-int/lit8 v1, v0, 0x7f

    const/4 v5, 0x0

    move v6, v5

    move v5, v2

    goto :goto_0

    :cond_0
    and-int/lit16 v1, v0, 0xe0

    const/16 v5, 0xc0

    if-ne v1, v5, :cond_1

    and-int/lit8 v1, v0, 0x1f

    const/4 v5, 0x2

    move v6, v3

    goto :goto_0

    :cond_1
    and-int/lit16 v1, v0, 0xf0

    const/16 v5, 0xe0

    if-ne v1, v5, :cond_2

    and-int/lit8 v1, v0, 0xf

    const/4 v5, 0x3

    const/16 v6, 0x800

    goto :goto_0

    :cond_2
    and-int/lit16 v1, v0, 0xf8

    const/16 v5, 0xf0

    if-ne v1, v5, :cond_9

    and-int/lit8 v1, v0, 0x7

    const/4 v5, 0x4

    const/high16 v6, 0x10000

    :goto_0
    invoke-virtual {p0}, Lxu/e;->size()J

    move-result-wide v7

    int-to-long v9, v5

    cmp-long v7, v7, v9

    if-ltz v7, :cond_8

    :goto_1
    if-ge v2, v5, :cond_4

    int-to-long v7, v2

    invoke-virtual {p0, v7, v8}, Lxu/e;->j(J)B

    move-result v0

    and-int/lit16 v11, v0, 0xc0

    if-ne v11, v3, :cond_3

    shl-int/lit8 v1, v1, 0x6

    and-int/lit8 v0, v0, 0x3f

    or-int/2addr v1, v0

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    invoke-virtual {p0, v7, v8}, Lxu/e;->skip(J)V

    return v4

    :cond_4
    invoke-virtual {p0, v9, v10}, Lxu/e;->skip(J)V

    const v0, 0x10ffff

    if-le v1, v0, :cond_5

    return v4

    :cond_5
    const v0, 0xd800

    if-gt v0, v1, :cond_6

    const v0, 0xe000

    if-ge v1, v0, :cond_6

    return v4

    :cond_6
    if-ge v1, v6, :cond_7

    return v4

    :cond_7
    return v1

    :cond_8
    new-instance v1, Ljava/io/EOFException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "size < "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ": "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lxu/e;->size()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v3, " (to read code point prefixed 0x"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, Lxu/b;->k(B)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x29

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_9
    const-wide/16 v0, 0x1

    invoke-virtual {p0, v0, v1}, Lxu/e;->skip(J)V

    return v4

    :cond_a
    new-instance v0, Ljava/io/EOFException;

    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    throw v0
.end method

.method public bridge synthetic C0(Ljava/lang/String;)Lxu/f;
    .locals 0

    invoke-virtual {p0, p1}, Lxu/e;->H0(Ljava/lang/String;)Lxu/e;

    move-result-object p1

    return-object p1
.end method

.method public D0(Ljava/lang/String;Ljava/nio/charset/Charset;)Lxu/e;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/nio/charset/Charset;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "string"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "charset"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {p0, p1, v0, v1, p2}, Lxu/e;->A0(Ljava/lang/String;IILjava/nio/charset/Charset;)Lxu/e;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic D2(J)Lxu/f;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lxu/e;->r0(J)Lxu/e;

    move-result-object p1

    return-object p1
.end method

.method public final E0(Ljava/io/OutputStream;J)Lxu/e;
    .locals 7
    .param p1    # Ljava/io/OutputStream;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "out"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-wide v1, p0, Lxu/e;->b:J

    const-wide/16 v3, 0x0

    move-wide v5, p2

    invoke-static/range {v1 .. v6}, Lxu/b;->b(JJJ)V

    iget-object p2, p0, Lxu/e;->a:Lxu/m0;

    move-object v0, p2

    move-wide p2, v5

    :cond_0
    :goto_0
    const-wide/16 v1, 0x0

    cmp-long v1, p2, v1

    if-lez v1, :cond_1

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget v1, v0, Lxu/m0;->c:I

    iget v2, v0, Lxu/m0;->b:I

    sub-int/2addr v1, v2

    int-to-long v1, v1

    invoke-static {p2, p3, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    long-to-int v1, v1

    iget-object v2, v0, Lxu/m0;->a:[B

    iget v3, v0, Lxu/m0;->b:I

    invoke-virtual {p1, v2, v3, v1}, Ljava/io/OutputStream;->write([BII)V

    iget v2, v0, Lxu/m0;->b:I

    add-int/2addr v2, v1

    iput v2, v0, Lxu/m0;->b:I

    iget-wide v3, p0, Lxu/e;->b:J

    int-to-long v5, v1

    sub-long/2addr v3, v5

    iput-wide v3, p0, Lxu/e;->b:J

    sub-long/2addr p2, v5

    iget v1, v0, Lxu/m0;->c:I

    if-ne v2, v1, :cond_0

    invoke-virtual {v0}, Lxu/m0;->b()Lxu/m0;

    move-result-object v1

    iput-object v1, p0, Lxu/e;->a:Lxu/m0;

    invoke-static {v0}, Lxu/n0;->b(Lxu/m0;)V

    move-object v0, v1

    goto :goto_0

    :cond_1
    return-object p0
.end method

.method public F1(Lxu/e;J)V
    .locals 2
    .param p1    # Lxu/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lxu/e;->size()J

    move-result-wide v0

    cmp-long v0, v0, p2

    if-ltz v0, :cond_0

    invoke-virtual {p1, p0, p2, p3}, Lxu/e;->write(Lxu/e;J)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lxu/e;->size()J

    move-result-wide p2

    invoke-virtual {p1, p0, p2, p3}, Lxu/e;->write(Lxu/e;J)V

    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1
.end method

.method public F2()Lxu/h;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-virtual {p0}, Lxu/e;->size()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lxu/e;->K1(J)Lxu/h;

    move-result-object v0

    return-object v0
.end method

.method public G1(J)Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p0, p1, p2, v0}, Lxu/e;->P(JLjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public H0(Ljava/lang/String;)Lxu/e;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "string"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {p0, p1, v0, v1}, Lxu/e;->J0(Ljava/lang/String;II)Lxu/e;

    move-result-object p1

    return-object p1
.end method

.method public J0(Ljava/lang/String;II)Lxu/e;
    .locals 9
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "string"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-ltz p2, :cond_a

    if-lt p3, p2, :cond_9

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-gt p3, v0, :cond_8

    :goto_0
    if-ge p2, p3, :cond_7

    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x80

    if-ge v0, v1, :cond_1

    const/4 v2, 0x1

    invoke-virtual {p0, v2}, Lxu/e;->Z(I)Lxu/m0;

    move-result-object v2

    iget-object v3, v2, Lxu/m0;->a:[B

    iget v4, v2, Lxu/m0;->c:I

    sub-int/2addr v4, p2

    rsub-int v5, v4, 0x2000

    invoke-static {p3, v5}, Ljava/lang/Math;->min(II)I

    move-result v5

    add-int/lit8 v6, p2, 0x1

    add-int/2addr p2, v4

    int-to-byte v0, v0

    aput-byte v0, v3, p2

    :goto_1
    move p2, v6

    if-ge p2, v5, :cond_0

    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    move-result v0

    if-ge v0, v1, :cond_0

    add-int/lit8 v6, p2, 0x1

    add-int/2addr p2, v4

    int-to-byte v0, v0

    aput-byte v0, v3, p2

    goto :goto_1

    :cond_0
    add-int/2addr v4, p2

    iget v0, v2, Lxu/m0;->c:I

    sub-int/2addr v4, v0

    add-int/2addr v0, v4

    iput v0, v2, Lxu/m0;->c:I

    invoke-virtual {p0}, Lxu/e;->size()J

    move-result-wide v0

    int-to-long v2, v4

    add-long/2addr v0, v2

    invoke-virtual {p0, v0, v1}, Lxu/e;->U(J)V

    goto :goto_0

    :cond_1
    const/16 v2, 0x800

    if-ge v0, v2, :cond_2

    const/4 v2, 0x2

    invoke-virtual {p0, v2}, Lxu/e;->Z(I)Lxu/m0;

    move-result-object v3

    iget-object v4, v3, Lxu/m0;->a:[B

    iget v5, v3, Lxu/m0;->c:I

    shr-int/lit8 v6, v0, 0x6

    or-int/lit16 v6, v6, 0xc0

    int-to-byte v6, v6

    aput-byte v6, v4, v5

    add-int/lit8 v6, v5, 0x1

    and-int/lit8 v0, v0, 0x3f

    or-int/2addr v0, v1

    int-to-byte v0, v0

    aput-byte v0, v4, v6

    add-int/2addr v5, v2

    iput v5, v3, Lxu/m0;->c:I

    invoke-virtual {p0}, Lxu/e;->size()J

    move-result-wide v0

    const-wide/16 v2, 0x2

    add-long/2addr v0, v2

    invoke-virtual {p0, v0, v1}, Lxu/e;->U(J)V

    :goto_2
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_2
    const v2, 0xd800

    const/16 v3, 0x3f

    if-lt v0, v2, :cond_6

    const v2, 0xdfff

    if-le v0, v2, :cond_3

    goto :goto_4

    :cond_3
    add-int/lit8 v2, p2, 0x1

    if-ge v2, p3, :cond_4

    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v4

    goto :goto_3

    :cond_4
    const/4 v4, 0x0

    :goto_3
    const v5, 0xdbff

    if-gt v0, v5, :cond_5

    const v5, 0xdc00

    if-gt v5, v4, :cond_5

    const v5, 0xe000

    if-ge v4, v5, :cond_5

    and-int/lit16 v0, v0, 0x3ff

    shl-int/lit8 v0, v0, 0xa

    and-int/lit16 v2, v4, 0x3ff

    or-int/2addr v0, v2

    const/high16 v2, 0x10000

    add-int/2addr v0, v2

    const/4 v2, 0x4

    invoke-virtual {p0, v2}, Lxu/e;->Z(I)Lxu/m0;

    move-result-object v4

    iget-object v5, v4, Lxu/m0;->a:[B

    iget v6, v4, Lxu/m0;->c:I

    shr-int/lit8 v7, v0, 0x12

    or-int/lit16 v7, v7, 0xf0

    int-to-byte v7, v7

    aput-byte v7, v5, v6

    add-int/lit8 v7, v6, 0x1

    shr-int/lit8 v8, v0, 0xc

    and-int/2addr v8, v3

    or-int/2addr v8, v1

    int-to-byte v8, v8

    aput-byte v8, v5, v7

    add-int/lit8 v7, v6, 0x2

    shr-int/lit8 v8, v0, 0x6

    and-int/2addr v8, v3

    or-int/2addr v8, v1

    int-to-byte v8, v8

    aput-byte v8, v5, v7

    add-int/lit8 v7, v6, 0x3

    and-int/2addr v0, v3

    or-int/2addr v0, v1

    int-to-byte v0, v0

    aput-byte v0, v5, v7

    add-int/2addr v6, v2

    iput v6, v4, Lxu/m0;->c:I

    invoke-virtual {p0}, Lxu/e;->size()J

    move-result-wide v0

    const-wide/16 v2, 0x4

    add-long/2addr v0, v2

    invoke-virtual {p0, v0, v1}, Lxu/e;->U(J)V

    add-int/lit8 p2, p2, 0x2

    goto/16 :goto_0

    :cond_5
    invoke-virtual {p0, v3}, Lxu/e;->i0(I)Lxu/e;

    move p2, v2

    goto/16 :goto_0

    :cond_6
    :goto_4
    const/4 v2, 0x3

    invoke-virtual {p0, v2}, Lxu/e;->Z(I)Lxu/m0;

    move-result-object v4

    iget-object v5, v4, Lxu/m0;->a:[B

    iget v6, v4, Lxu/m0;->c:I

    shr-int/lit8 v7, v0, 0xc

    or-int/lit16 v7, v7, 0xe0

    int-to-byte v7, v7

    aput-byte v7, v5, v6

    add-int/lit8 v7, v6, 0x1

    shr-int/lit8 v8, v0, 0x6

    and-int/2addr v3, v8

    or-int/2addr v3, v1

    int-to-byte v3, v3

    aput-byte v3, v5, v7

    add-int/lit8 v3, v6, 0x2

    and-int/lit8 v0, v0, 0x3f

    or-int/2addr v0, v1

    int-to-byte v0, v0

    aput-byte v0, v5, v3

    add-int/2addr v6, v2

    iput v6, v4, Lxu/m0;->c:I

    invoke-virtual {p0}, Lxu/e;->size()J

    move-result-wide v0

    const-wide/16 v2, 0x3

    add-long/2addr v0, v2

    invoke-virtual {p0, v0, v1}, Lxu/e;->U(J)V

    goto/16 :goto_2

    :cond_7
    return-object p0

    :cond_8
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "endIndex > string.length: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, " > "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_9
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "endIndex < beginIndex: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, " < "

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_a
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "beginIndex < 0: "

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public bridge synthetic K0(Ljava/lang/String;II)Lxu/f;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lxu/e;->J0(Ljava/lang/String;II)Lxu/e;

    move-result-object p1

    return-object p1
.end method

.method public K1(J)Lxu/h;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_2

    const-wide/32 v0, 0x7fffffff

    cmp-long v0, p1, v0

    if-gtz v0, :cond_2

    invoke-virtual {p0}, Lxu/e;->size()J

    move-result-wide v0

    cmp-long v0, v0, p1

    if-ltz v0, :cond_1

    const-wide/16 v0, 0x1000

    cmp-long v0, p1, v0

    if-ltz v0, :cond_0

    long-to-int v0, p1

    invoke-virtual {p0, v0}, Lxu/e;->Y(I)Lxu/h;

    move-result-object v0

    invoke-virtual {p0, p1, p2}, Lxu/e;->skip(J)V

    return-object v0

    :cond_0
    new-instance v0, Lxu/h;

    invoke-virtual {p0, p1, p2}, Lxu/e;->w(J)[B

    move-result-object p1

    invoke-direct {v0, p1}, Lxu/h;-><init>([B)V

    return-object v0

    :cond_1
    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1

    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "byteCount: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public K2(Lxu/p0;)J
    .locals 4
    .param p1    # Lxu/p0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lxu/e;->size()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-lez v2, :cond_0

    invoke-interface {p1, p0, v0, v1}, Lxu/p0;->write(Lxu/e;J)V

    :cond_0
    return-wide v0
.end method

.method public L0(I)Lxu/e;
    .locals 8
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const/16 v0, 0x80

    if-ge p1, v0, :cond_0

    invoke-virtual {p0, p1}, Lxu/e;->i0(I)Lxu/e;

    return-object p0

    :cond_0
    const/16 v1, 0x800

    const/16 v2, 0x3f

    if-ge p1, v1, :cond_1

    const/4 v1, 0x2

    invoke-virtual {p0, v1}, Lxu/e;->Z(I)Lxu/m0;

    move-result-object v3

    iget-object v4, v3, Lxu/m0;->a:[B

    iget v5, v3, Lxu/m0;->c:I

    shr-int/lit8 v6, p1, 0x6

    or-int/lit16 v6, v6, 0xc0

    int-to-byte v6, v6

    aput-byte v6, v4, v5

    add-int/lit8 v6, v5, 0x1

    and-int/2addr p1, v2

    or-int/2addr p1, v0

    int-to-byte p1, p1

    aput-byte p1, v4, v6

    add-int/2addr v5, v1

    iput v5, v3, Lxu/m0;->c:I

    invoke-virtual {p0}, Lxu/e;->size()J

    move-result-wide v0

    const-wide/16 v2, 0x2

    add-long/2addr v0, v2

    invoke-virtual {p0, v0, v1}, Lxu/e;->U(J)V

    return-object p0

    :cond_1
    const v1, 0xd800

    if-gt v1, p1, :cond_2

    const v1, 0xe000

    if-ge p1, v1, :cond_2

    invoke-virtual {p0, v2}, Lxu/e;->i0(I)Lxu/e;

    return-object p0

    :cond_2
    const/high16 v1, 0x10000

    if-ge p1, v1, :cond_3

    const/4 v1, 0x3

    invoke-virtual {p0, v1}, Lxu/e;->Z(I)Lxu/m0;

    move-result-object v3

    iget-object v4, v3, Lxu/m0;->a:[B

    iget v5, v3, Lxu/m0;->c:I

    shr-int/lit8 v6, p1, 0xc

    or-int/lit16 v6, v6, 0xe0

    int-to-byte v6, v6

    aput-byte v6, v4, v5

    add-int/lit8 v6, v5, 0x1

    shr-int/lit8 v7, p1, 0x6

    and-int/2addr v7, v2

    or-int/2addr v7, v0

    int-to-byte v7, v7

    aput-byte v7, v4, v6

    add-int/lit8 v6, v5, 0x2

    and-int/2addr p1, v2

    or-int/2addr p1, v0

    int-to-byte p1, p1

    aput-byte p1, v4, v6

    add-int/2addr v5, v1

    iput v5, v3, Lxu/m0;->c:I

    invoke-virtual {p0}, Lxu/e;->size()J

    move-result-wide v0

    const-wide/16 v2, 0x3

    add-long/2addr v0, v2

    invoke-virtual {p0, v0, v1}, Lxu/e;->U(J)V

    return-object p0

    :cond_3
    const v1, 0x10ffff

    if-gt p1, v1, :cond_4

    const/4 v1, 0x4

    invoke-virtual {p0, v1}, Lxu/e;->Z(I)Lxu/m0;

    move-result-object v3

    iget-object v4, v3, Lxu/m0;->a:[B

    iget v5, v3, Lxu/m0;->c:I

    shr-int/lit8 v6, p1, 0x12

    or-int/lit16 v6, v6, 0xf0

    int-to-byte v6, v6

    aput-byte v6, v4, v5

    add-int/lit8 v6, v5, 0x1

    shr-int/lit8 v7, p1, 0xc

    and-int/2addr v7, v2

    or-int/2addr v7, v0

    int-to-byte v7, v7

    aput-byte v7, v4, v6

    add-int/lit8 v6, v5, 0x2

    shr-int/lit8 v7, p1, 0x6

    and-int/2addr v7, v2

    or-int/2addr v7, v0

    int-to-byte v7, v7

    aput-byte v7, v4, v6

    add-int/lit8 v6, v5, 0x3

    and-int/2addr p1, v2

    or-int/2addr p1, v0

    int-to-byte p1, p1

    aput-byte p1, v4, v6

    add-int/2addr v5, v1

    iput v5, v3, Lxu/m0;->c:I

    invoke-virtual {p0}, Lxu/e;->size()J

    move-result-wide v0

    const-wide/16 v2, 0x4

    add-long/2addr v0, v2

    invoke-virtual {p0, v0, v1}, Lxu/e;->U(J)V

    return-object p0

    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected code point: 0x"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lxu/b;->l(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public M2()I
    .locals 1

    invoke-virtual {p0}, Lxu/e;->readInt()I

    move-result v0

    invoke-static {v0}, Lxu/b;->h(I)I

    move-result v0

    return v0
.end method

.method public O()Lxu/e;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    return-object p0
.end method

.method public P(JLjava/nio/charset/Charset;)Ljava/lang/String;
    .locals 6
    .param p3    # Ljava/nio/charset/Charset;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "charset"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_4

    const-wide/32 v1, 0x7fffffff

    cmp-long v1, p1, v1

    if-gtz v1, :cond_4

    iget-wide v1, p0, Lxu/e;->b:J

    cmp-long v1, v1, p1

    if-ltz v1, :cond_3

    if-nez v0, :cond_0

    const-string p1, ""

    return-object p1

    :cond_0
    iget-object v0, p0, Lxu/e;->a:Lxu/m0;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget v1, v0, Lxu/m0;->b:I

    int-to-long v2, v1

    add-long/2addr v2, p1

    iget v4, v0, Lxu/m0;->c:I

    int-to-long v4, v4

    cmp-long v2, v2, v4

    if-lez v2, :cond_1

    new-instance v0, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lxu/e;->w(J)[B

    move-result-object p1

    invoke-direct {v0, p1, p3}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    return-object v0

    :cond_1
    new-instance v2, Ljava/lang/String;

    iget-object v3, v0, Lxu/m0;->a:[B

    long-to-int v4, p1

    invoke-direct {v2, v3, v1, v4, p3}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    iget p3, v0, Lxu/m0;->b:I

    add-int/2addr p3, v4

    iput p3, v0, Lxu/m0;->b:I

    iget-wide v3, p0, Lxu/e;->b:J

    sub-long/2addr v3, p1

    iput-wide v3, p0, Lxu/e;->b:J

    iget p1, v0, Lxu/m0;->c:I

    if-ne p3, p1, :cond_2

    invoke-virtual {v0}, Lxu/m0;->b()Lxu/m0;

    move-result-object p1

    iput-object p1, p0, Lxu/e;->a:Lxu/m0;

    invoke-static {v0}, Lxu/n0;->b(Lxu/m0;)V

    :cond_2
    return-object v2

    :cond_3
    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1

    :cond_4
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "byteCount: "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public R2()Ljava/lang/String;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-wide v0, p0, Lxu/e;->b:J

    sget-object v2, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v0, v1, v2}, Lxu/e;->P(JLjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic T(I)Lxu/f;
    .locals 0

    invoke-virtual {p0, p1}, Lxu/e;->L0(I)Lxu/e;

    move-result-object p1

    return-object p1
.end method

.method public final U(J)V
    .locals 0

    iput-wide p1, p0, Lxu/e;->b:J

    return-void
.end method

.method public V(Lxu/h;)J
    .locals 2
    .param p1    # Lxu/h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "bytes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    invoke-virtual {p0, p1, v0, v1}, Lxu/e;->o(Lxu/h;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public final X()Lxu/h;
    .locals 4
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-virtual {p0}, Lxu/e;->size()J

    move-result-wide v0

    const-wide/32 v2, 0x7fffffff

    cmp-long v0, v0, v2

    if-gtz v0, :cond_0

    invoke-virtual {p0}, Lxu/e;->size()J

    move-result-wide v0

    long-to-int v0, v0

    invoke-virtual {p0, v0}, Lxu/e;->Y(I)Lxu/h;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "size > Int.MAX_VALUE: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lxu/e;->size()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public X1()[B
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-virtual {p0}, Lxu/e;->size()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lxu/e;->w(J)[B

    move-result-object v0

    return-object v0
.end method

.method public final Y(I)Lxu/h;
    .locals 8
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    if-nez p1, :cond_0

    sget-object p1, Lxu/h;->e:Lxu/h;

    return-object p1

    :cond_0
    invoke-virtual {p0}, Lxu/e;->size()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    int-to-long v4, p1

    invoke-static/range {v0 .. v5}, Lxu/b;->b(JJJ)V

    iget-object v0, p0, Lxu/e;->a:Lxu/m0;

    const/4 v1, 0x0

    move v2, v1

    move v3, v2

    :goto_0
    if-ge v2, p1, :cond_2

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget v4, v0, Lxu/m0;->c:I

    iget v5, v0, Lxu/m0;->b:I

    if-eq v4, v5, :cond_1

    sub-int/2addr v4, v5

    add-int/2addr v2, v4

    add-int/lit8 v3, v3, 0x1

    iget-object v0, v0, Lxu/m0;->f:Lxu/m0;

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/AssertionError;

    const-string v0, "s.limit == s.pos"

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_2
    new-array v0, v3, [[B

    mul-int/lit8 v2, v3, 0x2

    new-array v2, v2, [I

    iget-object v4, p0, Lxu/e;->a:Lxu/m0;

    move-object v5, v4

    move v4, v1

    :goto_1
    if-ge v1, p1, :cond_3

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object v6, v5, Lxu/m0;->a:[B

    aput-object v6, v0, v4

    iget v6, v5, Lxu/m0;->c:I

    iget v7, v5, Lxu/m0;->b:I

    sub-int/2addr v6, v7

    add-int/2addr v1, v6

    invoke-static {v1, p1}, Ljava/lang/Math;->min(II)I

    move-result v6

    aput v6, v2, v4

    add-int v6, v4, v3

    iget v7, v5, Lxu/m0;->b:I

    aput v7, v2, v6

    const/4 v6, 0x1

    iput-boolean v6, v5, Lxu/m0;->d:Z

    add-int/2addr v4, v6

    iget-object v5, v5, Lxu/m0;->f:Lxu/m0;

    goto :goto_1

    :cond_3
    new-instance p1, Lxu/o0;

    invoke-direct {p1, v0, v2}, Lxu/o0;-><init>([[B[I)V

    return-object p1
.end method

.method public final Z(I)Lxu/m0;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const/4 v0, 0x1

    if-lt p1, v0, :cond_3

    const/16 v0, 0x2000

    if-gt p1, v0, :cond_3

    iget-object v1, p0, Lxu/e;->a:Lxu/m0;

    if-nez v1, :cond_0

    invoke-static {}, Lxu/n0;->c()Lxu/m0;

    move-result-object p1

    iput-object p1, p0, Lxu/e;->a:Lxu/m0;

    iput-object p1, p1, Lxu/m0;->g:Lxu/m0;

    iput-object p1, p1, Lxu/m0;->f:Lxu/m0;

    return-object p1

    :cond_0
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object v1, v1, Lxu/m0;->g:Lxu/m0;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget v2, v1, Lxu/m0;->c:I

    add-int/2addr v2, p1

    if-gt v2, v0, :cond_2

    iget-boolean p1, v1, Lxu/m0;->e:Z

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    return-object v1

    :cond_2
    :goto_0
    invoke-static {}, Lxu/n0;->c()Lxu/m0;

    move-result-object p1

    invoke-virtual {v1, p1}, Lxu/m0;->c(Lxu/m0;)Lxu/m0;

    move-result-object p1

    return-object p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "unexpected capacity"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public Z1()Z
    .locals 4

    iget-wide v0, p0, Lxu/e;->b:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final a()V
    .locals 2

    invoke-virtual {p0}, Lxu/e;->size()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lxu/e;->skip(J)V

    return-void
.end method

.method public a0(Lxu/h;)Lxu/e;
    .locals 2
    .param p1    # Lxu/h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "byteString"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p1}, Lxu/h;->I()I

    move-result v1

    invoke-virtual {p1, p0, v0, v1}, Lxu/h;->Q(Lxu/e;II)V

    return-object p0
.end method

.method public b()Lxu/e;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-virtual {p0}, Lxu/e;->e()Lxu/e;

    move-result-object v0

    return-object v0
.end method

.method public b0(Lxu/r0;J)Lxu/e;
    .locals 4
    .param p1    # Lxu/r0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-lez v0, :cond_1

    invoke-interface {p1, p0, p2, p3}, Lxu/r0;->read(Lxu/e;J)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v2, v0, v2

    if-eqz v2, :cond_0

    sub-long/2addr p2, v0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1

    :cond_1
    return-object p0
.end method

.method public b1()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-wide v0, 0x7fffffffffffffffL

    invoke-virtual {p0, v0, v1}, Lxu/e;->n0(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final c()J
    .locals 5

    invoke-virtual {p0}, Lxu/e;->size()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    return-wide v2

    :cond_0
    iget-object v2, p0, Lxu/e;->a:Lxu/m0;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object v2, v2, Lxu/m0;->g:Lxu/m0;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget v3, v2, Lxu/m0;->c:I

    const/16 v4, 0x2000

    if-ge v3, v4, :cond_1

    iget-boolean v4, v2, Lxu/m0;->e:Z

    if-eqz v4, :cond_1

    iget v2, v2, Lxu/m0;->b:I

    sub-int/2addr v3, v2

    int-to-long v2, v3

    sub-long/2addr v0, v2

    :cond_1
    return-wide v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lxu/e;->b()Lxu/e;

    move-result-object v0

    return-object v0
.end method

.method public close()V
    .locals 0

    return-void
.end method

.method public bridge synthetic d0(Lxu/h;)Lxu/f;
    .locals 0

    invoke-virtual {p0, p1}, Lxu/e;->a0(Lxu/h;)Lxu/e;

    move-result-object p1

    return-object p1
.end method

.method public final e()Lxu/e;
    .locals 6
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lxu/e;

    invoke-direct {v0}, Lxu/e;-><init>()V

    invoke-virtual {p0}, Lxu/e;->size()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-nez v1, :cond_0

    return-object v0

    :cond_0
    iget-object v1, p0, Lxu/e;->a:Lxu/m0;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lxu/m0;->d()Lxu/m0;

    move-result-object v2

    iput-object v2, v0, Lxu/e;->a:Lxu/m0;

    iput-object v2, v2, Lxu/m0;->g:Lxu/m0;

    iput-object v2, v2, Lxu/m0;->f:Lxu/m0;

    iget-object v3, v1, Lxu/m0;->f:Lxu/m0;

    :goto_0
    if-eq v3, v1, :cond_1

    iget-object v4, v2, Lxu/m0;->g:Lxu/m0;

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v3}, Lxu/m0;->d()Lxu/m0;

    move-result-object v5

    invoke-virtual {v4, v5}, Lxu/m0;->c(Lxu/m0;)Lxu/m0;

    iget-object v3, v3, Lxu/m0;->f:Lxu/m0;

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lxu/e;->size()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lxu/e;->U(J)V

    return-object v0
.end method

.method public e0([B)Lxu/e;
    .locals 2
    .param p1    # [B
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Lxu/e;->f0([BII)Lxu/e;

    move-result-object p1

    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 18
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/4 v2, 0x1

    if-ne v0, v1, :cond_0

    return v2

    :cond_0
    instance-of v3, v1, Lxu/e;

    const/4 v4, 0x0

    if-nez v3, :cond_1

    return v4

    :cond_1
    invoke-virtual {v0}, Lxu/e;->size()J

    move-result-wide v5

    check-cast v1, Lxu/e;

    invoke-virtual {v1}, Lxu/e;->size()J

    move-result-wide v7

    cmp-long v3, v5, v7

    if-eqz v3, :cond_2

    return v4

    :cond_2
    invoke-virtual {v0}, Lxu/e;->size()J

    move-result-wide v5

    const-wide/16 v7, 0x0

    cmp-long v3, v5, v7

    if-nez v3, :cond_3

    return v2

    :cond_3
    iget-object v3, v0, Lxu/e;->a:Lxu/m0;

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object v1, v1, Lxu/e;->a:Lxu/m0;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget v5, v3, Lxu/m0;->b:I

    iget v6, v1, Lxu/m0;->b:I

    move-wide v9, v7

    :goto_0
    invoke-virtual {v0}, Lxu/e;->size()J

    move-result-wide v11

    cmp-long v11, v9, v11

    if-gez v11, :cond_8

    iget v11, v3, Lxu/m0;->c:I

    sub-int/2addr v11, v5

    iget v12, v1, Lxu/m0;->c:I

    sub-int/2addr v12, v6

    invoke-static {v11, v12}, Ljava/lang/Math;->min(II)I

    move-result v11

    int-to-long v11, v11

    move-wide v13, v7

    :goto_1
    cmp-long v15, v13, v11

    if-gez v15, :cond_5

    iget-object v15, v3, Lxu/m0;->a:[B

    add-int/lit8 v16, v5, 0x1

    aget-byte v5, v15, v5

    iget-object v15, v1, Lxu/m0;->a:[B

    add-int/lit8 v17, v6, 0x1

    aget-byte v6, v15, v6

    if-eq v5, v6, :cond_4

    return v4

    :cond_4
    const-wide/16 v5, 0x1

    add-long/2addr v13, v5

    move/from16 v5, v16

    move/from16 v6, v17

    goto :goto_1

    :cond_5
    iget v13, v3, Lxu/m0;->c:I

    if-ne v5, v13, :cond_6

    iget-object v3, v3, Lxu/m0;->f:Lxu/m0;

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget v5, v3, Lxu/m0;->b:I

    :cond_6
    iget v13, v1, Lxu/m0;->c:I

    if-ne v6, v13, :cond_7

    iget-object v1, v1, Lxu/m0;->f:Lxu/m0;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget v6, v1, Lxu/m0;->b:I

    :cond_7
    add-long/2addr v9, v11

    goto :goto_0

    :cond_8
    return v2
.end method

.method public final f(Lxu/e;JJ)Lxu/e;
    .locals 7
    .param p1    # Lxu/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "out"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lxu/e;->size()J

    move-result-wide v1

    move-wide v3, p2

    move-wide v5, p4

    invoke-static/range {v1 .. v6}, Lxu/b;->b(JJJ)V

    const-wide/16 p2, 0x0

    cmp-long p4, v5, p2

    if-nez p4, :cond_0

    goto :goto_3

    :cond_0
    invoke-virtual {p1}, Lxu/e;->size()J

    move-result-wide p4

    add-long/2addr p4, v5

    invoke-virtual {p1, p4, p5}, Lxu/e;->U(J)V

    iget-object p4, p0, Lxu/e;->a:Lxu/m0;

    :goto_0
    invoke-static {p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget p5, p4, Lxu/m0;->c:I

    iget v0, p4, Lxu/m0;->b:I

    sub-int v1, p5, v0

    int-to-long v1, v1

    cmp-long v1, v3, v1

    if-ltz v1, :cond_1

    sub-int/2addr p5, v0

    int-to-long v0, p5

    sub-long/2addr v3, v0

    iget-object p4, p4, Lxu/m0;->f:Lxu/m0;

    goto :goto_0

    :cond_1
    move-object v0, p4

    move-wide p4, v5

    :goto_1
    cmp-long v1, p4, p2

    if-lez v1, :cond_3

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lxu/m0;->d()Lxu/m0;

    move-result-object v1

    iget v2, v1, Lxu/m0;->b:I

    long-to-int v3, v3

    add-int/2addr v2, v3

    iput v2, v1, Lxu/m0;->b:I

    long-to-int v3, p4

    add-int/2addr v2, v3

    iget v3, v1, Lxu/m0;->c:I

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    iput v2, v1, Lxu/m0;->c:I

    iget-object v2, p1, Lxu/e;->a:Lxu/m0;

    if-nez v2, :cond_2

    iput-object v1, v1, Lxu/m0;->g:Lxu/m0;

    iput-object v1, v1, Lxu/m0;->f:Lxu/m0;

    iput-object v1, p1, Lxu/e;->a:Lxu/m0;

    goto :goto_2

    :cond_2
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object v2, v2, Lxu/m0;->g:Lxu/m0;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2, v1}, Lxu/m0;->c(Lxu/m0;)Lxu/m0;

    :goto_2
    iget v2, v1, Lxu/m0;->c:I

    iget v1, v1, Lxu/m0;->b:I

    sub-int/2addr v2, v1

    int-to-long v1, v2

    sub-long/2addr p4, v1

    iget-object v0, v0, Lxu/m0;->f:Lxu/m0;

    move-wide v3, p2

    goto :goto_1

    :cond_3
    :goto_3
    return-object p0
.end method

.method public f0([BII)Lxu/e;
    .locals 7
    .param p1    # [B
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p1

    int-to-long v1, v0

    int-to-long v3, p2

    int-to-long v5, p3

    invoke-static/range {v1 .. v6}, Lxu/b;->b(JJJ)V

    add-int/2addr p3, p2

    :goto_0
    if-ge p2, p3, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lxu/e;->Z(I)Lxu/m0;

    move-result-object v0

    sub-int v1, p3, p2

    iget v2, v0, Lxu/m0;->c:I

    rsub-int v2, v2, 0x2000

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    iget-object v2, v0, Lxu/m0;->a:[B

    iget v3, v0, Lxu/m0;->c:I

    add-int v4, p2, v1

    invoke-static {p1, v2, v3, p2, v4}, Lkotlin/collections/l;->f([B[BIII)[B

    iget p2, v0, Lxu/m0;->c:I

    add-int/2addr p2, v1

    iput p2, v0, Lxu/m0;->c:I

    move p2, v4

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lxu/e;->size()J

    move-result-wide p1

    add-long/2addr p1, v5

    invoke-virtual {p0, p1, p2}, Lxu/e;->U(J)V

    return-object p0
.end method

.method public flush()V
    .locals 0

    return-void
.end method

.method public g2(Lxu/r0;)J
    .locals 6
    .param p1    # Lxu/r0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    :goto_0
    const-wide/16 v2, 0x2000

    invoke-interface {p1, p0, v2, v3}, Lxu/r0;->read(Lxu/e;J)J

    move-result-wide v2

    const-wide/16 v4, -0x1

    cmp-long v4, v2, v4

    if-eqz v4, :cond_0

    add-long/2addr v0, v2

    goto :goto_0

    :cond_0
    return-wide v0
.end method

.method public h()Lxu/e;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    return-object p0
.end method

.method public h0(Lxu/h;)J
    .locals 2
    .param p1    # Lxu/h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "targetBytes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    invoke-virtual {p0, p1, v0, v1}, Lxu/e;->q(Lxu/h;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public hashCode()I
    .locals 5

    iget-object v0, p0, Lxu/e;->a:Lxu/m0;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    const/4 v1, 0x1

    :cond_1
    iget v2, v0, Lxu/m0;->b:I

    iget v3, v0, Lxu/m0;->c:I

    :goto_0
    if-ge v2, v3, :cond_2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v4, v0, Lxu/m0;->a:[B

    aget-byte v4, v4, v2

    add-int/2addr v1, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    iget-object v0, v0, Lxu/m0;->f:Lxu/m0;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object v2, p0, Lxu/e;->a:Lxu/m0;

    if-ne v0, v2, :cond_1

    return v1
.end method

.method public i0(I)Lxu/e;
    .locals 4
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lxu/e;->Z(I)Lxu/m0;

    move-result-object v0

    iget-object v1, v0, Lxu/m0;->a:[B

    iget v2, v0, Lxu/m0;->c:I

    add-int/lit8 v3, v2, 0x1

    iput v3, v0, Lxu/m0;->c:I

    int-to-byte p1, p1

    aput-byte p1, v1, v2

    invoke-virtual {p0}, Lxu/e;->size()J

    move-result-wide v0

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    invoke-virtual {p0, v0, v1}, Lxu/e;->U(J)V

    return-object p0
.end method

.method public i2()J
    .locals 19

    move-object/from16 v0, p0

    invoke-virtual {v0}, Lxu/e;->size()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-eqz v1, :cond_e

    const/4 v1, 0x0

    const-wide/16 v5, -0x7

    move v2, v1

    move-wide v8, v3

    move-wide v6, v5

    move v5, v2

    :goto_0
    iget-object v10, v0, Lxu/e;->a:Lxu/m0;

    invoke-static {v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object v11, v10, Lxu/m0;->a:[B

    iget v12, v10, Lxu/m0;->b:I

    iget v13, v10, Lxu/m0;->c:I

    :goto_1
    if-ge v12, v13, :cond_5

    aget-byte v15, v11, v12

    const/16 v14, 0x30

    if-lt v15, v14, :cond_3

    const/16 v14, 0x39

    if-gt v15, v14, :cond_3

    rsub-int/lit8 v14, v15, 0x30

    const-wide v16, -0xcccccccccccccccL

    cmp-long v16, v8, v16

    if-ltz v16, :cond_1

    move-wide/from16 v17, v3

    if-nez v16, :cond_0

    int-to-long v3, v14

    cmp-long v3, v3, v6

    if-gez v3, :cond_0

    goto :goto_2

    :cond_0
    const-wide/16 v3, 0xa

    mul-long/2addr v8, v3

    int-to-long v3, v14

    add-long/2addr v8, v3

    goto :goto_3

    :cond_1
    :goto_2
    new-instance v1, Lxu/e;

    invoke-direct {v1}, Lxu/e;-><init>()V

    invoke-virtual {v1, v8, v9}, Lxu/e;->l0(J)Lxu/e;

    move-result-object v1

    invoke-virtual {v1, v15}, Lxu/e;->i0(I)Lxu/e;

    move-result-object v1

    if-nez v2, :cond_2

    invoke-virtual {v1}, Lxu/e;->readByte()B

    :cond_2
    new-instance v2, Ljava/lang/NumberFormatException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Number too large: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Lxu/e;->R2()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_3
    move-wide/from16 v17, v3

    const/16 v3, 0x2d

    if-ne v15, v3, :cond_4

    if-nez v1, :cond_4

    const-wide/16 v2, 0x1

    sub-long/2addr v6, v2

    const/4 v2, 0x1

    :goto_3
    add-int/lit8 v12, v12, 0x1

    add-int/lit8 v1, v1, 0x1

    move-wide/from16 v3, v17

    goto :goto_1

    :cond_4
    const/4 v5, 0x1

    goto :goto_4

    :cond_5
    move-wide/from16 v17, v3

    :goto_4
    if-ne v12, v13, :cond_6

    invoke-virtual {v10}, Lxu/m0;->b()Lxu/m0;

    move-result-object v3

    iput-object v3, v0, Lxu/e;->a:Lxu/m0;

    invoke-static {v10}, Lxu/n0;->b(Lxu/m0;)V

    goto :goto_5

    :cond_6
    iput v12, v10, Lxu/m0;->b:I

    :goto_5
    if-nez v5, :cond_8

    iget-object v3, v0, Lxu/e;->a:Lxu/m0;

    if-nez v3, :cond_7

    goto :goto_6

    :cond_7
    move-wide/from16 v3, v17

    goto/16 :goto_0

    :cond_8
    :goto_6
    invoke-virtual {v0}, Lxu/e;->size()J

    move-result-wide v3

    int-to-long v5, v1

    sub-long/2addr v3, v5

    invoke-virtual {v0, v3, v4}, Lxu/e;->U(J)V

    if-eqz v2, :cond_9

    const/4 v14, 0x2

    goto :goto_7

    :cond_9
    const/4 v14, 0x1

    :goto_7
    if-ge v1, v14, :cond_c

    invoke-virtual {v0}, Lxu/e;->size()J

    move-result-wide v3

    cmp-long v1, v3, v17

    if-eqz v1, :cond_b

    if-eqz v2, :cond_a

    const-string v1, "Expected a digit"

    goto :goto_8

    :cond_a
    const-string v1, "Expected a digit or \'-\'"

    :goto_8
    new-instance v2, Ljava/lang/NumberFormatException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " but was 0x"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v4, v17

    invoke-virtual {v0, v4, v5}, Lxu/e;->j(J)B

    move-result v1

    invoke-static {v1}, Lxu/b;->k(B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_b
    new-instance v1, Ljava/io/EOFException;

    invoke-direct {v1}, Ljava/io/EOFException;-><init>()V

    throw v1

    :cond_c
    if-eqz v2, :cond_d

    return-wide v8

    :cond_d
    neg-long v1, v8

    return-wide v1

    :cond_e
    new-instance v1, Ljava/io/EOFException;

    invoke-direct {v1}, Ljava/io/EOFException;-><init>()V

    throw v1
.end method

.method public isOpen()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final j(J)B
    .locals 6

    invoke-virtual {p0}, Lxu/e;->size()J

    move-result-wide v0

    const-wide/16 v4, 0x1

    move-wide v2, p1

    invoke-static/range {v0 .. v5}, Lxu/b;->b(JJJ)V

    iget-object p1, p0, Lxu/e;->a:Lxu/m0;

    if-eqz p1, :cond_3

    invoke-virtual {p0}, Lxu/e;->size()J

    move-result-wide v0

    sub-long/2addr v0, v2

    cmp-long p2, v0, v2

    if-gez p2, :cond_1

    invoke-virtual {p0}, Lxu/e;->size()J

    move-result-wide v0

    :goto_0
    cmp-long p2, v0, v2

    if-lez p2, :cond_0

    iget-object p1, p1, Lxu/m0;->g:Lxu/m0;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget p2, p1, Lxu/m0;->c:I

    iget v4, p1, Lxu/m0;->b:I

    sub-int/2addr p2, v4

    int-to-long v4, p2

    sub-long/2addr v0, v4

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object p2, p1, Lxu/m0;->a:[B

    iget p1, p1, Lxu/m0;->b:I

    int-to-long v4, p1

    add-long/2addr v4, v2

    sub-long/2addr v4, v0

    long-to-int p1, v4

    aget-byte p1, p2, p1

    return p1

    :cond_1
    const-wide/16 v0, 0x0

    :goto_1
    iget p2, p1, Lxu/m0;->c:I

    iget v4, p1, Lxu/m0;->b:I

    sub-int/2addr p2, v4

    int-to-long v4, p2

    add-long/2addr v4, v0

    cmp-long p2, v4, v2

    if-gtz p2, :cond_2

    iget-object p1, p1, Lxu/m0;->f:Lxu/m0;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-wide v0, v4

    goto :goto_1

    :cond_2
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object p2, p1, Lxu/m0;->a:[B

    iget p1, p1, Lxu/m0;->b:I

    int-to-long v4, p1

    add-long/2addr v4, v2

    sub-long/2addr v4, v0

    long-to-int p1, v4

    aget-byte p1, p2, p1

    return p1

    :cond_3
    const/4 p1, 0x0

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    throw p1
.end method

.method public bridge synthetic j0()Lxu/f;
    .locals 1

    invoke-virtual {p0}, Lxu/e;->h()Lxu/e;

    move-result-object v0

    return-object v0
.end method

.method public j3()Ljava/io/OutputStream;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lxu/e$c;

    invoke-direct {v0, p0}, Lxu/e$c;-><init>(Lxu/e;)V

    return-object v0
.end method

.method public k()Lxu/e;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    return-object p0
.end method

.method public k1()S
    .locals 1

    invoke-virtual {p0}, Lxu/e;->readShort()S

    move-result v0

    invoke-static {v0}, Lxu/b;->j(S)S

    move-result v0

    return v0
.end method

.method public l0(J)Lxu/e;
    .locals 11
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-nez v2, :cond_0

    const/16 p1, 0x30

    invoke-virtual {p0, p1}, Lxu/e;->i0(I)Lxu/e;

    move-result-object p1

    return-object p1

    :cond_0
    if-gez v2, :cond_2

    neg-long p1, p1

    cmp-long v2, p1, v0

    if-gez v2, :cond_1

    const-string p1, "-9223372036854775808"

    invoke-virtual {p0, p1}, Lxu/e;->H0(Ljava/lang/String;)Lxu/e;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 v2, 0x1

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    :goto_0
    invoke-static {p1, p2}, Lyu/a;->a(J)I

    move-result v3

    if-eqz v2, :cond_3

    add-int/lit8 v3, v3, 0x1

    :cond_3
    invoke-virtual {p0, v3}, Lxu/e;->Z(I)Lxu/m0;

    move-result-object v4

    iget-object v5, v4, Lxu/m0;->a:[B

    iget v6, v4, Lxu/m0;->c:I

    add-int/2addr v6, v3

    :goto_1
    cmp-long v7, p1, v0

    if-eqz v7, :cond_4

    const/16 v7, 0xa

    int-to-long v7, v7

    rem-long v9, p1, v7

    long-to-int v9, v9

    add-int/lit8 v6, v6, -0x1

    invoke-static {}, Lyu/a;->f()[B

    move-result-object v10

    aget-byte v9, v10, v9

    aput-byte v9, v5, v6

    div-long/2addr p1, v7

    goto :goto_1

    :cond_4
    if-eqz v2, :cond_5

    add-int/lit8 v6, v6, -0x1

    const/16 p1, 0x2d

    aput-byte p1, v5, v6

    :cond_5
    iget p1, v4, Lxu/m0;->c:I

    add-int/2addr p1, v3

    iput p1, v4, Lxu/m0;->c:I

    invoke-virtual {p0}, Lxu/e;->size()J

    move-result-wide p1

    int-to-long v0, v3

    add-long/2addr p1, v0

    invoke-virtual {p0, p1, p2}, Lxu/e;->U(J)V

    return-object p0
.end method

.method public l3(Lxu/f0;)I
    .locals 3
    .param p1    # Lxu/f0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "options"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, p1, v2, v0, v1}, Lyu/a;->j(Lxu/e;Lxu/f0;ZILjava/lang/Object;)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    invoke-virtual {p1}, Lxu/f0;->f()[Lxu/h;

    move-result-object p1

    aget-object p1, p1, v0

    invoke-virtual {p1}, Lxu/h;->I()I

    move-result p1

    int-to-long v1, p1

    invoke-virtual {p0, v1, v2}, Lxu/e;->skip(J)V

    return v0
.end method

.method public n(BJJ)J
    .locals 10

    const-wide/16 v0, 0x0

    cmp-long v2, v0, p2

    if-gtz v2, :cond_c

    cmp-long v2, p2, p4

    if-gtz v2, :cond_c

    invoke-virtual {p0}, Lxu/e;->size()J

    move-result-wide v2

    cmp-long v2, p4, v2

    if-lez v2, :cond_0

    invoke-virtual {p0}, Lxu/e;->size()J

    move-result-wide p4

    :cond_0
    cmp-long v2, p2, p4

    const-wide/16 v3, -0x1

    if-nez v2, :cond_1

    return-wide v3

    :cond_1
    iget-object v2, p0, Lxu/e;->a:Lxu/m0;

    if-nez v2, :cond_2

    return-wide v3

    :cond_2
    invoke-virtual {p0}, Lxu/e;->size()J

    move-result-wide v5

    sub-long/2addr v5, p2

    cmp-long v5, v5, p2

    if-gez v5, :cond_7

    invoke-virtual {p0}, Lxu/e;->size()J

    move-result-wide v0

    :goto_0
    cmp-long v5, v0, p2

    if-lez v5, :cond_3

    iget-object v2, v2, Lxu/m0;->g:Lxu/m0;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget v5, v2, Lxu/m0;->c:I

    iget v6, v2, Lxu/m0;->b:I

    sub-int/2addr v5, v6

    int-to-long v5, v5

    sub-long/2addr v0, v5

    goto :goto_0

    :cond_3
    :goto_1
    cmp-long v5, v0, p4

    if-gez v5, :cond_6

    iget-object v5, v2, Lxu/m0;->a:[B

    iget v6, v2, Lxu/m0;->c:I

    int-to-long v6, v6

    iget v8, v2, Lxu/m0;->b:I

    int-to-long v8, v8

    add-long/2addr v8, p4

    sub-long/2addr v8, v0

    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v6

    long-to-int v6, v6

    iget v7, v2, Lxu/m0;->b:I

    int-to-long v7, v7

    add-long/2addr v7, p2

    sub-long/2addr v7, v0

    long-to-int p2, v7

    :goto_2
    if-ge p2, v6, :cond_5

    aget-byte p3, v5, p2

    if-ne p3, p1, :cond_4

    :goto_3
    iget p1, v2, Lxu/m0;->b:I

    sub-int/2addr p2, p1

    int-to-long p1, p2

    add-long/2addr p1, v0

    return-wide p1

    :cond_4
    add-int/lit8 p2, p2, 0x1

    goto :goto_2

    :cond_5
    iget p2, v2, Lxu/m0;->c:I

    iget p3, v2, Lxu/m0;->b:I

    sub-int/2addr p2, p3

    int-to-long p2, p2

    add-long/2addr v0, p2

    iget-object v2, v2, Lxu/m0;->f:Lxu/m0;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-wide p2, v0

    goto :goto_1

    :cond_6
    return-wide v3

    :cond_7
    :goto_4
    iget v5, v2, Lxu/m0;->c:I

    iget v6, v2, Lxu/m0;->b:I

    sub-int/2addr v5, v6

    int-to-long v5, v5

    add-long/2addr v5, v0

    cmp-long v7, v5, p2

    if-gtz v7, :cond_8

    iget-object v2, v2, Lxu/m0;->f:Lxu/m0;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-wide v0, v5

    goto :goto_4

    :cond_8
    :goto_5
    cmp-long v5, v0, p4

    if-gez v5, :cond_b

    iget-object v5, v2, Lxu/m0;->a:[B

    iget v6, v2, Lxu/m0;->c:I

    int-to-long v6, v6

    iget v8, v2, Lxu/m0;->b:I

    int-to-long v8, v8

    add-long/2addr v8, p4

    sub-long/2addr v8, v0

    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v6

    long-to-int v6, v6

    iget v7, v2, Lxu/m0;->b:I

    int-to-long v7, v7

    add-long/2addr v7, p2

    sub-long/2addr v7, v0

    long-to-int p2, v7

    :goto_6
    if-ge p2, v6, :cond_a

    aget-byte p3, v5, p2

    if-ne p3, p1, :cond_9

    goto :goto_3

    :cond_9
    add-int/lit8 p2, p2, 0x1

    goto :goto_6

    :cond_a
    iget p2, v2, Lxu/m0;->c:I

    iget p3, v2, Lxu/m0;->b:I

    sub-int/2addr p2, p3

    int-to-long p2, p2

    add-long/2addr v0, p2

    iget-object v2, v2, Lxu/m0;->f:Lxu/m0;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-wide p2, v0

    goto :goto_5

    :cond_b
    return-wide v3

    :cond_c
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "size="

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lxu/e;->size()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, " fromIndex="

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p2, " toIndex="

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p4, p5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public n0(J)Ljava/lang/String;
    .locals 10
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_3

    const-wide v0, 0x7fffffffffffffffL

    cmp-long v2, p1, v0

    const-wide/16 v6, 0x1

    if-nez v2, :cond_0

    :goto_0
    move-wide v4, v0

    goto :goto_1

    :cond_0
    add-long v0, p1, v6

    goto :goto_0

    :goto_1
    const/16 v1, 0xa

    const-wide/16 v2, 0x0

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lxu/e;->n(BJJ)J

    move-result-wide v1

    const-wide/16 v8, -0x1

    cmp-long v3, v1, v8

    if-eqz v3, :cond_1

    invoke-static {p0, v1, v2}, Lyu/a;->h(Lxu/e;J)Ljava/lang/String;

    move-result-object v1

    return-object v1

    :cond_1
    invoke-virtual {p0}, Lxu/e;->size()J

    move-result-wide v1

    cmp-long v1, v4, v1

    if-gez v1, :cond_2

    sub-long v1, v4, v6

    invoke-virtual {p0, v1, v2}, Lxu/e;->j(J)B

    move-result v1

    const/16 v2, 0xd

    if-ne v1, v2, :cond_2

    invoke-virtual {p0, v4, v5}, Lxu/e;->j(J)B

    move-result v1

    const/16 v2, 0xa

    if-ne v1, v2, :cond_2

    invoke-static {p0, v4, v5}, Lyu/a;->h(Lxu/e;J)Ljava/lang/String;

    move-result-object v1

    return-object v1

    :cond_2
    new-instance v1, Lxu/e;

    invoke-direct {v1}, Lxu/e;-><init>()V

    invoke-virtual {p0}, Lxu/e;->size()J

    move-result-wide v2

    const/16 v4, 0x20

    int-to-long v4, v4

    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v4

    const-wide/16 v2, 0x0

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lxu/e;->f(Lxu/e;JJ)Lxu/e;

    new-instance v0, Ljava/io/EOFException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\\n not found: limit="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lxu/e;->size()J

    move-result-wide v3

    invoke-static {v3, v4, p1, p2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v3, " content="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Lxu/e;->F2()Lxu/h;

    move-result-object v1

    invoke-virtual {v1}, Lxu/h;->r()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x2026

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "limit < 0: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public n1()J
    .locals 2

    invoke-virtual {p0}, Lxu/e;->readLong()J

    move-result-wide v0

    invoke-static {v0, v1}, Lxu/b;->i(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public o(Lxu/h;J)J
    .locals 7
    .param p1    # Lxu/h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "bytes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide v5, 0x7fffffffffffffffL

    move-object v1, p0

    move-object v2, p1

    move-wide v3, p2

    invoke-virtual/range {v1 .. v6}, Lxu/e;->s1(Lxu/h;JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public o0(JLxu/h;)Z
    .locals 7
    .param p3    # Lxu/h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "bytes"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x0

    invoke-virtual {p3}, Lxu/h;->I()I

    move-result v6

    move-object v1, p0

    move-wide v2, p1

    move-object v4, p3

    invoke-virtual/range {v1 .. v6}, Lxu/e;->r(JLxu/h;II)Z

    move-result p1

    return p1
.end method

.method public o3()J
    .locals 14

    invoke-virtual {p0}, Lxu/e;->size()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_9

    const/4 v0, 0x0

    move v1, v0

    move-wide v4, v2

    :cond_0
    iget-object v6, p0, Lxu/e;->a:Lxu/m0;

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object v7, v6, Lxu/m0;->a:[B

    iget v8, v6, Lxu/m0;->b:I

    iget v9, v6, Lxu/m0;->c:I

    :goto_0
    if-ge v8, v9, :cond_6

    aget-byte v10, v7, v8

    const/16 v11, 0x30

    if-lt v10, v11, :cond_1

    const/16 v11, 0x39

    if-gt v10, v11, :cond_1

    add-int/lit8 v11, v10, -0x30

    goto :goto_1

    :cond_1
    const/16 v11, 0x61

    if-lt v10, v11, :cond_2

    const/16 v11, 0x66

    if-gt v10, v11, :cond_2

    add-int/lit8 v11, v10, -0x57

    goto :goto_1

    :cond_2
    const/16 v11, 0x41

    if-lt v10, v11, :cond_4

    const/16 v11, 0x46

    if-gt v10, v11, :cond_4

    add-int/lit8 v11, v10, -0x37

    :goto_1
    const-wide/high16 v12, -0x1000000000000000L    # -3.105036184601418E231

    and-long/2addr v12, v4

    cmp-long v12, v12, v2

    if-nez v12, :cond_3

    const/4 v10, 0x4

    shl-long/2addr v4, v10

    int-to-long v10, v11

    or-long/2addr v4, v10

    add-int/lit8 v8, v8, 0x1

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    new-instance v0, Lxu/e;

    invoke-direct {v0}, Lxu/e;-><init>()V

    invoke-virtual {v0, v4, v5}, Lxu/e;->r0(J)Lxu/e;

    move-result-object v0

    invoke-virtual {v0, v10}, Lxu/e;->i0(I)Lxu/e;

    move-result-object v0

    new-instance v1, Ljava/lang/NumberFormatException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Number too large: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lxu/e;->R2()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_4
    if-eqz v0, :cond_5

    const/4 v1, 0x1

    goto :goto_2

    :cond_5
    new-instance v0, Ljava/lang/NumberFormatException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Expected leading [0-9a-fA-F] character but was 0x"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v10}, Lxu/b;->k(B)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    :goto_2
    if-ne v8, v9, :cond_7

    invoke-virtual {v6}, Lxu/m0;->b()Lxu/m0;

    move-result-object v7

    iput-object v7, p0, Lxu/e;->a:Lxu/m0;

    invoke-static {v6}, Lxu/n0;->b(Lxu/m0;)V

    goto :goto_3

    :cond_7
    iput v8, v6, Lxu/m0;->b:I

    :goto_3
    if-nez v1, :cond_8

    iget-object v6, p0, Lxu/e;->a:Lxu/m0;

    if-nez v6, :cond_0

    :cond_8
    invoke-virtual {p0}, Lxu/e;->size()J

    move-result-wide v1

    int-to-long v6, v0

    sub-long/2addr v1, v6

    invoke-virtual {p0, v1, v2}, Lxu/e;->U(J)V

    return-wide v4

    :cond_9
    new-instance v0, Ljava/io/EOFException;

    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    throw v0
.end method

.method public peek()Lxu/g;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lxu/i0;

    invoke-direct {v0, p0}, Lxu/i0;-><init>(Lxu/g;)V

    invoke-static {v0}, Lxu/b0;->c(Lxu/r0;)Lxu/g;

    move-result-object v0

    return-object v0
.end method

.method public q(Lxu/h;J)J
    .locals 11
    .param p1    # Lxu/h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "targetBytes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-ltz v2, :cond_13

    iget-object v2, p0, Lxu/e;->a:Lxu/m0;

    const-wide/16 v3, -0x1

    if-nez v2, :cond_0

    return-wide v3

    :cond_0
    invoke-virtual {p0}, Lxu/e;->size()J

    move-result-wide v5

    sub-long/2addr v5, p2

    cmp-long v5, v5, p2

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-gez v5, :cond_a

    invoke-virtual {p0}, Lxu/e;->size()J

    move-result-wide v0

    :goto_0
    cmp-long v5, v0, p2

    if-lez v5, :cond_1

    iget-object v2, v2, Lxu/m0;->g:Lxu/m0;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget v5, v2, Lxu/m0;->c:I

    iget v9, v2, Lxu/m0;->b:I

    sub-int/2addr v5, v9

    int-to-long v9, v5

    sub-long/2addr v0, v9

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lxu/h;->I()I

    move-result v5

    if-ne v5, v6, :cond_5

    invoke-virtual {p1, v7}, Lxu/h;->j(I)B

    move-result v5

    invoke-virtual {p1, v8}, Lxu/h;->j(I)B

    move-result p1

    :goto_1
    invoke-virtual {p0}, Lxu/e;->size()J

    move-result-wide v6

    cmp-long v6, v0, v6

    if-gez v6, :cond_9

    iget-object v6, v2, Lxu/m0;->a:[B

    iget v7, v2, Lxu/m0;->b:I

    int-to-long v7, v7

    add-long/2addr v7, p2

    sub-long/2addr v7, v0

    long-to-int p2, v7

    iget p3, v2, Lxu/m0;->c:I

    :goto_2
    if-ge p2, p3, :cond_4

    aget-byte v7, v6, p2

    if-eq v7, v5, :cond_3

    if-ne v7, p1, :cond_2

    goto :goto_3

    :cond_2
    add-int/lit8 p2, p2, 0x1

    goto :goto_2

    :cond_3
    :goto_3
    iget p1, v2, Lxu/m0;->b:I

    :goto_4
    sub-int/2addr p2, p1

    int-to-long p1, p2

    add-long/2addr p1, v0

    return-wide p1

    :cond_4
    iget p2, v2, Lxu/m0;->c:I

    iget p3, v2, Lxu/m0;->b:I

    sub-int/2addr p2, p3

    int-to-long p2, p2

    add-long/2addr v0, p2

    iget-object v2, v2, Lxu/m0;->f:Lxu/m0;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-wide p2, v0

    goto :goto_1

    :cond_5
    invoke-virtual {p1}, Lxu/h;->w()[B

    move-result-object p1

    :goto_5
    invoke-virtual {p0}, Lxu/e;->size()J

    move-result-wide v5

    cmp-long v5, v0, v5

    if-gez v5, :cond_9

    iget-object v5, v2, Lxu/m0;->a:[B

    iget v6, v2, Lxu/m0;->b:I

    int-to-long v8, v6

    add-long/2addr v8, p2

    sub-long/2addr v8, v0

    long-to-int p2, v8

    iget p3, v2, Lxu/m0;->c:I

    :goto_6
    if-ge p2, p3, :cond_8

    aget-byte v6, v5, p2

    array-length v8, p1

    move v9, v7

    :goto_7
    if-ge v9, v8, :cond_7

    aget-byte v10, p1, v9

    if-ne v6, v10, :cond_6

    :goto_8
    iget p1, v2, Lxu/m0;->b:I

    goto :goto_4

    :cond_6
    add-int/lit8 v9, v9, 0x1

    goto :goto_7

    :cond_7
    add-int/lit8 p2, p2, 0x1

    goto :goto_6

    :cond_8
    iget p2, v2, Lxu/m0;->c:I

    iget p3, v2, Lxu/m0;->b:I

    sub-int/2addr p2, p3

    int-to-long p2, p2

    add-long/2addr v0, p2

    iget-object v2, v2, Lxu/m0;->f:Lxu/m0;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-wide p2, v0

    goto :goto_5

    :cond_9
    return-wide v3

    :cond_a
    :goto_9
    iget v5, v2, Lxu/m0;->c:I

    iget v9, v2, Lxu/m0;->b:I

    sub-int/2addr v5, v9

    int-to-long v9, v5

    add-long/2addr v9, v0

    cmp-long v5, v9, p2

    if-gtz v5, :cond_b

    iget-object v2, v2, Lxu/m0;->f:Lxu/m0;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-wide v0, v9

    goto :goto_9

    :cond_b
    invoke-virtual {p1}, Lxu/h;->I()I

    move-result v5

    if-ne v5, v6, :cond_e

    invoke-virtual {p1, v7}, Lxu/h;->j(I)B

    move-result v5

    invoke-virtual {p1, v8}, Lxu/h;->j(I)B

    move-result p1

    :goto_a
    invoke-virtual {p0}, Lxu/e;->size()J

    move-result-wide v6

    cmp-long v6, v0, v6

    if-gez v6, :cond_12

    iget-object v6, v2, Lxu/m0;->a:[B

    iget v7, v2, Lxu/m0;->b:I

    int-to-long v7, v7

    add-long/2addr v7, p2

    sub-long/2addr v7, v0

    long-to-int p2, v7

    iget p3, v2, Lxu/m0;->c:I

    :goto_b
    if-ge p2, p3, :cond_d

    aget-byte v7, v6, p2

    if-eq v7, v5, :cond_3

    if-ne v7, p1, :cond_c

    goto/16 :goto_3

    :cond_c
    add-int/lit8 p2, p2, 0x1

    goto :goto_b

    :cond_d
    iget p2, v2, Lxu/m0;->c:I

    iget p3, v2, Lxu/m0;->b:I

    sub-int/2addr p2, p3

    int-to-long p2, p2

    add-long/2addr v0, p2

    iget-object v2, v2, Lxu/m0;->f:Lxu/m0;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-wide p2, v0

    goto :goto_a

    :cond_e
    invoke-virtual {p1}, Lxu/h;->w()[B

    move-result-object p1

    :goto_c
    invoke-virtual {p0}, Lxu/e;->size()J

    move-result-wide v5

    cmp-long v5, v0, v5

    if-gez v5, :cond_12

    iget-object v5, v2, Lxu/m0;->a:[B

    iget v6, v2, Lxu/m0;->b:I

    int-to-long v8, v6

    add-long/2addr v8, p2

    sub-long/2addr v8, v0

    long-to-int p2, v8

    iget p3, v2, Lxu/m0;->c:I

    :goto_d
    if-ge p2, p3, :cond_11

    aget-byte v6, v5, p2

    array-length v8, p1

    move v9, v7

    :goto_e
    if-ge v9, v8, :cond_10

    aget-byte v10, p1, v9

    if-ne v6, v10, :cond_f

    goto/16 :goto_8

    :cond_f
    add-int/lit8 v9, v9, 0x1

    goto :goto_e

    :cond_10
    add-int/lit8 p2, p2, 0x1

    goto :goto_d

    :cond_11
    iget p2, v2, Lxu/m0;->c:I

    iget p3, v2, Lxu/m0;->b:I

    sub-int/2addr p2, p3

    int-to-long p2, p2

    add-long/2addr v0, p2

    iget-object v2, v2, Lxu/m0;->f:Lxu/m0;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-wide p2, v0

    goto :goto_c

    :cond_12
    return-wide v3

    :cond_13
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "fromIndex < 0: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public r(JLxu/h;II)Z
    .locals 10
    .param p3    # Lxu/h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "bytes"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v8, 0x0

    if-gez p5, :cond_0

    return v8

    :cond_0
    const-wide/16 v2, 0x0

    cmp-long v0, p1, v2

    if-ltz v0, :cond_4

    int-to-long v2, p5

    add-long/2addr v2, p1

    invoke-virtual {p0}, Lxu/e;->size()J

    move-result-wide v4

    cmp-long v0, v2, v4

    if-lez v0, :cond_1

    goto :goto_0

    :cond_1
    if-ltz p4, :cond_4

    add-int v0, p4, p5

    invoke-virtual {p3}, Lxu/h;->I()I

    move-result v2

    if-le v0, v2, :cond_2

    goto :goto_0

    :cond_2
    const/4 v9, 0x1

    if-nez p5, :cond_3

    return v9

    :cond_3
    const-wide/16 v2, 0x1

    add-long v4, p1, v2

    move-object v0, p0

    move-wide v2, p1

    move-object v1, p3

    move v6, p4

    move v7, p5

    invoke-static/range {v0 .. v7}, Lyu/a;->b(Lxu/e;Lxu/h;JJII)J

    move-result-wide v1

    const-wide/16 v3, -0x1

    cmp-long v0, v1, v3

    if-eqz v0, :cond_4

    return v9

    :cond_4
    :goto_0
    return v8
.end method

.method public r0(J)Lxu/e;
    .locals 12
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    const/16 p1, 0x30

    invoke-virtual {p0, p1}, Lxu/e;->i0(I)Lxu/e;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 v0, 0x1

    ushr-long v1, p1, v0

    or-long/2addr v1, p1

    const/4 v3, 0x2

    ushr-long v4, v1, v3

    or-long/2addr v1, v4

    const/4 v4, 0x4

    ushr-long v5, v1, v4

    or-long/2addr v1, v5

    const/16 v5, 0x8

    ushr-long v6, v1, v5

    or-long/2addr v1, v6

    const/16 v6, 0x10

    ushr-long v7, v1, v6

    or-long/2addr v1, v7

    const/16 v7, 0x20

    ushr-long v8, v1, v7

    or-long/2addr v1, v8

    ushr-long v8, v1, v0

    const-wide v10, 0x5555555555555555L    # 1.1945305291614955E103

    and-long/2addr v8, v10

    sub-long/2addr v1, v8

    ushr-long v8, v1, v3

    const-wide v10, 0x3333333333333333L    # 4.667261458395856E-62

    and-long/2addr v8, v10

    and-long/2addr v1, v10

    add-long/2addr v8, v1

    ushr-long v1, v8, v4

    add-long/2addr v1, v8

    const-wide v8, 0xf0f0f0f0f0f0f0fL    # 3.815736827118017E-236

    and-long/2addr v1, v8

    ushr-long v8, v1, v5

    add-long/2addr v1, v8

    ushr-long v5, v1, v6

    add-long/2addr v1, v5

    const-wide/16 v5, 0x3f

    and-long v8, v1, v5

    ushr-long/2addr v1, v7

    and-long/2addr v1, v5

    add-long/2addr v8, v1

    const/4 v1, 0x3

    int-to-long v1, v1

    add-long/2addr v8, v1

    int-to-long v1, v4

    div-long/2addr v8, v1

    long-to-int v1, v8

    invoke-virtual {p0, v1}, Lxu/e;->Z(I)Lxu/m0;

    move-result-object v2

    iget-object v3, v2, Lxu/m0;->a:[B

    iget v5, v2, Lxu/m0;->c:I

    add-int v6, v5, v1

    sub-int/2addr v6, v0

    :goto_0
    if-lt v6, v5, :cond_1

    invoke-static {}, Lyu/a;->f()[B

    move-result-object v0

    const-wide/16 v7, 0xf

    and-long/2addr v7, p1

    long-to-int v7, v7

    aget-byte v0, v0, v7

    aput-byte v0, v3, v6

    ushr-long/2addr p1, v4

    add-int/lit8 v6, v6, -0x1

    goto :goto_0

    :cond_1
    iget p1, v2, Lxu/m0;->c:I

    add-int/2addr p1, v1

    iput p1, v2, Lxu/m0;->c:I

    invoke-virtual {p0}, Lxu/e;->size()J

    move-result-wide p1

    int-to-long v0, v1

    add-long/2addr p1, v0

    invoke-virtual {p0, p1, p2}, Lxu/e;->U(J)V

    return-object p0
.end method

.method public read(Ljava/nio/ByteBuffer;)I
    .locals 6
    .param p1    # Ljava/nio/ByteBuffer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lxu/e;->a:Lxu/m0;

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    .line 2
    :cond_0
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v1

    iget v2, v0, Lxu/m0;->c:I

    iget v3, v0, Lxu/m0;->b:I

    sub-int/2addr v2, v3

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 3
    iget-object v2, v0, Lxu/m0;->a:[B

    iget v3, v0, Lxu/m0;->b:I

    invoke-virtual {p1, v2, v3, v1}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    .line 4
    iget p1, v0, Lxu/m0;->b:I

    add-int/2addr p1, v1

    iput p1, v0, Lxu/m0;->b:I

    .line 5
    iget-wide v2, p0, Lxu/e;->b:J

    int-to-long v4, v1

    sub-long/2addr v2, v4

    iput-wide v2, p0, Lxu/e;->b:J

    .line 6
    iget v2, v0, Lxu/m0;->c:I

    if-ne p1, v2, :cond_1

    .line 7
    invoke-virtual {v0}, Lxu/m0;->b()Lxu/m0;

    move-result-object p1

    iput-object p1, p0, Lxu/e;->a:Lxu/m0;

    .line 8
    invoke-static {v0}, Lxu/n0;->b(Lxu/m0;)V

    :cond_1
    return v1
.end method

.method public read([BII)I
    .locals 7
    .param p1    # [B
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    array-length v0, p1

    int-to-long v1, v0

    int-to-long v3, p2

    int-to-long v5, p3

    invoke-static/range {v1 .. v6}, Lxu/b;->b(JJJ)V

    .line 10
    iget-object v0, p0, Lxu/e;->a:Lxu/m0;

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    .line 11
    :cond_0
    iget v1, v0, Lxu/m0;->c:I

    iget v2, v0, Lxu/m0;->b:I

    sub-int/2addr v1, v2

    invoke-static {p3, v1}, Ljava/lang/Math;->min(II)I

    move-result p3

    .line 12
    iget-object v1, v0, Lxu/m0;->a:[B

    .line 13
    iget v2, v0, Lxu/m0;->b:I

    add-int v3, v2, p3

    .line 14
    invoke-static {v1, p1, p2, v2, v3}, Lkotlin/collections/l;->f([B[BIII)[B

    .line 15
    iget p1, v0, Lxu/m0;->b:I

    add-int/2addr p1, p3

    iput p1, v0, Lxu/m0;->b:I

    .line 16
    invoke-virtual {p0}, Lxu/e;->size()J

    move-result-wide p1

    int-to-long v1, p3

    sub-long/2addr p1, v1

    invoke-virtual {p0, p1, p2}, Lxu/e;->U(J)V

    .line 17
    iget p1, v0, Lxu/m0;->b:I

    iget p2, v0, Lxu/m0;->c:I

    if-ne p1, p2, :cond_1

    .line 18
    invoke-virtual {v0}, Lxu/m0;->b()Lxu/m0;

    move-result-object p1

    iput-object p1, p0, Lxu/e;->a:Lxu/m0;

    .line 19
    invoke-static {v0}, Lxu/n0;->b(Lxu/m0;)V

    :cond_1
    return p3
.end method

.method public read(Lxu/e;J)J
    .locals 4
    .param p1    # Lxu/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-ltz v2, :cond_2

    .line 20
    invoke-virtual {p0}, Lxu/e;->size()J

    move-result-wide v2

    cmp-long v0, v2, v0

    if-nez v0, :cond_0

    const-wide/16 p1, -0x1

    return-wide p1

    .line 21
    :cond_0
    invoke-virtual {p0}, Lxu/e;->size()J

    move-result-wide v0

    cmp-long v0, p2, v0

    if-lez v0, :cond_1

    invoke-virtual {p0}, Lxu/e;->size()J

    move-result-wide p2

    .line 22
    :cond_1
    invoke-virtual {p1, p0, p2, p3}, Lxu/e;->write(Lxu/e;J)V

    return-wide p2

    .line 23
    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "byteCount < 0: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public readByte()B
    .locals 9

    invoke-virtual {p0}, Lxu/e;->size()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_1

    iget-object v0, p0, Lxu/e;->a:Lxu/m0;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget v1, v0, Lxu/m0;->b:I

    iget v2, v0, Lxu/m0;->c:I

    iget-object v3, v0, Lxu/m0;->a:[B

    add-int/lit8 v4, v1, 0x1

    aget-byte v1, v3, v1

    invoke-virtual {p0}, Lxu/e;->size()J

    move-result-wide v5

    const-wide/16 v7, 0x1

    sub-long/2addr v5, v7

    invoke-virtual {p0, v5, v6}, Lxu/e;->U(J)V

    if-ne v4, v2, :cond_0

    invoke-virtual {v0}, Lxu/m0;->b()Lxu/m0;

    move-result-object v2

    iput-object v2, p0, Lxu/e;->a:Lxu/m0;

    invoke-static {v0}, Lxu/n0;->b(Lxu/m0;)V

    return v1

    :cond_0
    iput v4, v0, Lxu/m0;->b:I

    return v1

    :cond_1
    new-instance v0, Ljava/io/EOFException;

    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    throw v0
.end method

.method public readFully([B)V
    .locals 3
    .param p1    # [B
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    :goto_0
    array-length v1, p1

    if-ge v0, v1, :cond_1

    array-length v1, p1

    sub-int/2addr v1, v0

    invoke-virtual {p0, p1, v0, v1}, Lxu/e;->read([BII)I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    add-int/2addr v0, v1

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1

    :cond_1
    return-void
.end method

.method public readInt()I
    .locals 9

    invoke-virtual {p0}, Lxu/e;->size()J

    move-result-wide v0

    const-wide/16 v2, 0x4

    cmp-long v0, v0, v2

    if-ltz v0, :cond_2

    iget-object v0, p0, Lxu/e;->a:Lxu/m0;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget v1, v0, Lxu/m0;->b:I

    iget v4, v0, Lxu/m0;->c:I

    sub-int v5, v4, v1

    int-to-long v5, v5

    cmp-long v5, v5, v2

    if-gez v5, :cond_0

    invoke-virtual {p0}, Lxu/e;->readByte()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x18

    invoke-virtual {p0}, Lxu/e;->readByte()B

    move-result v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x10

    or-int/2addr v0, v1

    invoke-virtual {p0}, Lxu/e;->readByte()B

    move-result v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    invoke-virtual {p0}, Lxu/e;->readByte()B

    move-result v1

    and-int/lit16 v1, v1, 0xff

    or-int/2addr v0, v1

    return v0

    :cond_0
    iget-object v5, v0, Lxu/m0;->a:[B

    add-int/lit8 v6, v1, 0x1

    aget-byte v7, v5, v1

    and-int/lit16 v7, v7, 0xff

    shl-int/lit8 v7, v7, 0x18

    add-int/lit8 v8, v1, 0x2

    aget-byte v6, v5, v6

    and-int/lit16 v6, v6, 0xff

    shl-int/lit8 v6, v6, 0x10

    or-int/2addr v6, v7

    add-int/lit8 v7, v1, 0x3

    aget-byte v8, v5, v8

    and-int/lit16 v8, v8, 0xff

    shl-int/lit8 v8, v8, 0x8

    or-int/2addr v6, v8

    add-int/lit8 v1, v1, 0x4

    aget-byte v5, v5, v7

    and-int/lit16 v5, v5, 0xff

    or-int/2addr v5, v6

    invoke-virtual {p0}, Lxu/e;->size()J

    move-result-wide v6

    sub-long/2addr v6, v2

    invoke-virtual {p0, v6, v7}, Lxu/e;->U(J)V

    if-ne v1, v4, :cond_1

    invoke-virtual {v0}, Lxu/m0;->b()Lxu/m0;

    move-result-object v1

    iput-object v1, p0, Lxu/e;->a:Lxu/m0;

    invoke-static {v0}, Lxu/n0;->b(Lxu/m0;)V

    return v5

    :cond_1
    iput v1, v0, Lxu/m0;->b:I

    return v5

    :cond_2
    new-instance v0, Ljava/io/EOFException;

    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    throw v0
.end method

.method public readLong()J
    .locals 15

    invoke-virtual {p0}, Lxu/e;->size()J

    move-result-wide v0

    const-wide/16 v2, 0x8

    cmp-long v0, v0, v2

    if-ltz v0, :cond_2

    iget-object v0, p0, Lxu/e;->a:Lxu/m0;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget v1, v0, Lxu/m0;->b:I

    iget v4, v0, Lxu/m0;->c:I

    sub-int v5, v4, v1

    int-to-long v5, v5

    cmp-long v5, v5, v2

    const/16 v6, 0x20

    if-gez v5, :cond_0

    invoke-virtual {p0}, Lxu/e;->readInt()I

    move-result v0

    int-to-long v0, v0

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    shl-long/2addr v0, v6

    invoke-virtual {p0}, Lxu/e;->readInt()I

    move-result v4

    int-to-long v4, v4

    and-long/2addr v2, v4

    or-long/2addr v0, v2

    return-wide v0

    :cond_0
    iget-object v5, v0, Lxu/m0;->a:[B

    add-int/lit8 v7, v1, 0x1

    aget-byte v8, v5, v1

    int-to-long v8, v8

    const-wide/16 v10, 0xff

    and-long/2addr v8, v10

    const/16 v12, 0x38

    shl-long/2addr v8, v12

    add-int/lit8 v12, v1, 0x2

    aget-byte v7, v5, v7

    int-to-long v13, v7

    and-long/2addr v13, v10

    const/16 v7, 0x30

    shl-long/2addr v13, v7

    or-long v7, v8, v13

    add-int/lit8 v9, v1, 0x3

    aget-byte v12, v5, v12

    int-to-long v12, v12

    and-long/2addr v12, v10

    const/16 v14, 0x28

    shl-long/2addr v12, v14

    or-long/2addr v7, v12

    add-int/lit8 v12, v1, 0x4

    aget-byte v9, v5, v9

    int-to-long v13, v9

    and-long/2addr v13, v10

    shl-long/2addr v13, v6

    or-long v6, v7, v13

    add-int/lit8 v8, v1, 0x5

    aget-byte v9, v5, v12

    int-to-long v12, v9

    and-long/2addr v12, v10

    const/16 v9, 0x18

    shl-long/2addr v12, v9

    or-long/2addr v6, v12

    add-int/lit8 v9, v1, 0x6

    aget-byte v8, v5, v8

    int-to-long v12, v8

    and-long/2addr v12, v10

    const/16 v8, 0x10

    shl-long/2addr v12, v8

    or-long/2addr v6, v12

    add-int/lit8 v8, v1, 0x7

    aget-byte v9, v5, v9

    int-to-long v12, v9

    and-long/2addr v12, v10

    const/16 v9, 0x8

    shl-long/2addr v12, v9

    or-long/2addr v6, v12

    add-int/2addr v1, v9

    aget-byte v5, v5, v8

    int-to-long v8, v5

    and-long/2addr v8, v10

    or-long v5, v6, v8

    invoke-virtual {p0}, Lxu/e;->size()J

    move-result-wide v7

    sub-long/2addr v7, v2

    invoke-virtual {p0, v7, v8}, Lxu/e;->U(J)V

    if-ne v1, v4, :cond_1

    invoke-virtual {v0}, Lxu/m0;->b()Lxu/m0;

    move-result-object v1

    iput-object v1, p0, Lxu/e;->a:Lxu/m0;

    invoke-static {v0}, Lxu/n0;->b(Lxu/m0;)V

    return-wide v5

    :cond_1
    iput v1, v0, Lxu/m0;->b:I

    return-wide v5

    :cond_2
    new-instance v0, Ljava/io/EOFException;

    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    throw v0
.end method

.method public readShort()S
    .locals 9

    invoke-virtual {p0}, Lxu/e;->size()J

    move-result-wide v0

    const-wide/16 v2, 0x2

    cmp-long v0, v0, v2

    if-ltz v0, :cond_2

    iget-object v0, p0, Lxu/e;->a:Lxu/m0;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget v1, v0, Lxu/m0;->b:I

    iget v4, v0, Lxu/m0;->c:I

    sub-int v5, v4, v1

    const/4 v6, 0x2

    if-ge v5, v6, :cond_0

    invoke-virtual {p0}, Lxu/e;->readByte()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x8

    invoke-virtual {p0}, Lxu/e;->readByte()B

    move-result v1

    and-int/lit16 v1, v1, 0xff

    or-int/2addr v0, v1

    int-to-short v0, v0

    return v0

    :cond_0
    iget-object v5, v0, Lxu/m0;->a:[B

    add-int/lit8 v7, v1, 0x1

    aget-byte v8, v5, v1

    and-int/lit16 v8, v8, 0xff

    shl-int/lit8 v8, v8, 0x8

    add-int/2addr v1, v6

    aget-byte v5, v5, v7

    and-int/lit16 v5, v5, 0xff

    or-int/2addr v5, v8

    invoke-virtual {p0}, Lxu/e;->size()J

    move-result-wide v6

    sub-long/2addr v6, v2

    invoke-virtual {p0, v6, v7}, Lxu/e;->U(J)V

    if-ne v1, v4, :cond_1

    invoke-virtual {v0}, Lxu/m0;->b()Lxu/m0;

    move-result-object v1

    iput-object v1, p0, Lxu/e;->a:Lxu/m0;

    invoke-static {v0}, Lxu/n0;->b(Lxu/m0;)V

    goto :goto_0

    :cond_1
    iput v1, v0, Lxu/m0;->b:I

    :goto_0
    int-to-short v0, v5

    return v0

    :cond_2
    new-instance v0, Ljava/io/EOFException;

    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    throw v0
.end method

.method public request(J)Z
    .locals 2

    iget-wide v0, p0, Lxu/e;->b:J

    cmp-long p1, v0, p1

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final s(Lxu/e$a;)Lxu/e$a;
    .locals 1
    .param p1    # Lxu/e$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "unsafeCursor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lyu/a;->d(Lxu/e;Lxu/e$a;)Lxu/e$a;

    move-result-object p1

    return-object p1
.end method

.method public s1(Lxu/h;JJ)J
    .locals 11
    .param p1    # Lxu/h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "bytes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v9, 0x18

    const/4 v10, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v1, p0

    move-object v2, p1

    move-wide v3, p2

    move-wide v5, p4

    invoke-static/range {v1 .. v10}, Lyu/a;->c(Lxu/e;Lxu/h;JJIIILjava/lang/Object;)J

    move-result-wide p1

    return-wide p1
.end method

.method public s3()Ljava/io/InputStream;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lxu/e$b;

    invoke-direct {v0, p0}, Lxu/e$b;-><init>(Lxu/e;)V

    return-object v0
.end method

.method public final size()J
    .locals 2

    iget-wide v0, p0, Lxu/e;->b:J

    return-wide v0
.end method

.method public skip(J)V
    .locals 6

    :cond_0
    :goto_0
    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-lez v0, :cond_2

    iget-object v0, p0, Lxu/e;->a:Lxu/m0;

    if-eqz v0, :cond_1

    iget v1, v0, Lxu/m0;->c:I

    iget v2, v0, Lxu/m0;->b:I

    sub-int/2addr v1, v2

    int-to-long v1, v1

    invoke-static {p1, p2, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    long-to-int v1, v1

    invoke-virtual {p0}, Lxu/e;->size()J

    move-result-wide v2

    int-to-long v4, v1

    sub-long/2addr v2, v4

    invoke-virtual {p0, v2, v3}, Lxu/e;->U(J)V

    sub-long/2addr p1, v4

    iget v2, v0, Lxu/m0;->b:I

    add-int/2addr v2, v1

    iput v2, v0, Lxu/m0;->b:I

    iget v1, v0, Lxu/m0;->c:I

    if-ne v2, v1, :cond_0

    invoke-virtual {v0}, Lxu/m0;->b()Lxu/m0;

    move-result-object v1

    iput-object v1, p0, Lxu/e;->a:Lxu/m0;

    invoke-static {v0}, Lxu/n0;->b(Lxu/m0;)V

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1

    :cond_2
    return-void
.end method

.method public t0(I)Lxu/e;
    .locals 7
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lxu/e;->Z(I)Lxu/m0;

    move-result-object v1

    iget-object v2, v1, Lxu/m0;->a:[B

    iget v3, v1, Lxu/m0;->c:I

    add-int/lit8 v4, v3, 0x1

    ushr-int/lit8 v5, p1, 0x18

    and-int/lit16 v5, v5, 0xff

    int-to-byte v5, v5

    aput-byte v5, v2, v3

    add-int/lit8 v5, v3, 0x2

    ushr-int/lit8 v6, p1, 0x10

    and-int/lit16 v6, v6, 0xff

    int-to-byte v6, v6

    aput-byte v6, v2, v4

    add-int/lit8 v4, v3, 0x3

    ushr-int/lit8 v6, p1, 0x8

    and-int/lit16 v6, v6, 0xff

    int-to-byte v6, v6

    aput-byte v6, v2, v5

    add-int/2addr v3, v0

    and-int/lit16 p1, p1, 0xff

    int-to-byte p1, p1

    aput-byte p1, v2, v4

    iput v3, v1, Lxu/m0;->c:I

    invoke-virtual {p0}, Lxu/e;->size()J

    move-result-wide v0

    const-wide/16 v2, 0x4

    add-long/2addr v0, v2

    invoke-virtual {p0, v0, v1}, Lxu/e;->U(J)V

    return-object p0
.end method

.method public timeout()Lxu/s0;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lxu/s0;->NONE:Lxu/s0;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-virtual {p0}, Lxu/e;->X()Lxu/h;

    move-result-object v0

    invoke-virtual {v0}, Lxu/h;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public w(J)[B
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_1

    const-wide/32 v0, 0x7fffffff

    cmp-long v0, p1, v0

    if-gtz v0, :cond_1

    invoke-virtual {p0}, Lxu/e;->size()J

    move-result-wide v0

    cmp-long v0, v0, p1

    if-ltz v0, :cond_0

    long-to-int p1, p1

    new-array p1, p1, [B

    invoke-virtual {p0, p1}, Lxu/e;->readFully([B)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "byteCount: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public w1(J)V
    .locals 2

    iget-wide v0, p0, Lxu/e;->b:J

    cmp-long p1, v0, p1

    if-ltz p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1
.end method

.method public write(Ljava/nio/ByteBuffer;)I
    .locals 6
    .param p1    # Ljava/nio/ByteBuffer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v0

    move v1, v0

    :goto_0
    if-lez v1, :cond_0

    const/4 v2, 0x1

    .line 4
    invoke-virtual {p0, v2}, Lxu/e;->Z(I)Lxu/m0;

    move-result-object v2

    .line 5
    iget v3, v2, Lxu/m0;->c:I

    rsub-int v3, v3, 0x2000

    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 6
    iget-object v4, v2, Lxu/m0;->a:[B

    iget v5, v2, Lxu/m0;->c:I

    invoke-virtual {p1, v4, v5, v3}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    sub-int/2addr v1, v3

    .line 7
    iget v4, v2, Lxu/m0;->c:I

    add-int/2addr v4, v3

    iput v4, v2, Lxu/m0;->c:I

    goto :goto_0

    .line 8
    :cond_0
    iget-wide v1, p0, Lxu/e;->b:J

    int-to-long v3, v0

    add-long/2addr v1, v3

    iput-wide v1, p0, Lxu/e;->b:J

    return v0
.end method

.method public bridge synthetic write([B)Lxu/f;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lxu/e;->e0([B)Lxu/e;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic write([BII)Lxu/f;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2, p3}, Lxu/e;->f0([BII)Lxu/e;

    move-result-object p1

    return-object p1
.end method

.method public write(Lxu/e;J)V
    .locals 7
    .param p1    # Lxu/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eq p1, p0, :cond_6

    .line 9
    invoke-virtual {p1}, Lxu/e;->size()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    move-wide v5, p2

    invoke-static/range {v1 .. v6}, Lxu/b;->b(JJJ)V

    :goto_0
    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-lez v0, :cond_5

    .line 10
    iget-object v0, p1, Lxu/e;->a:Lxu/m0;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget v0, v0, Lxu/m0;->c:I

    iget-object v1, p1, Lxu/e;->a:Lxu/m0;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget v1, v1, Lxu/m0;->b:I

    sub-int/2addr v0, v1

    int-to-long v0, v0

    cmp-long v0, p2, v0

    if-gez v0, :cond_3

    .line 11
    iget-object v0, p0, Lxu/e;->a:Lxu/m0;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object v0, v0, Lxu/m0;->g:Lxu/m0;

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    :goto_1
    if-eqz v0, :cond_2

    .line 12
    iget-boolean v1, v0, Lxu/m0;->e:Z

    if-eqz v1, :cond_2

    .line 13
    iget v1, v0, Lxu/m0;->c:I

    int-to-long v1, v1

    add-long/2addr v1, p2

    iget-boolean v3, v0, Lxu/m0;->d:Z

    if-eqz v3, :cond_1

    const/4 v3, 0x0

    goto :goto_2

    :cond_1
    iget v3, v0, Lxu/m0;->b:I

    :goto_2
    int-to-long v3, v3

    sub-long/2addr v1, v3

    const-wide/16 v3, 0x2000

    cmp-long v1, v1, v3

    if-gtz v1, :cond_2

    .line 14
    iget-object v1, p1, Lxu/e;->a:Lxu/m0;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    long-to-int v2, p2

    invoke-virtual {v1, v0, v2}, Lxu/m0;->g(Lxu/m0;I)V

    .line 15
    invoke-virtual {p1}, Lxu/e;->size()J

    move-result-wide v0

    sub-long/2addr v0, p2

    invoke-virtual {p1, v0, v1}, Lxu/e;->U(J)V

    .line 16
    invoke-virtual {p0}, Lxu/e;->size()J

    move-result-wide v0

    add-long/2addr v0, p2

    invoke-virtual {p0, v0, v1}, Lxu/e;->U(J)V

    return-void

    .line 17
    :cond_2
    iget-object v0, p1, Lxu/e;->a:Lxu/m0;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    long-to-int v1, p2

    invoke-virtual {v0, v1}, Lxu/m0;->e(I)Lxu/m0;

    move-result-object v0

    iput-object v0, p1, Lxu/e;->a:Lxu/m0;

    .line 18
    :cond_3
    iget-object v0, p1, Lxu/e;->a:Lxu/m0;

    .line 19
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget v1, v0, Lxu/m0;->c:I

    iget v2, v0, Lxu/m0;->b:I

    sub-int/2addr v1, v2

    int-to-long v1, v1

    .line 20
    invoke-virtual {v0}, Lxu/m0;->b()Lxu/m0;

    move-result-object v3

    iput-object v3, p1, Lxu/e;->a:Lxu/m0;

    .line 21
    iget-object v3, p0, Lxu/e;->a:Lxu/m0;

    if-nez v3, :cond_4

    .line 22
    iput-object v0, p0, Lxu/e;->a:Lxu/m0;

    .line 23
    iput-object v0, v0, Lxu/m0;->g:Lxu/m0;

    .line 24
    iput-object v0, v0, Lxu/m0;->f:Lxu/m0;

    goto :goto_3

    .line 25
    :cond_4
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object v3, v3, Lxu/m0;->g:Lxu/m0;

    .line 26
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v3, v0}, Lxu/m0;->c(Lxu/m0;)Lxu/m0;

    move-result-object v0

    .line 27
    invoke-virtual {v0}, Lxu/m0;->a()V

    .line 28
    :goto_3
    invoke-virtual {p1}, Lxu/e;->size()J

    move-result-wide v3

    sub-long/2addr v3, v1

    invoke-virtual {p1, v3, v4}, Lxu/e;->U(J)V

    .line 29
    invoke-virtual {p0}, Lxu/e;->size()J

    move-result-wide v3

    add-long/2addr v3, v1

    invoke-virtual {p0, v3, v4}, Lxu/e;->U(J)V

    sub-long/2addr p2, v1

    goto/16 :goto_0

    :cond_5
    return-void

    .line 30
    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "source == this"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic writeByte(I)Lxu/f;
    .locals 0

    invoke-virtual {p0, p1}, Lxu/e;->i0(I)Lxu/e;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic writeInt(I)Lxu/f;
    .locals 0

    invoke-virtual {p0, p1}, Lxu/e;->t0(I)Lxu/e;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic writeShort(I)Lxu/f;
    .locals 0

    invoke-virtual {p0, p1}, Lxu/e;->z0(I)Lxu/e;

    move-result-object p1

    return-object p1
.end method

.method public x0(I)Lxu/e;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-static {p1}, Lxu/b;->h(I)I

    move-result p1

    invoke-virtual {p0, p1}, Lxu/e;->t0(I)Lxu/e;

    move-result-object p1

    return-object p1
.end method

.method public y0(J)Lxu/e;
    .locals 11
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lxu/e;->Z(I)Lxu/m0;

    move-result-object v1

    iget-object v2, v1, Lxu/m0;->a:[B

    iget v3, v1, Lxu/m0;->c:I

    add-int/lit8 v4, v3, 0x1

    const/16 v5, 0x38

    ushr-long v5, p1, v5

    const-wide/16 v7, 0xff

    and-long/2addr v5, v7

    long-to-int v5, v5

    int-to-byte v5, v5

    aput-byte v5, v2, v3

    add-int/lit8 v5, v3, 0x2

    const/16 v6, 0x30

    ushr-long v9, p1, v6

    and-long/2addr v9, v7

    long-to-int v6, v9

    int-to-byte v6, v6

    aput-byte v6, v2, v4

    add-int/lit8 v4, v3, 0x3

    const/16 v6, 0x28

    ushr-long v9, p1, v6

    and-long/2addr v9, v7

    long-to-int v6, v9

    int-to-byte v6, v6

    aput-byte v6, v2, v5

    add-int/lit8 v5, v3, 0x4

    const/16 v6, 0x20

    ushr-long v9, p1, v6

    and-long/2addr v9, v7

    long-to-int v6, v9

    int-to-byte v6, v6

    aput-byte v6, v2, v4

    add-int/lit8 v4, v3, 0x5

    const/16 v6, 0x18

    ushr-long v9, p1, v6

    and-long/2addr v9, v7

    long-to-int v6, v9

    int-to-byte v6, v6

    aput-byte v6, v2, v5

    add-int/lit8 v5, v3, 0x6

    const/16 v6, 0x10

    ushr-long v9, p1, v6

    and-long/2addr v9, v7

    long-to-int v6, v9

    int-to-byte v6, v6

    aput-byte v6, v2, v4

    add-int/lit8 v4, v3, 0x7

    ushr-long v9, p1, v0

    and-long/2addr v9, v7

    long-to-int v6, v9

    int-to-byte v6, v6

    aput-byte v6, v2, v5

    add-int/2addr v3, v0

    and-long/2addr p1, v7

    long-to-int p1, p1

    int-to-byte p1, p1

    aput-byte p1, v2, v4

    iput v3, v1, Lxu/m0;->c:I

    invoke-virtual {p0}, Lxu/e;->size()J

    move-result-wide p1

    const-wide/16 v0, 0x8

    add-long/2addr p1, v0

    invoke-virtual {p0, p1, p2}, Lxu/e;->U(J)V

    return-object p0
.end method

.method public z0(I)Lxu/e;
    .locals 6
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lxu/e;->Z(I)Lxu/m0;

    move-result-object v1

    iget-object v2, v1, Lxu/m0;->a:[B

    iget v3, v1, Lxu/m0;->c:I

    add-int/lit8 v4, v3, 0x1

    ushr-int/lit8 v5, p1, 0x8

    and-int/lit16 v5, v5, 0xff

    int-to-byte v5, v5

    aput-byte v5, v2, v3

    add-int/2addr v3, v0

    and-int/lit16 p1, p1, 0xff

    int-to-byte p1, p1

    aput-byte p1, v2, v4

    iput v3, v1, Lxu/m0;->c:I

    invoke-virtual {p0}, Lxu/e;->size()J

    move-result-wide v0

    const-wide/16 v2, 0x2

    add-long/2addr v0, v2

    invoke-virtual {p0, v0, v1}, Lxu/e;->U(J)V

    return-object p0
.end method

.method public bridge synthetic z1(J)Lxu/f;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lxu/e;->l0(J)Lxu/e;

    move-result-object p1

    return-object p1
.end method

.method public z2(Ljava/nio/charset/Charset;)Ljava/lang/String;
    .locals 2
    .param p1    # Ljava/nio/charset/Charset;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "charset"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-wide v0, p0, Lxu/e;->b:J

    invoke-virtual {p0, v0, v1, p1}, Lxu/e;->P(JLjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
