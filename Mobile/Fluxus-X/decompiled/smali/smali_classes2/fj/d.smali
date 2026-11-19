.class public Lfj/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public b:Lf4/v;

.field public c:Llk/c;

.field public d:I

.field public e:I

.field public f:Landroid/view/MenuItem;

.field public g:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Lf4/q;)V
    .locals 1

    .line 1
    new-instance v0, Llk/f;

    invoke-direct {v0}, Llk/f;-><init>()V

    invoke-direct {p0, p1, v0}, Lfj/d;-><init>(Lf4/q;Llk/c;)V

    return-void
.end method

.method public constructor <init>(Lf4/q;Llk/c;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    const-string v0, "NOTIFICATION_STREAM_TAG"

    iput-object v0, p0, Lfj/d;->a:Ljava/lang/String;

    const/4 v0, -0x1

    .line 4
    iput v0, p0, Lfj/d;->d:I

    .line 5
    invoke-virtual {p1}, Lf4/q;->p()Lf4/v;

    move-result-object p1

    iput-object p1, p0, Lfj/d;->b:Lf4/v;

    .line 6
    iput-object p2, p0, Lfj/d;->c:Llk/c;

    .line 7
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 8
    sget p2, Lbh/j0;->i:I

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    goto :goto_0

    :cond_0
    const p1, -0xbbbbbc

    :goto_0
    iput p1, p0, Lfj/d;->e:I

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 2

    iget-object v0, p0, Lfj/d;->c:Llk/c;

    invoke-interface {v0}, Llk/c;->getTheme()Lcm/a;

    move-result-object v0

    sget-object v1, Lfj/d$b;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    iget v0, p0, Lfj/d;->e:I

    return v0

    :cond_0
    const/4 v0, -0x1

    return v0
.end method

.method public final b()I
    .locals 2

    iget-object v0, p0, Lfj/d;->c:Llk/c;

    invoke-interface {v0}, Llk/c;->getTheme()Lcm/a;

    move-result-object v0

    sget-object v1, Lfj/d$b;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    sget v0, Lbh/l0;->k:I

    return v0

    :cond_0
    sget v0, Lbh/l0;->l:I

    return v0
.end method

.method public final c()I
    .locals 2

    iget-object v0, p0, Lfj/d;->c:Llk/c;

    invoke-interface {v0}, Llk/c;->getTheme()Lcm/a;

    move-result-object v0

    sget-object v1, Lfj/d$b;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    sget v0, Lbh/l0;->w:I

    return v0

    :cond_0
    sget v0, Lbh/l0;->x:I

    return v0
.end method

.method public d(Landroid/view/Menu;Landroid/view/MenuInflater;)Landroid/view/MenuItem;
    .locals 1

    sget v0, Lbh/o0;->a:I

    invoke-virtual {p2, v0, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    sget p2, Lbh/m0;->a:I

    invoke-interface {p1, p2}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object p1

    iput-object p1, p0, Lfj/d;->f:Landroid/view/MenuItem;

    invoke-interface {p1}, Landroid/view/MenuItem;->getActionView()Landroid/view/View;

    move-result-object p1

    sget p2, Lbh/m0;->Y:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageView;

    sget v0, Lbh/m0;->Z:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lfj/d;->g:Landroid/widget/TextView;

    iget v0, p0, Lfj/d;->d:I

    invoke-virtual {p0, p1, v0}, Lfj/d;->h(Landroid/widget/TextView;I)V

    new-instance p1, Lfj/d$a;

    invoke-direct {p1, p0}, Lfj/d$a;-><init>(Lfj/d;)V

    invoke-virtual {p2, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p0}, Lfj/d;->c()I

    move-result p1

    invoke-virtual {p2, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    iget-object p1, p0, Lfj/d;->g:Landroid/widget/TextView;

    invoke-virtual {p0}, Lfj/d;->b()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/View;->setBackgroundResource(I)V

    iget-object p1, p0, Lfj/d;->g:Landroid/widget/TextView;

    invoke-virtual {p0}, Lfj/d;->a()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object p1, p0, Lfj/d;->f:Landroid/view/MenuItem;

    return-object p1
.end method

.method public e()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lfj/d;->f(Landroidx/lifecycle/r;)V

    return-void
.end method

.method public f(Landroidx/lifecycle/r;)V
    .locals 4

    iget-object v0, p0, Lfj/d;->b:Lf4/v;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lnk/c;->c()Lnk/c;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lnk/c;->s(I)V

    iput v1, p0, Lfj/d;->d:I

    iget-object v0, p0, Lfj/d;->g:Landroid/widget/TextView;

    if-eqz v0, :cond_1

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    :cond_1
    invoke-static {}, Lcl/g;->d()Lcl/d;

    move-result-object v0

    invoke-interface {v0}, Lcl/d;->g()Lcom/roblox/platform/http/interfaces/NotificationsInterface;

    move-result-object v0

    invoke-interface {v0}, Lcom/roblox/platform/http/interfaces/NotificationsInterface;->clearStreamUnread()Lsw/d;

    move-result-object v0

    new-instance v2, Lel/a;

    invoke-direct {v2}, Lel/a;-><init>()V

    invoke-interface {v0, v2}, Lsw/d;->L(Lsw/f;)V

    invoke-static {}, Lbh/a1;->p0()Z

    move-result v0

    if-eqz v0, :cond_4

    new-instance v0, Landroid/content/Intent;

    iget-object v2, p0, Lfj/d;->b:Lf4/v;

    const-class v3, Lcom/roblox/client/NotificationStreamActivity;

    invoke-direct {v0, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    if-eqz p1, :cond_2

    const-string p1, "SEND_DATA_MODEL_FOCUS_EVENTS_EXTRA"

    const/4 v2, 0x1

    invoke-virtual {v0, p1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    :cond_2
    iget-object p1, p0, Lfj/d;->b:Lf4/v;

    const/16 v2, 0x4e8e

    invoke-virtual {p1, v0, v2}, Le/p;->startActivityForResult(Landroid/content/Intent;I)V

    invoke-static {}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeUserGameSettingsGetReducedMotion()Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lfj/d;->b:Lf4/v;

    invoke-virtual {p1, v1, v1}, Landroid/app/Activity;->overridePendingTransition(II)V

    return-void

    :cond_3
    iget-object p1, p0, Lfj/d;->b:Lf4/v;

    sget v0, Lbh/g0;->b:I

    const v1, 0x10a0001

    invoke-virtual {p1, v0, v1}, Landroid/app/Activity;->overridePendingTransition(II)V

    return-void

    :cond_4
    invoke-virtual {p0, p1}, Lfj/d;->i(Landroidx/lifecycle/r;)V

    return-void
.end method

.method public final g(I)V
    .locals 1

    iput p1, p0, Lfj/d;->d:I

    iget-object p1, p0, Lfj/d;->f:Landroid/view/MenuItem;

    invoke-interface {p1}, Landroid/view/MenuItem;->getActionView()Landroid/view/View;

    move-result-object p1

    sget v0, Lbh/m0;->Z:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iget v0, p0, Lfj/d;->d:I

    invoke-virtual {p0, p1, v0}, Lfj/d;->h(Landroid/widget/TextView;I)V

    return-void
.end method

.method public final h(Landroid/widget/TextView;I)V
    .locals 1

    if-lez p2, :cond_1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    const/16 v0, 0x63

    if-le p2, v0, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    sget v0, Lbh/q0;->Q:I

    invoke-virtual {p2, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_0
    invoke-static {p2}, Lyi/e;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_1
    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public final i(Landroidx/lifecycle/r;)V
    .locals 7

    iget-object v0, p0, Lfj/d;->b:Lf4/v;

    invoke-static {v0}, Lcom/roblox/platform/util/DeviceUtils;->getScreenSize(Landroid/content/Context;)Landroid/graphics/Point;

    move-result-object v0

    iget-object v1, p0, Lfj/d;->b:Lf4/v;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lbh/k0;->c:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    iget-object v2, p0, Lfj/d;->b:Lf4/v;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lbh/k0;->b:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    iget-object v3, p0, Lfj/d;->b:Lf4/v;

    const/16 v4, 0x50

    invoke-static {v3, v4}, Lbh/e2;->e(Landroid/content/Context;I)F

    move-result v3

    float-to-int v3, v3

    iget-object v4, p0, Lfj/d;->b:Lf4/v;

    const/16 v5, 0x1a4

    invoke-static {v4, v5}, Lbh/e2;->e(Landroid/content/Context;I)F

    move-result v4

    float-to-int v4, v4

    iget v0, v0, Landroid/graphics/Point;->y:I

    sub-int/2addr v0, v2

    sub-int/2addr v0, v1

    sub-int/2addr v0, v3

    iget-object v2, p0, Lfj/d;->b:Lf4/v;

    const/16 v3, 0xf

    invoke-static {v2, v3}, Lbh/e2;->e(Landroid/content/Context;I)F

    move-result v2

    float-to-int v2, v2

    new-instance v3, Lbh/e0;

    invoke-direct {v3}, Lbh/e0;-><init>()V

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-virtual {v3, v5, v6}, Lf4/o;->r2(II)V

    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    const-string v6, "dialogWidth"

    invoke-virtual {v5, v6, v4}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v4, "dialogHeight"

    invoke-virtual {v5, v4, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "dialogGravity"

    const/16 v4, 0x35

    invoke-virtual {v5, v0, v4}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "dialogOffsetY"

    invoke-virtual {v5, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "dialogOffsetX"

    invoke-virtual {v5, v0, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "DEFAULT_URL"

    invoke-static {}, Lbh/a1;->y0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v3, v5}, Lf4/q;->O1(Landroid/os/Bundle;)V

    if-eqz p1, :cond_0

    invoke-virtual {v3}, Lf4/q;->a()Landroidx/lifecycle/l;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    :cond_0
    iget-object p1, p0, Lfj/d;->b:Lf4/v;

    invoke-virtual {p1}, Lf4/v;->l1()Lf4/k0;

    move-result-object p1

    const-string v0, "NOTIFICATION_STREAM_TAG"

    invoke-virtual {v3, p1, v0}, Lf4/o;->t2(Lf4/k0;Ljava/lang/String;)V

    return-void
.end method

.method public j()V
    .locals 2

    iget-object v0, p0, Lfj/d;->b:Lf4/v;

    invoke-virtual {v0}, Lf4/v;->l1()Lf4/k0;

    move-result-object v0

    const-string v1, "NOTIFICATION_STREAM_TAG"

    invoke-virtual {v0, v1}, Lf4/k0;->n0(Ljava/lang/String;)Lf4/q;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lf4/q;->x0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lnk/c;->c()Lnk/c;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lnk/c;->s(I)V

    :cond_0
    invoke-static {}, Lnk/c;->c()Lnk/c;

    move-result-object v0

    invoke-virtual {v0}, Lnk/c;->e()I

    move-result v0

    invoke-virtual {p0, v0}, Lfj/d;->g(I)V

    return-void
.end method
