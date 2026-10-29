.class public Led/d$a;
.super Ln2/h$f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Led/d;->h(Landroid/content/Context;Led/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Led/f;

.field public final synthetic b:Led/d;


# direct methods
.method public constructor <init>(Led/d;Led/f;)V
    .locals 0

    iput-object p1, p0, Led/d$a;->b:Led/d;

    iput-object p2, p0, Led/d$a;->a:Led/f;

    invoke-direct {p0}, Ln2/h$f;-><init>()V

    return-void
.end method


# virtual methods
.method public f(I)V
    .locals 2

    iget-object v0, p0, Led/d$a;->b:Led/d;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Led/d;->c(Led/d;Z)Z

    iget-object v0, p0, Led/d$a;->a:Led/f;

    invoke-virtual {v0, p1}, Led/f;->a(I)V

    return-void
.end method

.method public g(Landroid/graphics/Typeface;)V
    .locals 2
    .param p1    # Landroid/graphics/Typeface;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Led/d$a;->b:Led/d;

    iget v1, v0, Led/d;->e:I

    invoke-static {p1, v1}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object p1

    invoke-static {v0, p1}, Led/d;->b(Led/d;Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    iget-object p1, p0, Led/d$a;->b:Led/d;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Led/d;->c(Led/d;Z)Z

    iget-object p1, p0, Led/d$a;->a:Led/f;

    iget-object v0, p0, Led/d$a;->b:Led/d;

    invoke-static {v0}, Led/d;->a(Led/d;)Landroid/graphics/Typeface;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Led/f;->b(Landroid/graphics/Typeface;Z)V

    return-void
.end method
