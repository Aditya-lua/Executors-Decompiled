.class public abstract Lqc/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lqc/e;->a:I

    return-void
.end method

.method public synthetic constructor <init>(ILqc/e$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lqc/e;-><init>(I)V

    return-void
.end method

.method public static b(Lcom/google/android/material/carousel/CarouselLayoutManager;)Lqc/e;
    .locals 2

    new-instance v0, Lqc/e$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Lqc/e$b;-><init>(ILcom/google/android/material/carousel/CarouselLayoutManager;)V

    return-object v0
.end method

.method public static c(Lcom/google/android/material/carousel/CarouselLayoutManager;I)Lqc/e;
    .locals 1

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    invoke-static {p0}, Lqc/e;->d(Lcom/google/android/material/carousel/CarouselLayoutManager;)Lqc/e;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "invalid orientation"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    invoke-static {p0}, Lqc/e;->b(Lcom/google/android/material/carousel/CarouselLayoutManager;)Lqc/e;

    move-result-object p0

    return-object p0
.end method

.method public static d(Lcom/google/android/material/carousel/CarouselLayoutManager;)Lqc/e;
    .locals 2

    new-instance v0, Lqc/e$a;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p0}, Lqc/e$a;-><init>(ILcom/google/android/material/carousel/CarouselLayoutManager;)V

    return-object v0
.end method


# virtual methods
.method public abstract a(Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/RectF;)V
.end method

.method public abstract e(Landroidx/recyclerview/widget/RecyclerView$r;)F
.end method

.method public abstract f(FFFF)Landroid/graphics/RectF;
.end method

.method public abstract g()I
.end method

.method public abstract h()I
.end method

.method public abstract i()I
.end method

.method public abstract j()I
.end method

.method public abstract k()I
.end method

.method public abstract l()I
.end method

.method public abstract m(Landroid/view/View;II)V
.end method

.method public abstract n(Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/RectF;)V
.end method

.method public abstract o(Landroid/view/View;Landroid/graphics/Rect;FF)V
.end method
