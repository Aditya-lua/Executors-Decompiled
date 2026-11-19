.class public final Lnn/i$c;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnn/i;->a(Ljava/lang/Object;Lnn/z;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/m;",
        "Lkotlin/jvm/functions/Function2<",
        "TOuterT;",
        "Lnn/z;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0007\u001a\u00020\u0006\"\u0008\u0008\u0000\u0010\u0001*\u00020\u0000\"\u0008\u0008\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "",
        "OuterT",
        "InnerT",
        "rendering",
        "Lnn/z;",
        "env",
        "",
        "a",
        "(Ljava/lang/Object;Lnn/z;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic i:Lnn/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnn/i<",
            "TOuterT;TInnerT;>;"
        }
    .end annotation
.end field

.field public final synthetic j:Landroid/view/View;

.field public final synthetic k:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "TInnerT;",
            "Lnn/z;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lnn/i;Landroid/view/View;Lkotlin/jvm/functions/Function2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnn/i<",
            "TOuterT;TInnerT;>;",
            "Landroid/view/View;",
            "Lkotlin/jvm/functions/Function2<",
            "-TInnerT;-",
            "Lnn/z;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lnn/i$c;->i:Lnn/i;

    iput-object p2, p0, Lnn/i$c;->j:Landroid/view/View;

    iput-object p3, p0, Lnn/i$c;->k:Lkotlin/jvm/functions/Function2;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Lnn/z;)V
    .locals 3
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
            "(TOuterT;",
            "Lnn/z;",
            ")V"
        }
    .end annotation

    const-string v0, "rendering"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "env"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lnn/i$c;->i:Lnn/i;

    invoke-static {v0}, Lnn/i;->b(Lnn/i;)Lpu/o;

    move-result-object v0

    iget-object v1, p0, Lnn/i$c;->j:Landroid/view/View;

    iget-object v2, p0, Lnn/i$c;->k:Lkotlin/jvm/functions/Function2;

    invoke-interface {v0, v1, v2, p1, p2}, Lpu/o;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, Lnn/z;

    invoke-virtual {p0, p1, p2}, Lnn/i$c;->a(Ljava/lang/Object;Lnn/z;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
