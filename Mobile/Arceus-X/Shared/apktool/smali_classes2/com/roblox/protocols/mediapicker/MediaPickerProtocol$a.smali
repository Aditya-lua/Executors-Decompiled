.class public Lcom/roblox/protocols/mediapicker/MediaPickerProtocol$a;
.super Ljava/util/HashMap;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/HashMap<",
        "Ljava/lang/String;",
        "Lh/f$h;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    invoke-static {}, Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;->getAssetTypeImages()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lh/f$d;->a:Lh/f$d;

    invoke-virtual {p0, v0, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;->getAssetTypeVideos()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lh/f$g;->a:Lh/f$g;

    invoke-virtual {p0, v0, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
