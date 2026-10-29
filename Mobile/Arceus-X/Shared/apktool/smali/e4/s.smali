.class public Le4/s;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Le4/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le4/t<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Le4/t;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le4/t<",
            "*>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le4/s;->a:Le4/t;

    return-void
.end method

.method public static b(Le4/t;)Le4/s;
    .locals 2
    .param p0    # Le4/t;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le4/t<",
            "*>;)",
            "Le4/s;"
        }
    .end annotation

    new-instance v0, Le4/s;

    const-string v1, "callbacks == null"

    invoke-static {p0, v1}, Lx2/g;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Le4/t;

    invoke-direct {v0, p0}, Le4/s;-><init>(Le4/t;)V

    return-object v0
.end method


# virtual methods
.method public a(Landroidx/fragment/app/c;)V
    .locals 2

    iget-object v0, p0, Le4/s;->a:Le4/t;

    invoke-virtual {v0}, Le4/t;->h()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    iget-object v1, p0, Le4/s;->a:Le4/t;

    invoke-virtual {v0, v1, v1, p1}, Landroidx/fragment/app/FragmentManager;->p(Le4/t;Le4/r;Landroidx/fragment/app/c;)V

    return-void
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, Le4/s;->a:Le4/t;

    invoke-virtual {v0}, Le4/t;->h()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->C()V

    return-void
.end method

.method public d(Landroid/view/MenuItem;)Z
    .locals 1
    .param p1    # Landroid/view/MenuItem;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Le4/s;->a:Le4/t;

    invoke-virtual {v0}, Le4/t;->h()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/fragment/app/FragmentManager;->F(Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public e()V
    .locals 1

    iget-object v0, p0, Le4/s;->a:Le4/t;

    invoke-virtual {v0}, Le4/t;->h()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->G()V

    return-void
.end method

.method public f()V
    .locals 1

    iget-object v0, p0, Le4/s;->a:Le4/t;

    invoke-virtual {v0}, Le4/t;->h()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->I()V

    return-void
.end method

.method public g()V
    .locals 1

    iget-object v0, p0, Le4/s;->a:Le4/t;

    invoke-virtual {v0}, Le4/t;->h()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->R()V

    return-void
.end method

.method public h()V
    .locals 1

    iget-object v0, p0, Le4/s;->a:Le4/t;

    invoke-virtual {v0}, Le4/t;->h()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->V()V

    return-void
.end method

.method public i()V
    .locals 1

    iget-object v0, p0, Le4/s;->a:Le4/t;

    invoke-virtual {v0}, Le4/t;->h()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->W()V

    return-void
.end method

.method public j()V
    .locals 1

    iget-object v0, p0, Le4/s;->a:Le4/t;

    invoke-virtual {v0}, Le4/t;->h()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->Y()V

    return-void
.end method

.method public k()Z
    .locals 2

    iget-object v0, p0, Le4/s;->a:Le4/t;

    invoke-virtual {v0}, Le4/t;->h()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/fragment/app/FragmentManager;->f0(Z)Z

    move-result v0

    return v0
.end method

.method public l()Landroidx/fragment/app/FragmentManager;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Le4/s;->a:Le4/t;

    invoke-virtual {v0}, Le4/t;->h()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    return-object v0
.end method

.method public m()V
    .locals 1

    iget-object v0, p0, Le4/s;->a:Le4/t;

    invoke-virtual {v0}, Le4/t;->h()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->X0()V

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

    iget-object v0, p0, Le4/s;->a:Le4/t;

    invoke-virtual {v0}, Le4/t;->h()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->B0()Landroid/view/LayoutInflater$Factory2;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3, p4}, Landroid/view/LayoutInflater$Factory2;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method
