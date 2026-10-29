.class public final Lcom/roblox/protocols/designfoundations/DesignFoundationsJniAdapter;
.super Lcom/roblox/protocols/designfoundationsplatforminterface/generated/IPlatformDesignFoundations;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/f;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/roblox/protocols/designfoundations/DesignFoundationsJniAdapter;",
        "Landroidx/lifecycle/f;",
        "Lcom/roblox/protocols/designfoundationsplatforminterface/generated/IPlatformDesignFoundations;",
        "Lil/d;",
        "handler",
        "<init>",
        "(Lil/d;)V",
        "Landroidx/lifecycle/s;",
        "owner",
        "",
        "onCreate",
        "(Landroidx/lifecycle/s;)V",
        "Lcom/roblox/protocols/designfoundationsplatforminterface/generated/DesignTokens;",
        "colorTokens",
        "onTokensUpdated",
        "(Lcom/roblox/protocols/designfoundationsplatforminterface/generated/DesignTokens;)V",
        "onTokensCleared",
        "()V",
        "Lil/d;",
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


# instance fields
.field private final handler:Lil/d;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lil/d;)V
    .locals 1
    .param p1    # Lil/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "handler"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/roblox/protocols/designfoundationsplatforminterface/generated/IPlatformDesignFoundations;-><init>()V

    iput-object p1, p0, Lcom/roblox/protocols/designfoundations/DesignFoundationsJniAdapter;->handler:Lil/d;

    return-void
.end method


# virtual methods
.method public onCreate(Landroidx/lifecycle/s;)V
    .locals 1
    .param p1    # Landroidx/lifecycle/s;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lcom/roblox/protocols/designfoundationsplatforminterface/generated/IDesignFoundationsCoreListener;->setPlatformImpl(Lcom/roblox/protocols/designfoundationsplatforminterface/generated/IPlatformDesignFoundations;)Lcom/roblox/protocols/designfoundationsplatforminterface/generated/IDesignFoundationsCoreListener;

    return-void
.end method

.method public bridge onDestroy(Landroidx/lifecycle/s;)V
    .locals 0
    .param p1    # Landroidx/lifecycle/s;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-super {p0, p1}, Landroidx/lifecycle/f;->onDestroy(Landroidx/lifecycle/s;)V

    return-void
.end method

.method public bridge onPause(Landroidx/lifecycle/s;)V
    .locals 0
    .param p1    # Landroidx/lifecycle/s;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-super {p0, p1}, Landroidx/lifecycle/f;->onPause(Landroidx/lifecycle/s;)V

    return-void
.end method

.method public bridge onResume(Landroidx/lifecycle/s;)V
    .locals 0
    .param p1    # Landroidx/lifecycle/s;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-super {p0, p1}, Landroidx/lifecycle/f;->onResume(Landroidx/lifecycle/s;)V

    return-void
.end method

.method public bridge onStart(Landroidx/lifecycle/s;)V
    .locals 0
    .param p1    # Landroidx/lifecycle/s;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-super {p0, p1}, Landroidx/lifecycle/f;->onStart(Landroidx/lifecycle/s;)V

    return-void
.end method

.method public bridge onStop(Landroidx/lifecycle/s;)V
    .locals 0
    .param p1    # Landroidx/lifecycle/s;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-super {p0, p1}, Landroidx/lifecycle/f;->onStop(Landroidx/lifecycle/s;)V

    return-void
.end method

.method public onTokensCleared()V
    .locals 1

    iget-object v0, p0, Lcom/roblox/protocols/designfoundations/DesignFoundationsJniAdapter;->handler:Lil/d;

    invoke-virtual {v0}, Lil/d;->d()V

    return-void
.end method

.method public onTokensUpdated(Lcom/roblox/protocols/designfoundationsplatforminterface/generated/DesignTokens;)V
    .locals 1
    .param p1    # Lcom/roblox/protocols/designfoundationsplatforminterface/generated/DesignTokens;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "colorTokens"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/roblox/protocols/designfoundations/DesignFoundationsJniAdapter;->handler:Lil/d;

    invoke-virtual {v0, p1}, Lil/d;->e(Lcom/roblox/protocols/designfoundationsplatforminterface/generated/DesignTokens;)V

    return-void
.end method
