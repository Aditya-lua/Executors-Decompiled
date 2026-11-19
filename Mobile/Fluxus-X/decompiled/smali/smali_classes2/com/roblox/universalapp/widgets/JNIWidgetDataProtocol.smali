.class public final Lcom/roblox/universalapp/widgets/JNIWidgetDataProtocol;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\t\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0086 \u00a2\u0006\u0004\u0008\u0005\u0010\u0003R\u0018\u0010\u0007\u001a\u00020\u00068\u00c6\u0001\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\nR\u0018\u0010\u000b\u001a\u00020\u00068\u00c6\u0001\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u0008\u001a\u0004\u0008\u000c\u0010\nR\u0018\u0010\r\u001a\u00020\u00068\u00c6\u0001\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u0008\u001a\u0004\u0008\u000e\u0010\n\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/roblox/universalapp/widgets/JNIWidgetDataProtocol;",
        "",
        "<init>",
        "()V",
        "",
        "initializeProtocol",
        "",
        "protocolName",
        "Ljava/lang/String;",
        "getProtocolName",
        "()Ljava/lang/String;",
        "recentlyPlayedRequestMessage",
        "getRecentlyPlayedRequestMessage",
        "recentlyPlayedWidgetVariant",
        "getRecentlyPlayedWidgetVariant",
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
.field public static final a:Lcom/roblox/universalapp/widgets/JNIWidgetDataProtocol;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/roblox/universalapp/widgets/JNIWidgetDataProtocol;

    invoke-direct {v0}, Lcom/roblox/universalapp/widgets/JNIWidgetDataProtocol;-><init>()V

    sput-object v0, Lcom/roblox/universalapp/widgets/JNIWidgetDataProtocol;->a:Lcom/roblox/universalapp/widgets/JNIWidgetDataProtocol;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final native getProtocolName()Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public final native getRecentlyPlayedRequestMessage()Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public final native getRecentlyPlayedWidgetVariant()Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public final native initializeProtocol()V
.end method
