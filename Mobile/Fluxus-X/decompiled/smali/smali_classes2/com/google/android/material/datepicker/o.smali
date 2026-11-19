.class public Lcom/google/android/material/datepicker/o;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# static fields
.field public static final g:I

.field public static final h:I


# instance fields
.field public final a:Lcom/google/android/material/datepicker/n;

.field public final b:Lcom/google/android/material/datepicker/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/material/datepicker/d<",
            "*>;"
        }
    .end annotation
.end field

.field public c:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field public d:Lcom/google/android/material/datepicker/c;

.field public final e:Lcom/google/android/material/datepicker/a;

.field public final f:Lcom/google/android/material/datepicker/g;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    invoke-static {}, Lcom/google/android/material/datepicker/u;->i()Ljava/util/Calendar;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->getMaximum(I)I

    move-result v0

    sput v0, Lcom/google/android/material/datepicker/o;->g:I

    invoke-static {}, Lcom/google/android/material/datepicker/u;->i()Ljava/util/Calendar;

    move-result-object v0

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->getMaximum(I)I

    move-result v0

    invoke-static {}, Lcom/google/android/material/datepicker/u;->i()Ljava/util/Calendar;

    move-result-object v1

    const/4 v2, 0x7

    invoke-virtual {v1, v2}, Ljava/util/Calendar;->getMaximum(I)I

    move-result v1

    add-int/2addr v0, v1

    add-int/lit8 v0, v0, -0x1

    sput v0, Lcom/google/android/material/datepicker/o;->h:I

    return-void
.end method

.method public constructor <init>(Lcom/google/android/material/datepicker/n;Lcom/google/android/material/datepicker/d;Lcom/google/android/material/datepicker/a;Lcom/google/android/material/datepicker/g;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/material/datepicker/n;",
            "Lcom/google/android/material/datepicker/d<",
            "*>;",
            "Lcom/google/android/material/datepicker/a;",
            "Lcom/google/android/material/datepicker/g;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    iput-object p1, p0, Lcom/google/android/material/datepicker/o;->a:Lcom/google/android/material/datepicker/n;

    iput-object p2, p0, Lcom/google/android/material/datepicker/o;->b:Lcom/google/android/material/datepicker/d;

    iput-object p3, p0, Lcom/google/android/material/datepicker/o;->e:Lcom/google/android/material/datepicker/a;

    iput-object p4, p0, Lcom/google/android/material/datepicker/o;->f:Lcom/google/android/material/datepicker/g;

    invoke-interface {p2}, Lcom/google/android/material/datepicker/d;->W2()Ljava/util/Collection;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/material/datepicker/o;->c:Ljava/util/Collection;

    return-void
.end method


# virtual methods
.method public a(I)I
    .locals 1

    add-int/lit8 p1, p1, -0x1

    invoke-virtual {p0}, Lcom/google/android/material/datepicker/o;->b()I

    move-result v0

    add-int/2addr v0, p1

    return v0
.end method

.method public b()I
    .locals 2

    iget-object v0, p0, Lcom/google/android/material/datepicker/o;->a:Lcom/google/android/material/datepicker/n;

    iget-object v1, p0, Lcom/google/android/material/datepicker/o;->e:Lcom/google/android/material/datepicker/a;

    invoke-virtual {v1}, Lcom/google/android/material/datepicker/a;->o()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/material/datepicker/n;->q(I)I

    move-result v0

    return v0
.end method

.method public final c(Landroid/content/Context;J)Ljava/lang/String;
    .locals 6

    invoke-virtual {p0, p2, p3}, Lcom/google/android/material/datepicker/o;->l(J)Z

    move-result v3

    invoke-virtual {p0, p2, p3}, Lcom/google/android/material/datepicker/o;->k(J)Z

    move-result v4

    invoke-virtual {p0, p2, p3}, Lcom/google/android/material/datepicker/o;->g(J)Z

    move-result v5

    move-object v0, p1

    move-wide v1, p2

    invoke-static/range {v0 .. v5}, Lcom/google/android/material/datepicker/e;->a(Landroid/content/Context;JZZZ)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public d(I)Ljava/lang/Long;
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/material/datepicker/o;->b()I

    move-result v0

    if-lt p1, v0, :cond_1

    invoke-virtual {p0}, Lcom/google/android/material/datepicker/o;->m()I

    move-result v0

    if-le p1, v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/material/datepicker/o;->a:Lcom/google/android/material/datepicker/n;

    invoke-virtual {p0, p1}, Lcom/google/android/material/datepicker/o;->n(I)I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/material/datepicker/n;->r(I)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public e(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/widget/TextView;
    .locals 5
    .param p3    # Landroid/view/ViewGroup;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-virtual {p3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/material/datepicker/o;->f(Landroid/content/Context;)V

    move-object v0, p2

    check-cast v0, Landroid/widget/TextView;

    const/4 v1, 0x0

    if-nez p2, :cond_0

    invoke-virtual {p3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    sget v0, Ljc/h;->n:I

    invoke-virtual {p2, v0, p3, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    move-object v0, p2

    check-cast v0, Landroid/widget/TextView;

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/material/datepicker/o;->b()I

    move-result p2

    sub-int p2, p1, p2

    if-ltz p2, :cond_2

    iget-object p3, p0, Lcom/google/android/material/datepicker/o;->a:Lcom/google/android/material/datepicker/n;

    iget v2, p3, Lcom/google/android/material/datepicker/n;->e:I

    if-lt p2, v2, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x1

    add-int/2addr p2, v2

    invoke-virtual {v0, p3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    invoke-virtual {p3}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p3

    iget-object p3, p3, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    const-string v4, "%d"

    invoke-static {p3, v4, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v0, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setEnabled(Z)V

    goto :goto_1

    :cond_2
    :goto_0
    const/16 p2, 0x8

    invoke-virtual {v0, p2}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setEnabled(Z)V

    const/4 p2, -0x1

    :goto_1
    invoke-virtual {p0, p1}, Lcom/google/android/material/datepicker/o;->d(I)Ljava/lang/Long;

    move-result-object p1

    if-nez p1, :cond_3

    return-object v0

    :cond_3
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {p0, v0, v1, v2, p2}, Lcom/google/android/material/datepicker/o;->o(Landroid/widget/TextView;JI)V

    return-object v0
.end method

.method public final f(Landroid/content/Context;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/datepicker/o;->d:Lcom/google/android/material/datepicker/c;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/material/datepicker/c;

    invoke-direct {v0, p1}, Lcom/google/android/material/datepicker/c;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/google/android/material/datepicker/o;->d:Lcom/google/android/material/datepicker/c;

    :cond_0
    return-void
.end method

.method public g(J)Z
    .locals 3

    iget-object v0, p0, Lcom/google/android/material/datepicker/o;->b:Lcom/google/android/material/datepicker/d;

    invoke-interface {v0}, Lcom/google/android/material/datepicker/d;->U1()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lx2/c;

    iget-object v1, v1, Lx2/c;->b:Ljava/lang/Object;

    if-eqz v1, :cond_0

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    cmp-long v1, v1, p1

    if-nez v1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public getCount()I
    .locals 1

    sget v0, Lcom/google/android/material/datepicker/o;->h:I

    return v0
.end method

.method public bridge synthetic getItem(I)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/android/material/datepicker/o;->d(I)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method

.method public getItemId(I)J
    .locals 2

    iget-object v0, p0, Lcom/google/android/material/datepicker/o;->a:Lcom/google/android/material/datepicker/n;

    iget v0, v0, Lcom/google/android/material/datepicker/n;->d:I

    div-int/2addr p1, v0

    int-to-long v0, p1

    return-wide v0
.end method

.method public bridge synthetic getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 0
    .param p3    # Landroid/view/ViewGroup;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/material/datepicker/o;->e(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/widget/TextView;

    move-result-object p1

    return-object p1
.end method

.method public h(I)Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/datepicker/o;->a:Lcom/google/android/material/datepicker/n;

    iget v0, v0, Lcom/google/android/material/datepicker/n;->d:I

    rem-int/2addr p1, v0

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public hasStableIds()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public i(I)Z
    .locals 2

    const/4 v0, 0x1

    add-int/2addr p1, v0

    iget-object v1, p0, Lcom/google/android/material/datepicker/o;->a:Lcom/google/android/material/datepicker/n;

    iget v1, v1, Lcom/google/android/material/datepicker/n;->d:I

    rem-int/2addr p1, v1

    if-nez p1, :cond_0

    return v0

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final j(J)Z
    .locals 5

    iget-object v0, p0, Lcom/google/android/material/datepicker/o;->b:Lcom/google/android/material/datepicker/d;

    invoke-interface {v0}, Lcom/google/android/material/datepicker/d;->W2()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-static {p1, p2}, Lcom/google/android/material/datepicker/u;->a(J)J

    move-result-wide v3

    invoke-static {v1, v2}, Lcom/google/android/material/datepicker/u;->a(J)J

    move-result-wide v1

    cmp-long v1, v3, v1

    if-nez v1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public k(J)Z
    .locals 3

    iget-object v0, p0, Lcom/google/android/material/datepicker/o;->b:Lcom/google/android/material/datepicker/d;

    invoke-interface {v0}, Lcom/google/android/material/datepicker/d;->U1()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lx2/c;

    iget-object v1, v1, Lx2/c;->a:Ljava/lang/Object;

    if-eqz v1, :cond_0

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    cmp-long v1, v1, p1

    if-nez v1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final l(J)Z
    .locals 2

    invoke-static {}, Lcom/google/android/material/datepicker/u;->g()Ljava/util/Calendar;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    cmp-long p1, v0, p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public m()I
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/material/datepicker/o;->b()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/material/datepicker/o;->a:Lcom/google/android/material/datepicker/n;

    iget v1, v1, Lcom/google/android/material/datepicker/n;->e:I

    add-int/2addr v0, v1

    add-int/lit8 v0, v0, -0x1

    return v0
.end method

.method public n(I)I
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/material/datepicker/o;->b()I

    move-result v0

    sub-int/2addr p1, v0

    add-int/lit8 p1, p1, 0x1

    return p1
.end method

.method public final o(Landroid/widget/TextView;JI)V
    .locals 8

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p0, v1, p2, p3}, Lcom/google/android/material/datepicker/o;->c(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1, v7}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/google/android/material/datepicker/o;->e:Lcom/google/android/material/datepicker/a;

    invoke-virtual {v0}, Lcom/google/android/material/datepicker/a;->l()Lcom/google/android/material/datepicker/a$c;

    move-result-object v0

    invoke-interface {v0, p2, p3}, Lcom/google/android/material/datepicker/a$c;->X0(J)Z

    move-result v5

    if-eqz v5, :cond_3

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setEnabled(Z)V

    invoke-virtual {p0, p2, p3}, Lcom/google/android/material/datepicker/o;->j(J)Z

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setSelected(Z)V

    if-eqz v0, :cond_1

    iget-object p2, p0, Lcom/google/android/material/datepicker/o;->d:Lcom/google/android/material/datepicker/c;

    iget-object p2, p2, Lcom/google/android/material/datepicker/c;->b:Lcom/google/android/material/datepicker/b;

    :goto_0
    move v6, v0

    goto :goto_1

    :cond_1
    invoke-virtual {p0, p2, p3}, Lcom/google/android/material/datepicker/o;->l(J)Z

    move-result p2

    if-eqz p2, :cond_2

    iget-object p2, p0, Lcom/google/android/material/datepicker/o;->d:Lcom/google/android/material/datepicker/c;

    iget-object p2, p2, Lcom/google/android/material/datepicker/c;->c:Lcom/google/android/material/datepicker/b;

    goto :goto_0

    :cond_2
    iget-object p2, p0, Lcom/google/android/material/datepicker/o;->d:Lcom/google/android/material/datepicker/c;

    iget-object p2, p2, Lcom/google/android/material/datepicker/c;->a:Lcom/google/android/material/datepicker/b;

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setEnabled(Z)V

    iget-object p2, p0, Lcom/google/android/material/datepicker/o;->d:Lcom/google/android/material/datepicker/c;

    iget-object p2, p2, Lcom/google/android/material/datepicker/c;->g:Lcom/google/android/material/datepicker/b;

    goto :goto_0

    :goto_1
    iget-object v0, p0, Lcom/google/android/material/datepicker/o;->f:Lcom/google/android/material/datepicker/g;

    if-eqz v0, :cond_4

    const/4 p3, -0x1

    if-eq p4, p3, :cond_4

    iget-object p3, p0, Lcom/google/android/material/datepicker/o;->a:Lcom/google/android/material/datepicker/n;

    iget v2, p3, Lcom/google/android/material/datepicker/n;->c:I

    iget v3, p3, Lcom/google/android/material/datepicker/n;->b:I

    move v4, p4

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/material/datepicker/g;->a(Landroid/content/Context;IIIZZ)Landroid/content/res/ColorStateList;

    move-result-object p3

    iget-object v0, p0, Lcom/google/android/material/datepicker/o;->f:Lcom/google/android/material/datepicker/g;

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/material/datepicker/g;->l(Landroid/content/Context;IIIZZ)Landroid/content/res/ColorStateList;

    move-result-object p4

    invoke-virtual {p2, p1, p3, p4}, Lcom/google/android/material/datepicker/b;->e(Landroid/widget/TextView;Landroid/content/res/ColorStateList;Landroid/content/res/ColorStateList;)V

    iget-object v0, p0, Lcom/google/android/material/datepicker/o;->f:Lcom/google/android/material/datepicker/g;

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/material/datepicker/g;->g(Landroid/content/Context;IIIZZ)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    iget-object v0, p0, Lcom/google/android/material/datepicker/o;->f:Lcom/google/android/material/datepicker/g;

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/material/datepicker/g;->j(Landroid/content/Context;IIIZZ)Landroid/graphics/drawable/Drawable;

    move-result-object p3

    iget-object v0, p0, Lcom/google/android/material/datepicker/o;->f:Lcom/google/android/material/datepicker/g;

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/material/datepicker/g;->i(Landroid/content/Context;IIIZZ)Landroid/graphics/drawable/Drawable;

    move-result-object p4

    iget-object v0, p0, Lcom/google/android/material/datepicker/o;->f:Lcom/google/android/material/datepicker/g;

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/material/datepicker/g;->f(Landroid/content/Context;IIIZZ)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p1, p2, p3, p4, v0}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, Lcom/google/android/material/datepicker/o;->f:Lcom/google/android/material/datepicker/g;

    invoke-virtual/range {v0 .. v7}, Lcom/google/android/material/datepicker/g;->k(Landroid/content/Context;IIIZZLjava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    return-void

    :cond_4
    invoke-virtual {p2, p1}, Lcom/google/android/material/datepicker/b;->d(Landroid/widget/TextView;)V

    return-void
.end method

.method public final p(Lcom/google/android/material/datepicker/MaterialCalendarGridView;J)V
    .locals 3

    invoke-static {p2, p3}, Lcom/google/android/material/datepicker/n;->o(J)Lcom/google/android/material/datepicker/n;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/material/datepicker/o;->a:Lcom/google/android/material/datepicker/n;

    invoke-virtual {v0, v1}, Lcom/google/android/material/datepicker/n;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/material/datepicker/o;->a:Lcom/google/android/material/datepicker/n;

    invoke-virtual {v0, p2, p3}, Lcom/google/android/material/datepicker/n;->s(J)I

    move-result v0

    invoke-virtual {p1}, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->b()Lcom/google/android/material/datepicker/o;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/material/datepicker/o;->a(I)I

    move-result v1

    invoke-virtual {p1}, Landroid/widget/AdapterView;->getFirstVisiblePosition()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/google/android/material/datepicker/o;->o(Landroid/widget/TextView;JI)V

    :cond_0
    return-void
.end method

.method public q(Lcom/google/android/material/datepicker/MaterialCalendarGridView;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/material/datepicker/o;->c:Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {p0, p1, v1, v2}, Lcom/google/android/material/datepicker/o;->p(Lcom/google/android/material/datepicker/MaterialCalendarGridView;J)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/material/datepicker/o;->b:Lcom/google/android/material/datepicker/d;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Lcom/google/android/material/datepicker/d;->W2()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {p0, p1, v1, v2}, Lcom/google/android/material/datepicker/o;->p(Lcom/google/android/material/datepicker/MaterialCalendarGridView;J)V

    goto :goto_1

    :cond_1
    iget-object p1, p0, Lcom/google/android/material/datepicker/o;->b:Lcom/google/android/material/datepicker/d;

    invoke-interface {p1}, Lcom/google/android/material/datepicker/d;->W2()Ljava/util/Collection;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/material/datepicker/o;->c:Ljava/util/Collection;

    :cond_2
    return-void
.end method

.method public r(I)Z
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/material/datepicker/o;->b()I

    move-result v0

    if-lt p1, v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/material/datepicker/o;->m()I

    move-result v0

    if-gt p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
