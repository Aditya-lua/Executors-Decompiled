.class public Lb8/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb8/s;


# static fields
.field public static volatile e:Lb8/u;


# instance fields
.field public final a:Ll8/a;

.field public final b:Ll8/a;

.field public final c:Lh8/e;

.field public final d:Li8/r;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ll8/a;Ll8/a;Lh8/e;Li8/r;Li8/v;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb8/t;->a:Ll8/a;

    iput-object p2, p0, Lb8/t;->b:Ll8/a;

    iput-object p3, p0, Lb8/t;->c:Lh8/e;

    iput-object p4, p0, Lb8/t;->d:Li8/r;

    invoke-virtual {p5}, Li8/v;->c()V

    return-void
.end method

.method public static c()Lb8/t;
    .locals 2

    sget-object v0, Lb8/t;->e:Lb8/u;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lb8/u;->b()Lb8/t;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Not initialized!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static d(Lb8/f;)Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb8/f;",
            ")",
            "Ljava/util/Set<",
            "Ly7/c;",
            ">;"
        }
    .end annotation

    instance-of v0, p0, Lb8/g;

    if-eqz v0, :cond_0

    check-cast p0, Lb8/g;

    invoke-interface {p0}, Lb8/g;->a()Ljava/util/Set;

    move-result-object p0

    invoke-static {p0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p0

    return-object p0

    :cond_0
    const-string p0, "proto"

    invoke-static {p0}, Ly7/c;->b(Ljava/lang/String;)Ly7/c;

    move-result-object p0

    invoke-static {p0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method public static f(Landroid/content/Context;)V
    .locals 2

    sget-object v0, Lb8/t;->e:Lb8/u;

    if-nez v0, :cond_1

    const-class v0, Lb8/t;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lb8/t;->e:Lb8/u;

    if-nez v1, :cond_0

    invoke-static {}, Lb8/e;->c()Lb8/u$a;

    move-result-object v1

    invoke-interface {v1, p0}, Lb8/u$a;->setApplicationContext(Landroid/content/Context;)Lb8/u$a;

    move-result-object p0

    invoke-interface {p0}, Lb8/u$a;->build()Lb8/u;

    move-result-object p0

    sput-object p0, Lb8/t;->e:Lb8/u;

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
.method public a(Lb8/n;Ly7/j;)V
    .locals 3

    iget-object v0, p0, Lb8/t;->c:Lh8/e;

    invoke-virtual {p1}, Lb8/n;->f()Lb8/o;

    move-result-object v1

    invoke-virtual {p1}, Lb8/n;->c()Ly7/d;

    move-result-object v2

    invoke-virtual {v2}, Ly7/d;->c()Ly7/e;

    move-result-object v2

    invoke-virtual {v1, v2}, Lb8/o;->f(Ly7/e;)Lb8/o;

    move-result-object v1

    invoke-virtual {p0, p1}, Lb8/t;->b(Lb8/n;)Lb8/i;

    move-result-object p1

    invoke-interface {v0, v1, p1, p2}, Lh8/e;->a(Lb8/o;Lb8/i;Ly7/j;)V

    return-void
.end method

.method public final b(Lb8/n;)Lb8/i;
    .locals 4

    invoke-static {}, Lb8/i;->a()Lb8/i$a;

    move-result-object v0

    iget-object v1, p0, Lb8/t;->a:Ll8/a;

    invoke-interface {v1}, Ll8/a;->a()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lb8/i$a;->i(J)Lb8/i$a;

    move-result-object v0

    iget-object v1, p0, Lb8/t;->b:Ll8/a;

    invoke-interface {v1}, Ll8/a;->a()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lb8/i$a;->k(J)Lb8/i$a;

    move-result-object v0

    invoke-virtual {p1}, Lb8/n;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb8/i$a;->j(Ljava/lang/String;)Lb8/i$a;

    move-result-object v0

    new-instance v1, Lb8/h;

    invoke-virtual {p1}, Lb8/n;->b()Ly7/c;

    move-result-object v2

    invoke-virtual {p1}, Lb8/n;->d()[B

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lb8/h;-><init>(Ly7/c;[B)V

    invoke-virtual {v0, v1}, Lb8/i$a;->h(Lb8/h;)Lb8/i$a;

    move-result-object v0

    invoke-virtual {p1}, Lb8/n;->c()Ly7/d;

    move-result-object p1

    invoke-virtual {p1}, Ly7/d;->a()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lb8/i$a;->g(Ljava/lang/Integer;)Lb8/i$a;

    move-result-object p1

    invoke-virtual {p1}, Lb8/i$a;->d()Lb8/i;

    move-result-object p1

    return-object p1
.end method

.method public e()Li8/r;
    .locals 1

    iget-object v0, p0, Lb8/t;->d:Li8/r;

    return-object v0
.end method

.method public g(Lb8/f;)Ly7/i;
    .locals 4

    new-instance v0, Lb8/p;

    invoke-static {p1}, Lb8/t;->d(Lb8/f;)Ljava/util/Set;

    move-result-object v1

    invoke-static {}, Lb8/o;->a()Lb8/o$a;

    move-result-object v2

    invoke-interface {p1}, Lb8/f;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lb8/o$a;->b(Ljava/lang/String;)Lb8/o$a;

    move-result-object v2

    invoke-interface {p1}, Lb8/f;->getExtras()[B

    move-result-object p1

    invoke-virtual {v2, p1}, Lb8/o$a;->c([B)Lb8/o$a;

    move-result-object p1

    invoke-virtual {p1}, Lb8/o$a;->a()Lb8/o;

    move-result-object p1

    invoke-direct {v0, v1, p1, p0}, Lb8/p;-><init>(Ljava/util/Set;Lb8/o;Lb8/s;)V

    return-object v0
.end method
