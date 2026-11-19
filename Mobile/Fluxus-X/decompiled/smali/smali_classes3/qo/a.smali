.class public final Lqo/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lor/h;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lor/h<",
        "Lno/j;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0005\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J!\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u001a\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lqo/a;",
        "Lor/h;",
        "Lno/j;",
        "wrapped",
        "<init>",
        "(Lor/h;)V",
        "rendering",
        "Ljr/a;",
        "systemUiController",
        "",
        "a",
        "(Lno/j;Ljr/a;)V",
        "b",
        "Lor/h;",
        "document_release"
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
.field public final b:Lor/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lor/h<",
            "Lno/j;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lor/h;)V
    .locals 1
    .param p1    # Lor/h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lor/h<",
            "Lno/j;",
            ">;)V"
        }
    .end annotation

    const-string v0, "wrapped"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqo/a;->b:Lor/h;

    return-void
.end method


# virtual methods
.method public a(Lno/j;Ljr/a;)V
    .locals 1
    .param p1    # Lno/j;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljr/a;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "rendering"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lqo/a;->b:Lor/h;

    invoke-interface {v0, p1, p2}, Lor/h;->b(Ljava/lang/Object;Ljr/a;)V

    return-void
.end method

.method public bridge synthetic b(Ljava/lang/Object;Ljr/a;)V
    .locals 0

    check-cast p1, Lno/j;

    invoke-virtual {p0, p1, p2}, Lqo/a;->a(Lno/j;Ljr/a;)V

    return-void
.end method
