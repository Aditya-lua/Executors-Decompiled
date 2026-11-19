.class public Lc8/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc8/s;


# static fields
.field public static volatile e:Lc8/u;


# instance fields
.field public final a:Lm8/a;

.field public final b:Lm8/a;

.field public final c:Li8/e;

.field public final d:Lj8/r;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lm8/a;Lm8/a;Li8/e;Lj8/r;Lj8/v;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc8/t;->a:Lm8/a;

    iput-object p2, p0, Lc8/t;->b:Lm8/a;

    iput-object p3, p0, Lc8/t;->c:Li8/e;

    iput-object p4, p0, Lc8/t;->d:Lj8/r;

    invoke-virtual {p5}, Lj8/v;->c()V

    return-void
.end method

.method public static c()Lc8/t;
    .locals 2

    sget-object v0, Lc8/t;->e:Lc8/u;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lc8/u;->b()Lc8/t;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Not initialized!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static d(Lc8/f;)Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc8/f;",
            ")",
            "Ljava/util/Set<",
            "Lz7/c;",
            ">;"
        }
    .end annotation

    instance-of v0, p0, Lc8/g;

    if-eqz v0, :cond_0

    check-cast p0, Lc8/g;

    invoke-interface {p0}, Lc8/g;->a()Ljava/util/Set;

    move-result-object p0

    invoke-static {p0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p0

    return-object p0

    :cond_0
    const-string p0, "proto"

    invoke-static {p0}, Lz7/c;->b(Ljava/lang/String;)Lz7/c;

    move-result-object p0

    invoke-static {p0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method public static f(Landroid/content/Context;)V
    .locals 2

    sget-object v0, Lc8/t;->e:Lc8/u;

    if-nez v0, :cond_1

    const-class v0, Lc8/t;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lc8/t;->e:Lc8/u;

    if-nez v1, :cond_0

    invoke-static {}, Lc8/e;->c()Lc8/u$a;

    move-result-object v1

    invoke-interface {v1, p0}, Lc8/u$a;->a(Landroid/content/Context;)Lc8/u$a;

    move-result-object p0

    invoke-interface {p0}, Lc8/u$a;->build()Lc8/u;

    move-result-object p0

    sput-object p0, Lc8/t;->e:Lc8/u;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_1
    return-void
.end method


# virtual methods
.method public a(Lc8/n;Lz7/j;)V
    .locals 3

    iget-object v0, p0, Lc8/t;->c:Li8/e;

    invoke-virtual {p1}, Lc8/n;->f()Lc8/o;

    move-result-object v1

    invoke-virtual {p1}, Lc8/n;->c()Lz7/d;

    move-result-object v2

    invoke-virtual {v2}, Lz7/d;->c()Lz7/e;

    move-result-object v2

    invoke-virtual {v1, v2}, Lc8/o;->f(Lz7/e;)Lc8/o;

    move-result-object v1

    invoke-virtual {p0, p1}, Lc8/t;->b(Lc8/n;)Lc8/i;

    move-result-object p1

    invoke-interface {v0, v1, p1, p2}, Li8/e;->a(Lc8/o;Lc8/i;Lz7/j;)V

    return-void
.end method

.method public final b(Lc8/n;)Lc8/i;
    .locals 4

    invoke-static {}, Lc8/i;->a()Lc8/i$a;

    move-result-object v0

    iget-object v1, p0, Lc8/t;->a:Lm8/a;

    invoke-interface {v1}, Lm8/a;->a()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lc8/i$a;->i(J)Lc8/i$a;

    move-result-object v0

    iget-object v1, p0, Lc8/t;->b:Lm8/a;

    invoke-interface {v1}, Lm8/a;->a()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lc8/i$a;->k(J)Lc8/i$a;

    move-result-object v0

    invoke-virtual {p1}, Lc8/n;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lc8/i$a;->j(Ljava/lang/String;)Lc8/i$a;

    move-result-object v0

    new-instance v1, Lc8/h;

    invoke-virtual {p1}, Lc8/n;->b()Lz7/c;

    move-result-object v2

    invoke-virtual {p1}, Lc8/n;->d()[B

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lc8/h;-><init>(Lz7/c;[B)V

    invoke-virtual {v0, v1}, Lc8/i$a;->h(Lc8/h;)Lc8/i$a;

    move-result-object v0

    invoke-virtual {p1}, Lc8/n;->c()Lz7/d;

    move-result-object p1

    invoke-virtual {p1}, Lz7/d;->a()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lc8/i$a;->g(Ljava/lang/Integer;)Lc8/i$a;

    move-result-object p1

    invoke-virtual {p1}, Lc8/i$a;->d()Lc8/i;

    move-result-object p1

    return-object p1
.end method

.method public e()Lj8/r;
    .locals 1

    iget-object v0, p0, Lc8/t;->d:Lj8/r;

    return-object v0
.end method

.method public g(Lc8/f;)Lz7/i;
    .locals 4

    new-instance v0, Lc8/p;

    invoke-static {p1}, Lc8/t;->d(Lc8/f;)Ljava/util/Set;

    move-result-object v1

    invoke-static {}, Lc8/o;->a()Lc8/o$a;

    move-result-object v2

    invoke-interface {p1}, Lc8/f;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lc8/o$a;->b(Ljava/lang/String;)Lc8/o$a;

    move-result-object v2

    invoke-interface {p1}, Lc8/f;->getExtras()[B

    move-result-object p1

    invoke-virtual {v2, p1}, Lc8/o$a;->c([B)Lc8/o$a;

    move-result-object p1

    invoke-virtual {p1}, Lc8/o$a;->a()Lc8/o;

    move-result-object p1

    invoke-direct {v0, v1, p1, p0}, Lc8/p;-><init>(Ljava/util/Set;Lc8/o;Lc8/s;)V

    return-object v0
.end method
