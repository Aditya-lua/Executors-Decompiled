.class public interface abstract Lcom/roblox/protocols/webview/DomainAllowListChecker$Callback;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/protocols/webview/DomainAllowListChecker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Callback"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u00e7\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H&\u00a2\u0006\u0004\u0008\u0005\u0010\u0008\u00a8\u0006\t\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/roblox/protocols/webview/DomainAllowListChecker$Callback;",
        "",
        "",
        "result",
        "",
        "onResult",
        "(I)V",
        "Lcom/roblox/protocols/webview/DomainAllowListChecker$a;",
        "(Lcom/roblox/protocols/webview/DomainAllowListChecker$a;)V",
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


# direct methods
.method public static synthetic access$onResult$jd(Lcom/roblox/protocols/webview/DomainAllowListChecker$Callback;I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/roblox/protocols/webview/DomainAllowListChecker$Callback;->onResult(I)V

    return-void
.end method


# virtual methods
.method public onResult(I)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/roblox/protocols/webview/DomainAllowListChecker$a;->b()Lqt/a;

    move-result-object v0

    if-ltz p1, :cond_0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-ge p1, v1, :cond_0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    sget-object p1, Lcom/roblox/protocols/webview/DomainAllowListChecker$a;->a:Lcom/roblox/protocols/webview/DomainAllowListChecker$a;

    :goto_0
    check-cast p1, Lcom/roblox/protocols/webview/DomainAllowListChecker$a;

    .line 2
    invoke-interface {p0, p1}, Lcom/roblox/protocols/webview/DomainAllowListChecker$Callback;->onResult(Lcom/roblox/protocols/webview/DomainAllowListChecker$a;)V

    return-void
.end method

.method public abstract onResult(Lcom/roblox/protocols/webview/DomainAllowListChecker$a;)V
    .param p1    # Lcom/roblox/protocols/webview/DomainAllowListChecker$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method
