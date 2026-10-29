.class public final Lzm/k$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lzm/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0080\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lzm/k$a;",
        "",
        "<init>",
        "()V",
        "Lxu/h;",
        "bytes",
        "Lzm/k;",
        "a",
        "(Lxu/h;)Lzm/k;",
        "wf1-workflow-runtime"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lzm/k$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lxu/h;)Lzm/k;
    .locals 2
    .param p1    # Lxu/h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "bytes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lxu/e;

    invoke-direct {v0}, Lxu/e;-><init>()V

    invoke-virtual {v0, p1}, Lxu/e;->a0(Lxu/h;)Lxu/e;

    invoke-static {v0}, Lym/j;->a(Lxu/g;)Lxu/h;

    move-result-object p1

    sget-object v1, Lym/s;->f:Lym/s$a;

    invoke-virtual {v1, p1}, Lym/s$a;->a(Lxu/h;)Lym/s;

    move-result-object p1

    invoke-static {v0}, Lym/j;->b(Lxu/g;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lzm/k;

    invoke-direct {v1, p1, v0}, Lzm/k;-><init>(Lym/s;Ljava/lang/String;)V

    return-object v1
.end method
