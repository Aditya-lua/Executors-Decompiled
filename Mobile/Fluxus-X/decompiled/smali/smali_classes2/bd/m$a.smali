.class public Lbd/m$a;
.super Lfd/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbd/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lbd/m;


# direct methods
.method public constructor <init>(Lbd/m;)V
    .locals 0

    iput-object p1, p0, Lbd/m$a;->a:Lbd/m;

    invoke-direct {p0}, Lfd/f;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 1

    iget-object p1, p0, Lbd/m$a;->a:Lbd/m;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lbd/m;->a(Lbd/m;Z)Z

    iget-object p1, p0, Lbd/m$a;->a:Lbd/m;

    invoke-static {p1}, Lbd/m;->b(Lbd/m;)Ljava/lang/ref/WeakReference;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lbd/m$b;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lbd/m$b;->a()V

    :cond_0
    return-void
.end method

.method public b(Landroid/graphics/Typeface;Z)V
    .locals 0
    .param p1    # Landroid/graphics/Typeface;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lbd/m$a;->a:Lbd/m;

    const/4 p2, 0x1

    invoke-static {p1, p2}, Lbd/m;->a(Lbd/m;Z)Z

    iget-object p1, p0, Lbd/m$a;->a:Lbd/m;

    invoke-static {p1}, Lbd/m;->b(Lbd/m;)Ljava/lang/ref/WeakReference;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lbd/m$b;

    if-eqz p1, :cond_1

    invoke-interface {p1}, Lbd/m$b;->a()V

    :cond_1
    :goto_0
    return-void
.end method
