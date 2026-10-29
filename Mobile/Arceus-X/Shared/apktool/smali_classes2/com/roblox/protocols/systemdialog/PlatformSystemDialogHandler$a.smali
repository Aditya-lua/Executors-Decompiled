.class public final Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler$a;
.super Lcom/roblox/protocols/systemdialogplatforminterface/generated/ISystemDialogCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\n\u0008\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0017\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\n\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\tJ\u0017\u0010\u000c\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\tR\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler$a;",
        "Lcom/roblox/protocols/systemdialogplatforminterface/generated/ISystemDialogCallback;",
        "observer",
        "<init>",
        "(Lcom/roblox/protocols/systemdialogplatforminterface/generated/ISystemDialogCallback;)V",
        "Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogContext;",
        "context",
        "",
        "onOpened",
        "(Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogContext;)V",
        "onClosed",
        "onOkClicked",
        "onCancelClicked",
        "a",
        "Lcom/roblox/protocols/systemdialogplatforminterface/generated/ISystemDialogCallback;",
        "getObserver",
        "()Lcom/roblox/protocols/systemdialogplatforminterface/generated/ISystemDialogCallback;",
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
.field public final a:Lcom/roblox/protocols/systemdialogplatforminterface/generated/ISystemDialogCallback;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/roblox/protocols/systemdialogplatforminterface/generated/ISystemDialogCallback;)V
    .locals 0
    .param p1    # Lcom/roblox/protocols/systemdialogplatforminterface/generated/ISystemDialogCallback;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    invoke-direct {p0}, Lcom/roblox/protocols/systemdialogplatforminterface/generated/ISystemDialogCallback;-><init>()V

    iput-object p1, p0, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler$a;->a:Lcom/roblox/protocols/systemdialogplatforminterface/generated/ISystemDialogCallback;

    return-void
.end method


# virtual methods
.method public onCancelClicked(Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogContext;)V
    .locals 2
    .param p1    # Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogContext;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler$a;->a:Lcom/roblox/protocols/systemdialogplatforminterface/generated/ISystemDialogCallback;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/roblox/protocols/systemdialogplatforminterface/generated/ISystemDialogCallback;->onCancelClicked(Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogContext;)V

    :cond_0
    invoke-static {}, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler;->access$getActiveDialogObservers$p()Ljava/util/Queue;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roblox/protocols/systemdialogplatforminterface/generated/ISystemDialogCallback;

    if-eqz v1, :cond_1

    invoke-virtual {v1, p1}, Lcom/roblox/protocols/systemdialogplatforminterface/generated/ISystemDialogCallback;->onCancelClicked(Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogContext;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public onClosed(Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogContext;)V
    .locals 2
    .param p1    # Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogContext;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler$a;->a:Lcom/roblox/protocols/systemdialogplatforminterface/generated/ISystemDialogCallback;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/roblox/protocols/systemdialogplatforminterface/generated/ISystemDialogCallback;->onClosed(Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogContext;)V

    :cond_0
    invoke-static {}, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler;->access$getActiveDialogObservers$p()Ljava/util/Queue;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roblox/protocols/systemdialogplatforminterface/generated/ISystemDialogCallback;

    if-eqz v1, :cond_1

    invoke-virtual {v1, p1}, Lcom/roblox/protocols/systemdialogplatforminterface/generated/ISystemDialogCallback;->onClosed(Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogContext;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public onOkClicked(Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogContext;)V
    .locals 2
    .param p1    # Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogContext;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler$a;->a:Lcom/roblox/protocols/systemdialogplatforminterface/generated/ISystemDialogCallback;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/roblox/protocols/systemdialogplatforminterface/generated/ISystemDialogCallback;->onOkClicked(Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogContext;)V

    :cond_0
    invoke-static {}, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler;->access$getActiveDialogObservers$p()Ljava/util/Queue;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roblox/protocols/systemdialogplatforminterface/generated/ISystemDialogCallback;

    if-eqz v1, :cond_1

    invoke-virtual {v1, p1}, Lcom/roblox/protocols/systemdialogplatforminterface/generated/ISystemDialogCallback;->onOkClicked(Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogContext;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public onOpened(Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogContext;)V
    .locals 2
    .param p1    # Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogContext;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler$a;->a:Lcom/roblox/protocols/systemdialogplatforminterface/generated/ISystemDialogCallback;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/roblox/protocols/systemdialogplatforminterface/generated/ISystemDialogCallback;->onOpened(Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogContext;)V

    :cond_0
    invoke-static {}, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler;->access$getActiveDialogObservers$p()Ljava/util/Queue;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roblox/protocols/systemdialogplatforminterface/generated/ISystemDialogCallback;

    if-eqz v1, :cond_1

    invoke-virtual {v1, p1}, Lcom/roblox/protocols/systemdialogplatforminterface/generated/ISystemDialogCallback;->onOpened(Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogContext;)V

    goto :goto_0

    :cond_2
    return-void
.end method
