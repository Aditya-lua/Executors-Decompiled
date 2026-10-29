.class public Lc4/a$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc4/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# instance fields
.field public final a:I

.field public final b:I

.field public final c:J

.field public final d:[B


# direct methods
.method public constructor <init>(IIJ[B)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lc4/a$d;->a:I

    .line 4
    iput p2, p0, Lc4/a$d;->b:I

    .line 5
    iput-wide p3, p0, Lc4/a$d;->c:J

    .line 6
    iput-object p5, p0, Lc4/a$d;->d:[B

    return-void
.end method

.method public constructor <init>(II[B)V
    .locals 6

    const-wide/16 v3, -0x1

    move-object v0, p0

    move v1, p1

    move v2, p2

    move-object v5, p3

    .line 1
    invoke-direct/range {v0 .. v5}, Lc4/a$d;-><init>(IIJ[B)V

    return-void
.end method

.method public static a(Ljava/lang/String;)Lc4/a$d;
    .locals 5

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x30

    if-lt v2, v3, :cond_0

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v4, 0x31

    if-gt v2, v4, :cond_0

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result p0

    sub-int/2addr p0, v3

    int-to-byte p0, p0

    new-array v2, v1, [B

    aput-byte p0, v2, v0

    new-instance p0, Lc4/a$d;

    invoke-direct {p0, v1, v1, v2}, Lc4/a$d;-><init>(II[B)V

    return-object p0

    :cond_0
    invoke-static {}, Lc4/a;->b()Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    new-instance v0, Lc4/a$d;

    array-length v2, p0

    invoke-direct {v0, v1, v2, p0}, Lc4/a$d;-><init>(II[B)V

    return-object v0
.end method

.method public static b([DLjava/nio/ByteOrder;)Lc4/a$d;
    .locals 5

    invoke-static {}, Lc4/a;->a()[I

    move-result-object v0

    const/16 v1, 0xc

    aget v0, v0, v1

    array-length v2, p0

    mul-int/2addr v0, v2

    new-array v0, v0, [B

    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    array-length p1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, p1, :cond_0

    aget-wide v3, p0, v2

    invoke-virtual {v0, v3, v4}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    new-instance p1, Lc4/a$d;

    array-length p0, p0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-direct {p1, v1, p0, v0}, Lc4/a$d;-><init>(II[B)V

    return-object p1
.end method

.method public static c([ILjava/nio/ByteOrder;)Lc4/a$d;
    .locals 4

    invoke-static {}, Lc4/a;->a()[I

    move-result-object v0

    const/16 v1, 0x9

    aget v0, v0, v1

    array-length v2, p0

    mul-int/2addr v0, v2

    new-array v0, v0, [B

    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    array-length p1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, p1, :cond_0

    aget v3, p0, v2

    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    new-instance p1, Lc4/a$d;

    array-length p0, p0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-direct {p1, v1, p0, v0}, Lc4/a$d;-><init>(II[B)V

    return-object p1
.end method

.method public static d([Lc4/a$f;Ljava/nio/ByteOrder;)Lc4/a$d;
    .locals 6

    invoke-static {}, Lc4/a;->a()[I

    move-result-object v0

    const/16 v1, 0xa

    aget v0, v0, v1

    array-length v2, p0

    mul-int/2addr v0, v2

    new-array v0, v0, [B

    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    array-length p1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, p1, :cond_0

    aget-object v3, p0, v2

    iget-wide v4, v3, Lc4/a$f;->a:J

    long-to-int v4, v4

    invoke-virtual {v0, v4}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    iget-wide v3, v3, Lc4/a$f;->b:J

    long-to-int v3, v3

    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    new-instance p1, Lc4/a$d;

    array-length p0, p0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-direct {p1, v1, p0, v0}, Lc4/a$d;-><init>(II[B)V

    return-object p1
.end method

.method public static e(Ljava/lang/String;)Lc4/a$d;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 p0, 0x0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {}, Lc4/a;->b()Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    new-instance v0, Lc4/a$d;

    const/4 v1, 0x2

    array-length v2, p0

    invoke-direct {v0, v1, v2, p0}, Lc4/a$d;-><init>(II[B)V

    return-object v0
.end method

.method public static f(JLjava/nio/ByteOrder;)Lc4/a$d;
    .locals 2

    const/4 v0, 0x1

    new-array v0, v0, [J

    const/4 v1, 0x0

    aput-wide p0, v0, v1

    invoke-static {v0, p2}, Lc4/a$d;->g([JLjava/nio/ByteOrder;)Lc4/a$d;

    move-result-object p0

    return-object p0
.end method

.method public static g([JLjava/nio/ByteOrder;)Lc4/a$d;
    .locals 5

    invoke-static {}, Lc4/a;->a()[I

    move-result-object v0

    const/4 v1, 0x4

    aget v0, v0, v1

    array-length v2, p0

    mul-int/2addr v0, v2

    new-array v0, v0, [B

    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    array-length p1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, p1, :cond_0

    aget-wide v3, p0, v2

    long-to-int v3, v3

    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    new-instance p1, Lc4/a$d;

    array-length p0, p0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-direct {p1, v1, p0, v0}, Lc4/a$d;-><init>(II[B)V

    return-object p1
.end method

.method public static h(Lc4/a$f;Ljava/nio/ByteOrder;)Lc4/a$d;
    .locals 0

    filled-new-array {p0}, [Lc4/a$f;

    move-result-object p0

    invoke-static {p0, p1}, Lc4/a$d;->i([Lc4/a$f;Ljava/nio/ByteOrder;)Lc4/a$d;

    move-result-object p0

    return-object p0
.end method

.method public static i([Lc4/a$f;Ljava/nio/ByteOrder;)Lc4/a$d;
    .locals 6

    invoke-static {}, Lc4/a;->a()[I

    move-result-object v0

    const/4 v1, 0x5

    aget v0, v0, v1

    array-length v2, p0

    mul-int/2addr v0, v2

    new-array v0, v0, [B

    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    array-length p1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, p1, :cond_0

    aget-object v3, p0, v2

    iget-wide v4, v3, Lc4/a$f;->a:J

    long-to-int v4, v4

    invoke-virtual {v0, v4}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    iget-wide v3, v3, Lc4/a$f;->b:J

    long-to-int v3, v3

    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    new-instance p1, Lc4/a$d;

    array-length p0, p0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-direct {p1, v1, p0, v0}, Lc4/a$d;-><init>(II[B)V

    return-object p1
.end method

.method public static j(ILjava/nio/ByteOrder;)Lc4/a$d;
    .locals 0

    filled-new-array {p0}, [I

    move-result-object p0

    invoke-static {p0, p1}, Lc4/a$d;->k([ILjava/nio/ByteOrder;)Lc4/a$d;

    move-result-object p0

    return-object p0
.end method

.method public static k([ILjava/nio/ByteOrder;)Lc4/a$d;
    .locals 4

    invoke-static {}, Lc4/a;->a()[I

    move-result-object v0

    const/4 v1, 0x3

    aget v0, v0, v1

    array-length v2, p0

    mul-int/2addr v0, v2

    new-array v0, v0, [B

    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    array-length p1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, p1, :cond_0

    aget v3, p0, v2

    int-to-short v3, v3

    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    new-instance p1, Lc4/a$d;

    array-length p0, p0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-direct {p1, v1, p0, v0}, Lc4/a$d;-><init>(II[B)V

    return-object p1
.end method


# virtual methods
.method public l(Ljava/nio/ByteOrder;)D
    .locals 4

    invoke-virtual {p0, p1}, Lc4/a$d;->o(Ljava/nio/ByteOrder;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_9

    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    return-wide v0

    :cond_0
    instance-of v0, p1, [J

    const-string v1, "There are more than one component"

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v0, :cond_2

    check-cast p1, [J

    array-length v0, p1

    if-ne v0, v3, :cond_1

    aget-wide v0, p1, v2

    long-to-double v0, v0

    return-wide v0

    :cond_1
    new-instance p1, Ljava/lang/NumberFormatException;

    invoke-direct {p1, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    instance-of v0, p1, [I

    if-eqz v0, :cond_4

    check-cast p1, [I

    array-length v0, p1

    if-ne v0, v3, :cond_3

    aget p1, p1, v2

    int-to-double v0, p1

    return-wide v0

    :cond_3
    new-instance p1, Ljava/lang/NumberFormatException;

    invoke-direct {p1, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    instance-of v0, p1, [D

    if-eqz v0, :cond_6

    check-cast p1, [D

    array-length v0, p1

    if-ne v0, v3, :cond_5

    aget-wide v0, p1, v2

    return-wide v0

    :cond_5
    new-instance p1, Ljava/lang/NumberFormatException;

    invoke-direct {p1, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    instance-of v0, p1, [Lc4/a$f;

    if-eqz v0, :cond_8

    check-cast p1, [Lc4/a$f;

    array-length v0, p1

    if-ne v0, v3, :cond_7

    aget-object p1, p1, v2

    invoke-virtual {p1}, Lc4/a$f;->a()D

    move-result-wide v0

    return-wide v0

    :cond_7
    new-instance p1, Ljava/lang/NumberFormatException;

    invoke-direct {p1, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    new-instance p1, Ljava/lang/NumberFormatException;

    const-string v0, "Couldn\'t find a double value"

    invoke-direct {p1, v0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    new-instance p1, Ljava/lang/NumberFormatException;

    const-string v0, "NULL can\'t be converted to a double value"

    invoke-direct {p1, v0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public m(Ljava/nio/ByteOrder;)I
    .locals 4

    invoke-virtual {p0, p1}, Lc4/a$d;->o(Ljava/nio/ByteOrder;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_5

    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    return p1

    :cond_0
    instance-of v0, p1, [J

    const-string v1, "There are more than one component"

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v0, :cond_2

    check-cast p1, [J

    array-length v0, p1

    if-ne v0, v3, :cond_1

    aget-wide v0, p1, v2

    long-to-int p1, v0

    return p1

    :cond_1
    new-instance p1, Ljava/lang/NumberFormatException;

    invoke-direct {p1, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    instance-of v0, p1, [I

    if-eqz v0, :cond_4

    check-cast p1, [I

    array-length v0, p1

    if-ne v0, v3, :cond_3

    aget p1, p1, v2

    return p1

    :cond_3
    new-instance p1, Ljava/lang/NumberFormatException;

    invoke-direct {p1, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Ljava/lang/NumberFormatException;

    const-string v0, "Couldn\'t find a integer value"

    invoke-direct {p1, v0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance p1, Ljava/lang/NumberFormatException;

    const-string v0, "NULL can\'t be converted to a integer value"

    invoke-direct {p1, v0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public n(Ljava/nio/ByteOrder;)Ljava/lang/String;
    .locals 7

    invoke-virtual {p0, p1}, Lc4/a$d;->o(Ljava/nio/ByteOrder;)Ljava/lang/Object;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    instance-of v1, p1, Ljava/lang/String;

    if-eqz v1, :cond_1

    check-cast p1, Ljava/lang/String;

    return-object p1

    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    instance-of v2, p1, [J

    const-string v3, ","

    const/4 v4, 0x0

    if-eqz v2, :cond_4

    check-cast p1, [J

    :cond_2
    :goto_0
    array-length v0, p1

    if-ge v4, v0, :cond_3

    aget-wide v5, p1, v4

    invoke-virtual {v1, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    add-int/lit8 v4, v4, 0x1

    array-length v0, p1

    if-eq v4, v0, :cond_2

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_3
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_4
    instance-of v2, p1, [I

    if-eqz v2, :cond_7

    check-cast p1, [I

    :cond_5
    :goto_1
    array-length v0, p1

    if-ge v4, v0, :cond_6

    aget v0, p1, v4

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    add-int/lit8 v4, v4, 0x1

    array-length v0, p1

    if-eq v4, v0, :cond_5

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_6
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_7
    instance-of v2, p1, [D

    if-eqz v2, :cond_a

    check-cast p1, [D

    :cond_8
    :goto_2
    array-length v0, p1

    if-ge v4, v0, :cond_9

    aget-wide v5, p1, v4

    invoke-virtual {v1, v5, v6}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    add-int/lit8 v4, v4, 0x1

    array-length v0, p1

    if-eq v4, v0, :cond_8

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_9
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_a
    instance-of v2, p1, [Lc4/a$f;

    if-eqz v2, :cond_d

    check-cast p1, [Lc4/a$f;

    :cond_b
    :goto_3
    array-length v0, p1

    if-ge v4, v0, :cond_c

    aget-object v0, p1, v4

    iget-wide v5, v0, Lc4/a$f;->a:J

    invoke-virtual {v1, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v0, 0x2f

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    aget-object v0, p1, v4

    iget-wide v5, v0, Lc4/a$f;->b:J

    invoke-virtual {v1, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    add-int/lit8 v4, v4, 0x1

    array-length v0, p1

    if-eq v4, v0, :cond_b

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    :cond_c
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_d
    return-object v0
.end method

.method public o(Ljava/nio/ByteOrder;)Ljava/lang/Object;
    .locals 12

    const-string v1, "IOException occurred while closing InputStream"

    const-string v2, "ExifInterface"

    const/4 v3, 0x0

    :try_start_0
    new-instance v4, Lc4/a$b;

    iget-object v0, p0, Lc4/a$d;->d:[B

    invoke-direct {v4, v0}, Lc4/a$b;-><init>([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_4
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-virtual {v4, p1}, Lc4/a$b;->e(Ljava/nio/ByteOrder;)V

    iget p1, p0, Lc4/a$d;->a:I
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v0, 0x0

    packed-switch p1, :pswitch_data_0

    :try_start_2
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    return-object v3

    :catch_0
    move-exception v0

    move-object p1, v0

    invoke-static {v2, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-object v3

    :pswitch_0
    :try_start_3
    iget p1, p0, Lc4/a$d;->b:I

    new-array p1, p1, [D

    :goto_0
    iget v5, p0, Lc4/a$d;->b:I

    if-ge v0, v5, :cond_0

    invoke-virtual {v4}, Lc4/a$b;->readDouble()D

    move-result-wide v5

    aput-wide v5, p1, v0
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    move-object v3, v4

    goto/16 :goto_10

    :catch_1
    move-exception v0

    move-object p1, v0

    goto/16 :goto_e

    :cond_0
    :goto_1
    :try_start_4
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    return-object p1

    :catch_2
    move-exception v0

    invoke-static {v2, v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-object p1

    :pswitch_1
    :try_start_5
    iget p1, p0, Lc4/a$d;->b:I

    new-array p1, p1, [D

    :goto_2
    iget v5, p0, Lc4/a$d;->b:I

    if-ge v0, v5, :cond_0

    invoke-virtual {v4}, Lc4/a$b;->readFloat()F

    move-result v5

    float-to-double v5, v5

    aput-wide v5, p1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :pswitch_2
    iget p1, p0, Lc4/a$d;->b:I

    new-array p1, p1, [Lc4/a$f;

    :goto_3
    iget v5, p0, Lc4/a$d;->b:I

    if-ge v0, v5, :cond_0

    invoke-virtual {v4}, Lc4/a$b;->readInt()I

    move-result v5

    int-to-long v7, v5

    invoke-virtual {v4}, Lc4/a$b;->readInt()I

    move-result v5

    int-to-long v9, v5

    new-instance v6, Lc4/a$f;

    const/4 v11, 0x0

    invoke-direct/range {v6 .. v11}, Lc4/a$f;-><init>(JJLc4/a$a;)V

    aput-object v6, p1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :pswitch_3
    iget p1, p0, Lc4/a$d;->b:I

    new-array p1, p1, [I

    :goto_4
    iget v5, p0, Lc4/a$d;->b:I

    if-ge v0, v5, :cond_0

    invoke-virtual {v4}, Lc4/a$b;->readInt()I

    move-result v5

    aput v5, p1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    :pswitch_4
    iget p1, p0, Lc4/a$d;->b:I

    new-array p1, p1, [I

    :goto_5
    iget v5, p0, Lc4/a$d;->b:I

    if-ge v0, v5, :cond_0

    invoke-virtual {v4}, Lc4/a$b;->readShort()S

    move-result v5

    aput v5, p1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_5

    :pswitch_5
    iget p1, p0, Lc4/a$d;->b:I

    new-array p1, p1, [Lc4/a$f;

    :goto_6
    iget v5, p0, Lc4/a$d;->b:I

    if-ge v0, v5, :cond_0

    invoke-virtual {v4}, Lc4/a$b;->d()J

    move-result-wide v7

    invoke-virtual {v4}, Lc4/a$b;->d()J

    move-result-wide v9

    new-instance v6, Lc4/a$f;

    const/4 v11, 0x0

    invoke-direct/range {v6 .. v11}, Lc4/a$f;-><init>(JJLc4/a$a;)V

    aput-object v6, p1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_6

    :pswitch_6
    iget p1, p0, Lc4/a$d;->b:I

    new-array p1, p1, [J

    :goto_7
    iget v5, p0, Lc4/a$d;->b:I

    if-ge v0, v5, :cond_0

    invoke-virtual {v4}, Lc4/a$b;->d()J

    move-result-wide v5

    aput-wide v5, p1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_7

    :pswitch_7
    iget p1, p0, Lc4/a$d;->b:I

    new-array p1, p1, [I

    :goto_8
    iget v5, p0, Lc4/a$d;->b:I

    if-ge v0, v5, :cond_0

    invoke-virtual {v4}, Lc4/a$b;->readUnsignedShort()I

    move-result v5

    aput v5, p1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_8

    :pswitch_8
    iget p1, p0, Lc4/a$d;->b:I

    invoke-static {}, Lc4/a;->d()[B

    move-result-object v5

    array-length v5, v5

    if-lt p1, v5, :cond_3

    move p1, v0

    :goto_9
    invoke-static {}, Lc4/a;->d()[B

    move-result-object v5

    array-length v5, v5

    if-ge p1, v5, :cond_2

    iget-object v5, p0, Lc4/a$d;->d:[B

    aget-byte v5, v5, p1

    invoke-static {}, Lc4/a;->d()[B

    move-result-object v6

    aget-byte v6, v6, p1

    if-eq v5, v6, :cond_1

    goto :goto_a

    :cond_1
    add-int/lit8 p1, p1, 0x1

    goto :goto_9

    :cond_2
    invoke-static {}, Lc4/a;->d()[B

    move-result-object p1

    array-length v0, p1

    :cond_3
    :goto_a
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    :goto_b
    iget v5, p0, Lc4/a$d;->b:I

    if-ge v0, v5, :cond_6

    iget-object v5, p0, Lc4/a$d;->d:[B

    aget-byte v5, v5, v0

    if-nez v5, :cond_4

    goto :goto_d

    :cond_4
    const/16 v6, 0x20

    if-lt v5, v6, :cond_5

    int-to-char v5, v5

    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_c

    :cond_5
    const/16 v5, 0x3f

    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_c
    add-int/lit8 v0, v0, 0x1

    goto :goto_b

    :cond_6
    :goto_d
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto/16 :goto_1

    :pswitch_9
    iget-object p1, p0, Lc4/a$d;->d:[B

    array-length v5, p1

    const/4 v6, 0x1

    if-ne v5, v6, :cond_7

    aget-byte v5, p1, v0

    if-ltz v5, :cond_7

    if-gt v5, v6, :cond_7

    new-instance p1, Ljava/lang/String;

    add-int/lit8 v5, v5, 0x30

    int-to-char v5, v5

    new-array v6, v6, [C

    aput-char v5, v6, v0

    invoke-direct {p1, v6}, Ljava/lang/String;-><init>([C)V

    goto/16 :goto_1

    :cond_7
    new-instance v5, Ljava/lang/String;

    invoke-static {}, Lc4/a;->b()Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-direct {v5, p1, v0}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :try_start_6
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_3

    return-object v5

    :catch_3
    move-exception v0

    move-object p1, v0

    invoke-static {v2, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-object v5

    :catchall_1
    move-exception v0

    move-object p1, v0

    goto :goto_10

    :catch_4
    move-exception v0

    move-object p1, v0

    move-object v4, v3

    :goto_e
    :try_start_7
    const-string v0, "IOException occurred during reading a value"

    invoke-static {v2, v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    if-eqz v4, :cond_8

    :try_start_8
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_5

    goto :goto_f

    :catch_5
    move-exception v0

    move-object p1, v0

    invoke-static {v2, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_8
    :goto_f
    return-object v3

    :goto_10
    if-eqz v3, :cond_9

    :try_start_9
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_6

    goto :goto_11

    :catch_6
    move-exception v0

    invoke-static {v2, v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_9
    :goto_11
    throw p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_9
        :pswitch_8
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public p()I
    .locals 2

    invoke-static {}, Lc4/a;->a()[I

    move-result-object v0

    iget v1, p0, Lc4/a$d;->a:I

    aget v0, v0, v1

    iget v1, p0, Lc4/a$d;->b:I

    mul-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lc4/a;->c()[Ljava/lang/String;

    move-result-object v1

    iget v2, p0, Lc4/a$d;->a:I

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", data length:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lc4/a$d;->d:[B

    array-length v1, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
