.class public final Ldr/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0007\u0018\u00002\u00020\u0001B\u0019\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u0013R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0014\u00a8\u0006\u0016"
    }
    d2 = {
        "Ldr/c;",
        "",
        "Ldr/e;",
        "externalInquiryController",
        "Lav/p0;",
        "coroutineScope",
        "<init>",
        "(Ldr/e;Lav/p0;)V",
        "Lkp/d;",
        "inquiryEvent",
        "",
        "b",
        "(Lkp/d;)V",
        "Ldr/i;",
        "page",
        "c",
        "(Ldr/i;)V",
        "a",
        "Ldr/e;",
        "Lav/p0;",
        "Ldr/i;",
        "currentPage",
        "shared_release"
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
.field public final a:Ldr/e;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lav/p0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public c:Ldr/i;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldr/e;Lav/p0;)V
    .locals 1
    .param p1    # Ldr/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lav/p0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "externalInquiryController"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldr/c;->a:Ldr/e;

    iput-object p2, p0, Ldr/c;->b:Lav/p0;

    return-void
.end method

.method public static final synthetic a(Ldr/c;)Ldr/e;
    .locals 0

    iget-object p0, p0, Ldr/c;->a:Ldr/e;

    return-object p0
.end method


# virtual methods
.method public final b(Lkp/d;)V
    .locals 7
    .param p1    # Lkp/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "inquiryEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Ldr/c;->b:Lav/p0;

    new-instance v4, Ldr/c$a;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, v0}, Ldr/c$a;-><init>(Ldr/c;Lkp/d;Leu/b;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lav/i;->d(Lav/p0;Lkotlin/coroutines/CoroutineContext;Lav/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lav/d2;

    return-void
.end method

.method public final c(Ldr/i;)V
    .locals 2
    .param p1    # Ldr/i;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "page"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ldr/c;->c:Ldr/i;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iput-object p1, p0, Ldr/c;->c:Ldr/i;

    new-instance v0, Lkp/d$a;

    invoke-virtual {p1}, Ldr/i;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ldr/i;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lkp/d$a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Ldr/c;->b(Lkp/d;)V

    return-void
.end method
