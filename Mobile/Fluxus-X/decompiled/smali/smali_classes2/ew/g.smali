.class public interface abstract Lew/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lew/l0;
.implements Ljava/nio/channels/ReadableByteChannel;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0005\n\u0002\u0008\u0002\n\u0002\u0010\n\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0012\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\u0008v\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H\'\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H&\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H&\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H&\u00a2\u0006\u0004\u0008\u0016\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u0017H&\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H&\u00a2\u0006\u0004\u0008\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\tH&\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\tH&\u00a2\u0006\u0004\u0008\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\tH&\u00a2\u0006\u0004\u0008\u001e\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&\u00a2\u0006\u0004\u0008\u001f\u0010\rJ\u000f\u0010!\u001a\u00020 H&\u00a2\u0006\u0004\u0008!\u0010\"J\u0017\u0010#\u001a\u00020 2\u0006\u0010\n\u001a\u00020\tH&\u00a2\u0006\u0004\u0008#\u0010$J\u0017\u0010\'\u001a\u00020\u00172\u0006\u0010&\u001a\u00020%H&\u00a2\u0006\u0004\u0008\'\u0010(J\u000f\u0010*\u001a\u00020)H&\u00a2\u0006\u0004\u0008*\u0010+J\u0017\u0010.\u001a\u00020\t2\u0006\u0010-\u001a\u00020,H&\u00a2\u0006\u0004\u0008.\u0010/J\u000f\u00101\u001a\u000200H&\u00a2\u0006\u0004\u00081\u00102J\u0017\u00103\u001a\u0002002\u0006\u0010\n\u001a\u00020\tH&\u00a2\u0006\u0004\u00083\u00104J\u000f\u00105\u001a\u000200H&\u00a2\u0006\u0004\u00085\u00102J\u0017\u00107\u001a\u0002002\u0006\u00106\u001a\u00020\tH&\u00a2\u0006\u0004\u00087\u00104J\u000f\u00108\u001a\u00020\u0017H&\u00a2\u0006\u0004\u00088\u0010\u0019J\u0017\u0010;\u001a\u0002002\u0006\u0010:\u001a\u000209H&\u00a2\u0006\u0004\u0008;\u0010<J\u0017\u0010>\u001a\u00020\t2\u0006\u0010=\u001a\u00020 H&\u00a2\u0006\u0004\u0008>\u0010?J\'\u0010B\u001a\u00020\t2\u0006\u0010=\u001a\u00020 2\u0006\u0010@\u001a\u00020\t2\u0006\u0010A\u001a\u00020\tH&\u00a2\u0006\u0004\u0008B\u0010CJ\u0017\u0010E\u001a\u00020\t2\u0006\u0010D\u001a\u00020 H&\u00a2\u0006\u0004\u0008E\u0010?J\u001f\u0010G\u001a\u00020\u00062\u0006\u0010F\u001a\u00020\t2\u0006\u0010=\u001a\u00020 H&\u00a2\u0006\u0004\u0008G\u0010HJ\u000f\u0010I\u001a\u00020\u0000H&\u00a2\u0006\u0004\u0008I\u0010JJ\u000f\u0010L\u001a\u00020KH&\u00a2\u0006\u0004\u0008L\u0010MR\u0014\u0010O\u001a\u00020\u00038&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008N\u0010\u0005\u0082\u0001\u0002\u0003P\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006Q\u00c0\u0006\u0001"
    }
    d2 = {
        "Lew/g;",
        "Lew/l0;",
        "Ljava/nio/channels/ReadableByteChannel;",
        "Lew/e;",
        "S",
        "()Lew/e;",
        "",
        "c2",
        "()Z",
        "",
        "byteCount",
        "",
        "w1",
        "(J)V",
        "request",
        "(J)Z",
        "",
        "readByte",
        "()B",
        "",
        "readShort",
        "()S",
        "j1",
        "",
        "readInt",
        "()I",
        "P2",
        "m1",
        "()J",
        "l2",
        "t3",
        "skip",
        "Lew/h;",
        "J2",
        "()Lew/h;",
        "M1",
        "(J)Lew/h;",
        "Lew/z;",
        "options",
        "J1",
        "(Lew/z;)I",
        "",
        "a2",
        "()[B",
        "Lew/j0;",
        "sink",
        "a0",
        "(Lew/j0;)J",
        "",
        "V2",
        "()Ljava/lang/String;",
        "G1",
        "(J)Ljava/lang/String;",
        "b1",
        "limit",
        "p0",
        "E2",
        "Ljava/nio/charset/Charset;",
        "charset",
        "C2",
        "(Ljava/nio/charset/Charset;)Ljava/lang/String;",
        "bytes",
        "i1",
        "(Lew/h;)J",
        "fromIndex",
        "toIndex",
        "K1",
        "(Lew/h;JJ)J",
        "targetBytes",
        "B2",
        "offset",
        "V1",
        "(JLew/h;)Z",
        "peek",
        "()Lew/g;",
        "Ljava/io/InputStream;",
        "x3",
        "()Ljava/io/InputStream;",
        "l",
        "buffer",
        "Lew/f0;",
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


# virtual methods
.method public abstract B2(Lew/h;)J
    .param p1    # Lew/h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract C2(Ljava/nio/charset/Charset;)Ljava/lang/String;
    .param p1    # Ljava/nio/charset/Charset;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract E2()I
.end method

.method public abstract G1(J)Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract J1(Lew/z;)I
    .param p1    # Lew/z;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract J2()Lew/h;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract K1(Lew/h;JJ)J
    .param p1    # Lew/h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract M1(J)Lew/h;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract P2()I
.end method

.method public abstract S()Lew/e;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract V1(JLew/h;)Z
    .param p3    # Lew/h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract V2()Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract a0(Lew/j0;)J
    .param p1    # Lew/j0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract a2()[B
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract b1()Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract c2()Z
.end method

.method public abstract i1(Lew/h;)J
    .param p1    # Lew/h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract j1()S
.end method

.method public abstract l()Lew/e;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract l2()J
.end method

.method public abstract m1()J
.end method

.method public abstract p0(J)Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract peek()Lew/g;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract readByte()B
.end method

.method public abstract readInt()I
.end method

.method public abstract readShort()S
.end method

.method public abstract request(J)Z
.end method

.method public abstract skip(J)V
.end method

.method public abstract t3()J
.end method

.method public abstract w1(J)V
.end method

.method public abstract x3()Ljava/io/InputStream;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method
