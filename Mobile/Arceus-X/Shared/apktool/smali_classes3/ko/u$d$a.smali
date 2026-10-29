.class public final Lko/u$d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnu/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lko/u$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lnu/i;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic a:Lko/u;


# direct methods
.method public constructor <init>(Lko/u;)V
    .locals 0

    iput-object p1, p0, Lko/u$d$a;->a:Lko/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lcom/withpersona/sdk2/camera/d;Lnt/b;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/camera/d;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of p2, p1, Lcom/withpersona/sdk2/camera/d$e;

    if-eqz p2, :cond_0

    iget-object p1, p0, Lko/u$d$a;->a:Lko/u;

    invoke-static {p1}, Lko/u;->l(Lko/u;)Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    move-result-object p1

    iget-object p2, p0, Lko/u$d$a;->a:Lko/u;

    invoke-static {p2}, Lko/u;->h(Lko/u;)Lfn/g;

    move-result-object p2

    invoke-interface {p2}, Lfn/g;->a()Lcom/withpersona/sdk2/camera/CameraProperties;

    move-result-object p2

    invoke-static {p2}, Lcom/withpersona/sdk2/camera/c;->a(Lcom/withpersona/sdk2/camera/CameraProperties;)Lcom/withpersona/sdk2/inquiry/tracking/model/CameraInfoEventData;

    move-result-object p2

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p1, p2, v2, v0, v1}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;->logCameraInfoEvent$default(Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lcom/withpersona/sdk2/inquiry/tracking/model/CameraInfoEventData;ZILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    sget-object p2, Lcom/withpersona/sdk2/camera/d$b;->a:Lcom/withpersona/sdk2/camera/d$b;

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    iget-object p1, p0, Lko/u$d$a;->a:Lko/u;

    invoke-static {p1}, Lko/u;->i(Lko/u;)Lkotlin/jvm/functions/Function1;

    move-result-object p1

    if-eqz p1, :cond_2

    new-instance p2, Lfn/v0;

    invoke-direct {p2}, Lfn/v0;-><init>()V

    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    instance-of p2, p1, Lcom/withpersona/sdk2/camera/d$a;

    if-eqz p2, :cond_2

    check-cast p1, Lcom/withpersona/sdk2/camera/d$a;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/camera/d$a;->a()Z

    move-result p2

    if-eqz p2, :cond_2

    iget-object p2, p0, Lko/u$d$a;->a:Lko/u;

    invoke-static {p2}, Lko/u;->i(Lko/u;)Lkotlin/jvm/functions/Function1;

    move-result-object p2

    if-eqz p2, :cond_2

    new-instance v0, Lfn/l0;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/camera/d$a;->b()Z

    move-result p1

    invoke-direct {v0, p1}, Lfn/l0;-><init>(Z)V

    invoke-interface {p2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    :goto_0
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/withpersona/sdk2/camera/d;

    invoke-virtual {p0, p1, p2}, Lko/u$d$a;->b(Lcom/withpersona/sdk2/camera/d;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
