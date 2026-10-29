.class public final Lcom/google/android/gms/common/api/ApiMetadata;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/common/api/ApiMetadata$a;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/common/api/ApiMetadata;",
            ">;"
        }
    .end annotation
.end field

.field public static final i:Lcom/google/android/gms/common/api/ApiMetadata;

.field public static final j:Lcom/google/android/gms/common/api/ApiMetadata;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# instance fields
.field public final f:Lcom/google/android/gms/common/api/ComplianceOptions;

.field public final g:Z

.field public h:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    invoke-static {}, Lk9/t;->a()Lk9/t;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/common/api/ApiMetadata;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {}, Lcom/google/android/gms/common/api/ApiMetadata;->w3()Lcom/google/android/gms/common/api/ApiMetadata$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/ApiMetadata$a;->a()Lcom/google/android/gms/common/api/ApiMetadata;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/common/api/ApiMetadata;->i:Lcom/google/android/gms/common/api/ApiMetadata;

    invoke-static {}, Lcom/google/android/gms/common/api/ApiMetadata;->w3()Lcom/google/android/gms/common/api/ApiMetadata$a;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/ApiMetadata$a;->c(Z)Lcom/google/android/gms/common/api/ApiMetadata$a;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/ApiMetadata$a;->a()Lcom/google/android/gms/common/api/ApiMetadata;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/common/api/ApiMetadata;->j:Lcom/google/android/gms/common/api/ApiMetadata;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/common/api/ComplianceOptions;Z)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/common/api/ApiMetadata;->f:Lcom/google/android/gms/common/api/ComplianceOptions;

    iput-boolean p2, p0, Lcom/google/android/gms/common/api/ApiMetadata;->g:Z

    return-void
.end method

.method public static final a(Lcom/google/android/gms/common/api/ComplianceOptions;)Lcom/google/android/gms/common/api/ApiMetadata;
    .locals 1
    .param p0    # Lcom/google/android/gms/common/api/ComplianceOptions;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-static {}, Lcom/google/android/gms/common/api/ApiMetadata;->w3()Lcom/google/android/gms/common/api/ApiMetadata$a;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/common/api/ApiMetadata$a;->b(Lcom/google/android/gms/common/api/ComplianceOptions;)Lcom/google/android/gms/common/api/ApiMetadata$a;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/ApiMetadata$a;->a()Lcom/google/android/gms/common/api/ApiMetadata;

    move-result-object p0

    return-object p0
.end method

.method public static final v3()Lcom/google/android/gms/common/api/ApiMetadata;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    sget-object v0, Lcom/google/android/gms/common/api/ApiMetadata;->i:Lcom/google/android/gms/common/api/ApiMetadata;

    return-object v0
.end method

.method public static w3()Lcom/google/android/gms/common/api/ApiMetadata$a;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lcom/google/android/gms/common/api/ApiMetadata$a;

    invoke-direct {v0}, Lcom/google/android/gms/common/api/ApiMetadata$a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lcom/google/android/gms/common/api/ApiMetadata;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lcom/google/android/gms/common/api/ApiMetadata;

    iget-object v0, p0, Lcom/google/android/gms/common/api/ApiMetadata;->f:Lcom/google/android/gms/common/api/ComplianceOptions;

    iget-object v2, p1, Lcom/google/android/gms/common/api/ApiMetadata;->f:Lcom/google/android/gms/common/api/ComplianceOptions;

    invoke-static {v0, v2}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/google/android/gms/common/api/ApiMetadata;->h:Z

    iget-boolean v2, p1, Lcom/google/android/gms/common/api/ApiMetadata;->h:Z

    if-ne v0, v2, :cond_1

    iget-boolean v0, p0, Lcom/google/android/gms/common/api/ApiMetadata;->g:Z

    iget-boolean p1, p1, Lcom/google/android/gms/common/api/ApiMetadata;->g:Z

    if-ne v0, p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/common/api/ApiMetadata;->f:Lcom/google/android/gms/common/api/ComplianceOptions;

    iget-boolean v1, p0, Lcom/google/android/gms/common/api/ApiMetadata;->h:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iget-boolean v2, p0, Lcom/google/android/gms/common/api/ApiMetadata;->g:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    filled-new-array {v0, v1, v2}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ln9/k;->c([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/common/api/ApiMetadata;->f:Lcom/google/android/gms/common/api/ComplianceOptions;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    add-int/lit8 v1, v1, 0x1f

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "ApiMetadata(complianceOptions="

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4
    .param p1    # Landroid/os/Parcel;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-boolean v0, p0, Lcom/google/android/gms/common/api/ApiMetadata;->h:Z

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    move-result p2

    add-int/lit8 p2, p2, -0x4

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->setDataPosition(I)V

    invoke-virtual {p1}, Landroid/os/Parcel;->dataSize()I

    move-result p2

    add-int/lit8 p2, p2, -0x4

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->setDataSize(I)V

    return-void

    :cond_0
    const v0, -0xc2a5d3a

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-static {p1}, Lo9/b;->a(Landroid/os/Parcel;)I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/common/api/ApiMetadata;->f:Lcom/google/android/gms/common/api/ComplianceOptions;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {p1, v3, v1, p2, v2}, Lo9/b;->t(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/4 p2, 0x2

    iget-boolean v1, p0, Lcom/google/android/gms/common/api/ApiMetadata;->g:Z

    invoke-static {p1, p2, v1}, Lo9/b;->c(Landroid/os/Parcel;IZ)V

    invoke-static {p1, v0}, Lo9/b;->b(Landroid/os/Parcel;I)V

    return-void
.end method

.method public final synthetic x3(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/common/api/ApiMetadata;->h:Z

    return-void
.end method
