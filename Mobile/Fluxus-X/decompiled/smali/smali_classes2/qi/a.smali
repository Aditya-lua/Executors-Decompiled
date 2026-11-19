.class public Lqi/a;
.super Lqi/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqi/a$b;,
        Lqi/a$c;
    }
.end annotation


# instance fields
.field public final e:Ljava/lang/String;

.field public f:Ljava/util/Vector;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Vector<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public g:Z

.field public h:Lcom/roblox/engine/jni/memstorage/Connection;

.field public i:Lqi/a$b;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 6
    invoke-direct {p0, p1}, Lqi/b;-><init>(Landroid/content/Context;)V

    .line 7
    const-string p1, "rbx.browserservice"

    iput-object p1, p0, Lqi/a;->e:Ljava/lang/String;

    const/4 p1, 0x0

    .line 8
    iput-object p1, p0, Lqi/a;->f:Ljava/util/Vector;

    const/4 p1, 0x0

    .line 9
    iput-boolean p1, p0, Lqi/a;->g:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lqi/a$b;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lqi/b;-><init>(Landroid/content/Context;)V

    .line 2
    const-string p1, "rbx.browserservice"

    iput-object p1, p0, Lqi/a;->e:Ljava/lang/String;

    const/4 p1, 0x0

    .line 3
    iput-object p1, p0, Lqi/a;->f:Ljava/util/Vector;

    const/4 p1, 0x0

    .line 4
    iput-boolean p1, p0, Lqi/a;->g:Z

    .line 5
    iput-object p2, p0, Lqi/a;->i:Lqi/a$b;

    return-void
.end method

.method public static bridge synthetic j(Lqi/a;Z)V
    .locals 0

    iput-boolean p1, p0, Lqi/a;->g:Z

    return-void
.end method

.method public static bridge synthetic k(Lqi/a;)V
    .locals 0

    invoke-virtual {p0}, Lqi/a;->n()V

    return-void
.end method

.method public static bridge synthetic l(Lqi/a;Ljava/lang/Runnable;)V
    .locals 0

    invoke-virtual {p0, p1}, Lqi/a;->o(Ljava/lang/Runnable;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    invoke-virtual {p0}, Lqi/a;->p()V

    iget-object v0, p0, Lqi/a;->f:Ljava/util/Vector;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/Vector;->clear()V

    iput-object v1, p0, Lqi/a;->f:Ljava/util/Vector;

    :cond_0
    iput-object v1, p0, Lqi/a;->h:Lcom/roblox/engine/jni/memstorage/Connection;

    iput-object v1, p0, Lqi/a;->i:Lqi/a$b;

    invoke-super {p0}, Lqi/b;->a()V

    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 1

    iget-boolean v0, p0, Lqi/a;->g:Z

    if-eqz v0, :cond_0

    invoke-super {p0, p1}, Lal/d;->b(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lqi/a;->f:Ljava/util/Vector;

    if-nez v0, :cond_1

    new-instance v0, Ljava/util/Vector;

    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    iput-object v0, p0, Lqi/a;->f:Ljava/util/Vector;

    :cond_1
    iget-object v0, p0, Lqi/a;->f:Ljava/util/Vector;

    invoke-virtual {v0, p1}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lqi/a;->i:Lqi/a$b;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lqi/a$b;->a(Ljava/lang/String;)V

    return-void

    :cond_0
    const-string v0, "BrowserService.JavaScriptCallback"

    invoke-static {v0, p1}, Lcom/roblox/engine/jni/memstorage/MemStorage;->fire(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public g(Landroid/content/Context;)V
    .locals 0

    return-void
.end method

.method public h()V
    .locals 2

    const-string v0, "rbx.browserservice"

    const-string v1, "create -> bindBrowserService"

    invoke-static {v0, v1}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lqi/a;->m()V

    return-void
.end method

.method public i()V
    .locals 2

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->V2()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Leh/v0;->t()V

    :cond_0
    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->Q2()Z

    move-result v0

    const-string v1, "rbx.browserservice"

    if-eqz v0, :cond_1

    const-string v0, "destroy -> destroyWebView"

    invoke-static {v1, v0}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lqi/a;->a()V

    return-void

    :cond_1
    const-string v0, "destroy -> unbindBrowserService"

    invoke-static {v1, v0}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lqi/a;->p()V

    return-void
.end method

.method public final m()V
    .locals 2

    new-instance v0, Lqi/a$a;

    invoke-direct {v0, p0}, Lqi/a$a;-><init>(Lqi/a;)V

    const-string v1, "BrowserService.ExecuteJavaScript"

    invoke-static {v1, v0}, Lcom/roblox/engine/jni/memstorage/MemStorage;->bind(Ljava/lang/String;Lcom/roblox/engine/jni/memstorage/Callback;)Lcom/roblox/engine/jni/memstorage/Connection;

    move-result-object v0

    iput-object v0, p0, Lqi/a;->h:Lcom/roblox/engine/jni/memstorage/Connection;

    return-void
.end method

.method public final n()V
    .locals 2

    iget-object v0, p0, Lqi/a;->f:Ljava/util/Vector;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/util/Vector;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-super {p0, v1}, Lal/d;->b(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lqi/a;->f:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->clear()V

    :cond_1
    return-void
.end method

.method public final o(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Lal/d;->b:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final p()V
    .locals 1

    iget-object v0, p0, Lqi/a;->h:Lcom/roblox/engine/jni/memstorage/Connection;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/roblox/engine/jni/memstorage/Connection;->disconnect()V

    :cond_0
    return-void
.end method

.method public setWebViewClient(Landroid/webkit/WebViewClient;)V
    .locals 1

    new-instance v0, Lqi/a$c;

    invoke-direct {v0, p0, p1}, Lqi/a$c;-><init>(Lqi/a;Landroid/webkit/WebViewClient;)V

    invoke-super {p0, v0}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    return-void
.end method
