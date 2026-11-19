.class public abstract Lcom/appsflyer/sdk_base/referrer/BaseReferrerInitProvider;
.super Lcom/appsflyer/sdk_base/util/BaseInitProvider;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/appsflyer/sdk_base/util/BaseInitProvider;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract getCreator()Lcom/appsflyer/sdk_base/referrer/ReferrerCreator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/appsflyer/sdk_base/referrer/ReferrerCreator<",
            "+",
            "Lcom/appsflyer/sdk_base/referrer/Referrer;",
            ">;"
        }
    .end annotation
.end method

.method public onCreate()Z
    .locals 4

    invoke-virtual {p0}, Landroid/content/ContentProvider;->getContext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    :try_start_0
    invoke-static {v0}, Lcom/appsflyer/sdk_base/util/BaseInitProvider;->isMainProcess(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "Referrer_Init_Provider"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Registering external referrer: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/appsflyer/sdk_base/referrer/BaseReferrerInitProvider;->getCreator()Lcom/appsflyer/sdk_base/referrer/ReferrerCreator;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Lkotlin/Pair;

    invoke-virtual {p0}, Lcom/appsflyer/sdk_base/referrer/BaseReferrerInitProvider;->getCreator()Lcom/appsflyer/sdk_base/referrer/ReferrerCreator;

    move-result-object v2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-direct {v0, v2, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0}, Lcom/appsflyer/sdk_base/referrer/Referrer;->addExternalReferrers(Lkotlin/Pair;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_1
    return v1
.end method
