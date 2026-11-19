.class public Landroidx/camera/view/d$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/SurfaceHolder$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/view/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public a:Landroid/util/Size;

.field public b:Lg0/v2;

.field public c:Lg0/v2;

.field public d:Landroidx/camera/view/c$a;

.field public e:Landroid/util/Size;

.field public f:Z

.field public g:Z

.field public final synthetic h:Landroidx/camera/view/d;


# direct methods
.method public constructor <init>(Landroidx/camera/view/d;)V
    .locals 0

    iput-object p1, p0, Landroidx/camera/view/d$b;->h:Landroidx/camera/view/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Landroidx/camera/view/d$b;->f:Z

    iput-boolean p1, p0, Landroidx/camera/view/d$b;->g:Z

    return-void
.end method

.method public static synthetic a(Landroidx/camera/view/c$a;Lg0/v2$g;)V
    .locals 1

    const-string p1, "SurfaceViewImpl"

    const-string v0, "Safe to release surface."

    invoke-static {p1, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p0, :cond_0

    invoke-interface {p0}, Landroidx/camera/view/c$a;->a()V

    :cond_0
    return-void
.end method


# virtual methods
.method public final b()Z
    .locals 2

    iget-boolean v0, p0, Landroidx/camera/view/d$b;->f:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/camera/view/d$b;->b:Lg0/v2;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/camera/view/d$b;->a:Landroid/util/Size;

    iget-object v1, p0, Landroidx/camera/view/d$b;->e:Landroid/util/Size;

    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final c()V
    .locals 2

    iget-object v0, p0, Landroidx/camera/view/d$b;->b:Lg0/v2;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Request canceled: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/camera/view/d$b;->b:Lg0/v2;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "SurfaceViewImpl"

    invoke-static {v1, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/camera/view/d$b;->b:Lg0/v2;

    invoke-virtual {v0}, Lg0/v2;->z()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/camera/view/d$b;->d:Landroidx/camera/view/c$a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroidx/camera/view/c$a;->a()V

    :cond_0
    return-void
.end method

.method public final d()V
    .locals 2

    iget-object v0, p0, Landroidx/camera/view/d$b;->b:Lg0/v2;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Surface closed "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/camera/view/d$b;->b:Lg0/v2;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "SurfaceViewImpl"

    invoke-static {v1, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/camera/view/d$b;->b:Lg0/v2;

    invoke-virtual {v0}, Lg0/v2;->n()Ln0/u1;

    move-result-object v0

    invoke-virtual {v0}, Ln0/u1;->d()V

    :cond_0
    return-void
.end method

.method public e(Lg0/v2;Landroidx/camera/view/c$a;)V
    .locals 2

    invoke-virtual {p0}, Landroidx/camera/view/d$b;->c()V

    iget-boolean v0, p0, Landroidx/camera/view/d$b;->g:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iput-boolean v1, p0, Landroidx/camera/view/d$b;->g:Z

    invoke-virtual {p1}, Lg0/v2;->t()Z

    return-void

    :cond_0
    iput-object p1, p0, Landroidx/camera/view/d$b;->b:Lg0/v2;

    iput-object p2, p0, Landroidx/camera/view/d$b;->d:Landroidx/camera/view/c$a;

    invoke-virtual {p1}, Lg0/v2;->q()Landroid/util/Size;

    move-result-object p1

    iput-object p1, p0, Landroidx/camera/view/d$b;->a:Landroid/util/Size;

    iput-boolean v1, p0, Landroidx/camera/view/d$b;->f:Z

    invoke-virtual {p0}, Landroidx/camera/view/d$b;->f()Z

    move-result p2

    if-nez p2, :cond_1

    const-string p2, "SurfaceViewImpl"

    const-string v0, "Wait for new Surface creation."

    invoke-static {p2, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p2, p0, Landroidx/camera/view/d$b;->h:Landroidx/camera/view/d;

    iget-object p2, p2, Landroidx/camera/view/d;->e:Landroid/view/SurfaceView;

    invoke-virtual {p2}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object p2

    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    move-result p1

    invoke-interface {p2, v0, p1}, Landroid/view/SurfaceHolder;->setFixedSize(II)V

    :cond_1
    return-void
.end method

.method public final f()Z
    .locals 5

    iget-object v0, p0, Landroidx/camera/view/d$b;->h:Landroidx/camera/view/d;

    iget-object v0, v0, Landroidx/camera/view/d;->e:Landroid/view/SurfaceView;

    invoke-virtual {v0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/camera/view/d$b;->b()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "SurfaceViewImpl"

    const-string v2, "Surface set on Preview."

    invoke-static {v1, v2}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Landroidx/camera/view/d$b;->d:Landroidx/camera/view/c$a;

    iget-object v2, p0, Landroidx/camera/view/d$b;->b:Lg0/v2;

    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v3, p0, Landroidx/camera/view/d$b;->h:Landroidx/camera/view/d;

    iget-object v3, v3, Landroidx/camera/view/d;->e:Landroid/view/SurfaceView;

    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Ll2/b;->i(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    move-result-object v3

    new-instance v4, Lp1/j0;

    invoke-direct {v4, v1}, Lp1/j0;-><init>(Landroidx/camera/view/c$a;)V

    invoke-virtual {v2, v0, v3, v4}, Lg0/v2;->w(Landroid/view/Surface;Ljava/util/concurrent/Executor;Lx2/a;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/camera/view/d$b;->f:Z

    iget-object v1, p0, Landroidx/camera/view/d$b;->h:Landroidx/camera/view/d;

    invoke-virtual {v1}, Landroidx/camera/view/c;->f()V

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public surfaceChanged(Landroid/view/SurfaceHolder;III)V
    .locals 0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Surface changed. Size: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, "x"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "SurfaceViewImpl"

    invoke-static {p2, p1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Landroid/util/Size;

    invoke-direct {p1, p3, p4}, Landroid/util/Size;-><init>(II)V

    iput-object p1, p0, Landroidx/camera/view/d$b;->e:Landroid/util/Size;

    invoke-virtual {p0}, Landroidx/camera/view/d$b;->f()Z

    return-void
.end method

.method public surfaceCreated(Landroid/view/SurfaceHolder;)V
    .locals 1

    const-string p1, "SurfaceViewImpl"

    const-string v0, "Surface created."

    invoke-static {p1, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-boolean p1, p0, Landroidx/camera/view/d$b;->g:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Landroidx/camera/view/d$b;->c:Lg0/v2;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lg0/v2;->t()Z

    const/4 p1, 0x0

    iput-object p1, p0, Landroidx/camera/view/d$b;->c:Lg0/v2;

    const/4 p1, 0x0

    iput-boolean p1, p0, Landroidx/camera/view/d$b;->g:Z

    :cond_0
    return-void
.end method

.method public surfaceDestroyed(Landroid/view/SurfaceHolder;)V
    .locals 1

    const-string p1, "SurfaceViewImpl"

    const-string v0, "Surface destroyed."

    invoke-static {p1, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-boolean p1, p0, Landroidx/camera/view/d$b;->f:Z

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroidx/camera/view/d$b;->d()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/camera/view/d$b;->c()V

    :goto_0
    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/camera/view/d$b;->g:Z

    iget-object p1, p0, Landroidx/camera/view/d$b;->b:Lg0/v2;

    if-eqz p1, :cond_1

    iput-object p1, p0, Landroidx/camera/view/d$b;->c:Lg0/v2;

    :cond_1
    const/4 p1, 0x0

    iput-boolean p1, p0, Landroidx/camera/view/d$b;->f:Z

    const/4 p1, 0x0

    iput-object p1, p0, Landroidx/camera/view/d$b;->b:Lg0/v2;

    iput-object p1, p0, Landroidx/camera/view/d$b;->d:Landroidx/camera/view/c$a;

    iput-object p1, p0, Landroidx/camera/view/d$b;->e:Landroid/util/Size;

    iput-object p1, p0, Landroidx/camera/view/d$b;->a:Landroid/util/Size;

    return-void
.end method
