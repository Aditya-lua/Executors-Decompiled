.class public Ldi/d;
.super Lcom/roblox/client/c;
.source "SourceFile"


# instance fields
.field public A1:Lfj/f;

.field public B1:Lfj/i;

.field public C1:Landroid/app/ProgressDialog;

.field public g1:Ljava/lang/String;

.field public h1:Z

.field public i1:I

.field public j1:Ljava/lang/String;

.field public k1:Z

.field public l1:Z

.field public m1:Z

.field public n1:Lorg/json/JSONObject;

.field public o1:Z

.field public p1:Lcom/roblox/client/components/RobloxToolbar;

.field public q1:Landroid/widget/ImageView;

.field public r1:Lcom/roblox/client/components/RobloxToolbar$c;

.field public s1:Lfj/d;

.field public t1:Landroid/view/Menu;

.field public u1:Z

.field public v1:Z

.field public w1:Z

.field public x1:Z

.field public y1:Z

.field public z1:Landroid/view/View;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Lcom/roblox/client/c;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Ldi/d;->g1:Ljava/lang/String;

    const/4 v1, 0x0

    iput-boolean v1, p0, Ldi/d;->h1:Z

    const/4 v2, -0x1

    iput v2, p0, Ldi/d;->i1:I

    iput-boolean v1, p0, Ldi/d;->l1:Z

    iput-boolean v1, p0, Ldi/d;->m1:Z

    iput-boolean v1, p0, Ldi/d;->u1:Z

    iput-boolean v1, p0, Ldi/d;->v1:Z

    iput-boolean v1, p0, Ldi/d;->w1:Z

    const/4 v2, 0x1

    iput-boolean v2, p0, Ldi/d;->x1:Z

    iput-boolean v1, p0, Ldi/d;->y1:Z

    iput-object v0, p0, Ldi/d;->z1:Landroid/view/View;

    return-void
.end method

.method public static synthetic J3(Ldi/d;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0, p1}, Ldi/d;->S3(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic K3(Ldi/d;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0, p1}, Ldi/d;->R3(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic L3(Ldi/d;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0, p1}, Ldi/d;->Q3(Landroid/view/View;)V

    return-void
.end method

.method public static bridge synthetic M3(Ldi/d;)V
    .locals 0

    invoke-virtual {p0}, Ldi/d;->O3()V

    return-void
.end method


# virtual methods
.method public D3(Z)V
    .locals 1

    invoke-super {p0, p1}, Lcom/roblox/client/c;->D3(Z)V

    iget-object v0, p0, Ldi/d;->z1:Landroid/view/View;

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
    .locals 4

    invoke-super {p0, p1}, Lcom/roblox/client/c;->F0(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Lf4/q;->t()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_1

    const-string v1, "TITLE_ID"

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v1

    iput v1, p0, Ldi/d;->i1:I

    const-string v1, "TITLE_STRING"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Ldi/d;->j1:Ljava/lang/String;

    const-string v1, "REPORTING_TAB_NAME"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Ldi/d;->g1:Ljava/lang/String;

    const-string v1, "HAS_PARENT"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Ldi/d;->h1:Z

    const-string v1, "HIDE_ACCESSORY_BUTTONS"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Ldi/d;->l1:Z

    const-string v1, "SHOW_DOMAIN_AS_TITLE"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Ldi/d;->k1:Z

    const-string v1, "CLOSE_FRAGMENT_ON_RESTORED"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Ldi/d;->o1:Z

    const-string v1, "hideNativeHeader"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    iput-boolean v1, p0, Ldi/d;->m1:Z

    const-string v1, "BACK_NAVIGATION_DISABLED"

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    iput-boolean v1, p0, Ldi/d;->x1:Z

    if-eqz v1, :cond_0

    iput-boolean v2, p0, Ldi/d;->u1:Z

    invoke-virtual {p0, v3}, Lcom/roblox/client/c;->A3(Z)V

    :cond_0
    const-string v1, "SEARCH_PARAMS"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    iput-object v1, p0, Ldi/d;->n1:Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_1
    if-eqz p1, :cond_2

    iget-boolean p1, p0, Ldi/d;->o1:Z

    if-eqz p1, :cond_2

    const-string p1, "rbx.web"

    const-string v0, "onCreate: ... Closing this web fragment on restored."

    invoke-static {p1, v0}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lf4/q;->p()Lf4/v;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lf4/v;->l1()Lf4/k0;

    move-result-object p1

    invoke-virtual {p1}, Lf4/k0;->r()Lf4/t0;

    move-result-object p1

    invoke-virtual {p1, p0}, Lf4/t0;->m(Lf4/q;)Lf4/t0;

    move-result-object p1

    invoke-virtual {p1}, Lf4/t0;->h()I

    :cond_2
    iget-object p1, p0, Ldi/d;->n1:Lorg/json/JSONObject;

    if-nez p1, :cond_3

    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    iput-object p1, p0, Ldi/d;->n1:Lorg/json/JSONObject;

    :cond_3
    return-void
.end method

.method public H3(Lbm/a;)V
    .locals 1

    invoke-super {p0, p1}, Lcom/roblox/client/c;->H3(Lbm/a;)V

    iget-object p1, p1, Lbm/a;->b:Ljava/lang/String;

    if-eqz p1, :cond_0

    iget-object v0, p0, Ldi/d;->p1:Lcom/roblox/client/components/RobloxToolbar;

    invoke-virtual {v0, p1}, Lcom/roblox/client/components/RobloxToolbar;->setTitle(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public I3()Leh/v0$b;
    .locals 1

    sget-object v0, Leh/v0$b;->l:Leh/v0$b;

    return-object v0
.end method

.method public J0(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    sget v0, Lbh/n0;->E:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/LinearLayout;

    new-instance v0, Lcom/roblox/client/components/RobloxToolbar$c;

    invoke-direct {v0}, Lcom/roblox/client/components/RobloxToolbar$c;-><init>()V

    iput-object v0, p0, Ldi/d;->r1:Lcom/roblox/client/components/RobloxToolbar$c;

    sget v0, Lbh/m0;->o0:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roblox/client/components/RobloxToolbar;

    iput-object v0, p0, Ldi/d;->p1:Lcom/roblox/client/components/RobloxToolbar;

    iget-boolean v2, p0, Ldi/d;->m1:Z

    if-eqz v2, :cond_0

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Lcom/roblox/client/components/RobloxToolbar;->setVisibility(I)V

    goto :goto_0

    :cond_0
    new-instance v2, Ldi/a;

    invoke-direct {v2, p0}, Ldi/a;-><init>(Ldi/d;)V

    invoke-virtual {v0, v2}, Lcom/roblox/client/components/RobloxToolbar;->h0(Landroid/view/View$OnClickListener;)V

    iget-object v0, p0, Ldi/d;->p1:Lcom/roblox/client/components/RobloxToolbar;

    const v2, 0x800013

    invoke-virtual {v0, v2}, Lcom/roblox/client/components/RobloxToolbar;->setCloseButtonGravity(I)V

    :goto_0
    sget v0, Lbh/m0;->h:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    invoke-super {p0, p1, v0, p3}, Lcom/roblox/client/c;->J0(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-boolean p1, p0, Ldi/d;->m1:Z

    if-eqz p1, :cond_1

    sget p1, Lbh/m0;->D:I

    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Ldi/d;->q1:Landroid/widget/ImageView;

    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object p1, p0, Ldi/d;->q1:Landroid/widget/ImageView;

    iget-object p3, p0, Ldi/d;->r1:Lcom/roblox/client/components/RobloxToolbar$c;

    invoke-static {}, Lnk/c;->c()Lnk/c;

    move-result-object v0

    invoke-virtual {v0}, Lnk/c;->g()Lcm/a;

    move-result-object v0

    invoke-virtual {p3, v0}, Lcom/roblox/client/components/RobloxToolbar$c;->a(Lcm/a;)I

    move-result p3

    invoke-virtual {p1, p3}, Landroid/widget/ImageView;->setImageResource(I)V

    iget-object p1, p0, Ldi/d;->q1:Landroid/widget/ImageView;

    new-instance p3, Ldi/b;

    invoke-direct {p3, p0}, Ldi/b;-><init>(Ldi/d;)V

    invoke-virtual {p1, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_1
    iget-object p1, p0, Ldi/d;->p1:Lcom/roblox/client/components/RobloxToolbar;

    invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->getMenu()Landroid/view/Menu;

    move-result-object p1

    invoke-virtual {p0}, Lf4/q;->H1()Lf4/v;

    move-result-object p3

    invoke-virtual {p3}, Landroid/app/Activity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object p3

    invoke-virtual {p0, p1, p3}, Ldi/d;->X3(Landroid/view/Menu;Landroid/view/MenuInflater;)V

    iput-object p2, p0, Ldi/d;->z1:Landroid/view/View;

    iget-boolean p1, p0, Lcom/roblox/client/c;->X0:Z

    if-nez p1, :cond_2

    invoke-virtual {p0, v1}, Ldi/d;->D3(Z)V

    :cond_2
    return-object p2
.end method

.method public M0()V
    .locals 0

    invoke-virtual {p0}, Ldi/d;->O3()V

    invoke-super {p0}, Lcom/roblox/client/c;->M0()V

    return-void
.end method

.method public final N3(Landroid/content/Context;Ljava/lang/String;)Landroid/app/ProgressDialog;
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

.method public final O3()V
    .locals 1

    iget-object v0, p0, Ldi/d;->C1:Landroid/app/ProgressDialog;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ldi/d;->C1:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    :cond_0
    return-void
.end method

.method public P0(Z)V
    .locals 1

    if-nez p1, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Ldi/d;->y1:Z

    :cond_0
    invoke-super {p0, p1}, Lcom/roblox/client/c;->P0(Z)V

    if-nez p1, :cond_1

    invoke-virtual {p0}, Ldi/d;->Z3()V

    :cond_1
    return-void
.end method

.method public P3(Landroid/view/Menu;Landroid/view/MenuInflater;)V
    .locals 1

    new-instance v0, Lfj/d;

    invoke-direct {v0, p0}, Lfj/d;-><init>(Lf4/q;)V

    iput-object v0, p0, Ldi/d;->s1:Lfj/d;

    invoke-virtual {v0, p1, p2}, Lfj/d;->d(Landroid/view/Menu;Landroid/view/MenuInflater;)Landroid/view/MenuItem;

    return-void
.end method

.method public final synthetic Q3(Landroid/view/View;)V
    .locals 0

    sget-object p1, Leh/v0$a;->b:Leh/v0$a;

    invoke-virtual {p0, p1}, Ldi/d;->U3(Leh/v0$a;)V

    return-void
.end method

.method public final synthetic R3(Landroid/view/View;)V
    .locals 0

    sget-object p1, Leh/v0$a;->b:Leh/v0$a;

    invoke-virtual {p0, p1}, Ldi/d;->U3(Leh/v0$a;)V

    return-void
.end method

.method public final synthetic S3(Landroid/view/View;)V
    .locals 1

    iget-boolean p1, p0, Ldi/d;->x1:Z

    if-nez p1, :cond_0

    invoke-virtual {p0}, Ldi/d;->e3()Z

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0}, Lf4/q;->p()Lf4/v;

    move-result-object v0

    if-nez p1, :cond_1

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/app/Activity;->onBackPressed()V

    :cond_1
    return-void
.end method

.method public T3(Landroid/app/Activity;Lyi/h;Lyi/h$c;)V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p2, p1, v0, p3}, Lyi/h;->b(Landroid/content/Context;ZLyi/h$c;)V

    return-void
.end method

.method public U3(Leh/v0$a;)V
    .locals 1

    iget-boolean v0, p0, Ldi/d;->y1:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Ldi/d;->y1:Z

    invoke-static {p1}, Leh/v0;->q(Leh/v0$a;)V

    :cond_0
    invoke-virtual {p0}, Lf4/q;->p()Lf4/v;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/app/Activity;->onBackPressed()V

    :cond_1
    return-void
.end method

.method public V3(Ljava/lang/String;)V
    .locals 1

    iget-boolean v0, p0, Ldi/d;->w1:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Ldi/d;->w1:Z

    invoke-static {p1}, Leh/v0;->r(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final W3(Ljava/lang/String;)V
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

    invoke-static {v1, v2, p1}, Lok/q;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_3
    iget-object p1, p0, Ldi/d;->p1:Lcom/roblox/client/components/RobloxToolbar;

    invoke-virtual {p1, v0}, Lcom/roblox/client/components/RobloxToolbar;->setTitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public X3(Landroid/view/Menu;Landroid/view/MenuInflater;)V
    .locals 2

    iput-object p1, p0, Ldi/d;->t1:Landroid/view/Menu;

    iget-boolean v0, p0, Ldi/d;->l1:Z

    if-nez v0, :cond_0

    const/16 v0, 0x22

    invoke-virtual {p0, p1, p2, v0}, Ldi/d;->Y3(Landroid/view/Menu;Landroid/view/MenuInflater;I)V

    new-instance v0, Lfj/e;

    iget-object v1, p0, Ldi/d;->g1:Ljava/lang/String;

    invoke-direct {v0, p0, v1}, Lfj/e;-><init>(Lbh/x0;Ljava/lang/String;)V

    invoke-virtual {v0, p1, p2}, Lfj/e;->e(Landroid/view/Menu;Landroid/view/MenuInflater;)Landroid/view/MenuItem;

    invoke-virtual {p0, p1, p2}, Ldi/d;->P3(Landroid/view/Menu;Landroid/view/MenuInflater;)V

    return-void

    :cond_0
    iget-object v0, p0, Ldi/d;->n1:Lorg/json/JSONObject;

    invoke-virtual {v0}, Lorg/json/JSONObject;->length()I

    move-result v0

    if-lez v0, :cond_1

    const/16 v0, 0x36

    invoke-virtual {p0, p1, p2, v0}, Ldi/d;->Y3(Landroid/view/Menu;Landroid/view/MenuInflater;I)V

    :cond_1
    return-void
.end method

.method public Y3(Landroid/view/Menu;Landroid/view/MenuInflater;I)V
    .locals 3

    iget-object v0, p0, Ldi/d;->n1:Lorg/json/JSONObject;

    const-string v1, "searchType"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Lfj/g;

    invoke-direct {v1, p0, v0}, Lfj/g;-><init>(Lcom/roblox/client/c;Ljava/lang/String;)V

    iput-object v1, p0, Ldi/d;->B1:Lfj/i;

    :cond_0
    iget-object v0, p0, Ldi/d;->B1:Lfj/i;

    if-nez v0, :cond_1

    new-instance v0, Lfj/i;

    invoke-direct {v0, p0}, Lfj/i;-><init>(Lcom/roblox/client/c;)V

    iput-object v0, p0, Ldi/d;->B1:Lfj/i;

    :cond_1
    new-instance v0, Lfj/f;

    invoke-direct {v0, p0}, Lfj/f;-><init>(Lf4/q;)V

    iput-object v0, p0, Ldi/d;->A1:Lfj/f;

    invoke-virtual {v0, p1}, Lfj/f;->n(Landroid/view/Menu;)V

    iget-object v0, p0, Ldi/d;->A1:Lfj/f;

    iget-object v1, p0, Ldi/d;->p1:Lcom/roblox/client/components/RobloxToolbar;

    invoke-virtual {v0, v1}, Lfj/f;->p(Lcom/roblox/client/components/RobloxToolbar;)V

    iget-object v0, p0, Ldi/d;->A1:Lfj/f;

    iget-object v1, p0, Ldi/d;->B1:Lfj/i;

    invoke-virtual {v0, v1}, Lfj/f;->o(Lfj/f$e;)V

    iget-object v0, p0, Ldi/d;->A1:Lfj/f;

    invoke-virtual {v0, p1, p2}, Lfj/f;->k(Landroid/view/Menu;Landroid/view/MenuInflater;)Landroid/view/MenuItem;

    iget-object p1, p0, Ldi/d;->p1:Lcom/roblox/client/components/RobloxToolbar;

    invoke-virtual {p0}, Lf4/q;->v()Landroid/content/Context;

    move-result-object p2

    sget v0, Lbh/m0;->c:I

    invoke-static {p1, p2, v0, p3}, Lnh/h;->a(Landroidx/appcompat/widget/Toolbar;Landroid/content/Context;II)V

    return-void
.end method

.method public final Z3()V
    .locals 1

    iget-object v0, p0, Ldi/d;->s1:Lfj/d;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lfj/d;->j()V

    :cond_0
    return-void
.end method

.method public a1()V
    .locals 1

    invoke-super {p0}, Lcom/roblox/client/c;->a1()V

    invoke-virtual {p0}, Ldi/d;->Z3()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Ldi/d;->y1:Z

    return-void
.end method

.method public final a4(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Ldi/d;->A1:Lfj/f;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ldi/d;->B1:Lfj/i;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lfj/i;->f(Ljava/lang/String;)V

    iget-object p1, p0, Ldi/d;->A1:Lfj/f;

    invoke-virtual {p1}, Lfj/f;->r()V

    :cond_0
    return-void
.end method

.method public final b4(Z)V
    .locals 1

    iget-boolean v0, p0, Ldi/d;->x1:Z

    if-nez v0, :cond_2

    iget-boolean v0, p0, Ldi/d;->u1:Z

    if-ne v0, p1, :cond_0

    goto :goto_1

    :cond_0
    iput-boolean p1, p0, Ldi/d;->u1:Z

    iget-object v0, p0, Ldi/d;->p1:Lcom/roblox/client/components/RobloxToolbar;

    if-eqz p1, :cond_1

    new-instance p1, Ldi/c;

    invoke-direct {p1, p0}, Ldi/c;-><init>(Ldi/d;)V

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {v0, p1}, Lcom/roblox/client/components/RobloxToolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_2
    :goto_1
    return-void
.end method

.method public c1()V
    .locals 1

    invoke-super {p0}, Lcom/roblox/client/c;->c1()V

    invoke-static {}, Lmw/c;->d()Lmw/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lmw/c;->n(Ljava/lang/Object;)V

    return-void
.end method

.method public d1()V
    .locals 1

    invoke-virtual {p0}, Lf4/q;->v0()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Ldi/d;->y1:Z

    if-nez v0, :cond_0

    sget-object v0, Leh/v0$a;->d:Leh/v0$a;

    invoke-static {v0}, Leh/v0;->q(Leh/v0$a;)V

    :cond_0
    invoke-static {}, Lmw/c;->d()Lmw/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lmw/c;->p(Ljava/lang/Object;)V

    invoke-super {p0}, Lcom/roblox/client/c;->d1()V

    return-void
.end method

.method public e3()Z
    .locals 1

    iget-boolean v0, p0, Ldi/d;->y1:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-super {p0}, Lcom/roblox/client/c;->e3()Z

    move-result v0

    return v0
.end method

.method public g0(Lcm/a;)V
    .locals 2

    iget-object v0, p0, Ldi/d;->p1:Lcom/roblox/client/components/RobloxToolbar;

    invoke-virtual {v0, p1}, Lcom/roblox/client/components/RobloxToolbar;->g0(Lcm/a;)V

    iget-boolean v0, p0, Ldi/d;->m1:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ldi/d;->q1:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    iget-object v1, p0, Ldi/d;->r1:Lcom/roblox/client/components/RobloxToolbar$c;

    invoke-virtual {v1, p1}, Lcom/roblox/client/components/RobloxToolbar$c;->a(Lcm/a;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    :cond_0
    invoke-virtual {p0}, Lf4/q;->p()Lf4/v;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Ldi/d;->p1:Lcom/roblox/client/components/RobloxToolbar;

    invoke-virtual {v1}, Landroidx/appcompat/widget/Toolbar;->getMenu()Landroid/view/Menu;

    move-result-object v1

    invoke-interface {v1}, Landroid/view/Menu;->clear()V

    invoke-virtual {v0}, Landroid/app/Activity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    invoke-virtual {p0, v1, v0}, Ldi/d;->X3(Landroid/view/Menu;Landroid/view/MenuInflater;)V

    :cond_1
    invoke-super {p0, p1}, Lcom/roblox/client/c;->g0(Lcm/a;)V

    return-void
.end method

.method public onAppLocaleChangeEvent(Lyh/a;)V
    .locals 2
    .annotation runtime Lmw/j;
        threadMode = .enum Lorg/greenrobot/eventbus/ThreadMode;->MAIN:Lorg/greenrobot/eventbus/ThreadMode;
    .end annotation

    invoke-virtual {p0}, Lf4/q;->p()Lf4/v;

    move-result-object p1

    if-eqz p1, :cond_0

    sget v0, Lbh/q0;->K:I

    invoke-virtual {p0, v0}, Lf4/q;->d0(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Ldi/d;->N3(Landroid/content/Context;Ljava/lang/String;)Landroid/app/ProgressDialog;

    move-result-object v0

    iput-object v0, p0, Ldi/d;->C1:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    new-instance v0, Lyi/h;

    invoke-direct {v0}, Lyi/h;-><init>()V

    new-instance v1, Ldi/d$a;

    invoke-direct {v1, p0, p1}, Ldi/d$a;-><init>(Ldi/d;Landroid/app/Activity;)V

    invoke-virtual {p0, p1, v0, v1}, Ldi/d;->T3(Landroid/app/Activity;Lyi/h;Lyi/h$c;)V

    :cond_0
    return-void
.end method

.method public onUnreadNotificationCountEvent(Lyh/i;)V
    .locals 1
    .annotation runtime Lmw/j;
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

    iput-boolean v0, p0, Ldi/d;->v1:Z

    iget-boolean v0, p0, Ldi/d;->k1:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Ldi/d;->W3(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p0, p1}, Ldi/d;->a4(Ljava/lang/String;)V

    return-void
.end method

.method public u3()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Ldi/d;->v1:Z

    return-void
.end method

.method public v3(Ljava/lang/String;)V
    .locals 1

    iget-boolean v0, p0, Ldi/d;->v1:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lf4/q;->x0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Ldi/d;->V3(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public x3(Landroid/webkit/WebView;I)V
    .locals 0

    invoke-super {p0, p1, p2}, Lcom/roblox/client/c;->x3(Landroid/webkit/WebView;I)V

    invoke-virtual {p1}, Landroid/webkit/WebView;->canGoBack()Z

    move-result p1

    invoke-virtual {p0, p1}, Ldi/d;->b4(Z)V

    return-void
.end method

.method public z0(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, Lbh/x0;->z0(Landroid/os/Bundle;)V

    iget-boolean p1, p0, Ldi/d;->k1:Z

    if-nez p1, :cond_2

    iget-object p1, p0, Ldi/d;->j1:Ljava/lang/String;

    if-eqz p1, :cond_0

    iget-object v0, p0, Ldi/d;->p1:Lcom/roblox/client/components/RobloxToolbar;

    invoke-virtual {v0, p1}, Lcom/roblox/client/components/RobloxToolbar;->setTitle(Ljava/lang/CharSequence;)V

    return-void

    :cond_0
    iget p1, p0, Ldi/d;->i1:I

    const/4 v0, -0x1

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Ldi/d;->p1:Lcom/roblox/client/components/RobloxToolbar;

    sget v0, Lbh/q0;->x:I

    invoke-virtual {p1, v0}, Lcom/roblox/client/components/RobloxToolbar;->setTitle(I)V

    return-void

    :cond_1
    iget-object v0, p0, Ldi/d;->p1:Lcom/roblox/client/components/RobloxToolbar;

    invoke-virtual {v0, p1}, Lcom/roblox/client/components/RobloxToolbar;->setTitle(I)V

    :cond_2
    return-void
.end method
