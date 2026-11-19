.class public final Lcom/roblox/protocols/appagesignalsplatforminterface/generated/AppAgeSignalsPlatformSuccess;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# instance fields
.field final payload:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final provider:Lcom/roblox/protocols/appagesignalsplatforminterface/generated/AppAgeSignalsProvider;


# direct methods
.method public constructor <init>(Lcom/roblox/protocols/appagesignalsplatforminterface/generated/AppAgeSignalsProvider;Ljava/util/HashMap;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/roblox/protocols/appagesignalsplatforminterface/generated/AppAgeSignalsProvider;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/roblox/protocols/appagesignalsplatforminterface/generated/AppAgeSignalsPlatformSuccess;->provider:Lcom/roblox/protocols/appagesignalsplatforminterface/generated/AppAgeSignalsProvider;

    iput-object p2, p0, Lcom/roblox/protocols/appagesignalsplatforminterface/generated/AppAgeSignalsPlatformSuccess;->payload:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public getPayload()Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/roblox/protocols/appagesignalsplatforminterface/generated/AppAgeSignalsPlatformSuccess;->payload:Ljava/util/HashMap;

    return-object v0
.end method

.method public getProvider()Lcom/roblox/protocols/appagesignalsplatforminterface/generated/AppAgeSignalsProvider;
    .locals 1

    iget-object v0, p0, Lcom/roblox/protocols/appagesignalsplatforminterface/generated/AppAgeSignalsPlatformSuccess;->provider:Lcom/roblox/protocols/appagesignalsplatforminterface/generated/AppAgeSignalsProvider;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AppAgeSignalsPlatformSuccess{provider="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/protocols/appagesignalsplatforminterface/generated/AppAgeSignalsPlatformSuccess;->provider:Lcom/roblox/protocols/appagesignalsplatforminterface/generated/AppAgeSignalsProvider;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",payload="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/protocols/appagesignalsplatforminterface/generated/AppAgeSignalsPlatformSuccess;->payload:Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
