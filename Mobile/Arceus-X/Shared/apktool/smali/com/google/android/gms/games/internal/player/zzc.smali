.class public final Lcom/google/android/gms/games/internal/player/zzc;
.super Lm9/d;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/games/internal/player/zza;


# instance fields
.field public final d:Lja/b;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/data/DataHolder;ILja/b;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lm9/d;-><init>(Lcom/google/android/gms/common/data/DataHolder;I)V

    iput-object p3, p0, Lcom/google/android/gms/games/internal/player/zzc;->d:Lja/b;

    return-void
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;->v3(Lcom/google/android/gms/games/internal/player/zza;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;->a(Lcom/google/android/gms/games/internal/player/zza;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;->w3(Lcom/google/android/gms/games/internal/player/zza;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;

    invoke-direct {v0, p0}, Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;-><init>(Lcom/google/android/gms/games/internal/player/zza;)V

    invoke-static {v0, p1, p2}, Lja/a;->a(Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;Landroid/os/Parcel;I)V

    return-void
.end method

.method public final zza()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/internal/player/zzc;->d:Lja/b;

    iget-object v0, v0, Lja/b;->t:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lm9/d;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final zzb()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/internal/player/zzc;->d:Lja/b;

    iget-object v0, v0, Lja/b;->u:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lm9/d;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final zzc()J
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/games/internal/player/zzc;->d:Lja/b;

    iget-object v0, v0, Lja/b;->v:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lm9/d;->i(Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final zzd()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/internal/player/zzc;->d:Lja/b;

    iget-object v0, v0, Lja/b;->w:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lm9/d;->n(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method public final zze()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/internal/player/zzc;->d:Lja/b;

    iget-object v0, v0, Lja/b;->x:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lm9/d;->n(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method public final zzf()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/internal/player/zzc;->d:Lja/b;

    iget-object v0, v0, Lja/b;->y:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lm9/d;->n(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method
