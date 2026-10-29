.class public final Lcom/google/android/gms/games/PlayerRef;
.super Lda/m;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/games/Player;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ParcelCreator"
    }
.end annotation


# instance fields
.field public final d:Lja/b;

.field public final e:Lcom/google/android/gms/games/PlayerLevelInfo;

.field public final f:Lcom/google/android/gms/games/internal/player/zzc;

.field public final g:Lcom/google/android/gms/games/zzq;

.field public final h:Lcom/google/android/gms/games/zzc;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/data/DataHolder;ILjava/lang/String;)V
    .locals 9
    .param p1    # Lcom/google/android/gms/common/data/DataHolder;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0, p1, p2}, Lda/m;-><init>(Lcom/google/android/gms/common/data/DataHolder;I)V

    new-instance p3, Lja/b;

    const/4 v0, 0x0

    invoke-direct {p3, v0}, Lja/b;-><init>(Ljava/lang/String;)V

    iput-object p3, p0, Lcom/google/android/gms/games/PlayerRef;->d:Lja/b;

    new-instance v1, Lcom/google/android/gms/games/internal/player/zzc;

    invoke-direct {v1, p1, p2, p3}, Lcom/google/android/gms/games/internal/player/zzc;-><init>(Lcom/google/android/gms/common/data/DataHolder;ILja/b;)V

    iput-object v1, p0, Lcom/google/android/gms/games/PlayerRef;->f:Lcom/google/android/gms/games/internal/player/zzc;

    new-instance v1, Lcom/google/android/gms/games/zzq;

    invoke-direct {v1, p1, p2, p3}, Lcom/google/android/gms/games/zzq;-><init>(Lcom/google/android/gms/common/data/DataHolder;ILja/b;)V

    iput-object v1, p0, Lcom/google/android/gms/games/PlayerRef;->g:Lcom/google/android/gms/games/zzq;

    new-instance v1, Lcom/google/android/gms/games/zzc;

    invoke-direct {v1, p1, p2, p3}, Lcom/google/android/gms/games/zzc;-><init>(Lcom/google/android/gms/common/data/DataHolder;ILja/b;)V

    iput-object v1, p0, Lcom/google/android/gms/games/PlayerRef;->h:Lcom/google/android/gms/games/zzc;

    iget-object p1, p3, Lja/b;->k:Ljava/lang/String;

    invoke-virtual {p0, p1}, Lm9/d;->m(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_1

    :cond_0
    iget-object p1, p3, Lja/b;->k:Ljava/lang/String;

    invoke-virtual {p0, p1}, Lm9/d;->i(Ljava/lang/String;)J

    move-result-wide p1

    const-wide/16 v1, -0x1

    cmp-long p1, p1, v1

    if-eqz p1, :cond_2

    iget-object p1, p3, Lja/b;->l:Ljava/lang/String;

    invoke-virtual {p0, p1}, Lm9/d;->g(Ljava/lang/String;)I

    move-result v1

    iget-object p1, p3, Lja/b;->o:Ljava/lang/String;

    invoke-virtual {p0, p1}, Lm9/d;->g(Ljava/lang/String;)I

    move-result p1

    new-instance v0, Lcom/google/android/gms/games/PlayerLevel;

    iget-object p2, p3, Lja/b;->m:Ljava/lang/String;

    invoke-virtual {p0, p2}, Lm9/d;->i(Ljava/lang/String;)J

    move-result-wide v2

    iget-object p2, p3, Lja/b;->n:Ljava/lang/String;

    invoke-virtual {p0, p2}, Lm9/d;->i(Ljava/lang/String;)J

    move-result-wide v4

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/games/PlayerLevel;-><init>(IJJ)V

    if-eq v1, p1, :cond_1

    new-instance v2, Lcom/google/android/gms/games/PlayerLevel;

    iget-object p2, p3, Lja/b;->n:Ljava/lang/String;

    invoke-virtual {p0, p2}, Lm9/d;->i(Ljava/lang/String;)J

    move-result-wide v4

    iget-object p2, p3, Lja/b;->p:Ljava/lang/String;

    invoke-virtual {p0, p2}, Lm9/d;->i(Ljava/lang/String;)J

    move-result-wide v6

    move v3, p1

    invoke-direct/range {v2 .. v7}, Lcom/google/android/gms/games/PlayerLevel;-><init>(IJJ)V

    move-object v8, v2

    goto :goto_0

    :cond_1
    move-object v8, v0

    :goto_0
    new-instance v2, Lcom/google/android/gms/games/PlayerLevelInfo;

    iget-object p1, p3, Lja/b;->k:Ljava/lang/String;

    invoke-virtual {p0, p1}, Lm9/d;->i(Ljava/lang/String;)J

    move-result-wide v3

    iget-object p1, p3, Lja/b;->q:Ljava/lang/String;

    invoke-virtual {p0, p1}, Lm9/d;->i(Ljava/lang/String;)J

    move-result-wide v5

    move-object v7, v0

    invoke-direct/range {v2 .. v8}, Lcom/google/android/gms/games/PlayerLevelInfo;-><init>(JJLcom/google/android/gms/games/PlayerLevel;Lcom/google/android/gms/games/PlayerLevel;)V

    iput-object v2, p0, Lcom/google/android/gms/games/PlayerRef;->e:Lcom/google/android/gms/games/PlayerLevelInfo;

    return-void

    :cond_2
    :goto_1
    iput-object v0, p0, Lcom/google/android/gms/games/PlayerRef;->e:Lcom/google/android/gms/games/PlayerLevelInfo;

    return-void
.end method


# virtual methods
.method public final B()Landroid/net/Uri;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/games/PlayerRef;->d:Lja/b;

    iget-object v0, v0, Lja/b;->f:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lm9/d;->n(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method public final I1()Landroid/net/Uri;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/games/PlayerRef;->d:Lja/b;

    iget-object v0, v0, Lja/b;->C:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lm9/d;->n(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method public final a0()J
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/games/PlayerRef;->d:Lja/b;

    iget-object v0, v0, Lja/b;->h:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lm9/d;->i(Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final c()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/games/PlayerRef;->d:Lja/b;

    iget-object v0, v0, Lja/b;->M:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lm9/d;->k(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0, v0}, Lm9/d;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final d()J
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/games/PlayerRef;->d:Lja/b;

    iget-object v0, v0, Lja/b;->G:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lm9/d;->k(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0, v0}, Lm9/d;->m(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v0}, Lm9/d;->i(Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0

    :cond_1
    :goto_0
    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method public final d1()Lcom/google/android/gms/games/PlayerRelationshipInfo;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/games/PlayerRef;->g:Lcom/google/android/gms/games/zzq;

    invoke-virtual {v0}, Lcom/google/android/gms/games/zzq;->Y()I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/games/zzq;->zza()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/games/zzq;->zzb()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :cond_1
    :goto_0
    return-object v0
.end method

.method public final d2()Lcom/google/android/gms/games/CurrentPlayerInfo;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/games/PlayerRef;->h:Lcom/google/android/gms/games/zzc;

    invoke-virtual {v0}, Lcom/google/android/gms/games/zzc;->zza()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final e0()Landroid/net/Uri;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/games/PlayerRef;->d:Lja/b;

    iget-object v0, v0, Lja/b;->E:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lm9/d;->n(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/google/android/gms/games/PlayerEntity;->z3(Lcom/google/android/gms/games/Player;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public getBannerImageLandscapeUrl()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/games/PlayerRef;->d:Lja/b;

    iget-object v0, v0, Lja/b;->D:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lm9/d;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getBannerImagePortraitUrl()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/games/PlayerRef;->d:Lja/b;

    iget-object v0, v0, Lja/b;->F:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lm9/d;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getHiResImageUrl()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/games/PlayerRef;->d:Lja/b;

    iget-object v0, v0, Lja/b;->g:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lm9/d;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getIconImageUrl()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/games/PlayerRef;->d:Lja/b;

    iget-object v0, v0, Lja/b;->e:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lm9/d;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/games/PlayerRef;->d:Lja/b;

    iget-object v0, v0, Lja/b;->r:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lm9/d;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final h()Landroid/net/Uri;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/games/PlayerRef;->d:Lja/b;

    iget-object v0, v0, Lja/b;->d:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lm9/d;->n(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/games/PlayerEntity;->y3(Lcom/google/android/gms/games/Player;)I

    move-result v0

    return v0
.end method

.method public final k3()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/games/PlayerRef;->d:Lja/b;

    iget-object v0, v0, Lja/b;->a:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lm9/d;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final l()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/games/PlayerRef;->d:Lja/b;

    iget-object v0, v0, Lja/b;->c:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lm9/d;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final r0()J
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/games/PlayerRef;->d:Lja/b;

    iget-object v0, v0, Lja/b;->j:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lm9/d;->k(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0, v0}, Lm9/d;->m(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v0}, Lm9/d;->i(Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0

    :cond_1
    :goto_0
    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-static {p0}, Lcom/google/android/gms/games/PlayerEntity;->A3(Lcom/google/android/gms/games/Player;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 1
    .param p1    # Landroid/os/Parcel;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lcom/google/android/gms/games/PlayerEntity;

    invoke-direct {v0, p0}, Lcom/google/android/gms/games/PlayerEntity;-><init>(Lcom/google/android/gms/games/Player;)V

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/games/PlayerEntity;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method

.method public final z0()Lcom/google/android/gms/games/PlayerLevelInfo;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/games/PlayerRef;->e:Lcom/google/android/gms/games/PlayerLevelInfo;

    return-object v0
.end method

.method public final zza()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/games/PlayerRef;->d:Lja/b;

    iget-object v0, v0, Lja/b;->b:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lda/m;->p(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final zzb()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/games/PlayerRef;->d:Lja/b;

    iget-object v0, v0, Lja/b;->A:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lm9/d;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final zzc()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/games/PlayerRef;->d:Lja/b;

    iget-object v0, v0, Lja/b;->B:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lm9/d;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final zzd()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/PlayerRef;->d:Lja/b;

    iget-object v0, v0, Lja/b;->z:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lm9/d;->a(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public final zze()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/PlayerRef;->d:Lja/b;

    iget-object v0, v0, Lja/b;->i:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lm9/d;->g(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public final zzf()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/PlayerRef;->d:Lja/b;

    iget-object v0, v0, Lja/b;->s:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lm9/d;->a(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public final zzh()Lcom/google/android/gms/games/internal/player/zza;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/PlayerRef;->d:Lja/b;

    iget-object v0, v0, Lja/b;->t:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lm9/d;->m(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/games/PlayerRef;->f:Lcom/google/android/gms/games/internal/player/zzc;

    return-object v0
.end method
