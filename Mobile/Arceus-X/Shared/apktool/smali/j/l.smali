.class public Lj/l;
.super Le/w;
.source "SourceFile"

# interfaces
.implements Lj/c;


# instance fields
.field public e:Lj/e;

.field public final f:Landroidx/core/view/l$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {p1, p2}, Lj/l;->m(Landroid/content/Context;I)I

    move-result v0

    invoke-direct {p0, p1, v0}, Le/w;-><init>(Landroid/content/Context;I)V

    new-instance v0, Lj/k;

    invoke-direct {v0, p0}, Lj/k;-><init>(Lj/l;)V

    iput-object v0, p0, Lj/l;->f:Landroidx/core/view/l$a;

    invoke-virtual {p0}, Lj/l;->l()Lj/e;

    move-result-object v0

    invoke-static {p1, p2}, Lj/l;->m(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {v0, p1}, Lj/e;->K(I)V

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Lj/e;->w(Landroid/os/Bundle;)V

    return-void
.end method

.method private static m(Landroid/content/Context;I)I
    .locals 2

    if-nez p1, :cond_0

    new-instance p1, Landroid/util/TypedValue;

    invoke-direct {p1}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p0

    sget v0, Li/a;->B:I

    const/4 v1, 0x1

    invoke-virtual {p0, v0, p1, v1}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget p0, p1, Landroid/util/TypedValue;->resourceId:I

    return p0

    :cond_0
    return p1
.end method


# virtual methods
.method public M(Lo/b;)V
    .locals 0

    return-void
.end method

.method public addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p0}, Le/w;->h()V

    invoke-virtual {p0}, Lj/l;->l()Lj/e;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lj/e;->e(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public dismiss()V
    .locals 1

    invoke-super {p0}, Landroid/app/Dialog;->dismiss()V

    invoke-virtual {p0}, Lj/l;->l()Lj/e;

    move-result-object v0

    invoke-virtual {v0}, Lj/e;->x()V

    return-void
.end method

.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 2

    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lj/l;->f:Landroidx/core/view/l$a;

    invoke-static {v1, v0, p0, p1}, Landroidx/core/view/l;->e(Landroidx/core/view/l$a;Landroid/view/View;Landroid/view/Window$Callback;Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public findViewById(I)Landroid/view/View;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/view/View;",
            ">(I)TT;"
        }
    .end annotation

    invoke-virtual {p0}, Lj/l;->l()Lj/e;

    move-result-object v0

    invoke-virtual {v0, p1}, Lj/e;->j(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public invalidateOptionsMenu()V
    .locals 1

    invoke-virtual {p0}, Lj/l;->l()Lj/e;

    move-result-object v0

    invoke-virtual {v0}, Lj/e;->t()V

    return-void
.end method

.method public l()Lj/e;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lj/l;->e:Lj/e;

    if-nez v0, :cond_0

    invoke-static {p0, p0}, Lj/e;->i(Landroid/app/Dialog;Lj/c;)Lj/e;

    move-result-object v0

    iput-object v0, p0, Lj/l;->e:Lj/e;

    :cond_0
    iget-object v0, p0, Lj/l;->e:Lj/e;

    return-object v0
.end method

.method public n(Landroid/view/KeyEvent;)Z
    .locals 0

    invoke-super {p0, p1}, Landroid/app/Dialog;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public o(I)Z
    .locals 1

    invoke-virtual {p0}, Lj/l;->l()Lj/e;

    move-result-object v0

    invoke-virtual {v0, p1}, Lj/e;->F(I)Z

    move-result p1

    return p1
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    invoke-virtual {p0}, Lj/l;->l()Lj/e;

    move-result-object v0

    invoke-virtual {v0}, Lj/e;->s()V

    invoke-super {p0, p1}, Le/w;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Lj/l;->l()Lj/e;

    move-result-object v0

    invoke-virtual {v0, p1}, Lj/e;->w(Landroid/os/Bundle;)V

    return-void
.end method

.method public onStop()V
    .locals 1

    invoke-super {p0}, Le/w;->onStop()V

    invoke-virtual {p0}, Lj/l;->l()Lj/e;

    move-result-object v0

    invoke-virtual {v0}, Lj/e;->C()V

    return-void
.end method

.method public s(Lo/b$a;)Lo/b;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public setContentView(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Le/w;->h()V

    .line 2
    invoke-virtual {p0}, Lj/l;->l()Lj/e;

    move-result-object v0

    invoke-virtual {v0, p1}, Lj/e;->G(I)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 3
    invoke-virtual {p0}, Le/w;->h()V

    .line 4
    invoke-virtual {p0}, Lj/l;->l()Lj/e;

    move-result-object v0

    invoke-virtual {v0, p1}, Lj/e;->H(Landroid/view/View;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 5
    invoke-virtual {p0}, Le/w;->h()V

    .line 6
    invoke-virtual {p0}, Lj/l;->l()Lj/e;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lj/e;->I(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public setTitle(I)V
    .locals 2

    .line 3
    invoke-super {p0, p1}, Landroid/app/Dialog;->setTitle(I)V

    .line 4
    invoke-virtual {p0}, Lj/l;->l()Lj/e;

    move-result-object v0

    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lj/e;->L(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setTitle(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/app/Dialog;->setTitle(Ljava/lang/CharSequence;)V

    .line 2
    invoke-virtual {p0}, Lj/l;->l()Lj/e;

    move-result-object v0

    invoke-virtual {v0, p1}, Lj/e;->L(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public x(Lo/b;)V
    .locals 0

    return-void
.end method
