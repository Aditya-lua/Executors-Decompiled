.class public final Lib/p;
.super Lp9/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lib/p;",
            ">;"
        }
    .end annotation
.end field

.field public static final q:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lo9/e;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final f:Lcom/google/android/gms/location/LocationRequest;

.field public final g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lo9/e;",
            ">;"
        }
    .end annotation
.end field

.field public final h:Ljava/lang/String;

.field public final i:Z

.field public final j:Z

.field public final k:Z

.field public final l:Ljava/lang/String;

.field public final m:Z

.field public n:Z

.field public o:Ljava/lang/String;

.field public p:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    sput-object v0, Lib/p;->q:Ljava/util/List;

    new-instance v0, Lib/q;

    invoke-direct {v0}, Lib/q;-><init>()V

    sput-object v0, Lib/p;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/location/LocationRequest;Ljava/util/List;Ljava/lang/String;ZZZLjava/lang/String;ZZLjava/lang/String;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/location/LocationRequest;",
            "Ljava/util/List<",
            "Lo9/e;",
            ">;",
            "Ljava/lang/String;",
            "ZZZ",
            "Ljava/lang/String;",
            "ZZ",
            "Ljava/lang/String;",
            "J)V"
        }
    .end annotation

    invoke-direct {p0}, Lp9/a;-><init>()V

    iput-object p1, p0, Lib/p;->f:Lcom/google/android/gms/location/LocationRequest;

    iput-object p2, p0, Lib/p;->g:Ljava/util/List;

    iput-object p3, p0, Lib/p;->h:Ljava/lang/String;

    iput-boolean p4, p0, Lib/p;->i:Z

    iput-boolean p5, p0, Lib/p;->j:Z

    iput-boolean p6, p0, Lib/p;->k:Z

    iput-object p7, p0, Lib/p;->l:Ljava/lang/String;

    iput-boolean p8, p0, Lib/p;->m:Z

    iput-boolean p9, p0, Lib/p;->n:Z

    iput-object p10, p0, Lib/p;->o:Ljava/lang/String;

    iput-wide p11, p0, Lib/p;->p:J

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lib/p;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Lib/p;

    iget-object v0, p0, Lib/p;->f:Lcom/google/android/gms/location/LocationRequest;

    iget-object v2, p1, Lib/p;->f:Lcom/google/android/gms/location/LocationRequest;

    invoke-static {v0, v2}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lib/p;->g:Ljava/util/List;

    iget-object v2, p1, Lib/p;->g:Ljava/util/List;

    invoke-static {v0, v2}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lib/p;->h:Ljava/lang/String;

    iget-object v2, p1, Lib/p;->h:Ljava/lang/String;

    invoke-static {v0, v2}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lib/p;->i:Z

    iget-boolean v2, p1, Lib/p;->i:Z

    if-ne v0, v2, :cond_0

    iget-boolean v0, p0, Lib/p;->j:Z

    iget-boolean v2, p1, Lib/p;->j:Z

    if-ne v0, v2, :cond_0

    iget-boolean v0, p0, Lib/p;->k:Z

    iget-boolean v2, p1, Lib/p;->k:Z

    if-ne v0, v2, :cond_0

    iget-object v0, p0, Lib/p;->l:Ljava/lang/String;

    iget-object v2, p1, Lib/p;->l:Ljava/lang/String;

    invoke-static {v0, v2}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lib/p;->m:Z

    iget-boolean v2, p1, Lib/p;->m:Z

    if-ne v0, v2, :cond_0

    iget-boolean v0, p0, Lib/p;->n:Z

    iget-boolean v2, p1, Lib/p;->n:Z

    if-ne v0, v2, :cond_0

    iget-object v0, p0, Lib/p;->o:Ljava/lang/String;

    iget-object p1, p1, Lib/p;->o:Ljava/lang/String;

    invoke-static {v0, p1}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lib/p;->f:Lcom/google/android/gms/location/LocationRequest;

    invoke-virtual {v0}, Lcom/google/android/gms/location/LocationRequest;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lib/p;->f:Lcom/google/android/gms/location/LocationRequest;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lib/p;->h:Ljava/lang/String;

    if-eqz v1, :cond_0

    const-string v1, " tag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lib/p;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    iget-object v1, p0, Lib/p;->l:Ljava/lang/String;

    if-eqz v1, :cond_1

    const-string v1, " moduleId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lib/p;->l:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    iget-object v1, p0, Lib/p;->o:Ljava/lang/String;

    if-eqz v1, :cond_2

    const-string v1, " contextAttributionTag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lib/p;->o:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    const-string v1, " hideAppOps="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lib/p;->i:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, " clients="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lib/p;->g:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " forceCoarseLocation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lib/p;->j:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lib/p;->k:Z

    if-eqz v1, :cond_3

    const-string v1, " exemptFromBackgroundThrottle"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3
    iget-boolean v1, p0, Lib/p;->m:Z

    if-eqz v1, :cond_4

    const-string v1, " locationSettingsIgnored"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_4
    iget-boolean v1, p0, Lib/p;->n:Z

    if-eqz v1, :cond_5

    const-string v1, " inaccurateLocationsDelayed"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_5
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Lp9/c;->a(Landroid/os/Parcel;)I

    move-result v0

    iget-object v1, p0, Lib/p;->f:Lcom/google/android/gms/location/LocationRequest;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, p2, v3}, Lp9/c;->t(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/4 p2, 0x5

    iget-object v1, p0, Lib/p;->g:Ljava/util/List;

    invoke-static {p1, p2, v1, v3}, Lp9/c;->z(Landroid/os/Parcel;ILjava/util/List;Z)V

    const/4 p2, 0x6

    iget-object v1, p0, Lib/p;->h:Ljava/lang/String;

    invoke-static {p1, p2, v1, v3}, Lp9/c;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 p2, 0x7

    iget-boolean v1, p0, Lib/p;->i:Z

    invoke-static {p1, p2, v1}, Lp9/c;->c(Landroid/os/Parcel;IZ)V

    const/16 p2, 0x8

    iget-boolean v1, p0, Lib/p;->j:Z

    invoke-static {p1, p2, v1}, Lp9/c;->c(Landroid/os/Parcel;IZ)V

    const/16 p2, 0x9

    iget-boolean v1, p0, Lib/p;->k:Z

    invoke-static {p1, p2, v1}, Lp9/c;->c(Landroid/os/Parcel;IZ)V

    const/16 p2, 0xa

    iget-object v1, p0, Lib/p;->l:Ljava/lang/String;

    invoke-static {p1, p2, v1, v3}, Lp9/c;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/16 p2, 0xb

    iget-boolean v1, p0, Lib/p;->m:Z

    invoke-static {p1, p2, v1}, Lp9/c;->c(Landroid/os/Parcel;IZ)V

    const/16 p2, 0xc

    iget-boolean v1, p0, Lib/p;->n:Z

    invoke-static {p1, p2, v1}, Lp9/c;->c(Landroid/os/Parcel;IZ)V

    const/16 p2, 0xd

    iget-object v1, p0, Lib/p;->o:Ljava/lang/String;

    invoke-static {p1, p2, v1, v3}, Lp9/c;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/16 p2, 0xe

    iget-wide v1, p0, Lib/p;->p:J

    invoke-static {p1, p2, v1, v2}, Lp9/c;->r(Landroid/os/Parcel;IJ)V

    invoke-static {p1, v0}, Lp9/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
