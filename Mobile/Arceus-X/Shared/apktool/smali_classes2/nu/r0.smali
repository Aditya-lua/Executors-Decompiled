.class public final Lnu/r0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a!\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\u0008\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a=\u0010\r\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000c\"\u0004\u0008\u0000\u0010\u0000*\u0008\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\nH\u0000\u00a2\u0006\u0004\u0008\r\u0010\u000e\"\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0010\"\u0014\u0010\u0013\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0010\u00a8\u0006\u0014"
    }
    d2 = {
        "T",
        "value",
        "Lnu/c0;",
        "a",
        "(Ljava/lang/Object;)Lnu/c0;",
        "Lnu/p0;",
        "Lkotlin/coroutines/CoroutineContext;",
        "context",
        "",
        "capacity",
        "Lmu/a;",
        "onBufferOverflow",
        "Lnu/h;",
        "d",
        "(Lnu/p0;Lkotlin/coroutines/CoroutineContext;ILmu/a;)Lnu/h;",
        "Lqu/e0;",
        "Lqu/e0;",
        "NONE",
        "b",
        "PENDING",
        "kotlinx-coroutines-core"
    }
    k = 0x2
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Lqu/e0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final b:Lqu/e0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lqu/e0;

    const-string v1, "NONE"

    invoke-direct {v0, v1}, Lqu/e0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lnu/r0;->a:Lqu/e0;

    new-instance v0, Lqu/e0;

    const-string v1, "PENDING"

    invoke-direct {v0, v1}, Lqu/e0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lnu/r0;->b:Lqu/e0;

    return-void
.end method

.method public static final a(Ljava/lang/Object;)Lnu/c0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)",
            "Lnu/c0<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lnu/q0;

    if-nez p0, :cond_0

    sget-object p0, Lou/t;->a:Lqu/e0;

    :cond_0
    invoke-direct {v0, p0}, Lnu/q0;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public static final synthetic b()Lqu/e0;
    .locals 1

    sget-object v0, Lnu/r0;->a:Lqu/e0;

    return-object v0
.end method

.method public static final synthetic c()Lqu/e0;
    .locals 1

    sget-object v0, Lnu/r0;->b:Lqu/e0;

    return-object v0
.end method

.method public static final d(Lnu/p0;Lkotlin/coroutines/CoroutineContext;ILmu/a;)Lnu/h;
    .locals 1
    .param p0    # Lnu/p0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lkotlin/coroutines/CoroutineContext;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lmu/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lnu/p0<",
            "+TT;>;",
            "Lkotlin/coroutines/CoroutineContext;",
            "I",
            "Lmu/a;",
            ")",
            "Lnu/h<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    if-ltz p2, :cond_0

    const/4 v0, 0x2

    if-ge p2, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, -0x2

    if-ne p2, v0, :cond_1

    :goto_0
    sget-object v0, Lmu/a;->b:Lmu/a;

    if-ne p3, v0, :cond_1

    return-object p0

    :cond_1
    invoke-static {p0, p1, p2, p3}, Lnu/i0;->e(Lnu/g0;Lkotlin/coroutines/CoroutineContext;ILmu/a;)Lnu/h;

    move-result-object p0

    return-object p0
.end method
