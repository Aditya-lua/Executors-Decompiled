.class public Lus/i;
.super Lus/e;
.source "SourceFile"


# instance fields
.field public final a:Landroid/widget/TextView$BufferType;

.field public final b:Lrn/f;

.field public final c:Lus/n;

.field public final d:Lus/g;

.field public final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lus/j;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Z


# direct methods
.method public constructor <init>(Landroid/widget/TextView$BufferType;Lus/e$b;Lrn/f;Lus/n;Lus/g;Ljava/util/List;Z)V
    .locals 0
    .param p1    # Landroid/widget/TextView$BufferType;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lrn/f;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lus/n;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p5    # Lus/g;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p6    # Ljava/util/List;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/TextView$BufferType;",
            "Lus/e$b;",
            "Lrn/f;",
            "Lus/n;",
            "Lus/g;",
            "Ljava/util/List<",
            "Lus/j;",
            ">;Z)V"
        }
    .end annotation

    invoke-direct {p0}, Lus/e;-><init>()V

    iput-object p1, p0, Lus/i;->a:Landroid/widget/TextView$BufferType;

    iput-object p3, p0, Lus/i;->b:Lrn/f;

    iput-object p4, p0, Lus/i;->c:Lus/n;

    iput-object p5, p0, Lus/i;->d:Lus/g;

    iput-object p6, p0, Lus/i;->e:Ljava/util/List;

    iput-boolean p7, p0, Lus/i;->f:Z

    return-void
.end method


# virtual methods
.method public c(Landroid/widget/TextView;Ljava/lang/String;)V
    .locals 0
    .param p1    # Landroid/widget/TextView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p0, p2}, Lus/i;->e(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lus/i;->d(Landroid/widget/TextView;Landroid/text/Spanned;)V

    return-void
.end method

.method public d(Landroid/widget/TextView;Landroid/text/Spanned;)V
    .locals 2
    .param p1    # Landroid/widget/TextView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/text/Spanned;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lus/i;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lus/j;

    invoke-interface {v1, p1, p2}, Lus/j;->j(Landroid/widget/TextView;Landroid/text/Spanned;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lus/i;->a:Landroid/widget/TextView$BufferType;

    invoke-virtual {p1, p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V

    iget-object p2, p0, Lus/i;->e:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lus/j;

    invoke-interface {v0, p1}, Lus/j;->b(Landroid/widget/TextView;)V

    goto :goto_1

    :cond_1
    return-void
.end method

.method public e(Ljava/lang/String;)Landroid/text/Spanned;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-virtual {p0, p1}, Lus/i;->f(Ljava/lang/String;)Lqn/s;

    move-result-object v0

    invoke-virtual {p0, v0}, Lus/i;->g(Lqn/s;)Landroid/text/Spanned;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-boolean v1, p0, Lus/i;->f:Z

    if-eqz v1, :cond_0

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v0, Landroid/text/SpannableStringBuilder;

    invoke-direct {v0, p1}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    :cond_0
    return-object v0
.end method

.method public f(Ljava/lang/String;)Lqn/s;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lus/i;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lus/j;

    invoke-interface {v1, p1}, Lus/j;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lus/i;->b:Lrn/f;

    invoke-virtual {v0, p1}, Lrn/f;->b(Ljava/lang/String;)Lqn/s;

    move-result-object p1

    return-object p1
.end method

.method public g(Lqn/s;)Landroid/text/Spanned;
    .locals 3
    .param p1    # Lqn/s;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lus/i;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lus/j;

    invoke-interface {v1, p1}, Lus/j;->d(Lqn/s;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lus/i;->c:Lus/n;

    invoke-virtual {v0}, Lus/n;->a()Lus/m;

    move-result-object v0

    invoke-virtual {p1, v0}, Lqn/s;->a(Lqn/d0;)V

    iget-object v1, p0, Lus/i;->e:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lus/j;

    invoke-interface {v2, p1, v0}, Lus/j;->c(Lqn/s;Lus/m;)V

    goto :goto_1

    :cond_1
    invoke-interface {v0}, Lus/m;->builder()Lus/u;

    move-result-object p1

    invoke-virtual {p1}, Lus/u;->l()Landroid/text/SpannableStringBuilder;

    move-result-object p1

    return-object p1
.end method
