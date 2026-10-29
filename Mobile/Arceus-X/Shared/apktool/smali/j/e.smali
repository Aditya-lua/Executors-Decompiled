.class public abstract Lj/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj/e$a;,
        Lj/e$b;,
        Lj/e$c;,
        Lj/e$d;
    }
.end annotation


# static fields
.field public static a:Lj/e$c;

.field public static b:I

.field public static c:Lu2/j;

.field public static d:Lu2/j;

.field public static e:Ljava/lang/Boolean;

.field public static f:Z

.field public static final g:Lw1/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw1/b<",
            "Ljava/lang/ref/WeakReference<",
            "Lj/e;",
            ">;>;"
        }
    .end annotation
.end field

.field public static final h:Ljava/lang/Object;

.field public static final i:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lj/e$c;

    new-instance v1, Lj/e$d;

    invoke-direct {v1}, Lj/e$d;-><init>()V

    invoke-direct {v0, v1}, Lj/e$c;-><init>(Ljava/util/concurrent/Executor;)V

    sput-object v0, Lj/e;->a:Lj/e$c;

    const/16 v0, -0x64

    sput v0, Lj/e;->b:I

    const/4 v0, 0x0

    sput-object v0, Lj/e;->c:Lu2/j;

    sput-object v0, Lj/e;->d:Lu2/j;

    sput-object v0, Lj/e;->e:Ljava/lang/Boolean;

    const/4 v0, 0x0

    sput-boolean v0, Lj/e;->f:Z

    new-instance v0, Lw1/b;

    invoke-direct {v0}, Lw1/b;-><init>()V

    sput-object v0, Lj/e;->g:Lw1/b;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lj/e;->h:Ljava/lang/Object;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lj/e;->i:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static D(Lj/e;)V
    .locals 1
    .param p0    # Lj/e;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    sget-object v0, Lj/e;->h:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-static {p0}, Lj/e;->E(Lj/e;)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static E(Lj/e;)V
    .locals 3
    .param p0    # Lj/e;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    sget-object v0, Lj/e;->h:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lj/e;->g:Lw1/b;

    invoke-virtual {v1}, Lw1/b;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lj/e;

    if-eq v2, p0, :cond_1

    if-nez v2, :cond_0

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_2
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static M(Landroid/content/Context;)V
    .locals 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_1

    new-instance v0, Landroid/content/ComponentName;

    const-string v1, "androidx.appcompat.app.AppLocalesMetadataHolderService"

    invoke-direct {v0, p0, v1}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/pm/PackageManager;->getComponentEnabledSetting(Landroid/content/ComponentName;)I

    move-result v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_1

    invoke-static {}, Lj/e;->k()Lu2/j;

    move-result-object v1

    invoke-virtual {v1}, Lu2/j;->e()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p0}, Lk2/e;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    const-string v3, "locale"

    invoke-virtual {p0, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-static {v1}, Lj/e$a;->a(Ljava/lang/String;)Landroid/os/LocaleList;

    move-result-object v1

    invoke-static {v3, v1}, Lj/e$b;->b(Ljava/lang/Object;Landroid/os/LocaleList;)V

    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p0

    invoke-virtual {p0, v0, v2, v2}, Landroid/content/pm/PackageManager;->setComponentEnabledSetting(Landroid/content/ComponentName;II)V

    :cond_1
    return-void
.end method

.method public static N(Landroid/content/Context;)V
    .locals 3

    invoke-static {p0}, Lj/e;->u(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_2

    sget-boolean v0, Lj/e;->f:Z

    if-nez v0, :cond_1

    sget-object v0, Lj/e;->a:Lj/e$c;

    new-instance v1, Lj/d;

    invoke-direct {v1, p0}, Lj/d;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Lj/e$c;->execute(Ljava/lang/Runnable;)V

    :cond_1
    :goto_0
    return-void

    :cond_2
    sget-object v0, Lj/e;->i:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lj/e;->c:Lu2/j;

    if-nez v1, :cond_5

    sget-object v1, Lj/e;->d:Lu2/j;

    if-nez v1, :cond_3

    invoke-static {p0}, Lk2/e;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lu2/j;->b(Ljava/lang/String;)Lu2/j;

    move-result-object p0

    sput-object p0, Lj/e;->d:Lu2/j;

    goto :goto_1

    :catchall_0
    move-exception p0

    goto :goto_3

    :cond_3
    :goto_1
    sget-object p0, Lj/e;->d:Lu2/j;

    invoke-virtual {p0}, Lu2/j;->e()Z

    move-result p0

    if-eqz p0, :cond_4

    monitor-exit v0

    return-void

    :cond_4
    sget-object p0, Lj/e;->d:Lu2/j;

    sput-object p0, Lj/e;->c:Lu2/j;

    goto :goto_2

    :cond_5
    sget-object v2, Lj/e;->d:Lu2/j;

    invoke-virtual {v1, v2}, Lu2/j;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    sget-object v1, Lj/e;->c:Lu2/j;

    sput-object v1, Lj/e;->d:Lu2/j;

    invoke-virtual {v1}, Lu2/j;->g()Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v1}, Lk2/e;->a(Landroid/content/Context;Ljava/lang/String;)V

    :cond_6
    :goto_2
    monitor-exit v0

    return-void

    :goto_3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static synthetic c(Landroid/content/Context;)V
    .locals 0

    invoke-static {p0}, Lj/e;->M(Landroid/content/Context;)V

    const/4 p0, 0x1

    sput-boolean p0, Lj/e;->f:Z

    return-void
.end method

.method public static d(Lj/e;)V
    .locals 3
    .param p0    # Lj/e;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    sget-object v0, Lj/e;->h:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-static {p0}, Lj/e;->E(Lj/e;)V

    sget-object v1, Lj/e;->g:Lw1/b;

    new-instance v2, Ljava/lang/ref/WeakReference;

    invoke-direct {v2, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v1, v2}, Lw1/b;->add(Ljava/lang/Object;)Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static h(Landroid/app/Activity;Lj/c;)Lj/e;
    .locals 1
    .param p0    # Landroid/app/Activity;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lj/g;

    invoke-direct {v0, p0, p1}, Lj/g;-><init>(Landroid/app/Activity;Lj/c;)V

    return-object v0
.end method

.method public static i(Landroid/app/Dialog;Lj/c;)Lj/e;
    .locals 1
    .param p0    # Landroid/app/Dialog;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lj/g;

    invoke-direct {v0, p0, p1}, Lj/g;-><init>(Landroid/app/Dialog;Lj/c;)V

    return-object v0
.end method

.method public static k()Lu2/j;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_0

    invoke-static {}, Lj/e;->o()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0}, Lj/e$b;->a(Ljava/lang/Object;)Landroid/os/LocaleList;

    move-result-object v0

    invoke-static {v0}, Lu2/j;->h(Landroid/os/LocaleList;)Lu2/j;

    move-result-object v0

    return-object v0

    :cond_0
    sget-object v0, Lj/e;->c:Lu2/j;

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    invoke-static {}, Lu2/j;->d()Lu2/j;

    move-result-object v0

    return-object v0
.end method

.method public static m()I
    .locals 1

    sget v0, Lj/e;->b:I

    return v0
.end method

.method public static o()Ljava/lang/Object;
    .locals 2

    sget-object v0, Lj/e;->g:Lw1/b;

    invoke-virtual {v0}, Lw1/b;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lj/e;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lj/e;->l()Landroid/content/Context;

    move-result-object v1

    if-eqz v1, :cond_0

    const-string v0, "locale"

    invoke-virtual {v1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public static q()Lu2/j;
    .locals 1

    sget-object v0, Lj/e;->c:Lu2/j;

    return-object v0
.end method

.method public static u(Landroid/content/Context;)Z
    .locals 1

    sget-object v0, Lj/e;->e:Ljava/lang/Boolean;

    if-nez v0, :cond_0

    :try_start_0
    invoke-static {p0}, Lj/o;->a(Landroid/content/Context;)Landroid/content/pm/ServiceInfo;

    move-result-object p0

    iget-object p0, p0, Landroid/content/pm/ServiceInfo;->metaData:Landroid/os/Bundle;

    if-eqz p0, :cond_0

    const-string v0, "autoStoreLocales"

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    sput-object p0, Lj/e;->e:Ljava/lang/Boolean;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string p0, "AppCompatDelegate"

    const-string v0, "Checking for metadata for AppLocalesMetadataHolderService : Service not found"

    invoke-static {p0, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    sput-object p0, Lj/e;->e:Ljava/lang/Boolean;

    :cond_0
    :goto_0
    sget-object p0, Lj/e;->e:Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method


# virtual methods
.method public abstract A(Landroid/os/Bundle;)V
.end method

.method public abstract B()V
.end method

.method public abstract C()V
.end method

.method public abstract F(I)Z
.end method

.method public abstract G(I)V
.end method

.method public abstract H(Landroid/view/View;)V
.end method

.method public abstract I(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
.end method

.method public J(Landroid/window/OnBackInvokedDispatcher;)V
    .locals 0

    return-void
.end method

.method public K(I)V
    .locals 0

    return-void
.end method

.method public abstract L(Ljava/lang/CharSequence;)V
.end method

.method public abstract e(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
.end method

.method public f(Landroid/content/Context;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public g(Landroid/content/Context;)Landroid/content/Context;
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-virtual {p0, p1}, Lj/e;->f(Landroid/content/Context;)V

    return-object p1
.end method

.method public abstract j(I)Landroid/view/View;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/view/View;",
            ">(I)TT;"
        }
    .end annotation
.end method

.method public l()Landroid/content/Context;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public n()I
    .locals 1

    const/16 v0, -0x64

    return v0
.end method

.method public abstract p()Landroid/view/MenuInflater;
.end method

.method public abstract r()Lj/a;
.end method

.method public abstract s()V
.end method

.method public abstract t()V
.end method

.method public abstract v(Landroid/content/res/Configuration;)V
.end method

.method public abstract w(Landroid/os/Bundle;)V
.end method

.method public abstract x()V
.end method

.method public abstract y(Landroid/os/Bundle;)V
.end method

.method public abstract z()V
.end method
