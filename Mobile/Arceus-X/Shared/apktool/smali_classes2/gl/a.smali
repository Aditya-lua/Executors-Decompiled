.class public Lgl/a;
.super Lcom/roblox/protocols/bugreporterplatforminterface/generated/IPlatformBugReporter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgl/a$b;
    }
.end annotation


# instance fields
.field public a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Ljava/util/concurrent/Executor;

.field public c:Landroid/app/Activity$ScreenCaptureCallback;

.field public d:Z

.field public e:Lcom/roblox/protocols/bugreporterplatforminterface/generated/IBugReporterCore;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 2
    invoke-direct {p0}, Lcom/roblox/protocols/bugreporterplatforminterface/generated/IPlatformBugReporter;-><init>()V

    .line 3
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lgl/a;->b:Ljava/util/concurrent/Executor;

    const/4 v0, 0x0

    .line 4
    iput-boolean v0, p0, Lgl/a;->d:Z

    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lgl/a;->e:Lcom/roblox/protocols/bugreporterplatforminterface/generated/IBugReporterCore;

    .line 6
    invoke-static {p0}, Lcom/roblox/protocols/bugreporterplatforminterface/generated/IBugReporterCore;->setPlatformImpl(Lcom/roblox/protocols/bugreporterplatforminterface/generated/IPlatformBugReporter;)Lcom/roblox/protocols/bugreporterplatforminterface/generated/IBugReporterCore;

    move-result-object v0

    iput-object v0, p0, Lgl/a;->e:Lcom/roblox/protocols/bugreporterplatforminterface/generated/IBugReporterCore;

    return-void
.end method

.method public synthetic constructor <init>(Lgl/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lgl/a;-><init>()V

    return-void
.end method

.method public static bridge synthetic a(Lgl/a;Lcom/roblox/protocols/bugreporterplatforminterface/generated/BugReporterTriggerType;)V
    .locals 0

    invoke-virtual {p0, p1}, Lgl/a;->c(Lcom/roblox/protocols/bugreporterplatforminterface/generated/BugReporterTriggerType;)V

    return-void
.end method

.method public static b()Lgl/a;
    .locals 1

    invoke-static {}, Lgl/a$b;->a()Lgl/a;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final c(Lcom/roblox/protocols/bugreporterplatforminterface/generated/BugReporterTriggerType;)V
    .locals 1

    iget-object v0, p0, Lgl/a;->e:Lcom/roblox/protocols/bugreporterplatforminterface/generated/IBugReporterCore;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/roblox/protocols/bugreporterplatforminterface/generated/IBugReporterCore;->requestBugReport(Lcom/roblox/protocols/bugreporterplatforminterface/generated/BugReporterTriggerType;)V

    :cond_0
    return-void
.end method

.method public d(Landroid/app/Activity;)V
    .locals 2
    .param p1    # Landroid/app/Activity;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_1

    iget-boolean v0, p0, Lgl/a;->d:Z

    if-eqz v0, :cond_0

    const-string p1, "BugReporterProtocolV2"

    const-string v0, "Unbalanced calls to start and stop. Already started."

    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lgl/a;->a:Ljava/lang/ref/WeakReference;

    new-instance v0, Lgl/a$a;

    invoke-direct {v0, p0}, Lgl/a$a;-><init>(Lgl/a;)V

    iput-object v0, p0, Lgl/a;->c:Landroid/app/Activity$ScreenCaptureCallback;

    iget-object v1, p0, Lgl/a;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {p1, v1, v0}, Landroid/app/Activity;->registerScreenCaptureCallback(Ljava/util/concurrent/Executor;Landroid/app/Activity$ScreenCaptureCallback;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lgl/a;->d:Z

    :cond_1
    return-void
.end method

.method public e()V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_2

    iget-boolean v0, p0, Lgl/a;->d:Z

    const-string v1, "BugReporterProtocolV2"

    if-nez v0, :cond_0

    const-string v0, "Unbalanced calls to start and stop. Not started."

    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lgl/a;->d:Z

    iget-object v0, p0, Lgl/a;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lgl/a;->c:Landroid/app/Activity$ScreenCaptureCallback;

    invoke-virtual {v0, v1}, Landroid/app/Activity;->unregisterScreenCaptureCallback(Landroid/app/Activity$ScreenCaptureCallback;)V

    goto :goto_0

    :cond_1
    const-string v0, "Could not stop listening. Activity is null"

    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    const/4 v0, 0x0

    iput-object v0, p0, Lgl/a;->c:Landroid/app/Activity$ScreenCaptureCallback;

    iput-object v0, p0, Lgl/a;->a:Ljava/lang/ref/WeakReference;

    :cond_2
    return-void
.end method

.method public isAvailable()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
