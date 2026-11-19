.class public final Lc5/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh5/d$c;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lc5/k;",
        "Lh5/d$c;",
        "delegate",
        "Lc5/b;",
        "autoCloser",
        "<init>",
        "(Lh5/d$c;Lc5/b;)V",
        "Lh5/d$b;",
        "configuration",
        "Lc5/g;",
        "b",
        "(Lh5/d$b;)Lc5/g;",
        "a",
        "Lh5/d$c;",
        "Lc5/b;",
        "room-runtime"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final a:Lh5/d$c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lc5/b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lh5/d$c;Lc5/b;)V
    .locals 1
    .param p1    # Lh5/d$c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lc5/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "delegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "autoCloser"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc5/k;->a:Lh5/d$c;

    iput-object p2, p0, Lc5/k;->b:Lc5/b;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lh5/d$b;)Lh5/d;
    .locals 0

    invoke-virtual {p0, p1}, Lc5/k;->b(Lh5/d$b;)Lc5/g;

    move-result-object p1

    return-object p1
.end method

.method public b(Lh5/d$b;)Lc5/g;
    .locals 2
    .param p1    # Lh5/d$b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "configuration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lc5/g;

    iget-object v1, p0, Lc5/k;->a:Lh5/d$c;

    invoke-interface {v1, p1}, Lh5/d$c;->a(Lh5/d$b;)Lh5/d;

    move-result-object p1

    iget-object v1, p0, Lc5/k;->b:Lc5/b;

    invoke-direct {v0, p1, v1}, Lc5/g;-><init>(Lh5/d;Lc5/b;)V

    return-object v0
.end method
