.class public final Lea/r;
.super Lea/v;
.source "SourceFile"

# interfaces
.implements Lea/d;


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

    iput-object p3, p0, Lea/r;->d:Lka/e;

    return-void
.end method


# virtual methods
.method public final C1()I
    .locals 2

    iget-object v0, p0, Lea/r;->d:Lka/e;

    iget-object v0, v0, Lka/e;->L:Ljava/lang/String;

    const/4 v1, 0x0

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

    invoke-static {p0, p1}, Lea/p;->A3(Lea/d;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final synthetic freeze()Ljava/lang/Object;
    .locals 1

    new-instance v0, Lea/p;

    invoke-direct {v0, p0}, Lea/p;-><init>(Lea/d;)V

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    invoke-static {p0}, Lea/p;->a(Lea/d;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Lea/p;->B3(Lea/d;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    new-instance v0, Lea/p;

    invoke-direct {v0, p0}, Lea/p;-><init>(Lea/d;)V

    invoke-static {v0, p1, p2}, Lea/q;->a(Lea/p;Landroid/os/Parcel;I)V

    return-void
.end method

.method public final zza()Z
    .locals 2

    iget-object v0, p0, Lea/r;->d:Lka/e;

    iget-object v0, v0, Lka/e;->L:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ln9/d;->k(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0, v0}, Ln9/d;->l(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
