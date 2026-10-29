.class public Lq/b0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq/b0$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq/b0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final synthetic a:Lq/b0;


# direct methods
.method public constructor <init>(Lq/b0;)V
    .locals 0

    iput-object p1, p0, Lq/b0$b;->a:Lq/b0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a([II)V
    .locals 1

    iget-object v0, p0, Lq/b0$b;->a:Lq/b0;

    invoke-static {v0, p1, p2}, Lq/b0;->o(Lq/b0;[II)V

    return-void
.end method

.method public b(I)V
    .locals 0

    return-void
.end method

.method public c(IF)V
    .locals 0

    return-void
.end method

.method public d()[I
    .locals 1

    iget-object v0, p0, Lq/b0$b;->a:Lq/b0;

    invoke-static {v0}, Lq/b0;->k(Lq/b0;)[I

    move-result-object v0

    return-object v0
.end method

.method public e()Landroid/view/textclassifier/TextClassifier;
    .locals 1

    iget-object v0, p0, Lq/b0$b;->a:Lq/b0;

    invoke-static {v0}, Lq/b0;->m(Lq/b0;)Landroid/view/textclassifier/TextClassifier;

    move-result-object v0

    return-object v0
.end method

.method public f()I
    .locals 1

    iget-object v0, p0, Lq/b0$b;->a:Lq/b0;

    invoke-static {v0}, Lq/b0;->e(Lq/b0;)I

    move-result v0

    return v0
.end method

.method public g(Landroid/view/textclassifier/TextClassifier;)V
    .locals 1

    iget-object v0, p0, Lq/b0$b;->a:Lq/b0;

    invoke-static {v0, p1}, Lq/b0;->q(Lq/b0;Landroid/view/textclassifier/TextClassifier;)V

    return-void
.end method

.method public getAutoSizeMinTextSize()I
    .locals 1

    iget-object v0, p0, Lq/b0$b;->a:Lq/b0;

    invoke-static {v0}, Lq/b0;->g(Lq/b0;)I

    move-result v0

    return v0
.end method

.method public getAutoSizeStepGranularity()I
    .locals 1

    iget-object v0, p0, Lq/b0$b;->a:Lq/b0;

    invoke-static {v0}, Lq/b0;->j(Lq/b0;)I

    move-result v0

    return v0
.end method

.method public getAutoSizeTextType()I
    .locals 1

    iget-object v0, p0, Lq/b0$b;->a:Lq/b0;

    invoke-static {v0}, Lq/b0;->l(Lq/b0;)I

    move-result v0

    return v0
.end method

.method public h(I)V
    .locals 0

    return-void
.end method

.method public i(I)V
    .locals 1

    iget-object v0, p0, Lq/b0$b;->a:Lq/b0;

    invoke-static {v0, p1}, Lq/b0;->p(Lq/b0;I)V

    return-void
.end method

.method public setAutoSizeTextTypeUniformWithConfiguration(IIII)V
    .locals 1

    iget-object v0, p0, Lq/b0$b;->a:Lq/b0;

    invoke-static {v0, p1, p2, p3, p4}, Lq/b0;->n(Lq/b0;IIII)V

    return-void
.end method
