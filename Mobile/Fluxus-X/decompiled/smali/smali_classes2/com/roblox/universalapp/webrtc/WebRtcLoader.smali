.class public final Lcom/roblox/universalapp/webrtc/WebRtcLoader;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0011\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0087 J\u0008\u0010\u0004\u001a\u00020\u0005H\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/roblox/universalapp/webrtc/WebRtcLoader;",
        "",
        "<init>",
        "()V",
        "initialize",
        "",
        "libraryPath",
        "",
        "robloxengine_commonDefaultProtectionRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lcom/roblox/universalapp/webrtc/WebRtcLoader;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/roblox/universalapp/webrtc/WebRtcLoader;

    invoke-direct {v0}, Lcom/roblox/universalapp/webrtc/WebRtcLoader;-><init>()V

    sput-object v0, Lcom/roblox/universalapp/webrtc/WebRtcLoader;->INSTANCE:Lcom/roblox/universalapp/webrtc/WebRtcLoader;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final initialize()V
    .locals 0

    .line 1
    return-void
.end method

.method public static final native initialize(Ljava/lang/String;)V
    .param p0    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method
