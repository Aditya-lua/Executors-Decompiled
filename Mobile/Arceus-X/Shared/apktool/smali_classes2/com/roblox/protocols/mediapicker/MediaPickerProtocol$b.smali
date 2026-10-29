.class public Lcom/roblox/protocols/mediapicker/MediaPickerProtocol$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmm/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final synthetic a:Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;


# direct methods
.method public constructor <init>(Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/protocols/mediapicker/MediaPickerProtocol$b;->a:Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lorg/json/JSONObject;)Lmm/l;
    .locals 3

    new-instance p1, Lmm/l;

    invoke-direct {p1}, Lmm/l;-><init>()V

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    invoke-static {}, Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;->h()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    iput-object v0, p1, Lmm/l;->a:Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Indicating available on Android failed with error: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "MediaPickerProtocol"

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x0

    return-object p1
.end method
