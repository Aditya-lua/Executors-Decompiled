.class public Lfd/d$a;
.super Ln2/h$f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfd/d;->h(Landroid/content/Context;Lfd/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lfd/f;

.field public final synthetic b:Lfd/d;


# direct methods
.method public constructor <init>(Lfd/d;Lfd/f;)V
    .locals 0

    iput-object p1, p0, Lfd/d$a;->b:Lfd/d;

    iput-object p2, p0, Lfd/d$a;->a:Lfd/f;

    invoke-direct {p0}, Ln2/h$f;-><init>()V

    return-void
.end method


# virtual methods
.method public f(I)V
    .locals 2

    iget-object v0, p0, Lfd/d$a;->b:Lfd/d;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lfd/d;->c(Lfd/d;Z)Z

    iget-object v0, p0, Lfd/d$a;->a:Lfd/f;

    invoke-virtual {v0, p1}, Lfd/f;->a(I)V

    return-void
.end method

.method public g(Landroid/graphics/Typeface;)V
    .locals 2
    .param p1    # Landroid/graphics/Typeface;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lfd/d$a;->b:Lfd/d;

    iget v1, v0, Lfd/d;->e:I

    invoke-static {p1, v1}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object p1

    invoke-static {v0, p1}, Lfd/d;->b(Lfd/d;Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    iget-object p1, p0, Lfd/d$a;->b:Lfd/d;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lfd/d;->c(Lfd/d;Z)Z

    iget-object p1, p0, Lfd/d$a;->a:Lfd/f;

    iget-object v0, p0, Lfd/d$a;->b:Lfd/d;

    invoke-static {v0}, Lfd/d;->a(Lfd/d;)Landroid/graphics/Typeface;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lfd/f;->b(Landroid/graphics/Typeface;Z)V

    return-void
.end method
