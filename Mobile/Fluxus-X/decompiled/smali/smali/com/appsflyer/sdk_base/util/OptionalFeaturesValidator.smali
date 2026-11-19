.class public interface abstract Lcom/appsflyer/sdk_base/util/OptionalFeaturesValidator;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/appsflyer/sdk_base/util/OptionalFeaturesValidator$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/appsflyer/sdk_base/util/OptionalFeaturesValidator;",
        "",
        "isOptionalFeaturePresent",
        "",
        "feature",
        "Lcom/appsflyer/sdk_base/util/SupportedOptionalFeatures;",
        "Companion",
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
.field public static final Companion:Lcom/appsflyer/sdk_base/util/OptionalFeaturesValidator$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/appsflyer/sdk_base/util/OptionalFeaturesValidator$Companion;->$$INSTANCE:Lcom/appsflyer/sdk_base/util/OptionalFeaturesValidator$Companion;

    sput-object v0, Lcom/appsflyer/sdk_base/util/OptionalFeaturesValidator;->Companion:Lcom/appsflyer/sdk_base/util/OptionalFeaturesValidator$Companion;

    return-void
.end method

.method public static addOptionalFeature(Lcom/appsflyer/sdk_base/util/SupportedOptionalFeatures;)Z
    .locals 1
    .param p0    # Lcom/appsflyer/sdk_base/util/SupportedOptionalFeatures;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    sget-object v0, Lcom/appsflyer/sdk_base/util/OptionalFeaturesValidator;->Companion:Lcom/appsflyer/sdk_base/util/OptionalFeaturesValidator$Companion;

    invoke-virtual {v0, p0}, Lcom/appsflyer/sdk_base/util/OptionalFeaturesValidator$Companion;->addOptionalFeature(Lcom/appsflyer/sdk_base/util/SupportedOptionalFeatures;)Z

    move-result p0

    return p0
.end method

.method public static clearRegisteredFeatures()V
    .locals 1

    sget-object v0, Lcom/appsflyer/sdk_base/util/OptionalFeaturesValidator;->Companion:Lcom/appsflyer/sdk_base/util/OptionalFeaturesValidator$Companion;

    invoke-virtual {v0}, Lcom/appsflyer/sdk_base/util/OptionalFeaturesValidator$Companion;->clearRegisteredFeatures()V

    return-void
.end method

.method public static getRegisteredFeatures()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/appsflyer/sdk_base/util/SupportedOptionalFeatures;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lcom/appsflyer/sdk_base/util/OptionalFeaturesValidator;->Companion:Lcom/appsflyer/sdk_base/util/OptionalFeaturesValidator$Companion;

    invoke-virtual {v0}, Lcom/appsflyer/sdk_base/util/OptionalFeaturesValidator$Companion;->getRegisteredFeatures()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public abstract isOptionalFeaturePresent(Lcom/appsflyer/sdk_base/util/SupportedOptionalFeatures;)Z
    .param p1    # Lcom/appsflyer/sdk_base/util/SupportedOptionalFeatures;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method
