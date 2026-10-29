.class public final Lcom/google/crypto/tink/shaded/protobuf/a0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/crypto/tink/shaded/protobuf/a0$f;,
        Lcom/google/crypto/tink/shaded/protobuf/a0$b;,
        Lcom/google/crypto/tink/shaded/protobuf/a0$h;,
        Lcom/google/crypto/tink/shaded/protobuf/a0$a;,
        Lcom/google/crypto/tink/shaded/protobuf/a0$g;,
        Lcom/google/crypto/tink/shaded/protobuf/a0$i;,
        Lcom/google/crypto/tink/shaded/protobuf/a0$e;,
        Lcom/google/crypto/tink/shaded/protobuf/a0$d;,
        Lcom/google/crypto/tink/shaded/protobuf/a0$c;
    }
.end annotation


# static fields
.field public static final a:Ljava/nio/charset/Charset;

.field public static final b:Ljava/nio/charset/Charset;

.field public static final c:Ljava/nio/charset/Charset;

.field public static final d:[B

.field public static final e:Ljava/nio/ByteBuffer;

.field public static final f:Lcom/google/crypto/tink/shaded/protobuf/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "US-ASCII"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, Lcom/google/crypto/tink/shaded/protobuf/a0;->a:Ljava/nio/charset/Charset;

    const-string v0, "UTF-8"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, Lcom/google/crypto/tink/shaded/protobuf/a0;->b:Ljava/nio/charset/Charset;

    const-string v0, "ISO-8859-1"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, Lcom/google/crypto/tink/shaded/protobuf/a0;->c:Ljava/nio/charset/Charset;

    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lcom/google/crypto/tink/shaded/protobuf/a0;->d:[B

    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v1

    sput-object v1, Lcom/google/crypto/tink/shaded/protobuf/a0;->e:Ljava/nio/ByteBuffer;

    invoke-static {v0}, Lcom/google/crypto/tink/shaded/protobuf/i;->i([B)Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v0

    sput-object v0, Lcom/google/crypto/tink/shaded/protobuf/a0;->f:Lcom/google/crypto/tink/shaded/protobuf/i;

    return-void
.end method

.method public static a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)TT;"
        }
    .end annotation

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object p0
.end method

.method public static b(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Ljava/lang/String;",
            ")TT;"
        }
    .end annotation

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static c(Z)I
    .locals 0

    if-eqz p0, :cond_0

    const/16 p0, 0x4cf

    return p0

    :cond_0
    const/16 p0, 0x4d5

    return p0
.end method

.method public static d([B)I
    .locals 2

    const/4 v0, 0x0

    array-length v1, p0

    invoke-static {p0, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/a0;->e([BII)I

    move-result p0

    return p0
.end method

.method public static e([BII)I
    .locals 0

    invoke-static {p2, p0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/a0;->h(I[BII)I

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    :cond_0
    return p0
.end method

.method public static f(J)I
    .locals 2

    const/16 v0, 0x20

    ushr-long v0, p0, v0

    xor-long/2addr p0, v0

    long-to-int p0, p0

    return p0
.end method

.method public static g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p0, Lcom/google/crypto/tink/shaded/protobuf/s0;

    invoke-interface {p0}, Lcom/google/crypto/tink/shaded/protobuf/s0;->a()Lcom/google/crypto/tink/shaded/protobuf/s0$a;

    move-result-object p0

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/s0;

    invoke-interface {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/s0$a;->H(Lcom/google/crypto/tink/shaded/protobuf/s0;)Lcom/google/crypto/tink/shaded/protobuf/s0$a;

    move-result-object p0

    invoke-interface {p0}, Lcom/google/crypto/tink/shaded/protobuf/s0$a;->d()Lcom/google/crypto/tink/shaded/protobuf/s0;

    move-result-object p0

    return-object p0
.end method

.method public static h(I[BII)I
    .locals 2

    move v0, p2

    :goto_0
    add-int v1, p2, p3

    if-ge v0, v1, :cond_0

    mul-int/lit8 p0, p0, 0x1f

    aget-byte v1, p1, v0

    add-int/2addr p0, v1

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return p0
.end method
