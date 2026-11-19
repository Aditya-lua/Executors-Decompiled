.class public final Lrn/g$e;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrn/g;->c(Lrn/f;Lnn/z;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/m;",
        "Lkotlin/jvm/functions/Function1<",
        "Landroid/view/View;",
        "Landroidx/lifecycle/l;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u00020\u0004\"\u0008\u0008\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "",
        "ModalRenderingT",
        "Landroid/view/View;",
        "it",
        "Landroidx/lifecycle/l;",
        "a",
        "(Landroid/view/View;)Landroidx/lifecycle/l;"
    }
    k = 0x3
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic i:Lrn/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lrn/g<",
            "TModalRenderingT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lrn/g;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lrn/g<",
            "TModalRenderingT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lrn/g$e;->i:Lrn/g;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;)Landroidx/lifecycle/l;
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lrn/g$e;->i:Lrn/g;

    invoke-static {p1}, Lrn/g;->a(Lrn/g;)Lon/d;

    move-result-object p1

    invoke-interface {p1}, Landroidx/lifecycle/s;->a()Landroidx/lifecycle/l;

    move-result-object p1

    const-string v0, "parentLifecycleOwner.lifecycle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/view/View;

    invoke-virtual {p0, p1}, Lrn/g$e;->a(Landroid/view/View;)Landroidx/lifecycle/l;

    move-result-object p1

    return-object p1
.end method
