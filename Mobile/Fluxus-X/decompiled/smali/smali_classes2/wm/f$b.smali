.class public Lwm/f$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwm/l$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwm/f;->p(Lorg/json/JSONObject;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lwm/f;


# direct methods
.method public constructor <init>(Lwm/f;)V
    .locals 0

    iput-object p1, p0, Lwm/f$b;->a:Lwm/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(Ljava/lang/String;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "getPhoneNumber_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/roblox/universalapp/logging/LoggingProtocol;->g(Ljava/lang/String;)V

    iget-object p1, p0, Lwm/f$b;->a:Lwm/f;

    const-string v0, "getPhoneNumber"

    invoke-static {p1, v0}, Lwm/f;->f(Lwm/f;Ljava/lang/String;)V

    return-void
.end method

.method public onSuccess()V
    .locals 0

    return-void
.end method
