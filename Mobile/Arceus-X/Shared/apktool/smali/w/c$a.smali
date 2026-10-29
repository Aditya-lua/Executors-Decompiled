.class public Lw/c$a;
.super Lc/a$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw/c;->b(Lw/b;)Lc/a$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public a:Landroid/os/Handler;

.field public final synthetic b:Lw/b;

.field public final synthetic c:Lw/c;


# direct methods
.method public constructor <init>(Lw/c;Lw/b;)V
    .locals 0

    iput-object p1, p0, Lw/c$a;->c:Lw/c;

    iput-object p2, p0, Lw/c$a;->b:Lw/b;

    invoke-direct {p0}, Lc/a$a;-><init>()V

    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lw/c$a;->a:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method public L1(ILandroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Lw/c$a;->b:Lw/b;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lw/c$a;->a:Landroid/os/Handler;

    new-instance v1, Lw/c$a$b;

    invoke-direct {v1, p0, p1, p2}, Lw/c$a$b;-><init>(Lw/c$a;ILandroid/os/Bundle;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public M(Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Lw/c$a;->b:Lw/b;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {v0, p1, p2}, Lw/b;->extraCallbackWithResult(Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object p1

    return-object p1
.end method

.method public c2(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Lw/c$a;->b:Lw/b;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lw/c$a;->a:Landroid/os/Handler;

    new-instance v1, Lw/c$a$e;

    invoke-direct {v1, p0, p1, p2}, Lw/c$a$e;-><init>(Lw/c$a;Ljava/lang/String;Landroid/os/Bundle;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public g2(Landroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Lw/c$a;->b:Lw/b;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lw/c$a;->a:Landroid/os/Handler;

    new-instance v1, Lw/c$a$d;

    invoke-direct {v1, p0, p1}, Lw/c$a$d;-><init>(Lw/c$a;Landroid/os/Bundle;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public j2(ILandroid/net/Uri;ZLandroid/os/Bundle;)V
    .locals 7

    iget-object v0, p0, Lw/c$a;->b:Lw/b;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lw/c$a;->a:Landroid/os/Handler;

    new-instance v1, Lw/c$a$f;

    move-object v2, p0

    move v3, p1

    move-object v4, p2

    move v5, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Lw/c$a$f;-><init>(Lw/c$a;ILandroid/net/Uri;ZLandroid/os/Bundle;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public l1(Landroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Lw/c$a;->b:Lw/b;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lw/c$a;->a:Landroid/os/Handler;

    new-instance v1, Lw/c$a$j;

    invoke-direct {v1, p0, p1}, Lw/c$a$j;-><init>(Lw/c$a;Landroid/os/Bundle;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public m0(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Lw/c$a;->b:Lw/b;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lw/c$a;->a:Landroid/os/Handler;

    new-instance v1, Lw/c$a$c;

    invoke-direct {v1, p0, p1, p2}, Lw/c$a$c;-><init>(Lw/c$a;Ljava/lang/String;Landroid/os/Bundle;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public p0(Landroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Lw/c$a;->b:Lw/b;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lw/c$a;->a:Landroid/os/Handler;

    new-instance v1, Lw/c$a$h;

    invoke-direct {v1, p0, p1}, Lw/c$a$h;-><init>(Lw/c$a;Landroid/os/Bundle;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public q1(Landroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Lw/c$a;->b:Lw/b;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lw/c$a;->a:Landroid/os/Handler;

    new-instance v1, Lw/c$a$a;

    invoke-direct {v1, p0, p1}, Lw/c$a$a;-><init>(Lw/c$a;Landroid/os/Bundle;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public w1(IILandroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Lw/c$a;->b:Lw/b;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lw/c$a;->a:Landroid/os/Handler;

    new-instance v1, Lw/c$a$g;

    invoke-direct {v1, p0, p1, p2, p3}, Lw/c$a$g;-><init>(Lw/c$a;IILandroid/os/Bundle;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public z(IIIIILandroid/os/Bundle;)V
    .locals 9

    iget-object v0, p0, Lw/c$a;->b:Lw/b;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lw/c$a;->a:Landroid/os/Handler;

    new-instance v1, Lw/c$a$i;

    move-object v2, p0

    move v3, p1

    move v4, p2

    move v5, p3

    move v6, p4

    move v7, p5

    move-object v8, p6

    invoke-direct/range {v1 .. v8}, Lw/c$a$i;-><init>(Lw/c$a;IIIIILandroid/os/Bundle;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
