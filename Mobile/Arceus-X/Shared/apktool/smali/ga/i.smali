.class public final Lga/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;
.implements Lga/l;


# instance fields
.field public final a:Lga/c;

.field public final b:Lfb/d;

.field public c:Ljava/lang/ref/WeakReference;

.field public d:Z


# direct methods
.method public constructor <init>(Lga/c;I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lga/i;->d:Z

    iput-object p1, p0, Lga/i;->a:Lga/c;

    new-instance p1, Lfb/d;

    const/4 v0, 0x0

    invoke-direct {p1, p2, v0}, Lfb/d;-><init>(ILandroid/os/IBinder;)V

    iput-object p1, p0, Lga/i;->b:Lfb/d;

    return-void
.end method

.method public static b(Lga/c;I)Lga/i;
    .locals 1

    new-instance v0, Lga/i;

    invoke-direct {v0, p0, p1}, Lga/i;-><init>(Lga/c;I)V

    return-object v0
.end method


# virtual methods
.method public final a(Landroid/app/Activity;)V
    .locals 3

    const v0, 0x1020002

    :try_start_0
    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "PopupManager"

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "Failed to bind to: "

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lfb/s0;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v2, "Binding to: "

    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lfb/s0;->c(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lga/i;->f(Landroid/view/View;)V

    return-void
.end method

.method public final c()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Lga/i;->b:Lfb/d;

    invoke-virtual {v0}, Lfb/d;->a()Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method

.method public final d()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lga/i;->b:Lfb/d;

    iget-object v0, v0, Lfb/d;->a:Landroid/os/IBinder;

    return-object v0
.end method

.method public final e()Lfb/d;
    .locals 1

    iget-object v0, p0, Lga/i;->b:Lfb/d;

    return-object v0
.end method

.method public final f(Landroid/view/View;)V
    .locals 4
    .annotation build Landroid/annotation/TargetApi;
        value = 0x10
    .end annotation

    iget-object v0, p0, Lga/i;->a:Lga/c;

    invoke-virtual {v0}, Lga/c;->j()V

    iget-object v1, p0, Lga/i;->c:Ljava/lang/ref/WeakReference;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    invoke-virtual {v0}, Ln9/c;->getContext()Landroid/content/Context;

    move-result-object v2

    if-nez v1, :cond_0

    instance-of v3, v2, Landroid/app/Activity;

    if-eqz v3, :cond_0

    check-cast v2, Landroid/app/Activity;

    invoke-virtual {v2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    :cond_0
    if-eqz v1, :cond_2

    invoke-virtual {v1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    invoke-virtual {v1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v1

    invoke-static {}, Lu9/m;->b()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v1, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v1, p0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    :cond_2
    :goto_0
    const/4 v1, 0x0

    iput-object v1, p0, Lga/i;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ln9/c;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "PopupManager"

    if-nez p1, :cond_4

    instance-of v2, v0, Landroid/app/Activity;

    if-eqz v2, :cond_4

    check-cast v0, Landroid/app/Activity;

    const v2, 0x1020002

    :try_start_0
    invoke-virtual {v0, v2}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    if-nez p1, :cond_3

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    :cond_3
    const-string v0, "You have not specified a View to use as content view for popups. Falling back to the Activity content view. Note that this may not work as expected in multi-screen environments"

    invoke-static {v1, v0}, Lfb/s0;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    if-eqz p1, :cond_5

    invoke-virtual {p0, p1}, Lga/i;->h(Landroid/view/View;)V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lga/i;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1, p0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    return-void

    :cond_5
    const-string p1, "No content view usable to display popups. Popups will not be displayed in response to this client\'s calls. Use setViewForPopups() to set your content view."

    invoke-static {v1, p1}, Lfb/s0;->f(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final g()V
    .locals 3

    iget-object v0, p0, Lga/i;->b:Lfb/d;

    iget-object v1, v0, Lfb/d;->a:Landroid/os/IBinder;

    if-eqz v1, :cond_0

    iget-object v2, p0, Lga/i;->a:Lga/c;

    invoke-virtual {v0}, Lfb/d;->a()Landroid/os/Bundle;

    move-result-object v0

    invoke-virtual {v2, v1, v0}, Lga/c;->i(Landroid/os/IBinder;Landroid/os/Bundle;)V

    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lga/i;->d:Z

    return-void

    :cond_0
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public final h(Landroid/view/View;)V
    .locals 5
    .annotation build Landroid/annotation/TargetApi;
        value = 0x11
    .end annotation

    invoke-static {}, Lu9/m;->c()Z

    move-result v0

    const/4 v1, -0x1

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getDisplay()Landroid/view/Display;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/Display;->getDisplayId()I

    move-result v1

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v0

    const/4 v2, 0x2

    new-array v2, v2, [I

    invoke-virtual {p1, v2}, Landroid/view/View;->getLocationInWindow([I)V

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v3

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    iget-object v4, p0, Lga/i;->b:Lfb/d;

    iput v1, v4, Lfb/d;->c:I

    iput-object v0, v4, Lfb/d;->a:Landroid/os/IBinder;

    const/4 v0, 0x0

    aget v0, v2, v0

    iput v0, v4, Lfb/d;->d:I

    const/4 v1, 0x1

    aget v1, v2, v1

    iput v1, v4, Lfb/d;->e:I

    add-int/2addr v0, v3

    iput v0, v4, Lfb/d;->f:I

    add-int/2addr v1, p1

    iput v1, v4, Lfb/d;->g:I

    iget-boolean p1, p0, Lga/i;->d:Z

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lga/i;->g()V

    :cond_1
    return-void
.end method

.method public final onGlobalLayout()V
    .locals 1

    iget-object v0, p0, Lga/i;->c:Ljava/lang/ref/WeakReference;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-eqz v0, :cond_1

    invoke-virtual {p0, v0}, Lga/i;->h(Landroid/view/View;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0, p1}, Lga/i;->h(Landroid/view/View;)V

    return-void
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lga/i;->a:Lga/c;

    invoke-virtual {v0}, Lga/c;->j()V

    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    return-void
.end method
