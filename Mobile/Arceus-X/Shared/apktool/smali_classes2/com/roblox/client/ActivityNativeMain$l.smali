.class public Lcom/roblox/client/ActivityNativeMain$l;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/client/ActivityNativeMain;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "l"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field public a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/roblox/client/ActivityNativeMain;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/roblox/client/ActivityNativeMain;)V
    .locals 2

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    const-string v0, "rbx.main"

    const-string v1, "Reloading lua app."

    invoke-static {v0, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/roblox/client/ActivityNativeMain$l;->a:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public varargs a([Ljava/lang/Void;)Ljava/lang/Boolean;
    .locals 2

    iget-object p1, p0, Lcom/roblox/client/ActivityNativeMain$l;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/roblox/client/ActivityNativeMain;

    if-eqz p1, :cond_1

    invoke-static {p1}, Lcom/roblox/client/ActivityNativeMain;->x2(Lcom/roblox/client/ActivityNativeMain;)Lrh/a;

    move-result-object v0

    invoke-virtual {v0}, Lrh/a;->d()Lwh/a;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lwh/a;->I2()Landroid/view/Surface;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {}, Lvi/b;->e()Z

    invoke-static {}, Lsg/a1;->D0()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, Lwh/f;->j()Lwh/f;

    move-result-object v1

    invoke-virtual {v1, p1, v0, p1}, Lwh/f;->y(Landroid/content/Context;Landroid/view/Surface;Landroid/app/Activity;)V

    goto :goto_0

    :cond_0
    invoke-static {}, Lwh/f;->j()Lwh/f;

    move-result-object v1

    invoke-virtual {v1, p1, v0}, Lwh/f;->x(Landroid/content/Context;Landroid/view/Surface;)V

    :goto_0
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :cond_1
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1
.end method

.method public b(Ljava/lang/Boolean;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/roblox/client/ActivityNativeMain$l;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/roblox/client/ActivityNativeMain;

    if-eqz p1, :cond_0

    invoke-static {p1}, Lcom/roblox/client/ActivityNativeMain;->t2(Lcom/roblox/client/ActivityNativeMain;)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lcom/roblox/client/ActivityNativeMain;->t2(Lcom/roblox/client/ActivityNativeMain;)Landroid/view/View;

    move-result-object p1

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method public bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/roblox/client/ActivityNativeMain$l;->a([Ljava/lang/Void;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/roblox/client/ActivityNativeMain$l;->b(Ljava/lang/Boolean;)V

    return-void
.end method

.method public onPreExecute()V
    .locals 2

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain$l;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roblox/client/ActivityNativeMain;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lcom/roblox/client/ActivityNativeMain;->t2(Lcom/roblox/client/ActivityNativeMain;)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v0}, Lcom/roblox/client/ActivityNativeMain;->t2(Lcom/roblox/client/ActivityNativeMain;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    return-void
.end method
