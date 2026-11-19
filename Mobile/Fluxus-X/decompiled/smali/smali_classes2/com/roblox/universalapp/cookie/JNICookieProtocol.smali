.class public Lcom/roblox/universalapp/cookie/JNICookieProtocol;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/universalapp/cookie/JNICookieProtocol$a;,
        Lcom/roblox/universalapp/cookie/JNICookieProtocol$OnSetCookieHandler;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lcom/roblox/universalapp/cookie/JNICookieProtocol;
    .locals 1

    invoke-static {}, Lcom/roblox/universalapp/cookie/JNICookieProtocol$a;->a()Lcom/roblox/universalapp/cookie/JNICookieProtocol;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public native updateOnSetCookieHandler(Lcom/roblox/universalapp/cookie/JNICookieProtocol$OnSetCookieHandler;)V
.end method
