.class public final Le/m0$a;
.super Lo4/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le/m0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo4/e<",
        "Lo4/g;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\t\u0008\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H\u0014\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H\u0014\u00a2\u0006\u0004\u0008\r\u0010\u000cJ\u000f\u0010\u000e\u001a\u00020\nH\u0014\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\nH\u0014\u00a2\u0006\u0004\u0008\u0010\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Le/m0$a;",
        "Lo4/e;",
        "Lo4/g;",
        "Le/m0;",
        "onBackPressedCallback",
        "info",
        "<init>",
        "(Le/m0;Lo4/g;)V",
        "Lo4/b;",
        "event",
        "",
        "r",
        "(Lo4/b;)V",
        "q",
        "p",
        "()V",
        "o",
        "h",
        "Le/m0;",
        "activity"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final h:Le/m0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Le/m0;Lo4/g;)V
    .locals 1
    .param p1    # Le/m0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lo4/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "onBackPressedCallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "info"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Le/m0;->isEnabled()Z

    move-result v0

    invoke-direct {p0, p2, v0}, Lo4/e;-><init>(Lo4/g;Z)V

    iput-object p1, p0, Le/m0$a;->h:Le/m0;

    return-void
.end method


# virtual methods
.method public o()V
    .locals 1

    iget-object v0, p0, Le/m0$a;->h:Le/m0;

    invoke-virtual {v0}, Le/m0;->handleOnBackCancelled()V

    return-void
.end method

.method public p()V
    .locals 1

    iget-object v0, p0, Le/m0$a;->h:Le/m0;

    invoke-virtual {v0}, Le/m0;->handleOnBackPressed()V

    return-void
.end method

.method public q(Lo4/b;)V
    .locals 2
    .param p1    # Lo4/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Le/m0$a;->h:Le/m0;

    new-instance v1, Le/b;

    invoke-direct {v1, p1}, Le/b;-><init>(Lo4/b;)V

    invoke-virtual {v0, v1}, Le/m0;->handleOnBackProgressed(Le/b;)V

    return-void
.end method

.method public r(Lo4/b;)V
    .locals 2
    .param p1    # Lo4/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Le/m0$a;->h:Le/m0;

    new-instance v1, Le/b;

    invoke-direct {v1, p1}, Le/b;-><init>(Lo4/b;)V

    invoke-virtual {v0, v1}, Le/m0;->handleOnBackStarted(Le/b;)V

    return-void
.end method
