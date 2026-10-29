.class public final Lym/m$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lym/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lym/m$a;",
        "",
        "<init>",
        "()V",
        "Lxu/h;",
        "bytes",
        "Lym/m;",
        "a",
        "(Lxu/h;)Lym/m;",
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
    invoke-direct {p0}, Lym/m$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lxu/h;)Lym/m;
    .locals 3
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

    move-result-object p1

    invoke-static {p1}, Lym/j;->a(Lxu/g;)Lxu/h;

    move-result-object v0

    new-instance v1, Lym/m;

    sget-object v2, Lym/i;->c:Lym/i$a;

    invoke-virtual {v2, v0}, Lym/i$a;->b(Lxu/h;)Lym/i;

    move-result-object v0

    new-instance v2, Lym/m$a$a;

    invoke-direct {v2, p1}, Lym/m$a$a;-><init>(Lxu/g;)V

    invoke-direct {v1, v0, v2}, Lym/m;-><init>(Lym/i;Lkotlin/jvm/functions/Function0;)V

    return-object v1
.end method
