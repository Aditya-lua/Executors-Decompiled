.class public abstract Lcom/appsflyer/sdk_base/referrer/Referrer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/appsflyer/sdk_base/referrer/Referrer$Companion;,
        Lcom/appsflyer/sdk_base/referrer/Referrer$State;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010%\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008&\u0018\u0000 \"2\u00020\u0001:\u0002\"#B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH&J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001e\u001a\u00020\u001bJ\u0008\u0010\u001f\u001a\u00020\u001bH\u0014J\u000e\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u0019R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\nR\u0014\u0010\u0005\u001a\u00020\u0006X\u0084\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00168\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"
    }
    d2 = {
        "Lcom/appsflyer/sdk_base/referrer/Referrer;",
        "",
        "type",
        "",
        "source",
        "prop",
        "Lcom/appsflyer/sdk_base/referrer/ReferrerProp;",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/appsflyer/sdk_base/referrer/ReferrerProp;)V",
        "getType",
        "()Ljava/lang/String;",
        "getSource",
        "getProp",
        "()Lcom/appsflyer/sdk_base/referrer/ReferrerProp;",
        "startTime",
        "",
        "value",
        "Lcom/appsflyer/sdk_base/referrer/Referrer$State;",
        "state",
        "getState",
        "()Lcom/appsflyer/sdk_base/referrer/Referrer$State;",
        "map",
        "",
        "referrerDataCollectionFinishedCallbacks",
        "",
        "Ljava/lang/Runnable;",
        "start",
        "",
        "context",
        "Landroid/content/Context;",
        "finish",
        "addLatency",
        "setAdditionalReferrerDataCollectionFinishedCallback",
        "additionalReferrerDataCollectionFinishedCallback",
        "Companion",
        "State",
        "sdk_base_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lcom/appsflyer/sdk_base/referrer/Referrer$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final externalReferrers:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lkotlin/Pair<",
            "Lcom/appsflyer/sdk_base/referrer/ReferrerCreator<",
            "Lcom/appsflyer/sdk_base/referrer/Referrer;",
            ">;",
            "Ljava/lang/Class<",
            "+",
            "Lcom/appsflyer/sdk_base/referrer/BaseReferrerInitProvider;",
            ">;>;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final map:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final prop:Lcom/appsflyer/sdk_base/referrer/ReferrerProp;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private referrerDataCollectionFinishedCallbacks:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final source:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private startTime:J

.field private state:Lcom/appsflyer/sdk_base/referrer/Referrer$State;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final type:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/appsflyer/sdk_base/referrer/Referrer$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/appsflyer/sdk_base/referrer/Referrer$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/appsflyer/sdk_base/referrer/Referrer;->Companion:Lcom/appsflyer/sdk_base/referrer/Referrer$Companion;

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    sput-object v0, Lcom/appsflyer/sdk_base/referrer/Referrer;->externalReferrers:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/appsflyer/sdk_base/referrer/ReferrerProp;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/appsflyer/sdk_base/referrer/ReferrerProp;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "prop"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/appsflyer/sdk_base/referrer/Referrer;->type:Ljava/lang/String;

    iput-object p2, p0, Lcom/appsflyer/sdk_base/referrer/Referrer;->source:Ljava/lang/String;

    iput-object p3, p0, Lcom/appsflyer/sdk_base/referrer/Referrer;->prop:Lcom/appsflyer/sdk_base/referrer/ReferrerProp;

    sget-object p1, Lcom/appsflyer/sdk_base/referrer/Referrer$State;->NOT_STARTED:Lcom/appsflyer/sdk_base/referrer/Referrer$State;

    iput-object p1, p0, Lcom/appsflyer/sdk_base/referrer/Referrer;->state:Lcom/appsflyer/sdk_base/referrer/Referrer$State;

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lcom/appsflyer/sdk_base/referrer/Referrer;->map:Ljava/util/Map;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/appsflyer/sdk_base/referrer/Referrer;->referrerDataCollectionFinishedCallbacks:Ljava/util/List;

    return-void
.end method

.method public static final synthetic access$getExternalReferrers$cp()Ljava/util/Set;
    .locals 1

    sget-object v0, Lcom/appsflyer/sdk_base/referrer/Referrer;->externalReferrers:Ljava/util/Set;

    return-object v0
.end method

.method public static final addExternalReferrers(Lkotlin/Pair;)Z
    .locals 1
    .param p0    # Lkotlin/Pair;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "+",
            "Lcom/appsflyer/sdk_base/referrer/ReferrerCreator<",
            "+",
            "Lcom/appsflyer/sdk_base/referrer/Referrer;",
            ">;+",
            "Ljava/lang/Class<",
            "+",
            "Lcom/appsflyer/sdk_base/referrer/BaseReferrerInitProvider;",
            ">;>;)Z"
        }
    .end annotation

    sget-object v0, Lcom/appsflyer/sdk_base/referrer/Referrer;->Companion:Lcom/appsflyer/sdk_base/referrer/Referrer$Companion;

    invoke-virtual {v0, p0}, Lcom/appsflyer/sdk_base/referrer/Referrer$Companion;->addExternalReferrers(Lkotlin/Pair;)Z

    move-result p0

    return p0
.end method

.method public static final clearExternalReferrersForTesting()V
    .locals 1

    sget-object v0, Lcom/appsflyer/sdk_base/referrer/Referrer;->Companion:Lcom/appsflyer/sdk_base/referrer/Referrer$Companion;

    invoke-virtual {v0}, Lcom/appsflyer/sdk_base/referrer/Referrer$Companion;->clearExternalReferrersForTesting()V

    return-void
.end method

.method public static final getExternalReferrers()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lkotlin/Pair<",
            "Lcom/appsflyer/sdk_base/referrer/ReferrerCreator<",
            "Lcom/appsflyer/sdk_base/referrer/Referrer;",
            ">;",
            "Ljava/lang/Class<",
            "+",
            "Lcom/appsflyer/sdk_base/referrer/BaseReferrerInitProvider;",
            ">;>;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lcom/appsflyer/sdk_base/referrer/Referrer;->Companion:Lcom/appsflyer/sdk_base/referrer/Referrer$Companion;

    invoke-virtual {v0}, Lcom/appsflyer/sdk_base/referrer/Referrer$Companion;->getExternalReferrers()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public addLatency()V
    .locals 5

    iget-object v0, p0, Lcom/appsflyer/sdk_base/referrer/Referrer;->map:Ljava/util/Map;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iget-wide v3, p0, Lcom/appsflyer/sdk_base/referrer/Referrer;->startTime:J

    sub-long/2addr v1, v3

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "latency"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final finish()V
    .locals 3

    sget-object v0, Lcom/appsflyer/sdk_base/referrer/Referrer$State;->FINISHED:Lcom/appsflyer/sdk_base/referrer/Referrer$State;

    iput-object v0, p0, Lcom/appsflyer/sdk_base/referrer/Referrer;->state:Lcom/appsflyer/sdk_base/referrer/Referrer$State;

    iget-object v0, p0, Lcom/appsflyer/sdk_base/referrer/Referrer;->map:Ljava/util/Map;

    const-string v1, "type"

    iget-object v2, p0, Lcom/appsflyer/sdk_base/referrer/Referrer;->type:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/appsflyer/sdk_base/referrer/Referrer;->map:Ljava/util/Map;

    const-string v1, "source"

    iget-object v2, p0, Lcom/appsflyer/sdk_base/referrer/Referrer;->source:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/appsflyer/sdk_base/referrer/Referrer;->addLatency()V

    iget-object v0, p0, Lcom/appsflyer/sdk_base/referrer/Referrer;->referrerDataCollectionFinishedCallbacks:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Runnable;

    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final getProp()Lcom/appsflyer/sdk_base/referrer/ReferrerProp;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/appsflyer/sdk_base/referrer/Referrer;->prop:Lcom/appsflyer/sdk_base/referrer/ReferrerProp;

    return-object v0
.end method

.method public final getSource()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/appsflyer/sdk_base/referrer/Referrer;->source:Ljava/lang/String;

    return-object v0
.end method

.method public final getState()Lcom/appsflyer/sdk_base/referrer/Referrer$State;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/appsflyer/sdk_base/referrer/Referrer;->state:Lcom/appsflyer/sdk_base/referrer/Referrer$State;

    return-object v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/appsflyer/sdk_base/referrer/Referrer;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final setAdditionalReferrerDataCollectionFinishedCallback(Ljava/lang/Runnable;)V
    .locals 1
    .param p1    # Ljava/lang/Runnable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "additionalReferrerDataCollectionFinishedCallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/appsflyer/sdk_base/referrer/Referrer;->referrerDataCollectionFinishedCallbacks:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final start()V
    .locals 2

    .line 1
    sget-object v0, Lcom/appsflyer/sdk_base/referrer/Referrer$State;->STARTED:Lcom/appsflyer/sdk_base/referrer/Referrer$State;

    iput-object v0, p0, Lcom/appsflyer/sdk_base/referrer/Referrer;->state:Lcom/appsflyer/sdk_base/referrer/Referrer$State;

    .line 2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/appsflyer/sdk_base/referrer/Referrer;->startTime:J

    .line 3
    iget-object v0, p0, Lcom/appsflyer/sdk_base/referrer/Referrer;->referrerDataCollectionFinishedCallbacks:Ljava/util/List;

    .line 4
    iget-object v1, p0, Lcom/appsflyer/sdk_base/referrer/Referrer;->prop:Lcom/appsflyer/sdk_base/referrer/ReferrerProp;

    invoke-virtual {v1}, Lcom/appsflyer/sdk_base/referrer/ReferrerProp;->getListener()Ljava/lang/Runnable;

    move-result-object v1

    .line 5
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public abstract start(Landroid/content/Context;)V
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method
