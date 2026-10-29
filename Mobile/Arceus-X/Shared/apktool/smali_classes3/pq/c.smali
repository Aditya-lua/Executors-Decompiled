.class public final Lpq/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0007\u0018\u00002\u00020\u0001B\u0019\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u0013R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0014\u00a8\u0006\u0016"
    }
    d2 = {
        "Lpq/c;",
        "",
        "Lpq/e;",
        "externalInquiryController",
        "Lku/p0;",
        "coroutineScope",
        "<init>",
        "(Lpq/e;Lku/p0;)V",
        "Lcom/withpersona/sdk2/inquiry/inline_inquiry/InquiryEvent;",
        "inquiryEvent",
        "",
        "b",
        "(Lcom/withpersona/sdk2/inquiry/inline_inquiry/InquiryEvent;)V",
        "Lpq/i;",
        "page",
        "c",
        "(Lpq/i;)V",
        "a",
        "Lpq/e;",
        "Lku/p0;",
        "Lpq/i;",
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
.field public final a:Lpq/e;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lku/p0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public c:Lpq/i;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lpq/e;Lku/p0;)V
    .locals 1
    .param p1    # Lpq/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lku/p0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "externalInquiryController"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpq/c;->a:Lpq/e;

    iput-object p2, p0, Lpq/c;->b:Lku/p0;

    return-void
.end method

.method public static final synthetic a(Lpq/c;)Lpq/e;
    .locals 0

    iget-object p0, p0, Lpq/c;->a:Lpq/e;

    return-object p0
.end method


# virtual methods
.method public final b(Lcom/withpersona/sdk2/inquiry/inline_inquiry/InquiryEvent;)V
    .locals 7
    .param p1    # Lcom/withpersona/sdk2/inquiry/inline_inquiry/InquiryEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "inquiryEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lpq/c;->b:Lku/p0;

    new-instance v4, Lpq/c$a;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, v0}, Lpq/c$a;-><init>(Lpq/c;Lcom/withpersona/sdk2/inquiry/inline_inquiry/InquiryEvent;Lnt/b;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lku/i;->d(Lku/p0;Lkotlin/coroutines/CoroutineContext;Lku/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lku/d2;

    return-void
.end method

.method public final c(Lpq/i;)V
    .locals 2
    .param p1    # Lpq/i;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "page"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lpq/c;->c:Lpq/i;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iput-object p1, p0, Lpq/c;->c:Lpq/i;

    new-instance v0, Lcom/withpersona/sdk2/inquiry/inline_inquiry/InquiryEvent$PageChange;

    invoke-virtual {p1}, Lpq/i;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lpq/i;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lcom/withpersona/sdk2/inquiry/inline_inquiry/InquiryEvent$PageChange;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lpq/c;->b(Lcom/withpersona/sdk2/inquiry/inline_inquiry/InquiryEvent;)V

    return-void
.end method
