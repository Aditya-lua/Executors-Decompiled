.class public Lwg/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/f;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "rbx.datamodel"

    iput-object v0, p0, Lwg/a;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public onCreate(Landroidx/lifecycle/s;)V
    .locals 2
    .param p1    # Landroidx/lifecycle/s;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const-string p1, "rbx.datamodel"

    const-string v0, "onMenuOptionActivated"

    invoke-static {p1, v0}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    new-instance p1, Lok/a;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Lok/a;-><init>(Z)V

    iget-object v0, p1, Lok/c;->a:Ljava/lang/String;

    iget-object v1, p1, Lok/c;->b:Ljava/lang/String;

    iget-object p1, p1, Lok/c;->c:Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeBroadcastEventWithNamespace(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onDestroy(Landroidx/lifecycle/s;)V
    .locals 2
    .param p1    # Landroidx/lifecycle/s;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const-string p1, "rbx.datamodel"

    const-string v0, "onMenuOptionClosed"

    invoke-static {p1, v0}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    new-instance p1, Lok/a;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Lok/a;-><init>(Z)V

    iget-object v0, p1, Lok/c;->a:Ljava/lang/String;

    iget-object v1, p1, Lok/c;->b:Ljava/lang/String;

    iget-object p1, p1, Lok/c;->c:Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeBroadcastEventWithNamespace(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
