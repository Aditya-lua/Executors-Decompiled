.class public final enum Lzg/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lzg/b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum c:Lzg/b;

.field public static final enum d:Lzg/b;

.field public static final enum e:Lzg/b;

.field public static final enum f:Lzg/b;

.field public static final enum g:Lzg/b;

.field public static final enum h:Lzg/b;

.field public static final enum i:Lzg/b;

.field public static final enum j:Lzg/b;

.field public static final enum k:Lzg/b;

.field public static final enum l:Lzg/b;

.field public static final synthetic m:[Lzg/b;


# instance fields
.field public final a:[I

.field public final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 16

    new-instance v0, Lzg/b;

    const/4 v1, 0x0

    filled-new-array {v1, v1, v1}, [I

    move-result-object v2

    const-string v3, "TERMINATOR"

    invoke-direct {v0, v3, v1, v2, v1}, Lzg/b;-><init>(Ljava/lang/String;I[II)V

    sput-object v0, Lzg/b;->c:Lzg/b;

    new-instance v2, Lzg/b;

    const/16 v3, 0xe

    const/16 v4, 0xa

    const/16 v5, 0xc

    filled-new-array {v4, v5, v3}, [I

    move-result-object v3

    const-string v6, "NUMERIC"

    const/4 v7, 0x1

    invoke-direct {v2, v6, v7, v3, v7}, Lzg/b;-><init>(Ljava/lang/String;I[II)V

    sput-object v2, Lzg/b;->d:Lzg/b;

    move-object v3, v2

    new-instance v2, Lzg/b;

    const/16 v6, 0x9

    const/16 v7, 0xb

    const/16 v8, 0xd

    filled-new-array {v6, v7, v8}, [I

    move-result-object v7

    const-string v9, "ALPHANUMERIC"

    const/4 v10, 0x2

    invoke-direct {v2, v9, v10, v7, v10}, Lzg/b;-><init>(Ljava/lang/String;I[II)V

    sput-object v2, Lzg/b;->e:Lzg/b;

    move-object v7, v3

    new-instance v3, Lzg/b;

    const/4 v9, 0x3

    filled-new-array {v1, v1, v1}, [I

    move-result-object v10

    const-string v11, "STRUCTURED_APPEND"

    invoke-direct {v3, v11, v9, v10, v9}, Lzg/b;-><init>(Ljava/lang/String;I[II)V

    sput-object v3, Lzg/b;->f:Lzg/b;

    new-instance v9, Lzg/b;

    const/16 v10, 0x10

    const/16 v11, 0x8

    filled-new-array {v11, v10, v10}, [I

    move-result-object v10

    const-string v12, "BYTE"

    const/4 v13, 0x4

    invoke-direct {v9, v12, v13, v10, v13}, Lzg/b;-><init>(Ljava/lang/String;I[II)V

    sput-object v9, Lzg/b;->g:Lzg/b;

    new-instance v10, Lzg/b;

    filled-new-array {v1, v1, v1}, [I

    move-result-object v12

    const-string v13, "ECI"

    const/4 v14, 0x5

    const/4 v15, 0x7

    invoke-direct {v10, v13, v14, v12, v15}, Lzg/b;-><init>(Ljava/lang/String;I[II)V

    sput-object v10, Lzg/b;->h:Lzg/b;

    new-instance v12, Lzg/b;

    const/4 v13, 0x6

    filled-new-array {v11, v4, v5}, [I

    move-result-object v8

    const-string v4, "KANJI"

    invoke-direct {v12, v4, v13, v8, v11}, Lzg/b;-><init>(Ljava/lang/String;I[II)V

    sput-object v12, Lzg/b;->i:Lzg/b;

    move-object v4, v7

    new-instance v7, Lzg/b;

    const-string v8, "FNC1_FIRST_POSITION"

    filled-new-array {v1, v1, v1}, [I

    move-result-object v13

    invoke-direct {v7, v8, v15, v13, v14}, Lzg/b;-><init>(Ljava/lang/String;I[II)V

    sput-object v7, Lzg/b;->j:Lzg/b;

    new-instance v8, Lzg/b;

    const-string v13, "FNC1_SECOND_POSITION"

    filled-new-array {v1, v1, v1}, [I

    move-result-object v1

    invoke-direct {v8, v13, v11, v1, v6}, Lzg/b;-><init>(Ljava/lang/String;I[II)V

    sput-object v8, Lzg/b;->k:Lzg/b;

    move-object v1, v4

    move-object v4, v9

    new-instance v9, Lzg/b;

    const-string v13, "HANZI"

    const/16 v14, 0xa

    filled-new-array {v11, v14, v5}, [I

    move-result-object v5

    const/16 v11, 0xd

    invoke-direct {v9, v13, v6, v5, v11}, Lzg/b;-><init>(Ljava/lang/String;I[II)V

    sput-object v9, Lzg/b;->l:Lzg/b;

    move-object v5, v10

    move-object v6, v12

    filled-new-array/range {v0 .. v9}, [Lzg/b;

    move-result-object v0

    sput-object v0, Lzg/b;->m:[Lzg/b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I[II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([II)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lzg/b;->a:[I

    iput p4, p0, Lzg/b;->b:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lzg/b;
    .locals 1

    const-class v0, Lzg/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lzg/b;

    return-object p0
.end method

.method public static values()[Lzg/b;
    .locals 1

    sget-object v0, Lzg/b;->m:[Lzg/b;

    invoke-virtual {v0}, [Lzg/b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lzg/b;

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lzg/b;->b:I

    return v0
.end method

.method public b(Lzg/c;)I
    .locals 1

    invoke-virtual {p1}, Lzg/c;->f()I

    move-result p1

    const/16 v0, 0x9

    if-gt p1, v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 v0, 0x1a

    if-gt p1, v0, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x2

    :goto_0
    iget-object v0, p0, Lzg/b;->a:[I

    aget p1, v0, p1

    return p1
.end method
