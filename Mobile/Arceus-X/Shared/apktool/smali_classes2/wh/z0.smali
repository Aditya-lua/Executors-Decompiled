.class public Lwh/z0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public b:Landroid/os/PowerManager$OnThermalStatusChangedListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwh/z0;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_2

    iget-object v0, p0, Lwh/z0;->a:Landroid/content/Context;

    const-string v1, "power"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/PowerManager;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lwh/z0;->b:Landroid/os/PowerManager$OnThermalStatusChangedListener;

    if-eqz v1, :cond_1

    invoke-virtual {v0, v1}, Landroid/os/PowerManager;->removeThermalStatusListener(Landroid/os/PowerManager$OnThermalStatusChangedListener;)V

    :cond_1
    invoke-virtual {v0}, Landroid/os/PowerManager;->getCurrentThermalStatus()I

    move-result v1

    invoke-static {v1}, Lcom/roblox/engine/jni/NativeGLInterface;->reportThermalStateChanged(I)V

    const-string v1, "ThermalStatusObserver"

    const-string v2, "startObserving"

    invoke-static {v1, v2}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v1, Lwh/z0$a;

    invoke-direct {v1, p0}, Lwh/z0$a;-><init>(Lwh/z0;)V

    iput-object v1, p0, Lwh/z0;->b:Landroid/os/PowerManager$OnThermalStatusChangedListener;

    invoke-virtual {v0, v1}, Landroid/os/PowerManager;->addThermalStatusListener(Landroid/os/PowerManager$OnThermalStatusChangedListener;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public b()V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_1

    iget-object v0, p0, Lwh/z0;->b:Landroid/os/PowerManager$OnThermalStatusChangedListener;

    if-eqz v0, :cond_1

    const-string v0, "ThermalStatusObserver"

    const-string v1, "stopObserving"

    invoke-static {v0, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lwh/z0;->a:Landroid/content/Context;

    const-string v1, "power"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/PowerManager;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lwh/z0;->b:Landroid/os/PowerManager$OnThermalStatusChangedListener;

    if-eqz v1, :cond_1

    invoke-virtual {v0, v1}, Landroid/os/PowerManager;->removeThermalStatusListener(Landroid/os/PowerManager$OnThermalStatusChangedListener;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lwh/z0;->b:Landroid/os/PowerManager$OnThermalStatusChangedListener;

    const/4 v0, -0x1

    invoke-static {v0}, Lcom/roblox/engine/jni/NativeGLInterface;->reportThermalStateChanged(I)V

    :cond_1
    :goto_0
    return-void
.end method
