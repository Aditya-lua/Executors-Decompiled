.class public final Lfq/m0$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnn/k;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfq/m0$a;->a(Ls5/a;)Lnn/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<RenderingT:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lnn/k;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0008\u001a\u00020\u0007\"\u0008\u0008\u0000\u0010\u0001*\u00020\u0000\"\n\u0008\u0001\u0010\u0003\u0018\u0001*\u00020\u0002\"\u0008\u0008\u0002\u0010\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\n\u00a2\u0006\u0004\u0008\u0008\u0010\t"
    }
    d2 = {
        "Ls5/a;",
        "BindingT",
        "",
        "RenderingT",
        "rendering",
        "Lnn/z;",
        "viewEnvironment",
        "",
        "a",
        "(Ljava/lang/Object;Lnn/z;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic b:Ls5/a;

.field public final synthetic c:Lfq/m0;


# direct methods
.method public constructor <init>(Ls5/a;Lfq/m0;)V
    .locals 0

    iput-object p1, p0, Lfq/m0$a$a;->b:Ls5/a;

    iput-object p2, p0, Lfq/m0$a$a;->c:Lfq/m0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Lnn/z;)V
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lnn/z;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TRenderingT;",
            "Lnn/z;",
            ")V"
        }
    .end annotation

    const-string v0, "rendering"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewEnvironment"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lfq/m0$a$a;->b:Ls5/a;

    check-cast p1, Lfq/m0;

    check-cast p2, Lgq/a;

    invoke-virtual {p2}, Lgq/a;->getRoot()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "getContext(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lxq/g;->h(Landroid/content/Context;)Lj/b;

    move-result-object v0

    invoke-static {p1}, Lfq/m0;->b(Lfq/m0;)Lkotlin/jvm/functions/Function1;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p2}, Lgq/a;->getRoot()Landroid/view/View;

    move-result-object v1

    new-instance v2, Lfq/m0$c;

    iget-object v3, p0, Lfq/m0$a$a;->c:Lfq/m0;

    invoke-direct {v2, p2, v3, p1, v0}, Lfq/m0$c;-><init>(Lgq/a;Lfq/m0;Lfq/m0;Lj/b;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method
