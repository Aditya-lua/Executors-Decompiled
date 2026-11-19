.class public Lot/g;
.super Landroid/text/style/URLSpan;
.source "SourceFile"


# instance fields
.field public final a:Lmt/c;

.field public final b:Ljava/lang/String;

.field public final c:Llt/c;


# direct methods
.method public constructor <init>(Lmt/c;Ljava/lang/String;Llt/c;)V
    .locals 0
    .param p1    # Lmt/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Llt/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0, p2}, Landroid/text/style/URLSpan;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lot/g;->a:Lmt/c;

    iput-object p2, p0, Lot/g;->b:Ljava/lang/String;

    iput-object p3, p0, Lot/g;->c:Llt/c;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lot/g;->c:Llt/c;

    iget-object v1, p0, Lot/g;->b:Ljava/lang/String;

    invoke-interface {v0, p1, v1}, Llt/c;->a(Landroid/view/View;Ljava/lang/String;)V

    return-void
.end method

.method public updateDrawState(Landroid/text/TextPaint;)V
    .locals 1
    .param p1    # Landroid/text/TextPaint;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lot/g;->a:Lmt/c;

    invoke-virtual {v0, p1}, Lmt/c;->f(Landroid/text/TextPaint;)V

    return-void
.end method
