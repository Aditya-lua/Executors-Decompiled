.class public final Law/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Law/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0010\u000c\n\u0002\u0008\u0005\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J+\u0010\r\u001a\u0004\u0018\u00010\u000c*\u00020\u00072\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00082\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u0019"
    }
    d2 = {
        "Law/c$a;",
        "",
        "<init>",
        "()V",
        "Law/c;",
        "c",
        "()Law/c;",
        "Lew/h;",
        "",
        "labels",
        "",
        "labelIndex",
        "",
        "b",
        "(Lew/h;[Lew/h;I)Ljava/lang/String;",
        "WILDCARD_LABEL",
        "Lew/h;",
        "",
        "PREVAILING_RULE",
        "Ljava/util/List;",
        "",
        "EXCEPTION_MARKER",
        "C",
        "instance",
        "Law/c;",
        "okhttp"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Law/c$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(Law/c$a;Lew/h;[Lew/h;I)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Law/c$a;->b(Lew/h;[Lew/h;I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final b(Lew/h;[Lew/h;I)Ljava/lang/String;
    .locals 17

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    invoke-virtual {v0}, Lew/h;->I()I

    move-result v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_b

    add-int v5, v4, v2

    div-int/lit8 v5, v5, 0x2

    :goto_1
    const/16 v6, 0xa

    const/4 v7, -0x1

    if-le v5, v7, :cond_0

    invoke-virtual {v0, v5}, Lew/h;->k(I)B

    move-result v8

    if-eq v8, v6, :cond_0

    add-int/lit8 v5, v5, -0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v8, v5, 0x1

    const/4 v9, 0x1

    move v10, v9

    :goto_2
    add-int v11, v8, v10

    invoke-virtual {v0, v11}, Lew/h;->k(I)B

    move-result v12

    if-eq v12, v6, :cond_1

    add-int/lit8 v10, v10, 0x1

    goto :goto_2

    :cond_1
    sub-int v6, v11, v8

    move/from16 v12, p3

    const/4 v10, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    :goto_3
    const/16 v15, 0xff

    if-eqz v10, :cond_2

    const/16 v10, 0x2e

    const/4 v3, 0x0

    goto :goto_4

    :cond_2
    aget-object v3, v1, v12

    invoke-virtual {v3, v13}, Lew/h;->k(I)B

    move-result v3

    invoke-static {v3, v15}, Lnv/n;->b(BI)I

    move-result v3

    move/from16 v16, v10

    move v10, v3

    move/from16 v3, v16

    :goto_4
    add-int v7, v8, v14

    invoke-virtual {v0, v7}, Lew/h;->k(I)B

    move-result v7

    invoke-static {v7, v15}, Lnv/n;->b(BI)I

    move-result v7

    sub-int/2addr v10, v7

    if-nez v10, :cond_5

    add-int/lit8 v14, v14, 0x1

    add-int/lit8 v13, v13, 0x1

    if-eq v14, v6, :cond_5

    aget-object v7, v1, v12

    invoke-virtual {v7}, Lew/h;->I()I

    move-result v7

    if-ne v7, v13, :cond_4

    array-length v3, v1

    sub-int/2addr v3, v9

    if-ne v12, v3, :cond_3

    goto :goto_5

    :cond_3
    add-int/lit8 v12, v12, 0x1

    move v10, v9

    const/4 v7, -0x1

    const/4 v13, -0x1

    goto :goto_3

    :cond_4
    move v10, v3

    const/4 v7, -0x1

    goto :goto_3

    :cond_5
    :goto_5
    if-gez v10, :cond_6

    :goto_6
    move v2, v5

    goto :goto_0

    :cond_6
    if-lez v10, :cond_7

    :goto_7
    add-int/lit8 v4, v11, 0x1

    goto :goto_0

    :cond_7
    sub-int v3, v6, v14

    aget-object v7, v1, v12

    invoke-virtual {v7}, Lew/h;->I()I

    move-result v7

    sub-int/2addr v7, v13

    add-int/lit8 v12, v12, 0x1

    array-length v9, v1

    :goto_8
    if-ge v12, v9, :cond_8

    aget-object v10, v1, v12

    invoke-virtual {v10}, Lew/h;->I()I

    move-result v10

    add-int/2addr v7, v10

    add-int/lit8 v12, v12, 0x1

    goto :goto_8

    :cond_8
    if-ge v7, v3, :cond_9

    goto :goto_6

    :cond_9
    if-le v7, v3, :cond_a

    goto :goto_7

    :cond_a
    add-int/2addr v6, v8

    invoke-virtual {v0, v8, v6}, Lew/h;->L(II)Lew/h;

    move-result-object v0

    sget-object v1, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v1}, Lew/h;->K(Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_b
    const/4 v0, 0x0

    return-object v0
.end method

.method public final c()Law/c;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-static {}, Law/c;->a()Law/c;

    move-result-object v0

    return-object v0
.end method
