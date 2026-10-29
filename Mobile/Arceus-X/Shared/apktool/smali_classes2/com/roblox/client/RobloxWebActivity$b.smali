.class public Lcom/roblox/client/RobloxWebActivity$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/client/RobloxWebActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCreate(Landroidx/lifecycle/s;)V
    .locals 2
    .param p1    # Landroidx/lifecycle/s;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const-string p1, "RobloxActivity"

    const-string v0, "onFragmentCreated"

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

    const-string p1, "RobloxActivity"

    const-string v0, "onFragmentDestroyed"

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
