.class public Lcom/roblox/protocols/mediapicker/MediaPickerProtocol$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# static fields
.field public static final a:Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;

    invoke-direct {v0}, Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;-><init>()V

    sput-object v0, Lcom/roblox/protocols/mediapicker/MediaPickerProtocol$c;->a:Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;

    return-void
.end method

.method public static bridge synthetic a()Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;
    .locals 1

    sget-object v0, Lcom/roblox/protocols/mediapicker/MediaPickerProtocol$c;->a:Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;

    return-object v0
.end method
