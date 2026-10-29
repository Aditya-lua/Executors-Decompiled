.class public final Ln9/d0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/util/SparseIntArray;

.field public b:Lj9/d;


# direct methods
.method public constructor <init>(Lj9/d;)V
    .locals 1
    .param p1    # Lj9/d;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    iput-object v0, p0, Ln9/d0;->a:Landroid/util/SparseIntArray;

    invoke-static {p1}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Ln9/d0;->b:Lj9/d;

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;I)I
    .locals 1

    iget-object p1, p0, Ln9/d0;->a:Landroid/util/SparseIntArray;

    const/4 v0, -0x1

    invoke-virtual {p1, p2, v0}, Landroid/util/SparseIntArray;->get(II)I

    move-result p1

    return p1
.end method

.method public final b(Landroid/content/Context;Lk9/a$f;)I
    .locals 5
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lk9/a$f;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation runtime Lcom/google/errorprone/annotations/ResultIgnorabilityUnspecified;
    .end annotation

    invoke-static {p1}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p2}, Lk9/a$f;->requiresGooglePlayServices()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-interface {p2}, Lk9/a$f;->getMinApkVersion()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Ln9/d0;->a(Landroid/content/Context;I)I

    move-result v0

    const/4 v2, -0x1

    if-eq v0, v2, :cond_1

    return v0

    :cond_1
    move v0, v1

    :goto_0
    iget-object v3, p0, Ln9/d0;->a:Landroid/util/SparseIntArray;

    invoke-virtual {v3}, Landroid/util/SparseIntArray;->size()I

    move-result v3

    if-ge v0, v3, :cond_3

    iget-object v3, p0, Ln9/d0;->a:Landroid/util/SparseIntArray;

    invoke-virtual {v3, v0}, Landroid/util/SparseIntArray;->keyAt(I)I

    move-result v3

    if-le v3, p2, :cond_2

    iget-object v4, p0, Ln9/d0;->a:Landroid/util/SparseIntArray;

    invoke-virtual {v4, v3}, Landroid/util/SparseIntArray;->get(I)I

    move-result v3

    if-nez v3, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    move v1, v2

    :goto_1
    if-ne v1, v2, :cond_4

    iget-object v0, p0, Ln9/d0;->b:Lj9/d;

    invoke-virtual {v0, p1, p2}, Lj9/d;->h(Landroid/content/Context;I)I

    move-result v1

    :cond_4
    iget-object p1, p0, Ln9/d0;->a:Landroid/util/SparseIntArray;

    invoke-virtual {p1, p2, v1}, Landroid/util/SparseIntArray;->put(II)V

    return v1
.end method

.method public final c()V
    .locals 1

    iget-object v0, p0, Ln9/d0;->a:Landroid/util/SparseIntArray;

    invoke-virtual {v0}, Landroid/util/SparseIntArray;->clear()V

    return-void
.end method
