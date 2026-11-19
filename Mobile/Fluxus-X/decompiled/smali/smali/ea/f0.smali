.class public final Lea/f0;
.super Lea/v;
.source "SourceFile"

# interfaces
.implements Lea/o;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ParcelCreator"
    }
.end annotation


# instance fields
.field public final d:Lka/e;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/data/DataHolder;ILka/e;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lea/v;-><init>(Lcom/google/android/gms/common/data/DataHolder;I)V

    iput-object p3, p0, Lea/f0;->d:Lka/e;

    return-void
.end method


# virtual methods
.method public final c0()I
    .locals 2

    iget-object v0, p0, Lea/f0;->d:Lka/e;

    iget-object v0, v0, Lka/e;->H:Ljava/lang/String;

    const/4 v1, -0x1

    invoke-virtual {p0, v0, v1}, Lea/v;->q(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, Lea/d0;->A3(Lea/o;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final synthetic freeze()Ljava/lang/Object;
    .locals 1

    new-instance v0, Lea/d0;

    invoke-direct {v0, p0}, Lea/d0;-><init>(Lea/o;)V

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    invoke-static {p0}, Lea/d0;->a(Lea/o;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Lea/d0;->B3(Lea/o;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    new-instance v0, Lea/d0;

    invoke-direct {v0, p0}, Lea/d0;-><init>(Lea/o;)V

    invoke-static {v0, p1, p2}, Lea/e0;->a(Lea/d0;Landroid/os/Parcel;I)V

    return-void
.end method

.method public final zza()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lea/f0;->d:Lka/e;

    iget-object v0, v0, Lka/e;->I:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lea/v;->p(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final zzb()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lea/f0;->d:Lka/e;

    iget-object v0, v0, Lka/e;->J:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lea/v;->p(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final zzc()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lea/f0;->d:Lka/e;

    iget-object v0, v0, Lka/e;->K:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lea/v;->p(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
