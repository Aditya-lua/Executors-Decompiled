.class public Lcom/withpersona/sdk2/markwon/core/spans/LinkSpan;
.super Landroid/text/style/URLSpan;
.source "SourceFile"


# instance fields
.field public final a:Lvs/c;

.field public final b:Ljava/lang/String;

.field public final c:Lus/c;


# direct methods
.method public constructor <init>(Lvs/c;Ljava/lang/String;Lus/c;)V
    .locals 0
    .param p1    # Lvs/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lus/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0, p2}, Landroid/text/style/URLSpan;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/withpersona/sdk2/markwon/core/spans/LinkSpan;->a:Lvs/c;

    iput-object p2, p0, Lcom/withpersona/sdk2/markwon/core/spans/LinkSpan;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/withpersona/sdk2/markwon/core/spans/LinkSpan;->c:Lus/c;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/withpersona/sdk2/markwon/core/spans/LinkSpan;->c:Lus/c;

    iget-object v1, p0, Lcom/withpersona/sdk2/markwon/core/spans/LinkSpan;->b:Ljava/lang/String;

    invoke-interface {v0, p1, v1}, Lus/c;->a(Landroid/view/View;Ljava/lang/String;)V

    return-void
.end method

.method public updateDrawState(Landroid/text/TextPaint;)V
    .locals 1
    .param p1    # Landroid/text/TextPaint;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/withpersona/sdk2/markwon/core/spans/LinkSpan;->a:Lvs/c;

    invoke-virtual {v0, p1}, Lvs/c;->f(Landroid/text/TextPaint;)V

    return-void
.end method
