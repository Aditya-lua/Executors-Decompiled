.class public Lxi/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxi/f$e;
    }
.end annotation


# instance fields
.field public a:Landroidx/fragment/app/c;

.field public b:Landroid/view/MenuItem;

.field public c:Landroid/view/Menu;

.field public d:Lcom/roblox/client/components/RobloxToolbar;

.field public e:Lxi/f$e;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxi/f;->a:Landroidx/fragment/app/c;

    return-void
.end method

.method public static bridge synthetic a(Lxi/f;)Landroidx/fragment/app/c;
    .locals 0

    iget-object p0, p0, Lxi/f;->a:Landroidx/fragment/app/c;

    return-object p0
.end method

.method public static bridge synthetic b(Lxi/f;)Landroid/view/Menu;
    .locals 0

    iget-object p0, p0, Lxi/f;->c:Landroid/view/Menu;

    return-object p0
.end method

.method public static bridge synthetic c(Lxi/f;)Lxi/f$e;
    .locals 0

    iget-object p0, p0, Lxi/f;->e:Lxi/f$e;

    return-object p0
.end method

.method public static bridge synthetic d(Lxi/f;)Lcom/roblox/client/components/RobloxToolbar;
    .locals 0

    iget-object p0, p0, Lxi/f;->d:Lcom/roblox/client/components/RobloxToolbar;

    return-object p0
.end method

.method public static bridge synthetic e(Lxi/f;)Landroid/view/MenuItem;
    .locals 0

    iget-object p0, p0, Lxi/f;->b:Landroid/view/MenuItem;

    return-object p0
.end method

.method public static bridge synthetic f(Lxi/f;)I
    .locals 0

    invoke-virtual {p0}, Lxi/f;->i()I

    move-result p0

    return p0
.end method

.method public static bridge synthetic g(Lxi/f;ILjava/lang/String;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lxi/f;->l(ILjava/lang/String;)V

    return-void
.end method

.method public static bridge synthetic h(Lxi/f;Landroid/view/Menu;Landroid/view/MenuItem;Z)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lxi/f;->m(Landroid/view/Menu;Landroid/view/MenuItem;Z)V

    return-void
.end method


# virtual methods
.method public final i()I
    .locals 2

    iget-object v0, p0, Lxi/f;->e:Lxi/f$e;

    invoke-interface {v0}, Ldk/c;->getTheme()Lol/a;

    move-result-object v0

    sget-object v1, Lxi/f$d;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    sget v0, Lsg/l0;->o:I

    return v0

    :cond_0
    sget v0, Lsg/l0;->n:I

    return v0

    :cond_1
    sget v0, Lsg/l0;->p:I

    return v0
.end method

.method public final j()I
    .locals 2

    iget-object v0, p0, Lxi/f;->e:Lxi/f$e;

    invoke-interface {v0}, Ldk/c;->getTheme()Lol/a;

    move-result-object v0

    sget-object v1, Lxi/f$d;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    sget v0, Lsg/l0;->A:I

    return v0

    :cond_0
    sget v0, Lsg/l0;->z:I

    return v0

    :cond_1
    sget v0, Lsg/l0;->B:I

    return v0
.end method

.method public k(Landroid/view/Menu;Landroid/view/MenuInflater;)Landroid/view/MenuItem;
    .locals 1

    sget v0, Lsg/o0;->c:I

    invoke-virtual {p2, v0, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    sget p2, Lsg/m0;->c:I

    invoke-interface {p1, p2}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object p1

    iput-object p1, p0, Lxi/f;->b:Landroid/view/MenuItem;

    iget-object p2, p0, Lxi/f;->a:Landroidx/fragment/app/c;

    invoke-virtual {p2}, Landroidx/fragment/app/c;->T()Landroid/content/res/Resources;

    move-result-object p2

    invoke-virtual {p0}, Lxi/f;->j()I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    invoke-interface {p1, p2}, Landroid/view/MenuItem;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;

    invoke-virtual {p0}, Lxi/f;->q()V

    iget-object p1, p0, Lxi/f;->b:Landroid/view/MenuItem;

    return-object p1
.end method

.method public final l(ILjava/lang/String;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "reportEvents: searchType = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", buttonEvent = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "SearchMenuOption"

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x1

    const-string v1, "nativeMain"

    if-eq p1, v0, :cond_3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    const/4 v0, 0x4

    if-eq p1, v0, :cond_0

    return-void

    :cond_0
    const-string p1, "nativeMain|friends"

    invoke-static {p1, p2}, Lsg/t0;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    const-string p1, "catalog"

    invoke-static {v1, p2, p1}, Lsg/t0;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_2
    const-string p1, "games"

    invoke-static {v1, p2, p1}, Lsg/t0;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_3
    const-string p1, "users"

    invoke-static {v1, p2, p1}, Lsg/t0;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final m(Landroid/view/Menu;Landroid/view/MenuItem;Z)V
    .locals 2

    if-eqz p1, :cond_1

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p1}, Landroid/view/Menu;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    invoke-interface {p1, v0}, Landroid/view/Menu;->getItem(I)Landroid/view/MenuItem;

    move-result-object v1

    if-eq v1, p2, :cond_0

    invoke-interface {v1, p3}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public n(Landroid/view/Menu;)V
    .locals 0

    iput-object p1, p0, Lxi/f;->c:Landroid/view/Menu;

    return-void
.end method

.method public o(Lxi/f$e;)V
    .locals 0

    iput-object p1, p0, Lxi/f;->e:Lxi/f$e;

    return-void
.end method

.method public p(Lcom/roblox/client/components/RobloxToolbar;)V
    .locals 0

    iput-object p1, p0, Lxi/f;->d:Lcom/roblox/client/components/RobloxToolbar;

    return-void
.end method

.method public final q()V
    .locals 4

    iget-object v0, p0, Lxi/f;->b:Landroid/view/MenuItem;

    invoke-interface {v0}, Landroid/view/MenuItem;->getActionView()Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/SearchView;

    iget-object v1, p0, Lxi/f;->b:Landroid/view/MenuItem;

    new-instance v2, Lxi/f$a;

    invoke-direct {v2, p0, v0}, Lxi/f$a;-><init>(Lxi/f;Landroidx/appcompat/widget/SearchView;)V

    invoke-interface {v1, v2}, Landroid/view/MenuItem;->setOnActionExpandListener(Landroid/view/MenuItem$OnActionExpandListener;)Landroid/view/MenuItem;

    sget v1, Li/f;->I:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/EditText;

    const/high16 v2, -0x1000000

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    const v2, -0x777778

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setHintTextColor(I)V

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "SourceSansPro-Regular.ttf"

    invoke-static {v1, v2, v3}, Leh/e;->d(Landroid/widget/TextView;Landroid/content/Context;Ljava/lang/String;)V

    sget v2, Li/f;->H:I

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    sget v3, Lsg/l0;->m:I

    invoke-virtual {v2, v3}, Landroid/view/View;->setBackgroundResource(I)V

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    sget v3, Lsg/q0;->C1:I

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroidx/appcompat/widget/SearchView;->setQueryHint(Ljava/lang/CharSequence;)V

    new-instance v2, Lxi/f$b;

    invoke-direct {v2, p0, v0}, Lxi/f$b;-><init>(Lxi/f;Landroidx/appcompat/widget/SearchView;)V

    invoke-virtual {v0, v2}, Landroidx/appcompat/widget/SearchView;->setOnQueryTextListener(Landroidx/appcompat/widget/SearchView$m;)V

    new-instance v0, Lxi/f$c;

    invoke-direct {v0, p0}, Lxi/f$c;-><init>(Lxi/f;)V

    invoke-virtual {v1, v0}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    return-void
.end method

.method public r()V
    .locals 2

    iget-object v0, p0, Lxi/f;->b:Landroid/view/MenuItem;

    invoke-interface {v0}, Landroid/view/MenuItem;->getActionView()Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/SearchView;

    iget-object v1, p0, Lxi/f;->e:Lxi/f$e;

    invoke-interface {v1}, Lxi/f$e;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/SearchView;->setQueryHint(Ljava/lang/CharSequence;)V

    invoke-static {}, Lgk/t;->j()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lxi/f;->e:Lxi/f$e;

    invoke-interface {v0}, Lxi/f$e;->d()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    iget-object v1, p0, Lxi/f;->b:Landroid/view/MenuItem;

    invoke-interface {v1, v0}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    iget-object v1, p0, Lxi/f;->b:Landroid/view/MenuItem;

    invoke-interface {v1, v0}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    return-void
.end method
