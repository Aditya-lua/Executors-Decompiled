.class public Lm1/m1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm1/r1;


# instance fields
.field public final a:Lm1/r1;


# direct methods
.method public constructor <init>(Lm1/r1;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p1}, Lm1/r1;->a()Z

    move-result v0

    invoke-static {v0}, Lx2/g;->a(Z)V

    iput-object p1, p0, Lm1/m1;->a:Lm1/r1;

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-object v0, p0, Lm1/m1;->a:Lm1/r1;

    invoke-interface {v0}, Lm1/r1;->a()Z

    move-result v0

    return v0
.end method

.method public b(I)Landroid/util/Range;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lm1/m1;->a:Lm1/r1;

    invoke-interface {v0, p1}, Lm1/r1;->h(I)Landroid/util/Range;

    move-result-object p1

    return-object p1
.end method

.method public c()I
    .locals 1

    iget-object v0, p0, Lm1/m1;->a:Lm1/r1;

    invoke-interface {v0}, Lm1/r1;->f()I

    move-result v0

    return v0
.end method

.method public d(II)Z
    .locals 1

    iget-object v0, p0, Lm1/m1;->a:Lm1/r1;

    invoke-interface {v0, p2, p1}, Lm1/r1;->d(II)Z

    move-result p1

    return p1
.end method

.method public f()I
    .locals 1

    iget-object v0, p0, Lm1/m1;->a:Lm1/r1;

    invoke-interface {v0}, Lm1/r1;->c()I

    move-result v0

    return v0
.end method

.method public g()Landroid/util/Range;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lm1/m1;->a:Lm1/r1;

    invoke-interface {v0}, Lm1/r1;->g()Landroid/util/Range;

    move-result-object v0

    return-object v0
.end method

.method public h(I)Landroid/util/Range;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lm1/m1;->a:Lm1/r1;

    invoke-interface {v0, p1}, Lm1/r1;->b(I)Landroid/util/Range;

    move-result-object p1

    return-object p1
.end method

.method public i()Landroid/util/Range;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lm1/m1;->a:Lm1/r1;

    invoke-interface {v0}, Lm1/r1;->j()Landroid/util/Range;

    move-result-object v0

    return-object v0
.end method

.method public j()Landroid/util/Range;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lm1/m1;->a:Lm1/r1;

    invoke-interface {v0}, Lm1/r1;->i()Landroid/util/Range;

    move-result-object v0

    return-object v0
.end method
