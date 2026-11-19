.class public final Lob/ad;
.super Lob/ge;
.source "SourceFile"


# instance fields
.field public final d:Ljava/util/Map;

.field public final e:Lob/m6;

.field public final f:Lob/m6;

.field public final g:Lob/m6;

.field public final h:Lob/m6;

.field public final i:Lob/m6;

.field public final j:Lob/m6;


# direct methods
.method public constructor <init>(Lob/ve;)V
    .locals 4

    invoke-direct {p0, p1}, Lob/ge;-><init>(Lob/ve;)V

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lob/ad;->d:Ljava/util/Map;

    new-instance p1, Lob/m6;

    iget-object v0, p0, Lob/o8;->a:Lob/l7;

    invoke-virtual {v0}, Lob/l7;->x()Lob/p6;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "last_delete_stale"

    const-wide/16 v2, 0x0

    invoke-direct {p1, v0, v1, v2, v3}, Lob/m6;-><init>(Lob/p6;Ljava/lang/String;J)V

    iput-object p1, p0, Lob/ad;->e:Lob/m6;

    new-instance p1, Lob/m6;

    iget-object v0, p0, Lob/o8;->a:Lob/l7;

    invoke-virtual {v0}, Lob/l7;->x()Lob/p6;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "last_delete_stale_batch"

    invoke-direct {p1, v0, v1, v2, v3}, Lob/m6;-><init>(Lob/p6;Ljava/lang/String;J)V

    iput-object p1, p0, Lob/ad;->f:Lob/m6;

    new-instance p1, Lob/m6;

    iget-object v0, p0, Lob/o8;->a:Lob/l7;

    invoke-virtual {v0}, Lob/l7;->x()Lob/p6;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "backoff"

    invoke-direct {p1, v0, v1, v2, v3}, Lob/m6;-><init>(Lob/p6;Ljava/lang/String;J)V

    iput-object p1, p0, Lob/ad;->g:Lob/m6;

    new-instance p1, Lob/m6;

    iget-object v0, p0, Lob/o8;->a:Lob/l7;

    invoke-virtual {v0}, Lob/l7;->x()Lob/p6;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "last_upload"

    invoke-direct {p1, v0, v1, v2, v3}, Lob/m6;-><init>(Lob/p6;Ljava/lang/String;J)V

    iput-object p1, p0, Lob/ad;->h:Lob/m6;

    new-instance p1, Lob/m6;

    iget-object v0, p0, Lob/o8;->a:Lob/l7;

    invoke-virtual {v0}, Lob/l7;->x()Lob/p6;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "last_upload_attempt"

    invoke-direct {p1, v0, v1, v2, v3}, Lob/m6;-><init>(Lob/p6;Ljava/lang/String;J)V

    iput-object p1, p0, Lob/ad;->i:Lob/m6;

    new-instance p1, Lob/m6;

    iget-object v0, p0, Lob/o8;->a:Lob/l7;

    invoke-virtual {v0}, Lob/l7;->x()Lob/p6;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "midnight_offset"

    invoke-direct {p1, v0, v1, v2, v3}, Lob/m6;-><init>(Lob/p6;Ljava/lang/String;J)V

    iput-object p1, p0, Lob/ad;->j:Lob/m6;

    return-void
.end method


# virtual methods
.method public final l()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final m(Ljava/lang/String;Lob/v8;)Landroid/util/Pair;
    .locals 1

    sget-object v0, Lob/u8;->b:Lob/u8;

    invoke-virtual {p2, v0}, Lob/v8;->o(Lob/u8;)Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-virtual {p0, p1}, Lob/ad;->n(Ljava/lang/String;)Landroid/util/Pair;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Landroid/util/Pair;

    const-string p2, ""

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {p1, p2, v0}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1
.end method

.method public final n(Ljava/lang/String;)Landroid/util/Pair;
    .locals 12
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, ""

    invoke-virtual {p0}, Lob/o8;->h()V

    iget-object v1, p0, Lob/o8;->a:Lob/l7;

    invoke-virtual {v1}, Lob/l7;->e()Lv9/e;

    move-result-object v2

    invoke-interface {v2}, Lv9/e;->b()J

    move-result-wide v2

    iget-object v4, p0, Lob/ad;->d:Ljava/util/Map;

    invoke-interface {v4, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lob/zc;

    if-eqz v4, :cond_1

    iget-wide v5, v4, Lob/zc;->c:J

    cmp-long v5, v2, v5

    if-ltz v5, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, v4, Lob/zc;->a:Ljava/lang/String;

    iget-boolean v0, v4, Lob/zc;->b:Z

    new-instance v1, Landroid/util/Pair;

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-direct {v1, p1, v0}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v1

    :cond_1
    :goto_0
    const/4 v5, 0x1

    invoke-static {v5}, Lr8/a;->b(Z)V

    invoke-virtual {v1}, Lob/l7;->w()Lob/m;

    move-result-object v5

    sget-object v6, Lob/e5;->b:Lob/d5;

    invoke-virtual {v5, p1, v6}, Lob/m;->D(Ljava/lang/String;Lob/d5;)J

    move-result-wide v5

    add-long/2addr v5, v2

    const/4 v7, 0x0

    :try_start_0
    invoke-virtual {v1}, Lob/l7;->d()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lr8/a;->a(Landroid/content/Context;)Lr8/a$a;

    move-result-object v1
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v1

    goto :goto_2

    :catch_1
    const/4 v1, 0x0

    if-eqz v4, :cond_2

    :try_start_1
    iget-wide v8, v4, Lob/zc;->c:J

    iget-object v10, p0, Lob/o8;->a:Lob/l7;

    invoke-virtual {v10}, Lob/l7;->w()Lob/m;

    move-result-object v10

    sget-object v11, Lob/e5;->c:Lob/d5;

    invoke-virtual {v10, p1, v11}, Lob/m;->D(Ljava/lang/String;Lob/d5;)J

    move-result-wide v10

    add-long/2addr v8, v10

    cmp-long v2, v2, v8

    if-gez v2, :cond_2

    new-instance v1, Landroid/util/Pair;

    iget-object v2, v4, Lob/zc;->a:Ljava/lang/String;

    iget-boolean v3, v4, Lob/zc;->b:Z

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v1

    :cond_2
    :goto_1
    if-nez v1, :cond_3

    new-instance v1, Landroid/util/Pair;

    const-string v2, "00000000-0000-0000-0000-000000000000"

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {v1, v2, v3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v1

    :cond_3
    invoke-virtual {v1}, Lr8/a$a;->a()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_4

    new-instance v3, Lob/zc;

    invoke-virtual {v1}, Lr8/a$a;->b()Z

    move-result v1

    invoke-direct {v3, v2, v1, v5, v6}, Lob/zc;-><init>(Ljava/lang/String;ZJ)V

    goto :goto_3

    :cond_4
    new-instance v3, Lob/zc;

    invoke-virtual {v1}, Lr8/a$a;->b()Z

    move-result v1

    invoke-direct {v3, v0, v1, v5, v6}, Lob/zc;-><init>(Ljava/lang/String;ZJ)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_3

    :goto_2
    iget-object v2, p0, Lob/o8;->a:Lob/l7;

    invoke-virtual {v2}, Lob/l7;->a()Lob/b6;

    move-result-object v2

    invoke-virtual {v2}, Lob/b6;->v()Lob/z5;

    move-result-object v2

    const-string v3, "Unable to get advertising id"

    invoke-virtual {v2, v3, v1}, Lob/z5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    new-instance v3, Lob/zc;

    invoke-direct {v3, v0, v7, v5, v6}, Lob/zc;-><init>(Ljava/lang/String;ZJ)V

    :goto_3
    iget-object v0, p0, Lob/ad;->d:Ljava/util/Map;

    invoke-interface {v0, p1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v7}, Lr8/a;->b(Z)V

    new-instance p1, Landroid/util/Pair;

    iget-object v0, v3, Lob/zc;->a:Ljava/lang/String;

    iget-boolean v1, v3, Lob/zc;->b:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1
.end method

.method public final o(Ljava/lang/String;Z)Ljava/lang/String;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0}, Lob/o8;->h()V

    if-eqz p2, :cond_0

    invoke-virtual {p0, p1}, Lob/ad;->n(Ljava/lang/String;)Landroid/util/Pair;

    move-result-object p1

    iget-object p1, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    goto :goto_0

    :cond_0
    const-string p1, "00000000-0000-0000-0000-000000000000"

    :goto_0
    invoke-static {}, Lob/ff;->C()Ljava/security/MessageDigest;

    move-result-object p2

    if-nez p2, :cond_1

    const/4 p1, 0x0

    return-object p1

    :cond_1
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    new-instance v1, Ljava/math/BigInteger;

    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object p1

    const/4 p2, 0x1

    invoke-direct {v1, p2, p1}, Ljava/math/BigInteger;-><init>(I[B)V

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object p1

    const-string p2, "%032X"

    invoke-static {v0, p2, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
