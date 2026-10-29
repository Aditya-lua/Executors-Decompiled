.class public abstract Li8/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li8/f$a;,
        Li8/f$b;,
        Li8/f$c;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b()Li8/f$a;
    .locals 1

    new-instance v0, Li8/f$a;

    invoke-direct {v0}, Li8/f$a;-><init>()V

    return-object v0
.end method

.method public static d(Ll8/a;Ljava/util/Map;)Li8/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll8/a;",
            "Ljava/util/Map<",
            "Ly7/e;",
            "Li8/f$b;",
            ">;)",
            "Li8/f;"
        }
    .end annotation

    new-instance v0, Li8/b;

    invoke-direct {v0, p0, p1}, Li8/b;-><init>(Ll8/a;Ljava/util/Map;)V

    return-object v0
.end method

.method public static f(Ll8/a;)Li8/f;
    .locals 7

    invoke-static {}, Li8/f;->b()Li8/f$a;

    move-result-object v0

    sget-object v1, Ly7/e;->a:Ly7/e;

    invoke-static {}, Li8/f$b;->a()Li8/f$b$a;

    move-result-object v2

    const-wide/16 v3, 0x7530

    invoke-virtual {v2, v3, v4}, Li8/f$b$a;->b(J)Li8/f$b$a;

    move-result-object v2

    const-wide/32 v3, 0x5265c00

    invoke-virtual {v2, v3, v4}, Li8/f$b$a;->d(J)Li8/f$b$a;

    move-result-object v2

    invoke-virtual {v2}, Li8/f$b$a;->a()Li8/f$b;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Li8/f$a;->a(Ly7/e;Li8/f$b;)Li8/f$a;

    move-result-object v0

    sget-object v1, Ly7/e;->c:Ly7/e;

    invoke-static {}, Li8/f$b;->a()Li8/f$b$a;

    move-result-object v2

    const-wide/16 v5, 0x3e8

    invoke-virtual {v2, v5, v6}, Li8/f$b$a;->b(J)Li8/f$b$a;

    move-result-object v2

    invoke-virtual {v2, v3, v4}, Li8/f$b$a;->d(J)Li8/f$b$a;

    move-result-object v2

    invoke-virtual {v2}, Li8/f$b$a;->a()Li8/f$b;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Li8/f$a;->a(Ly7/e;Li8/f$b;)Li8/f$a;

    move-result-object v0

    sget-object v1, Ly7/e;->b:Ly7/e;

    invoke-static {}, Li8/f$b;->a()Li8/f$b$a;

    move-result-object v2

    invoke-virtual {v2, v3, v4}, Li8/f$b$a;->b(J)Li8/f$b$a;

    move-result-object v2

    invoke-virtual {v2, v3, v4}, Li8/f$b$a;->d(J)Li8/f$b$a;

    move-result-object v2

    sget-object v3, Li8/f$c;->b:Li8/f$c;

    filled-new-array {v3}, [Li8/f$c;

    move-result-object v3

    invoke-static {v3}, Li8/f;->i([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v3

    invoke-virtual {v2, v3}, Li8/f$b$a;->c(Ljava/util/Set;)Li8/f$b$a;

    move-result-object v2

    invoke-virtual {v2}, Li8/f$b$a;->a()Li8/f$b;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Li8/f$a;->a(Ly7/e;Li8/f$b;)Li8/f$a;

    move-result-object v0

    invoke-virtual {v0, p0}, Li8/f$a;->c(Ll8/a;)Li8/f$a;

    move-result-object p0

    invoke-virtual {p0}, Li8/f$a;->b()Li8/f;

    move-result-object p0

    return-object p0
.end method

.method public static varargs i([Ljava/lang/Object;)Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)",
            "Ljava/util/Set<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashSet;

    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(IJ)J
    .locals 6

    add-int/lit8 p1, p1, -0x1

    const-wide/16 v0, 0x1

    cmp-long v0, p2, v0

    if-lez v0, :cond_0

    move-wide v0, p2

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x2

    :goto_0
    const-wide v2, 0x40c3880000000000L    # 10000.0

    invoke-static {v2, v3}, Ljava/lang/Math;->log(D)D

    move-result-wide v2

    int-to-long v4, p1

    mul-long/2addr v0, v4

    long-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->log(D)D

    move-result-wide v0

    div-double/2addr v2, v0

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(DD)D

    move-result-wide v0

    const-wide/high16 v2, 0x4008000000000000L    # 3.0

    int-to-double v4, p1

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v2

    long-to-double p1, p2

    mul-double/2addr v2, p1

    mul-double/2addr v2, v0

    double-to-long p1, v2

    return-wide p1
.end method

.method public c(Landroid/app/job/JobInfo$Builder;Ly7/e;JI)Landroid/app/job/JobInfo$Builder;
    .locals 0

    invoke-virtual {p0, p2, p3, p4, p5}, Li8/f;->g(Ly7/e;JI)J

    move-result-wide p3

    invoke-virtual {p1, p3, p4}, Landroid/app/job/JobInfo$Builder;->setMinimumLatency(J)Landroid/app/job/JobInfo$Builder;

    invoke-virtual {p0}, Li8/f;->h()Ljava/util/Map;

    move-result-object p3

    invoke-interface {p3, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Li8/f$b;

    invoke-virtual {p2}, Li8/f$b;->c()Ljava/util/Set;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Li8/f;->j(Landroid/app/job/JobInfo$Builder;Ljava/util/Set;)V

    return-object p1
.end method

.method public abstract e()Ll8/a;
.end method

.method public g(Ly7/e;JI)J
    .locals 2

    invoke-virtual {p0}, Li8/f;->e()Ll8/a;

    move-result-object v0

    invoke-interface {v0}, Ll8/a;->a()J

    move-result-wide v0

    sub-long/2addr p2, v0

    invoke-virtual {p0}, Li8/f;->h()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li8/f$b;

    invoke-virtual {p1}, Li8/f$b;->b()J

    move-result-wide v0

    invoke-virtual {p0, p4, v0, v1}, Li8/f;->a(IJ)J

    move-result-wide v0

    invoke-static {v0, v1, p2, p3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p2

    invoke-virtual {p1}, Li8/f$b;->d()J

    move-result-wide v0

    invoke-static {p2, p3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public abstract h()Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ly7/e;",
            "Li8/f$b;",
            ">;"
        }
    .end annotation
.end method

.method public final j(Landroid/app/job/JobInfo$Builder;Ljava/util/Set;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/job/JobInfo$Builder;",
            "Ljava/util/Set<",
            "Li8/f$c;",
            ">;)V"
        }
    .end annotation

    sget-object v0, Li8/f$c;->a:Li8/f$c;

    invoke-interface {p2, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Landroid/app/job/JobInfo$Builder;->setRequiredNetworkType(I)Landroid/app/job/JobInfo$Builder;

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v1}, Landroid/app/job/JobInfo$Builder;->setRequiredNetworkType(I)Landroid/app/job/JobInfo$Builder;

    :goto_0
    sget-object v0, Li8/f$c;->c:Li8/f$c;

    invoke-interface {p2, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1, v1}, Landroid/app/job/JobInfo$Builder;->setRequiresCharging(Z)Landroid/app/job/JobInfo$Builder;

    :cond_1
    sget-object v0, Li8/f$c;->b:Li8/f$c;

    invoke-interface {p2, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-virtual {p1, v1}, Landroid/app/job/JobInfo$Builder;->setRequiresDeviceIdle(Z)Landroid/app/job/JobInfo$Builder;

    :cond_2
    return-void
.end method
