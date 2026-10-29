.class public final Lko/x;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0006\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\u0008\u0002\u0010\u0003\"\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0003\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;",
        "",
        "a",
        "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;)Z",
        "waitingOnWebRtcSetup",
        "b",
        "webRtcCaptureInProgress",
        "government-id_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;)Z
    .locals 2
    .param p0    # Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;->L()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;

    move-result-object v0

    instance-of v0, v0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;->O()Lmn/a;

    move-result-object v0

    sget-object v1, Lmn/a;->a:Lmn/a;

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;->L()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;

    move-result-object p0

    check-cast p0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;->W()Luo/x;

    move-result-object p0

    sget-object v0, Luo/x;->b:Luo/x;

    if-eq p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final b(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;)Z
    .locals 2
    .param p0    # Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;->L()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;

    move-result-object v0

    instance-of v0, v0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;->O()Lmn/a;

    move-result-object v0

    sget-object v1, Lmn/a;->a:Lmn/a;

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;->L()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;

    move-result-object p0

    check-cast p0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;->W()Luo/x;

    move-result-object p0

    sget-object v0, Luo/x;->b:Luo/x;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method
