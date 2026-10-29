.class public final Lrg/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[I

.field public static final b:Ljava/nio/charset/Charset;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x60

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lrg/c;->a:[I

    sget-object v0, Ljava/nio/charset/StandardCharsets;->ISO_8859_1:Ljava/nio/charset/Charset;

    sput-object v0, Lrg/c;->b:Ljava/nio/charset/Charset;

    return-void

    :array_0
    .array-data 4
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        0x24
        -0x1
        -0x1
        -0x1
        0x25
        0x26
        -0x1
        -0x1
        -0x1
        -0x1
        0x27
        0x28
        -0x1
        0x29
        0x2a
        0x2b
        0x0
        0x1
        0x2
        0x3
        0x4
        0x5
        0x6
        0x7
        0x8
        0x9
        0x2c
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        0xa
        0xb
        0xc
        0xd
        0xe
        0xf
        0x10
        0x11
        0x12
        0x13
        0x14
        0x15
        0x16
        0x17
        0x18
        0x19
        0x1a
        0x1b
        0x1c
        0x1d
        0x1e
        0x1f
        0x20
        0x21
        0x22
        0x23
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
    .end array-data
.end method

.method public static a(Ljava/lang/String;Lng/a;Ljava/nio/charset/Charset;)V
    .locals 3

    invoke-virtual {p0, p2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    array-length p2, p0

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p2, :cond_0

    aget-byte v1, p0, v0

    const/16 v2, 0x8

    invoke-virtual {p1, v1, v2}, Lng/a;->c(II)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static b(Ljava/lang/CharSequence;Lng/a;)V
    .locals 5

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_3

    invoke-interface {p0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    invoke-static {v2}, Lrg/c;->p(I)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_2

    add-int/lit8 v4, v1, 0x1

    if-ge v4, v0, :cond_1

    invoke-interface {p0, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    invoke-static {v4}, Lrg/c;->p(I)I

    move-result v4

    if-eq v4, v3, :cond_0

    mul-int/lit8 v2, v2, 0x2d

    add-int/2addr v2, v4

    const/16 v3, 0xb

    invoke-virtual {p1, v2, v3}, Lng/a;->c(II)V

    add-int/lit8 v1, v1, 0x2

    goto :goto_0

    :cond_0
    new-instance p0, Lmg/c;

    invoke-direct {p0}, Lmg/c;-><init>()V

    throw p0

    :cond_1
    const/4 v1, 0x6

    invoke-virtual {p1, v2, v1}, Lng/a;->c(II)V

    move v1, v4

    goto :goto_0

    :cond_2
    new-instance p0, Lmg/c;

    invoke-direct {p0}, Lmg/c;-><init>()V

    throw p0

    :cond_3
    return-void
.end method

.method public static c(Ljava/lang/String;Lqg/b;Lng/a;Ljava/nio/charset/Charset;)V
    .locals 2

    sget-object v0, Lrg/c$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 p3, 0x4

    if-ne v0, p3, :cond_0

    invoke-static {p0, p2}, Lrg/c;->e(Ljava/lang/String;Lng/a;)V

    return-void

    :cond_0
    new-instance p0, Lmg/c;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Invalid mode: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lmg/c;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    invoke-static {p0, p2, p3}, Lrg/c;->a(Ljava/lang/String;Lng/a;Ljava/nio/charset/Charset;)V

    return-void

    :cond_2
    invoke-static {p0, p2}, Lrg/c;->b(Ljava/lang/CharSequence;Lng/a;)V

    return-void

    :cond_3
    invoke-static {p0, p2}, Lrg/c;->h(Ljava/lang/CharSequence;Lng/a;)V

    return-void
.end method

.method public static d(Lng/c;Lng/a;)V
    .locals 2

    sget-object v0, Lqg/b;->h:Lqg/b;

    invoke-virtual {v0}, Lqg/b;->a()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {p1, v0, v1}, Lng/a;->c(II)V

    invoke-virtual {p0}, Lng/c;->c()I

    move-result p0

    const/16 v0, 0x8

    invoke-virtual {p1, p0, v0}, Lng/a;->c(II)V

    return-void
.end method

.method public static e(Ljava/lang/String;Lng/a;)V
    .locals 6

    sget-object v0, Lng/e;->b:Ljava/nio/charset/Charset;

    if-eqz v0, :cond_5

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    array-length v0, p0

    rem-int/lit8 v0, v0, 0x2

    if-nez v0, :cond_4

    array-length v0, p0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_3

    aget-byte v2, p0, v1

    and-int/lit16 v2, v2, 0xff

    add-int/lit8 v3, v1, 0x1

    aget-byte v3, p0, v3

    and-int/lit16 v3, v3, 0xff

    shl-int/lit8 v2, v2, 0x8

    or-int/2addr v2, v3

    const v3, 0x8140

    const/4 v4, -0x1

    if-lt v2, v3, :cond_0

    const v5, 0x9ffc

    if-gt v2, v5, :cond_0

    :goto_1
    sub-int/2addr v2, v3

    goto :goto_2

    :cond_0
    const v3, 0xe040

    if-lt v2, v3, :cond_1

    const v3, 0xebbf

    if-gt v2, v3, :cond_1

    const v3, 0xc140

    goto :goto_1

    :cond_1
    move v2, v4

    :goto_2
    if-eq v2, v4, :cond_2

    shr-int/lit8 v3, v2, 0x8

    mul-int/lit16 v3, v3, 0xc0

    and-int/lit16 v2, v2, 0xff

    add-int/2addr v3, v2

    const/16 v2, 0xd

    invoke-virtual {p1, v3, v2}, Lng/a;->c(II)V

    add-int/lit8 v1, v1, 0x2

    goto :goto_0

    :cond_2
    new-instance p0, Lmg/c;

    const-string p1, "Invalid byte sequence"

    invoke-direct {p0, p1}, Lmg/c;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    return-void

    :cond_4
    new-instance p0, Lmg/c;

    const-string p1, "Kanji byte size not even"

    invoke-direct {p0, p1}, Lmg/c;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_5
    new-instance p0, Lmg/c;

    const-string p1, "SJIS Charset not supported on this platform"

    invoke-direct {p0, p1}, Lmg/c;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static f(ILqg/c;Lqg/b;Lng/a;)V
    .locals 1

    invoke-virtual {p2, p1}, Lqg/b;->b(Lqg/c;)I

    move-result p1

    const/4 p2, 0x1

    shl-int v0, p2, p1

    if-ge p0, v0, :cond_0

    invoke-virtual {p3, p0, p1}, Lng/a;->c(II)V

    return-void

    :cond_0
    new-instance p1, Lmg/c;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, " is bigger than "

    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sub-int/2addr v0, p2

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Lmg/c;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static g(Lqg/b;Lng/a;)V
    .locals 1

    invoke-virtual {p0}, Lqg/b;->a()I

    move-result p0

    const/4 v0, 0x4

    invoke-virtual {p1, p0, v0}, Lng/a;->c(II)V

    return-void
.end method

.method public static h(Ljava/lang/CharSequence;Lng/a;)V
    .locals 6

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    invoke-interface {p0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    add-int/lit8 v2, v2, -0x30

    add-int/lit8 v3, v1, 0x2

    if-ge v3, v0, :cond_0

    add-int/lit8 v4, v1, 0x1

    invoke-interface {p0, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    add-int/lit8 v4, v4, -0x30

    invoke-interface {p0, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    add-int/lit8 v3, v3, -0x30

    mul-int/lit8 v2, v2, 0x64

    const/16 v5, 0xa

    mul-int/2addr v4, v5

    add-int/2addr v2, v4

    add-int/2addr v2, v3

    invoke-virtual {p1, v2, v5}, Lng/a;->c(II)V

    add-int/lit8 v1, v1, 0x3

    goto :goto_0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    if-ge v1, v0, :cond_1

    invoke-interface {p0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    add-int/lit8 v1, v1, -0x30

    mul-int/lit8 v2, v2, 0xa

    add-int/2addr v2, v1

    const/4 v1, 0x7

    invoke-virtual {p1, v2, v1}, Lng/a;->c(II)V

    move v1, v3

    goto :goto_0

    :cond_1
    const/4 v3, 0x4

    invoke-virtual {p1, v2, v3}, Lng/a;->c(II)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public static i(Lqg/b;Lng/a;Lng/a;Lqg/c;)I
    .locals 0

    invoke-virtual {p1}, Lng/a;->i()I

    move-result p1

    invoke-virtual {p0, p3}, Lqg/b;->b(Lqg/c;)I

    move-result p0

    add-int/2addr p1, p0

    invoke-virtual {p2}, Lng/a;->i()I

    move-result p0

    add-int/2addr p1, p0

    return p1
.end method

.method public static j(Lrg/b;)I
    .locals 2

    invoke-static {p0}, Lrg/d;->a(Lrg/b;)I

    move-result v0

    invoke-static {p0}, Lrg/d;->c(Lrg/b;)I

    move-result v1

    add-int/2addr v0, v1

    invoke-static {p0}, Lrg/d;->d(Lrg/b;)I

    move-result v1

    add-int/2addr v0, v1

    invoke-static {p0}, Lrg/d;->e(Lrg/b;)I

    move-result p0

    add-int/2addr v0, p0

    return v0
.end method

.method public static k(Lng/a;Lqg/a;Lqg/c;Lrg/b;)I
    .locals 4

    const v0, 0x7fffffff

    const/4 v1, -0x1

    const/4 v2, 0x0

    :goto_0
    const/16 v3, 0x8

    if-ge v2, v3, :cond_1

    invoke-static {p0, p1, p2, v2, p3}, Lrg/e;->a(Lng/a;Lqg/a;Lqg/c;ILrg/b;)V

    invoke-static {p3}, Lrg/c;->j(Lrg/b;)I

    move-result v3

    if-ge v3, v0, :cond_0

    move v1, v2

    move v0, v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method public static l(Ljava/lang/String;Ljava/nio/charset/Charset;)Lqg/b;
    .locals 5

    sget-object v0, Lng/e;->b:Ljava/nio/charset/Charset;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ljava/nio/charset/Charset;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {p0}, Lrg/c;->s(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p0, Lqg/b;->i:Lqg/b;

    return-object p0

    :cond_0
    const/4 p1, 0x0

    move v0, p1

    move v1, v0

    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-ge p1, v2, :cond_3

    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x30

    const/4 v4, 0x1

    if-lt v2, v3, :cond_1

    const/16 v3, 0x39

    if-gt v2, v3, :cond_1

    move v1, v4

    goto :goto_1

    :cond_1
    invoke-static {v2}, Lrg/c;->p(I)I

    move-result v0

    const/4 v2, -0x1

    if-eq v0, v2, :cond_2

    move v0, v4

    :goto_1
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_2
    sget-object p0, Lqg/b;->g:Lqg/b;

    return-object p0

    :cond_3
    if-eqz v0, :cond_4

    sget-object p0, Lqg/b;->e:Lqg/b;

    return-object p0

    :cond_4
    if-eqz v1, :cond_5

    sget-object p0, Lqg/b;->d:Lqg/b;

    return-object p0

    :cond_5
    sget-object p0, Lqg/b;->g:Lqg/b;

    return-object p0
.end method

.method public static m(ILqg/a;)Lqg/c;
    .locals 3

    const/4 v0, 0x1

    :goto_0
    const/16 v1, 0x28

    if-gt v0, v1, :cond_1

    invoke-static {v0}, Lqg/c;->e(I)Lqg/c;

    move-result-object v1

    invoke-static {p0, v1, p1}, Lrg/c;->v(ILqg/c;Lqg/a;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    new-instance p0, Lmg/c;

    const-string p1, "Data too big"

    invoke-direct {p0, p1}, Lmg/c;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static n(Ljava/lang/String;Lqg/a;Ljava/util/Map;)Lrg/g;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lqg/a;",
            "Ljava/util/Map<",
            "Lmg/b;",
            "*>;)",
            "Lrg/g;"
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p2, :cond_0

    sget-object v2, Lmg/b;->p:Lmg/b;

    invoke-interface {p2, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {p2, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    move v2, v0

    :goto_0
    if-eqz p2, :cond_1

    sget-object v3, Lmg/b;->o:Lmg/b;

    invoke-interface {p2, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {p2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    move v3, v0

    :goto_1
    sget-object v4, Lrg/c;->b:Ljava/nio/charset/Charset;

    if-eqz p2, :cond_2

    sget-object v5, Lmg/b;->b:Lmg/b;

    invoke-interface {p2, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    move v0, v1

    :cond_2
    if-eqz v0, :cond_3

    :try_start_0
    sget-object v1, Lmg/b;->b:Lmg/b;

    invoke-interface {p2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v4
    :try_end_0
    .catch Ljava/nio/charset/UnsupportedCharsetException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_3
    if-eqz v3, :cond_5

    sget-object v0, Lqg/b;->g:Lqg/b;

    sget-object v1, Lrg/c;->b:Ljava/nio/charset/Charset;

    invoke-virtual {v4, v1}, Ljava/nio/charset/Charset;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v3, 0x0

    if-eqz v1, :cond_4

    move-object v4, v3

    :cond_4
    invoke-static {p0, v3, v4, v2, p1}, Lrg/f;->h(Ljava/lang/String;Lqg/c;Ljava/nio/charset/Charset;ZLqg/a;)Lrg/f$c;

    move-result-object p0

    new-instance v1, Lng/a;

    invoke-direct {v1}, Lng/a;-><init>()V

    invoke-virtual {p0, v1}, Lrg/f$c;->b(Lng/a;)V

    invoke-virtual {p0}, Lrg/f$c;->e()Lqg/c;

    move-result-object p0

    goto/16 :goto_4

    :cond_5
    invoke-static {p0, v4}, Lrg/c;->l(Ljava/lang/String;Ljava/nio/charset/Charset;)Lqg/b;

    move-result-object v1

    new-instance v3, Lng/a;

    invoke-direct {v3}, Lng/a;-><init>()V

    sget-object v5, Lqg/b;->g:Lqg/b;

    if-ne v1, v5, :cond_6

    if-eqz v0, :cond_6

    invoke-static {v4}, Lng/c;->a(Ljava/nio/charset/Charset;)Lng/c;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-static {v0, v3}, Lrg/c;->d(Lng/c;Lng/a;)V

    :cond_6
    if-eqz v2, :cond_7

    sget-object v0, Lqg/b;->j:Lqg/b;

    invoke-static {v0, v3}, Lrg/c;->g(Lqg/b;Lng/a;)V

    :cond_7
    invoke-static {v1, v3}, Lrg/c;->g(Lqg/b;Lng/a;)V

    new-instance v0, Lng/a;

    invoke-direct {v0}, Lng/a;-><init>()V

    invoke-static {p0, v1, v0, v4}, Lrg/c;->c(Ljava/lang/String;Lqg/b;Lng/a;Ljava/nio/charset/Charset;)V

    if-eqz p2, :cond_9

    sget-object v2, Lmg/b;->m:Lmg/b;

    invoke-interface {p2, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-interface {p2, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    invoke-static {v2}, Lqg/c;->e(I)Lqg/c;

    move-result-object v2

    invoke-static {v1, v3, v0, v2}, Lrg/c;->i(Lqg/b;Lng/a;Lng/a;Lqg/c;)I

    move-result v4

    invoke-static {v4, v2, p1}, Lrg/c;->v(ILqg/c;Lqg/a;)Z

    move-result v4

    if-eqz v4, :cond_8

    goto :goto_2

    :cond_8
    new-instance p0, Lmg/c;

    const-string p1, "Data too big for requested version"

    invoke-direct {p0, p1}, Lmg/c;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_9
    invoke-static {p1, v1, v3, v0}, Lrg/c;->t(Lqg/a;Lqg/b;Lng/a;Lng/a;)Lqg/c;

    move-result-object v2

    :goto_2
    new-instance v4, Lng/a;

    invoke-direct {v4}, Lng/a;-><init>()V

    invoke-virtual {v4, v3}, Lng/a;->b(Lng/a;)V

    if-ne v1, v5, :cond_a

    invoke-virtual {v0}, Lng/a;->j()I

    move-result p0

    goto :goto_3

    :cond_a
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    :goto_3
    invoke-static {p0, v2, v1, v4}, Lrg/c;->f(ILqg/c;Lqg/b;Lng/a;)V

    invoke-virtual {v4, v0}, Lng/a;->b(Lng/a;)V

    move-object v0, v1

    move-object p0, v2

    move-object v1, v4

    :goto_4
    invoke-virtual {p0, p1}, Lqg/c;->c(Lqg/a;)Lqg/c$b;

    move-result-object v2

    invoke-virtual {p0}, Lqg/c;->d()I

    move-result v3

    invoke-virtual {v2}, Lqg/c$b;->d()I

    move-result v4

    sub-int/2addr v3, v4

    invoke-static {v3, v1}, Lrg/c;->u(ILng/a;)V

    invoke-virtual {p0}, Lqg/c;->d()I

    move-result v4

    invoke-virtual {v2}, Lqg/c$b;->c()I

    move-result v2

    invoke-static {v1, v4, v3, v2}, Lrg/c;->r(Lng/a;III)Lng/a;

    move-result-object v1

    new-instance v2, Lrg/g;

    invoke-direct {v2}, Lrg/g;-><init>()V

    invoke-virtual {v2, p1}, Lrg/g;->c(Lqg/a;)V

    invoke-virtual {v2, v0}, Lrg/g;->f(Lqg/b;)V

    invoke-virtual {v2, p0}, Lrg/g;->g(Lqg/c;)V

    invoke-virtual {p0}, Lqg/c;->b()I

    move-result v0

    new-instance v3, Lrg/b;

    invoke-direct {v3, v0, v0}, Lrg/b;-><init>(II)V

    const/4 v0, -0x1

    if-eqz p2, :cond_b

    sget-object v4, Lmg/b;->n:Lmg/b;

    invoke-interface {p2, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_b

    invoke-interface {p2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p2

    invoke-static {p2}, Lrg/g;->b(I)Z

    move-result v4

    if-eqz v4, :cond_b

    goto :goto_5

    :cond_b
    move p2, v0

    :goto_5
    if-ne p2, v0, :cond_c

    invoke-static {v1, p1, p0, v3}, Lrg/c;->k(Lng/a;Lqg/a;Lqg/c;Lrg/b;)I

    move-result p2

    :cond_c
    invoke-virtual {v2, p2}, Lrg/g;->d(I)V

    invoke-static {v1, p1, p0, p2, v3}, Lrg/e;->a(Lng/a;Lqg/a;Lqg/c;ILrg/b;)V

    invoke-virtual {v2, v3}, Lrg/g;->e(Lrg/b;)V

    return-object v2
.end method

.method public static o([BI)[B
    .locals 5

    array-length v0, p0

    add-int v1, v0, p1

    new-array v1, v1, [I

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v0, :cond_0

    aget-byte v4, p0, v3

    and-int/lit16 v4, v4, 0xff

    aput v4, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    new-instance p0, Log/c;

    sget-object v3, Log/a;->l:Log/a;

    invoke-direct {p0, v3}, Log/c;-><init>(Log/a;)V

    invoke-virtual {p0, v1, p1}, Log/c;->b([II)V

    new-array p0, p1, [B

    :goto_1
    if-ge v2, p1, :cond_1

    add-int v3, v0, v2

    aget v3, v1, v3

    int-to-byte v3, v3

    aput-byte v3, p0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    return-object p0
.end method

.method public static p(I)I
    .locals 2

    sget-object v0, Lrg/c;->a:[I

    array-length v1, v0

    if-ge p0, v1, :cond_0

    aget p0, v0, p0

    return p0

    :cond_0
    const/4 p0, -0x1

    return p0
.end method

.method public static q(IIII[I[I)V
    .locals 6

    if-ge p3, p2, :cond_4

    rem-int v0, p0, p2

    sub-int v1, p2, v0

    div-int v2, p0, p2

    add-int/lit8 v3, v2, 0x1

    div-int/2addr p1, p2

    add-int/lit8 v4, p1, 0x1

    sub-int/2addr v2, p1

    sub-int/2addr v3, v4

    if-ne v2, v3, :cond_3

    add-int v5, v1, v0

    if-ne p2, v5, :cond_2

    add-int p2, p1, v2

    mul-int/2addr p2, v1

    add-int v5, v4, v3

    mul-int/2addr v5, v0

    add-int/2addr p2, v5

    if-ne p0, p2, :cond_1

    const/4 p0, 0x0

    if-ge p3, v1, :cond_0

    aput p1, p4, p0

    aput v2, p5, p0

    return-void

    :cond_0
    aput v4, p4, p0

    aput v3, p5, p0

    return-void

    :cond_1
    new-instance p0, Lmg/c;

    const-string p1, "Total bytes mismatch"

    invoke-direct {p0, p1}, Lmg/c;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    new-instance p0, Lmg/c;

    const-string p1, "RS blocks mismatch"

    invoke-direct {p0, p1}, Lmg/c;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    new-instance p0, Lmg/c;

    const-string p1, "EC bytes mismatch"

    invoke-direct {p0, p1}, Lmg/c;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_4
    new-instance p0, Lmg/c;

    const-string p1, "Block ID too large"

    invoke-direct {p0, p1}, Lmg/c;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static r(Lng/a;III)Lng/a;
    .locals 11

    invoke-virtual {p0}, Lng/a;->j()I

    move-result v0

    if-ne v0, p2, :cond_9

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p3}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v1, 0x0

    move v5, v1

    move v8, v5

    move v9, v8

    move v10, v9

    :goto_0
    if-ge v5, p3, :cond_0

    const/4 v2, 0x1

    new-array v6, v2, [I

    new-array v7, v2, [I

    move v2, p1

    move v3, p2

    move v4, p3

    invoke-static/range {v2 .. v7}, Lrg/c;->q(IIII[I[I)V

    aget p1, v6, v1

    new-array p2, p1, [B

    mul-int/lit8 p3, v8, 0x8

    invoke-virtual {p0, p3, p2, v1, p1}, Lng/a;->n(I[BII)V

    aget p3, v7, v1

    invoke-static {p2, p3}, Lrg/c;->o([BI)[B

    move-result-object p3

    new-instance v7, Lrg/a;

    invoke-direct {v7, p2, p3}, Lrg/a;-><init>([B[B)V

    invoke-interface {v0, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    invoke-static {v9, p1}, Ljava/lang/Math;->max(II)I

    move-result v9

    array-length p1, p3

    invoke-static {v10, p1}, Ljava/lang/Math;->max(II)I

    move-result v10

    aget p1, v6, v1

    add-int/2addr v8, p1

    add-int/lit8 v5, v5, 0x1

    move p1, v2

    move p2, v3

    move p3, v4

    goto :goto_0

    :cond_0
    move v2, p1

    move v3, p2

    if-ne v3, v8, :cond_8

    new-instance p0, Lng/a;

    invoke-direct {p0}, Lng/a;-><init>()V

    move p1, v1

    :goto_1
    const/16 p2, 0x8

    if-ge p1, v9, :cond_3

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p3

    move v3, v1

    :cond_1
    :goto_2
    if-ge v3, p3, :cond_2

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v3, v3, 0x1

    check-cast v4, Lrg/a;

    invoke-virtual {v4}, Lrg/a;->a()[B

    move-result-object v4

    array-length v5, v4

    if-ge p1, v5, :cond_1

    aget-byte v4, v4, p1

    invoke-virtual {p0, v4, p2}, Lng/a;->c(II)V

    goto :goto_2

    :cond_2
    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    :cond_3
    move p1, v1

    :goto_3
    if-ge p1, v10, :cond_6

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p3

    move v3, v1

    :cond_4
    :goto_4
    if-ge v3, p3, :cond_5

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v3, v3, 0x1

    check-cast v4, Lrg/a;

    invoke-virtual {v4}, Lrg/a;->b()[B

    move-result-object v4

    array-length v5, v4

    if-ge p1, v5, :cond_4

    aget-byte v4, v4, p1

    invoke-virtual {p0, v4, p2}, Lng/a;->c(II)V

    goto :goto_4

    :cond_5
    add-int/lit8 p1, p1, 0x1

    goto :goto_3

    :cond_6
    invoke-virtual {p0}, Lng/a;->j()I

    move-result p1

    if-ne v2, p1, :cond_7

    return-object p0

    :cond_7
    new-instance p1, Lmg/c;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Interleaving error: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, " and "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lng/a;->j()I

    move-result p0

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, " differ."

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Lmg/c;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    new-instance p0, Lmg/c;

    const-string p1, "Data bytes does not match offset"

    invoke-direct {p0, p1}, Lmg/c;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_9
    new-instance p0, Lmg/c;

    const-string p1, "Number of bits and data bytes does not match"

    invoke-direct {p0, p1}, Lmg/c;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static s(Ljava/lang/String;)Z
    .locals 5

    sget-object v0, Lng/e;->b:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    array-length v0, p0

    rem-int/lit8 v1, v0, 0x2

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    return v2

    :cond_0
    move v1, v2

    :goto_0
    if-ge v1, v0, :cond_4

    aget-byte v3, p0, v1

    and-int/lit16 v3, v3, 0xff

    const/16 v4, 0x81

    if-lt v3, v4, :cond_1

    const/16 v4, 0x9f

    if-le v3, v4, :cond_2

    :cond_1
    const/16 v4, 0xe0

    if-lt v3, v4, :cond_3

    const/16 v4, 0xeb

    if-le v3, v4, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 v1, v1, 0x2

    goto :goto_0

    :cond_3
    :goto_1
    return v2

    :cond_4
    const/4 p0, 0x1

    return p0
.end method

.method public static t(Lqg/a;Lqg/b;Lng/a;Lng/a;)Lqg/c;
    .locals 1

    const/4 v0, 0x1

    invoke-static {v0}, Lqg/c;->e(I)Lqg/c;

    move-result-object v0

    invoke-static {p1, p2, p3, v0}, Lrg/c;->i(Lqg/b;Lng/a;Lng/a;Lqg/c;)I

    move-result v0

    invoke-static {v0, p0}, Lrg/c;->m(ILqg/a;)Lqg/c;

    move-result-object v0

    invoke-static {p1, p2, p3, v0}, Lrg/c;->i(Lqg/b;Lng/a;Lng/a;Lqg/c;)I

    move-result p1

    invoke-static {p1, p0}, Lrg/c;->m(ILqg/a;)Lqg/c;

    move-result-object p0

    return-object p0
.end method

.method public static u(ILng/a;)V
    .locals 4

    mul-int/lit8 v0, p0, 0x8

    invoke-virtual {p1}, Lng/a;->i()I

    move-result v1

    if-gt v1, v0, :cond_5

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    const/4 v3, 0x4

    if-ge v2, v3, :cond_0

    invoke-virtual {p1}, Lng/a;->i()I

    move-result v3

    if-ge v3, v0, :cond_0

    invoke-virtual {p1, v1}, Lng/a;->a(Z)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lng/a;->i()I

    move-result v2

    and-int/lit8 v2, v2, 0x7

    const/16 v3, 0x8

    if-lez v2, :cond_1

    :goto_1
    if-ge v2, v3, :cond_1

    invoke-virtual {p1, v1}, Lng/a;->a(Z)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lng/a;->j()I

    move-result v2

    sub-int/2addr p0, v2

    :goto_2
    if-ge v1, p0, :cond_3

    and-int/lit8 v2, v1, 0x1

    if-nez v2, :cond_2

    const/16 v2, 0xec

    goto :goto_3

    :cond_2
    const/16 v2, 0x11

    :goto_3
    invoke-virtual {p1, v2, v3}, Lng/a;->c(II)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_3
    invoke-virtual {p1}, Lng/a;->i()I

    move-result p0

    if-ne p0, v0, :cond_4

    return-void

    :cond_4
    new-instance p0, Lmg/c;

    const-string p1, "Bits size does not equal capacity"

    invoke-direct {p0, p1}, Lmg/c;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_5
    new-instance p0, Lmg/c;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "data bits cannot fit in the QR Code"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lng/a;->i()I

    move-result p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " > "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lmg/c;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static v(ILqg/c;Lqg/a;)Z
    .locals 1

    invoke-virtual {p1}, Lqg/c;->d()I

    move-result v0

    invoke-virtual {p1, p2}, Lqg/c;->c(Lqg/a;)Lqg/c$b;

    move-result-object p1

    invoke-virtual {p1}, Lqg/c$b;->d()I

    move-result p1

    sub-int/2addr v0, p1

    add-int/lit8 p0, p0, 0x7

    div-int/lit8 p0, p0, 0x8

    if-lt v0, p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method
