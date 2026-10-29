.class public Lz/u0$j$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz/u0$j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public a:Ljava/util/concurrent/Executor;

.field public b:Z

.field public final synthetic c:Lz/u0$j;


# direct methods
.method public constructor <init>(Lz/u0$j;Ljava/util/concurrent/Executor;)V
    .locals 0

    iput-object p1, p0, Lz/u0$j$b;->c:Lz/u0$j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lz/u0$j$b;->b:Z

    iput-object p2, p0, Lz/u0$j$b;->a:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public static synthetic a(Lz/u0$j$b;)V
    .locals 3

    iget-boolean v0, p0, Lz/u0$j$b;->b:Z

    if-nez v0, :cond_3

    iget-object v0, p0, Lz/u0$j$b;->c:Lz/u0$j;

    iget-object v0, v0, Lz/u0$j;->f:Lz/u0;

    iget-object v0, v0, Lz/u0;->e:Lz/u0$i;

    sget-object v1, Lz/u0$i;->h:Lz/u0$i;

    const/4 v2, 0x1

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lz/u0$j$b;->c:Lz/u0$j;

    iget-object v0, v0, Lz/u0$j;->f:Lz/u0;

    iget-object v0, v0, Lz/u0;->e:Lz/u0$i;

    sget-object v1, Lz/u0$i;->g:Lz/u0$i;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    move v0, v2

    :goto_1
    invoke-static {v0}, Lx2/g;->i(Z)V

    iget-object v0, p0, Lz/u0$j$b;->c:Lz/u0$j;

    invoke-virtual {v0}, Lz/u0$j;->f()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object p0, p0, Lz/u0$j$b;->c:Lz/u0$j;

    iget-object p0, p0, Lz/u0$j;->f:Lz/u0;

    invoke-virtual {p0, v2}, Lz/u0;->L0(Z)V

    return-void

    :cond_2
    iget-object p0, p0, Lz/u0$j$b;->c:Lz/u0$j;

    iget-object p0, p0, Lz/u0$j;->f:Lz/u0;

    invoke-virtual {p0, v2}, Lz/u0;->M0(Z)V

    :cond_3
    return-void
.end method


# virtual methods
.method public b()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lz/u0$j$b;->b:Z

    return-void
.end method

.method public run()V
    .locals 2

    iget-object v0, p0, Lz/u0$j$b;->a:Ljava/util/concurrent/Executor;

    new-instance v1, Lz/y0;

    invoke-direct {v1, p0}, Lz/y0;-><init>(Lz/u0$j$b;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
