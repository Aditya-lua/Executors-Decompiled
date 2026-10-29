.class public abstract Lcom/roblox/client/a;
.super Lcom/roblox/client/b;
.source "SourceFile"

# interfaces
.implements Ldk/e$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/client/a$g;
    }
.end annotation


# static fields
.field public static R:I


# instance fields
.field public I:Landroidx/appcompat/app/a;

.field public J:Landroidx/appcompat/app/a;

.field public K:Landroidx/appcompat/app/a;

.field public L:Landroid/app/ProgressDialog;

.field public M:Z

.field public N:Lmi/c;

.field public O:Lbh/a;

.field public P:Landroidx/appcompat/widget/Toolbar;

.field public Q:Ldk/e;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/roblox/client/b;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roblox/client/a;->M:Z

    invoke-virtual {p0}, Lcom/roblox/client/a;->Q1()Lmi/c;

    move-result-object v0

    iput-object v0, p0, Lcom/roblox/client/a;->N:Lmi/c;

    new-instance v0, Lbh/a;

    invoke-direct {v0}, Lbh/a;-><init>()V

    iput-object v0, p0, Lcom/roblox/client/a;->O:Lbh/a;

    return-void
.end method

.method public static bridge synthetic M1(Lcom/roblox/client/a;Landroidx/appcompat/app/a;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/a;->I:Landroidx/appcompat/app/a;

    return-void
.end method


# virtual methods
.method public N1()Z
    .locals 2

    invoke-static {p0}, Lsg/e2;->j(Landroid/content/Context;)Z

    move-result v0

    xor-int/lit8 v1, v0, 0x1

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/roblox/client/a;->e2()V

    :cond_0
    return v1
.end method

.method public O1()V
    .locals 2

    invoke-virtual {p0}, Lcom/roblox/client/a;->U1()V

    iget-object v0, p0, Lcom/roblox/client/a;->J:Landroidx/appcompat/app/a;

    if-nez v0, :cond_0

    new-instance v0, Landroidx/appcompat/app/a$a;

    invoke-direct {v0, p0}, Landroidx/appcompat/app/a$a;-><init>(Landroid/content/Context;)V

    sget v1, Lsg/q0;->V:I

    invoke-virtual {v0, v1}, Landroidx/appcompat/app/a$a;->p(I)Landroidx/appcompat/app/a$a;

    move-result-object v0

    sget v1, Lsg/q0;->R:I

    invoke-virtual {v0, v1}, Landroidx/appcompat/app/a$a;->g(I)Landroidx/appcompat/app/a$a;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/appcompat/app/a$a;->d(Z)Landroidx/appcompat/app/a$a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/appcompat/app/a$a;->a()Landroidx/appcompat/app/a;

    move-result-object v0

    iput-object v0, p0, Lcom/roblox/client/a;->J:Landroidx/appcompat/app/a;

    :cond_0
    iget-object v0, p0, Lcom/roblox/client/a;->J:Landroidx/appcompat/app/a;

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/roblox/client/a;->J:Landroidx/appcompat/app/a;

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    :cond_1
    return-void
.end method

.method public P1()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public Q1()Lmi/c;
    .locals 1

    new-instance v0, Lmi/c;

    invoke-direct {v0}, Lmi/c;-><init>()V

    return-object v0
.end method

.method public R1()Z
    .locals 3

    invoke-static {p0}, Lsg/a1;->U(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "ROBLOXCrash"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public final S1(Landroidx/appcompat/app/a;)V
    .locals 1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lj/l;->dismiss()V

    :cond_0
    return-void
.end method

.method public T1()V
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/a;->L:Landroid/app/ProgressDialog;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roblox/client/a;->L:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roblox/client/a;->L:Landroid/app/ProgressDialog;

    :cond_0
    return-void
.end method

.method public final U1()V
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/a;->I:Landroidx/appcompat/app/a;

    invoke-virtual {p0, v0}, Lcom/roblox/client/a;->S1(Landroidx/appcompat/app/a;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roblox/client/a;->I:Landroidx/appcompat/app/a;

    return-void
.end method

.method public final V1()Ljava/lang/String;
    .locals 1

    sget v0, Lsg/q0;->E:I

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public W1()Lmi/c;
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/a;->N:Lmi/c;

    return-object v0
.end method

.method public X1(Lvi/b$d;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "navigateToPostLogoutUI: logoutType = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", foreground = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/roblox/client/b;->J1()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "RobloxActivity"

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "navigateToPostLogoutUI: [New Startup] Launch Main activity..."

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lsg/y;->h()Lsg/y;

    move-result-object v0

    invoke-virtual {v0, p0}, Lsg/y;->i(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    sget-object v0, Lvi/b$d;->b:Lvi/b$d;

    if-eq p1, v0, :cond_0

    const-string p1, "navigateToPostLogoutUI: notify Lua about this 401 logout condition"

    invoke-static {v1, p1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    const-string p1, "NativeShellEvent"

    const-string v0, "NETWORK_ERROR_401"

    invoke-static {p1, v0}, Lcom/roblox/engine/jni/memstorage/MemStorage;->fire(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final Y1()V
    .locals 2

    iget-object v0, p0, Lcom/roblox/client/a;->N:Lmi/c;

    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    invoke-virtual {v0, v1, p0}, Lmi/c;->j(Landroid/view/LayoutInflater;Lcom/roblox/client/b;)Landroid/view/View;

    move-result-object v0

    invoke-super {p0, v0}, Lj/b;->setContentView(Landroid/view/View;)V

    return-void
.end method

.method public final Z1(I)V
    .locals 2

    invoke-virtual {p0}, Lcom/roblox/client/a;->Y1()V

    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iget-object v1, p0, Lcom/roblox/client/a;->N:Lmi/c;

    invoke-virtual {v1}, Lmi/c;->g()Landroid/view/ViewGroup;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    return-void
.end method

.method public final a2(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    invoke-virtual {p0}, Lcom/roblox/client/a;->Y1()V

    iget-object v0, p0, Lcom/roblox/client/a;->N:Lmi/c;

    invoke-virtual {v0}, Lmi/c;->g()Landroid/view/ViewGroup;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final b2(Lol/a;)V
    .locals 4

    sget-object v0, Lol/a;->c:Lol/a;

    const/4 v1, 0x1

    if-eq p1, v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getSystemUiVisibility()I

    move-result v2

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v3

    if-eqz v0, :cond_1

    and-int/lit16 v0, v2, -0x2001

    goto :goto_1

    :cond_1
    or-int/lit16 v0, v2, 0x2000

    :goto_1
    invoke-virtual {v3, v0}, Landroid/view/View;->setSystemUiVisibility(I)V

    invoke-static {}, Lsg/a1;->k0()Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object v0, Lcom/roblox/client/a$f;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    if-eq p1, v1, :cond_2

    invoke-virtual {p0}, Lj/b;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget v0, Lsg/j0;->h:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    goto :goto_2

    :cond_2
    invoke-virtual {p0}, Lj/b;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget v0, Lsg/j0;->o:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    :goto_2
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/Window;->setStatusBarColor(I)V

    :cond_3
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p0}, Lj/b;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lsg/j0;->e:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/Window;->setNavigationBarColor(I)V

    return-void
.end method

.method public c2()V
    .locals 2

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v1

    invoke-interface {v1}, Lth/i;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p0}, Le/x;->a(Le/p;)V

    goto :goto_0

    :cond_0
    const/16 v1, 0x500

    invoke-virtual {v0, v1}, Landroid/view/View;->setSystemUiVisibility(I)V

    :goto_0
    iget-object v1, p0, Lcom/roblox/client/b;->E:Lmi/a;

    invoke-virtual {v1, v0}, Lmi/a;->e(Landroid/view/View;)V

    return-void
.end method

.method public d2(Landroid/content/Context;)V
    .locals 3

    sget v0, Lsg/q0;->p:I

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    sget v1, Lsg/q0;->q:I

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Landroid/app/ProgressDialog;

    invoke-direct {v2, p1}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V

    invoke-virtual {v2, v0}, Landroid/app/Dialog;->setTitle(Ljava/lang/CharSequence;)V

    invoke-virtual {v2, v1}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    const/4 p1, 0x1

    invoke-virtual {v2, p1}, Landroid/app/ProgressDialog;->setIndeterminate(Z)V

    const/4 p1, 0x0

    invoke-virtual {v2, p1}, Landroid/app/Dialog;->setCancelable(Z)V

    invoke-virtual {v2, p1}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    const/4 p1, 0x0

    invoke-virtual {v2, p1}, Landroid/app/Dialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    iput-object v2, p0, Lcom/roblox/client/a;->L:Landroid/app/ProgressDialog;

    invoke-virtual {v2}, Landroid/app/Dialog;->show()V

    return-void
.end method

.method public final e2()V
    .locals 2

    iget-object v0, p0, Lcom/roblox/client/a;->I:Landroidx/appcompat/app/a;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lj/b;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lsg/q0;->S:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lsg/e2;->d(Landroid/content/Context;Ljava/lang/String;)Landroidx/appcompat/app/a;

    move-result-object v0

    iput-object v0, p0, Lcom/roblox/client/a;->I:Landroidx/appcompat/app/a;

    new-instance v1, Lcom/roblox/client/a$b;

    invoke-direct {v1, p0}, Lcom/roblox/client/a$b;-><init>(Lcom/roblox/client/a;)V

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    return-void

    :cond_0
    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/roblox/client/a;->I:Landroidx/appcompat/app/a;

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    return-void

    :cond_1
    const-string v0, "RobloxActivity"

    const-string v1, "A network-disconnected alert already exists. Do nothing."

    invoke-static {v0, v1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public f2(Z)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/roblox/client/a;->g2(ZLcom/roblox/client/a$g;)V

    return-void
.end method

.method public g2(ZLcom/roblox/client/a$g;)V
    .locals 3

    invoke-static {}, Lsg/a1;->q0()Z

    move-result v0

    if-eqz v0, :cond_1

    sget p2, Lsg/q0;->X:I

    invoke-static {p0, p2}, Lgk/x;->a(Landroid/app/Activity;I)V

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    :cond_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/roblox/client/a;->I:Landroidx/appcompat/app/a;

    invoke-virtual {p0, v0}, Lcom/roblox/client/a;->S1(Landroidx/appcompat/app/a;)V

    iget-object v0, p0, Lcom/roblox/client/a;->K:Landroidx/appcompat/app/a;

    invoke-virtual {p0, v0}, Lcom/roblox/client/a;->S1(Landroidx/appcompat/app/a;)V

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    invoke-static {}, Lcom/roblox/client/d;->e()Lcom/roblox/client/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roblox/client/d;->d()Lcom/roblox/client/d$e;

    move-result-object v0

    invoke-virtual {p0}, Lcom/roblox/client/a;->V1()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lgk/t;->j()Z

    move-result v2

    if-eqz v2, :cond_2

    sget v1, Lsg/q0;->l:I

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_2
    sget v2, Lsg/q0;->n:I

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, v2, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    :goto_0
    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/roblox/client/a;->J:Landroidx/appcompat/app/a;

    invoke-virtual {p0, p1}, Lcom/roblox/client/a;->S1(Landroidx/appcompat/app/a;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    invoke-static {p1}, Lbh/a;->a(Landroid/content/Intent;)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/roblox/client/a;->O:Lbh/a;

    const/4 p2, 0x1

    invoke-virtual {p1, p0, p2, v0}, Lbh/a;->b(Landroid/app/Activity;ZLcom/roblox/client/d$e;)V

    return-void

    :cond_3
    new-instance p1, Landroidx/appcompat/app/a$a;

    invoke-direct {p1, p0}, Landroidx/appcompat/app/a$a;-><init>(Landroid/content/Context;)V

    sget v2, Lsg/q0;->m:I

    invoke-virtual {p1, v2}, Landroidx/appcompat/app/a$a;->p(I)Landroidx/appcompat/app/a$a;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroidx/appcompat/app/a$a;->h(Ljava/lang/CharSequence;)Landroidx/appcompat/app/a$a;

    move-result-object p1

    sget v1, Lsg/q0;->j:I

    new-instance v2, Lcom/roblox/client/a$c;

    invoke-direct {v2, p0, v0, p0, p2}, Lcom/roblox/client/a$c;-><init>(Lcom/roblox/client/a;Lcom/roblox/client/d$e;Landroid/app/Activity;Lcom/roblox/client/a$g;)V

    invoke-virtual {p1, v1, v2}, Landroidx/appcompat/app/a$a;->m(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/a$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/appcompat/app/a$a;->a()Landroidx/appcompat/app/a;

    move-result-object p1

    iput-object p1, p0, Lcom/roblox/client/a;->K:Landroidx/appcompat/app/a;

    goto :goto_1

    :cond_4
    new-instance p1, Landroidx/appcompat/app/a$a;

    invoke-direct {p1, p0}, Landroidx/appcompat/app/a$a;-><init>(Landroid/content/Context;)V

    sget v2, Lsg/q0;->m:I

    invoke-virtual {p1, v2}, Landroidx/appcompat/app/a$a;->p(I)Landroidx/appcompat/app/a$a;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroidx/appcompat/app/a$a;->h(Ljava/lang/CharSequence;)Landroidx/appcompat/app/a$a;

    move-result-object p1

    sget v1, Lsg/q0;->j:I

    new-instance v2, Lcom/roblox/client/a$e;

    invoke-direct {v2, p0, v0, p0, p2}, Lcom/roblox/client/a$e;-><init>(Lcom/roblox/client/a;Lcom/roblox/client/d$e;Landroid/app/Activity;Lcom/roblox/client/a$g;)V

    invoke-virtual {p1, v1, v2}, Landroidx/appcompat/app/a$a;->m(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/a$a;

    move-result-object p1

    sget v0, Lsg/q0;->i:I

    new-instance v1, Lcom/roblox/client/a$d;

    invoke-direct {v1, p0, p2}, Lcom/roblox/client/a$d;-><init>(Lcom/roblox/client/a;Lcom/roblox/client/a$g;)V

    invoke-virtual {p1, v0, v1}, Landroidx/appcompat/app/a$a;->i(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/a$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/appcompat/app/a$a;->a()Landroidx/appcompat/app/a;

    move-result-object p1

    iput-object p1, p0, Lcom/roblox/client/a;->K:Landroidx/appcompat/app/a;

    :goto_1
    iget-object p1, p0, Lcom/roblox/client/a;->K:Landroidx/appcompat/app/a;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/app/Dialog;->setCancelable(Z)V

    iget-object p1, p0, Lcom/roblox/client/a;->K:Landroidx/appcompat/app/a;

    return-void
.end method

.method public final h2()V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "using new api on app resume. mIsAppResumedFromColdStart: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/roblox/client/a;->M:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.locale"

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Lqi/h;

    invoke-direct {v0}, Lqi/h;-><init>()V

    new-instance v1, Lcom/roblox/client/a$a;

    invoke-direct {v1, p0}, Lcom/roblox/client/a$a;-><init>(Lcom/roblox/client/a;)V

    invoke-virtual {v0, p0, v1}, Lqi/h;->c(Landroid/content/Context;Lqi/h$d;)V

    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onActivityResult: requestCode = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "RobloxActivity"

    invoke-static {v1, v0}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    const/16 v0, 0x4e87

    if-ne p1, v0, :cond_1

    const/4 p1, -0x1

    if-ne p2, p1, :cond_0

    invoke-virtual {p3}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Sharing with="

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "."

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v1, p2}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0, p3}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    invoke-static {p1}, Lsg/t0;->y(Ljava/lang/String;)V

    invoke-static {}, Lvi/g;->b()Lvi/g;

    move-result-object p1

    const-string p2, "Android-AppMain-GameShare-AppSelected"

    invoke-virtual {p1, p2}, Lvi/g;->q(Ljava/lang/String;)V

    return-void

    :cond_0
    const-string p1, "Sharing dialog dismissed."

    invoke-static {v1, p1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lvi/g;->b()Lvi/g;

    move-result-object p1

    const-string p2, "Android-AppMain-GameShare-ChooserDismissed"

    invoke-virtual {p1, p2}, Lvi/g;->q(Ljava/lang/String;)V

    return-void

    :cond_1
    invoke-super {p0, p1, p2, p3}, Le4/q;->onActivityResult(IILandroid/content/Intent;)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    invoke-static {}, Lak/k0;->B()Z

    move-result v0

    const-string v1, "RobloxActivity"

    if-eqz v0, :cond_0

    const-string v0, "onCreate: App was previously destroyed due to process death"

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-super {p0, p1}, Lcom/roblox/client/b;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    :cond_0
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->M1()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "GameActivity = ON. Return!"

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-super {p0, p1}, Lcom/roblox/client/b;->onCreate(Landroid/os/Bundle;)V

    return-void

    :cond_1
    invoke-static {}, Lvi/b;->f()Lvi/b;

    move-result-object v0

    invoke-virtual {v0, p0}, Lvi/b;->l(Landroid/content/Context;)V

    instance-of v0, p0, Lcom/roblox/client/startup/ActivitySplash;

    invoke-static {}, Lcom/roblox/client/startup/a;->m()Z

    move-result v2

    if-nez v2, :cond_2

    if-nez v0, :cond_2

    const-string v0, "onCreate ... settingsLoaded = false. Load from preferences!!!"

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {p0}, Lcom/roblox/client/startup/a;->s(Landroid/content/Context;)V

    :cond_2
    invoke-static {}, Lqi/b;->f()Lqi/b;

    move-result-object v0

    invoke-virtual {v0, p0}, Lqi/b;->u(Landroid/content/Context;)V

    invoke-static {}, Lvi/e;->c()Lvi/e;

    move-result-object v0

    invoke-virtual {v0, p0}, Lvi/e;->d(Landroid/content/Context;)V

    invoke-super {p0, p1}, Lcom/roblox/client/b;->onCreate(Landroid/os/Bundle;)V

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "activity onCreate, name = "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lcom/roblox/client/b;->E1()V

    invoke-virtual {p0}, Lcom/roblox/client/a;->c2()V

    if-nez v2, :cond_3

    invoke-virtual {p0}, Lcom/roblox/client/a;->P1()Z

    move-result p1

    if-nez p1, :cond_3

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "onCreate: no AppSettings in activity:"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ". Finish self!"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    :cond_3
    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/roblox/client/a;->M:Z

    new-instance p1, Ldk/e;

    invoke-direct {p1, p0}, Ldk/e;-><init>(Ldk/e$b;)V

    iput-object p1, p0, Lcom/roblox/client/a;->Q:Ldk/e;

    invoke-virtual {p1, p0}, Ldk/e;->b(Landroidx/lifecycle/s;)V

    return-void
.end method

.method public onDestroy()V
    .locals 2

    invoke-static {}, Lak/k0;->B()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "RobloxActivity"

    const-string v1, "onCreate: App was previously destroyed due to process death"

    invoke-static {v0, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-super {p0}, Lcom/roblox/client/b;->onDestroy()V

    return-void

    :cond_0
    invoke-super {p0}, Lcom/roblox/client/b;->onDestroy()V

    invoke-virtual {p0}, Lcom/roblox/client/a;->U1()V

    iget-object v0, p0, Lcom/roblox/client/a;->J:Landroidx/appcompat/app/a;

    invoke-virtual {p0, v0}, Lcom/roblox/client/a;->S1(Landroidx/appcompat/app/a;)V

    return-void
.end method

.method public onPause()V
    .locals 0

    invoke-super {p0}, Lcom/roblox/client/b;->onPause()V

    return-void
.end method

.method public onResume()V
    .locals 1

    invoke-super {p0}, Lcom/roblox/client/b;->onResume()V

    invoke-static {}, Ljj/r;->k()Ljj/r;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljj/r;->s(Landroid/content/Context;)V

    return-void
.end method

.method public onStart()V
    .locals 3

    invoke-super {p0}, Lcom/roblox/client/b;->onStart()V

    invoke-static {}, Lnh/b;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lsg/a1;->x0()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "RobloxActivity"

    const-string v1, "Alert: needs restart"

    invoke-static {v0, v1}, Lgk/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lcom/roblox/client/a;->O1()V

    :cond_0
    sget v0, Lcom/roblox/client/a;->R:I

    add-int/lit8 v1, v0, 0x1

    sput v1, Lcom/roblox/client/a;->R:I

    if-nez v0, :cond_1

    invoke-static {}, Lvi/b;->f()Lvi/b;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lvi/b;->r(Z)V

    invoke-static {p0}, Lsg/a1;->U(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v2, "ROBLOXCrash"

    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    iget-boolean v0, p0, Lcom/roblox/client/a;->M:Z

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/roblox/client/a;->h2()V

    :cond_1
    invoke-static {}, Lvi/g;->b()Lvi/g;

    move-result-object v0

    invoke-virtual {v0}, Lvi/g;->i0()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roblox/client/a;->M:Z

    return-void
.end method

.method public onStop()V
    .locals 3

    sget v0, Lcom/roblox/client/a;->R:I

    add-int/lit8 v0, v0, -0x1

    sput v0, Lcom/roblox/client/a;->R:I

    if-nez v0, :cond_1

    invoke-static {}, Lvi/b;->f()Lvi/b;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lvi/b;->r(Z)V

    invoke-static {}, Lcom/roblox/engine/jni/NativeReportingInterface;->stopPushNotificationSession()V

    invoke-static {p0}, Lsg/a1;->U(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v2, "ROBLOXCrash"

    invoke-interface {v0, v2}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    const-string v0, "RobloxActivity"

    const-string v2, "The Shell is in background."

    invoke-static {v0, v2}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lvg/j;->q()Lvg/j;

    move-result-object v0

    invoke-virtual {v0}, Lvg/j;->s()V

    invoke-static {}, Lvg/j;->q()Lvg/j;

    move-result-object v0

    invoke-virtual {v0}, Lvg/j;->r()V

    invoke-static {v1}, Lvg/m;->i(Z)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->B1()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->M2()Z

    move-result v0

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v1

    invoke-interface {v1}, Lth/i;->f()Z

    move-result v1

    if-nez v0, :cond_0

    if-eqz v1, :cond_1

    :cond_0
    invoke-static {p0}, Lcom/roblox/client/analytics/TelemetryFlushWorker;->d(Landroid/content/Context;)V

    :cond_1
    invoke-super {p0}, Lcom/roblox/client/b;->onStop()V

    return-void
.end method

.method public setContentView(I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/roblox/client/a;->Z1(I)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, Lcom/roblox/client/a;->a2(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/roblox/client/a;->a2(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public u(Lol/a;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ".onThemeChanged() "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.theme"

    invoke-static {v1, v0}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/roblox/client/a;->P:Landroidx/appcompat/widget/Toolbar;

    instance-of v1, v0, Lcom/roblox/client/components/RobloxToolbar;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/roblox/client/components/RobloxToolbar;

    invoke-virtual {v0, p1}, Lcom/roblox/client/components/RobloxToolbar;->u(Lol/a;)V

    :cond_0
    iget-object v0, p0, Lcom/roblox/client/a;->N:Lmi/c;

    if-eqz v0, :cond_3

    sget-object v0, Lcom/roblox/client/a$f;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    invoke-virtual {p0}, Lj/b;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lsg/j0;->h:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lj/b;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lsg/j0;->a:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lj/b;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lsg/j0;->o:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    :goto_0
    iget-object v1, p0, Lcom/roblox/client/a;->N:Lmi/c;

    invoke-virtual {v1, v0}, Lmi/c;->l(I)V

    :cond_3
    invoke-virtual {p0, p1}, Lcom/roblox/client/a;->b2(Lol/a;)V

    return-void
.end method
