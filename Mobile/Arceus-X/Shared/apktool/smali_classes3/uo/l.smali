.class public final Luo/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\n\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u000b\u0010\nJ\u0015\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0010\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014\"\u0004\u0008\u0015\u0010\u0005R\u0011\u0010\u0018\u001a\u00020\u00088F\u00a2\u0006\u0006\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0019"
    }
    d2 = {
        "Luo/l;",
        "",
        "Lur/a;",
        "webRtcManager",
        "<init>",
        "(Lur/a;)V",
        "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;",
        "renderProps",
        "",
        "f",
        "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;)Z",
        "c",
        "Lmn/a;",
        "e",
        "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;)Lmn/a;",
        "",
        "a",
        "()V",
        "Lur/a;",
        "b",
        "()Lur/a;",
        "setWebRtcManager",
        "d",
        "()Z",
        "isWebRtcConnected",
        "government-id_release"
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
.field public a:Lur/a;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lur/a;)V
    .locals 0
    .param p1    # Lur/a;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Luo/l;->a:Lur/a;

    return-void
.end method

.method public synthetic constructor <init>(Lur/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 3
    invoke-static {}, Lur/c;->b()Lur/a;

    move-result-object p1

    .line 4
    :cond_0
    invoke-direct {p0, p1}, Luo/l;-><init>(Lur/a;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, Luo/l;->a:Lur/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lur/a;->d()V

    :cond_0
    return-void
.end method

.method public final b()Lur/a;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Luo/l;->a:Lur/a;

    return-object v0
.end method

.method public final c(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;)Z
    .locals 1
    .param p1    # Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "renderProps"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Luo/l;->e(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;)Lmn/a;

    move-result-object p1

    sget-object v0, Lmn/a;->a:Lmn/a;

    if-eq p1, v0, :cond_1

    sget-object v0, Lmn/a;->b:Lmn/a;

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final d()Z
    .locals 3

    iget-object v0, p0, Luo/l;->a:Lur/a;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lur/a;->isConnected()Z

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    return v2

    :cond_0
    return v1
.end method

.method public final e(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;)Lmn/a;
    .locals 5
    .param p1    # Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "renderProps"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->J()Lcom/withpersona/sdk2/inquiry/governmentid/video_capture/VideoCaptureConfig;

    move-result-object p1

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/governmentid/video_capture/VideoCaptureConfig;->g()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/governmentid/video_capture/VideoCaptureConfig;->j()Z

    move-result v1

    if-nez v1, :cond_0

    sget-object p1, Lmn/a;->c:Lmn/a;

    return-object p1

    :cond_0
    iget-object v1, p0, Luo/l;->a:Lur/a;

    if-eqz v1, :cond_1

    invoke-interface {v1}, Lur/a;->c()Z

    move-result v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Luo/l;->a:Lur/a;

    if-eqz v2, :cond_2

    invoke-interface {v2}, Lur/a;->g()Z

    move-result v2

    goto :goto_1

    :cond_2
    const/4 v2, 0x1

    :goto_1
    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/governmentid/video_capture/VideoCaptureConfig;->g()Ljava/util/List;

    move-result-object v3

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    sget-object v4, Lmn/a;->a:Lmn/a;

    if-ne v3, v4, :cond_4

    invoke-static {}, Lur/c;->d()Z

    move-result v3

    if-nez v3, :cond_4

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/governmentid/video_capture/VideoCaptureConfig;->g()Ljava/util/List;

    move-result-object p1

    sget-object v0, Lmn/a;->b:Lmn/a;

    invoke-interface {p1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    return-object v0

    :cond_3
    sget-object p1, Lmn/a;->c:Lmn/a;

    return-object p1

    :cond_4
    if-eqz v2, :cond_5

    sget-object p1, Lmn/a;->b:Lmn/a;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    return-object p1

    :cond_5
    if-eqz v1, :cond_6

    sget-object p1, Lmn/a;->c:Lmn/a;

    return-object p1

    :cond_6
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lmn/a;

    if-nez p1, :cond_7

    sget-object p1, Lmn/a;->c:Lmn/a;

    :cond_7
    return-object p1
.end method

.method public final f(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;)Z
    .locals 1
    .param p1    # Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "renderProps"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->J()Lcom/withpersona/sdk2/inquiry/governmentid/video_capture/VideoCaptureConfig;

    move-result-object v0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/video_capture/VideoCaptureConfig;->g()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->J()Lcom/withpersona/sdk2/inquiry/governmentid/video_capture/VideoCaptureConfig;

    move-result-object p1

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/governmentid/video_capture/VideoCaptureConfig;->j()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lmn/a;->a:Lmn/a;

    if-ne p1, v0, :cond_0

    invoke-static {}, Lur/c;->d()Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 p1, 0x1

    return p1
.end method
