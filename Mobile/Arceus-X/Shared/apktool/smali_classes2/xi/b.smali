.class public Lxi/b;
.super Lxi/a;
.source "SourceFile"


# instance fields
.field public b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lsg/x0;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p1}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object p1

    invoke-direct {p0, p1}, Lxi/a;-><init>(Le4/q;)V

    iput-object p2, p0, Lxi/b;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public c(Landroidx/lifecycle/r;)V
    .locals 5

    invoke-virtual {p0}, Lxi/a;->a()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "showPremium"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    iget-object v1, p0, Lxi/a;->a:Le4/q;

    sget v3, Lsg/m0;->j:I

    invoke-virtual {v1, v3}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    if-nez v1, :cond_1

    invoke-static {}, Lvi/g;->b()Lvi/g;

    move-result-object v1

    const-string v4, "robux_buildsclub_no_container_for_purchase"

    invoke-virtual {v1, v4}, Lvi/g;->q(Ljava/lang/String;)V

    :cond_1
    iget-object v1, p0, Lxi/a;->a:Le4/q;

    invoke-virtual {v1, v3}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    const-string v4, "dialog"

    if-eqz v1, :cond_3

    new-instance v1, Lvh/k;

    invoke-direct {v1}, Lvh/k;-><init>()V

    if-eqz p1, :cond_2

    invoke-virtual {v1}, Landroidx/fragment/app/c;->a()Landroidx/lifecycle/l;

    move-result-object v2

    invoke-virtual {v2, p1}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    :cond_2
    invoke-virtual {v1, v0}, Landroidx/fragment/app/c;->O1(Landroid/os/Bundle;)V

    invoke-static {}, Lsg/a1;->o()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lsg/y1;->T2(Ljava/lang/String;)V

    iget-object p1, p0, Lxi/a;->a:Le4/q;

    invoke-virtual {p1}, Le4/q;->l1()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/FragmentManager;->r()Landroidx/fragment/app/h;

    move-result-object p1

    const-string v0, "robuxPurchase"

    invoke-virtual {p1, v0}, Landroidx/fragment/app/h;->f(Ljava/lang/String;)Landroidx/fragment/app/h;

    move-result-object p1

    invoke-virtual {p1, v3, v1, v4}, Landroidx/fragment/app/h;->b(ILandroidx/fragment/app/c;Ljava/lang/String;)Landroidx/fragment/app/h;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/h;->g()I

    goto :goto_0

    :cond_3
    const-string v1, "dialogHeight"

    invoke-virtual {p0}, Lxi/a;->b()I

    move-result v3

    invoke-virtual {v0, v1, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    new-instance v1, Lvh/h;

    invoke-direct {v1}, Lvh/h;-><init>()V

    if-eqz p1, :cond_4

    invoke-virtual {v1}, Landroidx/fragment/app/c;->a()Landroidx/lifecycle/l;

    move-result-object v3

    invoke-virtual {v3, p1}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    :cond_4
    invoke-virtual {v1, v0}, Landroidx/fragment/app/c;->O1(Landroid/os/Bundle;)V

    invoke-static {}, Lsg/a1;->o()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/roblox/client/c;->q3(Ljava/lang/String;)V

    invoke-virtual {v1}, Le4/k;->j2()I

    move-result p1

    invoke-virtual {v1, v2, p1}, Le4/k;->r2(II)V

    iget-object p1, p0, Lxi/a;->a:Le4/q;

    invoke-virtual {p1}, Le4/q;->l1()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    invoke-virtual {v1, p1, v4}, Le4/k;->t2(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    :goto_0
    const-string p1, "buildersClub"

    iget-object v0, p0, Lxi/b;->b:Ljava/lang/String;

    const-string v1, "nativeMain"

    invoke-static {v1, p1, v0}, Lsg/t0;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
