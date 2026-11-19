.class public final Lcom/google/android/gms/games/leaderboard/LeaderboardEntity;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lna/a;


# annotations
.annotation build Lcom/google/android/apps/common/proguard/UsedByReflection;
    value = "GamesGmsClientImpl.java"
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Landroid/net/Uri;

.field public final d:I

.field public final e:Ljava/util/ArrayList;

.field public final f:Ljava/lang/String;


# direct methods
.method public static a(Lna/a;)I
    .locals 4

    invoke-interface {p0}, Lna/a;->X2()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0}, Lna/a;->m()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p0}, Lna/a;->h()Landroid/net/Uri;

    move-result-object v2

    invoke-interface {p0}, Lna/a;->x0()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {p0}, Lna/a;->e2()Ljava/util/ArrayList;

    move-result-object p0

    filled-new-array {v0, v1, v2, v3, p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lo9/q;->c([Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method public static b(Lna/a;Ljava/lang/Object;)Z
    .locals 4

    instance-of v0, p1, Lna/a;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x1

    if-ne p0, p1, :cond_1

    return v0

    :cond_1
    check-cast p1, Lna/a;

    invoke-interface {p1}, Lna/a;->X2()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p0}, Lna/a;->X2()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Lna/a;->m()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p0}, Lna/a;->m()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Lna/a;->h()Landroid/net/Uri;

    move-result-object v2

    invoke-interface {p0}, Lna/a;->h()Landroid/net/Uri;

    move-result-object v3

    invoke-static {v2, v3}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Lna/a;->x0()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {p0}, Lna/a;->x0()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Lna/a;->e2()Ljava/util/ArrayList;

    move-result-object p1

    invoke-interface {p0}, Lna/a;->e2()Ljava/util/ArrayList;

    move-result-object p0

    invoke-static {p1, p0}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    return v0

    :cond_2
    return v1
.end method

.method public static f(Lna/a;)Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lo9/q;->d(Ljava/lang/Object;)Lo9/q$a;

    move-result-object v0

    const-string v1, "LeaderboardId"

    invoke-interface {p0}, Lna/a;->X2()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo9/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lo9/q$a;

    move-result-object v0

    const-string v1, "DisplayName"

    invoke-interface {p0}, Lna/a;->m()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo9/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lo9/q$a;

    move-result-object v0

    const-string v1, "IconImageUri"

    invoke-interface {p0}, Lna/a;->h()Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo9/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lo9/q$a;

    move-result-object v0

    const-string v1, "IconImageUrl"

    invoke-interface {p0}, Lna/a;->getIconImageUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo9/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lo9/q$a;

    move-result-object v0

    invoke-interface {p0}, Lna/a;->x0()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "ScoreOrder"

    invoke-virtual {v0, v2, v1}, Lo9/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lo9/q$a;

    move-result-object v0

    const-string v1, "Variants"

    invoke-interface {p0}, Lna/a;->e2()Ljava/util/ArrayList;

    move-result-object p0

    invoke-virtual {v0, v1, p0}, Lo9/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lo9/q$a;

    move-result-object p0

    invoke-virtual {p0}, Lo9/q$a;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final X2()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/games/leaderboard/LeaderboardEntity;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final e2()Ljava/util/ArrayList;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lna/c;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/google/android/gms/games/leaderboard/LeaderboardEntity;->e:Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/google/android/gms/games/leaderboard/LeaderboardEntity;->b(Lna/a;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public getIconImageUrl()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/games/leaderboard/LeaderboardEntity;->f:Ljava/lang/String;

    return-object v0
.end method

.method public final h()Landroid/net/Uri;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/games/leaderboard/LeaderboardEntity;->c:Landroid/net/Uri;

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/games/leaderboard/LeaderboardEntity;->a(Lna/a;)I

    move-result v0

    return v0
.end method

.method public final m()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/games/leaderboard/LeaderboardEntity;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-static {p0}, Lcom/google/android/gms/games/leaderboard/LeaderboardEntity;->f(Lna/a;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final x0()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/games/leaderboard/LeaderboardEntity;->d:I

    return v0
.end method
