.class public Lfd/d$b;
.super Lfd/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfd/d;->g(Landroid/content/Context;Landroid/text/TextPaint;Lfd/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroid/content/Context;

.field public final synthetic b:Landroid/text/TextPaint;

.field public final synthetic c:Lfd/f;

.field public final synthetic d:Lfd/d;


# direct methods
.method public constructor <init>(Lfd/d;Landroid/content/Context;Landroid/text/TextPaint;Lfd/f;)V
    .locals 0

    iput-object p1, p0, Lfd/d$b;->d:Lfd/d;

    iput-object p2, p0, Lfd/d$b;->a:Landroid/content/Context;

    iput-object p3, p0, Lfd/d$b;->b:Landroid/text/TextPaint;

    iput-object p4, p0, Lfd/d$b;->c:Lfd/f;

    invoke-direct {p0}, Lfd/f;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 1

    iget-object v0, p0, Lfd/d$b;->c:Lfd/f;

    invoke-virtual {v0, p1}, Lfd/f;->a(I)V

    return-void
.end method

.method public b(Landroid/graphics/Typeface;Z)V
    .locals 3
    .param p1    # Landroid/graphics/Typeface;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lfd/d$b;->d:Lfd/d;

    iget-object v1, p0, Lfd/d$b;->a:Landroid/content/Context;

    iget-object v2, p0, Lfd/d$b;->b:Landroid/text/TextPaint;

    invoke-virtual {v0, v1, v2, p1}, Lfd/d;->p(Landroid/content/Context;Landroid/text/TextPaint;Landroid/graphics/Typeface;)V

    iget-object v0, p0, Lfd/d$b;->c:Lfd/f;

    invoke-virtual {v0, p1, p2}, Lfd/f;->b(Landroid/graphics/Typeface;Z)V

    return-void
.end method
