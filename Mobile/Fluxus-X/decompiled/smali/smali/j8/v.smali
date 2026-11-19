.class public Lj8/v;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/concurrent/Executor;

.field public final b:Lk8/d;

.field public final c:Lj8/x;

.field public final d:Ll8/b;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Lk8/d;Lj8/x;Ll8/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj8/v;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lj8/v;->b:Lk8/d;

    iput-object p3, p0, Lj8/v;->c:Lj8/x;

    iput-object p4, p0, Lj8/v;->d:Ll8/b;

    return-void
.end method

.method public static synthetic a(Lj8/v;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lj8/v;->b:Lk8/d;

    invoke-interface {v0}, Lk8/d;->j0()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc8/o;

    iget-object v2, p0, Lj8/v;->c:Lj8/x;

    const/4 v3, 0x1

    invoke-interface {v2, v1, v3}, Lj8/x;->b(Lc8/o;I)V

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static synthetic b(Lj8/v;)V
    .locals 2

    iget-object v0, p0, Lj8/v;->d:Ll8/b;

    new-instance v1, Lj8/u;

    invoke-direct {v1, p0}, Lj8/u;-><init>(Lj8/v;)V

    invoke-interface {v0, v1}, Ll8/b;->b(Ll8/b$a;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public c()V
    .locals 2

    iget-object v0, p0, Lj8/v;->a:Ljava/util/concurrent/Executor;

    new-instance v1, Lj8/t;

    invoke-direct {v1, p0}, Lj8/t;-><init>(Lj8/v;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
