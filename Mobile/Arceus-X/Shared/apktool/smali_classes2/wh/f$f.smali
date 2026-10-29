.class public Lwh/f$f;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwh/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# instance fields
.field public a:Lwh/f$h;

.field public final b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lwh/f$h;)V
    .locals 1

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    const-string v0, "rbx.appshell"

    iput-object v0, p0, Lwh/f$f;->b:Ljava/lang/String;

    iput-object p1, p0, Lwh/f$f;->a:Lwh/f$h;

    return-void
.end method


# virtual methods
.method public varargs a([Ljava/lang/Void;)Ljava/lang/Integer;
    .locals 4

    invoke-static {}, Lcom/roblox/client/startup/a;->u()Lcom/roblox/client/startup/b$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/roblox/client/startup/b$b;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/roblox/client/startup/b$b;->e()Ljava/lang/String;

    move-result-object p1

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_2

    :cond_0
    invoke-static {}, Lnh/b;->a()Z

    move-result v1

    if-nez v1, :cond_1

    new-instance v1, Lwj/a;

    invoke-static {}, Lcom/roblox/client/RobloxApplication;->f()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Lwj/a;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1}, Lwj/a;->a()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_1
    invoke-static {}, Lcom/roblox/client/startup/a;->o()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "overridePayload = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    move-object v2, v1

    goto :goto_0

    :cond_2
    const-string v2, "no overrides"

    :goto_0
    const-string v3, "rbx.appshell"

    invoke-static {v3, v2}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    :goto_1
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v2

    invoke-interface {v2}, Lth/i;->c6()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {}, Lsg/a1;->M()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, p1, v1, v2}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeInitClientSettingsSigned(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :cond_3
    invoke-static {}, Lsg/a1;->M()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, v1, p1}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeInitClientSettings(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :cond_4
    :goto_2
    const/4 p1, 0x1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/lang/Integer;)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lcom/roblox/client/RobloxApplication;->f()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lak/m2;->a(Landroid/content/Context;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/roblox/engine/jni/NativeGLInterface;->nativePostClientSettingsLoadedInitialization3(Ljava/util/List;)V

    const-string v0, "rbx.appshell"

    const-string v1, "GetClientSettingsTask onPostExecute initialized TaskScheduler"

    invoke-static {v0, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object v0, p0, Lwh/f$f;->a:Lwh/f$h;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-interface {v0, p1}, Lwh/f$h;->a(I)V

    :cond_1
    return-void
.end method

.method public bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lwh/f$f;->a([Ljava/lang/Void;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p0, p1}, Lwh/f$f;->b(Ljava/lang/Integer;)V

    return-void
.end method
