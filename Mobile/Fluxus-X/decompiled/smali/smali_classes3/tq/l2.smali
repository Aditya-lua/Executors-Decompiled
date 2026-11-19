.class public final Ltq/l2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0005\u001a#\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a5\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0007\u001a\u00020\u00062\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0000\u00a2\u0006\u0004\u0008\r\u0010\u000e\u001a\u0011\u0010\u000f\u001a\u00020\u000c*\u00020\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u001a\u0011\u0010\u0012\u001a\u00020\u0011*\u00020\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u001aS\u0010 \u001a\u00020\u0001*\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u000c\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u00162\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u0000\u00a2\u0006\u0004\u0008 \u0010!\u00a8\u0006\""
    }
    d2 = {
        "Lls/g;",
        "Lmq/y0;",
        "",
        "addCurrentState",
        "a",
        "(Lls/g;Z)Lmq/y0;",
        "Landroid/content/Context;",
        "context",
        "renderContext",
        "Lmq/q5$b;",
        "renderProps",
        "useVideoCapture",
        "",
        "d",
        "(Landroid/content/Context;Lls/g;Lmq/q5$b;Z)V",
        "c",
        "(Lmq/y0;)V",
        "Ldr/j;",
        "f",
        "(Lmq/y0;)Ldr/j;",
        "Lmq/t;",
        "poseConfigs",
        "",
        "Lmq/b0;",
        "selfies",
        "",
        "webRtcObjectId",
        "Lsn/v;",
        "cameraProperties",
        "",
        "startSelfieTimestamp",
        "backState",
        "e",
        "(Lls/g;Lmq/t;Ljava/util/List;Ljava/lang/String;Lsn/v;JLmq/y0;)Lmq/y0;",
        "selfie_release"
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
.method public static final a(Lls/g;Z)Lmq/y0;
    .locals 1
    .param p0    # Lls/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lls/g<",
            "Lmq/y0;",
            ">;Z)",
            "Lmq/y0;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lls/g;->i()Lls/h;

    move-result-object p0

    check-cast p0, Lmq/y0;

    return-object p0

    :cond_0
    invoke-virtual {p0}, Lls/g;->i()Lls/h;

    move-result-object p0

    check-cast p0, Lmq/y0;

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lmq/y0;->u()Lmq/y0;

    move-result-object p0

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static synthetic b(Lls/g;ZILjava/lang/Object;)Lmq/y0;
    .locals 0

    const/4 p3, 0x1

    and-int/2addr p2, p3

    if-eqz p2, :cond_0

    move p1, p3

    :cond_0
    invoke-static {p0, p1}, Ltq/l2;->a(Lls/g;Z)Lmq/y0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lmq/y0;)V
    .locals 2
    .param p0    # Lmq/y0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lmq/y0;->w()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lmq/b0;

    new-instance v1, Ljava/io/File;

    invoke-virtual {v0}, Lmq/b0;->a()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static final d(Landroid/content/Context;Lls/g;Lmq/q5$b;Z)V
    .locals 12
    .param p0    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lls/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lmq/q5$b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lls/g<",
            "Lmq/y0;",
            ">;",
            "Lmq/q5$b;",
            "Z)V"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "renderContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "renderProps"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lfq/n0;->a:Lfq/n0;

    filled-new-array {v0}, [Lfq/n0;

    move-result-object v1

    invoke-static {v1}, Lkotlin/collections/p;->p([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    if-eqz p3, :cond_0

    invoke-static {p0}, Lxq/g;->f(Landroid/content/Context;)Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-virtual {p2}, Lmq/q5$b;->O()Lcom/withpersona/sdk2/inquiry/selfie/video_capture/VideoCaptureConfig;

    move-result-object p2

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/selfie/video_capture/VideoCaptureConfig;->f()Z

    move-result p2

    if-eqz p2, :cond_0

    sget-object p2, Lfq/n0;->b:Lfq/n0;

    invoke-interface {v1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    invoke-static {p0, v1}, Lfq/y1;->a(Landroid/content/Context;Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lls/g;->i()Lls/h;

    move-result-object p2

    check-cast p2, Lmq/y0;

    if-nez p2, :cond_2

    :goto_0
    return-void

    :cond_2
    instance-of p3, p2, Lmq/y0$p;

    if-eqz p3, :cond_3

    move-object v1, p2

    check-cast v1, Lmq/y0$p;

    invoke-interface {p0, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p2

    xor-int/lit8 v2, p2, 0x1

    sget-object p2, Lfq/n0;->b:Lfq/n0;

    invoke-interface {p0, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p0

    xor-int/lit8 v3, p0, 0x1

    const/16 v10, 0xfc

    const/4 v11, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v1 .. v11}, Lmq/y0$p;->z(Lmq/y0$p;ZZLmq/y0;Ljava/util/List;Lmq/t;ZLsn/v$b;ZILjava/lang/Object;)Lmq/y0$p;

    move-result-object p0

    invoke-virtual {p1, p0}, Lls/g;->p(Lls/h;)V

    return-void

    :cond_3
    invoke-static {p2}, Ltq/l2;->c(Lmq/y0;)V

    new-instance v0, Lmq/y0$i;

    const/4 p0, 0x0

    invoke-static {p1, p0}, Ltq/l2;->a(Lls/g;Z)Lmq/y0;

    move-result-object v3

    invoke-virtual {p2}, Lmq/y0;->v()Lsn/v$b;

    move-result-object v4

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct/range {v0 .. v6}, Lmq/y0$i;-><init>(ZZLmq/y0;Lsn/v$b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1, v0}, Lls/g;->p(Lls/h;)V

    return-void
.end method

.method public static final e(Lls/g;Lmq/t;Ljava/util/List;Ljava/lang/String;Lsn/v;JLmq/y0;)Lmq/y0;
    .locals 12
    .param p0    # Lls/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lmq/t;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Lsn/v;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Lmq/y0;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lls/g<",
            "Lmq/y0;",
            ">;",
            "Lmq/t;",
            "Ljava/util/List<",
            "+",
            "Lmq/b0;",
            ">;",
            "Ljava/lang/String;",
            "Lsn/v;",
            "J",
            "Lmq/y0;",
            ")",
            "Lmq/y0;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v2, "<this>"

    invoke-static {p0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "poseConfigs"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "selfies"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "cameraProperties"

    move-object/from16 v4, p4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v2, p2

    check-cast v2, Ljava/lang/Iterable;

    move-object v5, v2

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_0
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Lmq/b0;

    instance-of v8, v7, Lmq/b0$b;

    if-eqz v8, :cond_1

    check-cast v7, Lmq/b0$b;

    invoke-virtual {v7}, Lmq/b0$b;->i()Lxn/a;

    move-result-object v7

    invoke-virtual {p1, v7}, Lmq/t;->a(Lxn/a;)Lmq/s;

    move-result-object v7

    invoke-virtual {v7}, Lmq/s;->f()Z

    move-result v7

    goto :goto_1

    :cond_1
    const/4 v7, 0x0

    :goto_1
    if-eqz v7, :cond_0

    invoke-interface {v2, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    const-string v5, "Required value was null."

    if-nez v0, :cond_4

    new-instance v0, Lmq/y0$j;

    invoke-virtual {p0}, Lls/g;->i()Lls/h;

    move-result-object v3

    if-eqz v3, :cond_3

    check-cast v3, Lmq/y0;

    invoke-virtual {v3}, Lmq/y0;->v()Lsn/v$b;

    move-result-object v8

    move-object v1, p2

    move-object v3, p3

    move-wide/from16 v5, p5

    move-object/from16 v7, p7

    invoke-direct/range {v0 .. v8}, Lmq/y0$j;-><init>(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lsn/v;JLmq/y0;Lsn/v$b;)V

    return-object v0

    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    new-instance v0, Lmq/y0$o;

    invoke-virtual {p0}, Lls/g;->i()Lls/h;

    move-result-object v1

    if-eqz v1, :cond_5

    check-cast v1, Lmq/y0;

    invoke-virtual {v1}, Lmq/y0;->v()Lsn/v$b;

    move-result-object v7

    const/16 v10, 0xc0

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v1, p2

    move-object v2, p3

    move-object/from16 v3, p4

    move-wide/from16 v4, p5

    move-object/from16 v6, p7

    invoke-direct/range {v0 .. v11}, Lmq/y0$o;-><init>(Ljava/util/List;Ljava/lang/String;Lsn/v;JLmq/y0;Lsn/v$b;ILcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final f(Lmq/y0;)Ldr/j;
    .locals 2
    .param p0    # Lmq/y0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lmq/y0$k;

    if-eqz v0, :cond_0

    sget-object p0, Ldr/j$e;->a:Ldr/j$e;

    return-object p0

    :cond_0
    instance-of v0, p0, Lmq/y0$l;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    new-instance v0, Ldr/j$c;

    check-cast p0, Lmq/y0$l;

    invoke-virtual {p0}, Lmq/y0$l;->n()Lxn/a;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-static {p0}, Lmq/m0;->a(Lxn/a;)Ljava/lang/String;

    move-result-object v1

    :cond_1
    invoke-direct {v0, v1}, Ldr/j$c;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_2
    instance-of v0, p0, Lmq/y0$i;

    if-eqz v0, :cond_3

    new-instance p0, Ldr/j$f;

    invoke-direct {p0, v1}, Ldr/j$f;-><init>(Ljava/lang/String;)V

    return-object p0

    :cond_3
    instance-of v0, p0, Lmq/y0$a;

    if-eqz v0, :cond_4

    new-instance p0, Ldr/j$c;

    invoke-direct {p0, v1}, Ldr/j$c;-><init>(Ljava/lang/String;)V

    return-object p0

    :cond_4
    instance-of v0, p0, Lmq/a;

    if-eqz v0, :cond_6

    new-instance v0, Ldr/j$f;

    check-cast p0, Lmq/a;

    invoke-interface {p0}, Lmq/a;->n()Lxn/a;

    move-result-object p0

    if-eqz p0, :cond_5

    invoke-static {p0}, Lmq/m0;->a(Lxn/a;)Ljava/lang/String;

    move-result-object v1

    :cond_5
    invoke-direct {v0, v1}, Ldr/j$f;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_6
    instance-of v0, p0, Lmq/y0$c;

    if-eqz v0, :cond_7

    check-cast p0, Lmq/y0$c;

    invoke-virtual {p0}, Lmq/y0$c;->z()Lmq/y0;

    move-result-object p0

    invoke-static {p0}, Ltq/l2;->f(Lmq/y0;)Ldr/j;

    move-result-object p0

    return-object p0

    :cond_7
    instance-of v0, p0, Lmq/y0$f;

    if-nez v0, :cond_c

    instance-of v0, p0, Lmq/y0$g;

    if-nez v0, :cond_c

    instance-of v0, p0, Lmq/y0$r;

    if-eqz v0, :cond_8

    goto :goto_0

    :cond_8
    instance-of v0, p0, Lmq/y0$j;

    if-eqz v0, :cond_9

    sget-object p0, Ldr/j$a;->a:Ldr/j$a;

    return-object p0

    :cond_9
    instance-of v0, p0, Lmq/y0$o;

    if-eqz v0, :cond_a

    sget-object p0, Ldr/j$d;->a:Ldr/j$d;

    return-object p0

    :cond_a
    instance-of p0, p0, Lmq/y0$p;

    if-eqz p0, :cond_b

    new-instance p0, Ldr/j$f;

    invoke-direct {p0, v1}, Ldr/j$f;-><init>(Ljava/lang/String;)V

    return-object p0

    :cond_b
    new-instance p0, Lzt/l;

    invoke-direct {p0}, Lzt/l;-><init>()V

    throw p0

    :cond_c
    :goto_0
    sget-object p0, Ldr/j$b;->a:Ldr/j$b;

    return-object p0
.end method
