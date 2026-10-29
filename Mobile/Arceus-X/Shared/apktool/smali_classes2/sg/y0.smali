.class public Lsg/y0;
.super Lcom/roblox/client/c;
.source "SourceFile"


# instance fields
.field public g1:Landroid/view/View;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/roblox/client/c;-><init>()V

    return-void
.end method


# virtual methods
.method public C0(Landroid/content/Context;)V
    .locals 1

    invoke-super {p0, p1}, Le4/k;->C0(Landroid/content/Context;)V

    const-string p1, "RobloxModalWebFragment"

    const-string v0, "onAttach."

    invoke-static {p1, v0}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public D3(Z)V
    .locals 1

    invoke-super {p0, p1}, Lcom/roblox/client/c;->D3(Z)V

    iget-object v0, p0, Lsg/y0;->g1:Landroid/view/View;

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
    .locals 0

    invoke-super {p0, p1}, Lcom/roblox/client/c;->F0(Landroid/os/Bundle;)V

    return-void
.end method

.method public H3(Lnl/a;)V
    .locals 1

    invoke-super {p0, p1}, Lcom/roblox/client/c;->H3(Lnl/a;)V

    const-string p1, "RobloxModalWebFragment"

    const-string v0, "updateWebView."

    invoke-static {p1, v0}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public I3()Lvg/c0$b;
    .locals 1

    sget-object v0, Lvg/c0$b;->i:Lvg/c0$b;

    return-object v0
.end method

.method public J0(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 9

    invoke-super {p0, p1, p2, p3}, Lcom/roblox/client/c;->J0(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p1

    const-string p2, "onCreate."

    const-string p3, "RobloxModalWebFragment"

    invoke-static {p3, p2}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    new-instance p2, Landroid/animation/LayoutTransition;

    invoke-direct {p2}, Landroid/animation/LayoutTransition;-><init>()V

    const/4 v0, 0x2

    invoke-virtual {p2, v0}, Landroid/animation/LayoutTransition;->enableTransitionType(I)V

    const/4 v0, 0x3

    invoke-virtual {p2, v0}, Landroid/animation/LayoutTransition;->enableTransitionType(I)V

    iput-object p1, p0, Lsg/y0;->g1:Landroid/view/View;

    move-object v0, p1

    check-cast v0, Landroid/widget/LinearLayout;

    invoke-virtual {v0, p2}, Landroid/view/ViewGroup;->setLayoutTransition(Landroid/animation/LayoutTransition;)V

    sget p2, Lsg/m0;->u0:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/LinearLayout;

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    sget v0, Lsg/m0;->t0:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lsg/y0$a;

    invoke-direct {v1, p0}, Lsg/y0$a;-><init>(Lsg/y0;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p0}, Landroidx/fragment/app/c;->T()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    int-to-float v2, v0

    invoke-virtual {p0}, Landroidx/fragment/app/c;->T()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    int-to-float v3, v0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "widthInPixels: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ". heightInPixels: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v8, "."

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p3, v0}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->P1()I

    move-result v0

    invoke-virtual {p2}, Landroid/view/View;->getHeight()I

    move-result p2

    add-int v7, v0, p2

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p2

    invoke-interface {p2}, Lth/i;->B2()I

    move-result v6

    int-to-float p2, v7

    invoke-virtual {p0}, Landroidx/fragment/app/c;->T()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1, p2, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p2

    float-to-int v5, p2

    int-to-float p2, v6

    invoke-virtual {p0}, Landroidx/fragment/app/c;->T()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    invoke-static {v1, p2, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p2

    float-to-int v4, p2

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "minWidthInDip: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ". minHeightInDip: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p3, p2}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    move-object v1, p0

    invoke-virtual/range {v1 .. v7}, Lsg/y0;->J3(FFIIII)Landroid/graphics/Point;

    move-result-object p2

    if-eqz p2, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "width: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p2, Landroid/graphics/Point;->x:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ". height: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p2, Landroid/graphics/Point;->y:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p3, v0}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    new-instance p3, Landroid/widget/FrameLayout$LayoutParams;

    iget v0, p2, Landroid/graphics/Point;->x:I

    iget p2, p2, Landroid/graphics/Point;->y:I

    const/16 v2, 0x11

    invoke-direct {p3, v0, p2, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    invoke-virtual {p1, p3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_0
    iget-boolean p2, v1, Lcom/roblox/client/c;->X0:Z

    invoke-virtual {p0, p2}, Lsg/y0;->D3(Z)V

    return-object p1
.end method

.method public final J3(FFIIII)Landroid/graphics/Point;
    .locals 1

    int-to-float v0, p5

    cmpl-float v0, p1, v0

    if-ltz v0, :cond_4

    int-to-float v0, p6

    cmpl-float v0, p2, v0

    if-ltz v0, :cond_4

    const v0, 0x3f666666    # 0.9f

    mul-float/2addr v0, p1

    float-to-int v0, v0

    if-le v0, p5, :cond_0

    move p5, v0

    :cond_0
    const v0, 0x3f4ccccd    # 0.8f

    mul-float/2addr v0, p2

    float-to-int v0, v0

    if-le v0, p6, :cond_1

    move p6, v0

    :cond_1
    int-to-float v0, p4

    cmpl-float p2, v0, p2

    if-lez p2, :cond_2

    move p4, p6

    :cond_2
    int-to-float p2, p3

    cmpl-float p1, p2, p1

    if-lez p1, :cond_3

    move p3, p5

    :cond_3
    new-instance p1, Landroid/graphics/Point;

    invoke-direct {p1, p3, p4}, Landroid/graphics/Point;-><init>(II)V

    return-object p1

    :cond_4
    const/4 p1, 0x0

    return-object p1
.end method

.method public N0()V
    .locals 2

    invoke-super {p0}, Le4/k;->N0()V

    const-string v0, "RobloxModalWebFragment"

    const-string v1, "onDetach."

    invoke-static {v0, v1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public V0()V
    .locals 2

    invoke-super {p0}, Lcom/roblox/client/c;->V0()V

    const-string v0, "RobloxModalWebFragment"

    const-string v1, "onPause."

    invoke-static {v0, v1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public a1()V
    .locals 2

    invoke-super {p0}, Lcom/roblox/client/c;->a1()V

    const-string v0, "RobloxModalWebFragment"

    const-string v1, "onResume."

    invoke-static {v0, v1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public c1()V
    .locals 0

    invoke-super {p0}, Lcom/roblox/client/c;->c1()V

    return-void
.end method

.method public z0(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, Lsg/x0;->z0(Landroid/os/Bundle;)V

    const-string p1, "RobloxModalWebFragment"

    const-string v0, "onActivityCreated."

    invoke-static {p1, v0}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method
