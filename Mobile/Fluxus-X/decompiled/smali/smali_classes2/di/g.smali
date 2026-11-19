.class public Ldi/g;
.super Lcom/roblox/client/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldi/g$e;,
        Ldi/g$d;,
        Ldi/g$c;
    }
.end annotation


# instance fields
.field public g1:Z

.field public h1:Z

.field public i1:Landroid/widget/TextView;

.field public j1:Landroid/widget/FrameLayout;

.field public k1:Landroid/widget/ImageView;

.field public l1:Llk/d;

.field public m1:Llk/d;

.field public n1:Llk/d;

.field public o1:Lcom/roblox/client/components/RobloxToolbar$c;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/roblox/client/c;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Ldi/g;->g1:Z

    iput-boolean v0, p0, Ldi/g;->h1:Z

    return-void
.end method

.method public static synthetic J3(Ldi/g;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0, p1}, Ldi/g;->M3(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic K3(Ldi/g;Lf4/v;)V
    .locals 0

    invoke-virtual {p0, p1}, Ldi/g;->L3(Lf4/v;)V

    return-void
.end method


# virtual methods
.method public I3()Leh/v0$b;
    .locals 1

    sget-object v0, Leh/v0$b;->j:Leh/v0$b;

    return-object v0
.end method

.method public J0(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    invoke-super {p0, p1, p2, p3}, Lcom/roblox/client/c;->J0(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p2

    new-instance p3, Ldi/g$e;

    invoke-virtual {p0}, Lf4/q;->v()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p3, v0}, Ldi/g$e;-><init>(Landroid/content/Context;)V

    iput-object p3, p0, Ldi/g;->l1:Llk/d;

    new-instance p3, Ldi/g$d;

    invoke-virtual {p0}, Lf4/q;->v()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p3, v0}, Ldi/g$d;-><init>(Landroid/content/Context;)V

    iput-object p3, p0, Ldi/g;->m1:Llk/d;

    new-instance p3, Ldi/g$c;

    invoke-virtual {p0}, Lf4/q;->v()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p3, v0}, Ldi/g$c;-><init>(Landroid/content/Context;)V

    iput-object p3, p0, Ldi/g;->n1:Llk/d;

    new-instance p3, Lcom/roblox/client/components/RobloxToolbar$c;

    invoke-direct {p3}, Lcom/roblox/client/components/RobloxToolbar$c;-><init>()V

    iput-object p3, p0, Ldi/g;->o1:Lcom/roblox/client/components/RobloxToolbar$c;

    invoke-virtual {p0, p1}, Ldi/g;->O3(Landroid/view/LayoutInflater;)V

    invoke-virtual {p0}, Lf4/q;->t()Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_1

    const-string p3, "showRobux"

    const/4 v0, 0x0

    invoke-virtual {p1, p3, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p3

    const/4 v1, 0x1

    if-eqz p3, :cond_0

    iput-boolean v1, p0, Ldi/g;->g1:Z

    invoke-virtual {p0}, Ldi/g;->P3()V

    invoke-virtual {p0}, Ldi/g;->N3()V

    goto :goto_0

    :cond_0
    const-string p3, "showPremium"

    invoke-virtual {p1, p3, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_1

    iput-boolean v1, p0, Ldi/g;->h1:Z

    iget-object p1, p0, Ldi/g;->i1:Landroid/widget/TextView;

    sget p3, Lbh/q0;->z:I

    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setText(I)V

    :cond_1
    :goto_0
    invoke-static {}, Lnk/c;->c()Lnk/c;

    move-result-object p1

    invoke-virtual {p1}, Lnk/c;->g()Lcm/a;

    move-result-object p1

    invoke-virtual {p0, p1}, Ldi/g;->Q3(Lcm/a;)V

    return-object p2
.end method

.method public final synthetic L3(Lf4/v;)V
    .locals 1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p1}, Landroid/app/Activity;->isDestroyed()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean p1, p0, Ldi/g;->h1:Z

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lf4/o;->e2()V

    return-void

    :cond_1
    invoke-virtual {p0}, Ldi/g;->N3()V

    :cond_2
    :goto_0
    return-void
.end method

.method public final synthetic M3(Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Lf4/o;->e2()V

    return-void
.end method

.method public final N3()V
    .locals 3

    invoke-static {}, Ldj/h;->e()Ldj/h;

    move-result-object v0

    new-instance v1, Ldi/g$a;

    invoke-direct {v1, p0}, Ldi/g$a;-><init>(Ldi/g;)V

    new-instance v2, Lmi/h;

    invoke-direct {v2}, Lmi/h;-><init>()V

    invoke-virtual {v0, v1, v2}, Ldj/h;->m(Ldj/h$d;Lmi/f;)V

    return-void
.end method

.method public final O3(Landroid/view/LayoutInflater;)V
    .locals 2

    sget v0, Lbh/n0;->F:I

    iget-object v1, p0, Lcom/roblox/client/c;->Q0:Landroid/widget/FrameLayout;

    invoke-virtual {p1, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/FrameLayout;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    sget v0, Lbh/m0;->k:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Ldi/g;->k1:Landroid/widget/ImageView;

    new-instance v1, Ldi/e;

    invoke-direct {v1, p0}, Ldi/e;-><init>(Ldi/g;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    sget v0, Lbh/m0;->r:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Ldi/g;->i1:Landroid/widget/TextView;

    sget v0, Lbh/m0;->s:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/FrameLayout;

    iput-object p1, p0, Ldi/g;->j1:Landroid/widget/FrameLayout;

    return-void
.end method

.method public P3()V
    .locals 2

    iget-boolean v0, p0, Ldi/g;->g1:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lf4/q;->p0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lnk/c;->c()Lnk/c;

    move-result-object v0

    invoke-virtual {v0}, Lnk/c;->f()I

    move-result v0

    sget v1, Lbh/q0;->v1:I

    invoke-static {v0}, Lmj/q;->a(I)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v1, v0}, Lf4/q;->f0(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ldi/g;->i1:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public final Q3(Lcm/a;)V
    .locals 2

    iget-object v0, p0, Ldi/g;->j1:Landroid/widget/FrameLayout;

    iget-boolean v1, p0, Ldi/g;->h1:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Ldi/g;->m1:Llk/d;

    invoke-interface {v1, p1}, Llk/d;->a(Lcm/a;)I

    move-result v1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Ldi/g;->l1:Llk/d;

    invoke-interface {v1, p1}, Llk/d;->a(Lcm/a;)I

    move-result v1

    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    iget-object v0, p0, Ldi/g;->i1:Landroid/widget/TextView;

    iget-object v1, p0, Ldi/g;->n1:Llk/d;

    invoke-interface {v1, p1}, Llk/d;->a(Lcm/a;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v0, p0, Ldi/g;->k1:Landroid/widget/ImageView;

    iget-object v1, p0, Ldi/g;->o1:Lcom/roblox/client/components/RobloxToolbar$c;

    invoke-virtual {v1, p1}, Lcom/roblox/client/components/RobloxToolbar$c;->a(Lcm/a;)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    return-void
.end method

.method public Y2(Lmj/p;)V
    .locals 1

    invoke-super {p0, p1}, Lcom/roblox/client/c;->Y2(Lmj/p;)V

    invoke-virtual {p0}, Lf4/q;->p()Lf4/v;

    move-result-object p1

    if-eqz p1, :cond_0

    new-instance v0, Ldi/f;

    invoke-direct {v0, p0, p1}, Ldi/f;-><init>(Ldi/g;Lf4/v;)V

    invoke-virtual {p1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public c3()Ljava/lang/String;
    .locals 1

    iget-boolean v0, p0, Ldi/g;->h1:Z

    if-eqz v0, :cond_0

    const-string v0, "buildersClub"

    return-object v0

    :cond_0
    iget-boolean v0, p0, Ldi/g;->g1:Z

    if-eqz v0, :cond_1

    const-string v0, "robux"

    return-object v0

    :cond_1
    invoke-super {p0}, Lcom/roblox/client/c;->c3()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public g0(Lcm/a;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/roblox/client/c;->g0(Lcm/a;)V

    invoke-virtual {p0, p1}, Ldi/g;->Q3(Lcm/a;)V

    return-void
.end method

.method public onDismiss(Landroid/content/DialogInterface;)V
    .locals 1

    invoke-super {p0, p1}, Lf4/o;->onDismiss(Landroid/content/DialogInterface;)V

    invoke-static {}, Ldj/h;->e()Ldj/h;

    move-result-object p1

    invoke-virtual {p1}, Ldj/h;->f()Z

    move-result p1

    if-nez p1, :cond_1

    iget-boolean p1, p0, Ldi/g;->h1:Z

    if-nez p1, :cond_0

    iget-boolean p1, p0, Ldi/g;->g1:Z

    if-eqz p1, :cond_1

    :cond_0
    invoke-virtual {p0}, Ldi/g;->c3()Ljava/lang/String;

    move-result-object p1

    const-string v0, "close"

    invoke-static {p1, v0}, Lbh/t0;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    return-void
.end method
