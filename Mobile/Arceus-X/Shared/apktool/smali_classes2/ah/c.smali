.class public Lah/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Lae/b;

.field public static final b:Lae/f;

.field public static final c:Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lah/a;

    invoke-direct {v0}, Lah/a;-><init>()V

    sput-object v0, Lah/c;->b:Lae/f;

    new-instance v0, Lah/b;

    invoke-direct {v0}, Lah/b;-><init>()V

    sput-object v0, Lah/c;->c:Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;

    return-void
.end method

.method public static synthetic a(Lae/e;)V
    .locals 5

    invoke-virtual {p0}, Lae/e;->i()I

    move-result v0

    const-string v1, "rbx.channel"

    packed-switch v0, :pswitch_data_0

    return-void

    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "sStatus: CANCELING for module "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lae/e;->f()Ljava/util/List;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    const-string p0, "Canceling"

    invoke-static {p0}, Lah/c;->g(Ljava/lang/String;)V

    return-void

    :pswitch_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "REQUIRES_USER_CONFIRMATION is unsupported "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lae/e;->f()Ljava/util/List;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    const-string p0, "Requires User Confirmation"

    invoke-static {p0}, Lah/c;->g(Ljava/lang/String;)V

    return-void

    :pswitch_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "sStatus: CANCELED for module "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lae/e;->f()Ljava/util/List;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    const-string p0, "Canceled"

    invoke-static {p0}, Lah/c;->g(Ljava/lang/String;)V

    return-void

    :pswitch_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "sStatus: Failed for module "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lae/e;->f()Ljava/util/List;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    const-string p0, "Failed"

    invoke-static {p0}, Lah/c;->g(Ljava/lang/String;)V

    return-void

    :pswitch_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Installed "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lae/e;->f()Ljava/util/List;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    const-string p0, "Installed"

    invoke-static {p0}, Lah/c;->g(Ljava/lang/String;)V

    invoke-static {}, Lcom/roblox/client/RobloxApplication;->f()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0}, Lcom/roblox/client/JNIAAssetManagerSetup;->a(Landroid/content/Context;)V

    return-void

    :pswitch_5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Installing "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lae/e;->f()Ljava/util/List;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    const-string p0, "Installing"

    invoke-static {p0}, Lah/c;->g(Ljava/lang/String;)V

    return-void

    :pswitch_6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "sStatus: DOWNLOADED for module "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lae/e;->f()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "Downloaded"

    invoke-static {v0}, Lah/c;->g(Ljava/lang/String;)V

    const-string v0, "end"

    invoke-virtual {p0}, Lae/e;->f()Ljava/util/List;

    move-result-object p0

    invoke-static {v0, p0}, Lah/c;->f(Ljava/lang/String;Ljava/util/List;)V

    return-void

    :pswitch_7
    invoke-virtual {p0}, Lae/e;->j()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    const-string v1, "Downloading "

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lae/e;->f()Ljava/util/List;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lgk/q;->g(Ljava/lang/String;)I

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lae/e;->f()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lae/e;->a()J

    move-result-wide v1

    const-wide/16 v3, 0x64

    mul-long/2addr v1, v3

    invoke-virtual {p0}, Lae/e;->j()J

    move-result-wide v3

    div-long/2addr v1, v3

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p0, "%"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lgk/q;->g(Ljava/lang/String;)I

    :goto_0
    const-string p0, "Downloading"

    invoke-static {p0}, Lah/c;->g(Ljava/lang/String;)V

    return-void

    :pswitch_8
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "sStatus: PENDING for module "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lae/e;->f()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "Pending"

    invoke-static {v0}, Lah/c;->g(Ljava/lang/String;)V

    const-string v0, "start"

    invoke-virtual {p0}, Lae/e;->f()Ljava/util/List;

    move-result-object p0

    invoke-static {v0, p0}, Lah/c;->f(Ljava/lang/String;Ljava/util/List;)V

    return-void

    :pswitch_9
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "sStatus: UNKNOWN for module "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lae/e;->f()Ljava/util/List;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    const-string p0, "Unknown"

    invoke-static {p0}, Lah/c;->g(Ljava/lang/String;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static synthetic b(Landroid/content/SharedPreferences;Ljava/lang/String;)V
    .locals 6

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const-string v1, "moduleName"

    const-string v2, "engine"

    const-string v3, "supportsAndroidBinaries"

    const/4 v4, -0x1

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    goto :goto_0

    :sswitch_1
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v4, 0x1

    goto :goto_0

    :sswitch_2
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v4, 0x0

    :goto_0
    const-string v0, "rbx.channel"

    const-string v5, ""

    packed-switch v4, :pswitch_data_0

    const-string v0, "channel"

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_1

    :cond_3
    invoke-interface {p0, v0, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_4

    goto :goto_1

    :cond_4
    const-string p1, "zgooglebinary"

    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_5

    goto :goto_1

    :cond_5
    sget-object p1, Lah/c;->a:Lae/b;

    invoke-interface {p1}, Lae/b;->e()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    invoke-static {}, Lae/d;->c()Lae/d$a;

    move-result-object p1

    invoke-virtual {p1, p0}, Lae/d$a;->a(Ljava/lang/String;)Lae/d$a;

    move-result-object p0

    invoke-virtual {p0}, Lae/d$a;->b()Lae/d;

    move-result-object p0

    sget-object p1, Lah/c;->a:Lae/b;

    invoke-interface {p1, p0}, Lae/b;->a(Lae/d;)Lcom/google/android/gms/tasks/Task;

    return-void

    :pswitch_0
    invoke-interface {p0, v1, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_6

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ABC module name is "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {p0}, Lah/c;->d(Ljava/lang/String;)V

    :cond_6
    :goto_1
    return-void

    :pswitch_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Engine library name is "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p0, v2, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :pswitch_2
    invoke-interface {p0, v3, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Supports ABC is "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "true"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :sswitch_data_0
    .sparse-switch
        -0x617bff36 -> :sswitch_2
        -0x4d6805be -> :sswitch_1
        -0x33e080e9 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static c(Landroid/content/Context;)V
    .locals 2

    invoke-static {p0}, Lae/c;->a(Landroid/content/Context;)Lae/b;

    move-result-object v0

    sput-object v0, Lah/c;->a:Lae/b;

    sget-object v1, Lah/c;->b:Lae/f;

    invoke-interface {v0, v1}, Lae/b;->c(Lae/f;)V

    invoke-static {p0}, Lsg/a1;->U(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p0

    if-eqz p0, :cond_0

    sget-object v0, Lah/c;->c:Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;

    invoke-interface {p0, v0}, Landroid/content/SharedPreferences;->registerOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    :cond_0
    return-void
.end method

.method public static d(Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lah/c;->a:Lae/b;

    invoke-interface {v0}, Lae/b;->e()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lae/d;->c()Lae/d$a;

    move-result-object v0

    invoke-virtual {v0, p0}, Lae/d$a;->a(Ljava/lang/String;)Lae/d$a;

    move-result-object p0

    invoke-virtual {p0}, Lae/d$a;->b()Lae/d;

    move-result-object p0

    sget-object v0, Lah/c;->a:Lae/b;

    invoke-interface {v0, p0}, Lae/b;->a(Lae/d;)Lcom/google/android/gms/tasks/Task;

    :cond_0
    return-void
.end method

.method public static e(Ljava/lang/String;)Z
    .locals 4

    sget-object v0, Lah/c;->a:Lae/b;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->p3()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, Lsg/a1;->Y()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_1

    return v1

    :cond_1
    sget-object p0, Lah/c;->a:Lae/b;

    invoke-interface {p0}, Lae/b;->e()Ljava/util/Set;

    move-result-object p0

    invoke-static {}, Lsg/a1;->J()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    const-string v3, "rbx.channel"

    if-eqz v2, :cond_2

    const-string p0, "ABC module name is empty"

    invoke-static {v3, p0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    return v1

    :cond_2
    invoke-interface {p0, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "waiting for download: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    return p0

    :cond_3
    const-string v0, "zgooglebinary"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    return v1

    :cond_4
    sget-object v0, Lah/c;->a:Lae/b;

    invoke-interface {v0}, Lae/b;->e()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public static f(Ljava/lang/String;Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->s1()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const-string v1, "Points"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string v1, "EventIngest"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    new-instance v2, Landroid/util/Pair;

    const-string v3, "fingerprint"

    sget-object v4, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    invoke-direct {v2, v3, v4}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v2, Landroid/util/Pair;

    const-string v3, "phase"

    invoke-direct {v2, v3, p0}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p0, Landroid/util/Pair;

    const-string v2, ","

    invoke-static {v2, p1}, Ljava/lang/String;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object p1

    const-string v2, "module_names"

    invoke-direct {p0, v2, p1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p0, Landroid/util/Pair;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p1

    const-string v2, "elapsed_realtime_ms"

    invoke-direct {p0, v2, p1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    const-string p1, "addOSInfo"

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent;->builder()Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent$Builder;

    move-result-object p1

    const-string v2, "RobloxTelemetry"

    invoke-virtual {p1, v2}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent$Builder;->setEventType(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent$Builder;

    move-result-object p1

    invoke-static {}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig;->builder()Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig$Builder;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig$Builder;->setBackEnds(Ljava/util/List;)Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig$Builder;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig$Builder;->setThrottlingHundredthPercentage(I)Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig$Builder;

    move-result-object v0

    const-string v2, "android_binary_channel_download_timing"

    invoke-virtual {v0, v2}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig$Builder;->setEventName(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig$Builder;->build()Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent$Builder;->setConfig(Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig;)Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent$Builder;

    move-result-object p1

    invoke-static {}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData;->builder()Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData$Builder;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData$Builder;->setStandardizedFields(Ljava/util/List;)Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData$Builder;

    move-result-object p0

    invoke-virtual {p0, v1}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData$Builder;->setCustomStringFields(Ljava/util/List;)Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData$Builder;

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

.method public static g(Ljava/lang/String;)V
    .locals 5

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->Y5()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const-string v1, "Points"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    new-instance v2, Landroid/util/Pair;

    const-string v3, "fingerprint"

    sget-object v4, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    invoke-direct {v2, v3, v4}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v2, Landroid/util/Pair;

    const-string v3, "lib_status"

    invoke-direct {v2, v3, p0}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    const-string v2, "addOSInfo"

    invoke-interface {p0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent;->builder()Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent$Builder;

    move-result-object v2

    const-string v3, "RobloxTelemetry"

    invoke-virtual {v2, v3}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent$Builder;->setEventType(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent$Builder;

    move-result-object v2

    invoke-static {}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig;->builder()Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig$Builder;

    move-result-object v3

    invoke-virtual {v3, v0}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig$Builder;->setBackEnds(Ljava/util/List;)Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig$Builder;

    move-result-object v0

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v3

    invoke-interface {v3}, Lth/i;->I()I

    move-result v3

    invoke-virtual {v0, v3}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig$Builder;->setThrottlingHundredthPercentage(I)Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig$Builder;

    move-result-object v0

    const-string v3, "android_binary_channel_gp"

    invoke-virtual {v0, v3}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig$Builder;->setEventName(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig$Builder;->build()Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent$Builder;->setConfig(Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig;)Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent$Builder;

    move-result-object v0

    invoke-static {}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData;->builder()Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData$Builder;

    move-result-object v2

    invoke-virtual {v2, p0}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData$Builder;->setStandardizedFields(Ljava/util/List;)Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData$Builder;

    move-result-object p0

    invoke-virtual {p0, v1}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData$Builder;->setCustomStringFields(Ljava/util/List;)Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData$Builder;

    move-result-object p0

    invoke-virtual {p0}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData$Builder;->build()Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent$Builder;->setData(Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData;)Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent$Builder;

    move-result-object p0

    invoke-virtual {p0}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent$Builder;->build()Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent;

    move-result-object p0

    invoke-static {p0}, Lcom/roblox/universalapp/logging/LoggingProtocol;->j(Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent;)V

    :cond_0
    return-void
.end method

.method public static h(Landroid/content/Context;)V
    .locals 5

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->p3()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {}, Lsg/a1;->Y()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {}, Lsg/a1;->J()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lsg/a1;->W()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    const-string v2, "rbx.channel"

    if-eqz v1, :cond_1

    invoke-static {v0}, Lg0/p0;->a(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Uninstalling "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v0, Lah/c;->a:Lae/b;

    invoke-interface {v0, v1}, Lae/b;->d(Ljava/util/List;)Lcom/google/android/gms/tasks/Task;

    invoke-static {p0}, Lsg/a1;->s(Landroid/content/Context;)V

    return-void

    :cond_1
    sget-object p0, Lah/c;->a:Lae/b;

    invoke-interface {p0}, Lae/b;->e()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_3

    invoke-static {}, Lsg/a1;->I()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Setting library name to "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {p0}, Lcom/roblox/client/startup/a;->C(Ljava/lang/String;)V

    return-void

    :cond_2
    const-string p0, "ABC library name is empty!"

    invoke-static {v2, p0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_3
    invoke-static {v0}, Lah/c;->d(Ljava/lang/String;)V

    return-void

    :cond_4
    invoke-static {}, Lsg/a1;->W()Ljava/lang/String;

    move-result-object p0

    sget-object v0, Lah/c;->a:Lae/b;

    invoke-interface {v0}, Lae/b;->e()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-static {p0}, Lcom/roblox/client/startup/a;->C(Ljava/lang/String;)V

    :cond_5
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {}, Lsg/a1;->W()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_6
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_6

    const-string v3, "zgooglebinary"

    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {p0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_7
    sget-object v0, Lah/c;->a:Lae/b;

    invoke-interface {v0, p0}, Lae/b;->d(Ljava/util/List;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method
