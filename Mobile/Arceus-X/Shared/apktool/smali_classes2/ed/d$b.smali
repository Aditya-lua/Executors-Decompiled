.class public Led/d$b;
.super Led/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Led/d;->g(Landroid/content/Context;Landroid/text/TextPaint;Led/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroid/content/Context;

.field public final synthetic b:Landroid/text/TextPaint;

.field public final synthetic c:Led/f;

.field public final synthetic d:Led/d;


# direct methods
.method public constructor <init>(Led/d;Landroid/content/Context;Landroid/text/TextPaint;Led/f;)V
    .locals 0

    iput-object p1, p0, Led/d$b;->d:Led/d;

    iput-object p2, p0, Led/d$b;->a:Landroid/content/Context;

    iput-object p3, p0, Led/d$b;->b:Landroid/text/TextPaint;

    iput-object p4, p0, Led/d$b;->c:Led/f;

    invoke-direct {p0}, Led/f;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 1

    iget-object v0, p0, Led/d$b;->c:Led/f;

    invoke-virtual {v0, p1}, Led/f;->a(I)V

    return-void
.end method

.method public b(Landroid/graphics/Typeface;Z)V
    .locals 3
    .param p1    # Landroid/graphics/Typeface;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Led/d$b;->d:Led/d;

    iget-object v1, p0, Led/d$b;->a:Landroid/content/Context;

    iget-object v2, p0, Led/d$b;->b:Landroid/text/TextPaint;

    invoke-virtual {v0, v1, v2, p1}, Led/d;->p(Landroid/content/Context;Landroid/text/TextPaint;Landroid/graphics/Typeface;)V

    iget-object v0, p0, Led/d$b;->c:Led/f;

    invoke-virtual {v0, p1, p2}, Led/f;->b(Landroid/graphics/Typeface;Z)V

    return-void
.end method
