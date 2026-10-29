.class public Lcom/roblox/client/IncomingCallActivity;
.super Lj/b;
.source "SourceFile"

# interfaces
.implements Lxl/g$a;


# instance fields
.field public E:J

.field public F:Ljava/lang/String;

.field public G:Landroid/widget/ImageView;

.field public H:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lj/b;-><init>()V

    return-void
.end method

.method public static synthetic E1(Lcom/roblox/client/IncomingCallActivity;Landroid/content/Intent;ZLandroid/view/View;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lcom/roblox/client/IncomingCallActivity;->J1(Landroid/content/Intent;ZLandroid/view/View;)V

    return-void
.end method

.method public static synthetic F1(ILandroid/view/View;Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;
    .locals 4

    invoke-static {}, Landroidx/core/view/WindowInsetsCompat$Type;->systemBars()I

    move-result v0

    invoke-virtual {p2, v0}, Landroidx/core/view/WindowInsetsCompat;->getInsets(I)Landroidx/core/graphics/Insets;

    move-result-object v0

    iget v0, v0, Landroidx/core/graphics/Insets;->bottom:I

    invoke-virtual {p1}, Landroid/view/View;->getPaddingLeft()I

    move-result v1

    invoke-virtual {p1}, Landroid/view/View;->getPaddingTop()I

    move-result v2

    invoke-virtual {p1}, Landroid/view/View;->getPaddingRight()I

    move-result v3

    add-int/2addr p0, v0

    invoke-virtual {p1, v1, v2, v3, p0}, Landroid/view/View;->setPadding(IIII)V

    return-object p2
.end method

.method public static synthetic G1(Lcom/roblox/client/IncomingCallActivity;Landroid/content/Intent;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/roblox/client/IncomingCallActivity;->I1(Landroid/content/Intent;Landroid/view/View;)V

    return-void
.end method

.method public static H1(Landroid/content/Context;Landroid/content/Intent;Landroid/content/Intent;JLjava/lang/String;Z)Landroid/content/Intent;
    .locals 2

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/roblox/client/IncomingCallActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string p0, "EXTRA_ACCEPT_INTENT"

    invoke-virtual {v0, p0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    move-result-object p0

    const-string p1, "EXTRA_IS_ACCEPT_ENABLED"

    invoke-virtual {p0, p1, p6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    move-result-object p0

    const-string p1, "EXTRA_DECLINE_INTENT"

    invoke-virtual {p0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    move-result-object p0

    const-string p1, "EXTRA_CALLER_ID"

    invoke-virtual {p0, p1, p3, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    move-result-object p0

    const-string p1, "EXTRA_CALLER_COMBINED_NAME"

    invoke-virtual {p0, p1, p5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public C(Ljava/lang/String;Z)V
    .locals 0

    return-void
.end method

.method public final synthetic I1(Landroid/content/Intent;Landroid/view/View;)V
    .locals 0

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public final synthetic J1(Landroid/content/Intent;ZLandroid/view/View;)V
    .locals 0

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    const-string p1, "keyguard"

    invoke-virtual {p0, p1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/KeyguardManager;

    const/4 p2, 0x0

    invoke-virtual {p1, p0, p2}, Landroid/app/KeyguardManager;->requestDismissKeyguard(Landroid/app/Activity;Landroid/app/KeyguardManager$KeyguardDismissCallback;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    :cond_1
    :goto_0
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public final K1(Landroid/widget/ImageView;Ljava/lang/String;)V
    .locals 2

    invoke-static {p0}, Lk6/d0;->a(Landroid/content/Context;)Lk6/s;

    move-result-object v0

    new-instance v1, Lx6/g$a;

    invoke-direct {v1, p0}, Lx6/g$a;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, p2}, Lx6/g$a;->c(Ljava/lang/Object;)Lx6/g$a;

    move-result-object p2

    new-instance v1, Lb7/b;

    invoke-direct {v1, p1}, Lb7/b;-><init>(Landroid/widget/ImageView;)V

    invoke-virtual {p2, v1}, Lx6/g$a;->v(Lb7/c;)Lx6/g$a;

    move-result-object p1

    invoke-virtual {p1}, Lx6/g$a;->b()Lx6/g;

    move-result-object p1

    invoke-interface {v0, p1}, Lk6/s;->c(Lx6/g;)Lx6/d;

    return-void
.end method

.method public V(Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public m0(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public onAvatarHeadshotsRetrievedEvent(Lph/b;)V
    .locals 2
    .annotation runtime Lfv/j;
        threadMode = .enum Lorg/greenrobot/eventbus/ThreadMode;->MAIN:Lorg/greenrobot/eventbus/ThreadMode;
    .end annotation

    invoke-virtual {p1}, Lph/b;->a()Ljava/util/ArrayList;

    move-result-object p1

    iget-wide v0, p0, Lcom/roblox/client/IncomingCallActivity;->E:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {}, Ldh/b;->b()Ldh/b;

    move-result-object p1

    iget-wide v0, p0, Lcom/roblox/client/IncomingCallActivity;->E:J

    invoke-virtual {p1, v0, v1}, Ldh/b;->d(J)Ldh/a;

    move-result-object p1

    iget-object v0, p0, Lcom/roblox/client/IncomingCallActivity;->G:Landroid/widget/ImageView;

    invoke-virtual {p1}, Ldh/a;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/roblox/client/IncomingCallActivity;->K1(Landroid/widget/ImageView;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 7

    invoke-super {p0, p1}, Le4/q;->onCreate(Landroid/os/Bundle;)V

    const/4 p1, 0x0

    invoke-static {p1, p1}, Le/u0;->a(II)Le/u0;

    move-result-object v0

    invoke-static {p1, p1}, Le/u0;->a(II)Le/u0;

    move-result-object p1

    invoke-static {p0, v0, p1}, Le/x;->b(Le/p;Le/u0;Le/u0;)V

    sget p1, Lsg/n0;->c:I

    invoke-virtual {p0, p1}, Lj/b;->setContentView(I)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->t0()Z

    move-result p1

    if-eqz p1, :cond_0

    sget p1, Lsg/m0;->L:I

    invoke-virtual {p0, p1}, Lj/b;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getPaddingBottom()I

    move-result v0

    new-instance v1, Lsg/a0;

    invoke-direct {v1, v0}, Lsg/a0;-><init>(I)V

    invoke-static {p1, v1}, Landroidx/core/view/o0;->A0(Landroid/view/View;Landroidx/core/view/y;)V

    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "EXTRA_CALLER_ID"

    const-wide/16 v1, 0x0

    invoke-virtual {p1, v0, v1, v2}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v3

    iput-wide v3, p0, Lcom/roblox/client/IncomingCallActivity;->E:J

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "EXTRA_CALLER_COMBINED_NAME"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/roblox/client/IncomingCallActivity;->F:Ljava/lang/String;

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "EXTRA_ACCEPT_INTENT"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroid/content/Intent;

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v3, "EXTRA_IS_ACCEPT_ENABLED"

    const/4 v4, 0x1

    invoke-virtual {v0, v3, v4}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v3

    const-string v5, "EXTRA_DECLINE_INTENT"

    invoke-virtual {v3, v5}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v3

    check-cast v3, Landroid/content/Intent;

    sget v5, Lsg/m0;->J:I

    invoke-virtual {p0, v5}, Lj/b;->findViewById(I)Landroid/view/View;

    move-result-object v5

    new-instance v6, Lsg/b0;

    invoke-direct {v6, p0, v3}, Lsg/b0;-><init>(Lcom/roblox/client/IncomingCallActivity;Landroid/content/Intent;)V

    invoke-virtual {v5, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    sget v3, Lsg/m0;->I:I

    invoke-virtual {p0, v3}, Lj/b;->findViewById(I)Landroid/view/View;

    move-result-object v3

    new-instance v5, Lsg/c0;

    invoke-direct {v5, p0, p1, v0}, Lsg/c0;-><init>(Lcom/roblox/client/IncomingCallActivity;Landroid/content/Intent;Z)V

    invoke-virtual {v3, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    sget p1, Lsg/m0;->K:I

    invoke-virtual {p0, p1}, Lj/b;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/roblox/client/IncomingCallActivity;->G:Landroid/widget/ImageView;

    invoke-virtual {p1, v4}, Landroid/view/View;->setClipToOutline(Z)V

    sget p1, Lsg/m0;->M:I

    invoke-virtual {p0, p1}, Lj/b;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/roblox/client/IncomingCallActivity;->H:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/roblox/client/IncomingCallActivity;->F:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1b

    if-lt p1, v0, :cond_1

    invoke-virtual {p0, v4}, Landroid/app/Activity;->setShowWhenLocked(Z)V

    invoke-virtual {p0, v4}, Landroid/app/Activity;->setTurnScreenOn(Z)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    const v0, 0x680081

    invoke-virtual {p1, v0}, Landroid/view/Window;->addFlags(I)V

    :goto_0
    invoke-static {}, Lfv/c;->d()Lfv/c;

    move-result-object p1

    invoke-virtual {p1, p0}, Lfv/c;->n(Ljava/lang/Object;)V

    invoke-static {}, Lxl/g;->x()Lxl/g;

    move-result-object p1

    invoke-virtual {p1, p0}, Lxl/g;->g(Lxl/g$a;)V

    iget-wide v3, p0, Lcom/roblox/client/IncomingCallActivity;->E:J

    cmp-long p1, v3, v1

    if-lez p1, :cond_4

    invoke-static {}, Ldh/b;->b()Ldh/b;

    move-result-object p1

    iget-wide v0, p0, Lcom/roblox/client/IncomingCallActivity;->E:J

    invoke-virtual {p1, v0, v1}, Ldh/b;->d(J)Ldh/a;

    move-result-object p1

    if-nez p1, :cond_2

    iget-wide v0, p0, Lcom/roblox/client/IncomingCallActivity;->E:J

    invoke-static {v0, v1}, Loi/f;->b(J)V

    return-void

    :cond_2
    invoke-virtual {p1}, Ldh/a;->a()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_3

    iget-wide v0, p0, Lcom/roblox/client/IncomingCallActivity;->E:J

    invoke-static {v0, v1}, Loi/f;->a(J)V

    return-void

    :cond_3
    iget-object v0, p0, Lcom/roblox/client/IncomingCallActivity;->G:Landroid/widget/ImageView;

    invoke-virtual {p1}, Ldh/a;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/roblox/client/IncomingCallActivity;->K1(Landroid/widget/ImageView;Ljava/lang/String;)V

    :cond_4
    return-void
.end method

.method public onDestroy()V
    .locals 2

    invoke-super {p0}, Lj/b;->onDestroy()V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1b

    if-lt v0, v1, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/app/Activity;->setShowWhenLocked(Z)V

    invoke-virtual {p0, v0}, Landroid/app/Activity;->setTurnScreenOn(Z)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const v1, 0x680081

    invoke-virtual {v0, v1}, Landroid/view/Window;->clearFlags(I)V

    :goto_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roblox/client/IncomingCallActivity;->G:Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/roblox/client/IncomingCallActivity;->H:Landroid/widget/TextView;

    invoke-static {}, Lfv/c;->d()Lfv/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lfv/c;->p(Ljava/lang/Object;)V

    invoke-static {}, Lxl/g;->x()Lxl/g;

    move-result-object v0

    invoke-virtual {v0, p0}, Lxl/g;->w(Lxl/g$a;)V

    return-void
.end method

.method public p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public v(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method
