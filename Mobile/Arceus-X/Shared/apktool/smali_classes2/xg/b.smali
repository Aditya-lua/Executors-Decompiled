.class public Lxg/b;
.super Le4/k;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroid/content/DialogInterface$OnCancelListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxg/b$a;
    }
.end annotation


# instance fields
.field public v0:Lxg/b$a;

.field public w0:Lih/a;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Le4/k;-><init>()V

    return-void
.end method


# virtual methods
.method public F0(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, Le4/k;->F0(Landroid/os/Bundle;)V

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Landroidx/fragment/app/c;->V1(Z)V

    invoke-virtual {p0}, Le4/k;->j2()I

    move-result v0

    invoke-virtual {p0, p1, v0}, Le4/k;->r2(II)V

    return-void
.end method

.method public J0(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    const/4 p3, 0x0

    invoke-static {p1, p2, p3}, Lih/a;->c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lih/a;

    move-result-object p1

    iput-object p1, p0, Lxg/b;->w0:Lih/a;

    invoke-virtual {p0}, Lxg/b;->u2()V

    iget-object p1, p0, Lxg/b;->w0:Lih/a;

    invoke-virtual {p1}, Lih/a;->b()Landroid/widget/LinearLayout;

    move-result-object p1

    return-object p1
.end method

.method public M0()V
    .locals 3

    invoke-virtual {p0}, Le4/k;->h2()Landroid/app/Dialog;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/fragment/app/c;->V()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setDismissMessage(Landroid/os/Message;)V

    :cond_0
    invoke-super {p0}, Le4/k;->M0()V

    iput-object v1, p0, Lxg/b;->w0:Lih/a;

    return-void
.end method

.method public a1()V
    .locals 0

    invoke-virtual {p0}, Lxg/b;->w2()V

    invoke-super {p0}, Landroidx/fragment/app/c;->a1()V

    return-void
.end method

.method public onCancel(Landroid/content/DialogInterface;)V
    .locals 1

    iget-object p1, p0, Lxg/b;->v0:Lxg/b$a;

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object v0

    invoke-interface {p1, v0}, Lxg/b$a;->c(Landroid/app/Activity;)V

    return-void

    :cond_0
    const-string p1, "RateMeMaybeFragment"

    const-string v0, "onCancel - mInterface is null"

    invoke-static {p1, v0}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lxg/b;->v0:Lxg/b$a;

    if-nez v0, :cond_0

    const-string p1, "RateMeMaybeFragment"

    const-string v0, "onClick - mInterface is null"

    invoke-static {p1, v0}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lsg/m0;->m:I

    if-ne v0, v1, :cond_1

    iget-object p1, p0, Lxg/b;->v0:Lxg/b$a;

    invoke-virtual {p0}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object v0

    invoke-interface {p1, v0}, Lxg/b$a;->c(Landroid/app/Activity;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lsg/m0;->o:I

    if-ne v0, v1, :cond_2

    iget-object p1, p0, Lxg/b;->v0:Lxg/b$a;

    invoke-virtual {p0}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object v0

    invoke-interface {p1, v0}, Lxg/b$a;->a(Landroid/app/Activity;)V

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lsg/m0;->p:I

    if-ne v0, v1, :cond_3

    iget-object p1, p0, Lxg/b;->v0:Lxg/b$a;

    invoke-virtual {p0}, Landroidx/fragment/app/c;->x()Landroid/content/Context;

    move-result-object v0

    invoke-interface {p1, v0}, Lxg/b$a;->b(Landroid/content/Context;)V

    goto :goto_0

    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    sget v0, Lsg/m0;->q:I

    if-ne p1, v0, :cond_4

    iget-object p1, p0, Lxg/b;->v0:Lxg/b$a;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lxg/b$a;->d(Z)V

    :cond_4
    :goto_0
    invoke-virtual {p0}, Lxg/b;->v2()V

    return-void
.end method

.method public final u2()V
    .locals 6

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->V4()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lxg/b;->w0:Lih/a;

    iget-object v0, v0, Lih/a;->d:Lcom/roblox/client/components/RbxTextView;

    sget-object v1, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    iget-object v0, p0, Lxg/b;->w0:Lih/a;

    iget-object v0, v0, Lih/a;->d:Lcom/roblox/client/components/RbxTextView;

    sget v1, Lsg/q0;->a:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, p0, Lxg/b;->w0:Lih/a;

    iget-object v0, v0, Lih/a;->g:Lcom/roblox/client/components/RbxButton;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->r5()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lxg/b;->w0:Lih/a;

    iget-object v0, v0, Lih/a;->d:Lcom/roblox/client/components/RbxTextView;

    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v2

    iget-object v3, p0, Lxg/b;->w0:Lih/a;

    iget-object v3, v3, Lih/a;->d:Lcom/roblox/client/components/RbxTextView;

    invoke-virtual {v3}, Landroid/view/View;->getPaddingTop()I

    move-result v3

    iget-object v4, p0, Lxg/b;->w0:Lih/a;

    iget-object v4, v4, Lih/a;->d:Lcom/roblox/client/components/RbxTextView;

    invoke-virtual {v4}, Landroid/view/View;->getPaddingRight()I

    move-result v4

    const/16 v5, 0x10

    invoke-virtual {v0, v2, v3, v4, v5}, Landroid/view/View;->setPadding(IIII)V

    iget-object v0, p0, Lxg/b;->w0:Lih/a;

    iget-object v0, v0, Lih/a;->h:Lcom/roblox/client/components/RbxTextView;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lxg/b;->w0:Lih/a;

    iget-object v0, v0, Lih/a;->b:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    iget-object v0, p0, Lxg/b;->w0:Lih/a;

    iget-object v0, v0, Lih/a;->f:Lcom/roblox/client/components/RbxButton;

    const/4 v1, 0x2

    const/high16 v2, 0x41800000    # 16.0f

    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    iget-object v0, p0, Lxg/b;->w0:Lih/a;

    iget-object v0, v0, Lih/a;->e:Lcom/roblox/client/components/RbxButton;

    sget v1, Lsg/q0;->b:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    :cond_1
    iget-object v0, p0, Lxg/b;->w0:Lih/a;

    iget-object v0, v0, Lih/a;->f:Lcom/roblox/client/components/RbxButton;

    invoke-virtual {v0, p0}, Lcom/roblox/client/components/RbxButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lxg/b;->w0:Lih/a;

    iget-object v0, v0, Lih/a;->e:Lcom/roblox/client/components/RbxButton;

    invoke-virtual {v0, p0}, Lcom/roblox/client/components/RbxButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lxg/b;->w0:Lih/a;

    iget-object v0, v0, Lih/a;->g:Lcom/roblox/client/components/RbxButton;

    invoke-virtual {v0, p0}, Lcom/roblox/client/components/RbxButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lxg/b;->w0:Lih/a;

    iget-object v0, v0, Lih/a;->c:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public final v2()V
    .locals 0

    invoke-virtual {p0}, Le4/k;->e2()V

    return-void
.end method

.method public final w2()V
    .locals 3

    invoke-virtual {p0}, Le4/k;->h2()Landroid/app/Dialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    new-instance v1, Landroid/graphics/Point;

    invoke-direct {v1}, Landroid/graphics/Point;-><init>()V

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/Window;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v2

    invoke-interface {v2}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/view/Display;->getSize(Landroid/graphics/Point;)V

    iget v2, v1, Landroid/graphics/Point;->x:I

    iget v1, v1, Landroid/graphics/Point;->y:I

    invoke-static {v2, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    const/16 v2, 0x3b6

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    const/4 v2, -0x2

    invoke-virtual {v0, v1, v2}, Landroid/view/Window;->setLayout(II)V

    const/16 v1, 0x11

    invoke-virtual {v0, v1}, Landroid/view/Window;->setGravity(I)V

    :cond_0
    return-void
.end method

.method public x2(Lxg/b$a;)V
    .locals 0

    iput-object p1, p0, Lxg/b;->v0:Lxg/b$a;

    return-void
.end method
