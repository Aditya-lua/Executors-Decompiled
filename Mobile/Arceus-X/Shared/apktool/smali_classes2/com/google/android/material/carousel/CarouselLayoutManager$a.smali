.class public Lcom/google/android/material/carousel/CarouselLayoutManager$a;
.super Landroidx/recyclerview/widget/l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/material/carousel/CarouselLayoutManager;->N1(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$b0;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic q:Lcom/google/android/material/carousel/CarouselLayoutManager;


# direct methods
.method public constructor <init>(Lcom/google/android/material/carousel/CarouselLayoutManager;Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/material/carousel/CarouselLayoutManager$a;->q:Lcom/google/android/material/carousel/CarouselLayoutManager;

    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/l;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public a(I)Landroid/graphics/PointF;
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/carousel/CarouselLayoutManager$a;->q:Lcom/google/android/material/carousel/CarouselLayoutManager;

    invoke-virtual {v0, p1}, Lcom/google/android/material/carousel/CarouselLayoutManager;->c(I)Landroid/graphics/PointF;

    move-result-object p1

    return-object p1
.end method

.method public t(Landroid/view/View;I)I
    .locals 0

    iget-object p2, p0, Lcom/google/android/material/carousel/CarouselLayoutManager$a;->q:Lcom/google/android/material/carousel/CarouselLayoutManager;

    invoke-static {p2}, Lcom/google/android/material/carousel/CarouselLayoutManager;->T1(Lcom/google/android/material/carousel/CarouselLayoutManager;)Lcom/google/android/material/carousel/c;

    move-result-object p2

    if-eqz p2, :cond_1

    iget-object p2, p0, Lcom/google/android/material/carousel/CarouselLayoutManager$a;->q:Lcom/google/android/material/carousel/CarouselLayoutManager;

    invoke-virtual {p2}, Lcom/google/android/material/carousel/CarouselLayoutManager;->f()Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lcom/google/android/material/carousel/CarouselLayoutManager$a;->q:Lcom/google/android/material/carousel/CarouselLayoutManager;

    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/RecyclerView$q;->l0(Landroid/view/View;)I

    move-result p1

    invoke-virtual {p2, p1}, Lcom/google/android/material/carousel/CarouselLayoutManager;->h2(I)I

    move-result p1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public u(Landroid/view/View;I)I
    .locals 0

    iget-object p2, p0, Lcom/google/android/material/carousel/CarouselLayoutManager$a;->q:Lcom/google/android/material/carousel/CarouselLayoutManager;

    invoke-static {p2}, Lcom/google/android/material/carousel/CarouselLayoutManager;->T1(Lcom/google/android/material/carousel/CarouselLayoutManager;)Lcom/google/android/material/carousel/c;

    move-result-object p2

    if-eqz p2, :cond_1

    iget-object p2, p0, Lcom/google/android/material/carousel/CarouselLayoutManager$a;->q:Lcom/google/android/material/carousel/CarouselLayoutManager;

    invoke-virtual {p2}, Lcom/google/android/material/carousel/CarouselLayoutManager;->f()Z

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lcom/google/android/material/carousel/CarouselLayoutManager$a;->q:Lcom/google/android/material/carousel/CarouselLayoutManager;

    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/RecyclerView$q;->l0(Landroid/view/View;)I

    move-result p1

    invoke-virtual {p2, p1}, Lcom/google/android/material/carousel/CarouselLayoutManager;->h2(I)I

    move-result p1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method
