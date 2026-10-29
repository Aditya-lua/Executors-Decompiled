.class public Le4/k;
.super Landroidx/fragment/app/c;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field public f0:Landroid/os/Handler;

.field public g0:Ljava/lang/Runnable;

.field public h0:Landroid/content/DialogInterface$OnCancelListener;

.field public i0:Landroid/content/DialogInterface$OnDismissListener;

.field public j0:I

.field public k0:I

.field public l0:Z

.field public m0:Z

.field public n0:I

.field public o0:Z

.field public p0:Landroidx/lifecycle/e0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/e0<",
            "Landroidx/lifecycle/s;",
            ">;"
        }
    .end annotation
.end field

.field public q0:Landroid/app/Dialog;

.field public r0:Z

.field public s0:Z

.field public t0:Z

.field public u0:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Landroidx/fragment/app/c;-><init>()V

    new-instance v0, Le4/k$a;

    invoke-direct {v0, p0}, Le4/k$a;-><init>(Le4/k;)V

    iput-object v0, p0, Le4/k;->g0:Ljava/lang/Runnable;

    new-instance v0, Le4/k$b;

    invoke-direct {v0, p0}, Le4/k$b;-><init>(Le4/k;)V

    iput-object v0, p0, Le4/k;->h0:Landroid/content/DialogInterface$OnCancelListener;

    new-instance v0, Le4/k$c;

    invoke-direct {v0, p0}, Le4/k$c;-><init>(Le4/k;)V

    iput-object v0, p0, Le4/k;->i0:Landroid/content/DialogInterface$OnDismissListener;

    const/4 v0, 0x0

    iput v0, p0, Le4/k;->j0:I

    iput v0, p0, Le4/k;->k0:I

    const/4 v1, 0x1

    iput-boolean v1, p0, Le4/k;->l0:Z

    iput-boolean v1, p0, Le4/k;->m0:Z

    const/4 v1, -0x1

    iput v1, p0, Le4/k;->n0:I

    new-instance v1, Le4/k$d;

    invoke-direct {v1, p0}, Le4/k$d;-><init>(Le4/k;)V

    iput-object v1, p0, Le4/k;->p0:Landroidx/lifecycle/e0;

    iput-boolean v0, p0, Le4/k;->u0:Z

    return-void
.end method

.method public static synthetic b2(Le4/k;)Landroid/app/Dialog;
    .locals 0

    iget-object p0, p0, Le4/k;->q0:Landroid/app/Dialog;

    return-object p0
.end method

.method public static synthetic c2(Le4/k;)Landroid/content/DialogInterface$OnDismissListener;
    .locals 0

    iget-object p0, p0, Le4/k;->i0:Landroid/content/DialogInterface$OnDismissListener;

    return-object p0
.end method

.method public static synthetic d2(Le4/k;)Z
    .locals 0

    iget-boolean p0, p0, Le4/k;->m0:Z

    return p0
.end method


# virtual methods
.method public C0(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-super {p0, p1}, Landroidx/fragment/app/c;->C0(Landroid/content/Context;)V

    invoke-virtual {p0}, Landroidx/fragment/app/c;->l0()Landroidx/lifecycle/a0;

    move-result-object p1

    iget-object v0, p0, Le4/k;->p0:Landroidx/lifecycle/e0;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/a0;->j(Landroidx/lifecycle/e0;)V

    iget-boolean p1, p0, Le4/k;->t0:Z

    if-nez p1, :cond_0

    const/4 p1, 0x0

    iput-boolean p1, p0, Le4/k;->s0:Z

    :cond_0
    return-void
.end method

.method public F0(Landroid/os/Bundle;)V
    .locals 3

    invoke-super {p0, p1}, Landroidx/fragment/app/c;->F0(Landroid/os/Bundle;)V

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Le4/k;->f0:Landroid/os/Handler;

    iget v0, p0, Landroidx/fragment/app/c;->A:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    iput-boolean v0, p0, Le4/k;->m0:Z

    if-eqz p1, :cond_1

    const-string v0, "android:style"

    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Le4/k;->j0:I

    const-string v0, "android:theme"

    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Le4/k;->k0:I

    const-string v0, "android:cancelable"

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Le4/k;->l0:Z

    const-string v0, "android:showsDialog"

    iget-boolean v1, p0, Le4/k;->m0:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Le4/k;->m0:Z

    const-string v0, "android:backStackId"

    const/4 v1, -0x1

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result p1

    iput p1, p0, Le4/k;->n0:I

    :cond_1
    return-void
.end method

.method public M0()V
    .locals 2

    invoke-super {p0}, Landroidx/fragment/app/c;->M0()V

    iget-object v0, p0, Le4/k;->q0:Landroid/app/Dialog;

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    iput-boolean v1, p0, Le4/k;->r0:Z

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    iget-object v0, p0, Le4/k;->q0:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    iget-boolean v0, p0, Le4/k;->s0:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Le4/k;->q0:Landroid/app/Dialog;

    invoke-virtual {p0, v0}, Le4/k;->onDismiss(Landroid/content/DialogInterface;)V

    :cond_0
    iput-object v1, p0, Le4/k;->q0:Landroid/app/Dialog;

    const/4 v0, 0x0

    iput-boolean v0, p0, Le4/k;->u0:Z

    :cond_1
    return-void
.end method

.method public N0()V
    .locals 2

    invoke-super {p0}, Landroidx/fragment/app/c;->N0()V

    iget-boolean v0, p0, Le4/k;->t0:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Le4/k;->s0:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Le4/k;->s0:Z

    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/c;->l0()Landroidx/lifecycle/a0;

    move-result-object v0

    iget-object v1, p0, Le4/k;->p0:Landroidx/lifecycle/e0;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/a0;->n(Landroidx/lifecycle/e0;)V

    return-void
.end method

.method public O0(Landroid/os/Bundle;)Landroid/view/LayoutInflater;
    .locals 4
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-super {p0, p1}, Landroidx/fragment/app/c;->O0(Landroid/os/Bundle;)Landroid/view/LayoutInflater;

    move-result-object v0

    iget-boolean v1, p0, Le4/k;->m0:Z

    const/4 v2, 0x2

    const-string v3, "FragmentManager"

    if-eqz v1, :cond_2

    iget-boolean v1, p0, Le4/k;->o0:Z

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Le4/k;->n2(Landroid/os/Bundle;)V

    invoke-static {v2}, Landroidx/fragment/app/FragmentManager;->N0(I)Z

    move-result p1

    if-eqz p1, :cond_1

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "get layout inflater for DialogFragment "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " from dialog context"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    iget-object p1, p0, Le4/k;->q0:Landroid/app/Dialog;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/LayoutInflater;->cloneInContext(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    return-object p1

    :cond_2
    :goto_0
    invoke-static {v2}, Landroidx/fragment/app/FragmentManager;->N0(I)Z

    move-result p1

    if-eqz p1, :cond_4

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "getting layout inflater for DialogFragment "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iget-boolean v1, p0, Le4/k;->m0:Z

    if-nez v1, :cond_3

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "mShowsDialog = false: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-object v0

    :cond_3
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "mCreatingDialog = true: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_4
    return-object v0
.end method

.method public b1(Landroid/os/Bundle;)V
    .locals 3
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-super {p0, p1}, Landroidx/fragment/app/c;->b1(Landroid/os/Bundle;)V

    iget-object v0, p0, Le4/k;->q0:Landroid/app/Dialog;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Dialog;->onSaveInstanceState()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "android:dialogShowing"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v1, "android:savedDialogState"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_0
    iget v0, p0, Le4/k;->j0:I

    if-eqz v0, :cond_1

    const-string v1, "android:style"

    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    :cond_1
    iget v0, p0, Le4/k;->k0:I

    if-eqz v0, :cond_2

    const-string v1, "android:theme"

    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    :cond_2
    iget-boolean v0, p0, Le4/k;->l0:Z

    if-nez v0, :cond_3

    const-string v1, "android:cancelable"

    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    :cond_3
    iget-boolean v0, p0, Le4/k;->m0:Z

    if-nez v0, :cond_4

    const-string v1, "android:showsDialog"

    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    :cond_4
    iget v0, p0, Le4/k;->n0:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_5

    const-string v1, "android:backStackId"

    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    :cond_5
    return-void
.end method

.method public c1()V
    .locals 2

    invoke-super {p0}, Landroidx/fragment/app/c;->c1()V

    iget-object v0, p0, Le4/k;->q0:Landroid/app/Dialog;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    iput-boolean v1, p0, Le4/k;->r0:Z

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    iget-object v0, p0, Le4/k;->q0:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-static {v0, p0}, Landroidx/lifecycle/d1;->b(Landroid/view/View;Landroidx/lifecycle/s;)V

    invoke-static {v0, p0}, Landroidx/lifecycle/e1;->a(Landroid/view/View;Landroidx/lifecycle/c1;)V

    invoke-static {v0, p0}, Ld5/m;->b(Landroid/view/View;Ld5/i;)V

    :cond_0
    return-void
.end method

.method public d1()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/c;->d1()V

    iget-object v0, p0, Le4/k;->q0:Landroid/app/Dialog;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Dialog;->hide()V

    :cond_0
    return-void
.end method

.method public e2()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0, v0, v0}, Le4/k;->g2(ZZZ)V

    return-void
.end method

.method public f1(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, Landroidx/fragment/app/c;->f1(Landroid/os/Bundle;)V

    iget-object v0, p0, Le4/k;->q0:Landroid/app/Dialog;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    const-string v0, "android:savedDialogState"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Le4/k;->q0:Landroid/app/Dialog;

    invoke-virtual {v0, p1}, Landroid/app/Dialog;->onRestoreInstanceState(Landroid/os/Bundle;)V

    :cond_0
    return-void
.end method

.method public f2()V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, v1}, Le4/k;->g2(ZZZ)V

    return-void
.end method

.method public final g2(ZZZ)V
    .locals 3

    iget-boolean v0, p0, Le4/k;->s0:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Le4/k;->s0:Z

    const/4 v1, 0x0

    iput-boolean v1, p0, Le4/k;->t0:Z

    iget-object v1, p0, Le4/k;->q0:Landroid/app/Dialog;

    if-eqz v1, :cond_2

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    iget-object v1, p0, Le4/k;->q0:Landroid/app/Dialog;

    invoke-virtual {v1}, Landroid/app/Dialog;->dismiss()V

    if-nez p2, :cond_2

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p2

    iget-object v1, p0, Le4/k;->f0:Landroid/os/Handler;

    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne p2, v1, :cond_1

    iget-object p2, p0, Le4/k;->q0:Landroid/app/Dialog;

    invoke-virtual {p0, p2}, Le4/k;->onDismiss(Landroid/content/DialogInterface;)V

    goto :goto_0

    :cond_1
    iget-object p2, p0, Le4/k;->f0:Landroid/os/Handler;

    iget-object v1, p0, Le4/k;->g0:Ljava/lang/Runnable;

    invoke-virtual {p2, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_2
    :goto_0
    iput-boolean v0, p0, Le4/k;->r0:Z

    iget p2, p0, Le4/k;->n0:I

    if-ltz p2, :cond_4

    if-eqz p3, :cond_3

    invoke-virtual {p0}, Landroidx/fragment/app/c;->M()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    iget p2, p0, Le4/k;->n0:I

    invoke-virtual {p1, p2, v0}, Landroidx/fragment/app/FragmentManager;->e1(II)Z

    goto :goto_1

    :cond_3
    invoke-virtual {p0}, Landroidx/fragment/app/c;->M()Landroidx/fragment/app/FragmentManager;

    move-result-object p2

    iget p3, p0, Le4/k;->n0:I

    invoke-virtual {p2, p3, v0, p1}, Landroidx/fragment/app/FragmentManager;->b1(IIZ)V

    :goto_1
    const/4 p1, -0x1

    iput p1, p0, Le4/k;->n0:I

    return-void

    :cond_4
    invoke-virtual {p0}, Landroidx/fragment/app/c;->M()Landroidx/fragment/app/FragmentManager;

    move-result-object p2

    invoke-virtual {p2}, Landroidx/fragment/app/FragmentManager;->r()Landroidx/fragment/app/h;

    move-result-object p2

    invoke-virtual {p2, v0}, Landroidx/fragment/app/h;->s(Z)Landroidx/fragment/app/h;

    invoke-virtual {p2, p0}, Landroidx/fragment/app/h;->m(Landroidx/fragment/app/c;)Landroidx/fragment/app/h;

    if-eqz p3, :cond_5

    invoke-virtual {p2}, Landroidx/fragment/app/h;->i()V

    return-void

    :cond_5
    if-eqz p1, :cond_6

    invoke-virtual {p2}, Landroidx/fragment/app/h;->h()I

    return-void

    :cond_6
    invoke-virtual {p2}, Landroidx/fragment/app/h;->g()I

    return-void
.end method

.method public h2()Landroid/app/Dialog;
    .locals 1

    iget-object v0, p0, Le4/k;->q0:Landroid/app/Dialog;

    return-object v0
.end method

.method public i2()Z
    .locals 1

    iget-boolean v0, p0, Le4/k;->m0:Z

    return v0
.end method

.method public j2()I
    .locals 1

    iget v0, p0, Le4/k;->k0:I

    return v0
.end method

.method public k()Le4/r;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-super {p0}, Landroidx/fragment/app/c;->k()Le4/r;

    move-result-object v0

    new-instance v1, Le4/k$e;

    invoke-direct {v1, p0, v0}, Le4/k$e;-><init>(Le4/k;Le4/r;)V

    return-object v1
.end method

.method public k2(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const/4 p1, 0x3

    invoke-static {p1}, Landroidx/fragment/app/FragmentManager;->N0(I)Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "onCreateDialog called for DialogFragment "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "FragmentManager"

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    new-instance p1, Le/w;

    invoke-virtual {p0}, Landroidx/fragment/app/c;->I1()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0}, Le4/k;->j2()I

    move-result v1

    invoke-direct {p1, v0, v1}, Le/w;-><init>(Landroid/content/Context;I)V

    return-object p1
.end method

.method public l2(I)Landroid/view/View;
    .locals 1

    iget-object v0, p0, Le4/k;->q0:Landroid/app/Dialog;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public m1(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/view/LayoutInflater;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/c;->m1(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V

    iget-object p1, p0, Landroidx/fragment/app/c;->K:Landroid/view/View;

    if-nez p1, :cond_0

    iget-object p1, p0, Le4/k;->q0:Landroid/app/Dialog;

    if-eqz p1, :cond_0

    if-eqz p3, :cond_0

    const-string p1, "android:savedDialogState"

    invoke-virtual {p3, p1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p2, p0, Le4/k;->q0:Landroid/app/Dialog;

    invoke-virtual {p2, p1}, Landroid/app/Dialog;->onRestoreInstanceState(Landroid/os/Bundle;)V

    :cond_0
    return-void
.end method

.method public m2()Z
    .locals 1

    iget-boolean v0, p0, Le4/k;->u0:Z

    return v0
.end method

.method public final n2(Landroid/os/Bundle;)V
    .locals 3

    iget-boolean v0, p0, Le4/k;->m0:Z

    if-nez v0, :cond_0

    goto :goto_3

    :cond_0
    iget-boolean v0, p0, Le4/k;->u0:Z

    if-nez v0, :cond_3

    const/4 v0, 0x0

    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, p0, Le4/k;->o0:Z

    invoke-virtual {p0, p1}, Le4/k;->k2(Landroid/os/Bundle;)Landroid/app/Dialog;

    move-result-object p1

    iput-object p1, p0, Le4/k;->q0:Landroid/app/Dialog;

    iget-boolean v2, p0, Le4/k;->m0:Z

    if-eqz v2, :cond_2

    iget v2, p0, Le4/k;->j0:I

    invoke-virtual {p0, p1, v2}, Le4/k;->s2(Landroid/app/Dialog;I)V

    invoke-virtual {p0}, Landroidx/fragment/app/c;->x()Landroid/content/Context;

    move-result-object p1

    instance-of v2, p1, Landroid/app/Activity;

    if-eqz v2, :cond_1

    iget-object v2, p0, Le4/k;->q0:Landroid/app/Dialog;

    check-cast p1, Landroid/app/Activity;

    invoke-virtual {v2, p1}, Landroid/app/Dialog;->setOwnerActivity(Landroid/app/Activity;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    :goto_0
    iget-object p1, p0, Le4/k;->q0:Landroid/app/Dialog;

    iget-boolean v2, p0, Le4/k;->l0:Z

    invoke-virtual {p1, v2}, Landroid/app/Dialog;->setCancelable(Z)V

    iget-object p1, p0, Le4/k;->q0:Landroid/app/Dialog;

    iget-object v2, p0, Le4/k;->h0:Landroid/content/DialogInterface$OnCancelListener;

    invoke-virtual {p1, v2}, Landroid/app/Dialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    iget-object p1, p0, Le4/k;->q0:Landroid/app/Dialog;

    iget-object v2, p0, Le4/k;->i0:Landroid/content/DialogInterface$OnDismissListener;

    invoke-virtual {p1, v2}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    iput-boolean v1, p0, Le4/k;->u0:Z

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    iput-object p1, p0, Le4/k;->q0:Landroid/app/Dialog;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    iput-boolean v0, p0, Le4/k;->o0:Z

    return-void

    :goto_2
    iput-boolean v0, p0, Le4/k;->o0:Z

    throw p1

    :cond_3
    :goto_3
    return-void
.end method

.method public final o2()Landroid/app/Dialog;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-virtual {p0}, Le4/k;->h2()Landroid/app/Dialog;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "DialogFragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " does not have a Dialog."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public onCancel(Landroid/content/DialogInterface;)V
    .locals 0
    .param p1    # Landroid/content/DialogInterface;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    return-void
.end method

.method public onDismiss(Landroid/content/DialogInterface;)V
    .locals 1
    .param p1    # Landroid/content/DialogInterface;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-boolean p1, p0, Le4/k;->r0:Z

    if-nez p1, :cond_1

    const/4 p1, 0x3

    invoke-static {p1}, Landroidx/fragment/app/FragmentManager;->N0(I)Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "onDismiss called for DialogFragment "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "FragmentManager"

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    const/4 p1, 0x0

    const/4 v0, 0x1

    invoke-virtual {p0, v0, v0, p1}, Le4/k;->g2(ZZZ)V

    :cond_1
    return-void
.end method

.method public p2(Z)V
    .locals 1

    iput-boolean p1, p0, Le4/k;->l0:Z

    iget-object v0, p0, Le4/k;->q0:Landroid/app/Dialog;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/app/Dialog;->setCancelable(Z)V

    :cond_0
    return-void
.end method

.method public q2(Z)V
    .locals 0

    iput-boolean p1, p0, Le4/k;->m0:Z

    return-void
.end method

.method public r2(II)V
    .locals 3

    const/4 v0, 0x2

    invoke-static {v0}, Landroidx/fragment/app/FragmentManager;->N0(I)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Setting style and theme for DialogFragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " to "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "FragmentManager"

    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iput p1, p0, Le4/k;->j0:I

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_2

    :cond_1
    const p1, 0x1030059

    iput p1, p0, Le4/k;->k0:I

    :cond_2
    if-eqz p2, :cond_3

    iput p2, p0, Le4/k;->k0:I

    :cond_3
    return-void
.end method

.method public s2(Landroid/app/Dialog;I)V
    .locals 2
    .param p1    # Landroid/app/Dialog;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-eq p2, v0, :cond_1

    const/4 v1, 0x2

    if-eq p2, v1, :cond_1

    const/4 v1, 0x3

    if-eq p2, v1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p2

    if-eqz p2, :cond_1

    const/16 v1, 0x18

    invoke-virtual {p2, v1}, Landroid/view/Window;->addFlags(I)V

    :cond_1
    invoke-virtual {p1, v0}, Landroid/app/Dialog;->requestWindowFeature(I)Z

    return-void
.end method

.method public t2(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V
    .locals 1
    .param p1    # Landroidx/fragment/app/FragmentManager;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    iput-boolean v0, p0, Le4/k;->s0:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Le4/k;->t0:Z

    invoke-virtual {p1}, Landroidx/fragment/app/FragmentManager;->r()Landroidx/fragment/app/h;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroidx/fragment/app/h;->s(Z)Landroidx/fragment/app/h;

    invoke-virtual {p1, p0, p2}, Landroidx/fragment/app/h;->d(Landroidx/fragment/app/c;Ljava/lang/String;)Landroidx/fragment/app/h;

    invoke-virtual {p1}, Landroidx/fragment/app/h;->g()I

    return-void
.end method

.method public z0(Landroid/os/Bundle;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-super {p0, p1}, Landroidx/fragment/app/c;->z0(Landroid/os/Bundle;)V

    return-void
.end method
