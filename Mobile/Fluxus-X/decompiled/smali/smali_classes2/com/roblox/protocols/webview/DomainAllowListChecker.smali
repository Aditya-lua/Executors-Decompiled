.class public final Lcom/roblox/protocols/webview/DomainAllowListChecker;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/protocols/webview/DomainAllowListChecker$Callback;,
        Lcom/roblox/protocols/webview/DomainAllowListChecker$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0007\u0008\u00c6\u0002\u0018\u00002\u00020\u0001:\u0002\u0011\u0012B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J \u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0086 \u00a2\u0006\u0004\u0008\u0008\u0010\tJ(\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0086 \u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007H\u0086 \u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/roblox/protocols/webview/DomainAllowListChecker;",
        "",
        "<init>",
        "()V",
        "",
        "targetUrl",
        "contextUrl",
        "",
        "isKnownTrustedDomain",
        "(Ljava/lang/String;Ljava/lang/String;)Z",
        "Lcom/roblox/protocols/webview/DomainAllowListChecker$Callback;",
        "callback",
        "",
        "checkDomainAllowList",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/roblox/protocols/webview/DomainAllowListChecker$Callback;)V",
        "enableDomainAllowListChecker",
        "()Z",
        "Callback",
        "a",
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
.field public static final a:Lcom/roblox/protocols/webview/DomainAllowListChecker;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/roblox/protocols/webview/DomainAllowListChecker;

    invoke-direct {v0}, Lcom/roblox/protocols/webview/DomainAllowListChecker;-><init>()V

    sput-object v0, Lcom/roblox/protocols/webview/DomainAllowListChecker;->a:Lcom/roblox/protocols/webview/DomainAllowListChecker;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final native checkDomainAllowList(Ljava/lang/String;Ljava/lang/String;Lcom/roblox/protocols/webview/DomainAllowListChecker$Callback;)V
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/roblox/protocols/webview/DomainAllowListChecker$Callback;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public final native enableDomainAllowListChecker()Z
.end method

.method public final native isKnownTrustedDomain(Ljava/lang/String;Ljava/lang/String;)Z
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method
