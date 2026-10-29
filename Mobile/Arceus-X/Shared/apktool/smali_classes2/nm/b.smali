.class public final Lnm/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R.\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\t8\u0006@\u0007X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u000c\u0010\r\"\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0011"
    }
    d2 = {
        "Lnm/b;",
        "",
        "<init>",
        "()V",
        "Lcom/roblox/universalapp/cookie/JNICookieProtocol$OnSetCookieHandler;",
        "onSetCookieHandler",
        "",
        "a",
        "(Lcom/roblox/universalapp/cookie/JNICookieProtocol$OnSetCookieHandler;)V",
        "Lkotlin/Function1;",
        "b",
        "Lkotlin/jvm/functions/Function1;",
        "getUpdateOnSetCookieHandlerDelegate",
        "()Lkotlin/jvm/functions/Function1;",
        "setUpdateOnSetCookieHandlerDelegate",
        "(Lkotlin/jvm/functions/Function1;)V",
        "updateOnSetCookieHandlerDelegate",
        "universalapp_googleProdRelease"
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
.field public static final a:Lnm/b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static b:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/roblox/universalapp/cookie/JNICookieProtocol$OnSetCookieHandler;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lnm/b;

    invoke-direct {v0}, Lnm/b;-><init>()V

    sput-object v0, Lnm/b;->a:Lnm/b;

    new-instance v0, Lnm/b$a;

    invoke-static {}, Lcom/roblox/universalapp/cookie/JNICookieProtocol;->a()Lcom/roblox/universalapp/cookie/JNICookieProtocol;

    move-result-object v1

    const-string v2, "sharedInstance(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lnm/b$a;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lnm/b;->b:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a(Lcom/roblox/universalapp/cookie/JNICookieProtocol$OnSetCookieHandler;)V
    .locals 1
    .param p0    # Lcom/roblox/universalapp/cookie/JNICookieProtocol$OnSetCookieHandler;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "onSetCookieHandler"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lnm/b;->b:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
