.class public Lqi/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqi/b$b;,
        Lqi/b$c;
    }
.end annotation


# instance fields
.field public a:Lqi/f;

.field public b:Lqi/f;

.field public c:Ljava/util/Locale;

.field public d:Lqi/f;

.field public e:Ljava/lang/String;

.field public f:Lqi/b$c;

.field public g:Lqi/c;

.field public h:Lcom/roblox/universalapp/messagebus/Connection;

.field public i:Lqi/c$a;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lqi/b;->a:Lqi/f;

    iput-object v0, p0, Lqi/b;->b:Lqi/f;

    iput-object v0, p0, Lqi/b;->c:Ljava/util/Locale;

    iput-object v0, p0, Lqi/b;->d:Lqi/f;

    iput-object v0, p0, Lqi/b;->e:Ljava/lang/String;

    new-instance v0, Lqi/b$a;

    invoke-direct {v0, p0}, Lqi/b$a;-><init>(Lqi/b;)V

    iput-object v0, p0, Lqi/b;->i:Lqi/c$a;

    return-void
.end method

.method public static synthetic a(Lqi/b;Landroid/content/Context;Lorg/json/JSONObject;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lqi/b;->l(Landroid/content/Context;Lorg/json/JSONObject;)V

    return-void
.end method

.method public static b(Ljava/lang/String;)Ljava/util/Locale;
    .locals 3

    const-string v0, "_"

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/util/Locale;

    const/4 v1, 0x0

    aget-object v1, p0, v1

    const/4 v2, 0x1

    aget-object p0, p0, v2

    invoke-direct {v0, v1, p0}, Ljava/util/Locale;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/Locale;

    invoke-direct {v0, p0}, Ljava/util/Locale;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static f()Lqi/b;
    .locals 1

    invoke-static {}, Lqi/b$b;->a()Lqi/b;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final c()Lqi/f;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-virtual {p0}, Lqi/b;->e()Ljava/util/Locale;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_2

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "_"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_0
    invoke-static {v0}, Lqi/f;->a(Ljava/lang/String;)Lqi/f;

    move-result-object v0

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    sget-object v0, Lqi/f;->d:Lqi/f;

    return-object v0

    :cond_2
    sget-object v0, Lqi/f;->d:Lqi/f;

    return-object v0
.end method

.method public d(Landroid/content/Context;)Lqi/f;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lqi/b;->b:Lqi/f;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p0, p1}, Lqi/b;->h(Landroid/content/Context;)Lqi/c;

    move-result-object p1

    invoke-interface {p1}, Lqi/c;->b()Lqi/f;

    move-result-object p1

    if-nez p1, :cond_1

    invoke-virtual {p0}, Lqi/b;->c()Lqi/f;

    move-result-object p1

    :cond_1
    return-object p1
.end method

.method public e()Ljava/util/Locale;
    .locals 1

    iget-object v0, p0, Lqi/b;->c:Ljava/util/Locale;

    return-object v0
.end method

.method public g()Lqi/b$c;
    .locals 1

    iget-object v0, p0, Lqi/b;->f:Lqi/b$c;

    return-object v0
.end method

.method public final h(Landroid/content/Context;)Lqi/c;
    .locals 1

    iget-object v0, p0, Lqi/b;->g:Lqi/c;

    if-nez v0, :cond_0

    iget-object v0, p0, Lqi/b;->i:Lqi/c$a;

    invoke-interface {v0, p1}, Lqi/c$a;->a(Landroid/content/Context;)Lqi/c;

    move-result-object p1

    iput-object p1, p0, Lqi/b;->g:Lqi/c;

    :cond_0
    iget-object p1, p0, Lqi/b;->g:Lqi/c;

    return-object p1
.end method

.method public i(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lqi/b;->e:Ljava/lang/String;

    const-string v1, "rbx.locale"

    if-nez v0, :cond_1

    if-eqz p1, :cond_1

    const-string v2, "mUGCLocaleCode is Empty"

    invoke-static {v1, v2}, Lgk/q;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0, p1}, Lqi/b;->h(Landroid/content/Context;)Lqi/c;

    move-result-object p1

    invoke-interface {p1}, Lqi/c;->d()Lqi/f;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lqi/f;->d()Ljava/lang/String;

    move-result-object v0

    :cond_0
    if-nez v0, :cond_1

    const-string p1, "No stored value for mUGCLocaleCode. Use English"

    invoke-static {v1, p1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p1, Lqi/f;->d:Lqi/f;

    invoke-virtual {p1}, Lqi/f;->d()Ljava/lang/String;

    move-result-object v0

    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "mUGCLocaleCode value is: "

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lgk/q;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-object v0
.end method

.method public j()Lqi/f;
    .locals 1

    iget-object v0, p0, Lqi/b;->a:Lqi/f;

    return-object v0
.end method

.method public k(Lqi/f;)Z
    .locals 1

    iget-object v0, p0, Lqi/b;->a:Lqi/f;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final synthetic l(Landroid/content/Context;Lorg/json/JSONObject;)V
    .locals 4

    :try_start_0
    const-string v0, "localeId"

    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p2}, Lqi/f;->b(Ljava/lang/String;)Lqi/f;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {}, Lqi/b;->f()Lqi/b;

    move-result-object v1

    invoke-virtual {v1, v0}, Lqi/b;->k(Lqi/f;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "rbx.locale"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Receive new locale value from LUA "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lqi/f;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lqi/f;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0, v0, p1}, Lqi/b;->o(Lqi/f;Landroid/content/Context;)V

    invoke-virtual {p0, v0}, Lqi/b;->r(Lqi/f;)V

    invoke-virtual {p0, p1, p2}, Lqi/b;->t(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {p0, v0, p1}, Lqi/b;->n(Lqi/f;Landroid/content/Context;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    :goto_0
    return-void

    :catch_0
    const-string p1, "MessageBus"

    const-string p2, "Failed to get QR code image userId"

    invoke-static {p1, p2}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public m(Landroid/content/Context;)V
    .locals 2

    invoke-static {}, Lcom/roblox/universalapp/messagebus/MessageBus;->f()Lcom/roblox/universalapp/messagebus/MessageBus;

    move-result-object v0

    new-instance v1, Lqi/a;

    invoke-direct {v1, p0, p1}, Lqi/a;-><init>(Lqi/b;Landroid/content/Context;)V

    const-string p1, "Locale.RobloxLocaleIdChanged"

    invoke-virtual {v0, p1, v1}, Lcom/roblox/universalapp/messagebus/MessageBus;->t(Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;)Lcom/roblox/universalapp/messagebus/Connection;

    move-result-object p1

    iput-object p1, p0, Lqi/b;->h:Lcom/roblox/universalapp/messagebus/Connection;

    return-void
.end method

.method public n(Lqi/f;Landroid/content/Context;)Z
    .locals 2

    if-eqz p1, :cond_1

    invoke-virtual {p0, p1}, Lqi/b;->k(Lqi/f;)Z

    move-result v0

    xor-int/lit8 v1, v0, 0x1

    if-nez v0, :cond_0

    if-eqz p2, :cond_0

    invoke-virtual {p0, p2}, Lqi/b;->h(Landroid/content/Context;)Lqi/c;

    move-result-object v0

    invoke-interface {v0, p1}, Lqi/c;->e(Lqi/f;)V

    invoke-virtual {p0, p2, p1}, Lqi/b;->w(Landroid/content/Context;Lqi/f;)Landroid/content/Context;

    :cond_0
    return v1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public o(Lqi/f;Landroid/content/Context;)V
    .locals 0

    invoke-virtual {p0, p1}, Lqi/b;->p(Lqi/f;)V

    invoke-virtual {p0, p2}, Lqi/b;->h(Landroid/content/Context;)Lqi/c;

    move-result-object p1

    iget-object p2, p0, Lqi/b;->b:Lqi/f;

    invoke-interface {p1, p2}, Lqi/c;->c(Lqi/f;)V

    return-void
.end method

.method public p(Lqi/f;)V
    .locals 0

    iput-object p1, p0, Lqi/b;->b:Lqi/f;

    return-void
.end method

.method public q(Ljava/util/Locale;)V
    .locals 0

    iput-object p1, p0, Lqi/b;->c:Ljava/util/Locale;

    return-void
.end method

.method public r(Lqi/f;)V
    .locals 0

    iput-object p1, p0, Lqi/b;->d:Lqi/f;

    return-void
.end method

.method public s(Lqi/b$c;)V
    .locals 0

    iput-object p1, p0, Lqi/b;->f:Lqi/b$c;

    return-void
.end method

.method public t(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    iput-object p2, p0, Lqi/b;->e:Ljava/lang/String;

    invoke-virtual {p0, p1}, Lqi/b;->h(Landroid/content/Context;)Lqi/c;

    move-result-object p1

    iget-object p2, p0, Lqi/b;->e:Ljava/lang/String;

    invoke-interface {p1, p2}, Lqi/c;->a(Ljava/lang/String;)V

    return-void
.end method

.method public u(Landroid/content/Context;)V
    .locals 4

    iget-object v0, p0, Lqi/b;->a:Lqi/f;

    const-string v1, "rbx.locale"

    if-nez v0, :cond_0

    const-string v0, "mUserLocale is empty"

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0, p1}, Lqi/b;->h(Landroid/content/Context;)Lqi/c;

    move-result-object v0

    invoke-interface {v0}, Lqi/c;->f()Lqi/f;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "No stored value for mUserLocale."

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lqi/b;->c()Lqi/f;

    move-result-object v0

    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Updating App configuration based on locale = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0, p1, v0}, Lqi/b;->w(Landroid/content/Context;Lqi/f;)Landroid/content/Context;

    return-void
.end method

.method public final v(Landroid/content/Context;Ljava/lang/String;Landroid/content/res/Resources;Landroid/content/res/Configuration;)Landroid/content/Context;
    .locals 0

    invoke-static {p2}, Lqi/b;->b(Ljava/lang/String;)Ljava/util/Locale;

    move-result-object p2

    invoke-static {p2}, Ljava/util/Locale;->setDefault(Ljava/util/Locale;)V

    invoke-virtual {p4, p2}, Landroid/content/res/Configuration;->setLocale(Ljava/util/Locale;)V

    invoke-virtual {p4, p2}, Landroid/content/res/Configuration;->setLayoutDirection(Ljava/util/Locale;)V

    invoke-virtual {p3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p2

    invoke-virtual {p3, p4, p2}, Landroid/content/res/Resources;->updateConfiguration(Landroid/content/res/Configuration;Landroid/util/DisplayMetrics;)V

    invoke-virtual {p1, p4}, Landroid/content/Context;->createConfigurationContext(Landroid/content/res/Configuration;)Landroid/content/Context;

    move-result-object p1

    return-object p1
.end method

.method public final w(Landroid/content/Context;Lqi/f;)Landroid/content/Context;
    .locals 2

    iput-object p2, p0, Lqi/b;->a:Lqi/f;

    invoke-virtual {p2}, Lqi/f;->c()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    invoke-virtual {p0, p1, p2, v0, v1}, Lqi/b;->v(Landroid/content/Context;Ljava/lang/String;Landroid/content/res/Resources;Landroid/content/res/Configuration;)Landroid/content/Context;

    move-result-object p1

    return-object p1
.end method
