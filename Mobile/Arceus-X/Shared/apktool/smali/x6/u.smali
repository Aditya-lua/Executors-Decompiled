.class public final Lx6/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx6/d;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000f\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000cR(\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\r\u0010\u000f\"\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0016"
    }
    d2 = {
        "Lx6/u;",
        "Lx6/d;",
        "Landroid/view/View;",
        "view",
        "Lku/w0;",
        "Lx6/k;",
        "job",
        "<init>",
        "(Landroid/view/View;Lku/w0;)V",
        "",
        "a",
        "()V",
        "Landroid/view/View;",
        "b",
        "Lku/w0;",
        "()Lku/w0;",
        "d",
        "(Lku/w0;)V",
        "",
        "c",
        "()Z",
        "isDisposed",
        "coil-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final a:Landroid/view/View;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public volatile b:Lku/w0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lku/w0<",
            "+",
            "Lx6/k;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/view/View;Lku/w0;)V
    .locals 0
    .param p1    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lku/w0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Lku/w0<",
            "+",
            "Lx6/k;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx6/u;->a:Landroid/view/View;

    iput-object p2, p0, Lx6/u;->b:Lku/w0;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    invoke-virtual {p0}, Lx6/u;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lx6/u;->a:Landroid/view/View;

    invoke-static {v0}, Lx6/x;->a(Landroid/view/View;)Lx6/w;

    move-result-object v0

    invoke-virtual {v0}, Lx6/w;->a()V

    return-void
.end method

.method public b()Lku/w0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lku/w0<",
            "Lx6/k;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lx6/u;->b:Lku/w0;

    return-object v0
.end method

.method public c()Z
    .locals 1

    iget-object v0, p0, Lx6/u;->a:Landroid/view/View;

    invoke-static {v0}, Lx6/x;->a(Landroid/view/View;)Lx6/w;

    move-result-object v0

    invoke-virtual {v0, p0}, Lx6/w;->c(Lx6/u;)Z

    move-result v0

    return v0
.end method

.method public d(Lku/w0;)V
    .locals 0
    .param p1    # Lku/w0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lku/w0<",
            "+",
            "Lx6/k;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lx6/u;->b:Lku/w0;

    return-void
.end method
