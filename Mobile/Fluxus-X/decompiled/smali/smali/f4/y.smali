.class public Lf4/y;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lf4/a0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf4/a0<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lf4/a0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf4/a0<",
            "*>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf4/y;->a:Lf4/a0;

    return-void
.end method

.method public static b(Lf4/a0;)Lf4/y;
    .locals 2
    .param p0    # Lf4/a0;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf4/a0<",
            "*>;)",
            "Lf4/y;"
        }
    .end annotation

    new-instance v0, Lf4/y;

    const-string v1, "callbacks == null"

    invoke-static {p0, v1}, Lx2/g;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lf4/a0;

    invoke-direct {v0, p0}, Lf4/y;-><init>(Lf4/a0;)V

    return-object v0
.end method


# virtual methods
.method public a(Lf4/q;)V
    .locals 2

    iget-object v0, p0, Lf4/y;->a:Lf4/a0;

    invoke-virtual {v0}, Lf4/a0;->h()Lf4/k0;

    move-result-object v0

    iget-object v1, p0, Lf4/y;->a:Lf4/a0;

    invoke-virtual {v0, v1, v1, p1}, Lf4/k0;->p(Lf4/a0;Lf4/x;Lf4/q;)V

    return-void
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, Lf4/y;->a:Lf4/a0;

    invoke-virtual {v0}, Lf4/a0;->h()Lf4/k0;

    move-result-object v0

    invoke-virtual {v0}, Lf4/k0;->C()V

    return-void
.end method

.method public d(Landroid/view/MenuItem;)Z
    .locals 1
    .param p1    # Landroid/view/MenuItem;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lf4/y;->a:Lf4/a0;

    invoke-virtual {v0}, Lf4/a0;->h()Lf4/k0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lf4/k0;->F(Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public e()V
    .locals 1

    iget-object v0, p0, Lf4/y;->a:Lf4/a0;

    invoke-virtual {v0}, Lf4/a0;->h()Lf4/k0;

    move-result-object v0

    invoke-virtual {v0}, Lf4/k0;->G()V

    return-void
.end method

.method public f()V
    .locals 1

    iget-object v0, p0, Lf4/y;->a:Lf4/a0;

    invoke-virtual {v0}, Lf4/a0;->h()Lf4/k0;

    move-result-object v0

    invoke-virtual {v0}, Lf4/k0;->I()V

    return-void
.end method

.method public g()V
    .locals 1

    iget-object v0, p0, Lf4/y;->a:Lf4/a0;

    invoke-virtual {v0}, Lf4/a0;->h()Lf4/k0;

    move-result-object v0

    invoke-virtual {v0}, Lf4/k0;->R()V

    return-void
.end method

.method public h()V
    .locals 1

    iget-object v0, p0, Lf4/y;->a:Lf4/a0;

    invoke-virtual {v0}, Lf4/a0;->h()Lf4/k0;

    move-result-object v0

    invoke-virtual {v0}, Lf4/k0;->V()V

    return-void
.end method

.method public i()V
    .locals 1

    iget-object v0, p0, Lf4/y;->a:Lf4/a0;

    invoke-virtual {v0}, Lf4/a0;->h()Lf4/k0;

    move-result-object v0

    invoke-virtual {v0}, Lf4/k0;->W()V

    return-void
.end method

.method public j()V
    .locals 1

    iget-object v0, p0, Lf4/y;->a:Lf4/a0;

    invoke-virtual {v0}, Lf4/a0;->h()Lf4/k0;

    move-result-object v0

    invoke-virtual {v0}, Lf4/k0;->Y()V

    return-void
.end method

.method public k()Z
    .locals 2

    iget-object v0, p0, Lf4/y;->a:Lf4/a0;

    invoke-virtual {v0}, Lf4/a0;->h()Lf4/k0;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lf4/k0;->f0(Z)Z

    move-result v0

    return v0
.end method

.method public l()Lf4/k0;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lf4/y;->a:Lf4/a0;

    invoke-virtual {v0}, Lf4/a0;->h()Lf4/k0;

    move-result-object v0

    return-object v0
.end method

.method public m()V
    .locals 1

    iget-object v0, p0, Lf4/y;->a:Lf4/a0;

    invoke-virtual {v0}, Lf4/a0;->h()Lf4/k0;

    move-result-object v0

    invoke-virtual {v0}, Lf4/k0;->X0()V

    return-void
.end method

.method public n(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1
    .param p2    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lf4/y;->a:Lf4/a0;

    invoke-virtual {v0}, Lf4/a0;->h()Lf4/k0;

    move-result-object v0

    invoke-virtual {v0}, Lf4/k0;->B0()Landroid/view/LayoutInflater$Factory2;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3, p4}, Landroid/view/LayoutInflater$Factory2;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method
