.class public Lot/d;
.super Landroid/text/style/MetricAffectingSpan;
.source "SourceFile"


# instance fields
.field public final a:Lmt/c;


# direct methods
.method public constructor <init>(Lmt/c;)V
    .locals 0
    .param p1    # Lmt/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Landroid/text/style/MetricAffectingSpan;-><init>()V

    iput-object p1, p0, Lot/d;->a:Lmt/c;

    return-void
.end method


# virtual methods
.method public final a(Landroid/text/TextPaint;)V
    .locals 1

    iget-object v0, p0, Lot/d;->a:Lmt/c;

    invoke-virtual {v0, p1}, Lmt/c;->c(Landroid/graphics/Paint;)V

    return-void
.end method

.method public updateDrawState(Landroid/text/TextPaint;)V
    .locals 1

    invoke-virtual {p0, p1}, Lot/d;->a(Landroid/text/TextPaint;)V

    iget-object v0, p0, Lot/d;->a:Lmt/c;

    invoke-virtual {v0, p1}, Lmt/c;->m(Landroid/graphics/Paint;)I

    move-result v0

    iput v0, p1, Landroid/text/TextPaint;->bgColor:I

    return-void
.end method

.method public updateMeasureState(Landroid/text/TextPaint;)V
    .locals 0

    invoke-virtual {p0, p1}, Lot/d;->a(Landroid/text/TextPaint;)V

    return-void
.end method
