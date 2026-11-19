.class public final enum Lda/n;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lda/n$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lda/n;",
        ">;",
        "Landroid/os/Parcelable;"
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lda/n;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum b:Lda/n;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public static final enum c:Lda/n;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public static final enum d:Lda/n;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public static final enum e:Lda/n;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public static final enum f:Lda/n;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public static final enum g:Lda/n;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public static final enum h:Lda/n;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public static final enum i:Lda/n;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public static final enum j:Lda/n;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public static final enum k:Lda/n;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public static final enum l:Lda/n;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public static final enum m:Lda/n;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public static final synthetic n:[Lda/n;


# instance fields
.field public final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 15

    new-instance v0, Lda/n;

    const-string v1, "NOT_SUPPORTED_ERR"

    const/4 v2, 0x0

    const/16 v3, 0x9

    invoke-direct {v0, v1, v2, v3}, Lda/n;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lda/n;->b:Lda/n;

    new-instance v1, Lda/n;

    const-string v2, "INVALID_STATE_ERR"

    const/4 v4, 0x1

    const/16 v5, 0xb

    invoke-direct {v1, v2, v4, v5}, Lda/n;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lda/n;->c:Lda/n;

    new-instance v2, Lda/n;

    const/4 v4, 0x2

    const/16 v6, 0x12

    const-string v7, "SECURITY_ERR"

    invoke-direct {v2, v7, v4, v6}, Lda/n;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lda/n;->d:Lda/n;

    move v4, v3

    new-instance v3, Lda/n;

    const/4 v6, 0x3

    const/16 v7, 0x13

    const-string v8, "NETWORK_ERR"

    invoke-direct {v3, v8, v6, v7}, Lda/n;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lda/n;->e:Lda/n;

    move v6, v4

    new-instance v4, Lda/n;

    const/4 v7, 0x4

    const/16 v8, 0x14

    const-string v9, "ABORT_ERR"

    invoke-direct {v4, v9, v7, v8}, Lda/n;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lda/n;->f:Lda/n;

    move v7, v5

    new-instance v5, Lda/n;

    const/4 v8, 0x5

    const/16 v9, 0x17

    const-string v10, "TIMEOUT_ERR"

    invoke-direct {v5, v10, v8, v9}, Lda/n;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lda/n;->g:Lda/n;

    move v8, v6

    new-instance v6, Lda/n;

    const/4 v9, 0x6

    const/16 v10, 0x1b

    const-string v11, "ENCODING_ERR"

    invoke-direct {v6, v11, v9, v10}, Lda/n;-><init>(Ljava/lang/String;II)V

    sput-object v6, Lda/n;->h:Lda/n;

    move v9, v7

    new-instance v7, Lda/n;

    const/4 v10, 0x7

    const/16 v11, 0x1c

    const-string v12, "UNKNOWN_ERR"

    invoke-direct {v7, v12, v10, v11}, Lda/n;-><init>(Ljava/lang/String;II)V

    sput-object v7, Lda/n;->i:Lda/n;

    move v10, v8

    new-instance v8, Lda/n;

    const/16 v11, 0x8

    const/16 v12, 0x1d

    const-string v13, "CONSTRAINT_ERR"

    invoke-direct {v8, v13, v11, v12}, Lda/n;-><init>(Ljava/lang/String;II)V

    sput-object v8, Lda/n;->j:Lda/n;

    move v11, v9

    new-instance v9, Lda/n;

    const-string v12, "DATA_ERR"

    const/16 v13, 0x1e

    invoke-direct {v9, v12, v10, v13}, Lda/n;-><init>(Ljava/lang/String;II)V

    sput-object v9, Lda/n;->k:Lda/n;

    new-instance v10, Lda/n;

    const/16 v12, 0xa

    const/16 v13, 0x23

    const-string v14, "NOT_ALLOWED_ERR"

    invoke-direct {v10, v14, v12, v13}, Lda/n;-><init>(Ljava/lang/String;II)V

    sput-object v10, Lda/n;->l:Lda/n;

    move v12, v11

    new-instance v11, Lda/n;

    const-string v13, "ATTESTATION_NOT_PRIVATE_ERR"

    const/16 v14, 0x24

    invoke-direct {v11, v13, v12, v14}, Lda/n;-><init>(Ljava/lang/String;II)V

    sput-object v11, Lda/n;->m:Lda/n;

    filled-new-array/range {v0 .. v11}, [Lda/n;

    move-result-object v0

    sput-object v0, Lda/n;->n:[Lda/n;

    new-instance v0, Lda/c2;

    invoke-direct {v0}, Lda/c2;-><init>()V

    sput-object v0, Lda/n;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lda/n;->a:I

    return-void
.end method

.method public static k(I)Lda/n;
    .locals 5
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-static {}, Lda/n;->values()[Lda/n;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    iget v4, v3, Lda/n;->a:I

    if-ne p0, v4, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    new-instance v0, Lda/n$a;

    invoke-direct {v0, p0}, Lda/n$a;-><init>(I)V

    throw v0
.end method

.method public static valueOf(Ljava/lang/String;)Lda/n;
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const-class v0, Lda/n;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lda/n;

    return-object p0
.end method

.method public static values()[Lda/n;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    sget-object v0, Lda/n;->n:[Lda/n;

    invoke-virtual {v0}, [Lda/n;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lda/n;

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lda/n;->a:I

    return v0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0
    .param p1    # Landroid/os/Parcel;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget p2, p0, Lda/n;->a:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
