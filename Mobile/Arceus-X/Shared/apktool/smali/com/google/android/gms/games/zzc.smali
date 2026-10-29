.class public final Lcom/google/android/gms/games/zzc;
.super Lda/m;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/games/CurrentPlayerInfo;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ParcelCreator"
    }
.end annotation


# instance fields
.field public final d:Lja/b;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/data/DataHolder;ILja/b;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lda/m;-><init>(Lcom/google/android/gms/common/data/DataHolder;I)V

    iput-object p3, p0, Lcom/google/android/gms/games/zzc;->d:Lja/b;

    return-void
.end method


# virtual methods
.method public final B1()I
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/games/zzc;->d:Lja/b;

    iget-object v0, v0, Lja/b;->L:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lda/m;->q(Ljava/lang/String;I)I

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

    invoke-static {p0, p1}, Lcom/google/android/gms/games/zza;->v3(Lcom/google/android/gms/games/CurrentPlayerInfo;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final synthetic freeze()Ljava/lang/Object;
    .locals 1

    new-instance v0, Lcom/google/android/gms/games/zza;

    invoke-direct {v0, p0}, Lcom/google/android/gms/games/zza;-><init>(Lcom/google/android/gms/games/CurrentPlayerInfo;)V

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/games/zza;->a(Lcom/google/android/gms/games/CurrentPlayerInfo;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/games/zza;->w3(Lcom/google/android/gms/games/CurrentPlayerInfo;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/games/zza;

    invoke-direct {v0, p0}, Lcom/google/android/gms/games/zza;-><init>(Lcom/google/android/gms/games/CurrentPlayerInfo;)V

    invoke-static {v0, p1, p2}, Lda/i;->a(Lcom/google/android/gms/games/zza;Landroid/os/Parcel;I)V

    return-void
.end method

.method public final zza()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/games/zzc;->d:Lja/b;

    iget-object v0, v0, Lja/b;->L:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lm9/d;->k(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0, v0}, Lm9/d;->m(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
