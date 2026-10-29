.class public Lwg/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/f;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDestroy(Landroidx/lifecycle/s;)V
    .locals 1
    .param p1    # Landroidx/lifecycle/s;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->b1()Z

    move-result p1

    if-nez p1, :cond_0

    const-string p1, "BrowserService.BrowserWindowClosed"

    const-string v0, ""

    invoke-static {p1, v0}, Lcom/roblox/engine/jni/memstorage/MemStorage;->fire(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method
