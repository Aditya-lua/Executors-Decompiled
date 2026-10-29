.class public Lwh/s0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/p;
.implements Lwh/a$f;
.implements Lmk/f$f;
.implements Landroid/view/SurfaceHolder$Callback;


# instance fields
.field public a:Lwh/t0;

.field public final b:Ljava/lang/String;

.field public c:Lzg/a;

.field public d:Ljava/lang/Boolean;

.field public final e:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/roblox/client/a;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Lmk/f;

.field public final g:Landroid/view/SurfaceView;

.field public h:Landroid/hardware/display/DisplayManager;

.field public i:Landroid/hardware/display/DisplayManager$DisplayListener;


# direct methods
.method public constructor <init>(Lcom/roblox/client/a;Landroid/view/SurfaceView;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lwh/t0;->b:Lwh/t0;

    iput-object v0, p0, Lwh/s0;->a:Lwh/t0;

    const-string v0, "MainScreenController"

    iput-object v0, p0, Lwh/s0;->b:Ljava/lang/String;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lwh/s0;->d:Ljava/lang/Boolean;

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lwh/s0;->e:Ljava/lang/ref/WeakReference;

    iput-object p2, p0, Lwh/s0;->g:Landroid/view/SurfaceView;

    new-instance v0, Lmk/f;

    invoke-direct {v0, p1, p2, p0}, Lmk/f;-><init>(Landroid/app/Activity;Landroid/view/SurfaceView;Lmk/f$f;)V

    iput-object v0, p0, Lwh/s0;->f:Lmk/f;

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    invoke-virtual {p2}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object p1

    invoke-interface {p1, p0}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    return-void
.end method

.method public static bridge synthetic a(Lwh/s0;)Landroid/hardware/display/DisplayManager;
    .locals 0

    iget-object p0, p0, Lwh/s0;->h:Landroid/hardware/display/DisplayManager;

    return-object p0
.end method

.method public static bridge synthetic c(Lwh/s0;Landroid/view/Display;)V
    .locals 0

    invoke-virtual {p0, p1}, Lwh/s0;->n(Landroid/view/Display;)V

    return-void
.end method


# virtual methods
.method public I()V
    .locals 0

    return-void
.end method

.method public b()Z
    .locals 1

    iget-object v0, p0, Lwh/s0;->d:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final d()V
    .locals 2

    iget-object v0, p0, Lwh/s0;->h:Landroid/hardware/display/DisplayManager;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lwh/s0;->i:Landroid/hardware/display/DisplayManager$DisplayListener;

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Landroid/hardware/display/DisplayManager;->unregisterDisplayListener(Landroid/hardware/display/DisplayManager$DisplayListener;)V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lwh/s0;->i:Landroid/hardware/display/DisplayManager$DisplayListener;

    iput-object v0, p0, Lwh/s0;->h:Landroid/hardware/display/DisplayManager;

    return-void
.end method

.method public final e()V
    .locals 2

    const-string v0, "MainScreenController"

    const-string v1, "Disposing RTC audio manager."

    invoke-static {v0, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lwh/s0;->c:Lzg/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lzg/a;->a()V

    const/4 v0, 0x0

    iput-object v0, p0, Lwh/s0;->c:Lzg/a;

    :cond_0
    return-void
.end method

.method public f(Z)V
    .locals 1

    iget-object v0, p0, Lwh/s0;->f:Lmk/f;

    invoke-virtual {v0, p1}, Lmk/f;->H(Z)V

    return-void
.end method

.method public g(Landroidx/lifecycle/s;Landroidx/lifecycle/l$a;)V
    .locals 2
    .param p1    # Landroidx/lifecycle/s;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroidx/lifecycle/l$a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onStateChanged: event: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "MainScreenController"

    invoke-static {v1, v0}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v0, Lwh/s0$b;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p2, v0, p2

    const/4 v0, 0x1

    if-eq p2, v0, :cond_4

    const/4 p1, 0x2

    const-string v0, "MEDIA_PICKER"

    const-string v1, "POST_NOTIFICATIONS"

    if-eq p2, p1, :cond_3

    const/4 p1, 0x3

    if-eq p2, p1, :cond_2

    const/4 p1, 0x4

    if-eq p2, p1, :cond_1

    const/4 p1, 0x5

    if-eq p2, p1, :cond_0

    goto/16 :goto_0

    :cond_0
    invoke-virtual {p0}, Lwh/s0;->e()V

    invoke-virtual {p0}, Lwh/s0;->d()V

    return-void

    :cond_1
    invoke-static {}, Lsg/y;->h()Lsg/y;

    move-result-object p1

    invoke-virtual {p1}, Lsg/y;->k()Lom/k;

    move-result-object p1

    invoke-virtual {p1, v1}, Lom/k;->Y(Ljava/lang/String;)V

    invoke-static {}, Lsg/y;->h()Lsg/y;

    move-result-object p1

    invoke-virtual {p1}, Lsg/y;->k()Lom/k;

    move-result-object p1

    invoke-virtual {p1, v0}, Lom/k;->Y(Ljava/lang/String;)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->f4()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-static {}, Lcom/roblox/engine/jni/util/AssertDialogUtil;->b()Z

    move-result p1

    if-eqz p1, :cond_5

    const/4 p1, 0x0

    invoke-static {p1}, Lcom/roblox/engine/jni/util/AssertDialogUtil;->c(Landroid/app/Activity;)V

    return-void

    :cond_2
    iget-object p1, p0, Lwh/s0;->f:Lmk/f;

    invoke-virtual {p1}, Lmk/f;->I()V

    return-void

    :cond_3
    iget-object p1, p0, Lwh/s0;->f:Lmk/f;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lmk/f;->H(Z)V

    invoke-static {}, Lsg/y;->h()Lsg/y;

    move-result-object p1

    invoke-virtual {p1}, Lsg/y;->k()Lom/k;

    move-result-object p1

    invoke-static {}, Ljj/t;->g()Ljj/t;

    move-result-object p2

    invoke-virtual {p1, v1, p2}, Lom/k;->k(Ljava/lang/String;Lom/k$b;)V

    invoke-static {}, Lsg/y;->h()Lsg/y;

    move-result-object p1

    invoke-virtual {p1}, Lsg/y;->k()Lom/k;

    move-result-object p1

    invoke-static {}, Lwi/a;->e()Lwi/a;

    move-result-object p2

    invoke-virtual {p1, v0, p2}, Lom/k;->k(Ljava/lang/String;Lom/k$b;)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->f4()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-static {}, Lcom/roblox/engine/jni/util/AssertDialogUtil;->b()Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object p1, p0, Lwh/s0;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Activity;

    invoke-static {p1}, Lcom/roblox/engine/jni/util/AssertDialogUtil;->c(Landroid/app/Activity;)V

    return-void

    :cond_4
    check-cast p1, Lj/b;

    invoke-virtual {p0, p1}, Lwh/s0;->i(Lj/b;)V

    invoke-virtual {p0}, Lwh/s0;->h()V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->O3()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-static {}, Lvi/b;->n()Z

    move-result p1

    if-nez p1, :cond_5

    iget-object p1, p0, Lwh/s0;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/roblox/client/a;

    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    const/16 p2, 0x2000

    invoke-virtual {p1, p2, p2}, Landroid/view/Window;->setFlags(II)V

    :cond_5
    :goto_0
    return-void
.end method

.method public final h()V
    .locals 3

    iget-object v0, p0, Lwh/s0;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roblox/client/a;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "display"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/display/DisplayManager;

    iput-object v0, p0, Lwh/s0;->h:Landroid/hardware/display/DisplayManager;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    new-instance v0, Lwh/s0$a;

    invoke-direct {v0, p0}, Lwh/s0$a;-><init>(Lwh/s0;)V

    iput-object v0, p0, Lwh/s0;->i:Landroid/hardware/display/DisplayManager$DisplayListener;

    iget-object v1, p0, Lwh/s0;->h:Landroid/hardware/display/DisplayManager;

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Landroid/hardware/display/DisplayManager;->registerDisplayListener(Landroid/hardware/display/DisplayManager$DisplayListener;Landroid/os/Handler;)V

    iget-object v0, p0, Lwh/s0;->h:Landroid/hardware/display/DisplayManager;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/hardware/display/DisplayManager;->getDisplay(I)Landroid/view/Display;

    move-result-object v0

    if-nez v0, :cond_2

    :goto_0
    return-void

    :cond_2
    invoke-virtual {p0, v0}, Lwh/s0;->n(Landroid/view/Display;)V

    invoke-static {v0}, Lel/a;->k(Landroid/view/Display;)[F

    move-result-object v0

    invoke-static {v0}, Lcom/roblox/engine/jni/NativeGLInterface;->nativePassSupportedRefreshRates([F)V

    return-void
.end method

.method public final i(Lj/b;)V
    .locals 2

    const-string v0, "MainScreenController"

    const-string v1, "Initializing RTC audio manager."

    invoke-static {v0, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lsg/y;->h()Lsg/y;

    move-result-object v0

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lsg/y;->c(Landroid/content/Context;)Lzg/a;

    move-result-object v0

    iput-object v0, p0, Lwh/s0;->c:Lzg/a;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lzg/a;->b(Lj/b;)V

    :cond_0
    return-void
.end method

.method public j(I)V
    .locals 3

    iget-object v0, p0, Lwh/s0;->a:Lwh/t0;

    sget-object v1, Lwh/t0;->a:Lwh/t0;

    const-string v2, "MainScreenController"

    if-ne v0, v1, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Handling onTrimMemory level: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    const/16 v0, 0xf

    if-ne p1, v0, :cond_0

    const-string v0, "TRIM_MEMORY_RUNNING_CRITICAL: notify the engine..."

    invoke-static {v2, v0}, Lgk/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeAppBridgeV2OnLowMemory()V

    :cond_0
    iget-object v0, p0, Lwh/s0;->a:Lwh/t0;

    invoke-static {v2, v0, p1}, Lcom/roblox/client/RobloxApplication;->g(Ljava/lang/String;Lwh/t0;I)V

    iget-object v0, p0, Lwh/s0;->a:Lwh/t0;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    invoke-static {v0, p1}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeAppBridgeV2OnLowMemoryForRenderView(II)V

    return-void
.end method

.method public k(Lwh/t0;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Roblox has entered "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " mode."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "MainScreenController"

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iput-object p1, p0, Lwh/s0;->a:Lwh/t0;

    return-void
.end method

.method public l()V
    .locals 1

    iget-object v0, p0, Lwh/s0;->f:Lmk/f;

    invoke-virtual {v0}, Lmk/f;->I()V

    return-void
.end method

.method public final n(Landroid/view/Display;)V
    .locals 1

    iget-object v0, p0, Lwh/s0;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roblox/client/a;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {p1}, Lel/a;->a(Landroid/view/Display;)F

    move-result p1

    invoke-static {p1}, Lcom/roblox/engine/jni/NativeGLInterface;->nativePassCurrentDisplayRefreshRate(F)V

    return-void
.end method

.method public surfaceChanged(Landroid/view/SurfaceHolder;III)V
    .locals 0
    .param p1    # Landroid/view/SurfaceHolder;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const-string p1, "MainScreenController"

    const-string p2, "surfaceChanged"

    invoke-static {p1, p2}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public surfaceCreated(Landroid/view/SurfaceHolder;)V
    .locals 1
    .param p1    # Landroid/view/SurfaceHolder;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const-string p1, "MainScreenController"

    const-string v0, "surfaceCreated"

    invoke-static {p1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object p1, p0, Lwh/s0;->d:Ljava/lang/Boolean;

    return-void
.end method

.method public surfaceDestroyed(Landroid/view/SurfaceHolder;)V
    .locals 1
    .param p1    # Landroid/view/SurfaceHolder;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const-string p1, "MainScreenController"

    const-string v0, "surfaceDestroyed"

    invoke-static {p1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object p1, p0, Lwh/s0;->d:Ljava/lang/Boolean;

    return-void
.end method
