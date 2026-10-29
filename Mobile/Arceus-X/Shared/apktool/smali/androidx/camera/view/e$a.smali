.class public Landroidx/camera/view/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/TextureView$SurfaceTextureListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/camera/view/e;->n()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroidx/camera/view/e;


# direct methods
.method public constructor <init>(Landroidx/camera/view/e;)V
    .locals 0

    iput-object p1, p0, Landroidx/camera/view/e$a;->a:Landroidx/camera/view/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onSurfaceTextureAvailable(Landroid/graphics/SurfaceTexture;II)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SurfaceTexture available. Size: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, "x"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string p3, "TextureViewImpl"

    invoke-static {p3, p2}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p2, p0, Landroidx/camera/view/e$a;->a:Landroidx/camera/view/e;

    iput-object p1, p2, Landroidx/camera/view/e;->f:Landroid/graphics/SurfaceTexture;

    iget-object p1, p2, Landroidx/camera/view/e;->g:Lne/x;

    if-eqz p1, :cond_0

    iget-object p1, p2, Landroidx/camera/view/e;->h:Lg0/v2;

    invoke-static {p1}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Surface invalidated "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p0, Landroidx/camera/view/e$a;->a:Landroidx/camera/view/e;

    iget-object p2, p2, Landroidx/camera/view/e;->h:Lg0/v2;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p3, p1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Landroidx/camera/view/e$a;->a:Landroidx/camera/view/e;

    iget-object p1, p1, Landroidx/camera/view/e;->h:Lg0/v2;

    invoke-virtual {p1}, Lg0/v2;->n()Ln0/u1;

    move-result-object p1

    invoke-virtual {p1}, Ln0/u1;->d()V

    return-void

    :cond_0
    invoke-virtual {p2}, Landroidx/camera/view/e;->q()V

    return-void
.end method

.method public onSurfaceTextureDestroyed(Landroid/graphics/SurfaceTexture;)Z
    .locals 3

    iget-object v0, p0, Landroidx/camera/view/e$a;->a:Landroidx/camera/view/e;

    const/4 v1, 0x0

    iput-object v1, v0, Landroidx/camera/view/e;->f:Landroid/graphics/SurfaceTexture;

    iget-object v0, v0, Landroidx/camera/view/e;->g:Lne/x;

    if-eqz v0, :cond_0

    new-instance v1, Landroidx/camera/view/e$a$a;

    invoke-direct {v1, p0, p1}, Landroidx/camera/view/e$a$a;-><init>(Landroidx/camera/view/e$a;Landroid/graphics/SurfaceTexture;)V

    iget-object v2, p0, Landroidx/camera/view/e$a;->a:Landroidx/camera/view/e;

    iget-object v2, v2, Landroidx/camera/view/e;->e:Landroid/view/TextureView;

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Ll2/b;->i(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lr0/n;->j(Lne/x;Lr0/c;Ljava/util/concurrent/Executor;)V

    iget-object v0, p0, Landroidx/camera/view/e$a;->a:Landroidx/camera/view/e;

    iput-object p1, v0, Landroidx/camera/view/e;->j:Landroid/graphics/SurfaceTexture;

    const/4 p1, 0x0

    return p1

    :cond_0
    const-string p1, "TextureViewImpl"

    const-string v0, "SurfaceTexture about to be destroyed"

    invoke-static {p1, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1
.end method

.method public onSurfaceTextureSizeChanged(Landroid/graphics/SurfaceTexture;II)V
    .locals 1

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "SurfaceTexture size changed: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, "x"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "TextureViewImpl"

    invoke-static {p2, p1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onSurfaceTextureUpdated(Landroid/graphics/SurfaceTexture;)V
    .locals 1

    iget-object p1, p0, Landroidx/camera/view/e$a;->a:Landroidx/camera/view/e;

    iget-object p1, p1, Landroidx/camera/view/e;->k:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ly1/c$a;

    if-eqz p1, :cond_0

    invoke-virtual {p1, v0}, Ly1/c$a;->c(Ljava/lang/Object;)Z

    :cond_0
    iget-object p1, p0, Landroidx/camera/view/e$a;->a:Landroidx/camera/view/e;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p0, Landroidx/camera/view/e$a;->a:Landroidx/camera/view/e;

    iget-object p1, p1, Landroidx/camera/view/e;->m:Ljava/util/concurrent/Executor;

    return-void
.end method
