.class public abstract Lcom/google/crypto/tink/shaded/protobuf/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/crypto/tink/shaded/protobuf/h$e;,
        Lcom/google/crypto/tink/shaded/protobuf/h$j;,
        Lcom/google/crypto/tink/shaded/protobuf/h$h;,
        Lcom/google/crypto/tink/shaded/protobuf/h$i;,
        Lcom/google/crypto/tink/shaded/protobuf/h$c;,
        Lcom/google/crypto/tink/shaded/protobuf/h$g;,
        Lcom/google/crypto/tink/shaded/protobuf/h$d;,
        Lcom/google/crypto/tink/shaded/protobuf/h$k;,
        Lcom/google/crypto/tink/shaded/protobuf/h$f;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Iterable<",
        "Ljava/lang/Byte;",
        ">;",
        "Ljava/io/Serializable;"
    }
.end annotation


# static fields
.field public static final b:Lcom/google/crypto/tink/shaded/protobuf/h;

.field public static final c:Lcom/google/crypto/tink/shaded/protobuf/h$f;

.field public static final d:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Lcom/google/crypto/tink/shaded/protobuf/h;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public a:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/h$j;

    sget-object v1, Lcom/google/crypto/tink/shaded/protobuf/a0;->d:[B

    invoke-direct {v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/h$j;-><init>([B)V

    sput-object v0, Lcom/google/crypto/tink/shaded/protobuf/h;->b:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/d;->c()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/h$k;

    invoke-direct {v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/h$k;-><init>(Lcom/google/crypto/tink/shaded/protobuf/h$a;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/h$d;

    invoke-direct {v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/h$d;-><init>(Lcom/google/crypto/tink/shaded/protobuf/h$a;)V

    :goto_0
    sput-object v0, Lcom/google/crypto/tink/shaded/protobuf/h;->c:Lcom/google/crypto/tink/shaded/protobuf/h$f;

    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/h$b;

    invoke-direct {v0}, Lcom/google/crypto/tink/shaded/protobuf/h$b;-><init>()V

    sput-object v0, Lcom/google/crypto/tink/shaded/protobuf/h;->d:Ljava/util/Comparator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/crypto/tink/shaded/protobuf/h;->a:I

    return-void
.end method

.method public static A([B)Lcom/google/crypto/tink/shaded/protobuf/h;
    .locals 1

    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/h$j;

    invoke-direct {v0, p0}, Lcom/google/crypto/tink/shaded/protobuf/h$j;-><init>([B)V

    return-object v0
.end method

.method public static B([BII)Lcom/google/crypto/tink/shaded/protobuf/h;
    .locals 1

    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/h$e;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/h$e;-><init>([BII)V

    return-object v0
.end method

.method public static synthetic a(B)I
    .locals 0

    invoke-static {p0}, Lcom/google/crypto/tink/shaded/protobuf/h;->y(B)I

    move-result p0

    return p0
.end method

.method public static c(II)V
    .locals 3

    add-int/lit8 v0, p0, 0x1

    sub-int v0, p1, v0

    or-int/2addr v0, p0

    if-gez v0, :cond_1

    if-gez p0, :cond_0

    new-instance p1, Ljava/lang/ArrayIndexOutOfBoundsException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Index < 0: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Index > length: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ", "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    return-void
.end method

.method public static d(III)I
    .locals 3

    sub-int v0, p1, p0

    or-int v1, p0, p1

    or-int/2addr v1, v0

    sub-int v2, p2, p1

    or-int/2addr v1, v2

    if-gez v1, :cond_2

    if-ltz p0, :cond_1

    if-ge p1, p0, :cond_0

    new-instance p2, Ljava/lang/IndexOutOfBoundsException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Beginning index larger than ending index: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ", "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p2, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_0
    new-instance p0, Ljava/lang/IndexOutOfBoundsException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "End index: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " >= "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Beginning index: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, " < 0"

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    return v0
.end method

.method public static e([B)Lcom/google/crypto/tink/shaded/protobuf/h;
    .locals 2

    const/4 v0, 0x0

    array-length v1, p0

    invoke-static {p0, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/h;->f([BII)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p0

    return-object p0
.end method

.method public static f([BII)Lcom/google/crypto/tink/shaded/protobuf/h;
    .locals 2

    add-int v0, p1, p2

    array-length v1, p0

    invoke-static {p1, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/h;->d(III)I

    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/h$j;

    sget-object v1, Lcom/google/crypto/tink/shaded/protobuf/h;->c:Lcom/google/crypto/tink/shaded/protobuf/h$f;

    invoke-interface {v1, p0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/h$f;->a([BII)[B

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/google/crypto/tink/shaded/protobuf/h$j;-><init>([B)V

    return-object v0
.end method

.method public static g(Ljava/lang/String;)Lcom/google/crypto/tink/shaded/protobuf/h;
    .locals 2

    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/h$j;

    sget-object v1, Lcom/google/crypto/tink/shaded/protobuf/a0;->b:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/google/crypto/tink/shaded/protobuf/h$j;-><init>([B)V

    return-object v0
.end method

.method public static l(I)Lcom/google/crypto/tink/shaded/protobuf/h$h;
    .locals 2

    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/h$h;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/crypto/tink/shaded/protobuf/h$h;-><init>(ILcom/google/crypto/tink/shaded/protobuf/h$a;)V

    return-object v0
.end method

.method public static y(B)I
    .locals 0

    and-int/lit16 p0, p0, 0xff

    return p0
.end method


# virtual methods
.method public abstract C(Lcom/google/crypto/tink/shaded/protobuf/g;)V
.end method

.method public abstract b(I)B
.end method

.method public abstract equals(Ljava/lang/Object;)Z
.end method

.method public abstract h([BIII)V
.end method

.method public final hashCode()I
    .locals 2

    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/h;->a:I

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/h;->size()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->p(III)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :cond_0
    iput v0, p0, Lcom/google/crypto/tink/shaded/protobuf/h;->a:I

    :cond_1
    return v0
.end method

.method public abstract i(I)B
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/h;->k()Lcom/google/crypto/tink/shaded/protobuf/h$g;

    move-result-object v0

    return-object v0
.end method

.method public k()Lcom/google/crypto/tink/shaded/protobuf/h$g;
    .locals 1

    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/h$a;

    invoke-direct {v0, p0}, Lcom/google/crypto/tink/shaded/protobuf/h$a;-><init>(Lcom/google/crypto/tink/shaded/protobuf/h;)V

    return-object v0
.end method

.method public abstract m()Lcom/google/crypto/tink/shaded/protobuf/i;
.end method

.method public abstract p(III)I
.end method

.method public abstract size()I
.end method

.method public final t()I
    .locals 1

    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/h;->a:I

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/h;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/h;->z()Ljava/lang/String;

    move-result-object v3

    filled-new-array {v1, v2, v3}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "<ByteString@%s size=%d contents=\"%s\">"

    invoke-static {v0, v2, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public abstract u(II)Lcom/google/crypto/tink/shaded/protobuf/h;
.end method

.method public final x()[B
    .locals 3

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/h;->size()I

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/a0;->d:[B

    return-object v0

    :cond_0
    new-array v1, v0, [B

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2, v2, v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->h([BIII)V

    return-object v1
.end method

.method public final z()Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/h;->size()I

    move-result v0

    const/16 v1, 0x32

    if-gt v0, v1, :cond_0

    invoke-static {p0}, Lcom/google/crypto/tink/shaded/protobuf/l1;->a(Lcom/google/crypto/tink/shaded/protobuf/h;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    const/16 v2, 0x2f

    invoke-virtual {p0, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/h;->u(II)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-static {v1}, Lcom/google/crypto/tink/shaded/protobuf/l1;->a(Lcom/google/crypto/tink/shaded/protobuf/h;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "..."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
