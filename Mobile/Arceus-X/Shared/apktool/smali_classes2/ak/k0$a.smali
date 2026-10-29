.class public Lak/k0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwh/f$h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lak/k0;->q()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lak/k0;


# direct methods
.method public constructor <init>(Lak/k0;)V
    .locals 0

    iput-object p1, p0, Lak/k0$a;->a:Lak/k0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 2

    const-string v0, "load_setting_end"

    invoke-static {v0}, Lcom/roblox/universalapp/logging/LoggingProtocol;->g(Ljava/lang/String;)V

    invoke-static {}, Lvg/e;->h()Lvg/e;

    move-result-object v0

    iget-object v1, p0, Lak/k0$a;->a:Lak/k0;

    invoke-static {v1}, Lak/k0;->d(Lak/k0;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvg/e;->i(Landroid/content/Context;)V

    if-nez p1, :cond_7

    const-string p1, "InitHelper"

    const-string v0, "getAllAppSettings: ... Settings loaded."

    invoke-static {p1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lak/k0$a;->a:Lak/k0;

    sget-object v0, Lak/k0$g;->c:Lak/k0$g;

    invoke-static {p1, v0}, Lak/k0;->g(Lak/k0;Lak/k0$g;)V

    iget-object p1, p0, Lak/k0$a;->a:Lak/k0;

    invoke-static {p1}, Lak/k0;->d(Lak/k0;)Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lak/k0;->w(Landroid/content/Context;)V

    invoke-static {}, Lrl/j;->j()Lrl/j;

    move-result-object p1

    invoke-virtual {p1}, Lrl/j;->f()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {}, Lrl/j;->j()Lrl/j;

    move-result-object p1

    iget-object v0, p0, Lak/k0$a;->a:Lak/k0;

    invoke-static {v0}, Lak/k0;->d(Lak/k0;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1, v0}, Lrl/j;->i(Landroid/content/Context;)V

    :cond_0
    invoke-static {}, Lkm/f;->D()Lkm/f;

    move-result-object p1

    invoke-virtual {p1}, Lkm/f;->t()V

    iget-object p1, p0, Lak/k0$a;->a:Lak/k0;

    invoke-virtual {p1}, Lak/k0;->y()V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->p2()Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object p1

    const-string v1, "mounted"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lak/k0$a;->a:Lak/k0;

    invoke-static {p1}, Lak/k0;->d(Lak/k0;)Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v1

    invoke-interface {v1}, Lth/i;->b0()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {p1}, Lbk/d;->d(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    invoke-static {p1}, Lcom/roblox/engine/jni/NativeSettingsInterface;->nativeSetExternalDirectory(Ljava/lang/String;)V

    :cond_2
    :goto_0
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->l4()Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object p1, p0, Lak/k0$a;->a:Lak/k0;

    invoke-static {p1}, Lak/k0;->d(Lak/k0;)Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_3
    const-string p1, ""

    :goto_1
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->b0()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lak/k0$a;->a:Lak/k0;

    invoke-static {v0}, Lak/k0;->d(Lak/k0;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getDataDir()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lbk/d;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_4
    iget-object v0, p0, Lak/k0$a;->a:Lak/k0;

    invoke-static {v0}, Lak/k0;->d(Lak/k0;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getDataDir()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/roblox/engine/jni/NativeSettingsInterface;->nativeSetBaseDataDirectories(Ljava/lang/String;Ljava/lang/String;)V

    :cond_5
    :goto_2
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->b0()Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p1, p0, Lak/k0$a;->a:Lak/k0;

    invoke-static {p1}, Lak/k0;->d(Lak/k0;)Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lgk/z;->e(Landroid/content/Context;)Lgk/z;

    move-result-object p1

    invoke-virtual {p1}, Lgk/z;->f()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lbk/d;->e(Ljava/lang/String;)V

    goto :goto_3

    :cond_6
    iget-object p1, p0, Lak/k0$a;->a:Lak/k0;

    invoke-static {p1}, Lak/k0;->d(Lak/k0;)Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lgk/z;->e(Landroid/content/Context;)Lgk/z;

    move-result-object p1

    invoke-virtual {p1}, Lgk/z;->f()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/roblox/engine/jni/NativeSettingsInterface;->nativeSetPreferencesFile(Ljava/lang/String;)V

    :goto_3
    iget-object p1, p0, Lak/k0$a;->a:Lak/k0;

    invoke-static {p1}, Lak/k0;->m(Lak/k0;)V

    return-void

    :cond_7
    iget-object p1, p0, Lak/k0$a;->a:Lak/k0;

    invoke-static {p1}, Lak/k0;->l(Lak/k0;)V

    return-void
.end method
