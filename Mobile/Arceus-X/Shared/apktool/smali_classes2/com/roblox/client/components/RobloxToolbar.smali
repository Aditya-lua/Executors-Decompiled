.class public Lcom/roblox/client/components/RobloxToolbar;
.super Landroidx/appcompat/widget/Toolbar;
.source "SourceFile"

# interfaces
.implements Ldk/e$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/client/components/RobloxToolbar$b;,
        Lcom/roblox/client/components/RobloxToolbar$e;,
        Lcom/roblox/client/components/RobloxToolbar$j;,
        Lcom/roblox/client/components/RobloxToolbar$h;,
        Lcom/roblox/client/components/RobloxToolbar$i;,
        Lcom/roblox/client/components/RobloxToolbar$g;,
        Lcom/roblox/client/components/RobloxToolbar$c;,
        Lcom/roblox/client/components/RobloxToolbar$f;,
        Lcom/roblox/client/components/RobloxToolbar$d;
    }
.end annotation


# instance fields
.field public T:Landroid/widget/TextView;

.field public U:Landroid/widget/TextView;

.field public V:Landroid/widget/ImageButton;

.field public W:Landroid/widget/ImageButton;

.field public a0:Ljava/lang/Integer;

.field public b0:Ljava/lang/Integer;

.field public c0:Lcom/roblox/client/components/RobloxToolbar$e;

.field public d0:Lcom/roblox/client/components/RobloxToolbar$h;

.field public e0:Lcom/roblox/client/components/RobloxToolbar$i;

.field public f0:Lcom/roblox/client/components/RobloxToolbar$g;

.field public g0:Lcom/roblox/client/components/RobloxToolbar$e;

.field public h0:Lol/a;

.field public i0:Ldk/c;

.field public j0:Lil/c;

.field public k0:Leh/i;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/appcompat/widget/Toolbar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/roblox/client/components/RobloxToolbar;->a0:Ljava/lang/Integer;

    iput-object p1, p0, Lcom/roblox/client/components/RobloxToolbar;->b0:Ljava/lang/Integer;

    sget-object p1, Lil/b;->c:Lil/c;

    iput-object p1, p0, Lcom/roblox/client/components/RobloxToolbar;->j0:Lil/c;

    invoke-direct {p0}, Lcom/roblox/client/components/RobloxToolbar;->Y()V

    return-void
.end method

.method public static synthetic U(Lcom/roblox/client/components/RobloxToolbar;)V
    .locals 0

    invoke-virtual {p0}, Lcom/roblox/client/components/RobloxToolbar;->d0()V

    return-void
.end method

.method private Y()V
    .locals 1

    new-instance v0, Ldk/f;

    invoke-direct {v0}, Ldk/f;-><init>()V

    iput-object v0, p0, Lcom/roblox/client/components/RobloxToolbar;->i0:Ldk/c;

    new-instance v0, Lcom/roblox/client/components/RobloxToolbar$b;

    invoke-direct {v0}, Lcom/roblox/client/components/RobloxToolbar$b;-><init>()V

    iput-object v0, p0, Lcom/roblox/client/components/RobloxToolbar;->c0:Lcom/roblox/client/components/RobloxToolbar$e;

    new-instance v0, Lcom/roblox/client/components/RobloxToolbar$j;

    invoke-direct {v0}, Lcom/roblox/client/components/RobloxToolbar$j;-><init>()V

    iput-object v0, p0, Lcom/roblox/client/components/RobloxToolbar;->d0:Lcom/roblox/client/components/RobloxToolbar$h;

    new-instance v0, Lcom/roblox/client/components/RobloxToolbar$i;

    invoke-direct {v0}, Lcom/roblox/client/components/RobloxToolbar$i;-><init>()V

    iput-object v0, p0, Lcom/roblox/client/components/RobloxToolbar;->e0:Lcom/roblox/client/components/RobloxToolbar$i;

    new-instance v0, Lcom/roblox/client/components/RobloxToolbar$g;

    invoke-direct {v0}, Lcom/roblox/client/components/RobloxToolbar$g;-><init>()V

    iput-object v0, p0, Lcom/roblox/client/components/RobloxToolbar;->f0:Lcom/roblox/client/components/RobloxToolbar$g;

    new-instance v0, Lcom/roblox/client/components/RobloxToolbar$c;

    invoke-direct {v0}, Lcom/roblox/client/components/RobloxToolbar$c;-><init>()V

    iput-object v0, p0, Lcom/roblox/client/components/RobloxToolbar;->g0:Lcom/roblox/client/components/RobloxToolbar$e;

    return-void
.end method

.method private getSubTitleFont()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/roblox/client/components/RobloxToolbar;->f0:Lcom/roblox/client/components/RobloxToolbar$g;

    iget-object v1, p0, Lcom/roblox/client/components/RobloxToolbar;->i0:Ldk/c;

    invoke-interface {v1}, Ldk/c;->getTheme()Lol/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roblox/client/components/RobloxToolbar$g;->a(Lol/a;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private getTitleFont()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/roblox/client/components/RobloxToolbar;->e0:Lcom/roblox/client/components/RobloxToolbar$i;

    iget-object v1, p0, Lcom/roblox/client/components/RobloxToolbar;->i0:Ldk/c;

    invoke-interface {v1}, Ldk/c;->getTheme()Lol/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roblox/client/components/RobloxToolbar$i;->a(Lol/a;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final V()V
    .locals 4

    new-instance v0, Landroid/widget/ImageButton;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    sget v3, Lsg/h0;->a:I

    invoke-direct {v0, v1, v2, v3}, Landroid/widget/ImageButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    iput-object v0, p0, Lcom/roblox/client/components/RobloxToolbar;->V:Landroid/widget/ImageButton;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    new-instance v0, Landroidx/appcompat/widget/Toolbar$g;

    const/4 v1, -0x2

    invoke-direct {v0, v1, v1}, Landroidx/appcompat/widget/Toolbar$g;-><init>(II)V

    const v1, 0x800005

    iput v1, v0, Lj/a$a;->a:I

    iget-object v1, p0, Lcom/roblox/client/components/RobloxToolbar;->V:Landroid/widget/ImageButton;

    invoke-virtual {p0, v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final W(Lol/a;)I
    .locals 1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/roblox/client/components/RobloxToolbar;->i0:Ldk/c;

    invoke-interface {p1}, Ldk/c;->getTheme()Lol/a;

    move-result-object p1

    :cond_0
    iget-object v0, p0, Lcom/roblox/client/components/RobloxToolbar;->g0:Lcom/roblox/client/components/RobloxToolbar$e;

    invoke-interface {v0, p1}, Lcom/roblox/client/components/RobloxToolbar$e;->a(Lol/a;)I

    move-result p1

    return p1
.end method

.method public final X(Lol/a;)I
    .locals 1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/roblox/client/components/RobloxToolbar;->i0:Ldk/c;

    invoke-interface {p1}, Ldk/c;->getTheme()Lol/a;

    move-result-object p1

    :cond_0
    iget-object v0, p0, Lcom/roblox/client/components/RobloxToolbar;->c0:Lcom/roblox/client/components/RobloxToolbar$e;

    invoke-interface {v0, p1}, Lcom/roblox/client/components/RobloxToolbar$e;->a(Lol/a;)I

    move-result p1

    return p1
.end method

.method public final Z()V
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/components/RobloxToolbar;->W:Landroid/widget/ImageButton;

    if-nez v0, :cond_0

    sget v0, Lsg/m0;->n0:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/roblox/client/components/RobloxToolbar;->W:Landroid/widget/ImageButton;

    :cond_0
    return-void
.end method

.method public final a0()V
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/components/RobloxToolbar;->V:Landroid/widget/ImageButton;

    if-nez v0, :cond_1

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->b1()Z

    move-result v0

    if-eqz v0, :cond_0

    sget v0, Lsg/m0;->o0:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/roblox/client/components/RobloxToolbar;->V:Landroid/widget/ImageButton;

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/roblox/client/components/RobloxToolbar;->V()V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/roblox/client/components/RobloxToolbar;->V()V

    :cond_1
    return-void
.end method

.method public final b0()V
    .locals 2

    iget-object v0, p0, Lcom/roblox/client/components/RobloxToolbar;->U:Landroid/widget/TextView;

    if-nez v0, :cond_1

    sget v0, Lsg/m0;->p0:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roblox/client/components/RobloxToolbar;->U:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/roblox/client/components/RobloxToolbar;->b0:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/roblox/client/components/RobloxToolbar;->U:Landroid/widget/TextView;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_0
    iget-object v0, p0, Lcom/roblox/client/components/RobloxToolbar;->U:Landroid/widget/TextView;

    invoke-direct {p0}, Lcom/roblox/client/components/RobloxToolbar;->getSubTitleFont()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/roblox/client/components/RobloxToolbar;->e0(Landroid/widget/TextView;Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public final c0()V
    .locals 2

    iget-object v0, p0, Lcom/roblox/client/components/RobloxToolbar;->T:Landroid/widget/TextView;

    if-nez v0, :cond_1

    sget v0, Lsg/m0;->q0:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roblox/client/components/RobloxToolbar;->T:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/roblox/client/components/RobloxToolbar;->a0:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/roblox/client/components/RobloxToolbar;->T:Landroid/widget/TextView;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_0
    iget-object v0, p0, Lcom/roblox/client/components/RobloxToolbar;->T:Landroid/widget/TextView;

    invoke-direct {p0}, Lcom/roblox/client/components/RobloxToolbar;->getTitleFont()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/roblox/client/components/RobloxToolbar;->e0(Landroid/widget/TextView;Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public final synthetic d0()V
    .locals 1

    invoke-virtual {p0}, Lcom/roblox/client/components/RobloxToolbar;->getBackgroundColor()I

    move-result v0

    invoke-virtual {p0, v0}, Landroid/view/View;->setBackgroundColor(I)V

    return-void
.end method

.method public final e0(Landroid/widget/TextView;Ljava/lang/String;)V
    .locals 1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {p1, p2, v0}, Leh/e;->f(Landroid/widget/TextView;Ljava/lang/String;Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {p1, v0, p2}, Leh/e;->d(Landroid/widget/TextView;Landroid/content/Context;Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final f0(Z)V
    .locals 2

    iget-object v0, p0, Lcom/roblox/client/components/RobloxToolbar;->V:Landroid/widget/ImageButton;

    iget-object v1, p0, Lcom/roblox/client/components/RobloxToolbar;->h0:Lol/a;

    invoke-virtual {p0, v1}, Lcom/roblox/client/components/RobloxToolbar;->W(Lol/a;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    iget-object v0, p0, Lcom/roblox/client/components/RobloxToolbar;->V:Landroid/widget/ImageButton;

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    :goto_0
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public final g0(Z)V
    .locals 1

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->b1()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/roblox/client/components/RobloxToolbar;->W:Landroid/widget/ImageButton;

    if-eqz v0, :cond_1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/roblox/client/components/RobloxToolbar;->h0:Lol/a;

    invoke-virtual {p0, p1}, Lcom/roblox/client/components/RobloxToolbar;->X(Lol/a;)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    iget-object p1, p0, Lcom/roblox/client/components/RobloxToolbar;->W:Landroid/widget/ImageButton;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_0
    const/16 p1, 0x8

    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    :cond_1
    return-void

    :cond_2
    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/roblox/client/components/RobloxToolbar;->h0:Lol/a;

    invoke-virtual {p0, p1}, Lcom/roblox/client/components/RobloxToolbar;->X(Lol/a;)I

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/Toolbar;->setNavigationIcon(I)V

    return-void

    :cond_3
    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/Toolbar;->setNavigationIcon(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public getBackgroundColor()I
    .locals 5

    iget-object v0, p0, Lcom/roblox/client/components/RobloxToolbar;->j0:Lil/c;

    invoke-interface {v0}, Lil/c;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roblox/client/components/RobloxToolbar;->i0:Ldk/c;

    invoke-interface {v0}, Ldk/c;->getTheme()Lol/a;

    move-result-object v0

    iget-object v1, p0, Lcom/roblox/client/components/RobloxToolbar;->j0:Lil/c;

    const-string v2, "Common.NavigationBar"

    invoke-interface {v1, v2}, Lil/c;->b(Ljava/lang/String;)Lil/a;

    move-result-object v1

    const-string v2, "rbx.theme"

    if-eqz v1, :cond_0

    invoke-virtual {v1, v0}, Lil/a;->c(Lol/a;)I

    move-result v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "RobloxToolbar: using token color for Common.NavigationBar theme="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " argb="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    return v1

    :cond_0
    const-string v0, "RobloxToolbar: token key not found: Common.NavigationBar, falling back to resource color"

    invoke-static {v2, v0}, Lgk/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iget-object v1, p0, Lcom/roblox/client/components/RobloxToolbar;->d0:Lcom/roblox/client/components/RobloxToolbar$h;

    iget-object v2, p0, Lcom/roblox/client/components/RobloxToolbar;->i0:Ldk/c;

    invoke-interface {v2}, Ldk/c;->getTheme()Lol/a;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/roblox/client/components/RobloxToolbar$h;->b(Lol/a;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    return v0
.end method

.method public getForegroundColor()I
    .locals 3

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iget-object v1, p0, Lcom/roblox/client/components/RobloxToolbar;->d0:Lcom/roblox/client/components/RobloxToolbar$h;

    iget-object v2, p0, Lcom/roblox/client/components/RobloxToolbar;->i0:Ldk/c;

    invoke-interface {v2}, Ldk/c;->getTheme()Lol/a;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/roblox/client/components/RobloxToolbar$h;->a(Lol/a;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    return v0
.end method

.method public h0(Landroid/view/View$OnClickListener;)V
    .locals 2

    invoke-virtual {p0}, Lcom/roblox/client/components/RobloxToolbar;->a0()V

    iget-object v0, p0, Lcom/roblox/client/components/RobloxToolbar;->V:Landroid/widget/ImageButton;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->b1()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->getContentInsetEnd()I

    move-result v0

    invoke-virtual {p0, v1, v0}, Landroidx/appcompat/widget/Toolbar;->L(II)V

    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->getContentInsetRight()I

    move-result v0

    invoke-virtual {p0, v1, v0}, Landroidx/appcompat/widget/Toolbar;->K(II)V

    invoke-virtual {p0, v1}, Landroidx/appcompat/widget/Toolbar;->setContentInsetStartWithNavigation(I)V

    :cond_0
    if-eqz p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    invoke-virtual {p0, v1}, Lcom/roblox/client/components/RobloxToolbar;->f0(Z)V

    iget-object v0, p0, Lcom/roblox/client/components/RobloxToolbar;->V:Landroid/widget/ImageButton;

    invoke-virtual {v0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public onAttachedToWindow()V
    .locals 3

    invoke-super {p0}, Landroidx/appcompat/widget/Toolbar;->onAttachedToWindow()V

    new-instance v0, Leh/i;

    iget-object v1, p0, Lcom/roblox/client/components/RobloxToolbar;->j0:Lil/c;

    new-instance v2, Leh/g;

    invoke-direct {v2, p0}, Leh/g;-><init>(Lcom/roblox/client/components/RobloxToolbar;)V

    invoke-direct {v0, v1, v2}, Leh/i;-><init>(Lil/c;Ljava/lang/Runnable;)V

    iput-object v0, p0, Lcom/roblox/client/components/RobloxToolbar;->k0:Leh/i;

    invoke-virtual {v0}, Leh/i;->b()V

    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 1

    invoke-super {p0}, Landroidx/appcompat/widget/Toolbar;->onDetachedFromWindow()V

    iget-object v0, p0, Lcom/roblox/client/components/RobloxToolbar;->k0:Leh/i;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Leh/i;->c()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roblox/client/components/RobloxToolbar;->k0:Leh/i;

    :cond_0
    return-void
.end method

.method public setCloseButtonGravity(I)V
    .locals 2

    invoke-virtual {p0}, Lcom/roblox/client/components/RobloxToolbar;->a0()V

    iget-object v0, p0, Lcom/roblox/client/components/RobloxToolbar;->V:Landroid/widget/ImageButton;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/Toolbar$g;

    if-eqz v0, :cond_0

    iput p1, v0, Lj/a$a;->a:I

    iget-object p1, p0, Lcom/roblox/client/components/RobloxToolbar;->V:Landroid/widget/ImageButton;

    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void

    :cond_0
    new-instance v0, Landroidx/appcompat/widget/Toolbar$g;

    const/4 v1, -0x2

    invoke-direct {v0, v1, v1}, Landroidx/appcompat/widget/Toolbar$g;-><init>(II)V

    iput p1, v0, Lj/a$a;->a:I

    iget-object p1, p0, Lcom/roblox/client/components/RobloxToolbar;->V:Landroid/widget/ImageButton;

    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_1
    return-void
.end method

.method public setDesignFoundations(Lil/c;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/components/RobloxToolbar;->j0:Lil/c;

    return-void
.end method

.method public setIconDelegate(Lcom/roblox/client/components/RobloxToolbar$e;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/components/RobloxToolbar;->c0:Lcom/roblox/client/components/RobloxToolbar$e;

    return-void
.end method

.method public setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V
    .locals 3

    sget-object v0, Lcom/roblox/client/flags/b;->a:Lcom/roblox/client/flags/b;

    invoke-virtual {v0}, Lcom/roblox/client/flags/b;->g()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->b1()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/roblox/client/components/RobloxToolbar;->Z()V

    iget-object v0, p0, Lcom/roblox/client/components/RobloxToolbar;->W:Landroid/widget/ImageButton;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    if-eqz p1, :cond_0

    move v1, v2

    :cond_0
    invoke-virtual {p0, v1}, Lcom/roblox/client/components/RobloxToolbar;->g0(Z)V

    :cond_1
    return-void

    :cond_2
    invoke-super {p0, p1}, Landroidx/appcompat/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    if-eqz p1, :cond_3

    move v1, v2

    :cond_3
    invoke-virtual {p0, v1}, Lcom/roblox/client/components/RobloxToolbar;->g0(Z)V

    return-void
.end method

.method public setSubtitle(Ljava/lang/CharSequence;)V
    .locals 1

    invoke-virtual {p0}, Lcom/roblox/client/components/RobloxToolbar;->b0()V

    iget-object v0, p0, Lcom/roblox/client/components/RobloxToolbar;->U:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setSubtitleTextColor(I)V
    .locals 1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/roblox/client/components/RobloxToolbar;->b0:Ljava/lang/Integer;

    iget-object v0, p0, Lcom/roblox/client/components/RobloxToolbar;->U:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_0
    return-void
.end method

.method public setThemeChooser(Ldk/c;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/components/RobloxToolbar;->i0:Ldk/c;

    return-void
.end method

.method public setThemeColorDelegate(Lcom/roblox/client/components/RobloxToolbar$h;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/components/RobloxToolbar;->d0:Lcom/roblox/client/components/RobloxToolbar$h;

    return-void
.end method

.method public setTitle(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/roblox/client/components/RobloxToolbar;->c0()V

    .line 2
    iget-object v0, p0, Lcom/roblox/client/components/RobloxToolbar;->T:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V

    return-void
.end method

.method public setTitle(Ljava/lang/CharSequence;)V
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/roblox/client/components/RobloxToolbar;->c0()V

    .line 4
    iget-object v0, p0, Lcom/roblox/client/components/RobloxToolbar;->T:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setTitleTextColor(I)V
    .locals 1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/roblox/client/components/RobloxToolbar;->a0:Ljava/lang/Integer;

    iget-object v0, p0, Lcom/roblox/client/components/RobloxToolbar;->T:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_0
    return-void
.end method

.method public setVisibility(I)V
    .locals 0

    invoke-super {p0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public u(Lol/a;)V
    .locals 2

    iget-object v0, p0, Lcom/roblox/client/components/RobloxToolbar;->h0:Lol/a;

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    iput-object p1, p0, Lcom/roblox/client/components/RobloxToolbar;->h0:Lol/a;

    invoke-virtual {p0}, Lcom/roblox/client/components/RobloxToolbar;->getBackgroundColor()I

    move-result p1

    invoke-virtual {p0}, Lcom/roblox/client/components/RobloxToolbar;->getForegroundColor()I

    move-result v0

    invoke-virtual {p0, p1}, Landroid/view/View;->setBackgroundColor(I)V

    invoke-virtual {p0, v0}, Lcom/roblox/client/components/RobloxToolbar;->setTitleTextColor(I)V

    invoke-virtual {p0, v0}, Lcom/roblox/client/components/RobloxToolbar;->setSubtitleTextColor(I)V

    iget-object p1, p0, Lcom/roblox/client/components/RobloxToolbar;->T:Landroid/widget/TextView;

    invoke-direct {p0}, Lcom/roblox/client/components/RobloxToolbar;->getTitleFont()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/roblox/client/components/RobloxToolbar;->e0(Landroid/widget/TextView;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/roblox/client/components/RobloxToolbar;->U:Landroid/widget/TextView;

    invoke-direct {p0}, Lcom/roblox/client/components/RobloxToolbar;->getSubTitleFont()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/roblox/client/components/RobloxToolbar;->e0(Landroid/widget/TextView;Ljava/lang/String;)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->b1()Z

    move-result p1

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/roblox/client/components/RobloxToolbar;->W:Landroid/widget/ImageButton;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result p1

    if-nez p1, :cond_1

    move v0, v1

    :cond_1
    invoke-virtual {p0, v0}, Lcom/roblox/client/components/RobloxToolbar;->g0(Z)V

    iget-object p1, p0, Lcom/roblox/client/components/RobloxToolbar;->V:Landroid/widget/ImageButton;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result p1

    if-nez p1, :cond_2

    invoke-virtual {p0, v1}, Lcom/roblox/client/components/RobloxToolbar;->f0(Z)V

    :cond_2
    :goto_0
    return-void

    :cond_3
    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->getNavigationIcon()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-eqz p1, :cond_4

    move v0, v1

    :cond_4
    invoke-virtual {p0, v0}, Lcom/roblox/client/components/RobloxToolbar;->g0(Z)V

    return-void
.end method
