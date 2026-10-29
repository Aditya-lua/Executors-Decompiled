.class public final Lcom/appsflyer/sdk_base/referrer/Referrer$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/appsflyer/sdk_base/referrer/Referrer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J*\u0010\u000b\u001a\u00020\u000c2 \u0010\r\u001a\u001c\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u0012\u000c\u0012\n\u0012\u0006\u0008\u0001\u0012\u00020\n0\t0\u0006H\u0007J(\u0010\u000e\u001a\"\u0012\u001e\u0012\u001c\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u0012\u000c\u0012\n\u0012\u0006\u0008\u0001\u0012\u00020\n0\t0\u00060\u000fH\u0007J\u0008\u0010\u0010\u001a\u00020\u0011H\u0007R.\u0010\u0004\u001a\"\u0012\u001e\u0012\u001c\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u0012\u000c\u0012\n\u0012\u0006\u0008\u0001\u0012\u00020\n0\t0\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/appsflyer/sdk_base/referrer/Referrer$Companion;",
        "",
        "<init>",
        "()V",
        "externalReferrers",
        "",
        "Lkotlin/Pair;",
        "Lcom/appsflyer/sdk_base/referrer/ReferrerCreator;",
        "Lcom/appsflyer/sdk_base/referrer/Referrer;",
        "Ljava/lang/Class;",
        "Lcom/appsflyer/sdk_base/referrer/BaseReferrerInitProvider;",
        "addExternalReferrers",
        "",
        "creator",
        "getExternalReferrers",
        "",
        "clearExternalReferrersForTesting",
        "",
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
    invoke-direct {p0}, Lcom/appsflyer/sdk_base/referrer/Referrer$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final addExternalReferrers(Lkotlin/Pair;)Z
    .locals 1
    .param p1    # Lkotlin/Pair;
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

    const-string v0, "creator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lcom/appsflyer/sdk_base/referrer/Referrer;->access$getExternalReferrers$cp()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final clearExternalReferrersForTesting()V
    .locals 1

    invoke-static {}, Lcom/appsflyer/sdk_base/referrer/Referrer;->access$getExternalReferrers$cp()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    return-void
.end method

.method public final getExternalReferrers()Ljava/util/Set;
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

    invoke-static {}, Lcom/appsflyer/sdk_base/referrer/Referrer;->access$getExternalReferrers$cp()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
