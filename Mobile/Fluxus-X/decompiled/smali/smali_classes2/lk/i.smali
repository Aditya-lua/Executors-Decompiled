.class public Llk/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public b:Lcom/roblox/engine/jni/memstorage/Connection;

.field public c:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/os/Handler;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "UserThemeListener"

    iput-object v0, p0, Llk/i;->a:Ljava/lang/String;

    iput-object p1, p0, Llk/i;->c:Landroid/os/Handler;

    return-void
.end method

.method public static synthetic a(Lcm/a;)V
    .locals 1

    invoke-static {}, Lnk/c;->c()Lnk/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lnk/c;->u(Lcm/a;)V

    return-void
.end method


# virtual methods
.method public b()V
    .locals 2

    iget-object v0, p0, Llk/i;->b:Lcom/roblox/engine/jni/memstorage/Connection;

    if-nez v0, :cond_0

    new-instance v0, Llk/g;

    invoke-direct {v0, p0}, Llk/g;-><init>(Llk/i;)V

    const-string v1, "ThemeUpdate"

    invoke-static {v1, v0}, Lcom/roblox/engine/jni/memstorage/MemStorage;->bind(Ljava/lang/String;Lcom/roblox/engine/jni/memstorage/Callback;)Lcom/roblox/engine/jni/memstorage/Connection;

    move-result-object v0

    iput-object v0, p0, Llk/i;->b:Lcom/roblox/engine/jni/memstorage/Connection;

    :cond_0
    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Theme updated from MemStorage: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "UserThemeListener"

    invoke-static {v1, v0}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lnk/c;->c()Lnk/c;

    move-result-object v0

    invoke-virtual {v0}, Lnk/c;->i()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    xor-int/lit8 v1, v0, 0x1

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v2

    invoke-interface {v2}, Lbi/i;->l0()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    if-eqz v0, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_2

    invoke-static {p1}, Lcm/a;->b(Ljava/lang/String;)Lcm/a;

    move-result-object p1

    new-instance v0, Llk/h;

    invoke-direct {v0, p1}, Llk/h;-><init>(Lcm/a;)V

    invoke-virtual {p0, v0}, Llk/i;->d(Ljava/lang/Runnable;)V

    :cond_2
    return-void
.end method

.method public final d(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Llk/i;->c:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public e()V
    .locals 1

    iget-object v0, p0, Llk/i;->b:Lcom/roblox/engine/jni/memstorage/Connection;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/roblox/engine/jni/memstorage/Connection;->disconnect()V

    const/4 v0, 0x0

    iput-object v0, p0, Llk/i;->b:Lcom/roblox/engine/jni/memstorage/Connection;

    :cond_0
    return-void
.end method
