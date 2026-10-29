.class public final Lt0/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroid/media/ImageWriter$OnImageReleasedListener;Landroid/media/ImageWriter;)V
    .locals 0

    invoke-interface {p0, p1}, Landroid/media/ImageWriter$OnImageReleasedListener;->onImageReleased(Landroid/media/ImageWriter;)V

    return-void
.end method

.method public static synthetic b(Ljava/util/concurrent/Executor;Landroid/media/ImageWriter$OnImageReleasedListener;Landroid/media/ImageWriter;)V
    .locals 1

    new-instance v0, Lt0/c;

    invoke-direct {v0, p1, p2}, Lt0/c;-><init>(Landroid/media/ImageWriter$OnImageReleasedListener;Landroid/media/ImageWriter;)V

    invoke-interface {p0, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static c(Landroid/media/ImageWriter;)V
    .locals 0

    invoke-virtual {p0}, Landroid/media/ImageWriter;->close()V

    return-void
.end method

.method public static d(Landroid/media/ImageWriter;)Landroid/media/Image;
    .locals 0

    invoke-virtual {p0}, Landroid/media/ImageWriter;->dequeueInputImage()Landroid/media/Image;

    move-result-object p0

    return-object p0
.end method

.method public static e(Landroid/view/Surface;I)Landroid/media/ImageWriter;
    .locals 0

    invoke-static {p0, p1}, Landroid/media/ImageWriter;->newInstance(Landroid/view/Surface;I)Landroid/media/ImageWriter;

    move-result-object p0

    return-object p0
.end method

.method public static f(Landroid/media/ImageWriter;Landroid/media/Image;)V
    .locals 0

    invoke-virtual {p0, p1}, Landroid/media/ImageWriter;->queueInputImage(Landroid/media/Image;)V

    return-void
.end method

.method public static g(Landroid/media/ImageWriter;Landroid/media/ImageWriter$OnImageReleasedListener;Ljava/util/concurrent/Executor;)V
    .locals 1

    new-instance v0, Lt0/b;

    invoke-direct {v0, p2, p1}, Lt0/b;-><init>(Ljava/util/concurrent/Executor;Landroid/media/ImageWriter$OnImageReleasedListener;)V

    invoke-static {}, Lp0/o;->a()Landroid/os/Handler;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Landroid/media/ImageWriter;->setOnImageReleasedListener(Landroid/media/ImageWriter$OnImageReleasedListener;Landroid/os/Handler;)V

    return-void
.end method
