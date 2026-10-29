.class public abstract Lcd/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Landroid/view/View;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:Landroid/animation/TimeInterpolator;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final b:Landroid/view/View;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TV;"
        }
    .end annotation
.end field

.field public final c:I

.field public final d:I

.field public final e:I

.field public f:Le/b;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 3
    .param p1    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcd/a;->b:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    sget v0, Lic/b;->R:I

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v1, v1, v1, v2}, Lz2/a;->a(FFFF)Landroid/view/animation/Interpolator;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lcd/h;->g(Landroid/content/Context;ILandroid/animation/TimeInterpolator;)Landroid/animation/TimeInterpolator;

    move-result-object v0

    iput-object v0, p0, Lcd/a;->a:Landroid/animation/TimeInterpolator;

    sget v0, Lic/b;->H:I

    const/16 v1, 0x12c

    invoke-static {p1, v0, v1}, Lcd/h;->f(Landroid/content/Context;II)I

    move-result v0

    iput v0, p0, Lcd/a;->c:I

    sget v0, Lic/b;->L:I

    const/16 v1, 0x96

    invoke-static {p1, v0, v1}, Lcd/h;->f(Landroid/content/Context;II)I

    move-result v0

    iput v0, p0, Lcd/a;->d:I

    sget v0, Lic/b;->K:I

    const/16 v1, 0x64

    invoke-static {p1, v0, v1}, Lcd/h;->f(Landroid/content/Context;II)I

    move-result p1

    iput p1, p0, Lcd/a;->e:I

    return-void
.end method


# virtual methods
.method public a(F)F
    .locals 1

    iget-object v0, p0, Lcd/a;->a:Landroid/animation/TimeInterpolator;

    invoke-interface {v0, p1}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    move-result p1

    return p1
.end method

.method public b()Le/b;
    .locals 2

    iget-object v0, p0, Lcd/a;->f:Le/b;

    if-nez v0, :cond_0

    const-string v0, "MaterialBackHelper"

    const-string v1, "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object v0, p0, Lcd/a;->f:Le/b;

    const/4 v1, 0x0

    iput-object v1, p0, Lcd/a;->f:Le/b;

    return-object v0
.end method

.method public c()Le/b;
    .locals 2

    iget-object v0, p0, Lcd/a;->f:Le/b;

    const/4 v1, 0x0

    iput-object v1, p0, Lcd/a;->f:Le/b;

    return-object v0
.end method

.method public d(Le/b;)V
    .locals 0
    .param p1    # Le/b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iput-object p1, p0, Lcd/a;->f:Le/b;

    return-void
.end method

.method public e(Le/b;)Le/b;
    .locals 2
    .param p1    # Le/b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcd/a;->f:Le/b;

    if-nez v0, :cond_0

    const-string v0, "MaterialBackHelper"

    const-string v1, "Must call startBackProgress() before updateBackProgress()"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object v0, p0, Lcd/a;->f:Le/b;

    iput-object p1, p0, Lcd/a;->f:Le/b;

    return-object v0
.end method
