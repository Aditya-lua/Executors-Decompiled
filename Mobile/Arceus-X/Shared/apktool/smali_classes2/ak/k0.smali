.class public Lak/k0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lak/k0$g;,
        Lak/k0$h;,
        Lak/k0$f;
    }
.end annotation


# static fields
.field public static j:Z

.field public static k:Lak/k0;


# instance fields
.field public final a:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public volatile b:Z

.field public c:Lak/k0$g;

.field public d:Lcom/roblox/client/startup/StartedForEnum;

.field public e:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lak/n0;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Landroid/content/Context;

.field public final g:Lvi/g;

.field public final h:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lak/e0;",
            ">;"
        }
    .end annotation
.end field

.field public i:Lcom/roblox/engine/jni/OnAppBridgeNotificationListener;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lvi/g;)V
    .locals 2
    .param p2    # Lvi/g;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lak/k0;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    sget-object v0, Lak/k0$g;->a:Lak/k0$g;

    iput-object v0, p0, Lak/k0;->c:Lak/k0$g;

    sget-object v0, Lcom/roblox/client/startup/StartedForEnum;->SYSTEM:Lcom/roblox/client/startup/StartedForEnum;

    iput-object v0, p0, Lak/k0;->d:Lcom/roblox/client/startup/StartedForEnum;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lak/k0;->h:Ljava/util/Set;

    new-instance v0, Lak/k0$c;

    invoke-direct {v0, p0}, Lak/k0$c;-><init>(Lak/k0;)V

    iput-object v0, p0, Lak/k0;->i:Lcom/roblox/engine/jni/OnAppBridgeNotificationListener;

    const-string v0, "InitHelper"

    const-string v1, "InitHelper created."

    invoke-static {v0, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lak/k0;->f:Landroid/content/Context;

    iput-object p2, p0, Lak/k0;->g:Lvi/g;

    return-void
.end method

.method public static A(Landroid/content/Context;)Z
    .locals 3

    const-string v0, "FirstRunPrefs"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0

    const/4 v0, 0x1

    const-string v2, "isFreshInstall"

    invoke-interface {p0, v2, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    invoke-interface {p0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    :cond_0
    return v0
.end method

.method public static B()Z
    .locals 1

    sget-boolean v0, Lak/k0;->j:Z

    return v0
.end method

.method public static G(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 1

    invoke-static {p0}, Lak/k0;->s(Landroid/content/Context;)Lak/k0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lak/k0;->H(Ljava/lang/String;)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->O3()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {}, Lvi/b;->f()Lvi/b;

    move-result-object p1

    invoke-virtual {p1}, Lvi/b;->h()V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    const/16 v0, 0x2000

    invoke-virtual {p1, v0}, Landroid/view/Window;->clearFlags(I)V

    :cond_0
    invoke-static {}, Lcm/a;->a()Lcm/a;

    move-result-object p1

    new-instance v0, Lak/i0;

    invoke-direct {v0, p0}, Lak/i0;-><init>(Landroid/app/Activity;)V

    invoke-virtual {p1, v0}, Lcm/a;->b(Lcm/a$b;)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->v3()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->b0()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {}, Lbk/b;->a()V

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/roblox/engine/jni/NativeGLInterface;->screenTimeStartByGuac()V

    :cond_2
    :goto_0
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->n5()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {p0}, Lcom/roblox/client/ossearch/b;->g(Landroid/content/Context;)V

    invoke-static {p0}, Lcom/roblox/client/ossearch/b;->e(Landroid/content/Context;)V

    :cond_3
    return-void
.end method

.method public static T()Z
    .locals 11

    new-instance v0, Lwj/a;

    invoke-static {}, Lcom/roblox/client/RobloxApplication;->f()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lwj/a;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lwj/a;->c()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "updateCookiesFromEngine: Got Cookies from external file = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "InitHelper"

    invoke-static {v2, v1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    const-string v1, "; Domain="

    if-eqz v0, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, ".ROBLOSECURITY="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lsg/a1;->O()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lwk/j;->c()Lwk/j;

    move-result-object v1

    invoke-static {}, Lsg/a1;->O()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lwk/e$b;->d:Lwk/e$b;

    invoke-virtual {v1, v2, v0, v3}, Lwk/j;->i(Ljava/lang/String;Ljava/lang/String;Lwk/e$b;)V

    const/4 v0, 0x1

    return v0

    :cond_0
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->b0()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lsg/a1;->g()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lbk/d;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    invoke-static {}, Lsg/a1;->g()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roblox/engine/jni/NativeSettingsInterface;->nativeGetCookiesInNetscapeFormat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    const-string v3, ";"

    invoke-virtual {v0, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    array-length v3, v0

    const/4 v4, 0x0

    move v5, v4

    :goto_1
    if-ge v5, v3, :cond_7

    aget-object v6, v0, v5

    invoke-virtual {v6}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v6

    const-string v7, "\t"

    invoke-virtual {v6, v7}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v7

    array-length v8, v7

    const/4 v9, 0x6

    const/4 v10, 0x7

    if-eq v8, v10, :cond_3

    array-length v8, v7

    if-ne v8, v9, :cond_2

    goto :goto_2

    :cond_2
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "updateCookiesFromEngine: Invalid cookie format: ["

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "]"

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v2, v6}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_4

    :cond_3
    :goto_2
    aget-object v6, v7, v4

    invoke-static {}, Lsg/a1;->O()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_6

    const/4 v6, 0x5

    aget-object v6, v7, v6

    invoke-static {}, Lak/k0$f;->a()Ljava/util/Set;

    move-result-object v8

    invoke-interface {v8, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "updateCookiesFromEngine: Skipping cookie update for: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v2, v6}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_4

    :cond_4
    array-length v8, v7

    if-ne v8, v10, :cond_5

    aget-object v7, v7, v9

    goto :goto_3

    :cond_5
    const-string v7, ""

    :goto_3
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "="

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lsg/a1;->O()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {}, Lwk/j;->c()Lwk/j;

    move-result-object v7

    invoke-static {}, Lsg/a1;->O()Ljava/lang/String;

    move-result-object v8

    sget-object v9, Lwk/e$b;->d:Lwk/e$b;

    invoke-virtual {v7, v8, v6, v9}, Lwk/j;->i(Ljava/lang/String;Ljava/lang/String;Lwk/e$b;)V

    :cond_6
    :goto_4
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_1

    :cond_7
    return v4
.end method

.method public static synthetic a(Landroid/app/Activity;Lorg/json/JSONObject;)V
    .locals 0

    invoke-static {p1, p0}, Lsg/q;->b(Lorg/json/JSONObject;Landroid/app/Activity;)V

    return-void
.end method

.method public static synthetic b(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public static synthetic c(Ljava/lang/String;)V
    .locals 0

    invoke-static {}, Lsg/a1;->X0()V

    return-void
.end method

.method public static bridge synthetic d(Lak/k0;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lak/k0;->f:Landroid/content/Context;

    return-object p0
.end method

.method public static bridge synthetic e(Lak/k0;)Z
    .locals 0

    iget-boolean p0, p0, Lak/k0;->b:Z

    return p0
.end method

.method public static bridge synthetic f(Lak/k0;)Lvi/g;
    .locals 0

    iget-object p0, p0, Lak/k0;->g:Lvi/g;

    return-object p0
.end method

.method public static bridge synthetic g(Lak/k0;Lak/k0$g;)V
    .locals 0

    iput-object p1, p0, Lak/k0;->c:Lak/k0$g;

    return-void
.end method

.method public static bridge synthetic h(Lak/k0;)V
    .locals 0

    invoke-virtual {p0}, Lak/k0;->o()V

    return-void
.end method

.method public static bridge synthetic i(Lak/k0;)V
    .locals 0

    invoke-virtual {p0}, Lak/k0;->p()V

    return-void
.end method

.method public static bridge synthetic j(Lak/k0;)Lak/n0;
    .locals 0

    invoke-virtual {p0}, Lak/k0;->t()Lak/n0;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic k(Lak/k0;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lak/k0;->u(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static bridge synthetic l(Lak/k0;)V
    .locals 0

    invoke-virtual {p0}, Lak/k0;->D()V

    return-void
.end method

.method public static bridge synthetic m(Lak/k0;)V
    .locals 0

    invoke-virtual {p0}, Lak/k0;->E()V

    return-void
.end method

.method public static bridge synthetic n(Lak/k0;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0, p1}, Lak/k0;->F(Ljava/lang/String;)V

    return-void
.end method

.method public static s(Landroid/content/Context;)Lak/k0;
    .locals 3

    sget-object v0, Lak/k0;->k:Lak/k0;

    if-nez v0, :cond_1

    const-class v0, Lak/k0;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lak/k0;->k:Lak/k0;

    if-nez v1, :cond_0

    new-instance v1, Lak/k0;

    invoke-static {}, Lvi/g;->b()Lvi/g;

    move-result-object v2

    invoke-direct {v1, p0, v2}, Lak/k0;-><init>(Landroid/content/Context;Lvi/g;)V

    sput-object v1, Lak/k0;->k:Lak/k0;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    goto :goto_2

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_1
    :goto_2
    sget-object p0, Lak/k0;->k:Lak/k0;

    return-object p0
.end method

.method public static w(Landroid/content/Context;)V
    .locals 1

    invoke-static {}, Lyl/c;->i()Lyl/c;

    move-result-object v0

    invoke-virtual {v0}, Lyl/c;->e()V

    invoke-static {}, Lcom/roblox/universalapp/cookie/CookieProtocol;->a()Lcom/roblox/universalapp/cookie/CookieProtocol;

    invoke-static {}, Lzl/e;->m()Lzl/e;

    move-result-object v0

    invoke-virtual {v0, p0}, Lzl/e;->l(Landroid/content/Context;)V

    invoke-static {}, Lim/f;->z()Lim/f;

    move-result-object v0

    invoke-virtual {v0, p0}, Lim/f;->w(Landroid/content/Context;)V

    invoke-static {}, Lql/c;->h()Lql/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lql/c;->g(Landroid/content/Context;)V

    invoke-static {}, Lkm/f;->D()Lkm/f;

    move-result-object v0

    invoke-virtual {v0, p0}, Lkm/f;->y(Landroid/content/Context;)V

    invoke-static {}, Lhm/b;->h()Lhm/b;

    move-result-object v0

    invoke-virtual {v0, p0}, Lhm/b;->l(Landroid/content/Context;)V

    invoke-static {}, Lxl/g;->x()Lxl/g;

    invoke-static {}, Lpm/a;->c()Lpm/a;

    invoke-static {}, Ldm/b;->i()Ldm/b;

    move-result-object v0

    invoke-virtual {v0}, Ldm/b;->g()V

    invoke-static {}, Lgk/t;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->D3()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lrl/c;->d()Lrl/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lrl/c;->c(Landroid/content/Context;)V

    goto :goto_0

    :cond_0
    invoke-static {}, Lrl/c;->d()Lrl/c;

    :goto_0
    invoke-static {}, Lbm/r;->y()Lbm/r;

    :cond_1
    return-void
.end method

.method public static x(Z)V
    .locals 0

    sput-boolean p0, Lak/k0;->j:Z

    return-void
.end method

.method public static z(Landroid/content/Context;IZ)V
    .locals 6

    new-instance v0, Ljava/io/File;

    const-string v1, "/system/fonts/NotoSansCJK-Regular.ttc"

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    const-string v1, "EventIngest"

    const-string v2, "Points"

    invoke-static {v1, v2}, Lb1/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    new-instance v3, Landroid/util/Pair;

    const-string v4, "FastFollowCJKAvailable"

    const/4 v5, 0x0

    invoke-static {v5}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v3, Landroid/util/Pair;

    const-string v4, "SystemCJKAvailable"

    invoke-static {v0}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v3, Landroid/util/Pair;

    const-string v4, "EitherCJKAvailable"

    invoke-static {v0}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v4, v0}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->R1()Z

    move-result v0

    const-string v3, "IsFreshInstall"

    if-eqz v0, :cond_0

    new-instance p0, Landroid/util/Pair;

    invoke-static {p2}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, v3, p2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v2, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance p2, Landroid/util/Pair;

    invoke-static {p0}, Lak/k0;->A(Landroid/content/Context;)Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p2, v3, p0}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v2, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_0
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p0

    invoke-interface {p0}, Lth/i;->q3()Z

    move-result p0

    if-eqz p0, :cond_1

    new-instance p0, Landroid/util/Pair;

    invoke-static {}, Lgk/j;->b()Landroid/os/StatFs;

    move-result-object p2

    invoke-virtual {p2}, Landroid/os/StatFs;->getAvailableBytes()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p2

    const-string v0, "AvailableStorage"

    invoke-direct {p0, v0, p2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v2, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p0, Landroid/util/Pair;

    invoke-static {}, Lgk/j;->b()Landroid/os/StatFs;

    move-result-object p2

    invoke-virtual {p2}, Landroid/os/StatFs;->getTotalBytes()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p2

    const-string v0, "TotalStorage"

    invoke-direct {p0, v0, p2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v2, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p0, Landroid/util/Pair;

    invoke-static {}, Lgk/j;->a()Landroid/os/StatFs;

    move-result-object p2

    invoke-virtual {p2}, Landroid/os/StatFs;->getTotalBytes()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p2

    const-string v0, "ExternalStorage"

    invoke-direct {p0, v0, p2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v2, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p0, Landroid/util/Pair;

    invoke-static {}, Lgk/j;->b()Landroid/os/StatFs;

    move-result-object p2

    invoke-virtual {p2}, Landroid/os/StatFs;->getAvailableBytes()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p2

    const-string v0, "AvailableExternalStorage"

    invoke-direct {p0, v0, p2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v2, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    const-string p0, "addOSInfo"

    invoke-static {p0}, Lg0/p0;->a(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-static {}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent;->builder()Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent$Builder;

    move-result-object p2

    const-string v0, "RobloxTelemetry"

    invoke-virtual {p2, v0}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent$Builder;->setEventType(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent$Builder;

    move-result-object p2

    invoke-static {}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig;->builder()Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig$Builder;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig$Builder;->setBackEnds(Ljava/util/List;)Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig$Builder;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig$Builder;->setThrottlingHundredthPercentage(I)Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig$Builder;

    move-result-object p1

    const-string v0, "JavaFastFollowEvent"

    invoke-virtual {p1, v0}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig$Builder;->setEventName(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig$Builder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig$Builder;->build()Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent$Builder;->setConfig(Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig;)Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent$Builder;

    move-result-object p1

    invoke-static {}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData;->builder()Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData$Builder;

    move-result-object p2

    invoke-virtual {p2, p0}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData$Builder;->setStandardizedFields(Ljava/util/List;)Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData$Builder;

    move-result-object p0

    invoke-virtual {p0, v2}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData$Builder;->setCustomStringFields(Ljava/util/List;)Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData$Builder;

    move-result-object p0

    invoke-virtual {p0}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData$Builder;->build()Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData;

    move-result-object p0

    invoke-virtual {p1, p0}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent$Builder;->setData(Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData;)Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent$Builder;

    move-result-object p0

    invoke-virtual {p0}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent$Builder;->build()Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent;

    move-result-object p0

    invoke-static {p0}, Lcom/roblox/universalapp/logging/LoggingProtocol;->j(Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent;)V

    return-void
.end method


# virtual methods
.method public C(Landroid/content/Context;ZLxi/c$b;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "logout: callServer = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", initState = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lak/k0;->c:Lak/k0$g;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "InitHelper"

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v0, Lak/k0$g;->e:Lak/k0$g;

    iput-object v0, p0, Lak/k0;->c:Lak/k0$g;

    invoke-static {}, Lvi/h;->e()Lvi/h;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lvi/h;->c(Landroid/content/Context;ZLxi/c$b;)V

    return-void
.end method

.method public final D()V
    .locals 2

    const-string v0, "InitHelper"

    const-string v1, "AppSettings FAILURE"

    invoke-static {v0, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v0, Lak/k0$g;->g:Lak/k0$g;

    iput-object v0, p0, Lak/k0;->c:Lak/k0$g;

    const-string v0, "init_failure"

    invoke-static {v0}, Lcom/roblox/universalapp/logging/LoggingProtocol;->g(Ljava/lang/String;)V

    invoke-virtual {p0}, Lak/k0;->t()Lak/n0;

    move-result-object v0

    invoke-interface {v0}, Lak/n0;->J()V

    monitor-enter p0

    :try_start_0
    new-instance v0, Ljava/util/HashSet;

    iget-object v1, p0, Lak/k0;->h:Ljava/util/Set;

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lak/e0;

    invoke-interface {v1}, Lak/e0;->b()V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    monitor-exit p0

    return-void

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final E()V
    .locals 9

    const-string v0, "InitHelper"

    const-string v1, "AppSettings loaded."

    invoke-static {v0, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lak/k0;->f:Landroid/content/Context;

    invoke-static {v0}, Lcom/roblox/client/startup/a;->B(Landroid/content/Context;)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->j3()Z

    move-result v0

    iput-boolean v0, p0, Lak/k0;->b:Z

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->b0()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lak/k0;->b:Z

    invoke-static {v0}, Lbk/a;->b(Z)V

    goto :goto_0

    :cond_0
    iget-boolean v0, p0, Lak/k0;->b:Z

    invoke-static {v0}, Lcom/roblox/engine/jni/NativeAppBridgeInterface;->setEnableConnectivityV2ForAndroid(Z)V

    :goto_0
    monitor-enter p0

    :try_start_0
    new-instance v0, Ljava/util/HashSet;

    iget-object v1, p0, Lak/k0;->h:Ljava/util/Set;

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lak/e0;

    invoke-interface {v1}, Lak/e0;->a()V

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->U5()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lak/k0;->f:Landroid/content/Context;

    invoke-static {v0}, Ldi/i;->q(Landroid/content/Context;)V

    :cond_2
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->R4()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lak/k0;->f:Landroid/content/Context;

    invoke-static {v0}, Lnh/c;->c(Landroid/content/Context;)V

    :cond_3
    invoke-static {}, Lxg/a;->e()Lxg/a;

    move-result-object v1

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->p()I

    move-result v2

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->i4()I

    move-result v3

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->l3()I

    move-result v4

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->q0()I

    move-result v5

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v6

    invoke-interface {v6}, Lth/i;->W5()I

    move-result v6

    int-to-long v6, v6

    invoke-virtual {v0, v6, v7}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v6

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->F()I

    move-result v8

    invoke-virtual/range {v1 .. v8}, Lxg/a;->k(IIIIJI)V

    invoke-virtual {p0}, Lak/k0;->t()Lak/n0;

    move-result-object v0

    invoke-interface {v0}, Lak/n0;->G()V

    return-void

    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final F(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lak/k0;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Init FAILURE: ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ")"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "InitHelper"

    invoke-static {v0, p1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    const-string p1, "init_failure"

    invoke-static {p1}, Lcom/roblox/universalapp/logging/LoggingProtocol;->g(Ljava/lang/String;)V

    invoke-virtual {p0}, Lak/k0;->t()Lak/n0;

    move-result-object p1

    invoke-interface {p1}, Lak/n0;->J()V

    :cond_0
    return-void
.end method

.method public H(Ljava/lang/String;)V
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onDidLoginEventFromLua: initState = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lak/k0;->c:Lak/k0$g;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", data = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "InitHelper"

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v0, Lak/k0$g;->d:Lak/k0$g;

    iput-object v0, p0, Lak/k0;->c:Lak/k0$g;

    invoke-static {}, Lak/k0;->T()Z

    invoke-static {}, Lvi/h;->e()Lvi/h;

    move-result-object v0

    iget-object v1, p0, Lak/k0;->f:Landroid/content/Context;

    new-instance v2, Lak/k0$d;

    invoke-direct {v2, p0}, Lak/k0$d;-><init>(Lak/k0;)V

    invoke-virtual {v0, v1, p1, v2}, Lvi/h;->j(Landroid/content/Context;Ljava/lang/String;Lvi/h$f;)V

    return-void
.end method

.method public I(Ljava/lang/String;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onDidSignUpEventFromLua: initState = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lak/k0;->c:Lak/k0$g;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", data = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "InitHelper"

    invoke-static {v0, p1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p1, Lcom/roblox/client/startup/StartedForEnum;->AFTER_SIGN_UP:Lcom/roblox/client/startup/StartedForEnum;

    invoke-virtual {p0, p1}, Lak/k0;->M(Lcom/roblox/client/startup/StartedForEnum;)V

    return-void
.end method

.method public J()V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onLoginRequestFromLua: initState = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lak/k0;->c:Lak/k0$g;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "InitHelper"

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v0, Lak/k0$g;->f:Lak/k0$g;

    iput-object v0, p0, Lak/k0;->c:Lak/k0$g;

    invoke-virtual {p0}, Lak/k0;->t()Lak/n0;

    move-result-object v0

    invoke-interface {v0}, Lak/n0;->O()V

    return-void
.end method

.method public declared-synchronized K(Lak/e0;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lak/k0;->h:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final L()V
    .locals 2

    iget-object v0, p0, Lak/k0;->f:Landroid/content/Context;

    invoke-static {v0}, Lwh/p;->c(Landroid/content/Context;)Lcom/roblox/engine/jni/model/DeviceParams;

    move-result-object v0

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v1

    invoke-interface {v1}, Lth/i;->b0()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {v0}, Lbk/d;->c(Lcom/roblox/engine/jni/model/DeviceParams;)V

    return-void

    :cond_0
    invoke-static {v0}, Lcom/roblox/engine/jni/NativeSettingsInterface;->nativeSetDeviceInfo(Lcom/roblox/engine/jni/model/DeviceParams;)V

    return-void
.end method

.method public M(Lcom/roblox/client/startup/StartedForEnum;)V
    .locals 0

    iput-object p1, p0, Lak/k0;->d:Lcom/roblox/client/startup/StartedForEnum;

    return-void
.end method

.method public N(Lak/n0;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "start: setView = ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez p1, :cond_0

    const-string v1, "null"

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "InitHelper"

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lak/k0;->e:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public O()V
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "start: initState = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lak/k0;->c:Lak/k0$g;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", StartedFor: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lak/k0;->d:Lcom/roblox/client/startup/StartedForEnum;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "InitHelper"

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lak/k0;->c:Lak/k0$g;

    sget-object v2, Lak/k0$g;->a:Lak/k0$g;

    if-ne v0, v2, :cond_0

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->v2()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lmk/c;->p()Lmk/c;

    move-result-object v0

    new-instance v3, Lak/h0;

    invoke-direct {v3}, Lak/h0;-><init>()V

    invoke-virtual {v0, v3}, Lmk/c;->s(Ljava/util/function/Consumer;)V

    :cond_0
    iget-object v0, p0, Lak/k0;->c:Lak/k0$g;

    sget-object v3, Lak/k0$g;->d:Lak/k0$g;

    if-ne v0, v3, :cond_1

    iput-object v2, p0, Lak/k0;->c:Lak/k0$g;

    :cond_1
    iget-object v0, p0, Lak/k0;->c:Lak/k0$g;

    if-eq v0, v2, :cond_6

    sget-object v2, Lak/k0$g;->g:Lak/k0$g;

    if-ne v0, v2, :cond_2

    goto :goto_1

    :cond_2
    sget-object v2, Lak/k0$g;->c:Lak/k0$g;

    if-ne v0, v2, :cond_3

    invoke-virtual {p0}, Lak/k0;->E()V

    return-void

    :cond_3
    sget-object v3, Lak/k0$g;->e:Lak/k0$g;

    if-eq v0, v3, :cond_5

    sget-object v3, Lak/k0$g;->f:Lak/k0$g;

    if-ne v0, v3, :cond_4

    goto :goto_0

    :cond_4
    const-string v0, "The initialization must be in progress. Do nothing."

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_5
    :goto_0
    iput-object v2, p0, Lak/k0;->c:Lak/k0$g;

    invoke-virtual {p0}, Lak/k0;->E()V

    return-void

    :cond_6
    :goto_1
    sget-object v0, Lak/k0$g;->b:Lak/k0$g;

    iput-object v0, p0, Lak/k0;->c:Lak/k0$g;

    invoke-virtual {p0}, Lak/k0;->q()V

    return-void
.end method

.method public final P()V
    .locals 5

    const-string v0, "start_app_bridge_begin"

    invoke-static {v0}, Lcom/roblox/universalapp/logging/LoggingProtocol;->g(Ljava/lang/String;)V

    const-string v0, "InitHelper"

    const-string v1, "startAppBridge:..."

    invoke-static {v0, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lak/k0;->L()V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->s()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "after_set_device_info_in_engine"

    invoke-static {v0}, Lcom/roblox/universalapp/logging/LoggingProtocol;->g(Ljava/lang/String;)V

    :cond_0
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->R1()Z

    move-result v0

    const/16 v1, 0x64

    if-eqz v0, :cond_2

    iget-object v0, p0, Lak/k0;->f:Landroid/content/Context;

    invoke-static {v0}, Lak/k0;->A(Landroid/content/Context;)Z

    move-result v0

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v2

    invoke-interface {v2}, Lth/i;->b0()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {v0}, Lbk/a;->c(Z)V

    goto :goto_0

    :cond_1
    invoke-static {v0}, Lcom/roblox/engine/jni/NativeAppBridgeInterface;->setIsFirstInstall(Z)V

    :goto_0
    iget-object v2, p0, Lak/k0;->f:Landroid/content/Context;

    invoke-static {v2, v1, v0}, Lak/k0;->z(Landroid/content/Context;IZ)V

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lak/k0;->f:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lak/k0;->z(Landroid/content/Context;IZ)V

    :goto_1
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->s()Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "after_initialize_fonts_asset_pack"

    invoke-static {v0}, Lcom/roblox/universalapp/logging/LoggingProtocol;->g(Ljava/lang/String;)V

    :cond_3
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->b0()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lak/k0;->i:Lcom/roblox/engine/jni/OnAppBridgeNotificationListener;

    invoke-static {v0}, Lbk/c;->a(Lcom/roblox/engine/jni/OnAppBridgeNotificationListener;)V

    goto :goto_2

    :cond_4
    iget-object v0, p0, Lak/k0;->i:Lcom/roblox/engine/jni/OnAppBridgeNotificationListener;

    invoke-static {v0}, Lcom/roblox/engine/jni/NativeGLJavaInterface;->setAppBridgeNotificationListener(Lcom/roblox/engine/jni/OnAppBridgeNotificationListener;)V

    :goto_2
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->s()Z

    move-result v0

    if-eqz v0, :cond_5

    const-string v0, "after_set_app_bridge_notification_listener"

    invoke-static {v0}, Lcom/roblox/universalapp/logging/LoggingProtocol;->g(Ljava/lang/String;)V

    :cond_5
    invoke-static {}, Lsg/a1;->g()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lsg/a1;->Z0()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lsg/a1;->r0()Z

    move-result v2

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v3

    invoke-interface {v3}, Lth/i;->b0()Z

    move-result v3

    if-eqz v3, :cond_6

    sget-object v3, Lsg/a1;->t:Ljava/lang/String;

    invoke-static {}, Lsg/a1;->E()Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v1, v2, v3, v4}, Lbk/a;->a(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V

    goto :goto_3

    :cond_6
    sget-object v3, Lsg/a1;->t:Ljava/lang/String;

    invoke-static {}, Lsg/a1;->E()Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v1, v2, v3, v4}, Lcom/roblox/engine/jni/NativeAppBridgeInterface;->a(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V

    :goto_3
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->o3()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {}, Lwh/f;->j()Lwh/f;

    move-result-object v0

    invoke-virtual {v0}, Lwh/f;->E()V

    :cond_7
    const-string v0, "start_app_bridge_end"

    invoke-static {v0}, Lcom/roblox/universalapp/logging/LoggingProtocol;->g(Ljava/lang/String;)V

    return-void
.end method

.method public Q()V
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "startV2: initState = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lak/k0;->c:Lak/k0$g;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", StartedFor: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lak/k0;->d:Lcom/roblox/client/startup/StartedForEnum;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "InitHelper"

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lak/k0;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-virtual {v0, v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->C()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/roblox/client/startup/a;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Flags are not loaded when starting AppBridge"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    invoke-virtual {p0}, Lak/k0;->P()V

    :cond_2
    iget-object v0, p0, Lak/k0;->c:Lak/k0$g;

    sget-object v2, Lak/k0$g;->d:Lak/k0$g;

    if-eq v0, v2, :cond_5

    sget-object v3, Lak/k0$g;->f:Lak/k0$g;

    if-eq v0, v3, :cond_5

    sget-object v3, Lak/k0$g;->e:Lak/k0$g;

    if-ne v0, v3, :cond_3

    goto :goto_1

    :cond_3
    sget-object v3, Lak/k0$g;->c:Lak/k0$g;

    if-ne v0, v3, :cond_4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " mContext: "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lak/k0;->f:Landroid/content/Context;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v3, "rbx.locale"

    invoke-static {v3, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lqi/b;->f()Lqi/b;

    move-result-object v0

    iget-object v3, p0, Lak/k0;->f:Landroid/content/Context;

    invoke-virtual {v0, v3}, Lqi/b;->m(Landroid/content/Context;)V

    invoke-virtual {p0}, Lak/k0;->t()Lak/n0;

    move-result-object v0

    invoke-interface {v0}, Lak/n0;->i0()V

    const-string v0, "SessionCheck... New startup flow. Go directly to the Main screen."

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iput-object v2, p0, Lak/k0;->c:Lak/k0$g;

    invoke-virtual {p0}, Lak/k0;->t()Lak/n0;

    move-result-object v0

    invoke-interface {v0}, Lak/n0;->k0()V

    goto :goto_2

    :cond_4
    const-string v0, "The initialization must be in progress. Do nothing."

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_2

    :cond_5
    :goto_1
    const-string v0, "The initialization is done or unauthorized. Go to Main screen."

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lak/k0;->t()Lak/n0;

    move-result-object v0

    invoke-interface {v0}, Lak/n0;->k0()V

    :goto_2
    invoke-static {}, Lzl/e;->m()Lzl/e;

    move-result-object v0

    iget-object v1, p0, Lak/k0;->f:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lzl/e;->l(Landroid/content/Context;)V

    invoke-static {}, Lim/f;->z()Lim/f;

    move-result-object v0

    iget-object v1, p0, Lak/k0;->f:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lim/f;->w(Landroid/content/Context;)V

    invoke-static {}, Lql/c;->h()Lql/c;

    move-result-object v0

    iget-object v1, p0, Lak/k0;->f:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lql/c;->g(Landroid/content/Context;)V

    invoke-static {}, Lkm/f;->D()Lkm/f;

    move-result-object v0

    iget-object v1, p0, Lak/k0;->f:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lkm/f;->y(Landroid/content/Context;)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->D3()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-static {}, Lgk/t;->e()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-static {}, Lrl/c;->d()Lrl/c;

    move-result-object v0

    iget-object v1, p0, Lak/k0;->f:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lrl/c;->c(Landroid/content/Context;)V

    :cond_6
    return-void
.end method

.method public declared-synchronized R(Lak/e0;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lak/k0;->h:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public S(Lak/n0;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "start: unsetView = ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez p1, :cond_0

    const-string v1, "null"

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "InitHelper"

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lak/k0;->e:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lak/n0;

    if-eqz v0, :cond_1

    if-ne v0, p1, :cond_1

    const/4 p1, 0x0

    iput-object p1, p0, Lak/k0;->e:Ljava/lang/ref/WeakReference;

    :cond_1
    return-void
.end method

.method public final o()V
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "After post login. StartedFor: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lak/k0;->d:Lcom/roblox/client/startup/StartedForEnum;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "InitHelper"

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->A5()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lfk/c;->c()Lfk/c;

    move-result-object v0

    invoke-virtual {v0}, Lfk/c;->n()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lgk/c;->g()Lgk/c;

    move-result-object v0

    iget-object v1, p0, Lak/k0;->f:Landroid/content/Context;

    new-instance v2, Lak/j0;

    invoke-direct {v2}, Lak/j0;-><init>()V

    invoke-virtual {v0, v1, v2}, Lgk/c;->f(Landroid/content/Context;Lgk/a$a;)V

    :cond_0
    sget-object v0, Lak/k0$e;->a:[I

    iget-object v1, p0, Lak/k0;->d:Lcom/roblox/client/startup/StartedForEnum;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    return-void

    :pswitch_0
    invoke-virtual {p0}, Lak/k0;->r()Lvi/d;

    move-result-object v0

    iget-object v1, p0, Lak/k0;->f:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lvi/d;->d(Landroid/content/Context;)V

    return-void

    :pswitch_1
    invoke-virtual {p0}, Lak/k0;->r()Lvi/d;

    move-result-object v0

    iget-object v1, p0, Lak/k0;->f:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lvi/d;->g(Landroid/content/Context;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final p()V
    .locals 2

    invoke-static {}, Lgk/c;->g()Lgk/c;

    move-result-object v0

    iget-object v1, p0, Lak/k0;->f:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lgk/c;->e(Landroid/content/Context;)V

    return-void
.end method

.method public final q()V
    .locals 3

    const-string v0, "InitHelper"

    const-string v1, "getAllAppSettings:..."

    invoke-static {v0, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "load_setting_begin"

    invoke-static {v0}, Lcom/roblox/universalapp/logging/LoggingProtocol;->g(Ljava/lang/String;)V

    invoke-static {}, Lwh/f;->j()Lwh/f;

    move-result-object v0

    iget-object v1, p0, Lak/k0;->f:Landroid/content/Context;

    new-instance v2, Lak/k0$a;

    invoke-direct {v2, p0}, Lak/k0$a;-><init>(Lak/k0;)V

    invoke-virtual {v0, v1, v2}, Lwh/f;->o(Landroid/content/Context;Lwh/f$h;)V

    return-void
.end method

.method public final r()Lvi/d;
    .locals 1

    invoke-static {}, Lsg/y;->h()Lsg/y;

    move-result-object v0

    invoke-virtual {v0}, Lsg/y;->d()Lvi/d;

    move-result-object v0

    return-object v0
.end method

.method public final t()Lak/n0;
    .locals 2

    iget-object v0, p0, Lak/k0;->e:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    new-instance v0, Lak/k0$h;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lak/k0$h;-><init>(Lak/m0;)V

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v1, p0, Lak/k0;->e:Ljava/lang/ref/WeakReference;

    :cond_1
    iget-object v0, p0, Lak/k0;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lak/n0;

    return-object v0
.end method

.method public final u(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lak/k0$b;

    invoke-direct {v1, p0, p1, p2}, Lak/k0$b;-><init>(Lak/k0;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public v()Z
    .locals 2

    iget-object v0, p0, Lak/k0;->c:Lak/k0$g;

    sget-object v1, Lak/k0$g;->a:Lak/k0$g;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public y()V
    .locals 2

    invoke-virtual {p0}, Lak/k0;->r()Lvi/d;

    move-result-object v0

    iget-object v1, p0, Lak/k0;->f:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lvi/d;->a(Landroid/content/Context;)V

    return-void
.end method
