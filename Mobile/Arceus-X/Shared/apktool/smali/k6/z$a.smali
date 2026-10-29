.class public final Lk6/z$a;
.super Lkotlin/coroutines/a;
.source "SourceFile"

# interfaces
.implements Lku/m0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lk6/z;->c(Le7/u;)Lku/p0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "k6/z$a",
        "Lkotlin/coroutines/a;",
        "Lku/m0;",
        "Lkotlin/coroutines/CoroutineContext;",
        "context",
        "",
        "exception",
        "",
        "handleException",
        "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V",
        "kotlinx-coroutines-core"
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
.field public final synthetic b:Le7/u;


# direct methods
.method public constructor <init>(Lku/m0$a;Le7/u;)V
    .locals 0

    iput-object p2, p0, Lk6/z$a;->b:Le7/u;

    invoke-direct {p0, p1}, Lkotlin/coroutines/a;-><init>(Lkotlin/coroutines/CoroutineContext$b;)V

    return-void
.end method


# virtual methods
.method public handleException(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V
    .locals 1

    iget-object p1, p0, Lk6/z$a;->b:Le7/u;

    if-eqz p1, :cond_0

    const-string v0, "RealImageLoader"

    invoke-static {p1, v0, p2}, Le7/v;->a(Le7/u;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method
