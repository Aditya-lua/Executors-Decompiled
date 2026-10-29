.class public Lg6/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx5/l;


# static fields
.field public static final d:Ljava/lang/String;


# instance fields
.field public final a:Lh6/b;

.field public final b:Le6/a;

.field public final c:Lf6/k0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "WMFgUpdater"

    invoke-static {v0}, Lx5/w;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lg6/e0;->d:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroidx/work/impl/WorkDatabase;Le6/a;Lh6/b;)V
    .locals 0
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "LambdaLast"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lg6/e0;->b:Le6/a;

    iput-object p3, p0, Lg6/e0;->a:Lh6/b;

    invoke-virtual {p1}, Landroidx/work/impl/WorkDatabase;->c0()Lf6/k0;

    move-result-object p1

    iput-object p1, p0, Lg6/e0;->c:Lf6/k0;

    return-void
.end method

.method public static synthetic b(Lg6/e0;Ljava/util/UUID;Lx5/k;Landroid/content/Context;)Ljava/lang/Void;
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lg6/e0;->c:Lf6/k0;

    invoke-interface {v0, p1}, Lf6/k0;->k(Ljava/lang/String;)Lf6/j0;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, v0, Lf6/j0;->b:Lx5/o0$c;

    invoke-virtual {v1}, Lx5/o0$c;->b()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object p0, p0, Lg6/e0;->b:Le6/a;

    invoke-interface {p0, p1, p2}, Le6/a;->a(Ljava/lang/String;Lx5/k;)V

    invoke-static {v0}, Lf6/o1;->a(Lf6/j0;)Lf6/w;

    move-result-object p0

    invoke-static {p3, p0, p2}, Landroidx/work/impl/foreground/a;->c(Landroid/content/Context;Lf6/w;Lx5/k;)Landroid/content/Intent;

    move-result-object p0

    invoke-virtual {p3, p0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result."

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public a(Landroid/content/Context;Ljava/util/UUID;Lx5/k;)Lne/x;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/UUID;",
            "Lx5/k;",
            ")",
            "Lne/x<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lg6/e0;->a:Lh6/b;

    invoke-interface {v0}, Lh6/b;->c()Lh6/a;

    move-result-object v0

    new-instance v1, Lg6/d0;

    invoke-direct {v1, p0, p2, p3, p1}, Lg6/d0;-><init>(Lg6/e0;Ljava/util/UUID;Lx5/k;Landroid/content/Context;)V

    const-string p1, "setForegroundAsync"

    invoke-static {v0, p1, v1}, Lx5/u;->f(Ljava/util/concurrent/Executor;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Lne/x;

    move-result-object p1

    return-object p1
.end method
