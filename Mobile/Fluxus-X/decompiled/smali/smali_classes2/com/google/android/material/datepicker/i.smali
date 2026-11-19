.class public final Lcom/google/android/material/datepicker/i;
.super Lcom/google/android/material/datepicker/r;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/material/datepicker/i$m;,
        Lcom/google/android/material/datepicker/i$l;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<S:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/android/material/datepicker/r<",
        "TS;>;"
    }
.end annotation


# static fields
.field public static final t0:Ljava/lang/Object;

.field public static final u0:Ljava/lang/Object;

.field public static final v0:Ljava/lang/Object;

.field public static final w0:Ljava/lang/Object;


# instance fields
.field public g0:I

.field public h0:Lcom/google/android/material/datepicker/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/material/datepicker/d<",
            "TS;>;"
        }
    .end annotation
.end field

.field public i0:Lcom/google/android/material/datepicker/a;

.field public j0:Lcom/google/android/material/datepicker/g;

.field public k0:Lcom/google/android/material/datepicker/n;

.field public l0:Lcom/google/android/material/datepicker/i$l;

.field public m0:Lcom/google/android/material/datepicker/c;

.field public n0:Landroidx/recyclerview/widget/RecyclerView;

.field public o0:Landroidx/recyclerview/widget/RecyclerView;

.field public p0:Landroid/view/View;

.field public q0:Landroid/view/View;

.field public r0:Landroid/view/View;

.field public s0:Landroid/view/View;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "MONTHS_VIEW_GROUP_TAG"

    sput-object v0, Lcom/google/android/material/datepicker/i;->t0:Ljava/lang/Object;

    const-string v0, "NAVIGATION_PREV_TAG"

    sput-object v0, Lcom/google/android/material/datepicker/i;->u0:Ljava/lang/Object;

    const-string v0, "NAVIGATION_NEXT_TAG"

    sput-object v0, Lcom/google/android/material/datepicker/i;->v0:Ljava/lang/Object;

    const-string v0, "SELECTOR_TOGGLE_TAG"

    sput-object v0, Lcom/google/android/material/datepicker/i;->w0:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/material/datepicker/r;-><init>()V

    return-void
.end method

.method public static synthetic d2(Lcom/google/android/material/datepicker/i;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 0

    iget-object p0, p0, Lcom/google/android/material/datepicker/i;->o0:Landroidx/recyclerview/widget/RecyclerView;

    return-object p0
.end method

.method public static synthetic e2(Lcom/google/android/material/datepicker/i;)Lcom/google/android/material/datepicker/a;
    .locals 0

    iget-object p0, p0, Lcom/google/android/material/datepicker/i;->i0:Lcom/google/android/material/datepicker/a;

    return-object p0
.end method

.method public static synthetic f2(Lcom/google/android/material/datepicker/i;)Lcom/google/android/material/datepicker/d;
    .locals 0

    iget-object p0, p0, Lcom/google/android/material/datepicker/i;->h0:Lcom/google/android/material/datepicker/d;

    return-object p0
.end method

.method public static synthetic g2(Lcom/google/android/material/datepicker/i;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 0

    iget-object p0, p0, Lcom/google/android/material/datepicker/i;->n0:Landroidx/recyclerview/widget/RecyclerView;

    return-object p0
.end method

.method public static synthetic h2(Lcom/google/android/material/datepicker/i;)Lcom/google/android/material/datepicker/c;
    .locals 0

    iget-object p0, p0, Lcom/google/android/material/datepicker/i;->m0:Lcom/google/android/material/datepicker/c;

    return-object p0
.end method

.method public static synthetic i2(Lcom/google/android/material/datepicker/i;)Landroid/view/View;
    .locals 0

    iget-object p0, p0, Lcom/google/android/material/datepicker/i;->s0:Landroid/view/View;

    return-object p0
.end method

.method public static synthetic j2(Lcom/google/android/material/datepicker/i;Lcom/google/android/material/datepicker/n;)Lcom/google/android/material/datepicker/n;
    .locals 0

    iput-object p1, p0, Lcom/google/android/material/datepicker/i;->k0:Lcom/google/android/material/datepicker/n;

    return-object p1
.end method

.method public static q2(Landroid/content/Context;)I
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    sget v0, Ljc/d;->Q:I

    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p0

    return p0
.end method

.method public static r2(Landroid/content/Context;)I
    .locals 5
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    sget v0, Ljc/d;->X:I

    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    sget v1, Ljc/d;->Y:I

    invoke-virtual {p0, v1}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v1

    add-int/2addr v0, v1

    sget v1, Ljc/d;->W:I

    invoke-virtual {p0, v1}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v1

    add-int/2addr v0, v1

    sget v1, Ljc/d;->S:I

    invoke-virtual {p0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    sget v2, Lcom/google/android/material/datepicker/o;->g:I

    sget v3, Ljc/d;->Q:I

    invoke-virtual {p0, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v3

    mul-int/2addr v3, v2

    add-int/lit8 v2, v2, -0x1

    sget v4, Ljc/d;->V:I

    invoke-virtual {p0, v4}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v4

    mul-int/2addr v2, v4

    add-int/2addr v3, v2

    sget v2, Ljc/d;->O:I

    invoke-virtual {p0, v2}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result p0

    add-int/2addr v0, v1

    add-int/2addr v0, v3

    add-int/2addr v0, p0

    return v0
.end method

.method public static t2(Lcom/google/android/material/datepicker/d;ILcom/google/android/material/datepicker/a;Lcom/google/android/material/datepicker/g;)Lcom/google/android/material/datepicker/i;
    .locals 3
    .param p0    # Lcom/google/android/material/datepicker/d;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/android/material/datepicker/a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/material/datepicker/d<",
            "TT;>;I",
            "Lcom/google/android/material/datepicker/a;",
            "Lcom/google/android/material/datepicker/g;",
            ")",
            "Lcom/google/android/material/datepicker/i<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/material/datepicker/i;

    invoke-direct {v0}, Lcom/google/android/material/datepicker/i;-><init>()V

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "THEME_RES_ID_KEY"

    invoke-virtual {v1, v2, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string p1, "GRID_SELECTOR_KEY"

    invoke-virtual {v1, p1, p0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string p0, "CALENDAR_CONSTRAINTS_KEY"

    invoke-virtual {v1, p0, p2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string p0, "DAY_VIEW_DECORATOR_KEY"

    invoke-virtual {v1, p0, p3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string p0, "CURRENT_MONTH_KEY"

    invoke-virtual {p2}, Lcom/google/android/material/datepicker/a;->q()Lcom/google/android/material/datepicker/n;

    move-result-object p1

    invoke-virtual {v1, p0, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    invoke-virtual {v0, v1}, Lf4/q;->O1(Landroid/os/Bundle;)V

    return-object v0
.end method


# virtual methods
.method public F0(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, Lf4/q;->F0(Landroid/os/Bundle;)V

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lf4/q;->t()Landroid/os/Bundle;

    move-result-object p1

    :cond_0
    const-string v0, "THEME_RES_ID_KEY"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/google/android/material/datepicker/i;->g0:I

    const-string v0, "GRID_SELECTOR_KEY"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/datepicker/d;

    iput-object v0, p0, Lcom/google/android/material/datepicker/i;->h0:Lcom/google/android/material/datepicker/d;

    const-string v0, "CALENDAR_CONSTRAINTS_KEY"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/datepicker/a;

    iput-object v0, p0, Lcom/google/android/material/datepicker/i;->i0:Lcom/google/android/material/datepicker/a;

    const-string v0, "DAY_VIEW_DECORATOR_KEY"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/datepicker/g;

    iput-object v0, p0, Lcom/google/android/material/datepicker/i;->j0:Lcom/google/android/material/datepicker/g;

    const-string v0, "CURRENT_MONTH_KEY"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/material/datepicker/n;

    iput-object p1, p0, Lcom/google/android/material/datepicker/i;->k0:Lcom/google/android/material/datepicker/n;

    return-void
.end method

.method public J0(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 10
    .param p1    # Landroid/view/LayoutInflater;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v6, Landroid/view/ContextThemeWrapper;

    invoke-virtual {p0}, Lf4/q;->v()Landroid/content/Context;

    move-result-object v0

    iget v2, p0, Lcom/google/android/material/datepicker/i;->g0:I

    invoke-direct {v6, v0, v2}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    new-instance v0, Lcom/google/android/material/datepicker/c;

    invoke-direct {v0, v6}, Lcom/google/android/material/datepicker/c;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/google/android/material/datepicker/i;->m0:Lcom/google/android/material/datepicker/c;

    invoke-virtual {p1, v6}, Landroid/view/LayoutInflater;->cloneInContext(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/material/datepicker/i;->i0:Lcom/google/android/material/datepicker/a;

    invoke-virtual {v2}, Lcom/google/android/material/datepicker/a;->r()Lcom/google/android/material/datepicker/n;

    move-result-object v2

    invoke-static {v6}, Lcom/google/android/material/datepicker/k;->J2(Landroid/content/Context;)Z

    move-result v3

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eqz v3, :cond_0

    sget v3, Ljc/h;->r:I

    move v5, v7

    goto :goto_0

    :cond_0
    sget v3, Ljc/h;->p:I

    move v5, v8

    :goto_0
    invoke-virtual {v0, v3, p2, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v9

    invoke-virtual {p0}, Lf4/q;->I1()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/material/datepicker/i;->r2(Landroid/content/Context;)I

    move-result v0

    invoke-virtual {v9, v0}, Landroid/view/View;->setMinimumHeight(I)V

    sget v0, Ljc/f;->y:I

    invoke-virtual {v9, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/GridView;

    new-instance v3, Lcom/google/android/material/datepicker/i$c;

    invoke-direct {v3, p0}, Lcom/google/android/material/datepicker/i$c;-><init>(Lcom/google/android/material/datepicker/i;)V

    invoke-static {v0, v3}, Landroidx/core/view/o0;->m0(Landroid/view/View;Landroidx/core/view/a;)V

    iget-object v3, p0, Lcom/google/android/material/datepicker/i;->i0:Lcom/google/android/material/datepicker/a;

    invoke-virtual {v3}, Lcom/google/android/material/datepicker/a;->o()I

    move-result v3

    new-instance v4, Lcom/google/android/material/datepicker/h;

    if-lez v3, :cond_1

    invoke-direct {v4, v3}, Lcom/google/android/material/datepicker/h;-><init>(I)V

    goto :goto_1

    :cond_1
    invoke-direct {v4}, Lcom/google/android/material/datepicker/h;-><init>()V

    :goto_1
    invoke-virtual {v0, v4}, Landroid/widget/GridView;->setAdapter(Landroid/widget/ListAdapter;)V

    iget v2, v2, Lcom/google/android/material/datepicker/n;->d:I

    invoke-virtual {v0, v2}, Landroid/widget/GridView;->setNumColumns(I)V

    invoke-virtual {v0, v8}, Landroid/view/View;->setEnabled(Z)V

    sget v0, Ljc/f;->B:I

    invoke-virtual {v9, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    iput-object v0, p0, Lcom/google/android/material/datepicker/i;->o0:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v0, Lcom/google/android/material/datepicker/i$d;

    invoke-virtual {p0}, Lf4/q;->v()Landroid/content/Context;

    move-result-object v2

    const/4 v4, 0x0

    move v3, v5

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/google/android/material/datepicker/i$d;-><init>(Lcom/google/android/material/datepicker/i;Landroid/content/Context;IZI)V

    iget-object v1, p0, Lcom/google/android/material/datepicker/i;->o0:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$q;)V

    iget-object v0, p0, Lcom/google/android/material/datepicker/i;->o0:Landroidx/recyclerview/widget/RecyclerView;

    sget-object v1, Lcom/google/android/material/datepicker/i;->t0:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    new-instance v0, Lcom/google/android/material/datepicker/p;

    iget-object v2, p0, Lcom/google/android/material/datepicker/i;->h0:Lcom/google/android/material/datepicker/d;

    iget-object v3, p0, Lcom/google/android/material/datepicker/i;->i0:Lcom/google/android/material/datepicker/a;

    iget-object v4, p0, Lcom/google/android/material/datepicker/i;->j0:Lcom/google/android/material/datepicker/g;

    new-instance v5, Lcom/google/android/material/datepicker/i$e;

    invoke-direct {v5, p0}, Lcom/google/android/material/datepicker/i$e;-><init>(Lcom/google/android/material/datepicker/i;)V

    move-object v1, v6

    invoke-direct/range {v0 .. v5}, Lcom/google/android/material/datepicker/p;-><init>(Landroid/content/Context;Lcom/google/android/material/datepicker/d;Lcom/google/android/material/datepicker/a;Lcom/google/android/material/datepicker/g;Lcom/google/android/material/datepicker/i$m;)V

    iget-object v2, p0, Lcom/google/android/material/datepicker/i;->o0:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v2, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    invoke-virtual {v1}, Landroid/view/ContextThemeWrapper;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Ljc/g;->c:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v2

    sget v3, Ljc/f;->C:I

    invoke-virtual {v9, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroidx/recyclerview/widget/RecyclerView;

    iput-object v3, p0, Lcom/google/android/material/datepicker/i;->n0:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v3, :cond_2

    invoke-virtual {v3, v7}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    iget-object v3, p0, Lcom/google/android/material/datepicker/i;->n0:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v4, Landroidx/recyclerview/widget/GridLayoutManager;

    invoke-direct {v4, v1, v2, v7, v8}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;IIZ)V

    invoke-virtual {v3, v4}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$q;)V

    iget-object v2, p0, Lcom/google/android/material/datepicker/i;->n0:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v3, Lcom/google/android/material/datepicker/v;

    invoke-direct {v3, p0}, Lcom/google/android/material/datepicker/v;-><init>(Lcom/google/android/material/datepicker/i;)V

    invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    iget-object v2, p0, Lcom/google/android/material/datepicker/i;->n0:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p0}, Lcom/google/android/material/datepicker/i;->l2()Landroidx/recyclerview/widget/RecyclerView$p;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/RecyclerView;->j(Landroidx/recyclerview/widget/RecyclerView$p;)V

    :cond_2
    sget v2, Ljc/f;->t:I

    invoke-virtual {v9, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {p0, v9, v0}, Lcom/google/android/material/datepicker/i;->k2(Landroid/view/View;Lcom/google/android/material/datepicker/p;)V

    :cond_3
    invoke-static {v1}, Lcom/google/android/material/datepicker/k;->J2(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_4

    new-instance v1, Landroidx/recyclerview/widget/o;

    invoke-direct {v1}, Landroidx/recyclerview/widget/o;-><init>()V

    iget-object v2, p0, Lcom/google/android/material/datepicker/i;->o0:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/s;->b(Landroidx/recyclerview/widget/RecyclerView;)V

    :cond_4
    iget-object v1, p0, Lcom/google/android/material/datepicker/i;->o0:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v2, p0, Lcom/google/android/material/datepicker/i;->k0:Lcom/google/android/material/datepicker/n;

    invoke-virtual {v0, v2}, Lcom/google/android/material/datepicker/p;->F(Lcom/google/android/material/datepicker/n;)I

    move-result v0

    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->t1(I)V

    invoke-virtual {p0}, Lcom/google/android/material/datepicker/i;->x2()V

    return-object v9
.end method

.method public b1(Landroid/os/Bundle;)V
    .locals 2
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-super {p0, p1}, Lf4/q;->b1(Landroid/os/Bundle;)V

    const-string v0, "THEME_RES_ID_KEY"

    iget v1, p0, Lcom/google/android/material/datepicker/i;->g0:I

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "GRID_SELECTOR_KEY"

    iget-object v1, p0, Lcom/google/android/material/datepicker/i;->h0:Lcom/google/android/material/datepicker/d;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v0, "CALENDAR_CONSTRAINTS_KEY"

    iget-object v1, p0, Lcom/google/android/material/datepicker/i;->i0:Lcom/google/android/material/datepicker/a;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v0, "DAY_VIEW_DECORATOR_KEY"

    iget-object v1, p0, Lcom/google/android/material/datepicker/i;->j0:Lcom/google/android/material/datepicker/g;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v0, "CURRENT_MONTH_KEY"

    iget-object v1, p0, Lcom/google/android/material/datepicker/i;->k0:Lcom/google/android/material/datepicker/n;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    return-void
.end method

.method public b2(Lcom/google/android/material/datepicker/q;)Z
    .locals 0
    .param p1    # Lcom/google/android/material/datepicker/q;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/material/datepicker/q<",
            "TS;>;)Z"
        }
    .end annotation

    invoke-super {p0, p1}, Lcom/google/android/material/datepicker/r;->b2(Lcom/google/android/material/datepicker/q;)Z

    move-result p1

    return p1
.end method

.method public final k2(Landroid/view/View;Lcom/google/android/material/datepicker/p;)V
    .locals 3
    .param p1    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/android/material/datepicker/p;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    sget v0, Ljc/f;->t:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/button/MaterialButton;

    sget-object v1, Lcom/google/android/material/datepicker/i;->w0:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    new-instance v1, Lcom/google/android/material/datepicker/i$h;

    invoke-direct {v1, p0}, Lcom/google/android/material/datepicker/i$h;-><init>(Lcom/google/android/material/datepicker/i;)V

    invoke-static {v0, v1}, Landroidx/core/view/o0;->m0(Landroid/view/View;Landroidx/core/view/a;)V

    sget v1, Ljc/f;->v:I

    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/material/datepicker/i;->p0:Landroid/view/View;

    sget-object v2, Lcom/google/android/material/datepicker/i;->u0:Ljava/lang/Object;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    sget v1, Ljc/f;->u:I

    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/material/datepicker/i;->q0:Landroid/view/View;

    sget-object v2, Lcom/google/android/material/datepicker/i;->v0:Ljava/lang/Object;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    sget v1, Ljc/f;->C:I

    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/material/datepicker/i;->r0:Landroid/view/View;

    sget v1, Ljc/f;->x:I

    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/material/datepicker/i;->s0:Landroid/view/View;

    sget-object p1, Lcom/google/android/material/datepicker/i$l;->a:Lcom/google/android/material/datepicker/i$l;

    invoke-virtual {p0, p1}, Lcom/google/android/material/datepicker/i;->w2(Lcom/google/android/material/datepicker/i$l;)V

    iget-object p1, p0, Lcom/google/android/material/datepicker/i;->k0:Lcom/google/android/material/datepicker/n;

    invoke-virtual {p1}, Lcom/google/android/material/datepicker/n;->u()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lcom/google/android/material/datepicker/i;->o0:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v1, Lcom/google/android/material/datepicker/i$i;

    invoke-direct {v1, p0, p2, v0}, Lcom/google/android/material/datepicker/i$i;-><init>(Lcom/google/android/material/datepicker/i;Lcom/google/android/material/datepicker/p;Lcom/google/android/material/button/MaterialButton;)V

    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->n(Landroidx/recyclerview/widget/RecyclerView$v;)V

    new-instance p1, Lcom/google/android/material/datepicker/i$j;

    invoke-direct {p1, p0}, Lcom/google/android/material/datepicker/i$j;-><init>(Lcom/google/android/material/datepicker/i;)V

    invoke-virtual {v0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p1, p0, Lcom/google/android/material/datepicker/i;->q0:Landroid/view/View;

    new-instance v0, Lcom/google/android/material/datepicker/i$k;

    invoke-direct {v0, p0, p2}, Lcom/google/android/material/datepicker/i$k;-><init>(Lcom/google/android/material/datepicker/i;Lcom/google/android/material/datepicker/p;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p1, p0, Lcom/google/android/material/datepicker/i;->p0:Landroid/view/View;

    new-instance v0, Lcom/google/android/material/datepicker/i$a;

    invoke-direct {v0, p0, p2}, Lcom/google/android/material/datepicker/i$a;-><init>(Lcom/google/android/material/datepicker/i;Lcom/google/android/material/datepicker/p;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public final l2()Landroidx/recyclerview/widget/RecyclerView$p;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lcom/google/android/material/datepicker/i$g;

    invoke-direct {v0, p0}, Lcom/google/android/material/datepicker/i$g;-><init>(Lcom/google/android/material/datepicker/i;)V

    return-object v0
.end method

.method public m2()Lcom/google/android/material/datepicker/a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/datepicker/i;->i0:Lcom/google/android/material/datepicker/a;

    return-object v0
.end method

.method public n2()Lcom/google/android/material/datepicker/c;
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/datepicker/i;->m0:Lcom/google/android/material/datepicker/c;

    return-object v0
.end method

.method public o2()Lcom/google/android/material/datepicker/n;
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/datepicker/i;->k0:Lcom/google/android/material/datepicker/n;

    return-object v0
.end method

.method public p2()Lcom/google/android/material/datepicker/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/material/datepicker/d<",
            "TS;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/material/datepicker/i;->h0:Lcom/google/android/material/datepicker/d;

    return-object v0
.end method

.method public s2()Landroidx/recyclerview/widget/LinearLayoutManager;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/google/android/material/datepicker/i;->o0:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$q;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    return-object v0
.end method

.method public final u2(I)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/material/datepicker/i;->o0:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v1, Lcom/google/android/material/datepicker/i$b;

    invoke-direct {v1, p0, p1}, Lcom/google/android/material/datepicker/i$b;-><init>(Lcom/google/android/material/datepicker/i;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public v2(Lcom/google/android/material/datepicker/n;)V
    .locals 6

    iget-object v0, p0, Lcom/google/android/material/datepicker/i;->o0:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$h;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/datepicker/p;

    invoke-virtual {v0, p1}, Lcom/google/android/material/datepicker/p;->F(Lcom/google/android/material/datepicker/n;)I

    move-result v1

    iget-object v2, p0, Lcom/google/android/material/datepicker/i;->k0:Lcom/google/android/material/datepicker/n;

    invoke-virtual {v0, v2}, Lcom/google/android/material/datepicker/p;->F(Lcom/google/android/material/datepicker/n;)I

    move-result v0

    sub-int v0, v1, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v2

    const/4 v3, 0x3

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-le v2, v3, :cond_0

    move v2, v5

    goto :goto_0

    :cond_0
    move v2, v4

    :goto_0
    if-lez v0, :cond_1

    move v4, v5

    :cond_1
    iput-object p1, p0, Lcom/google/android/material/datepicker/i;->k0:Lcom/google/android/material/datepicker/n;

    if-eqz v2, :cond_2

    if-eqz v4, :cond_2

    iget-object p1, p0, Lcom/google/android/material/datepicker/i;->o0:Landroidx/recyclerview/widget/RecyclerView;

    add-int/lit8 v0, v1, -0x3

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->t1(I)V

    invoke-virtual {p0, v1}, Lcom/google/android/material/datepicker/i;->u2(I)V

    return-void

    :cond_2
    if-eqz v2, :cond_3

    iget-object p1, p0, Lcom/google/android/material/datepicker/i;->o0:Landroidx/recyclerview/widget/RecyclerView;

    add-int/lit8 v0, v1, 0x3

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->t1(I)V

    invoke-virtual {p0, v1}, Lcom/google/android/material/datepicker/i;->u2(I)V

    return-void

    :cond_3
    invoke-virtual {p0, v1}, Lcom/google/android/material/datepicker/i;->u2(I)V

    return-void
.end method

.method public w2(Lcom/google/android/material/datepicker/i$l;)V
    .locals 4

    iput-object p1, p0, Lcom/google/android/material/datepicker/i;->l0:Lcom/google/android/material/datepicker/i$l;

    sget-object v0, Lcom/google/android/material/datepicker/i$l;->b:Lcom/google/android/material/datepicker/i$l;

    const/16 v1, 0x8

    const/4 v2, 0x0

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lcom/google/android/material/datepicker/i;->n0:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$q;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/material/datepicker/i;->n0:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$h;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/datepicker/v;

    iget-object v3, p0, Lcom/google/android/material/datepicker/i;->k0:Lcom/google/android/material/datepicker/n;

    iget v3, v3, Lcom/google/android/material/datepicker/n;->c:I

    invoke-virtual {v0, v3}, Lcom/google/android/material/datepicker/v;->E(I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView$q;->C1(I)V

    iget-object p1, p0, Lcom/google/android/material/datepicker/i;->r0:Landroid/view/View;

    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lcom/google/android/material/datepicker/i;->s0:Landroid/view/View;

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lcom/google/android/material/datepicker/i;->p0:Landroid/view/View;

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lcom/google/android/material/datepicker/i;->q0:Landroid/view/View;

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_0
    sget-object v0, Lcom/google/android/material/datepicker/i$l;->a:Lcom/google/android/material/datepicker/i$l;

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lcom/google/android/material/datepicker/i;->r0:Landroid/view/View;

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lcom/google/android/material/datepicker/i;->s0:Landroid/view/View;

    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lcom/google/android/material/datepicker/i;->p0:Landroid/view/View;

    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lcom/google/android/material/datepicker/i;->q0:Landroid/view/View;

    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lcom/google/android/material/datepicker/i;->k0:Lcom/google/android/material/datepicker/n;

    invoke-virtual {p0, p1}, Lcom/google/android/material/datepicker/i;->v2(Lcom/google/android/material/datepicker/n;)V

    :cond_1
    return-void
.end method

.method public final x2()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/material/datepicker/i;->o0:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v1, Lcom/google/android/material/datepicker/i$f;

    invoke-direct {v1, p0}, Lcom/google/android/material/datepicker/i$f;-><init>(Lcom/google/android/material/datepicker/i;)V

    invoke-static {v0, v1}, Landroidx/core/view/o0;->m0(Landroid/view/View;Landroidx/core/view/a;)V

    return-void
.end method

.method public y2()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/material/datepicker/i;->l0:Lcom/google/android/material/datepicker/i$l;

    sget-object v1, Lcom/google/android/material/datepicker/i$l;->b:Lcom/google/android/material/datepicker/i$l;

    if-ne v0, v1, :cond_0

    sget-object v0, Lcom/google/android/material/datepicker/i$l;->a:Lcom/google/android/material/datepicker/i$l;

    invoke-virtual {p0, v0}, Lcom/google/android/material/datepicker/i;->w2(Lcom/google/android/material/datepicker/i$l;)V

    return-void

    :cond_0
    sget-object v2, Lcom/google/android/material/datepicker/i$l;->a:Lcom/google/android/material/datepicker/i$l;

    if-ne v0, v2, :cond_1

    invoke-virtual {p0, v1}, Lcom/google/android/material/datepicker/i;->w2(Lcom/google/android/material/datepicker/i$l;)V

    :cond_1
    return-void
.end method
