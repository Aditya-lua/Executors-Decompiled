.class public Lcom/google/android/material/datepicker/p;
.super Landroidx/recyclerview/widget/RecyclerView$h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/material/datepicker/p$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$h<",
        "Lcom/google/android/material/datepicker/p$b;",
        ">;"
    }
.end annotation


# instance fields
.field public final d:Lcom/google/android/material/datepicker/a;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final e:Lcom/google/android/material/datepicker/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/material/datepicker/d<",
            "*>;"
        }
    .end annotation
.end field

.field public final f:Lcom/google/android/material/datepicker/g;

.field public final g:Lcom/google/android/material/datepicker/i$m;

.field public final h:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/material/datepicker/d;Lcom/google/android/material/datepicker/a;Lcom/google/android/material/datepicker/g;Lcom/google/android/material/datepicker/i$m;)V
    .locals 3
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/google/android/material/datepicker/a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/google/android/material/datepicker/d<",
            "*>;",
            "Lcom/google/android/material/datepicker/a;",
            "Lcom/google/android/material/datepicker/g;",
            "Lcom/google/android/material/datepicker/i$m;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$h;-><init>()V

    invoke-virtual {p3}, Lcom/google/android/material/datepicker/a;->r()Lcom/google/android/material/datepicker/n;

    move-result-object v0

    invoke-virtual {p3}, Lcom/google/android/material/datepicker/a;->n()Lcom/google/android/material/datepicker/n;

    move-result-object v1

    invoke-virtual {p3}, Lcom/google/android/material/datepicker/a;->q()Lcom/google/android/material/datepicker/n;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/google/android/material/datepicker/n;->a(Lcom/google/android/material/datepicker/n;)I

    move-result v0

    if-gtz v0, :cond_2

    invoke-virtual {v2, v1}, Lcom/google/android/material/datepicker/n;->a(Lcom/google/android/material/datepicker/n;)I

    move-result v0

    if-gtz v0, :cond_1

    sget v0, Lcom/google/android/material/datepicker/o;->g:I

    invoke-static {p1}, Lcom/google/android/material/datepicker/i;->q2(Landroid/content/Context;)I

    move-result v1

    mul-int/2addr v0, v1

    invoke-static {p1}, Lcom/google/android/material/datepicker/k;->J2(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p1}, Lcom/google/android/material/datepicker/i;->q2(Landroid/content/Context;)I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    add-int/2addr v0, p1

    iput v0, p0, Lcom/google/android/material/datepicker/p;->h:I

    iput-object p3, p0, Lcom/google/android/material/datepicker/p;->d:Lcom/google/android/material/datepicker/a;

    iput-object p2, p0, Lcom/google/android/material/datepicker/p;->e:Lcom/google/android/material/datepicker/d;

    iput-object p4, p0, Lcom/google/android/material/datepicker/p;->f:Lcom/google/android/material/datepicker/g;

    iput-object p5, p0, Lcom/google/android/material/datepicker/p;->g:Lcom/google/android/material/datepicker/i$m;

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$h;->A(Z)V

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "currentPage cannot be after lastPage"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "firstPage cannot be after currentPage"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic C(Lcom/google/android/material/datepicker/p;)Lcom/google/android/material/datepicker/i$m;
    .locals 0

    iget-object p0, p0, Lcom/google/android/material/datepicker/p;->g:Lcom/google/android/material/datepicker/i$m;

    return-object p0
.end method


# virtual methods
.method public D(I)Lcom/google/android/material/datepicker/n;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/google/android/material/datepicker/p;->d:Lcom/google/android/material/datepicker/a;

    invoke-virtual {v0}, Lcom/google/android/material/datepicker/a;->r()Lcom/google/android/material/datepicker/n;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/material/datepicker/n;->w(I)Lcom/google/android/material/datepicker/n;

    move-result-object p1

    return-object p1
.end method

.method public E(I)Ljava/lang/CharSequence;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-virtual {p0, p1}, Lcom/google/android/material/datepicker/p;->D(I)Lcom/google/android/material/datepicker/n;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/material/datepicker/n;->u()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public F(Lcom/google/android/material/datepicker/n;)I
    .locals 1
    .param p1    # Lcom/google/android/material/datepicker/n;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/google/android/material/datepicker/p;->d:Lcom/google/android/material/datepicker/a;

    invoke-virtual {v0}, Lcom/google/android/material/datepicker/a;->r()Lcom/google/android/material/datepicker/n;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/material/datepicker/n;->x(Lcom/google/android/material/datepicker/n;)I

    move-result p1

    return p1
.end method

.method public G(Lcom/google/android/material/datepicker/p$b;I)V
    .locals 4
    .param p1    # Lcom/google/android/material/datepicker/p$b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/google/android/material/datepicker/p;->d:Lcom/google/android/material/datepicker/a;

    invoke-virtual {v0}, Lcom/google/android/material/datepicker/a;->r()Lcom/google/android/material/datepicker/n;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/google/android/material/datepicker/n;->w(I)Lcom/google/android/material/datepicker/n;

    move-result-object p2

    iget-object v0, p1, Lcom/google/android/material/datepicker/p$b;->u:Landroid/widget/TextView;

    invoke-virtual {p2}, Lcom/google/android/material/datepicker/n;->u()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p1, Lcom/google/android/material/datepicker/p$b;->v:Lcom/google/android/material/datepicker/MaterialCalendarGridView;

    sget v0, Ljc/f;->s:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/google/android/material/datepicker/MaterialCalendarGridView;

    invoke-virtual {p1}, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->b()Lcom/google/android/material/datepicker/o;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->b()Lcom/google/android/material/datepicker/o;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/material/datepicker/o;->a:Lcom/google/android/material/datepicker/n;

    invoke-virtual {p2, v0}, Lcom/google/android/material/datepicker/n;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    invoke-virtual {p1}, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->b()Lcom/google/android/material/datepicker/o;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/google/android/material/datepicker/o;->q(Lcom/google/android/material/datepicker/MaterialCalendarGridView;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/google/android/material/datepicker/o;

    iget-object v1, p0, Lcom/google/android/material/datepicker/p;->e:Lcom/google/android/material/datepicker/d;

    iget-object v2, p0, Lcom/google/android/material/datepicker/p;->d:Lcom/google/android/material/datepicker/a;

    iget-object v3, p0, Lcom/google/android/material/datepicker/p;->f:Lcom/google/android/material/datepicker/g;

    invoke-direct {v0, p2, v1, v2, v3}, Lcom/google/android/material/datepicker/o;-><init>(Lcom/google/android/material/datepicker/n;Lcom/google/android/material/datepicker/d;Lcom/google/android/material/datepicker/a;Lcom/google/android/material/datepicker/g;)V

    iget p2, p2, Lcom/google/android/material/datepicker/n;->d:I

    invoke-virtual {p1, p2}, Landroid/widget/GridView;->setNumColumns(I)V

    invoke-virtual {p1, v0}, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->setAdapter(Landroid/widget/ListAdapter;)V

    :goto_0
    new-instance p2, Lcom/google/android/material/datepicker/p$a;

    invoke-direct {p2, p0, p1}, Lcom/google/android/material/datepicker/p$a;-><init>(Lcom/google/android/material/datepicker/p;Lcom/google/android/material/datepicker/MaterialCalendarGridView;)V

    invoke-virtual {p1, p2}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    return-void
.end method

.method public H(Landroid/view/ViewGroup;I)Lcom/google/android/material/datepicker/p$b;
    .locals 2
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    sget v0, Ljc/h;->q:I

    const/4 v1, 0x0

    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/LinearLayout;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/material/datepicker/k;->J2(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Landroidx/recyclerview/widget/RecyclerView$r;

    const/4 v0, -0x1

    iget v1, p0, Lcom/google/android/material/datepicker/p;->h:I

    invoke-direct {p1, v0, v1}, Landroidx/recyclerview/widget/RecyclerView$r;-><init>(II)V

    invoke-virtual {p2, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance p1, Lcom/google/android/material/datepicker/p$b;

    const/4 v0, 0x1

    invoke-direct {p1, p2, v0}, Lcom/google/android/material/datepicker/p$b;-><init>(Landroid/widget/LinearLayout;Z)V

    return-object p1

    :cond_0
    new-instance p1, Lcom/google/android/material/datepicker/p$b;

    invoke-direct {p1, p2, v1}, Lcom/google/android/material/datepicker/p$b;-><init>(Landroid/widget/LinearLayout;Z)V

    return-object p1
.end method

.method public e()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/datepicker/p;->d:Lcom/google/android/material/datepicker/a;

    invoke-virtual {v0}, Lcom/google/android/material/datepicker/a;->p()I

    move-result v0

    return v0
.end method

.method public f(I)J
    .locals 2

    iget-object v0, p0, Lcom/google/android/material/datepicker/p;->d:Lcom/google/android/material/datepicker/a;

    invoke-virtual {v0}, Lcom/google/android/material/datepicker/a;->r()Lcom/google/android/material/datepicker/n;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/material/datepicker/n;->w(I)Lcom/google/android/material/datepicker/n;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/material/datepicker/n;->v()J

    move-result-wide v0

    return-wide v0
.end method

.method public bridge synthetic r(Landroidx/recyclerview/widget/RecyclerView$g0;I)V
    .locals 0
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$g0;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    check-cast p1, Lcom/google/android/material/datepicker/p$b;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/material/datepicker/p;->G(Lcom/google/android/material/datepicker/p$b;I)V

    return-void
.end method

.method public bridge synthetic t(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$g0;
    .locals 0
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/google/android/material/datepicker/p;->H(Landroid/view/ViewGroup;I)Lcom/google/android/material/datepicker/p$b;

    move-result-object p1

    return-object p1
.end method
