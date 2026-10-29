.class public Ln0/c;
.super Ln0/c2;
.source "SourceFile"


# instance fields
.field public final c:Ln0/l0;

.field public final d:Ln0/q3;


# direct methods
.method public constructor <init>(Ln0/l0;Ln0/q3;)V
    .locals 0

    invoke-direct {p0, p1}, Ln0/c2;-><init>(Ln0/l0;)V

    iput-object p1, p0, Ln0/c;->c:Ln0/l0;

    iput-object p2, p0, Ln0/c;->d:Ln0/q3;

    return-void
.end method


# virtual methods
.method public c(Z)Lne/x;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lne/x<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ln0/c;->d:Ln0/q3;

    const/4 v1, 0x6

    filled-new-array {v1}, [I

    move-result-object v1

    invoke-static {v0, v1}, Lp0/x;->b(Ln0/q3;[I)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Torch is not supported"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lr0/n;->n(Ljava/lang/Throwable;)Lne/x;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Ln0/c;->c:Ln0/l0;

    invoke-interface {v0, p1}, Lg0/m;->c(Z)Lne/x;

    move-result-object p1

    return-object p1
.end method

.method public e(F)Lne/x;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F)",
            "Lne/x<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ln0/c;->d:Ln0/q3;

    const/4 v1, 0x0

    filled-new-array {v1}, [I

    move-result-object v1

    invoke-static {v0, v1}, Lp0/x;->b(Ln0/q3;[I)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Zoom is not supported"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lr0/n;->n(Ljava/lang/Throwable;)Lne/x;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Ln0/c;->d:Ln0/q3;

    if-eqz v0, :cond_4

    invoke-interface {v0}, Ln0/q3;->j()Landroid/util/Range;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ln0/c;->c:Ln0/l0;

    invoke-interface {v0, p1}, Lg0/m;->e(F)Lne/x;

    move-result-object p1

    return-object p1

    :cond_1
    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v1, p1, v1

    if-gtz v1, :cond_3

    const/4 v1, 0x0

    cmpg-float v1, p1, v1

    if-gez v1, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    invoke-virtual {v0}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    invoke-static {p1, v1, v0}, Ln0/e;->F(FFF)F

    move-result p1

    iget-object v0, p0, Ln0/c;->c:Ln0/l0;

    invoke-interface {v0, p1}, Lg0/m;->g(F)Lne/x;

    move-result-object p1

    return-object p1

    :cond_3
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Requested linearZoom "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string p1, " is not within valid range [0..1]"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lr0/n;->n(Ljava/lang/Throwable;)Lne/x;

    move-result-object p1

    return-object p1

    :cond_4
    iget-object v0, p0, Ln0/c;->c:Ln0/l0;

    invoke-interface {v0, p1}, Lg0/m;->e(F)Lne/x;

    move-result-object p1

    return-object p1
.end method

.method public g(F)Lne/x;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F)",
            "Lne/x<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ln0/c;->d:Ln0/q3;

    const/4 v1, 0x0

    filled-new-array {v1}, [I

    move-result-object v1

    invoke-static {v0, v1}, Lp0/x;->b(Ln0/q3;[I)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Zoom is not supported"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lr0/n;->n(Ljava/lang/Throwable;)Lne/x;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Ln0/c;->d:Ln0/q3;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ln0/q3;->j()Landroid/util/Range;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    cmpg-float v1, p1, v1

    if-ltz v1, :cond_1

    invoke-virtual {v0}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    cmpl-float v1, p1, v1

    if-lez v1, :cond_2

    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Requested zoomRatio "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string p1, " is not within valid range ["

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " , "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "]"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lr0/n;->n(Ljava/lang/Throwable;)Lne/x;

    move-result-object p1

    return-object p1

    :cond_2
    iget-object v0, p0, Ln0/c;->c:Ln0/l0;

    invoke-interface {v0, p1}, Lg0/m;->g(F)Lne/x;

    move-result-object p1

    return-object p1
.end method

.method public o(Lg0/m0;)Lne/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg0/m0;",
            ")",
            "Lne/x<",
            "Lg0/n0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ln0/c;->d:Ln0/q3;

    invoke-static {v0, p1}, Lp0/x;->a(Ln0/q3;Lg0/m0;)Lg0/m0;

    move-result-object p1

    if-nez p1, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "FocusMetering is not supported"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lr0/n;->n(Ljava/lang/Throwable;)Lne/x;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Ln0/c;->c:Ln0/l0;

    invoke-interface {v0, p1}, Lg0/m;->o(Lg0/m0;)Lne/x;

    move-result-object p1

    return-object p1
.end method
