.class public final Lokhttp3/internal/_HostnamesCommonKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0012\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u000c\u001a\n\u0010\u0002\u001a\u00020\u0003*\u00020\u0004\u001a\u000c\u0010\u0005\u001a\u00020\u0003*\u00020\u0004H\u0000\u001a\u000c\u0010\u0006\u001a\u00020\u0003*\u00020\u0004H\u0000\u001a\"\u0010\u0007\u001a\u0004\u0018\u00010\u00082\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u000bH\u0000\u001a0\u0010\r\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00082\u0006\u0010\u000f\u001a\u00020\u000bH\u0000\u001a\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0008H\u0000\u001a\u0010\u0010\u0011\u001a\u00020\u00082\u0006\u0010\u000e\u001a\u00020\u0008H\u0000\u001a\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0008H\u0002\u001a\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0008H\u0000\u001a\u000e\u0010\u0014\u001a\u0004\u0018\u00010\u0004*\u00020\u0004H\u0000\u001a\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0016\u001a\u00020\u0004H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"
    }
    d2 = {
        "VERIFY_AS_IP_ADDRESS",
        "Lkotlin/text/Regex;",
        "canParseAsIpAddress",
        "",
        "",
        "containsInvalidLabelLengths",
        "containsInvalidHostnameAsciiCodes",
        "decodeIpv6",
        "",
        "input",
        "pos",
        "",
        "limit",
        "decodeIpv4Suffix",
        "address",
        "addressOffset",
        "inet6AddressToAscii",
        "canonicalizeInetAddress",
        "isMappedIpv4Address",
        "inet4AddressToAscii",
        "toCanonicalHost",
        "idnToAscii",
        "host",
        "okhttp"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final VERIFY_AS_IP_ADDRESS:Lkotlin/text/Regex;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lkotlin/text/Regex;

    const-string v1, "([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)"

    invoke-direct {v0, v1}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    sput-object v0, Lokhttp3/internal/_HostnamesCommonKt;->VERIFY_AS_IP_ADDRESS:Lkotlin/text/Regex;

    return-void
.end method

.method public static final canParseAsIpAddress(Ljava/lang/String;)Z
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lokhttp3/internal/_HostnamesCommonKt;->VERIFY_AS_IP_ADDRESS:Lkotlin/text/Regex;

    invoke-virtual {v0, p0}, Lkotlin/text/Regex;->f(Ljava/lang/CharSequence;)Z

    move-result p0

    return p0
.end method

.method public static final canonicalizeInetAddress([B)[B
    .locals 2
    .param p0    # [B
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "address"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lokhttp3/internal/_HostnamesCommonKt;->isMappedIpv4Address([B)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0xc

    const/16 v1, 0x10

    invoke-static {v0, v1}, Lkotlin/ranges/d;->q(II)Lkotlin/ranges/IntRange;

    move-result-object v0

    invoke-static {p0, v0}, Lkotlin/collections/m;->d0([BLkotlin/ranges/IntRange;)[B

    move-result-object p0

    :cond_0
    return-object p0
.end method

.method public static final containsInvalidHostnameAsciiCodes(Ljava/lang/String;)Z
    .locals 10
    .param p0    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_3

    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v3, 0x1f

    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->f(II)I

    move-result v3

    const/4 v9, 0x1

    if-lez v3, :cond_2

    const/16 v3, 0x7f

    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->f(II)I

    move-result v3

    if-ltz v3, :cond_0

    goto :goto_1

    :cond_0
    const/4 v7, 0x6

    const/4 v8, 0x0

    const-string v3, " #%/:?@[\\]"

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lkotlin/text/StringsKt;->m0(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    move-result v3

    const/4 v4, -0x1

    if-eq v3, v4, :cond_1

    return v9

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return v9

    :cond_3
    return v1
.end method

.method public static final containsInvalidLabelLengths(Ljava/lang/String;)Z
    .locals 8
    .param p0    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-gt v1, v0, :cond_2

    const/16 v2, 0xfe

    if-ge v0, v2, :cond_2

    const/4 v0, 0x0

    move v4, v0

    :goto_0
    const/4 v6, 0x4

    const/4 v7, 0x0

    const/16 v3, 0x2e

    const/4 v5, 0x0

    move-object v2, p0

    invoke-static/range {v2 .. v7}, Lkotlin/text/StringsKt;->m0(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    move-result p0

    const/4 v3, -0x1

    if-ne p0, v3, :cond_0

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v5

    sub-int/2addr v5, v4

    goto :goto_1

    :cond_0
    sub-int v5, p0, v4

    :goto_1
    if-gt v1, v5, :cond_2

    const/16 v4, 0x40

    if-ge v5, v4, :cond_2

    if-eq p0, v3, :cond_1

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    sub-int/2addr v3, v1

    if-eq p0, v3, :cond_1

    add-int/lit8 v4, p0, 0x1

    move-object p0, v2

    goto :goto_0

    :cond_1
    return v0

    :cond_2
    return v1
.end method

.method public static final decodeIpv4Suffix(Ljava/lang/String;II[BI)Z
    .locals 7
    .param p0    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # [B
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "input"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "address"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    move v0, p4

    :goto_0
    const/4 v1, 0x0

    if-ge p1, p2, :cond_8

    array-length v2, p3

    if-ne v0, v2, :cond_0

    return v1

    :cond_0
    if-eq v0, p4, :cond_2

    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x2e

    if-eq v2, v3, :cond_1

    return v1

    :cond_1
    add-int/lit8 p1, p1, 0x1

    :cond_2
    move v2, p1

    move v3, v1

    :goto_1
    if-ge v2, p2, :cond_6

    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0x30

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->f(II)I

    move-result v6

    if-ltz v6, :cond_6

    const/16 v6, 0x39

    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->f(II)I

    move-result v6

    if-lez v6, :cond_3

    goto :goto_2

    :cond_3
    if-nez v3, :cond_4

    if-eq p1, v2, :cond_4

    return v1

    :cond_4
    mul-int/lit8 v3, v3, 0xa

    add-int/2addr v3, v4

    sub-int/2addr v3, v5

    const/16 v4, 0xff

    if-le v3, v4, :cond_5

    return v1

    :cond_5
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_6
    :goto_2
    sub-int p1, v2, p1

    if-nez p1, :cond_7

    return v1

    :cond_7
    add-int/lit8 p1, v0, 0x1

    int-to-byte v1, v3

    aput-byte v1, p3, v0

    move v0, p1

    move p1, v2

    goto :goto_0

    :cond_8
    add-int/lit8 p4, p4, 0x4

    if-ne v0, p4, :cond_9

    const/4 p0, 0x1

    return p0

    :cond_9
    return v1
.end method

.method public static final decodeIpv6(Ljava/lang/String;II)[B
    .locals 16
    .param p0    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    move-object/from16 v0, p0

    move/from16 v6, p2

    const-string v1, "input"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v7, 0x10

    new-array v8, v7, [B

    const/4 v9, 0x0

    const/4 v10, -0x1

    move/from16 v2, p1

    move v11, v9

    move v12, v10

    move v13, v12

    :goto_0
    const/4 v14, 0x0

    if-ge v2, v6, :cond_b

    if-ne v11, v7, :cond_0

    return-object v14

    :cond_0
    add-int/lit8 v15, v2, 0x2

    if-gt v15, v6, :cond_3

    const/4 v4, 0x4

    const/4 v5, 0x0

    const-string v1, "::"

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lkotlin/text/x;->S(Ljava/lang/String;Ljava/lang/String;IZILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    if-eq v12, v10, :cond_1

    return-object v14

    :cond_1
    add-int/lit8 v11, v11, 0x2

    if-ne v15, v6, :cond_2

    move v12, v11

    goto/16 :goto_4

    :cond_2
    move-object/from16 v0, p0

    move v12, v11

    move v13, v15

    goto :goto_1

    :cond_3
    if-eqz v11, :cond_4

    const/4 v4, 0x4

    const/4 v5, 0x0

    const-string v1, ":"

    const/4 v3, 0x0

    move-object/from16 v0, p0

    invoke-static/range {v0 .. v5}, Lkotlin/text/x;->S(Ljava/lang/String;Ljava/lang/String;IZILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    add-int/lit8 v2, v2, 0x1

    :cond_4
    move-object/from16 v0, p0

    move v13, v2

    goto :goto_1

    :cond_5
    const/4 v4, 0x4

    const/4 v5, 0x0

    const-string v1, "."

    const/4 v3, 0x0

    move-object/from16 v0, p0

    invoke-static/range {v0 .. v5}, Lkotlin/text/x;->S(Ljava/lang/String;Ljava/lang/String;IZILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    add-int/lit8 v1, v11, -0x2

    invoke-static {v0, v13, v6, v8, v1}, Lokhttp3/internal/_HostnamesCommonKt;->decodeIpv4Suffix(Ljava/lang/String;II[BI)Z

    move-result v0

    if-nez v0, :cond_6

    return-object v14

    :cond_6
    add-int/lit8 v11, v11, 0x2

    goto :goto_4

    :cond_7
    return-object v14

    :goto_1
    move v1, v9

    move v2, v13

    :goto_2
    if-ge v2, v6, :cond_8

    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-static {v3}, Lokhttp3/internal/_UtilCommonKt;->parseHexDigit(C)I

    move-result v3

    if-eq v3, v10, :cond_8

    shl-int/lit8 v1, v1, 0x4

    add-int/2addr v1, v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_8
    sub-int v3, v2, v13

    if-eqz v3, :cond_a

    const/4 v4, 0x4

    if-le v3, v4, :cond_9

    goto :goto_3

    :cond_9
    add-int/lit8 v3, v11, 0x1

    ushr-int/lit8 v4, v1, 0x8

    and-int/lit16 v4, v4, 0xff

    int-to-byte v4, v4

    aput-byte v4, v8, v11

    add-int/lit8 v11, v11, 0x2

    and-int/lit16 v1, v1, 0xff

    int-to-byte v1, v1

    aput-byte v1, v8, v3

    goto :goto_0

    :cond_a
    :goto_3
    return-object v14

    :cond_b
    :goto_4
    if-eq v11, v7, :cond_d

    if-ne v12, v10, :cond_c

    return-object v14

    :cond_c
    sub-int v0, v11, v12

    rsub-int/lit8 v0, v0, 0x10

    invoke-static {v8, v8, v0, v12, v11}, Lkotlin/collections/l;->f([B[BIII)[B

    sub-int/2addr v7, v11

    add-int/2addr v7, v12

    invoke-static {v8, v9, v12, v7}, Lkotlin/collections/l;->o([BBII)V

    :cond_d
    return-object v8
.end method

.method public static final idnToAscii(Ljava/lang/String;)Ljava/lang/String;
    .locals 4
    .param p0    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "host"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lxu/e;

    invoke-direct {v0}, Lxu/e;-><init>()V

    invoke-virtual {v0, p0}, Lxu/e;->H0(Ljava/lang/String;)Lxu/e;

    move-result-object p0

    new-instance v0, Lxu/e;

    invoke-direct {v0}, Lxu/e;-><init>()V

    :cond_0
    invoke-virtual {p0}, Lxu/e;->Z1()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_1

    invoke-virtual {p0}, Lxu/e;->A2()I

    move-result v1

    invoke-static {}, Lokhttp3/internal/idn/IdnaMappingTableInstanceKt;->getIDNA_MAPPING_TABLE()Lokhttp3/internal/idn/IdnaMappingTable;

    move-result-object v3

    invoke-virtual {v3, v1, v0}, Lokhttp3/internal/idn/IdnaMappingTable;->map(ILxu/f;)Z

    move-result v1

    if-nez v1, :cond_0

    return-object v2

    :cond_1
    invoke-virtual {v0}, Lxu/e;->R2()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lokhttp3/internal/_NormalizeJvmKt;->normalizeNfc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lxu/e;->H0(Ljava/lang/String;)Lxu/e;

    sget-object v0, Lokhttp3/internal/idn/Punycode;->INSTANCE:Lokhttp3/internal/idn/Punycode;

    invoke-virtual {p0}, Lxu/e;->R2()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lokhttp3/internal/idn/Punycode;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_2

    return-object v2

    :cond_2
    invoke-static {p0}, Lokhttp3/internal/_NormalizeJvmKt;->normalizeNfc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return-object v2

    :cond_3
    invoke-virtual {v0, p0}, Lokhttp3/internal/idn/Punycode;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final inet4AddressToAscii([B)Ljava/lang/String;
    .locals 5
    .param p0    # [B
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "address"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    new-instance v0, Lxu/e;

    invoke-direct {v0}, Lxu/e;-><init>()V

    const/4 v1, 0x0

    aget-byte v1, p0, v1

    const/16 v2, 0xff

    invoke-static {v1, v2}, Lokhttp3/internal/_UtilCommonKt;->and(BI)I

    move-result v1

    int-to-long v3, v1

    invoke-virtual {v0, v3, v4}, Lxu/e;->l0(J)Lxu/e;

    move-result-object v0

    const/16 v1, 0x2e

    invoke-virtual {v0, v1}, Lxu/e;->i0(I)Lxu/e;

    move-result-object v0

    const/4 v3, 0x1

    aget-byte v3, p0, v3

    invoke-static {v3, v2}, Lokhttp3/internal/_UtilCommonKt;->and(BI)I

    move-result v3

    int-to-long v3, v3

    invoke-virtual {v0, v3, v4}, Lxu/e;->l0(J)Lxu/e;

    move-result-object v0

    invoke-virtual {v0, v1}, Lxu/e;->i0(I)Lxu/e;

    move-result-object v0

    const/4 v3, 0x2

    aget-byte v3, p0, v3

    invoke-static {v3, v2}, Lokhttp3/internal/_UtilCommonKt;->and(BI)I

    move-result v3

    int-to-long v3, v3

    invoke-virtual {v0, v3, v4}, Lxu/e;->l0(J)Lxu/e;

    move-result-object v0

    invoke-virtual {v0, v1}, Lxu/e;->i0(I)Lxu/e;

    move-result-object v0

    const/4 v1, 0x3

    aget-byte p0, p0, v1

    invoke-static {p0, v2}, Lokhttp3/internal/_UtilCommonKt;->and(BI)I

    move-result p0

    int-to-long v1, p0

    invoke-virtual {v0, v1, v2}, Lxu/e;->l0(J)Lxu/e;

    move-result-object p0

    invoke-virtual {p0}, Lxu/e;->R2()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Failed requirement."

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final inet6AddressToAscii([B)Ljava/lang/String;
    .locals 8
    .param p0    # [B
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "address"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, -0x1

    const/4 v1, 0x0

    move v2, v1

    move v3, v2

    :goto_0
    array-length v4, p0

    const/16 v5, 0x10

    if-ge v2, v4, :cond_2

    move v4, v2

    :goto_1
    if-ge v4, v5, :cond_0

    aget-byte v6, p0, v4

    if-nez v6, :cond_0

    add-int/lit8 v6, v4, 0x1

    aget-byte v6, p0, v6

    if-nez v6, :cond_0

    add-int/lit8 v4, v4, 0x2

    goto :goto_1

    :cond_0
    sub-int v5, v4, v2

    if-le v5, v3, :cond_1

    const/4 v6, 0x4

    if-lt v5, v6, :cond_1

    move v0, v2

    move v3, v5

    :cond_1
    add-int/lit8 v2, v4, 0x2

    goto :goto_0

    :cond_2
    new-instance v2, Lxu/e;

    invoke-direct {v2}, Lxu/e;-><init>()V

    :cond_3
    :goto_2
    array-length v4, p0

    if-ge v1, v4, :cond_6

    const/16 v4, 0x3a

    if-ne v1, v0, :cond_4

    invoke-virtual {v2, v4}, Lxu/e;->i0(I)Lxu/e;

    add-int/2addr v1, v3

    if-ne v1, v5, :cond_3

    invoke-virtual {v2, v4}, Lxu/e;->i0(I)Lxu/e;

    goto :goto_2

    :cond_4
    if-lez v1, :cond_5

    invoke-virtual {v2, v4}, Lxu/e;->i0(I)Lxu/e;

    :cond_5
    aget-byte v4, p0, v1

    const/16 v6, 0xff

    invoke-static {v4, v6}, Lokhttp3/internal/_UtilCommonKt;->and(BI)I

    move-result v4

    shl-int/lit8 v4, v4, 0x8

    add-int/lit8 v7, v1, 0x1

    aget-byte v7, p0, v7

    invoke-static {v7, v6}, Lokhttp3/internal/_UtilCommonKt;->and(BI)I

    move-result v6

    or-int/2addr v4, v6

    int-to-long v6, v4

    invoke-virtual {v2, v6, v7}, Lxu/e;->r0(J)Lxu/e;

    add-int/lit8 v1, v1, 0x2

    goto :goto_2

    :cond_6
    invoke-virtual {v2}, Lxu/e;->R2()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final isMappedIpv4Address([B)Z
    .locals 3

    array-length v0, p0

    const/16 v1, 0x10

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    return v2

    :cond_0
    move v0, v2

    :goto_0
    const/16 v1, 0xa

    if-ge v0, v1, :cond_2

    aget-byte v1, p0, v0

    if-eqz v1, :cond_1

    return v2

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    aget-byte v0, p0, v1

    const/4 v1, -0x1

    if-eq v0, v1, :cond_3

    return v2

    :cond_3
    const/16 v0, 0xb

    aget-byte p0, p0, v0

    if-eq p0, v1, :cond_4

    return v2

    :cond_4
    const/4 p0, 0x1

    return p0
.end method

.method public static final toCanonicalHost(Ljava/lang/String;)Ljava/lang/String;
    .locals 4
    .param p0    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, ":"

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p0, v0, v1, v2, v3}, Lkotlin/text/StringsKt;->a0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const-string v0, "["

    invoke-static {p0, v0, v1, v2, v3}, Lkotlin/text/x;->T(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "]"

    invoke-static {p0, v0, v1, v2, v3}, Lkotlin/text/x;->D(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    invoke-static {p0, v1, v0}, Lokhttp3/internal/_HostnamesCommonKt;->decodeIpv6(Ljava/lang/String;II)[B

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-static {p0, v1, v0}, Lokhttp3/internal/_HostnamesCommonKt;->decodeIpv6(Ljava/lang/String;II)[B

    move-result-object v0

    :goto_0
    if-nez v0, :cond_1

    return-object v3

    :cond_1
    invoke-static {v0}, Lokhttp3/internal/_HostnamesCommonKt;->canonicalizeInetAddress([B)[B

    move-result-object v0

    array-length v1, v0

    const/16 v2, 0x10

    if-ne v1, v2, :cond_2

    invoke-static {v0}, Lokhttp3/internal/_HostnamesCommonKt;->inet6AddressToAscii([B)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    array-length v1, v0

    const/4 v2, 0x4

    if-ne v1, v2, :cond_3

    invoke-static {v0}, Lokhttp3/internal/_HostnamesCommonKt;->inet4AddressToAscii([B)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_3
    new-instance v0, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid IPv6 address: \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p0, 0x27

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_4
    invoke-static {p0}, Lokhttp3/internal/_HostnamesCommonKt;->idnToAscii(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_5

    return-object v3

    :cond_5
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_6

    return-object v3

    :cond_6
    invoke-static {p0}, Lokhttp3/internal/_HostnamesCommonKt;->containsInvalidHostnameAsciiCodes(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    return-object v3

    :cond_7
    invoke-static {p0}, Lokhttp3/internal/_HostnamesCommonKt;->containsInvalidLabelLengths(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    return-object v3

    :cond_8
    return-object p0
.end method
