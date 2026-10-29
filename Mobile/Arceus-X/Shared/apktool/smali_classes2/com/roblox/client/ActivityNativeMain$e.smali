.class public Lcom/roblox/client/ActivityNativeMain$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/SurfaceHolder$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/ActivityNativeMain;->C2()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public a:Landroid/graphics/Bitmap;

.field public b:Z

.field public final synthetic c:Landroid/view/ViewGroup;

.field public final synthetic d:Landroid/view/SurfaceView;

.field public final synthetic e:Lcom/roblox/client/ActivityNativeMain;


# direct methods
.method public constructor <init>(Lcom/roblox/client/ActivityNativeMain;Landroid/view/ViewGroup;Landroid/view/SurfaceView;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/roblox/client/ActivityNativeMain$e;->e:Lcom/roblox/client/ActivityNativeMain;

    iput-object p2, p0, Lcom/roblox/client/ActivityNativeMain$e;->c:Landroid/view/ViewGroup;

    iput-object p3, p0, Lcom/roblox/client/ActivityNativeMain$e;->d:Landroid/view/SurfaceView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/roblox/client/ActivityNativeMain$e;->a:Landroid/graphics/Bitmap;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/roblox/client/ActivityNativeMain$e;->b:Z

    return-void
.end method

.method public static synthetic a(Lcom/roblox/client/ActivityNativeMain$e;I)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/roblox/client/ActivityNativeMain$e;->b(I)V

    return-void
.end method


# virtual methods
.method public final synthetic b(I)V
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lcom/roblox/client/ActivityNativeMain$e;->b:Z

    return-void
.end method

.method public surfaceChanged(Landroid/view/SurfaceHolder;III)V
    .locals 0
    .param p1    # Landroid/view/SurfaceHolder;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    return-void
.end method

.method public surfaceCreated(Landroid/view/SurfaceHolder;)V
    .locals 3
    .param p1    # Landroid/view/SurfaceHolder;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object p1, p0, Lcom/roblox/client/ActivityNativeMain$e;->e:Lcom/roblox/client/ActivityNativeMain;

    invoke-static {p1}, Lcom/roblox/client/ActivityNativeMain;->v2(Lcom/roblox/client/ActivityNativeMain;)Landroid/widget/ImageView;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/roblox/client/ActivityNativeMain$e;->a:Landroid/graphics/Bitmap;

    if-eqz p1, :cond_0

    iget-boolean p1, p0, Lcom/roblox/client/ActivityNativeMain$e;->b:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/roblox/client/ActivityNativeMain$e;->e:Lcom/roblox/client/ActivityNativeMain;

    invoke-static {p1}, Lcom/roblox/client/ActivityNativeMain;->v2(Lcom/roblox/client/ActivityNativeMain;)Landroid/widget/ImageView;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object p1, p0, Lcom/roblox/client/ActivityNativeMain$e;->e:Lcom/roblox/client/ActivityNativeMain;

    invoke-static {p1}, Lcom/roblox/client/ActivityNativeMain;->v2(Lcom/roblox/client/ActivityNativeMain;)Landroid/widget/ImageView;

    move-result-object p1

    iget-object v1, p0, Lcom/roblox/client/ActivityNativeMain$e;->a:Landroid/graphics/Bitmap;

    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    iget-object p1, p0, Lcom/roblox/client/ActivityNativeMain$e;->e:Lcom/roblox/client/ActivityNativeMain;

    const-wide/16 v1, 0xbb8

    invoke-static {p1, v1, v2}, Lcom/roblox/client/ActivityNativeMain;->y2(Lcom/roblox/client/ActivityNativeMain;J)V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/roblox/client/ActivityNativeMain$e;->a:Landroid/graphics/Bitmap;

    iput-boolean v0, p0, Lcom/roblox/client/ActivityNativeMain$e;->b:Z

    :cond_0
    return-void
.end method

.method public surfaceDestroyed(Landroid/view/SurfaceHolder;)V
    .locals 6
    .param p1    # Landroid/view/SurfaceHolder;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object p1, p0, Lcom/roblox/client/ActivityNativeMain$e;->e:Lcom/roblox/client/ActivityNativeMain;

    invoke-static {p1}, Lcom/roblox/client/ActivityNativeMain;->v2(Lcom/roblox/client/ActivityNativeMain;)Landroid/widget/ImageView;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/roblox/client/ActivityNativeMain$e;->c:Landroid/view/ViewGroup;

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p1

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain$e;->c:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    mul-int/2addr p1, v0

    int-to-long v0, p1

    const-wide/16 v2, 0x4

    mul-long/2addr v0, v2

    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Runtime;->freeMemory()J

    move-result-wide v2

    cmp-long p1, v2, v0

    const-string v4, "rbx.main"

    if-gez p1, :cond_0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "surfaceDestroyed: Not enough memory for screenshot. Available: "

    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, ", Required: "

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v4, p1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    :try_start_0
    iget-object p1, p0, Lcom/roblox/client/ActivityNativeMain$e;->c:Landroid/view/ViewGroup;

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p1

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain$e;->c:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {p1, v0, v1}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object p1

    iput-object p1, p0, Lcom/roblox/client/ActivityNativeMain$e;->a:Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain$e;->d:Landroid/view/SurfaceView;

    new-instance v1, Lsg/p;

    invoke-direct {v1, p0}, Lsg/p;-><init>(Lcom/roblox/client/ActivityNativeMain$e;)V

    new-instance v2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    invoke-static {v0, p1, v1, v2}, Landroid/view/PixelCopy;->request(Landroid/view/SurfaceView;Landroid/graphics/Bitmap;Landroid/view/PixelCopy$OnPixelCopyFinishedListener;Landroid/os/Handler;)V

    return-void

    :catch_0
    move-exception p1

    const-string v0, "surfaceDestroyed: Out of memory while creating screenshot."

    invoke-static {v4, v0, p1}, Lgk/q;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_1
    return-void
.end method
