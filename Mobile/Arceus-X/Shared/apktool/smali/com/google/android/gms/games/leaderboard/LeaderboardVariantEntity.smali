.class public final Lcom/google/android/gms/games/leaderboard/LeaderboardVariantEntity;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lma/c;


# annotations
.annotation build Lcom/google/android/apps/common/proguard/UsedByReflection;
    value = "GamesGmsClientImpl.java"
.end annotation


# instance fields
.field public final a:I

.field public final b:I

.field public final c:Z

.field public final d:J

.field public final e:Ljava/lang/String;

.field public final f:J

.field public final g:Ljava/lang/String;

.field public final h:J

.field public final i:Ljava/lang/String;

.field public final j:Ljava/lang/String;

.field public final k:Ljava/lang/String;


# direct methods
.method public static a(Lma/c;)I
    .locals 12

    invoke-interface {p0}, Lma/c;->U2()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0}, Lma/c;->A1()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {p0}, Lma/c;->P()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-interface {p0}, Lma/c;->m1()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-interface {p0}, Lma/c;->I()Ljava/lang/String;

    move-result-object v5

    invoke-interface {p0}, Lma/c;->N2()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-interface {p0}, Lma/c;->o1()Ljava/lang/String;

    move-result-object v7

    invoke-interface {p0}, Lma/c;->y2()J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-interface {p0}, Lma/c;->zza()Ljava/lang/String;

    move-result-object v9

    invoke-interface {p0}, Lma/c;->zzc()Ljava/lang/String;

    move-result-object v10

    invoke-interface {p0}, Lma/c;->zzb()Ljava/lang/String;

    move-result-object v11

    filled-new-array/range {v1 .. v11}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Ln9/k;->c([Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method public static b(Lma/c;Ljava/lang/Object;)Z
    .locals 5

    instance-of v0, p1, Lma/c;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x1

    if-ne p0, p1, :cond_1

    return v0

    :cond_1
    check-cast p1, Lma/c;

    invoke-interface {p1}, Lma/c;->U2()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {p0}, Lma/c;->U2()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Lma/c;->A1()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {p0}, Lma/c;->A1()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Lma/c;->P()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {p0}, Lma/c;->P()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v2, v3}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Lma/c;->m1()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {p0}, Lma/c;->m1()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-static {v2, v3}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Lma/c;->I()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p0}, Lma/c;->I()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Lma/c;->N2()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {p0}, Lma/c;->N2()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-static {v2, v3}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Lma/c;->o1()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p0}, Lma/c;->o1()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Lma/c;->y2()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {p0}, Lma/c;->y2()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-static {v2, v3}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Lma/c;->zza()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p0}, Lma/c;->zza()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Lma/c;->zzc()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p0}, Lma/c;->zzc()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Lma/c;->zzb()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0}, Lma/c;->zzb()Ljava/lang/String;

    move-result-object p0

    invoke-static {p1, p0}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    return v0

    :cond_2
    return v1
.end method

.method public static f(Lma/c;)Ljava/lang/String;
    .locals 5

    invoke-static {p0}, Ln9/k;->d(Ljava/lang/Object;)Ln9/k$a;

    move-result-object v0

    invoke-interface {p0}, Lma/c;->U2()I

    move-result v1

    invoke-static {v1}, Lfb/i2;->a(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "TimeSpan"

    invoke-virtual {v0, v2, v1}, Ln9/k$a;->a(Ljava/lang/String;Ljava/lang/Object;)Ln9/k$a;

    move-result-object v0

    invoke-interface {p0}, Lma/c;->A1()I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_4

    if-eqz v1, :cond_3

    const/4 v2, 0x1

    if-eq v1, v2, :cond_2

    const/4 v2, 0x2

    const-string v3, "SOCIAL_1P"

    if-eq v1, v2, :cond_5

    const/4 v2, 0x3

    if-eq v1, v2, :cond_1

    const/4 v2, 0x4

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    new-instance v2, Ljava/lang/StringBuilder;

    add-int/lit8 v0, v0, 0x20

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v0, "Unknown leaderboard collection: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    const-string v3, "FRIENDS"

    goto :goto_0

    :cond_2
    const-string v3, "SOCIAL"

    goto :goto_0

    :cond_3
    const-string v3, "PUBLIC"

    goto :goto_0

    :cond_4
    const-string v3, "UNKNOWN"

    :cond_5
    :goto_0
    const-string v1, "Collection"

    invoke-virtual {v0, v1, v3}, Ln9/k$a;->a(Ljava/lang/String;Ljava/lang/Object;)Ln9/k$a;

    move-result-object v0

    invoke-interface {p0}, Lma/c;->P()Z

    move-result v1

    const-string v2, "none"

    if-eqz v1, :cond_6

    invoke-interface {p0}, Lma/c;->m1()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    goto :goto_1

    :cond_6
    move-object v1, v2

    :goto_1
    const-string v3, "RawPlayerScore"

    invoke-virtual {v0, v3, v1}, Ln9/k$a;->a(Ljava/lang/String;Ljava/lang/Object;)Ln9/k$a;

    move-result-object v0

    invoke-interface {p0}, Lma/c;->P()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {p0}, Lma/c;->I()Ljava/lang/String;

    move-result-object v1

    goto :goto_2

    :cond_7
    move-object v1, v2

    :goto_2
    const-string v3, "DisplayPlayerScore"

    invoke-virtual {v0, v3, v1}, Ln9/k$a;->a(Ljava/lang/String;Ljava/lang/Object;)Ln9/k$a;

    move-result-object v0

    invoke-interface {p0}, Lma/c;->P()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-interface {p0}, Lma/c;->N2()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    goto :goto_3

    :cond_8
    move-object v1, v2

    :goto_3
    const-string v3, "PlayerRank"

    invoke-virtual {v0, v3, v1}, Ln9/k$a;->a(Ljava/lang/String;Ljava/lang/Object;)Ln9/k$a;

    move-result-object v0

    invoke-interface {p0}, Lma/c;->P()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-interface {p0}, Lma/c;->o1()Ljava/lang/String;

    move-result-object v2

    :cond_9
    const-string v1, "DisplayPlayerRank"

    invoke-virtual {v0, v1, v2}, Ln9/k$a;->a(Ljava/lang/String;Ljava/lang/Object;)Ln9/k$a;

    move-result-object v0

    invoke-interface {p0}, Lma/c;->y2()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "NumScores"

    invoke-virtual {v0, v2, v1}, Ln9/k$a;->a(Ljava/lang/String;Ljava/lang/Object;)Ln9/k$a;

    move-result-object v0

    invoke-interface {p0}, Lma/c;->zza()Ljava/lang/String;

    move-result-object v1

    const-string v2, "TopPageNextToken"

    invoke-virtual {v0, v2, v1}, Ln9/k$a;->a(Ljava/lang/String;Ljava/lang/Object;)Ln9/k$a;

    move-result-object v0

    invoke-interface {p0}, Lma/c;->zzc()Ljava/lang/String;

    move-result-object v1

    const-string v2, "WindowPageNextToken"

    invoke-virtual {v0, v2, v1}, Ln9/k$a;->a(Ljava/lang/String;Ljava/lang/Object;)Ln9/k$a;

    move-result-object v0

    invoke-interface {p0}, Lma/c;->zzb()Ljava/lang/String;

    move-result-object p0

    const-string v1, "WindowPagePrevToken"

    invoke-virtual {v0, v1, p0}, Ln9/k$a;->a(Ljava/lang/String;Ljava/lang/Object;)Ln9/k$a;

    move-result-object p0

    invoke-virtual {p0}, Ln9/k$a;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final A1()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/games/leaderboard/LeaderboardVariantEntity;->b:I

    return v0
.end method

.method public final I()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/games/leaderboard/LeaderboardVariantEntity;->e:Ljava/lang/String;

    return-object v0
.end method

.method public final N2()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/games/leaderboard/LeaderboardVariantEntity;->f:J

    return-wide v0
.end method

.method public final P()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/games/leaderboard/LeaderboardVariantEntity;->c:Z

    return v0
.end method

.method public final U2()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/games/leaderboard/LeaderboardVariantEntity;->a:I

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/google/android/gms/games/leaderboard/LeaderboardVariantEntity;->b(Lma/c;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/games/leaderboard/LeaderboardVariantEntity;->a(Lma/c;)I

    move-result v0

    return v0
.end method

.method public final m1()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/games/leaderboard/LeaderboardVariantEntity;->d:J

    return-wide v0
.end method

.method public final o1()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/games/leaderboard/LeaderboardVariantEntity;->g:Ljava/lang/String;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-static {p0}, Lcom/google/android/gms/games/leaderboard/LeaderboardVariantEntity;->f(Lma/c;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final y2()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/games/leaderboard/LeaderboardVariantEntity;->h:J

    return-wide v0
.end method

.method public final zza()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/games/leaderboard/LeaderboardVariantEntity;->i:Ljava/lang/String;

    return-object v0
.end method

.method public final zzb()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/games/leaderboard/LeaderboardVariantEntity;->j:Ljava/lang/String;

    return-object v0
.end method

.method public final zzc()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/games/leaderboard/LeaderboardVariantEntity;->k:Ljava/lang/String;

    return-object v0
.end method
