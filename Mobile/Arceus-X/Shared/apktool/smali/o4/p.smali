.class public final Lo4/p;
.super Lo4/o;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Lo4/p;",
        "Lo4/o;",
        "Landroid/window/OnBackInvokedDispatcher;",
        "onBackInvokedDispatcher",
        "<init>",
        "(Landroid/window/OnBackInvokedDispatcher;)V",
        "navigationevent"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>(Landroid/window/OnBackInvokedDispatcher;)V
    .locals 2
    .param p1    # Landroid/window/OnBackInvokedDispatcher;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "onBackInvokedDispatcher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0xf4240

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lo4/o;-><init>(Landroid/window/OnBackInvokedDispatcher;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
