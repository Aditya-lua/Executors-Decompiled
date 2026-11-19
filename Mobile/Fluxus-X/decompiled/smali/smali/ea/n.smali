.class public final Lea/n;
.super Lea/v;
.source "SourceFile"

# interfaces
.implements Lea/k;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ParcelCreator"
    }
.end annotation


# instance fields
.field public final d:Lka/e;

.field public final e:Lea/m;

.field public final f:Lka/d;

.field public final g:Lea/f0;

.field public final h:Lea/r;


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

    invoke-direct {p0, p1, p2}, Lea/v;-><init>(Lcom/google/android/gms/common/data/DataHolder;I)V

    new-instance p3, Lka/e;

    const/4 v0, 0x0

    invoke-direct {p3, v0}, Lka/e;-><init>(Ljava/lang/String;)V

    iput-object p3, p0, Lea/n;->d:Lka/e;

    new-instance v1, Lka/d;

    invoke-direct {v1, p1, p2, p3}, Lka/d;-><init>(Lcom/google/android/gms/common/data/DataHolder;ILka/e;)V

    iput-object v1, p0, Lea/n;->f:Lka/d;

    new-instance v1, Lea/f0;

    invoke-direct {v1, p1, p2, p3}, Lea/f0;-><init>(Lcom/google/android/gms/common/data/DataHolder;ILka/e;)V

    iput-object v1, p0, Lea/n;->g:Lea/f0;

    new-instance v1, Lea/r;

    invoke-direct {v1, p1, p2, p3}, Lea/r;-><init>(Lcom/google/android/gms/common/data/DataHolder;ILka/e;)V

    iput-object v1, p0, Lea/n;->h:Lea/r;

    iget-object p1, p3, Lka/e;->k:Ljava/lang/String;

    invoke-virtual {p0, p1}, Ln9/d;->l(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_1

    :cond_0
    iget-object p1, p3, Lka/e;->k:Ljava/lang/String;

    invoke-virtual {p0, p1}, Ln9/d;->i(Ljava/lang/String;)J

    move-result-wide p1

    const-wide/16 v1, -0x1

    cmp-long p1, p1, v1

    if-eqz p1, :cond_2

    iget-object p1, p3, Lka/e;->l:Ljava/lang/String;

    invoke-virtual {p0, p1}, Ln9/d;->g(Ljava/lang/String;)I

    move-result v1

    iget-object p1, p3, Lka/e;->o:Ljava/lang/String;

    invoke-virtual {p0, p1}, Ln9/d;->g(Ljava/lang/String;)I

    move-result p1

    new-instance v0, Lea/l;

    iget-object p2, p3, Lka/e;->m:Ljava/lang/String;

    invoke-virtual {p0, p2}, Ln9/d;->i(Ljava/lang/String;)J

    move-result-wide v2

    iget-object p2, p3, Lka/e;->n:Ljava/lang/String;

    invoke-virtual {p0, p2}, Ln9/d;->i(Ljava/lang/String;)J

    move-result-wide v4

    invoke-direct/range {v0 .. v5}, Lea/l;-><init>(IJJ)V

    if-eq v1, p1, :cond_1

    new-instance v2, Lea/l;

    iget-object p2, p3, Lka/e;->n:Ljava/lang/String;

    invoke-virtual {p0, p2}, Ln9/d;->i(Ljava/lang/String;)J

    move-result-wide v4

    iget-object p2, p3, Lka/e;->p:Ljava/lang/String;

    invoke-virtual {p0, p2}, Ln9/d;->i(Ljava/lang/String;)J

    move-result-wide v6

    move v3, p1

    invoke-direct/range {v2 .. v7}, Lea/l;-><init>(IJJ)V

    move-object v8, v2

    goto :goto_0

    :cond_1
    move-object v8, v0

    :goto_0
    new-instance v2, Lea/m;

    iget-object p1, p3, Lka/e;->k:Ljava/lang/String;

    invoke-virtual {p0, p1}, Ln9/d;->i(Ljava/lang/String;)J

    move-result-wide v3

    iget-object p1, p3, Lka/e;->q:Ljava/lang/String;

    invoke-virtual {p0, p1}, Ln9/d;->i(Ljava/lang/String;)J

    move-result-wide v5

    move-object v7, v0

    invoke-direct/range {v2 .. v8}, Lea/m;-><init>(JJLea/l;Lea/l;)V

    iput-object v2, p0, Lea/n;->e:Lea/m;

    return-void

    :cond_2
    :goto_1
    iput-object v0, p0, Lea/n;->e:Lea/m;

    return-void
.end method


# virtual methods
.method public final E()Landroid/net/Uri;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lea/n;->d:Lka/e;

    iget-object v0, v0, Lka/e;->f:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ln9/d;->n(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method public final I1()Landroid/net/Uri;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lea/n;->d:Lka/e;

    iget-object v0, v0, Lka/e;->C:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ln9/d;->n(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method public final c()Z
    .locals 2

    iget-object v0, p0, Lea/n;->d:Lka/e;

    iget-object v0, v0, Lka/e;->M:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ln9/d;->k(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0, v0}, Ln9/d;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final c1()Lea/o;
    .locals 3

    iget-object v0, p0, Lea/n;->g:Lea/f0;

    invoke-virtual {v0}, Lea/f0;->c0()I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_1

    invoke-virtual {v0}, Lea/f0;->zza()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Lea/f0;->zzb()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :cond_1
    :goto_0
    return-object v0
.end method

.method public final d()J
    .locals 2

    iget-object v0, p0, Lea/n;->d:Lka/e;

    iget-object v0, v0, Lka/e;->G:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ln9/d;->k(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0, v0}, Ln9/d;->l(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v0}, Ln9/d;->i(Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0

    :cond_1
    :goto_0
    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final e0()J
    .locals 2

    iget-object v0, p0, Lea/n;->d:Lka/e;

    iget-object v0, v0, Lka/e;->h:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ln9/d;->i(Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/google/android/gms/games/PlayerEntity;->E3(Lea/k;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final g2()Lea/d;
    .locals 2

    iget-object v0, p0, Lea/n;->h:Lea/r;

    invoke-virtual {v0}, Lea/r;->zza()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getBannerImageLandscapeUrl()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lea/n;->d:Lka/e;

    iget-object v0, v0, Lka/e;->D:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ln9/d;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getBannerImagePortraitUrl()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lea/n;->d:Lka/e;

    iget-object v0, v0, Lka/e;->F:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ln9/d;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getHiResImageUrl()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lea/n;->d:Lka/e;

    iget-object v0, v0, Lka/e;->g:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ln9/d;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getIconImageUrl()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lea/n;->d:Lka/e;

    iget-object v0, v0, Lka/e;->e:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ln9/d;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lea/n;->d:Lka/e;

    iget-object v0, v0, Lka/e;->r:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ln9/d;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final h()Landroid/net/Uri;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lea/n;->d:Lka/e;

    iget-object v0, v0, Lka/e;->d:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ln9/d;->n(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method public final h0()Landroid/net/Uri;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lea/n;->d:Lka/e;

    iget-object v0, v0, Lka/e;->E:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ln9/d;->n(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/games/PlayerEntity;->D3(Lea/k;)I

    move-result v0

    return v0
.end method

.method public final m()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lea/n;->d:Lka/e;

    iget-object v0, v0, Lka/e;->c:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ln9/d;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final r3()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lea/n;->d:Lka/e;

    iget-object v0, v0, Lka/e;->a:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ln9/d;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final s0()J
    .locals 2

    iget-object v0, p0, Lea/n;->d:Lka/e;

    iget-object v0, v0, Lka/e;->j:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ln9/d;->k(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0, v0}, Ln9/d;->l(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v0}, Ln9/d;->i(Ljava/lang/String;)J

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

    invoke-static {p0}, Lcom/google/android/gms/games/PlayerEntity;->F3(Lea/k;)Ljava/lang/String;

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

    invoke-direct {v0, p0}, Lcom/google/android/gms/games/PlayerEntity;-><init>(Lea/k;)V

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/games/PlayerEntity;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method

.method public final z0()Lea/m;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lea/n;->e:Lea/m;

    return-object v0
.end method

.method public final zza()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lea/n;->d:Lka/e;

    iget-object v0, v0, Lka/e;->b:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lea/v;->p(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final zzb()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lea/n;->d:Lka/e;

    iget-object v0, v0, Lka/e;->A:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ln9/d;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final zzc()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lea/n;->d:Lka/e;

    iget-object v0, v0, Lka/e;->B:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ln9/d;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final zzd()Z
    .locals 1

    iget-object v0, p0, Lea/n;->d:Lka/e;

    iget-object v0, v0, Lka/e;->z:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ln9/d;->a(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public final zze()I
    .locals 1

    iget-object v0, p0, Lea/n;->d:Lka/e;

    iget-object v0, v0, Lka/e;->i:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ln9/d;->g(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public final zzf()Z
    .locals 1

    iget-object v0, p0, Lea/n;->d:Lka/e;

    iget-object v0, v0, Lka/e;->s:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ln9/d;->a(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public final zzh()Lka/b;
    .locals 1

    iget-object v0, p0, Lea/n;->d:Lka/e;

    iget-object v0, v0, Lka/e;->t:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ln9/d;->l(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, p0, Lea/n;->f:Lka/d;

    return-object v0
.end method
