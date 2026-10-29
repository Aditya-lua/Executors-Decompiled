.class public final Lb5/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg5/d$c;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lb5/k;",
        "Lg5/d$c;",
        "delegate",
        "Lb5/b;",
        "autoCloser",
        "<init>",
        "(Lg5/d$c;Lb5/b;)V",
        "Lg5/d$b;",
        "configuration",
        "Lb5/g;",
        "b",
        "(Lg5/d$b;)Lb5/g;",
        "a",
        "Lg5/d$c;",
        "Lb5/b;",
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
.field public final a:Lg5/d$c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lb5/b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lg5/d$c;Lb5/b;)V
    .locals 1
    .param p1    # Lg5/d$c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lb5/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "delegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "autoCloser"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb5/k;->a:Lg5/d$c;

    iput-object p2, p0, Lb5/k;->b:Lb5/b;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lg5/d$b;)Lg5/d;
    .locals 0

    invoke-virtual {p0, p1}, Lb5/k;->b(Lg5/d$b;)Lb5/g;

    move-result-object p1

    return-object p1
.end method

.method public b(Lg5/d$b;)Lb5/g;
    .locals 2
    .param p1    # Lg5/d$b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "configuration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lb5/g;

    iget-object v1, p0, Lb5/k;->a:Lg5/d$c;

    invoke-interface {v1, p1}, Lg5/d$c;->a(Lg5/d$b;)Lg5/d;

    move-result-object p1

    iget-object v1, p0, Lb5/k;->b:Lb5/b;

    invoke-direct {v0, p1, v1}, Lb5/g;-><init>(Lg5/d;Lb5/b;)V

    return-object v0
.end method
