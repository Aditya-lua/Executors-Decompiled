.class public Lfj/e;
.super Lfj/a;
.source "SourceFile"


# instance fields
.field public b:Ljava/lang/String;

.field public c:Llk/c;


# direct methods
.method public constructor <init>(Lbh/x0;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p1}, Lf4/q;->p()Lf4/v;

    move-result-object p1

    invoke-direct {p0, p1}, Lfj/a;-><init>(Lf4/v;)V

    iput-object p2, p0, Lfj/e;->b:Ljava/lang/String;

    new-instance p1, Llk/f;

    invoke-direct {p1}, Llk/f;-><init>()V

    iput-object p1, p0, Lfj/e;->c:Llk/c;

    return-void
.end method


# virtual methods
.method public final c(Lcm/a;)I
    .locals 1

    sget-object v0, Lfj/e$b;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    sget p1, Lbh/r0;->c:I

    return p1

    :cond_0
    sget p1, Lbh/r0;->b:I

    return p1
.end method

.method public final d(Lcm/a;)I
    .locals 0

    sget p1, Lbh/l0;->y:I

    return p1
.end method

.method public e(Landroid/view/Menu;Landroid/view/MenuInflater;)Landroid/view/MenuItem;
    .locals 1

    sget v0, Lbh/o0;->b:I

    invoke-virtual {p2, v0, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    sget p2, Lbh/m0;->b:I

    invoke-interface {p1, p2}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object p1

    invoke-interface {p1}, Landroid/view/MenuItem;->getActionView()Landroid/view/View;

    move-result-object p2

    new-instance v0, Lfj/e$a;

    invoke-direct {v0, p0}, Lfj/e$a;-><init>(Lfj/e;)V

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    sget v0, Lbh/m0;->H:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageView;

    iget-object v0, p0, Lfj/e;->c:Llk/c;

    invoke-interface {v0}, Llk/c;->getTheme()Lcm/a;

    move-result-object v0

    invoke-virtual {p0, v0}, Lfj/e;->d(Lcm/a;)I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    return-object p1
.end method

.method public f()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lfj/e;->g(Landroidx/lifecycle/r;)V

    return-void
.end method

.method public g(Landroidx/lifecycle/r;)V
    .locals 8

    invoke-virtual {p0}, Lfj/a;->a()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lfj/a;->a:Lf4/v;

    if-eqz v0, :cond_b

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_b

    iget-object v0, p0, Lfj/a;->a:Lf4/v;

    invoke-virtual {v0}, Lf4/v;->l1()Lf4/k0;

    move-result-object v0

    invoke-virtual {v0}, Lf4/k0;->U0()Z

    move-result v0

    if-eqz v0, :cond_1

    goto/16 :goto_2

    :cond_1
    invoke-static {}, Lok/t;->j()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->i()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lfj/a;->a:Lf4/v;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lbh/k0;->f:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    const-string v1, ""

    goto :goto_0

    :cond_2
    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->I0()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, Lfj/h;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lfj/a;->b()I

    move-result v0

    goto :goto_0

    :cond_3
    invoke-static {}, Lbh/a1;->F0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lfj/a;->b()I

    move-result v0

    :goto_0
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    const-string v3, "showRobux"

    const/4 v4, 0x1

    invoke-virtual {v2, v3, v4}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v3

    invoke-interface {v3}, Lbi/i;->I0()Z

    move-result v3

    if-eqz v3, :cond_4

    const-string v3, "hideNativeHeader"

    invoke-virtual {v2, v3, v4}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    :cond_4
    iget-object v3, p0, Lfj/a;->a:Lf4/v;

    sget v5, Lbh/m0;->j:I

    invoke-virtual {v3, v5}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    if-nez v3, :cond_5

    invoke-static {}, Ldj/g;->b()Ldj/g;

    move-result-object v3

    const-string v5, "robux_menuoption_no_container_for_purchase"

    invoke-virtual {v3, v5}, Ldj/g;->q(Ljava/lang/String;)V

    :cond_5
    iget-object v3, p0, Lfj/a;->a:Lf4/v;

    invoke-virtual {v3}, Lf4/v;->l1()Lf4/k0;

    move-result-object v3

    iget-object v5, p0, Lfj/a;->a:Lf4/v;

    sget v6, Lbh/m0;->j:I

    invoke-virtual {v5, v6}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v5

    const-string v6, "dialog"

    const-string v7, "RobuxMenuOption"

    if-eqz v5, :cond_8

    new-instance v0, Ldi/j;

    invoke-direct {v0}, Ldi/j;-><init>()V

    invoke-virtual {v0, v2}, Lf4/q;->O1(Landroid/os/Bundle;)V

    invoke-virtual {v0, v1}, Lbh/y1;->T2(Ljava/lang/String;)V

    if-eqz p1, :cond_6

    invoke-virtual {v0}, Lf4/q;->a()Landroidx/lifecycle/l;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    :cond_6
    invoke-virtual {v3}, Lf4/k0;->U0()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-static {}, Ldj/g;->b()Ldj/g;

    move-result-object p1

    const-string v1, "robux_menuoption_committed_after_state_save"

    invoke-virtual {p1, v1}, Ldj/g;->q(Ljava/lang/String;)V

    const-string p1, "State has already been saved. Attempting to show premium fragment, allowing state loss."

    invoke-static {v7, p1}, Lok/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_7
    invoke-virtual {v3}, Lf4/k0;->r()Lf4/t0;

    move-result-object p1

    const-string v1, "robuxPurchase"

    invoke-virtual {p1, v1}, Lf4/t0;->f(Ljava/lang/String;)Lf4/t0;

    move-result-object p1

    sget v1, Lbh/m0;->j:I

    invoke-virtual {p1, v1, v0, v6}, Lf4/t0;->b(ILf4/q;Ljava/lang/String;)Lf4/t0;

    move-result-object p1

    invoke-virtual {p1}, Lf4/t0;->h()I

    goto :goto_1

    :cond_8
    const-string v5, "dialogHeight"

    invoke-virtual {v2, v5, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    new-instance v0, Ldi/g;

    invoke-direct {v0}, Ldi/g;-><init>()V

    invoke-virtual {v0, v2}, Lf4/q;->O1(Landroid/os/Bundle;)V

    invoke-virtual {v0, v1}, Lcom/roblox/client/c;->q3(Ljava/lang/String;)V

    iget-object v1, p0, Lfj/e;->c:Llk/c;

    invoke-interface {v1}, Llk/c;->getTheme()Lcm/a;

    move-result-object v1

    invoke-virtual {p0, v1}, Lfj/e;->c(Lcm/a;)I

    move-result v1

    invoke-virtual {v0, v4, v1}, Lf4/o;->r2(II)V

    if-eqz p1, :cond_9

    invoke-virtual {v0}, Lf4/q;->a()Landroidx/lifecycle/l;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    :cond_9
    invoke-virtual {v3}, Lf4/k0;->U0()Z

    move-result p1

    if-nez p1, :cond_a

    invoke-virtual {v0, v3, v6}, Lf4/o;->t2(Lf4/k0;Ljava/lang/String;)V

    goto :goto_1

    :cond_a
    invoke-static {}, Ldj/g;->b()Ldj/g;

    move-result-object p1

    const-string v0, "robux_menuoption_not_shown_after_state_save"

    invoke-virtual {p1, v0}, Ldj/g;->q(Ljava/lang/String;)V

    const-string p1, "State has already been saved. Do not show premium dialog fragment."

    invoke-static {v7, p1}, Lok/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_1
    const-string p1, "robux"

    iget-object v0, p0, Lfj/e;->b:Ljava/lang/String;

    const-string v1, "nativeMain"

    invoke-static {v1, p1, v0}, Lbh/t0;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_b
    :goto_2
    invoke-static {}, Ldj/g;->b()Ldj/g;

    move-result-object p1

    const-string v0, "robux_menuoption_attempt_after_state_save"

    invoke-virtual {p1, v0}, Ldj/g;->q(Ljava/lang/String;)V

    return-void
.end method
