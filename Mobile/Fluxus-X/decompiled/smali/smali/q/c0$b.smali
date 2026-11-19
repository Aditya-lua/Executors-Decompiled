.class public Lq/c0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq/c0$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq/c0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final synthetic a:Lq/c0;


# direct methods
.method public constructor <init>(Lq/c0;)V
    .locals 0

    iput-object p1, p0, Lq/c0$b;->a:Lq/c0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a([II)V
    .locals 1

    iget-object v0, p0, Lq/c0$b;->a:Lq/c0;

    invoke-static {v0, p1, p2}, Lq/c0;->o(Lq/c0;[II)V

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

    iget-object v0, p0, Lq/c0$b;->a:Lq/c0;

    invoke-static {v0}, Lq/c0;->k(Lq/c0;)[I

    move-result-object v0

    return-object v0
.end method

.method public e()Landroid/view/textclassifier/TextClassifier;
    .locals 1

    iget-object v0, p0, Lq/c0$b;->a:Lq/c0;

    invoke-static {v0}, Lq/c0;->m(Lq/c0;)Landroid/view/textclassifier/TextClassifier;

    move-result-object v0

    return-object v0
.end method

.method public f()I
    .locals 1

    iget-object v0, p0, Lq/c0$b;->a:Lq/c0;

    invoke-static {v0}, Lq/c0;->e(Lq/c0;)I

    move-result v0

    return v0
.end method

.method public g(Landroid/view/textclassifier/TextClassifier;)V
    .locals 1

    iget-object v0, p0, Lq/c0$b;->a:Lq/c0;

    invoke-static {v0, p1}, Lq/c0;->q(Lq/c0;Landroid/view/textclassifier/TextClassifier;)V

    return-void
.end method

.method public getAutoSizeMinTextSize()I
    .locals 1

    iget-object v0, p0, Lq/c0$b;->a:Lq/c0;

    invoke-static {v0}, Lq/c0;->g(Lq/c0;)I

    move-result v0

    return v0
.end method

.method public getAutoSizeStepGranularity()I
    .locals 1

    iget-object v0, p0, Lq/c0$b;->a:Lq/c0;

    invoke-static {v0}, Lq/c0;->j(Lq/c0;)I

    move-result v0

    return v0
.end method

.method public getAutoSizeTextType()I
    .locals 1

    iget-object v0, p0, Lq/c0$b;->a:Lq/c0;

    invoke-static {v0}, Lq/c0;->l(Lq/c0;)I

    move-result v0

    return v0
.end method

.method public h(I)V
    .locals 0

    return-void
.end method

.method public i(I)V
    .locals 1

    iget-object v0, p0, Lq/c0$b;->a:Lq/c0;

    invoke-static {v0, p1}, Lq/c0;->p(Lq/c0;I)V

    return-void
.end method

.method public setAutoSizeTextTypeUniformWithConfiguration(IIII)V
    .locals 1

    iget-object v0, p0, Lq/c0$b;->a:Lq/c0;

    invoke-static {v0, p1, p2, p3, p4}, Lq/c0;->n(Lq/c0;IIII)V

    return-void
.end method
