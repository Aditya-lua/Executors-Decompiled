.class public final Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$Companion;,
        Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$TrackingEventData;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0001\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001e\u001dB\t\u0008\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J \u0010\t\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0010\u0010\u000c\u001a\u00020\u000bH\u0086@\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J \u0010\u0014\u001a\u00020\u00082\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0086@\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u001a\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001c\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;",
        "",
        "<init>",
        "()V",
        "",
        "loggerId",
        "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;",
        "event",
        "",
        "add",
        "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;Lnt/b;)Ljava/lang/Object;",
        "",
        "currentCount",
        "(Lnt/b;)Ljava/lang/Object;",
        "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventFlushSession;",
        "beginFlush",
        "(Ljava/lang/String;Lnt/b;)Ljava/lang/Object;",
        "flushToken",
        "",
        "isSuccess",
        "onFlushFinished",
        "(Ljava/lang/String;ZLnt/b;)Ljava/lang/Object;",
        "Luu/a;",
        "mutex",
        "Luu/a;",
        "",
        "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$TrackingEventData;",
        "events",
        "Ljava/util/List;",
        "Companion",
        "TrackingEventData",
        "tracking-events_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static volatile INSTANCE:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public static final NO_FLUSH_TOKEN:I


# instance fields
.field private final events:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$TrackingEventData;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final mutex:Luu/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;->Companion:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Luu/g;->b(ZILjava/lang/Object;)Luu/a;

    move-result-object v0

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;->mutex:Luu/a;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;->events:Ljava/util/List;

    return-void
.end method

.method public static synthetic a(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$TrackingEventData;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;->onFlushFinished$lambda$7$lambda$5(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$TrackingEventData;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$getINSTANCE$cp()Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;
    .locals 1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;->INSTANCE:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;

    return-object v0
.end method

.method public static final synthetic access$setINSTANCE$cp(Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;)V
    .locals 0

    sput-object p0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;->INSTANCE:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;

    return-void
.end method

.method private static final onFlushFinished$lambda$7$lambda$5(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$TrackingEventData;)Z
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$TrackingEventData;->getFlushToken()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final add(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;Lnt/b;)Ljava/lang/Object;
    .locals 11
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    instance-of v0, p3, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$add$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$add$1;

    iget v1, v0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$add$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$add$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$add$1;

    invoke-direct {v0, p0, p3}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$add$1;-><init>(Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;Lnt/b;)V

    :goto_0
    iget-object p3, v0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$add$1;->result:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$add$1;->label:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$add$1;->L$2:Ljava/lang/Object;

    check-cast p1, Luu/a;

    iget-object p2, v0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$add$1;->L$1:Ljava/lang/Object;

    check-cast p2, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;

    iget-object v0, v0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$add$1;->L$0:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {p3}, Ljt/o;->b(Ljava/lang/Object;)V

    move-object v6, v0

    :goto_1
    move-object v7, p2

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p3, p0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;->mutex:Luu/a;

    iput-object p1, v0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$add$1;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$add$1;->L$1:Ljava/lang/Object;

    iput-object p3, v0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$add$1;->L$2:Ljava/lang/Object;

    const/4 v2, 0x0

    iput v2, v0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$add$1;->I$0:I

    iput v3, v0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$add$1;->label:I

    invoke-interface {p3, v4, v0}, Luu/a;->f(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v6, p1

    move-object p1, p3

    goto :goto_1

    :goto_2
    :try_start_0
    iget-object p2, p0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;->events:Ljava/util/List;

    new-instance v5, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$TrackingEventData;

    const/4 v9, 0x4

    const/4 v10, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v5 .. v10}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$TrackingEventData;-><init>(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p1, v4}, Luu/a;->e(Ljava/lang/Object;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :catchall_0
    move-exception v0

    move-object p2, v0

    invoke-interface {p1, v4}, Luu/a;->e(Ljava/lang/Object;)V

    throw p2
.end method

.method public final beginFlush(Ljava/lang/String;Lnt/b;)Ljava/lang/Object;
    .locals 6
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lnt/b<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventFlushSession;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    instance-of v0, p2, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$beginFlush$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$beginFlush$1;

    iget v1, v0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$beginFlush$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$beginFlush$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$beginFlush$1;

    invoke-direct {v0, p0, p2}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$beginFlush$1;-><init>(Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;Lnt/b;)V

    :goto_0
    iget-object p2, v0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$beginFlush$1;->result:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$beginFlush$1;->label:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$beginFlush$1;->L$1:Ljava/lang/Object;

    check-cast p1, Luu/a;

    iget-object v0, v0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$beginFlush$1;->L$0:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {p2}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p2, p0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;->mutex:Luu/a;

    iput-object p1, v0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$beginFlush$1;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$beginFlush$1;->L$1:Ljava/lang/Object;

    const/4 v2, 0x0

    iput v2, v0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$beginFlush$1;->I$0:I

    iput v3, v0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$beginFlush$1;->label:I

    invoke-interface {p2, v4, v0}, Luu/a;->f(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p1

    move-object p1, p2

    :goto_1
    :try_start_0
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lkotlin/collections/o;->c()Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;->events:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_4
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$TrackingEventData;

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$TrackingEventData;->getLoggerId()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$TrackingEventData;->isFlushing()Z

    move-result v5

    if-nez v5, :cond_4

    invoke-virtual {v3, p2}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$TrackingEventData;->setFlushToken(Ljava/lang/String;)V

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$TrackingEventData;->getEvent()Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :catchall_0
    move-exception p2

    goto :goto_3

    :cond_5
    invoke-static {v1}, Lkotlin/collections/o;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    new-instance v1, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventFlushSession;

    invoke-direct {v1, v0, p2}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventFlushSession;-><init>(Ljava/util/List;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p1, v4}, Luu/a;->e(Ljava/lang/Object;)V

    return-object v1

    :goto_3
    invoke-interface {p1, v4}, Luu/a;->e(Ljava/lang/Object;)V

    throw p2
.end method

.method public final currentCount(Lnt/b;)Ljava/lang/Object;
    .locals 6
    .param p1    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnt/b<",
            "-",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    instance-of v0, p1, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$currentCount$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$currentCount$1;

    iget v1, v0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$currentCount$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$currentCount$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$currentCount$1;

    invoke-direct {v0, p0, p1}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$currentCount$1;-><init>(Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;Lnt/b;)V

    :goto_0
    iget-object p1, v0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$currentCount$1;->result:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$currentCount$1;->label:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object v0, v0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$currentCount$1;->L$0:Ljava/lang/Object;

    check-cast v0, Luu/a;

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;->mutex:Luu/a;

    iput-object p1, v0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$currentCount$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$currentCount$1;->I$0:I

    iput v4, v0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$currentCount$1;->label:I

    invoke-interface {p1, v5, v0}, Luu/a;->f(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p1

    :goto_1
    :try_start_0
    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;->events:Ljava/util/List;

    instance-of v1, p1, Ljava/util/Collection;

    if-eqz v1, :cond_4

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_3

    :catchall_0
    move-exception p1

    goto :goto_4

    :cond_4
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_5
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$TrackingEventData;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$TrackingEventData;->isFlushing()Z

    move-result v1

    if-nez v1, :cond_5

    add-int/lit8 v3, v3, 0x1

    if-gez v3, :cond_5

    invoke-static {}, Lkotlin/collections/p;->s()V

    goto :goto_2

    :cond_6
    :goto_3
    invoke-static {v3}, Lpt/b;->d(I)Ljava/lang/Integer;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0, v5}, Luu/a;->e(Ljava/lang/Object;)V

    return-object p1

    :goto_4
    invoke-interface {v0, v5}, Luu/a;->e(Ljava/lang/Object;)V

    throw p1
.end method

.method public final onFlushFinished(Ljava/lang/String;ZLnt/b;)Ljava/lang/Object;
    .locals 5
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    instance-of v0, p3, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$onFlushFinished$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$onFlushFinished$1;

    iget v1, v0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$onFlushFinished$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$onFlushFinished$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$onFlushFinished$1;

    invoke-direct {v0, p0, p3}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$onFlushFinished$1;-><init>(Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;Lnt/b;)V

    :goto_0
    iget-object p3, v0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$onFlushFinished$1;->result:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$onFlushFinished$1;->label:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-boolean p2, v0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$onFlushFinished$1;->Z$0:Z

    iget-object p1, v0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$onFlushFinished$1;->L$1:Ljava/lang/Object;

    check-cast p1, Luu/a;

    iget-object v0, v0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$onFlushFinished$1;->L$0:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {p3}, Ljt/o;->b(Ljava/lang/Object;)V

    move-object p3, p1

    move-object p1, v0

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p3, p0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;->mutex:Luu/a;

    iput-object p1, v0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$onFlushFinished$1;->L$0:Ljava/lang/Object;

    iput-object p3, v0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$onFlushFinished$1;->L$1:Ljava/lang/Object;

    iput-boolean p2, v0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$onFlushFinished$1;->Z$0:Z

    const/4 v2, 0x0

    iput v2, v0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$onFlushFinished$1;->I$0:I

    iput v3, v0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$onFlushFinished$1;->label:I

    invoke-interface {p3, v4, v0}, Luu/a;->f(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;->events:Ljava/util/List;

    if-eqz p2, :cond_4

    :try_start_0
    new-instance p2, Lcom/withpersona/sdk2/inquiry/tracking/b;

    invoke-direct {p2, p1}, Lcom/withpersona/sdk2/inquiry/tracking/b;-><init>(Ljava/lang/String;)V

    invoke-static {v0, p2}, Lkotlin/collections/u;->F(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Z

    move-result p1

    invoke-static {p1}, Lpt/b;->a(Z)Ljava/lang/Boolean;

    goto :goto_3

    :catchall_0
    move-exception p1

    goto :goto_4

    :cond_4
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_5
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$TrackingEventData;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$TrackingEventData;->getFlushToken()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {v0, v4}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$TrackingEventData;->setFlushToken(Ljava/lang/String;)V

    goto :goto_2

    :cond_6
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_3
    invoke-interface {p3, v4}, Luu/a;->e(Ljava/lang/Object;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :goto_4
    invoke-interface {p3, v4}, Luu/a;->e(Ljava/lang/Object;)V

    throw p1
.end method
