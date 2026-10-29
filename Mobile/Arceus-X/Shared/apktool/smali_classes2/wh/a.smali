.class public Lwh/a;
.super Lsg/x0;
.source "SourceFile"

# interfaces
.implements Landroid/view/SurfaceHolder$Callback;
.implements Lmk/f$f;
.implements Landroid/view/View$OnClickListener;
.implements Lej/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lwh/a$d;,
        Lwh/a$f;,
        Lwh/a$g;,
        Lwh/a$e;,
        Lwh/a$c;
    }
.end annotation


# instance fields
.field public final H0:Ljava/lang/String;

.field public I0:Lwh/a$g;

.field public J0:Landroid/view/SurfaceView;

.field public K0:Landroid/view/View;

.field public L0:Landroid/view/View;

.field public M0:Lnk/a;

.field public N0:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

.field public O0:Landroid/os/Handler;

.field public P0:Lwh/w0;

.field public Q0:Z

.field public R0:Lcom/roblox/client/purchase/IAPPurchaseManager;

.field public S0:Lwh/a$f;

.field public T0:Lwh/a$d;

.field public U0:Lwh/x0;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Lsg/x0;-><init>()V

    const-string v0, "AppShellFragment"

    iput-object v0, p0, Lwh/a;->H0:Ljava/lang/String;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lwh/a;->O0:Landroid/os/Handler;

    new-instance v0, Lwh/a$d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lwh/a$d;-><init>(Lwh/a;Lwh/b;)V

    new-instance v1, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;

    iget-object v2, p0, Lwh/a;->O0:Landroid/os/Handler;

    invoke-direct {v1, v2, v0}, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;-><init>(Landroid/os/Handler;Lcom/roblox/engine/jni/EngineJavaCallback2;)V

    invoke-static {}, Lwh/f;->j()Lwh/f;

    move-result-object v2

    invoke-virtual {v2, v1}, Lwh/f;->D(Lcom/roblox/engine/jni/EngineJavaCallback2;)V

    new-instance v1, Lcom/roblox/client/purchase/IAPPurchaseManager;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/roblox/client/purchase/IAPPurchaseManager;-><init>(Lej/a;Z)V

    iput-object v1, p0, Lwh/a;->R0:Lcom/roblox/client/purchase/IAPPurchaseManager;

    iput-object v0, p0, Lwh/a;->T0:Lwh/a$d;

    return-void
.end method

.method public static bridge synthetic A2(Lwh/a;)Lwh/a$f;
    .locals 0

    iget-object p0, p0, Lwh/a;->S0:Lwh/a$f;

    return-object p0
.end method

.method public static bridge synthetic B2(Lwh/a;)Landroid/view/View;
    .locals 0

    iget-object p0, p0, Lwh/a;->K0:Landroid/view/View;

    return-object p0
.end method

.method public static bridge synthetic C2(Lwh/a;)Lwh/w0;
    .locals 0

    iget-object p0, p0, Lwh/a;->P0:Lwh/w0;

    return-object p0
.end method

.method public static bridge synthetic D2(Lwh/a;)Lnk/a;
    .locals 0

    iget-object p0, p0, Lwh/a;->M0:Lnk/a;

    return-object p0
.end method

.method public static bridge synthetic E2(Lwh/a;)Lcom/roblox/client/purchase/IAPPurchaseManager;
    .locals 0

    iget-object p0, p0, Lwh/a;->R0:Lcom/roblox/client/purchase/IAPPurchaseManager;

    return-object p0
.end method

.method public static bridge synthetic F2(Lwh/a;)Lwh/a$g;
    .locals 0

    iget-object p0, p0, Lwh/a;->I0:Lwh/a$g;

    return-object p0
.end method

.method public static bridge synthetic G2(Lwh/a;)Landroid/view/SurfaceView;
    .locals 0

    iget-object p0, p0, Lwh/a;->J0:Landroid/view/SurfaceView;

    return-object p0
.end method


# virtual methods
.method public B0(Landroid/app/Activity;)V
    .locals 1
    .param p1    # Landroid/app/Activity;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-super {p0, p1}, Landroidx/fragment/app/c;->B0(Landroid/app/Activity;)V

    instance-of v0, p1, Lwh/a$f;

    if-eqz v0, :cond_0

    check-cast p1, Lwh/a$f;

    iput-object p1, p0, Lwh/a;->S0:Lwh/a$f;

    return-void

    :cond_0
    const-string p1, "AppShellFragment"

    const-string v0, "Error: AppShellFragment cannot find the listener!"

    invoke-static {p1, v0}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public C0(Landroid/content/Context;)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-super {p0, p1}, Le4/k;->C0(Landroid/content/Context;)V

    instance-of v0, p1, Lwh/a$g;

    if-eqz v0, :cond_0

    check-cast p1, Lwh/a$g;

    iput-object p1, p0, Lwh/a;->I0:Lwh/a$g;

    return-void

    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " must implement OnFragmentInteractionListener"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public F0(Landroid/os/Bundle;)V
    .locals 2

    invoke-static {}, Lak/k0;->B()Z

    move-result v0

    const-string v1, "AppShellFragment"

    if-eqz v0, :cond_0

    const-string v0, "onCreate: App was previously destroyed due to process death"

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-super {p0, p1}, Lsg/x0;->F0(Landroid/os/Bundle;)V

    return-void

    :cond_0
    invoke-super {p0, p1}, Lsg/x0;->F0(Landroid/os/Bundle;)V

    const-string p1, "onCreate:"

    invoke-static {v1, p1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lwh/f;->j()Lwh/f;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/fragment/app/c;->x()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1, v0}, Lwh/f;->F(Landroid/content/Context;)V

    invoke-static {}, Lsg/a1;->D0()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Landroidx/fragment/app/c;->x()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object v0

    invoke-static {p1, v0}, Lwh/p;->b(Landroid/content/Context;Landroid/app/Activity;)Lwh/f$d;

    move-result-object p1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Landroidx/fragment/app/c;->x()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lwh/p;->a(Landroid/content/Context;)Lwh/f$d;

    move-result-object p1

    :goto_0
    invoke-static {}, Lwh/f;->j()Lwh/f;

    move-result-object v0

    invoke-virtual {v0, p1}, Lwh/f;->k(Lwh/f$d;)V

    return-void
.end method

.method public final H2()Lnk/a$a;
    .locals 5

    new-instance v0, Lnk/a$a;

    invoke-direct {v0}, Lnk/a$a;-><init>()V

    new-instance v1, Landroid/util/TypedValue;

    invoke-direct {v1}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {p0}, Landroidx/fragment/app/c;->T()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lsg/k0;->c:I

    const/4 v4, 0x1

    invoke-virtual {v2, v3, v1, v4}, Landroid/content/res/Resources;->getValue(ILandroid/util/TypedValue;Z)V

    iget v1, v1, Landroid/util/TypedValue;->data:I

    invoke-static {v1}, Landroid/util/TypedValue;->complexToFloat(I)F

    move-result v1

    float-to-int v1, v1

    iput v1, v0, Lnk/a$a;->a:I

    return-object v0
.end method

.method public I2()Landroid/view/Surface;
    .locals 1

    iget-boolean v0, p0, Lwh/a;->Q0:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lwh/a;->J0:Landroid/view/SurfaceView;

    invoke-virtual {v0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public J0(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1
    .param p1    # Landroid/view/LayoutInflater;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const-string p1, "AppShellFragment"

    const-string p2, "onCreateView:"

    invoke-static {p1, p2}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lwh/a;->M2(Landroid/view/View;)V

    invoke-virtual {p0, p1}, Lwh/a;->K2(Landroid/view/View;)V

    invoke-virtual {p0}, Lwh/a;->L2()V

    iget-object p2, p0, Lwh/a;->S0:Lwh/a$f;

    invoke-interface {p2}, Lsg/f0;->b()Z

    move-result p2

    iput-boolean p2, p0, Lwh/a;->Q0:Z

    if-eqz p2, :cond_0

    invoke-virtual {p0}, Lwh/a;->P2()V

    :cond_0
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p2

    invoke-interface {p2}, Lth/i;->J0()Z

    move-result p2

    const/4 p3, 0x0

    if-nez p2, :cond_3

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p2

    invoke-interface {p2}, Lth/i;->B4()Z

    move-result p2

    if-eqz p2, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object p2

    sget v0, Lsg/m0;->e0:I

    invoke-virtual {p2, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p2

    iput-object p2, p0, Lwh/a;->L0:Landroid/view/View;

    sget v0, Lsg/m0;->d0:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-static {}, Lwh/f;->j()Lwh/f;

    move-result-object p2

    invoke-virtual {p2}, Lwh/f;->m()Z

    move-result p2

    if-nez p2, :cond_2

    iget-object p2, p0, Lwh/a;->L0:Landroid/view/View;

    invoke-virtual {p2, p3}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    :cond_2
    iget-object p2, p0, Lwh/a;->J0:Landroid/view/SurfaceView;

    invoke-virtual {p2, p3}, Landroid/view/SurfaceView;->setVisibility(I)V

    goto :goto_1

    :cond_3
    :goto_0
    invoke-static {}, Lwh/f;->j()Lwh/f;

    move-result-object p2

    invoke-virtual {p2}, Lwh/f;->m()Z

    move-result p2

    if-nez p2, :cond_4

    invoke-virtual {p0}, Lwh/a;->J2()V

    iget-object p2, p0, Lwh/a;->L0:Landroid/view/View;

    invoke-virtual {p2, p3}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    :cond_4
    iget-object p2, p0, Lwh/a;->J0:Landroid/view/SurfaceView;

    invoke-virtual {p2, p3}, Landroid/view/SurfaceView;->setVisibility(I)V

    :goto_1
    return-object p1
.end method

.method public final J2()V
    .locals 2

    iget-object v0, p0, Lwh/a;->L0:Landroid/view/View;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object v0

    sget v1, Lsg/m0;->f0:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewStub;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/ViewStub;->inflate()Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lwh/a;->L0:Landroid/view/View;

    sget v1, Lsg/m0;->d0:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    return-void
.end method

.method public K0()V
    .locals 2

    invoke-static {}, Lak/k0;->B()Z

    move-result v0

    const-string v1, "AppShellFragment"

    if-eqz v0, :cond_0

    const-string v0, "onDestroy: App was previously destroyed due to process death"

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-super {p0}, Landroidx/fragment/app/c;->K0()V

    return-void

    :cond_0
    invoke-super {p0}, Landroidx/fragment/app/c;->K0()V

    const-string v0, "onDestroy()"

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lwh/a;->J0:Landroid/view/SurfaceView;

    invoke-virtual {v0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    invoke-interface {v0, p0}, Landroid/view/SurfaceHolder;->removeCallback(Landroid/view/SurfaceHolder$Callback;)V

    return-void
.end method

.method public final K2(Landroid/view/View;)V
    .locals 2

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->J0()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object p1

    sget v0, Lsg/m0;->R:I

    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/view/ViewStub;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/view/ViewStub;->inflate()Landroid/view/View;

    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object p1

    sget v0, Lsg/m0;->G:I

    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/roblox/client/RbxKeyboard;

    if-nez p1, :cond_1

    return-void

    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundColor(I)V

    invoke-virtual {p0}, Landroidx/fragment/app/c;->x()Landroid/content/Context;

    move-result-object v0

    const-string v1, "SourceSansPro-Regular.ttf"

    invoke-static {p1, v0, v1}, Leh/e;->d(Landroid/widget/TextView;Landroid/content/Context;Ljava/lang/String;)V

    new-instance v0, Lwh/q0;

    invoke-direct {v0, p1}, Lwh/q0;-><init>(Lcom/roblox/client/RbxKeyboard;)V

    iput-object v0, p0, Lwh/a;->P0:Lwh/w0;

    return-void
.end method

.method public final L2()V
    .locals 3

    invoke-virtual {p0}, Lwh/a;->H2()Lnk/a$a;

    move-result-object v0

    new-instance v1, Lwh/a$a;

    invoke-virtual {p0}, Landroidx/fragment/app/c;->x()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, p0, v2, v0}, Lwh/a$a;-><init>(Lwh/a;Landroid/content/Context;Lnk/a$a;)V

    iput-object v1, p0, Lwh/a;->M0:Lnk/a;

    new-instance v0, Lwh/a$b;

    invoke-direct {v0, p0}, Lwh/a$b;-><init>(Lwh/a;)V

    iput-object v0, p0, Lwh/a;->N0:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    iget-object v0, p0, Lwh/a;->J0:Landroid/view/SurfaceView;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Lwh/a;->N0:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    return-void
.end method

.method public M0()V
    .locals 2

    invoke-super {p0}, Le4/k;->M0()V

    const-string v0, "AppShellFragment"

    const-string v1, "onDestroyView()"

    invoke-static {v0, v1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lwh/a;->J0:Landroid/view/SurfaceView;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Lwh/a;->N0:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    return-void
.end method

.method public final M2(Landroid/view/View;)V
    .locals 1

    const-string p1, "AppShellFragment"

    const-string v0, "initSurfaceView()"

    invoke-static {p1, v0}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object p1

    sget v0, Lsg/m0;->h0:I

    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/view/SurfaceView;

    iput-object p1, p0, Lwh/a;->J0:Landroid/view/SurfaceView;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/view/View;->setFocusable(Z)V

    iget-object p1, p0, Lwh/a;->J0:Landroid/view/SurfaceView;

    invoke-virtual {p1, v0}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    iget-object p1, p0, Lwh/a;->J0:Landroid/view/SurfaceView;

    invoke-virtual {p1}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object p1

    invoke-interface {p1, p0}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    return-void
.end method

.method public N0()V
    .locals 1

    invoke-super {p0}, Le4/k;->N0()V

    const/4 v0, 0x0

    iput-object v0, p0, Lwh/a;->S0:Lwh/a$f;

    return-void
.end method

.method public final N2()V
    .locals 2

    const-string v0, "AppShellFragment"

    const-string v1, "loadSettings()"

    invoke-static {v0, v1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lwh/a;->L0:Landroid/view/View;

    if-eqz v0, :cond_0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    invoke-static {}, Lsg/a1;->D0()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroidx/fragment/app/c;->x()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object v1

    invoke-static {v0, v1}, Lwh/p;->b(Landroid/content/Context;Landroid/app/Activity;)Lwh/f$d;

    move-result-object v0

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Landroidx/fragment/app/c;->x()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lwh/p;->a(Landroid/content/Context;)Lwh/f$d;

    move-result-object v0

    :goto_0
    invoke-static {}, Lwh/f;->j()Lwh/f;

    move-result-object v1

    invoke-virtual {v1, v0}, Lwh/f;->k(Lwh/f$d;)V

    iget-object v0, p0, Lwh/a;->J0:Landroid/view/SurfaceView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/SurfaceView;->setVisibility(I)V

    return-void
.end method

.method public final O2()V
    .locals 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_3

    invoke-virtual {p0}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v2

    const/4 v3, 0x1

    invoke-static {v2, v3}, Le/z;->a(Landroid/view/WindowManager$LayoutParams;I)V

    move-object v2, v0

    check-cast v2, Lcom/roblox/client/a;

    invoke-virtual {v2}, Lcom/roblox/client/b;->G1()Lmi/a;

    move-result-object v3

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v3, v1}, Lmi/a;->e(Landroid/view/View;)V

    iget-object v1, p0, Lwh/a;->U0:Lwh/x0;

    if-nez v1, :cond_2

    new-instance v1, Lwh/x0;

    invoke-direct {v1, v0}, Lwh/x0;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lwh/a;->U0:Lwh/x0;

    :cond_2
    iget-object v0, p0, Lwh/a;->U0:Lwh/x0;

    invoke-virtual {v2}, Lcom/roblox/client/b;->G1()Lmi/a;

    move-result-object v1

    invoke-virtual {v1}, Lmi/a;->a()Landroidx/lifecycle/a0;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Lwh/x0;->i(Landroidx/lifecycle/s;Landroidx/lifecycle/a0;)V

    :cond_3
    :goto_0
    return-void
.end method

.method public P0(Z)V
    .locals 2

    invoke-super {p0, p1}, Landroidx/fragment/app/c;->P0(Z)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onHiddenChanged() hidden:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "AppShellFragment"

    invoke-static {v1, v0}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz p1, :cond_0

    invoke-static {}, Lwh/f;->j()Lwh/f;

    move-result-object p1

    invoke-virtual {p1}, Lwh/f;->t()V

    return-void

    :cond_0
    iget-boolean p1, p0, Lwh/a;->Q0:Z

    if-nez p1, :cond_2

    const-string p1, "onHiddenChanged() surface not yet created - show surface"

    invoke-static {v1, p1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lwh/a;->J0:Landroid/view/SurfaceView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/SurfaceView;->setVisibility(I)V

    iget-object p1, p0, Lwh/a;->L0:Landroid/view/View;

    if-eqz p1, :cond_1

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_1
    return-void

    :cond_2
    invoke-static {}, Lwh/f;->j()Lwh/f;

    move-result-object p1

    iget-object v0, p0, Lwh/a;->J0:Landroid/view/SurfaceView;

    invoke-virtual {v0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    move-result-object v0

    invoke-virtual {p1, v0}, Lwh/f;->G(Landroid/view/Surface;)V

    return-void
.end method

.method public final P2()V
    .locals 2

    invoke-static {}, Lsg/a1;->D0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lwh/f;->j()Lwh/f;

    move-result-object v0

    invoke-virtual {v0}, Lwh/f;->i()Lwh/f$d;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object v1

    iput-object v1, v0, Lwh/f$d;->a:Landroid/app/Activity;

    :cond_0
    invoke-static {}, Lwh/f;->j()Lwh/f;

    move-result-object v0

    iget-object v1, p0, Lwh/a;->J0:Landroid/view/SurfaceView;

    invoke-virtual {v1}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v1

    invoke-interface {v1}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    move-result-object v1

    invoke-virtual {v0, v1}, Lwh/f;->G(Landroid/view/Surface;)V

    iget-object v0, p0, Lwh/a;->I0:Lwh/a$g;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lwh/a$g;->a0()V

    :cond_1
    return-void
.end method

.method public U(I)V
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object v0

    check-cast v0, Lcom/roblox/client/b;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/roblox/client/b;->U(I)V

    :cond_0
    return-void
.end method

.method public V0()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/c;->V0()V

    iget-object v0, p0, Lwh/a;->S0:Lwh/a$f;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lsg/f0;->l()V

    :cond_0
    return-void
.end method

.method public W(Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object v0

    check-cast v0, Lcom/roblox/client/b;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/roblox/client/b;->W(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public a1()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/c;->a1()V

    iget-object v0, p0, Lwh/a;->L0:Landroid/view/View;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lwh/a;->N2()V

    :cond_0
    return-void
.end method

.method public b()Z
    .locals 1

    iget-boolean v0, p0, Lwh/a;->Q0:Z

    return v0
.end method

.method public c1()V
    .locals 2

    invoke-super {p0}, Lsg/x0;->c1()V

    invoke-static {}, Lvi/h;->e()Lvi/h;

    move-result-object v0

    invoke-virtual {v0}, Lvi/h;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lwh/a;->T0:Lwh/a$d;

    invoke-virtual {v0}, Lwh/a$d;->v()V

    :cond_0
    iget-object v0, p0, Lwh/a;->S0:Lwh/a$f;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lsg/f0;->I()V

    :cond_1
    invoke-static {}, Lkm/f;->D()Lkm/f;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/fragment/app/c;->x()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkm/f;->E(Landroid/content/Context;)V

    invoke-static {}, Lgl/a;->b()Lgl/a;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/fragment/app/c;->H1()Le4/q;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgl/a;->d(Landroid/app/Activity;)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->S4()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lwh/a;->O2()V

    :cond_2
    return-void
.end method

.method public d1()V
    .locals 2

    invoke-super {p0}, Lsg/x0;->d1()V

    const-string v0, "AppShellFragment"

    const-string v1, "onStop()"

    invoke-static {v0, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lcm/a;->a()Lcm/a;

    move-result-object v0

    invoke-virtual {v0}, Lcm/a;->c()V

    invoke-static {}, Lkm/f;->D()Lkm/f;

    move-result-object v0

    invoke-virtual {v0}, Lkm/f;->F()V

    invoke-static {}, Lgl/a;->b()Lgl/a;

    move-result-object v0

    invoke-virtual {v0}, Lgl/a;->e()V

    return-void
.end method

.method public f0()Landroid/app/Activity;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object v0

    return-object v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    sget v0, Lsg/m0;->d0:I

    if-ne p1, v0, :cond_0

    invoke-virtual {p0}, Lsg/x0;->u2()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lwh/a;->N2()V

    :cond_0
    return-void
.end method

.method public q0()Lcom/roblox/client/b;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object v0

    check-cast v0, Lcom/roblox/client/b;

    return-object v0
.end method

.method public surfaceChanged(Landroid/view/SurfaceHolder;III)V
    .locals 1

    const-string p2, "AppShellFragment"

    const-string p3, "surfaceChanged()"

    invoke-static {p2, p3}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Landroidx/fragment/app/c;->r0()Z

    move-result p2

    if-nez p2, :cond_0

    invoke-virtual {p0}, Landroidx/fragment/app/c;->x()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Lel/a;->e(Landroid/content/Context;)F

    move-result p2

    invoke-virtual {p0}, Landroidx/fragment/app/c;->x()Landroid/content/Context;

    move-result-object p3

    invoke-static {p3}, Lel/a;->i(Landroid/content/Context;)Landroid/graphics/Point;

    move-result-object p3

    invoke-static {}, Lwh/f;->j()Lwh/f;

    move-result-object p4

    invoke-interface {p1}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    move-result-object p1

    iget v0, p3, Landroid/graphics/Point;->x:I

    iget p3, p3, Landroid/graphics/Point;->y:I

    invoke-virtual {p4, p1, p2, v0, p3}, Lwh/f;->I(Landroid/view/Surface;FII)V

    :cond_0
    return-void
.end method

.method public surfaceCreated(Landroid/view/SurfaceHolder;)V
    .locals 1

    const-string p1, "surfaceCreated()"

    const-string v0, "AppShellFragment"

    invoke-static {v0, p1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x1

    iput-boolean p1, p0, Lwh/a;->Q0:Z

    invoke-virtual {p0}, Landroidx/fragment/app/c;->r0()Z

    move-result p1

    if-nez p1, :cond_0

    const-string p1, "Start the lua app"

    invoke-static {v0, p1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lwh/a;->P2()V

    :cond_0
    return-void
.end method

.method public surfaceDestroyed(Landroid/view/SurfaceHolder;)V
    .locals 1

    const-string p1, "AppShellFragment"

    const-string v0, "surfaceDestroyed()"

    invoke-static {p1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x0

    iput-boolean p1, p0, Lwh/a;->Q0:Z

    invoke-static {}, Lwh/f;->j()Lwh/f;

    move-result-object p1

    invoke-virtual {p1}, Lwh/f;->H()V

    return-void
.end method

.method public z0(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, Lsg/x0;->z0(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object p1

    sget v0, Lsg/m0;->i:I

    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lwh/a;->K0:Landroid/view/View;

    return-void
.end method
