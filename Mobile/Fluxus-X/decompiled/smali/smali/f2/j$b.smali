.class public Lf2/j$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf2/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public a:F

.field public b:F

.field public c:I

.field public d:I

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public final g:Ljava/lang/String;

.field public final h:Ljava/lang/String;

.field public final synthetic i:Lf2/j;


# direct methods
.method public constructor <init>(Lf2/j;)V
    .locals 0

    iput-object p1, p0, Lf2/j$b;->i:Lf2/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 p1, 0x7fc00000    # Float.NaN

    iput p1, p0, Lf2/j$b;->a:F

    iput p1, p0, Lf2/j$b;->b:F

    const/4 p1, -0x1

    iput p1, p0, Lf2/j$b;->c:I

    iput p1, p0, Lf2/j$b;->d:I

    const-string p1, "motion.progress"

    iput-object p1, p0, Lf2/j$b;->e:Ljava/lang/String;

    const-string p1, "motion.velocity"

    iput-object p1, p0, Lf2/j$b;->f:Ljava/lang/String;

    const-string p1, "motion.StartState"

    iput-object p1, p0, Lf2/j$b;->g:Ljava/lang/String;

    const-string p1, "motion.EndState"

    iput-object p1, p0, Lf2/j$b;->h:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    iget v0, p0, Lf2/j$b;->c:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    iget v2, p0, Lf2/j$b;->d:I

    if-eq v2, v1, :cond_3

    :cond_0
    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lf2/j$b;->i:Lf2/j;

    iget v2, p0, Lf2/j$b;->d:I

    invoke-virtual {v0, v2}, Lf2/j;->R(I)V

    goto :goto_0

    :cond_1
    iget v2, p0, Lf2/j$b;->d:I

    if-ne v2, v1, :cond_2

    iget-object v2, p0, Lf2/j$b;->i:Lf2/j;

    invoke-virtual {v2, v0, v1, v1}, Lf2/j;->O(III)V

    goto :goto_0

    :cond_2
    iget-object v3, p0, Lf2/j$b;->i:Lf2/j;

    invoke-virtual {v3, v0, v2}, Lf2/j;->P(II)V

    :goto_0
    iget-object v0, p0, Lf2/j$b;->i:Lf2/j;

    sget-object v2, Lf2/j$d;->b:Lf2/j$d;

    invoke-virtual {v0, v2}, Lf2/j;->setState(Lf2/j$d;)V

    :cond_3
    iget v0, p0, Lf2/j$b;->b:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_5

    iget v0, p0, Lf2/j$b;->a:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_4

    return-void

    :cond_4
    iget-object v0, p0, Lf2/j$b;->i:Lf2/j;

    iget v1, p0, Lf2/j$b;->a:F

    invoke-virtual {v0, v1}, Lf2/j;->setProgress(F)V

    return-void

    :cond_5
    iget-object v0, p0, Lf2/j$b;->i:Lf2/j;

    iget v2, p0, Lf2/j$b;->a:F

    iget v3, p0, Lf2/j$b;->b:F

    invoke-virtual {v0, v2, v3}, Lf2/j;->N(FF)V

    const/high16 v0, 0x7fc00000    # Float.NaN

    iput v0, p0, Lf2/j$b;->a:F

    iput v0, p0, Lf2/j$b;->b:F

    iput v1, p0, Lf2/j$b;->c:I

    iput v1, p0, Lf2/j$b;->d:I

    return-void
.end method

.method public b()Landroid/os/Bundle;
    .locals 3

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "motion.progress"

    iget v2, p0, Lf2/j$b;->a:F

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    const-string v1, "motion.velocity"

    iget v2, p0, Lf2/j$b;->b:F

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    const-string v1, "motion.StartState"

    iget v2, p0, Lf2/j$b;->c:I

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v1, "motion.EndState"

    iget v2, p0, Lf2/j$b;->d:I

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    return-object v0
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, Lf2/j$b;->i:Lf2/j;

    invoke-static {v0}, Lf2/j;->E(Lf2/j;)I

    move-result v0

    iput v0, p0, Lf2/j$b;->d:I

    iget-object v0, p0, Lf2/j$b;->i:Lf2/j;

    invoke-static {v0}, Lf2/j;->F(Lf2/j;)I

    move-result v0

    iput v0, p0, Lf2/j$b;->c:I

    iget-object v0, p0, Lf2/j$b;->i:Lf2/j;

    invoke-virtual {v0}, Lf2/j;->getVelocity()F

    move-result v0

    iput v0, p0, Lf2/j$b;->b:F

    iget-object v0, p0, Lf2/j$b;->i:Lf2/j;

    invoke-virtual {v0}, Lf2/j;->getProgress()F

    move-result v0

    iput v0, p0, Lf2/j$b;->a:F

    return-void
.end method

.method public d(I)V
    .locals 0

    iput p1, p0, Lf2/j$b;->d:I

    return-void
.end method

.method public e(F)V
    .locals 0

    iput p1, p0, Lf2/j$b;->a:F

    return-void
.end method

.method public f(I)V
    .locals 0

    iput p1, p0, Lf2/j$b;->c:I

    return-void
.end method

.method public g(Landroid/os/Bundle;)V
    .locals 1

    const-string v0, "motion.progress"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    move-result v0

    iput v0, p0, Lf2/j$b;->a:F

    const-string v0, "motion.velocity"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    move-result v0

    iput v0, p0, Lf2/j$b;->b:F

    const-string v0, "motion.StartState"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lf2/j$b;->c:I

    const-string v0, "motion.EndState"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lf2/j$b;->d:I

    return-void
.end method

.method public h(F)V
    .locals 0

    iput p1, p0, Lf2/j$b;->b:F

    return-void
.end method
