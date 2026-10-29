.class public final Lcom/google/android/gms/fido/fido2/api/common/zzq;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/fido/fido2/api/common/zzq;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final f:J

.field public final g:Leb/m3;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final h:Leb/m3;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final i:Leb/m3;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lca/f0;

    invoke-direct {v0}, Lca/f0;-><init>()V

    sput-object v0, Lcom/google/android/gms/fido/fido2/api/common/zzq;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(J[B[B[B)V
    .locals 2
    .param p3    # [B
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # [B
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p5    # [B
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {p3}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, [B

    sget-object v0, Leb/m3;->b:Leb/m3;

    array-length v0, p3

    const/4 v1, 0x0

    invoke-static {p3, v1, v0}, Leb/m3;->m([BII)Leb/m3;

    move-result-object p3

    invoke-static {p4}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, [B

    array-length v0, p4

    invoke-static {p4, v1, v0}, Leb/m3;->m([BII)Leb/m3;

    move-result-object p4

    invoke-static {p5}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p5

    check-cast p5, [B

    array-length v0, p5

    invoke-static {p5, v1, v0}, Leb/m3;->m([BII)Leb/m3;

    move-result-object p5

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput-wide p1, p0, Lcom/google/android/gms/fido/fido2/api/common/zzq;->f:J

    invoke-static {p3}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Leb/m3;

    iput-object p1, p0, Lcom/google/android/gms/fido/fido2/api/common/zzq;->g:Leb/m3;

    invoke-static {p4}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Leb/m3;

    iput-object p1, p0, Lcom/google/android/gms/fido/fido2/api/common/zzq;->h:Leb/m3;

    invoke-static {p5}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Leb/m3;

    iput-object p1, p0, Lcom/google/android/gms/fido/fido2/api/common/zzq;->i:Leb/m3;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    instance-of v0, p1, Lcom/google/android/gms/fido/fido2/api/common/zzq;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lcom/google/android/gms/fido/fido2/api/common/zzq;

    iget-wide v2, p0, Lcom/google/android/gms/fido/fido2/api/common/zzq;->f:J

    iget-wide v4, p1, Lcom/google/android/gms/fido/fido2/api/common/zzq;->f:J

    cmp-long v0, v2, v4

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/fido/fido2/api/common/zzq;->g:Leb/m3;

    iget-object v2, p1, Lcom/google/android/gms/fido/fido2/api/common/zzq;->g:Leb/m3;

    invoke-static {v0, v2}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/fido/fido2/api/common/zzq;->h:Leb/m3;

    iget-object v2, p1, Lcom/google/android/gms/fido/fido2/api/common/zzq;->h:Leb/m3;

    invoke-static {v0, v2}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/fido/fido2/api/common/zzq;->i:Leb/m3;

    iget-object p1, p1, Lcom/google/android/gms/fido/fido2/api/common/zzq;->i:Leb/m3;

    invoke-static {v0, p1}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final hashCode()I
    .locals 4

    iget-wide v0, p0, Lcom/google/android/gms/fido/fido2/api/common/zzq;->f:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/fido/fido2/api/common/zzq;->g:Leb/m3;

    iget-object v2, p0, Lcom/google/android/gms/fido/fido2/api/common/zzq;->h:Leb/m3;

    iget-object v3, p0, Lcom/google/android/gms/fido/fido2/api/common/zzq;->i:Leb/m3;

    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ln9/k;->c([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    iget-wide v0, p0, Lcom/google/android/gms/fido/fido2/api/common/zzq;->f:J

    invoke-static {p1}, Lo9/b;->a(Landroid/os/Parcel;)I

    move-result p2

    const/4 v2, 0x1

    invoke-static {p1, v2, v0, v1}, Lo9/b;->r(Landroid/os/Parcel;IJ)V

    iget-object v0, p0, Lcom/google/android/gms/fido/fido2/api/common/zzq;->g:Leb/m3;

    invoke-virtual {v0}, Leb/m3;->p()[B

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p1, v1, v0, v2}, Lo9/b;->g(Landroid/os/Parcel;I[BZ)V

    iget-object v0, p0, Lcom/google/android/gms/fido/fido2/api/common/zzq;->h:Leb/m3;

    invoke-virtual {v0}, Leb/m3;->p()[B

    move-result-object v0

    const/4 v1, 0x3

    invoke-static {p1, v1, v0, v2}, Lo9/b;->g(Landroid/os/Parcel;I[BZ)V

    iget-object v0, p0, Lcom/google/android/gms/fido/fido2/api/common/zzq;->i:Leb/m3;

    invoke-virtual {v0}, Leb/m3;->p()[B

    move-result-object v0

    const/4 v1, 0x4

    invoke-static {p1, v1, v0, v2}, Lo9/b;->g(Landroid/os/Parcel;I[BZ)V

    invoke-static {p1, p2}, Lo9/b;->b(Landroid/os/Parcel;I)V

    return-void
.end method
