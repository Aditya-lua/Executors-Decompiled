.class public Lcom/google/android/gms/drive/DriveId;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/common/internal/ReflectedParcelable;


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/drive/DriveId;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final f:Ljava/lang/String;

.field public final g:J

.field public final h:J

.field public final i:I

.field public volatile j:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lx9/b;

    invoke-direct {v0}, Lx9/b;-><init>()V

    sput-object v0, Lcom/google/android/gms/drive/DriveId;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;JJI)V
    .locals 4

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/drive/DriveId;->j:Ljava/lang/String;

    iput-object p1, p0, Lcom/google/android/gms/drive/DriveId;->f:Ljava/lang/String;

    const-string v0, ""

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    invoke-static {v0}, Ln9/m;->a(Z)V

    if-nez p1, :cond_1

    const-wide/16 v2, -0x1

    cmp-long p1, p2, v2

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    move-wide p2, v2

    :cond_1
    :goto_0
    invoke-static {v1}, Ln9/m;->a(Z)V

    iput-wide p2, p0, Lcom/google/android/gms/drive/DriveId;->g:J

    iput-wide p4, p0, Lcom/google/android/gms/drive/DriveId;->h:J

    iput p6, p0, Lcom/google/android/gms/drive/DriveId;->i:I

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x0

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-class v2, Lcom/google/android/gms/drive/DriveId;

    if-eq v1, v2, :cond_0

    goto :goto_2

    :cond_0
    check-cast p1, Lcom/google/android/gms/drive/DriveId;

    iget-wide v1, p1, Lcom/google/android/gms/drive/DriveId;->h:J

    iget-wide v3, p0, Lcom/google/android/gms/drive/DriveId;->h:J

    cmp-long v1, v1, v3

    if-eqz v1, :cond_1

    return v0

    :cond_1
    iget-wide v1, p1, Lcom/google/android/gms/drive/DriveId;->g:J

    const-wide/16 v3, -0x1

    cmp-long v5, v1, v3

    if-nez v5, :cond_3

    iget-wide v1, p0, Lcom/google/android/gms/drive/DriveId;->g:J

    cmp-long v1, v1, v3

    if-eqz v1, :cond_2

    move-wide v1, v3

    goto :goto_0

    :cond_2
    iget-object p1, p1, Lcom/google/android/gms/drive/DriveId;->f:Ljava/lang/String;

    invoke-static {p1}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iget-object v0, p0, Lcom/google/android/gms/drive/DriveId;->f:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_3
    :goto_0
    iget-object v3, p0, Lcom/google/android/gms/drive/DriveId;->f:Ljava/lang/String;

    const/4 v4, 0x1

    if-eqz v3, :cond_6

    iget-object p1, p1, Lcom/google/android/gms/drive/DriveId;->f:Ljava/lang/String;

    if-nez p1, :cond_4

    goto :goto_1

    :cond_4
    iget-wide v5, p0, Lcom/google/android/gms/drive/DriveId;->g:J

    cmp-long v1, v1, v5

    if-nez v1, :cond_5

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    return v4

    :cond_5
    return v0

    :cond_6
    :goto_1
    iget-wide v5, p0, Lcom/google/android/gms/drive/DriveId;->g:J

    cmp-long p1, v1, v5

    if-nez p1, :cond_7

    return v4

    :cond_7
    :goto_2
    return v0
.end method

.method public final hashCode()I
    .locals 6

    iget-wide v0, p0, Lcom/google/android/gms/drive/DriveId;->g:J

    const-wide/16 v2, -0x1

    cmp-long v2, v0, v2

    if-nez v2, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/drive/DriveId;->f:Ljava/lang/String;

    invoke-static {v0}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0

    :cond_0
    iget-wide v2, p0, Lcom/google/android/gms/drive/DriveId;->h:J

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    new-instance v5, Ljava/lang/StringBuilder;

    add-int/2addr v1, v4

    invoke-direct {v5, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v5, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3
    .param p1    # Landroid/os/Parcel;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object p2, p0, Lcom/google/android/gms/drive/DriveId;->f:Ljava/lang/String;

    invoke-static {p1}, Lo9/b;->a(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p1, v1, p2, v2}, Lo9/b;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 p2, 0x3

    iget-wide v1, p0, Lcom/google/android/gms/drive/DriveId;->g:J

    invoke-static {p1, p2, v1, v2}, Lo9/b;->r(Landroid/os/Parcel;IJ)V

    const/4 p2, 0x4

    iget-wide v1, p0, Lcom/google/android/gms/drive/DriveId;->h:J

    invoke-static {p1, p2, v1, v2}, Lo9/b;->r(Landroid/os/Parcel;IJ)V

    const/4 p2, 0x5

    iget v1, p0, Lcom/google/android/gms/drive/DriveId;->i:I

    invoke-static {p1, p2, v1}, Lo9/b;->n(Landroid/os/Parcel;II)V

    invoke-static {p1, v0}, Lo9/b;->b(Landroid/os/Parcel;I)V

    return-void
.end method
