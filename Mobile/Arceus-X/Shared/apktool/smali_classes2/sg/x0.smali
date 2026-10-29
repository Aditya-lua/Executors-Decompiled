.class public Lsg/x0;
.super Le4/k;
.source "SourceFile"

# interfaces
.implements Ldk/e$b;


# instance fields
.field public A0:I

.field public B0:I

.field public C0:I

.field public D0:I

.field public E0:I

.field public F0:Ldk/e;

.field public G0:Lmi/c;

.field public final v0:Ljava/lang/String;

.field public final w0:Ljava/lang/String;

.field public final x0:Ljava/lang/String;

.field public final y0:Ljava/lang/String;

.field public final z0:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Le4/k;-><init>()V

    const-string v0, "dialogHeight"

    iput-object v0, p0, Lsg/x0;->v0:Ljava/lang/String;

    const-string v0, "dialogWidth"

    iput-object v0, p0, Lsg/x0;->w0:Ljava/lang/String;

    const-string v0, "dialogGravity"

    iput-object v0, p0, Lsg/x0;->x0:Ljava/lang/String;

    const-string v0, "dialogOffsetY"

    iput-object v0, p0, Lsg/x0;->y0:Ljava/lang/String;

    const-string v0, "dialogOffsetX"

    iput-object v0, p0, Lsg/x0;->z0:Ljava/lang/String;

    const/4 v0, 0x0

    iput v0, p0, Lsg/x0;->A0:I

    iput v0, p0, Lsg/x0;->B0:I

    iput v0, p0, Lsg/x0;->C0:I

    iput v0, p0, Lsg/x0;->D0:I

    iput v0, p0, Lsg/x0;->E0:I

    invoke-virtual {p0}, Lsg/x0;->w2()Lmi/c;

    move-result-object v0

    iput-object v0, p0, Lsg/x0;->G0:Lmi/c;

    return-void
.end method


# virtual methods
.method public F0(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Le4/k;->F0(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroidx/fragment/app/c;->t()Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_0

    const-string v0, "dialogHeight"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lsg/x0;->A0:I

    const-string v0, "dialogWidth"

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lsg/x0;->B0:I

    const-string v0, "dialogGravity"

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lsg/x0;->C0:I

    const-string v0, "dialogOffsetY"

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lsg/x0;->D0:I

    const-string v0, "dialogOffsetX"

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result p1

    iput p1, p0, Lsg/x0;->E0:I

    :cond_0
    return-void
.end method

.method public U(I)V
    .locals 2

    invoke-virtual {p0}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object v0

    instance-of v1, v0, Lcom/roblox/client/b;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/roblox/client/b;

    invoke-virtual {v0, p1}, Lcom/roblox/client/b;->U(I)V

    :cond_0
    return-void
.end method

.method public W(Ljava/lang/String;)V
    .locals 2

    invoke-virtual {p0}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object v0

    instance-of v1, v0, Lcom/roblox/client/b;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/roblox/client/b;

    invoke-virtual {v0, p1}, Lcom/roblox/client/b;->W(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public c1()V
    .locals 0

    invoke-super {p0}, Le4/k;->c1()V

    return-void
.end method

.method public d1()V
    .locals 0

    invoke-super {p0}, Le4/k;->d1()V

    return-void
.end method

.method public e1(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-super {p0, p1, p2}, Landroidx/fragment/app/c;->e1(Landroid/view/View;Landroid/os/Bundle;)V

    new-instance p1, Ldk/e;

    invoke-direct {p1, p0}, Ldk/e;-><init>(Ldk/e$b;)V

    iput-object p1, p0, Lsg/x0;->F0:Ldk/e;

    invoke-virtual {p0}, Landroidx/fragment/app/c;->k0()Landroidx/lifecycle/s;

    move-result-object p2

    invoke-virtual {p1, p2}, Ldk/e;->b(Landroidx/lifecycle/s;)V

    return-void
.end method

.method public u(Lol/a;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ".onThemeChanged() "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.theme"

    invoke-static {v1, v0}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lsg/x0;->G0:Lmi/c;

    if-eqz v0, :cond_2

    sget-object v0, Lsg/x0$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    invoke-virtual {p0}, Landroidx/fragment/app/c;->T()Landroid/content/res/Resources;

    move-result-object p1

    sget v0, Lsg/j0;->h:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/c;->T()Landroid/content/res/Resources;

    move-result-object p1

    sget v0, Lsg/j0;->a:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Landroidx/fragment/app/c;->T()Landroid/content/res/Resources;

    move-result-object p1

    sget v0, Lsg/j0;->o:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    :goto_0
    iget-object v0, p0, Lsg/x0;->G0:Lmi/c;

    invoke-virtual {v0, p1}, Lmi/c;->l(I)V

    :cond_2
    return-void
.end method

.method public u2()Z
    .locals 2

    invoke-virtual {p0}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object v0

    instance-of v1, v0, Lcom/roblox/client/a;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/roblox/client/a;

    invoke-virtual {v0}, Lcom/roblox/client/a;->N1()Z

    move-result v0

    return v0

    :cond_0
    const-string v0, "roblox.app"

    const-string v1, "The activity containing this fragment must be of type RobloxActivity!"

    invoke-static {v0, v1}, Lgk/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    return v0
.end method

.method public declared-synchronized v2(Ljava/lang/CharSequence;)V
    .locals 8

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    new-instance v0, Landroidx/appcompat/app/a$a;

    invoke-direct {v0, v1}, Landroidx/appcompat/app/a$a;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Landroidx/appcompat/app/a$a;->a()Landroidx/appcompat/app/a;

    move-result-object v6

    new-instance v7, Landroid/widget/TextView;

    invoke-direct {v7, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    sget v0, Lsg/q0;->W:I

    invoke-virtual {v1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v4

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v0

    add-int v5, v4, v0

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Lhk/c;

    const/4 v2, 0x0

    invoke-direct/range {v0 .. v5}, Lhk/c;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)V

    const/4 v1, 0x1

    new-array v2, v1, [Lhk/a;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    invoke-static {v7, p1, v2}, Lhk/b;->b(Landroid/widget/TextView;Ljava/lang/String;[Lhk/a;)V

    const/high16 p1, 0x41a00000    # 20.0f

    invoke-virtual {v7, p1}, Landroid/widget/TextView;->setTextSize(F)V

    const/4 p1, 0x0

    invoke-virtual {v7, p1}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    move-object v2, v6

    const/16 v6, 0x96

    move-object v3, v7

    const/16 v7, 0x64

    const/16 v4, 0x96

    const/16 v5, 0x64

    invoke-virtual/range {v2 .. v7}, Landroidx/appcompat/app/a;->w(Landroid/view/View;IIII)V

    invoke-virtual {v2, v1}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {v2}, Landroid/app/Dialog;->show()V
    :try_end_2
    .catch Landroid/view/WindowManager$BadTokenException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_1

    :catch_0
    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1
.end method

.method public w2()Lmi/c;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public x2(Landroid/view/LayoutInflater;Landroid/view/View;)Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lsg/x0;->G0:Lmi/c;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p0}, Lmi/c;->i(Landroid/view/LayoutInflater;Landroidx/fragment/app/c;)Landroid/view/View;

    move-result-object p1

    iget-object v0, p0, Lsg/x0;->G0:Lmi/c;

    invoke-virtual {v0}, Lmi/c;->g()Landroid/view/ViewGroup;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-object p1

    :cond_0
    return-object p2
.end method

.method public y2(II)V
    .locals 2

    invoke-virtual {p0}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object v0

    instance-of v1, v0, Lcom/roblox/client/b;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/roblox/client/b;

    invoke-virtual {v0, p1, p2}, Lcom/roblox/client/b;->K1(II)V

    :cond_0
    return-void
.end method

.method public z0(Landroid/os/Bundle;)V
    .locals 3

    invoke-super {p0, p1}, Le4/k;->z0(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Le4/k;->h2()Landroid/app/Dialog;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_2

    iget v1, p0, Lsg/x0;->A0:I

    if-eqz v1, :cond_1

    iget v2, p0, Lsg/x0;->B0:I

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, -0x2

    :goto_0
    invoke-virtual {v0, v2, v1}, Landroid/view/Window;->setLayout(II)V

    :cond_1
    iget v1, p0, Lsg/x0;->C0:I

    invoke-virtual {v0, v1}, Landroid/view/Window;->setGravity(I)V

    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v1

    iget v2, p0, Lsg/x0;->D0:I

    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->y:I

    iget v2, p0, Lsg/x0;->E0:I

    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->x:I

    invoke-virtual {v0, v1}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    :cond_2
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    :cond_3
    return-void
.end method

.method public z2(Ljava/lang/String;I)V
    .locals 2

    invoke-virtual {p0}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object v0

    instance-of v1, v0, Lcom/roblox/client/b;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/roblox/client/b;

    invoke-virtual {v0, p1, p2}, Lcom/roblox/client/b;->L1(Ljava/lang/String;I)V

    :cond_0
    return-void
.end method
