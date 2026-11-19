.class public Lfj/b;
.super Lfj/a;
.source "SourceFile"


# instance fields
.field public b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lbh/x0;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p1}, Lf4/q;->p()Lf4/v;

    move-result-object p1

    invoke-direct {p0, p1}, Lfj/a;-><init>(Lf4/v;)V

    iput-object p2, p0, Lfj/b;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public c(Landroidx/lifecycle/r;)V
    .locals 5

    invoke-virtual {p0}, Lfj/a;->a()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "showPremium"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    iget-object v1, p0, Lfj/a;->a:Lf4/v;

    sget v3, Lbh/m0;->j:I

    invoke-virtual {v1, v3}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    if-nez v1, :cond_1

    invoke-static {}, Ldj/g;->b()Ldj/g;

    move-result-object v1

    const-string v3, "robux_buildsclub_no_container_for_purchase"

    invoke-virtual {v1, v3}, Ldj/g;->q(Ljava/lang/String;)V

    :cond_1
    iget-object v1, p0, Lfj/a;->a:Lf4/v;

    sget v3, Lbh/m0;->j:I

    invoke-virtual {v1, v3}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    const-string v3, "dialog"

    if-eqz v1, :cond_3

    new-instance v1, Ldi/j;

    invoke-direct {v1}, Ldi/j;-><init>()V

    if-eqz p1, :cond_2

    invoke-virtual {v1}, Lf4/q;->a()Landroidx/lifecycle/l;

    move-result-object v2

    invoke-virtual {v2, p1}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    :cond_2
    invoke-virtual {v1, v0}, Lf4/q;->O1(Landroid/os/Bundle;)V

    invoke-static {}, Lbh/a1;->o()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lbh/y1;->T2(Ljava/lang/String;)V

    iget-object p1, p0, Lfj/a;->a:Lf4/v;

    invoke-virtual {p1}, Lf4/v;->l1()Lf4/k0;

    move-result-object p1

    invoke-virtual {p1}, Lf4/k0;->r()Lf4/t0;

    move-result-object p1

    const-string v0, "robuxPurchase"

    invoke-virtual {p1, v0}, Lf4/t0;->f(Ljava/lang/String;)Lf4/t0;

    move-result-object p1

    sget v0, Lbh/m0;->j:I

    invoke-virtual {p1, v0, v1, v3}, Lf4/t0;->b(ILf4/q;Ljava/lang/String;)Lf4/t0;

    move-result-object p1

    invoke-virtual {p1}, Lf4/t0;->g()I

    goto :goto_0

    :cond_3
    const-string v1, "dialogHeight"

    invoke-virtual {p0}, Lfj/a;->b()I

    move-result v4

    invoke-virtual {v0, v1, v4}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    new-instance v1, Ldi/g;

    invoke-direct {v1}, Ldi/g;-><init>()V

    if-eqz p1, :cond_4

    invoke-virtual {v1}, Lf4/q;->a()Landroidx/lifecycle/l;

    move-result-object v4

    invoke-virtual {v4, p1}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    :cond_4
    invoke-virtual {v1, v0}, Lf4/q;->O1(Landroid/os/Bundle;)V

    invoke-static {}, Lbh/a1;->o()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/roblox/client/c;->q3(Ljava/lang/String;)V

    invoke-virtual {v1}, Lf4/o;->j2()I

    move-result p1

    invoke-virtual {v1, v2, p1}, Lf4/o;->r2(II)V

    iget-object p1, p0, Lfj/a;->a:Lf4/v;

    invoke-virtual {p1}, Lf4/v;->l1()Lf4/k0;

    move-result-object p1

    invoke-virtual {v1, p1, v3}, Lf4/o;->t2(Lf4/k0;Ljava/lang/String;)V

    :goto_0
    const-string p1, "buildersClub"

    iget-object v0, p0, Lfj/b;->b:Ljava/lang/String;

    const-string v1, "nativeMain"

    invoke-static {v1, p1, v0}, Lbh/t0;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
