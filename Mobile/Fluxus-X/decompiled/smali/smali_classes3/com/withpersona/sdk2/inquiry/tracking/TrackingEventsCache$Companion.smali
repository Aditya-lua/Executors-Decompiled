.class public final Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007J\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$Companion;",
        "",
        "<init>",
        "()V",
        "NO_FLUSH_TOKEN",
        "",
        "INSTANCE",
        "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;",
        "setInstance",
        "",
        "cache",
        "getInstance",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final getInstance()Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-static {}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;->access$getINSTANCE$cp()Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;

    move-result-object v0

    return-object v0
.end method

.method public final setInstance(Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;)V
    .locals 0
    .param p1    # Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;->access$setINSTANCE$cp(Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;)V

    return-void
.end method
