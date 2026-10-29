.class public final Lcom/google/android/gms/fido/fido2/api/common/zzai;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/fido/fido2/api/common/zzai;",
            ">;"
        }
    .end annotation
.end field

.field public static final j:Leb/e4;

.field public static final k:Leb/e4;

.field public static final l:Leb/e4;

.field public static final m:Leb/e4;


# instance fields
.field public final f:Leb/m3;

.field public final g:Leb/m3;

.field public final h:Leb/m3;

.field public final i:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lca/h;

    invoke-direct {v0}, Lca/h;-><init>()V

    sput-object v0, Lcom/google/android/gms/fido/fido2/api/common/zzai;->CREATOR:Landroid/os/Parcelable$Creator;

    const-wide/16 v0, 0x1

    invoke-static {v0, v1}, Leb/e4;->h(J)Leb/z3;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/fido/fido2/api/common/zzai;->j:Leb/e4;

    const-wide/16 v0, 0x2

    invoke-static {v0, v1}, Leb/e4;->h(J)Leb/z3;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/fido/fido2/api/common/zzai;->k:Leb/e4;

    const-wide/16 v0, 0x3

    invoke-static {v0, v1}, Leb/e4;->h(J)Leb/z3;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/fido/fido2/api/common/zzai;->l:Leb/e4;

    const-wide/16 v0, 0x4

    invoke-static {v0, v1}, Leb/e4;->h(J)Leb/z3;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/fido/fido2/api/common/zzai;->m:Leb/e4;

    return-void
.end method

.method public constructor <init>(Leb/m3;Leb/m3;Leb/m3;I)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/fido/fido2/api/common/zzai;->f:Leb/m3;

    iput-object p2, p0, Lcom/google/android/gms/fido/fido2/api/common/zzai;->g:Leb/m3;

    iput-object p3, p0, Lcom/google/android/gms/fido/fido2/api/common/zzai;->h:Leb/m3;

    iput p4, p0, Lcom/google/android/gms/fido/fido2/api/common/zzai;->i:I

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lcom/google/android/gms/fido/fido2/api/common/zzai;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lcom/google/android/gms/fido/fido2/api/common/zzai;

    iget-object v0, p0, Lcom/google/android/gms/fido/fido2/api/common/zzai;->f:Leb/m3;

    iget-object v2, p1, Lcom/google/android/gms/fido/fido2/api/common/zzai;->f:Leb/m3;

    invoke-static {v0, v2}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/fido/fido2/api/common/zzai;->g:Leb/m3;

    iget-object v2, p1, Lcom/google/android/gms/fido/fido2/api/common/zzai;->g:Leb/m3;

    invoke-static {v0, v2}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/fido/fido2/api/common/zzai;->h:Leb/m3;

    iget-object v2, p1, Lcom/google/android/gms/fido/fido2/api/common/zzai;->h:Leb/m3;

    invoke-static {v0, v2}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/google/android/gms/fido/fido2/api/common/zzai;->i:I

    iget p1, p1, Lcom/google/android/gms/fido/fido2/api/common/zzai;->i:I

    if-ne v0, p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/fido/fido2/api/common/zzai;->f:Leb/m3;

    iget-object v1, p0, Lcom/google/android/gms/fido/fido2/api/common/zzai;->g:Leb/m3;

    iget-object v2, p0, Lcom/google/android/gms/fido/fido2/api/common/zzai;->h:Leb/m3;

    iget v3, p0, Lcom/google/android/gms/fido/fido2/api/common/zzai;->i:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ln9/k;->c([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    invoke-virtual {p0}, Lcom/google/android/gms/fido/fido2/api/common/zzai;->v3()[B

    move-result-object v0

    invoke-static {v0}, Lu9/c;->b([B)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/fido/fido2/api/common/zzai;->x3()[B

    move-result-object v1

    invoke-static {v1}, Lu9/c;->b([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/android/gms/fido/fido2/api/common/zzai;->w3()[B

    move-result-object v2

    invoke-static {v2}, Lu9/c;->b([B)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "HmacSecretExtension{coseKeyAgreement="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", saltEnc="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", saltAuth="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", getPinUvAuthProtocol="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lcom/google/android/gms/fido/fido2/api/common/zzai;->i:I

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "}"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final v3()[B
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fido/fido2/api/common/zzai;->f:Leb/m3;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {v0}, Leb/m3;->p()[B

    move-result-object v0

    return-object v0
.end method

.method public final w3()[B
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fido/fido2/api/common/zzai;->h:Leb/m3;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {v0}, Leb/m3;->p()[B

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    invoke-static {p1}, Lo9/b;->a(Landroid/os/Parcel;)I

    move-result p2

    invoke-virtual {p0}, Lcom/google/android/gms/fido/fido2/api/common/zzai;->v3()[B

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p1, v1, v0, v2}, Lo9/b;->g(Landroid/os/Parcel;I[BZ)V

    const/4 v0, 0x2

    invoke-virtual {p0}, Lcom/google/android/gms/fido/fido2/api/common/zzai;->x3()[B

    move-result-object v1

    invoke-static {p1, v0, v1, v2}, Lo9/b;->g(Landroid/os/Parcel;I[BZ)V

    const/4 v0, 0x3

    invoke-virtual {p0}, Lcom/google/android/gms/fido/fido2/api/common/zzai;->w3()[B

    move-result-object v1

    invoke-static {p1, v0, v1, v2}, Lo9/b;->g(Landroid/os/Parcel;I[BZ)V

    const/4 v0, 0x4

    iget v1, p0, Lcom/google/android/gms/fido/fido2/api/common/zzai;->i:I

    invoke-static {p1, v0, v1}, Lo9/b;->n(Landroid/os/Parcel;II)V

    invoke-static {p1, p2}, Lo9/b;->b(Landroid/os/Parcel;I)V

    return-void
.end method

.method public final x3()[B
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fido/fido2/api/common/zzai;->g:Leb/m3;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {v0}, Leb/m3;->p()[B

    move-result-object v0

    return-object v0
.end method
