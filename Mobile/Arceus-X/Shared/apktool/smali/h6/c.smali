.class public Lh6/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh6/b;


# instance fields
.field public final a:Lg6/y;

.field public final b:Lku/l0;

.field public final c:Landroid/os/Handler;

.field public final d:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lh6/c;->c:Landroid/os/Handler;

    new-instance v0, Lh6/c$a;

    invoke-direct {v0, p0}, Lh6/c$a;-><init>(Lh6/c;)V

    iput-object v0, p0, Lh6/c;->d:Ljava/util/concurrent/Executor;

    new-instance v0, Lg6/y;

    invoke-direct {v0, p1}, Lg6/y;-><init>(Ljava/util/concurrent/Executor;)V

    iput-object v0, p0, Lh6/c;->a:Lg6/y;

    invoke-static {v0}, Lku/v1;->b(Ljava/util/concurrent/Executor;)Lku/l0;

    move-result-object p1

    iput-object p1, p0, Lh6/c;->b:Lku/l0;

    return-void
.end method


# virtual methods
.method public a()Ljava/util/concurrent/Executor;
    .locals 1

    iget-object v0, p0, Lh6/c;->d:Ljava/util/concurrent/Executor;

    return-object v0
.end method

.method public b()Lku/l0;
    .locals 1

    iget-object v0, p0, Lh6/c;->b:Lku/l0;

    return-object v0
.end method

.method public bridge synthetic c()Lh6/a;
    .locals 1

    invoke-virtual {p0}, Lh6/c;->e()Lg6/y;

    move-result-object v0

    return-object v0
.end method

.method public e()Lg6/y;
    .locals 1

    iget-object v0, p0, Lh6/c;->a:Lg6/y;

    return-object v0
.end method
