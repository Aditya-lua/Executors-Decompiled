.class public abstract Lm9/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lcom/google/android/gms/common/data/DataHolder;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public b:I

.field public c:I


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/data/DataHolder;I)V
    .locals 0
    .param p1    # Lcom/google/android/gms/common/data/DataHolder;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/data/DataHolder;

    iput-object p1, p0, Lm9/d;->a:Lcom/google/android/gms/common/data/DataHolder;

    invoke-virtual {p0, p2}, Lm9/d;->o(I)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Z
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget v0, p0, Lm9/d;->b:I

    iget v1, p0, Lm9/d;->c:I

    iget-object v2, p0, Lm9/d;->a:Lcom/google/android/gms/common/data/DataHolder;

    invoke-virtual {v2, p1, v0, v1}, Lcom/google/android/gms/common/data/DataHolder;->a(Ljava/lang/String;II)Z

    move-result p1

    return p1
.end method

.method public f(Ljava/lang/String;)F
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget v0, p0, Lm9/d;->b:I

    iget v1, p0, Lm9/d;->c:I

    iget-object v2, p0, Lm9/d;->a:Lcom/google/android/gms/common/data/DataHolder;

    invoke-virtual {v2, p1, v0, v1}, Lcom/google/android/gms/common/data/DataHolder;->D3(Ljava/lang/String;II)F

    move-result p1

    return p1
.end method

.method public g(Ljava/lang/String;)I
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget v0, p0, Lm9/d;->b:I

    iget v1, p0, Lm9/d;->c:I

    iget-object v2, p0, Lm9/d;->a:Lcom/google/android/gms/common/data/DataHolder;

    invoke-virtual {v2, p1, v0, v1}, Lcom/google/android/gms/common/data/DataHolder;->v3(Ljava/lang/String;II)I

    move-result p1

    return p1
.end method

.method public i(Ljava/lang/String;)J
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget v0, p0, Lm9/d;->b:I

    iget v1, p0, Lm9/d;->c:I

    iget-object v2, p0, Lm9/d;->a:Lcom/google/android/gms/common/data/DataHolder;

    invoke-virtual {v2, p1, v0, v1}, Lcom/google/android/gms/common/data/DataHolder;->w3(Ljava/lang/String;II)J

    move-result-wide v0

    return-wide v0
.end method

.method public j(Ljava/lang/String;)Ljava/lang/String;
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget v0, p0, Lm9/d;->b:I

    iget v1, p0, Lm9/d;->c:I

    iget-object v2, p0, Lm9/d;->a:Lcom/google/android/gms/common/data/DataHolder;

    invoke-virtual {v2, p1, v0, v1}, Lcom/google/android/gms/common/data/DataHolder;->z3(Ljava/lang/String;II)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public k(Ljava/lang/String;)Z
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lm9/d;->a:Lcom/google/android/gms/common/data/DataHolder;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/data/DataHolder;->B3(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public m(Ljava/lang/String;)Z
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget v0, p0, Lm9/d;->b:I

    iget v1, p0, Lm9/d;->c:I

    iget-object v2, p0, Lm9/d;->a:Lcom/google/android/gms/common/data/DataHolder;

    invoke-virtual {v2, p1, v0, v1}, Lcom/google/android/gms/common/data/DataHolder;->C3(Ljava/lang/String;II)Z

    move-result p1

    return p1
.end method

.method public n(Ljava/lang/String;)Landroid/net/Uri;
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget v0, p0, Lm9/d;->b:I

    iget v1, p0, Lm9/d;->c:I

    iget-object v2, p0, Lm9/d;->a:Lcom/google/android/gms/common/data/DataHolder;

    invoke-virtual {v2, p1, v0, v1}, Lcom/google/android/gms/common/data/DataHolder;->z3(Ljava/lang/String;II)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    return-object p1
.end method

.method public final o(I)V
    .locals 2

    const/4 v0, 0x0

    if-ltz p1, :cond_0

    iget-object v1, p0, Lm9/d;->a:Lcom/google/android/gms/common/data/DataHolder;

    invoke-virtual {v1}, Lcom/google/android/gms/common/data/DataHolder;->getCount()I

    move-result v1

    if-ge p1, v1, :cond_0

    const/4 v0, 0x1

    :cond_0
    invoke-static {v0}, Ln9/m;->p(Z)V

    iput p1, p0, Lm9/d;->b:I

    iget-object v0, p0, Lm9/d;->a:Lcom/google/android/gms/common/data/DataHolder;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/data/DataHolder;->A3(I)I

    move-result p1

    iput p1, p0, Lm9/d;->c:I

    return-void
.end method
