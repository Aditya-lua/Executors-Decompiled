.class public Lvh/e;
.super Lcom/roblox/client/c;
.source "SourceFile"


# instance fields
.field public A1:Z

.field public B1:Z

.field public C1:Landroid/view/View;

.field public D1:Landroid/view/View$OnClickListener;

.field public E1:Lxi/f;

.field public F1:Lxi/i;

.field public G1:Landroid/app/ProgressDialog;

.field public g1:Ljava/lang/String;

.field public h1:Z

.field public i1:I

.field public j1:Ljava/lang/String;

.field public k1:Z

.field public l1:Z

.field public m1:Z

.field public n1:Lorg/json/JSONObject;

.field public o1:Z

.field public p1:Z

.field public q1:Z

.field public r1:Lcom/roblox/client/components/RobloxToolbar;

.field public s1:Lcom/roblox/client/components/RobloxToolbar;

.field public t1:Landroid/widget/ImageView;

.field public u1:Lcom/roblox/client/components/RobloxToolbar$c;

.field public v1:Lxi/d;

.field public w1:Landroid/view/Menu;

.field public x1:Z

.field public y1:Z

.field public z1:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Lcom/roblox/client/c;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lvh/e;->g1:Ljava/lang/String;

    const/4 v1, 0x0

    iput-boolean v1, p0, Lvh/e;->h1:Z

    const/4 v2, -0x1

    iput v2, p0, Lvh/e;->i1:I

    iput-boolean v1, p0, Lvh/e;->l1:Z

    iput-boolean v1, p0, Lvh/e;->m1:Z

    iput-boolean v1, p0, Lvh/e;->x1:Z

    iput-boolean v1, p0, Lvh/e;->y1:Z

    iput-boolean v1, p0, Lvh/e;->z1:Z

    const/4 v2, 0x1

    iput-boolean v2, p0, Lvh/e;->A1:Z

    iput-boolean v1, p0, Lvh/e;->B1:Z

    iput-object v0, p0, Lvh/e;->C1:Landroid/view/View;

    return-void
.end method

.method public static synthetic J3(Lvh/e;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0, p1}, Lvh/e;->T3(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic K3(Lvh/e;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0, p1}, Lvh/e;->S3(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic L3(Lvh/e;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0, p1}, Lvh/e;->U3(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic M3(Lvh/e;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0, p1}, Lvh/e;->R3(Landroid/view/View;)V

    return-void
.end method

.method public static bridge synthetic N3(Lvh/e;)V
    .locals 0

    invoke-virtual {p0}, Lvh/e;->P3()V

    return-void
.end method


# virtual methods
.method public D3(Z)V
    .locals 1

    invoke-super {p0, p1}, Lcom/roblox/client/c;->D3(Z)V

    iget-object v0, p0, Lvh/e;->C1:Landroid/view/View;

    if-eqz v0, :cond_1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    :goto_0
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    :cond_1
    return-void
.end method

.method public F0(Landroid/os/Bundle;)V
    .locals 5

    invoke-super {p0, p1}, Lcom/roblox/client/c;->F0(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroidx/fragment/app/c;->t()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "rbx.web"

    if-eqz v0, :cond_2

    const-string v2, "TITLE_ID"

    const/4 v3, -0x1

    invoke-virtual {v0, v2, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v2

    iput v2, p0, Lvh/e;->i1:I

    const-string v2, "TITLE_STRING"

    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lvh/e;->j1:Ljava/lang/String;

    const-string v2, "REPORTING_TAB_NAME"

    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lvh/e;->g1:Ljava/lang/String;

    const-string v2, "HAS_PARENT"

    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result v2

    iput-boolean v2, p0, Lvh/e;->h1:Z

    const-string v2, "HIDE_ACCESSORY_BUTTONS"

    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result v2

    iput-boolean v2, p0, Lvh/e;->l1:Z

    const-string v2, "SHOW_DOMAIN_AS_TITLE"

    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result v2

    iput-boolean v2, p0, Lvh/e;->k1:Z

    const-string v2, "CLOSE_FRAGMENT_ON_RESTORED"

    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result v2

    iput-boolean v2, p0, Lvh/e;->o1:Z

    const-string v2, "ENABLE_WEB_VIEW_SERVICE"

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    iput-boolean v2, p0, Lvh/e;->p1:Z

    const-string v2, "hideNativeHeader"

    invoke-virtual {v0, v2, v3}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    iput-boolean v2, p0, Lvh/e;->m1:Z

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "onCreate enableWebViewService = "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v4, p0, Lvh/e;->p1:Z

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-boolean v2, p0, Lvh/e;->p1:Z

    const/4 v4, 0x1

    if-eqz v2, :cond_0

    const-string v2, "BACK_NAVIGATION_DISABLED"

    invoke-virtual {v0, v2, v4}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    iput-boolean v2, p0, Lvh/e;->A1:Z

    if-eqz v2, :cond_1

    iput-boolean v3, p0, Lvh/e;->x1:Z

    invoke-virtual {p0, v4}, Lcom/roblox/client/c;->A3(Z)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/c;->x()Landroid/content/Context;

    move-result-object v2

    instance-of v2, v2, Lcom/roblox/client/ActivityNativeMain;

    if-eqz v2, :cond_1

    iput-boolean v4, p0, Lvh/e;->q1:Z

    :cond_1
    :goto_0
    const-string v2, "SEARCH_PARAMS"

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    iput-object v2, p0, Lvh/e;->n1:Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_2
    if-eqz p1, :cond_3

    iget-boolean p1, p0, Lvh/e;->o1:Z

    if-eqz p1, :cond_3

    const-string p1, "onCreate: ... Closing this web fragment on restored."

    invoke-static {v1, p1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Le4/q;->l1()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/FragmentManager;->r()Landroidx/fragment/app/h;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroidx/fragment/app/h;->m(Landroidx/fragment/app/c;)Landroidx/fragment/app/h;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/h;->h()I

    :cond_3
    iget-object p1, p0, Lvh/e;->n1:Lorg/json/JSONObject;

    if-nez p1, :cond_4

    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    iput-object p1, p0, Lvh/e;->n1:Lorg/json/JSONObject;

    :cond_4
    new-instance p1, Lvh/e$a;

    invoke-direct {p1, p0}, Lvh/e$a;-><init>(Lvh/e;)V

    iput-object p1, p0, Lvh/e;->D1:Landroid/view/View$OnClickListener;

    return-void
.end method

.method public H3(Lnl/a;)V
    .locals 1

    invoke-super {p0, p1}, Lcom/roblox/client/c;->H3(Lnl/a;)V

    iget-object p1, p1, Lnl/a;->b:Ljava/lang/String;

    if-eqz p1, :cond_1

    iget-boolean v0, p0, Lvh/e;->p1:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lvh/e;->r1:Lcom/roblox/client/components/RobloxToolbar;

    invoke-virtual {v0, p1}, Lcom/roblox/client/components/RobloxToolbar;->setTitle(Ljava/lang/CharSequence;)V

    return-void

    :cond_0
    iget-object v0, p0, Lvh/e;->s1:Lcom/roblox/client/components/RobloxToolbar;

    invoke-virtual {v0, p1}, Lcom/roblox/client/components/RobloxToolbar;->setTitle(Ljava/lang/CharSequence;)V

    :cond_1
    return-void
.end method

.method public I3()Lvg/c0$b;
    .locals 1

    sget-object v0, Lvg/c0$b;->l:Lvg/c0$b;

    return-object v0
.end method

.method public J0(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 4

    sget v0, Lsg/n0;->E:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/LinearLayout;

    new-instance v0, Lcom/roblox/client/components/RobloxToolbar$c;

    invoke-direct {v0}, Lcom/roblox/client/components/RobloxToolbar$c;-><init>()V

    iput-object v0, p0, Lvh/e;->u1:Lcom/roblox/client/components/RobloxToolbar$c;

    iget-boolean v0, p0, Lvh/e;->p1:Z

    const/16 v2, 0x8

    if-eqz v0, :cond_3

    sget v0, Lsg/m0;->l0:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roblox/client/components/RobloxToolbar;

    iput-object v0, p0, Lvh/e;->r1:Lcom/roblox/client/components/RobloxToolbar;

    sget v0, Lsg/m0;->m0:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roblox/client/components/RobloxToolbar;

    iput-object v0, p0, Lvh/e;->s1:Lcom/roblox/client/components/RobloxToolbar;

    invoke-virtual {v0, v2}, Lcom/roblox/client/components/RobloxToolbar;->setVisibility(I)V

    iget-boolean v0, p0, Lvh/e;->m1:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lvh/e;->r1:Lcom/roblox/client/components/RobloxToolbar;

    invoke-virtual {v0, v2}, Lcom/roblox/client/components/RobloxToolbar;->setVisibility(I)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lvh/e;->r1:Lcom/roblox/client/components/RobloxToolbar;

    new-instance v2, Lvh/a;

    invoke-direct {v2, p0}, Lvh/a;-><init>(Lvh/e;)V

    invoke-virtual {v0, v2}, Lcom/roblox/client/components/RobloxToolbar;->h0(Landroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lvh/e;->r1:Lcom/roblox/client/components/RobloxToolbar;

    const v2, 0x800013

    invoke-virtual {v0, v2}, Lcom/roblox/client/components/RobloxToolbar;->setCloseButtonGravity(I)V

    :goto_0
    sget v0, Lsg/m0;->h:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    invoke-super {p0, p1, v0, p3}, Lcom/roblox/client/c;->J0(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-boolean p1, p0, Lvh/e;->m1:Z

    if-eqz p1, :cond_1

    sget p1, Lsg/m0;->D:I

    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lvh/e;->t1:Landroid/widget/ImageView;

    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object p1, p0, Lvh/e;->t1:Landroid/widget/ImageView;

    iget-object p3, p0, Lvh/e;->u1:Lcom/roblox/client/components/RobloxToolbar$c;

    invoke-static {}, Lfk/c;->c()Lfk/c;

    move-result-object v0

    invoke-virtual {v0}, Lfk/c;->g()Lol/a;

    move-result-object v0

    invoke-virtual {p3, v0}, Lcom/roblox/client/components/RobloxToolbar$c;->a(Lol/a;)I

    move-result p3

    invoke-virtual {p1, p3}, Landroid/widget/ImageView;->setImageResource(I)V

    iget-object p1, p0, Lvh/e;->t1:Landroid/widget/ImageView;

    new-instance p3, Lvh/b;

    invoke-direct {p3, p0}, Lvh/b;-><init>(Lvh/e;)V

    invoke-virtual {p1, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_1
    iget-object p1, p0, Lvh/e;->r1:Lcom/roblox/client/components/RobloxToolbar;

    invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->getMenu()Landroid/view/Menu;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/fragment/app/c;->H1()Le4/q;

    move-result-object p3

    invoke-virtual {p3}, Landroid/app/Activity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object p3

    invoke-virtual {p0, p1, p3}, Lvh/e;->Z3(Landroid/view/Menu;Landroid/view/MenuInflater;)V

    iput-object p2, p0, Lvh/e;->C1:Landroid/view/View;

    iget-boolean p1, p0, Lcom/roblox/client/c;->X0:Z

    if-nez p1, :cond_2

    invoke-virtual {p0, v1}, Lvh/e;->D3(Z)V

    :cond_2
    return-object p2

    :cond_3
    sget v0, Lsg/m0;->l0:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roblox/client/components/RobloxToolbar;

    iput-object v0, p0, Lvh/e;->r1:Lcom/roblox/client/components/RobloxToolbar;

    sget v0, Lsg/m0;->m0:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roblox/client/components/RobloxToolbar;

    iput-object v0, p0, Lvh/e;->s1:Lcom/roblox/client/components/RobloxToolbar;

    iget-boolean v3, p0, Lvh/e;->q1:Z

    if-eqz v3, :cond_4

    iget-object v0, p0, Lvh/e;->r1:Lcom/roblox/client/components/RobloxToolbar;

    invoke-virtual {v0, v2}, Lcom/roblox/client/components/RobloxToolbar;->setVisibility(I)V

    goto :goto_1

    :cond_4
    new-instance v2, Lcom/roblox/client/components/RobloxToolbar$f;

    invoke-direct {v2}, Lcom/roblox/client/components/RobloxToolbar$f;-><init>()V

    invoke-virtual {v0, v2}, Lcom/roblox/client/components/RobloxToolbar;->setThemeColorDelegate(Lcom/roblox/client/components/RobloxToolbar$h;)V

    iget-object v0, p0, Lvh/e;->r1:Lcom/roblox/client/components/RobloxToolbar;

    new-instance v2, Lcom/roblox/client/components/RobloxToolbar$c;

    invoke-direct {v2}, Lcom/roblox/client/components/RobloxToolbar$c;-><init>()V

    invoke-virtual {v0, v2}, Lcom/roblox/client/components/RobloxToolbar;->setIconDelegate(Lcom/roblox/client/components/RobloxToolbar$e;)V

    iget-object v0, p0, Lvh/e;->r1:Lcom/roblox/client/components/RobloxToolbar;

    new-instance v2, Lcom/roblox/client/components/RobloxToolbar$d;

    invoke-direct {v2}, Lcom/roblox/client/components/RobloxToolbar$d;-><init>()V

    invoke-virtual {v0, v2}, Lcom/roblox/client/components/RobloxToolbar;->setThemeColorDelegate(Lcom/roblox/client/components/RobloxToolbar$h;)V

    iget-object v0, p0, Lvh/e;->r1:Lcom/roblox/client/components/RobloxToolbar;

    new-instance v2, Lvh/c;

    invoke-direct {v2, p0}, Lvh/c;-><init>(Lvh/e;)V

    invoke-virtual {v0, v2}, Lcom/roblox/client/components/RobloxToolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    :goto_1
    sget v0, Lsg/m0;->h:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    invoke-super {p0, p1, v0, p3}, Lcom/roblox/client/c;->J0(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object p1, p0, Lvh/e;->s1:Lcom/roblox/client/components/RobloxToolbar;

    invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->getMenu()Landroid/view/Menu;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object p3

    invoke-virtual {p3}, Landroid/app/Activity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object p3

    invoke-virtual {p0, p1, p3}, Lvh/e;->Z3(Landroid/view/Menu;Landroid/view/MenuInflater;)V

    iput-object p2, p0, Lvh/e;->C1:Landroid/view/View;

    iget-boolean p1, p0, Lcom/roblox/client/c;->X0:Z

    if-nez p1, :cond_5

    invoke-virtual {p0, v1}, Lvh/e;->D3(Z)V

    :cond_5
    return-object p2
.end method

.method public M0()V
    .locals 0

    invoke-virtual {p0}, Lvh/e;->P3()V

    invoke-super {p0}, Lcom/roblox/client/c;->M0()V

    return-void
.end method

.method public final O3(Landroid/content/Context;Ljava/lang/String;)Landroid/app/ProgressDialog;
    .locals 1

    new-instance v0, Landroid/app/ProgressDialog;

    invoke-direct {v0, p1}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Landroid/app/Dialog;->setTitle(Ljava/lang/CharSequence;)V

    invoke-virtual {v0, p2}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    const/4 p2, 0x1

    invoke-virtual {v0, p2}, Landroid/app/ProgressDialog;->setIndeterminate(Z)V

    const/4 p2, 0x0

    invoke-virtual {v0, p2}, Landroid/app/Dialog;->setCancelable(Z)V

    invoke-virtual {v0, p2}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    invoke-virtual {v0, p1}, Landroid/app/Dialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    return-object v0
.end method

.method public P0(Z)V
    .locals 1

    if-nez p1, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lvh/e;->B1:Z

    :cond_0
    invoke-super {p0, p1}, Lcom/roblox/client/c;->P0(Z)V

    if-nez p1, :cond_1

    invoke-virtual {p0}, Lvh/e;->b4()V

    :cond_1
    return-void
.end method

.method public final P3()V
    .locals 1

    iget-object v0, p0, Lvh/e;->G1:Landroid/app/ProgressDialog;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lvh/e;->G1:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    :cond_0
    return-void
.end method

.method public Q3(Landroid/view/Menu;Landroid/view/MenuInflater;)V
    .locals 1

    new-instance v0, Lxi/d;

    invoke-direct {v0, p0}, Lxi/d;-><init>(Landroidx/fragment/app/c;)V

    iput-object v0, p0, Lvh/e;->v1:Lxi/d;

    invoke-virtual {v0, p1, p2}, Lxi/d;->d(Landroid/view/Menu;Landroid/view/MenuInflater;)Landroid/view/MenuItem;

    return-void
.end method

.method public final synthetic R3(Landroid/view/View;)V
    .locals 0

    sget-object p1, Lvg/c0$a;->b:Lvg/c0$a;

    invoke-virtual {p0, p1}, Lvh/e;->W3(Lvg/c0$a;)V

    return-void
.end method

.method public final synthetic S3(Landroid/view/View;)V
    .locals 0

    sget-object p1, Lvg/c0$a;->b:Lvg/c0$a;

    invoke-virtual {p0, p1}, Lvh/e;->W3(Lvg/c0$a;)V

    return-void
.end method

.method public final synthetic T3(Landroid/view/View;)V
    .locals 0

    sget-object p1, Lvg/c0$a;->c:Lvg/c0$a;

    invoke-virtual {p0, p1}, Lvh/e;->W3(Lvg/c0$a;)V

    return-void
.end method

.method public final synthetic U3(Landroid/view/View;)V
    .locals 1

    iget-boolean p1, p0, Lvh/e;->A1:Z

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lvh/e;->e3()Z

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object v0

    if-nez p1, :cond_1

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/app/Activity;->onBackPressed()V

    :cond_1
    return-void
.end method

.method public V3(Landroid/app/Activity;Lqi/h;Lqi/h$c;)V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p2, p1, v0, p3}, Lqi/h;->b(Landroid/content/Context;ZLqi/h$c;)V

    return-void
.end method

.method public W3(Lvg/c0$a;)V
    .locals 1

    iget-boolean v0, p0, Lvh/e;->B1:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lvh/e;->B1:Z

    invoke-static {p1}, Lvg/c0;->q(Lvg/c0$a;)V

    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/app/Activity;->onBackPressed()V

    :cond_1
    return-void
.end method

.method public X3(Ljava/lang/String;)V
    .locals 1

    iget-boolean v0, p0, Lvh/e;->z1:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lvh/e;->z1:Z

    invoke-static {p1}, Lvg/c0;->r(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final Y3(Ljava/lang/String;)V
    .locals 3

    const-string v0, ""

    :try_start_0
    new-instance v1, Ljava/net/URI;

    invoke-direct {v1, p1}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/net/URI;->getScheme()Ljava/lang/String;

    move-result-object p1

    const-string v2, "https"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    invoke-virtual {v1}, Ljava/net/URI;->getHost()Ljava/lang/String;

    move-result-object v1

    const-string v2, "www."

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_0
    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    if-eqz p1, :cond_1

    const-string p1, "\ud83d\udd12 "

    goto :goto_1

    :cond_1
    move-object p1, v0

    :goto_1
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :goto_2
    const-string v1, "rbx.web"

    const-string v2, "Failed to parse domain for title"

    invoke-static {v1, v2, p1}, Lgk/q;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_3
    iget-boolean p1, p0, Lvh/e;->p1:Z

    if-eqz p1, :cond_2

    iget-object p1, p0, Lvh/e;->r1:Lcom/roblox/client/components/RobloxToolbar;

    invoke-virtual {p1, v0}, Lcom/roblox/client/components/RobloxToolbar;->setTitle(Ljava/lang/CharSequence;)V

    goto :goto_4

    :cond_2
    iget-object p1, p0, Lvh/e;->s1:Lcom/roblox/client/components/RobloxToolbar;

    invoke-virtual {p1, v0}, Lcom/roblox/client/components/RobloxToolbar;->setTitle(Ljava/lang/CharSequence;)V

    :goto_4
    return-void
.end method

.method public Z3(Landroid/view/Menu;Landroid/view/MenuInflater;)V
    .locals 2

    iput-object p1, p0, Lvh/e;->w1:Landroid/view/Menu;

    iget-boolean v0, p0, Lvh/e;->l1:Z

    if-nez v0, :cond_0

    const/16 v0, 0x22

    invoke-virtual {p0, p1, p2, v0}, Lvh/e;->a4(Landroid/view/Menu;Landroid/view/MenuInflater;I)V

    new-instance v0, Lxi/e;

    iget-object v1, p0, Lvh/e;->g1:Ljava/lang/String;

    invoke-direct {v0, p0, v1}, Lxi/e;-><init>(Lsg/x0;Ljava/lang/String;)V

    invoke-virtual {v0, p1, p2}, Lxi/e;->e(Landroid/view/Menu;Landroid/view/MenuInflater;)Landroid/view/MenuItem;

    invoke-virtual {p0, p1, p2}, Lvh/e;->Q3(Landroid/view/Menu;Landroid/view/MenuInflater;)V

    return-void

    :cond_0
    iget-object v0, p0, Lvh/e;->n1:Lorg/json/JSONObject;

    invoke-virtual {v0}, Lorg/json/JSONObject;->length()I

    move-result v0

    if-lez v0, :cond_1

    const/16 v0, 0x36

    invoke-virtual {p0, p1, p2, v0}, Lvh/e;->a4(Landroid/view/Menu;Landroid/view/MenuInflater;I)V

    :cond_1
    return-void
.end method

.method public a1()V
    .locals 1

    invoke-super {p0}, Lcom/roblox/client/c;->a1()V

    invoke-virtual {p0}, Lvh/e;->b4()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lvh/e;->B1:Z

    return-void
.end method

.method public a4(Landroid/view/Menu;Landroid/view/MenuInflater;I)V
    .locals 3

    iget-object v0, p0, Lvh/e;->n1:Lorg/json/JSONObject;

    const-string v1, "searchType"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Lxi/g;

    invoke-direct {v1, p0, v0}, Lxi/g;-><init>(Lcom/roblox/client/c;Ljava/lang/String;)V

    iput-object v1, p0, Lvh/e;->F1:Lxi/i;

    :cond_0
    iget-object v0, p0, Lvh/e;->F1:Lxi/i;

    if-nez v0, :cond_1

    new-instance v0, Lxi/i;

    invoke-direct {v0, p0}, Lxi/i;-><init>(Lcom/roblox/client/c;)V

    iput-object v0, p0, Lvh/e;->F1:Lxi/i;

    :cond_1
    new-instance v0, Lxi/f;

    invoke-direct {v0, p0}, Lxi/f;-><init>(Landroidx/fragment/app/c;)V

    iput-object v0, p0, Lvh/e;->E1:Lxi/f;

    invoke-virtual {v0, p1}, Lxi/f;->n(Landroid/view/Menu;)V

    iget-object v0, p0, Lvh/e;->E1:Lxi/f;

    iget-boolean v1, p0, Lvh/e;->p1:Z

    if-eqz v1, :cond_2

    iget-object v1, p0, Lvh/e;->r1:Lcom/roblox/client/components/RobloxToolbar;

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lvh/e;->s1:Lcom/roblox/client/components/RobloxToolbar;

    :goto_0
    invoke-virtual {v0, v1}, Lxi/f;->p(Lcom/roblox/client/components/RobloxToolbar;)V

    iget-object v0, p0, Lvh/e;->E1:Lxi/f;

    iget-object v1, p0, Lvh/e;->F1:Lxi/i;

    invoke-virtual {v0, v1}, Lxi/f;->o(Lxi/f$e;)V

    iget-object v0, p0, Lvh/e;->E1:Lxi/f;

    invoke-virtual {v0, p1, p2}, Lxi/f;->k(Landroid/view/Menu;Landroid/view/MenuInflater;)Landroid/view/MenuItem;

    iget-boolean p1, p0, Lvh/e;->p1:Z

    if-eqz p1, :cond_3

    iget-object p1, p0, Lvh/e;->r1:Lcom/roblox/client/components/RobloxToolbar;

    goto :goto_1

    :cond_3
    iget-object p1, p0, Lvh/e;->s1:Lcom/roblox/client/components/RobloxToolbar;

    :goto_1
    invoke-virtual {p0}, Landroidx/fragment/app/c;->x()Landroid/content/Context;

    move-result-object p2

    sget v0, Lsg/m0;->c:I

    invoke-static {p1, p2, v0, p3}, Leh/h;->a(Landroidx/appcompat/widget/Toolbar;Landroid/content/Context;II)V

    return-void
.end method

.method public final b4()V
    .locals 1

    iget-object v0, p0, Lvh/e;->v1:Lxi/d;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lxi/d;->j()V

    :cond_0
    return-void
.end method

.method public c1()V
    .locals 1

    invoke-super {p0}, Lcom/roblox/client/c;->c1()V

    invoke-static {}, Lfv/c;->d()Lfv/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lfv/c;->n(Ljava/lang/Object;)V

    return-void
.end method

.method public final c4(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lvh/e;->E1:Lxi/f;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lvh/e;->F1:Lxi/i;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lxi/i;->f(Ljava/lang/String;)V

    iget-object p1, p0, Lvh/e;->E1:Lxi/f;

    invoke-virtual {p1}, Lxi/f;->r()V

    :cond_0
    return-void
.end method

.method public d1()V
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/c;->v0()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lvh/e;->B1:Z

    if-nez v0, :cond_0

    sget-object v0, Lvg/c0$a;->d:Lvg/c0$a;

    invoke-static {v0}, Lvg/c0;->q(Lvg/c0$a;)V

    :cond_0
    invoke-static {}, Lfv/c;->d()Lfv/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lfv/c;->p(Ljava/lang/Object;)V

    invoke-super {p0}, Lcom/roblox/client/c;->d1()V

    return-void
.end method

.method public final d4(Z)V
    .locals 3

    iget-boolean v0, p0, Lvh/e;->p1:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lvh/e;->A1:Z

    if-nez v0, :cond_5

    iget-boolean v0, p0, Lvh/e;->x1:Z

    if-ne v0, p1, :cond_0

    goto :goto_0

    :cond_0
    iput-boolean p1, p0, Lvh/e;->x1:Z

    iget-object v0, p0, Lvh/e;->r1:Lcom/roblox/client/components/RobloxToolbar;

    if-eqz p1, :cond_1

    new-instance v1, Lvh/d;

    invoke-direct {v1, p0}, Lvh/d;-><init>(Lvh/e;)V

    :cond_1
    invoke-virtual {v0, v1}, Lcom/roblox/client/components/RobloxToolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void

    :cond_2
    iget-boolean v0, p0, Lvh/e;->x1:Z

    if-eq v0, p1, :cond_5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "updateToolbar() canGoBack:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "rbx.web"

    invoke-static {v2, v0}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iput-boolean p1, p0, Lvh/e;->x1:Z

    iget-object v0, p0, Lvh/e;->s1:Lcom/roblox/client/components/RobloxToolbar;

    if-nez p1, :cond_3

    iget-boolean p1, p0, Lvh/e;->h1:Z

    if-eqz p1, :cond_4

    :cond_3
    iget-object v1, p0, Lvh/e;->D1:Landroid/view/View$OnClickListener;

    :cond_4
    invoke-static {v0, v1}, Leh/h;->b(Landroidx/appcompat/widget/Toolbar;Landroid/view/View$OnClickListener;)V

    :cond_5
    :goto_0
    return-void
.end method

.method public e3()Z
    .locals 1

    iget-boolean v0, p0, Lvh/e;->B1:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-super {p0}, Lcom/roblox/client/c;->e3()Z

    move-result v0

    return v0
.end method

.method public onAppLocaleChangeEvent(Lph/a;)V
    .locals 2
    .annotation runtime Lfv/j;
        threadMode = .enum Lorg/greenrobot/eventbus/ThreadMode;->MAIN:Lorg/greenrobot/eventbus/ThreadMode;
    .end annotation

    invoke-virtual {p0}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object p1

    if-eqz p1, :cond_0

    sget v0, Lsg/q0;->K:I

    invoke-virtual {p0, v0}, Landroidx/fragment/app/c;->e0(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lvh/e;->O3(Landroid/content/Context;Ljava/lang/String;)Landroid/app/ProgressDialog;

    move-result-object v0

    iput-object v0, p0, Lvh/e;->G1:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    new-instance v0, Lqi/h;

    invoke-direct {v0}, Lqi/h;-><init>()V

    new-instance v1, Lvh/e$b;

    invoke-direct {v1, p0, p1}, Lvh/e$b;-><init>(Lvh/e;Landroid/app/Activity;)V

    invoke-virtual {p0, p1, v0, v1}, Lvh/e;->V3(Landroid/app/Activity;Lqi/h;Lqi/h$c;)V

    :cond_0
    return-void
.end method

.method public onUnreadNotificationCountEvent(Lph/i;)V
    .locals 1
    .annotation runtime Lfv/j;
        threadMode = .enum Lorg/greenrobot/eventbus/ThreadMode;->MAIN:Lorg/greenrobot/eventbus/ThreadMode;
    .end annotation

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "GWF.onUnreadNotificationCountEvent() "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 p1, 0x0

    throw p1
.end method

.method public t3(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lvh/e;->y1:Z

    iget-boolean v0, p0, Lvh/e;->k1:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lvh/e;->Y3(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p0, p1}, Lvh/e;->c4(Ljava/lang/String;)V

    return-void
.end method

.method public u(Lol/a;)V
    .locals 2

    iget-boolean v0, p0, Lvh/e;->p1:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lvh/e;->r1:Lcom/roblox/client/components/RobloxToolbar;

    invoke-virtual {v0, p1}, Lcom/roblox/client/components/RobloxToolbar;->u(Lol/a;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lvh/e;->s1:Lcom/roblox/client/components/RobloxToolbar;

    invoke-virtual {v0, p1}, Lcom/roblox/client/components/RobloxToolbar;->u(Lol/a;)V

    iget-object v0, p0, Lvh/e;->r1:Lcom/roblox/client/components/RobloxToolbar;

    invoke-virtual {v0, p1}, Lcom/roblox/client/components/RobloxToolbar;->u(Lol/a;)V

    :goto_0
    iget-boolean v0, p0, Lvh/e;->m1:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lvh/e;->t1:Landroid/widget/ImageView;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lvh/e;->u1:Lcom/roblox/client/components/RobloxToolbar$c;

    invoke-virtual {v1, p1}, Lcom/roblox/client/components/RobloxToolbar$c;->a(Lol/a;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    :cond_1
    invoke-virtual {p0}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-boolean v1, p0, Lvh/e;->p1:Z

    if-eqz v1, :cond_2

    iget-object v1, p0, Lvh/e;->r1:Lcom/roblox/client/components/RobloxToolbar;

    :goto_1
    invoke-virtual {v1}, Landroidx/appcompat/widget/Toolbar;->getMenu()Landroid/view/Menu;

    move-result-object v1

    goto :goto_2

    :cond_2
    iget-object v1, p0, Lvh/e;->s1:Lcom/roblox/client/components/RobloxToolbar;

    goto :goto_1

    :goto_2
    invoke-interface {v1}, Landroid/view/Menu;->clear()V

    invoke-virtual {v0}, Landroid/app/Activity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    invoke-virtual {p0, v1, v0}, Lvh/e;->Z3(Landroid/view/Menu;Landroid/view/MenuInflater;)V

    :cond_3
    invoke-super {p0, p1}, Lcom/roblox/client/c;->u(Lol/a;)V

    return-void
.end method

.method public u3()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lvh/e;->y1:Z

    return-void
.end method

.method public v3(Ljava/lang/String;)V
    .locals 1

    iget-boolean v0, p0, Lvh/e;->y1:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroidx/fragment/app/c;->x0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lvh/e;->X3(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public x3(Landroid/webkit/WebView;I)V
    .locals 0

    invoke-super {p0, p1, p2}, Lcom/roblox/client/c;->x3(Landroid/webkit/WebView;I)V

    invoke-virtual {p1}, Landroid/webkit/WebView;->canGoBack()Z

    move-result p1

    invoke-virtual {p0, p1}, Lvh/e;->d4(Z)V

    return-void
.end method

.method public z0(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, Lsg/x0;->z0(Landroid/os/Bundle;)V

    iget-boolean p1, p0, Lvh/e;->k1:Z

    if-nez p1, :cond_5

    iget-object p1, p0, Lvh/e;->j1:Ljava/lang/String;

    if-eqz p1, :cond_1

    iget-boolean v0, p0, Lvh/e;->p1:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lvh/e;->r1:Lcom/roblox/client/components/RobloxToolbar;

    invoke-virtual {v0, p1}, Lcom/roblox/client/components/RobloxToolbar;->setTitle(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lvh/e;->s1:Lcom/roblox/client/components/RobloxToolbar;

    invoke-virtual {v0, p1}, Lcom/roblox/client/components/RobloxToolbar;->setTitle(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_1
    iget p1, p0, Lvh/e;->i1:I

    const/4 v0, -0x1

    if-ne p1, v0, :cond_3

    iget-boolean p1, p0, Lvh/e;->p1:Z

    if-eqz p1, :cond_2

    iget-object p1, p0, Lvh/e;->r1:Lcom/roblox/client/components/RobloxToolbar;

    sget v0, Lsg/q0;->x:I

    invoke-virtual {p1, v0}, Lcom/roblox/client/components/RobloxToolbar;->setTitle(I)V

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lvh/e;->s1:Lcom/roblox/client/components/RobloxToolbar;

    sget v0, Lsg/q0;->x:I

    invoke-virtual {p1, v0}, Lcom/roblox/client/components/RobloxToolbar;->setTitle(I)V

    goto :goto_0

    :cond_3
    iget-boolean v0, p0, Lvh/e;->p1:Z

    if-eqz v0, :cond_4

    iget-object v0, p0, Lvh/e;->r1:Lcom/roblox/client/components/RobloxToolbar;

    invoke-virtual {v0, p1}, Lcom/roblox/client/components/RobloxToolbar;->setTitle(I)V

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lvh/e;->s1:Lcom/roblox/client/components/RobloxToolbar;

    invoke-virtual {v0, p1}, Lcom/roblox/client/components/RobloxToolbar;->setTitle(I)V

    :cond_5
    :goto_0
    iget-object p1, p0, Lvh/e;->s1:Lcom/roblox/client/components/RobloxToolbar;

    iget-boolean v0, p0, Lvh/e;->h1:Z

    if-eqz v0, :cond_6

    iget-object v0, p0, Lvh/e;->D1:Landroid/view/View$OnClickListener;

    goto :goto_1

    :cond_6
    const/4 v0, 0x0

    :goto_1
    invoke-static {p1, v0}, Leh/h;->b(Landroidx/appcompat/widget/Toolbar;Landroid/view/View$OnClickListener;)V

    return-void
.end method
