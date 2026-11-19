.class public final enum Lda/m;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lda/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lda/m;",
        ">;",
        "Lda/a;"
    }
.end annotation


# static fields
.field public static final enum b:Lda/m;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public static final enum c:Lda/m;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public static final enum d:Lda/m;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public static final enum e:Lda/m;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public static final enum f:Lda/m;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public static final enum g:Lda/m;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public static final enum h:Lda/m;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public static final synthetic i:[Lda/m;


# instance fields
.field public final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Lda/m;

    const/4 v1, 0x0

    const/16 v2, -0x104

    const-string v3, "ED256"

    invoke-direct {v0, v3, v1, v2}, Lda/m;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lda/m;->b:Lda/m;

    new-instance v1, Lda/m;

    const/4 v2, 0x1

    const/16 v3, -0x105

    const-string v4, "ED512"

    invoke-direct {v1, v4, v2, v3}, Lda/m;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lda/m;->c:Lda/m;

    new-instance v2, Lda/m;

    const/4 v3, 0x2

    const/4 v4, -0x8

    const-string v5, "ED25519"

    invoke-direct {v2, v5, v3, v4}, Lda/m;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lda/m;->d:Lda/m;

    new-instance v3, Lda/m;

    const/4 v4, 0x3

    const/4 v5, -0x7

    const-string v6, "ES256"

    invoke-direct {v3, v6, v4, v5}, Lda/m;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lda/m;->e:Lda/m;

    new-instance v4, Lda/m;

    const/4 v5, 0x4

    const/16 v6, -0x19

    const-string v7, "ECDH_HKDF_256"

    invoke-direct {v4, v7, v5, v6}, Lda/m;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lda/m;->f:Lda/m;

    new-instance v5, Lda/m;

    const/4 v6, 0x5

    const/16 v7, -0x23

    const-string v8, "ES384"

    invoke-direct {v5, v8, v6, v7}, Lda/m;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lda/m;->g:Lda/m;

    new-instance v6, Lda/m;

    const/4 v7, 0x6

    const/16 v8, -0x24

    const-string v9, "ES512"

    invoke-direct {v6, v9, v7, v8}, Lda/m;-><init>(Ljava/lang/String;II)V

    sput-object v6, Lda/m;->h:Lda/m;

    filled-new-array/range {v0 .. v6}, [Lda/m;

    move-result-object v0

    sput-object v0, Lda/m;->i:[Lda/m;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lda/m;->a:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lda/m;
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const-class v0, Lda/m;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lda/m;

    return-object p0
.end method

.method public static values()[Lda/m;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    sget-object v0, Lda/m;->i:[Lda/m;

    invoke-virtual {v0}, [Lda/m;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lda/m;

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lda/m;->a:I

    return v0
.end method
