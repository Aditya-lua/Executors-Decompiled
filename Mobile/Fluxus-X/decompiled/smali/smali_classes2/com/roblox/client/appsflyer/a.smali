.class public Lcom/roblox/client/appsflyer/a;
.super Ldj/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/client/appsflyer/a$e;,
        Lcom/roblox/client/appsflyer/a$d;
    }
.end annotation


# static fields
.field public static final o:Ljava/util/regex/Pattern;


# instance fields
.field public b:Landroid/content/Context;

.field public c:Z

.field public final d:Ljava/lang/Object;

.field public e:Z

.field public f:Z

.field public g:Z

.field public h:Z

.field public i:Z

.field public j:Z

.field public final k:Ljava/lang/Object;

.field public volatile l:Z

.field public m:Z

.field public n:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "[A-Za-z0-9_-]+"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/roblox/client/appsflyer/a;->o:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ldj/d;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roblox/client/appsflyer/a;->c:Z

    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Lcom/roblox/client/appsflyer/a;->d:Ljava/lang/Object;

    iput-boolean v0, p0, Lcom/roblox/client/appsflyer/a;->e:Z

    iput-boolean v0, p0, Lcom/roblox/client/appsflyer/a;->f:Z

    iput-boolean v0, p0, Lcom/roblox/client/appsflyer/a;->g:Z

    iput-boolean v0, p0, Lcom/roblox/client/appsflyer/a;->h:Z

    iput-boolean v0, p0, Lcom/roblox/client/appsflyer/a;->i:Z

    iput-boolean v0, p0, Lcom/roblox/client/appsflyer/a;->j:Z

    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Lcom/roblox/client/appsflyer/a;->k:Ljava/lang/Object;

    iput-boolean v0, p0, Lcom/roblox/client/appsflyer/a;->l:Z

    iput-boolean v0, p0, Lcom/roblox/client/appsflyer/a;->m:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roblox/client/appsflyer/a;->n:Ljava/lang/String;

    const-string v0, "AppsFlyerManager"

    const-string v1, "[AppsFlyerManager]: Constructor called."

    invoke-static {v0, v1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public static C(Lorg/json/JSONObject;)Ljava/lang/Boolean;
    .locals 2

    if-eqz p0, :cond_1

    const-string v0, "consented"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static F()Lmv/f0;
    .locals 2

    new-instance v0, Lmv/f0$a;

    invoke-direct {v0}, Lmv/f0$a;-><init>()V

    invoke-static {}, Lbh/a1;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lmv/f0$a;->t(Ljava/lang/String;)Lmv/f0$a;

    move-result-object v0

    invoke-virtual {v0}, Lmv/f0$a;->e()Lmv/f0$a;

    move-result-object v0

    invoke-virtual {v0}, Lmv/f0$a;->b()Lmv/f0;

    move-result-object v0

    return-object v0
.end method

.method public static H0(Landroid/content/Context;Ljava/lang/String;J)V
    .locals 0

    invoke-static {p0}, Lcom/roblox/client/appsflyer/a;->Q(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p0

    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    invoke-interface {p0, p1, p2, p3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public static J0(Ljava/util/Map;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    const-string v0, "af_ad"

    invoke-static {p0, v0}, Lcom/roblox/client/appsflyer/a;->O0(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0}, Lcom/roblox/client/appsflyer/a;->W0(Ljava/util/Map;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "adgroup"

    invoke-static {p0, v1}, Lcom/roblox/client/appsflyer/a;->O0(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    filled-new-array {v0, p0}, [Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/roblox/client/appsflyer/a;->M([Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    return-object v0
.end method

.method public static K0(Ljava/util/Map;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    const-string v0, "af_adset"

    invoke-static {p0, v0}, Lcom/roblox/client/appsflyer/a;->O0(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "adset"

    invoke-static {p0, v1}, Lcom/roblox/client/appsflyer/a;->O0(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    filled-new-array {v0, p0}, [Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/roblox/client/appsflyer/a;->M([Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static L0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    filled-new-array {p0, p1, p2, p3}, [Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/roblox/client/appsflyer/a;->M([Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static varargs M([Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    array-length v0, p0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    aget-object v2, p0, v1

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_0

    return-object v2

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static M0(Ljava/util/Map;)Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    const-string v0, "af_ad"

    invoke-static {p0, v0}, Lcom/roblox/client/appsflyer/a;->U0(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "af_adset"

    invoke-static {p0, v1}, Lcom/roblox/client/appsflyer/a;->U0(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "adgroup"

    invoke-static {p0, v2}, Lcom/roblox/client/appsflyer/a;->U0(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "adset"

    invoke-static {p0, v3}, Lcom/roblox/client/appsflyer/a;->U0(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, v1, v2, p0}, Lcom/roblox/client/appsflyer/a;->L0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static N0(Ljava/util/Map;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    const-string v0, "af_c_id"

    invoke-static {p0, v0}, Lcom/roblox/client/appsflyer/a;->O0(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "campaign_id"

    invoke-static {p0, v1}, Lcom/roblox/client/appsflyer/a;->O0(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    filled-new-array {v0, p0}, [Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/roblox/client/appsflyer/a;->M([Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static O()Lcom/roblox/client/appsflyer/a;
    .locals 1

    invoke-static {}, Lcom/roblox/client/appsflyer/a$e;->a()Lcom/roblox/client/appsflyer/a;

    move-result-object v0

    return-object v0
.end method

.method public static O0(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-static {p0}, Lok/b0;->c(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static P(Landroid/content/Context;Ljava/lang/String;J)J
    .locals 0

    invoke-static {p0}, Lcom/roblox/client/appsflyer/a;->Q(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p0

    invoke-interface {p0, p1, p2, p3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static Q(Landroid/content/Context;)Landroid/content/SharedPreferences;
    .locals 2

    const-string v0, "APPS_FLYER_SHARED_PREFS"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0

    return-object p0
.end method

.method public static R(J)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "signupReportedTimeInSeconds_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static U0(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    instance-of p1, p0, Ljava/lang/String;

    if-eqz p1, :cond_0

    check-cast p0, Ljava/lang/String;

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static V0(Ljava/lang/Object;)Ljava/lang/String;
    .locals 5

    const-string v0, "UTC"

    if-nez p0, :cond_0

    const-string p0, ""

    return-object p0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    :try_start_0
    new-instance v1, Ljava/text/SimpleDateFormat;

    const-string v2, "yyyy-MM-dd HH:mm:ss.SSS"

    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v1, v2, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    invoke-static {v0}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    new-instance v2, Ljava/text/SimpleDateFormat;

    const-string v4, "yyyy-MM-dd\'T\'HH:mm:ss\'Z\'"

    invoke-direct {v2, v4, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    invoke-static {v0}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    invoke-virtual {v1, p0}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-object p0
.end method

.method public static W0(Ljava/util/Map;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    const-string v0, "af_ad"

    invoke-interface {p0, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "af_adset"

    invoke-interface {p0, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static X(JJJ)Z
    .locals 2

    const-wide/16 v0, 0x0

    cmp-long v0, p0, v0

    if-eqz v0, :cond_0

    sub-long/2addr p2, p0

    cmp-long p0, p2, p4

    if-gtz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static h0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    if-eqz p0, :cond_6

    if-eqz p1, :cond_6

    const-string v0, "://navigation/crossdevice"

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_6

    sget-object v0, Lcom/roblox/client/appsflyer/a;->o:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v0, 0x23

    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    if-ltz v0, :cond_0

    goto :goto_2

    :cond_0
    const/16 v0, 0x3f

    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    const-string v1, ""

    if-gez v0, :cond_1

    move-object v2, v1

    goto :goto_0

    :cond_1
    add-int/lit8 v2, v0, 0x1

    invoke-virtual {p0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    :goto_0
    const-string v3, "code="

    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_6

    const-string v4, "&code="

    invoke-virtual {v2, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_2

    :cond_2
    if-gez v0, :cond_3

    const-string v1, "?"

    goto :goto_1

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    const-string v0, "&"

    invoke-virtual {v2, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_1

    :cond_4
    move-object v1, v0

    :cond_5
    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    :cond_6
    :goto_2
    return-object p0
.end method

.method public static synthetic j(Lcom/roblox/client/appsflyer/a;Z)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->d0(Z)V

    return-void
.end method

.method public static j0()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "yyyy-MM-dd\'T\'HH:mm:ss\'Z\'"

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    const-string v1, "UTC"

    invoke-static {v1}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic k(Lcom/roblox/client/appsflyer/a;)Z
    .locals 0

    invoke-virtual {p0}, Lcom/roblox/client/appsflyer/a;->c0()Z

    move-result p0

    return p0
.end method

.method public static bridge synthetic l(Lcom/roblox/client/appsflyer/a;Landroid/content/Context;Lcom/roblox/client/appsflyer/a$d;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/roblox/client/appsflyer/a;->m0(Landroid/content/Context;Lcom/roblox/client/appsflyer/a$d;)V

    return-void
.end method

.method public static bridge synthetic m(Lmv/h0;)Lcom/roblox/client/appsflyer/a$d;
    .locals 0

    invoke-static {p0}, Lcom/roblox/client/appsflyer/a;->w0(Lmv/h0;)Lcom/roblox/client/appsflyer/a$d;

    move-result-object p0

    return-object p0
.end method

.method public static o(ZLjava/lang/Boolean;)Z
    .locals 0

    if-nez p0, :cond_1

    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static o0(Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 2

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    return-object v0
.end method

.method public static p0(Ljava/lang/String;Z)Lcom/roblox/client/appsflyer/a$d;
    .locals 4

    const-string v0, "isAttributionBlocked"

    const/4 v1, 0x0

    if-eqz p0, :cond_4

    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string p0, "isAdConsentRequired"

    invoke-virtual {v2, p0}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    instance-of v3, p0, Ljava/lang/Boolean;

    if-nez v3, :cond_1

    return-object v1

    :cond_1
    if-eqz p1, :cond_3

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Ljava/lang/Boolean;

    if-nez v0, :cond_2

    return-object v1

    :cond_2
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    goto :goto_0

    :cond_3
    const/4 p1, 0x0

    :goto_0
    new-instance v0, Lcom/roblox/client/appsflyer/a$d;

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    invoke-direct {v0, p0, p1}, Lcom/roblox/client/appsflyer/a$d;-><init>(ZZ)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    :cond_4
    :goto_1
    return-object v1
.end method

.method public static u0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    const/16 v1, 0x3f

    invoke-virtual {p0, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    if-gez v1, :cond_1

    return-object v0

    :cond_1
    const/16 v2, 0x23

    invoke-virtual {p0, v2, v1}, Ljava/lang/String;->indexOf(II)I

    move-result v2

    add-int/lit8 v1, v1, 0x1

    if-gez v2, :cond_2

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    :cond_2
    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    const-string v1, "&"

    invoke-virtual {p0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    array-length v1, p0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_4

    aget-object v4, p0, v3

    const/16 v5, 0x3d

    invoke-virtual {v4, v5}, Ljava/lang/String;->indexOf(I)I

    move-result v5

    if-lez v5, :cond_3

    invoke-virtual {v4, v2, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    add-int/lit8 v5, v5, 0x1

    :try_start_0
    invoke-virtual {v4, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    const-string p1, "UTF-8"

    invoke-static {p0, p1}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    return-object v0

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_4
    return-object v0
.end method

.method public static w0(Lmv/h0;)Lcom/roblox/client/appsflyer/a$d;
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0}, Lmv/h0;->b()Lmv/i0;

    move-result-object v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    invoke-virtual {p0}, Lmv/h0;->isSuccessful()Z

    move-result p0

    if-eqz p0, :cond_0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lmv/i0;->h()Ljava/lang/String;

    move-result-object p0

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v2

    invoke-interface {v2}, Lbi/i;->K1()Z

    move-result v2

    invoke-static {p0, v2}, Lcom/roblox/client/appsflyer/a;->p0(Ljava/lang/String;Z)Lcom/roblox/client/appsflyer/a$d;

    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {v1}, Lmv/i0;->close()V

    return-object p0

    :catchall_0
    move-exception p0

    goto :goto_0

    :cond_0
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lmv/i0;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    :cond_1
    return-object v0

    :goto_0
    if-eqz v1, :cond_2

    :try_start_3
    invoke-virtual {v1}, Lmv/i0;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v1

    :try_start_4
    invoke-virtual {p0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_2
    :goto_1
    throw p0
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    return-object v0
.end method


# virtual methods
.method public final A(Landroid/content/Context;)V
    .locals 2

    iget-object v0, p0, Lcom/roblox/client/appsflyer/a;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-static {p1}, Lcom/roblox/client/appsflyer/a;->Q(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    const-string v1, "delayedStartConsentTs"

    invoke-interface {p1, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    const-string v1, "delayedStartConsentApplySharingFilter"

    invoke-interface {p1, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    const-string v1, "delayedStartConsentDma"

    invoke-interface {p1, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final A0(Ljava/lang/String;)V
    .locals 3

    new-instance v0, Lfn/c$a;

    sget-object v1, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;->COUNTER:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;

    invoke-static {v1}, Lyf/k;->a(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Lfn/c$a;-><init>(Ljava/lang/String;Ljava/util/Set;)V

    const/4 p1, 0x7

    const/16 v1, 0x1e

    const/16 v2, 0x7ea

    invoke-virtual {v0, v2, p1, v1}, Lfn/c$a;->j(III)Lfn/c$a;

    move-result-object p1

    invoke-virtual {p1}, Lfn/c$a;->d()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;

    move-result-object p1

    invoke-static {p1}, Lfn/c;->b(Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;)Z

    return-void
.end method

.method public final B()J
    .locals 4

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->F4()I

    move-result v0

    int-to-long v0, v0

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    return-wide v0
.end method

.method public final B0(Ljava/lang/String;)V
    .locals 1

    invoke-static {}, Ldj/g;->b()Ldj/g;

    move-result-object v0

    invoke-virtual {v0, p1}, Ldj/g;->q(Ljava/lang/String;)V

    return-void
.end method

.method public final C0(Ljava/lang/String;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/roblox/client/datastructures/NameValuePair;",
            ">;)V"
        }
    .end annotation

    const-string v0, "appsFlyer"

    invoke-static {p1, v0, p2}, Lbh/t0;->i(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method

.method public final D(Ljava/lang/String;)V
    .locals 1

    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    move-result-object v0

    invoke-virtual {v0}, Lcom/appsflyer/AppsFlyerLib;->start()V

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->A0(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p0}, Lcom/roblox/client/appsflyer/a;->q0()V

    return-void
.end method

.method public final D0()Lcom/roblox/client/appsflyer/a$d;
    .locals 2

    :try_start_0
    invoke-static {}, Lmi/k;->a()Lmi/k;

    move-result-object v0

    invoke-virtual {v0}, Lmi/k;->b()Lmv/d0;

    move-result-object v0

    invoke-static {}, Lcom/roblox/client/appsflyer/a;->F()Lmv/f0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lmv/d0;->a(Lmv/f0;)Lmv/e;

    move-result-object v0

    invoke-interface {v0}, Lmv/e;->j()Lmv/h0;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    invoke-static {v0}, Lcom/roblox/client/appsflyer/a;->w0(Lmv/h0;)Lcom/roblox/client/appsflyer/a$d;

    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v0, :cond_0

    :try_start_2
    invoke-virtual {v0}, Lmv/h0;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    :cond_0
    return-object v1

    :catchall_0
    move-exception v1

    if-eqz v0, :cond_1

    :try_start_3
    invoke-virtual {v0}, Lmv/h0;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    :try_start_4
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    throw v1
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final E(Landroid/content/Context;)V
    .locals 2

    const-string v0, "enableTracking"

    const/4 v1, 0x1

    invoke-virtual {p0, p1, v0, v1}, Lcom/roblox/client/appsflyer/a;->G0(Landroid/content/Context;Ljava/lang/String;Z)V

    invoke-virtual {p0, v1}, Lcom/roblox/client/appsflyer/a;->U(Z)V

    return-void
.end method

.method public final E0(Landroid/content/Context;)V
    .locals 4

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->K1()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/roblox/client/appsflyer/a;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->v0(Landroid/content/Context;)Lcom/roblox/client/appsflyer/a$d;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lcom/roblox/client/appsflyer/a$d;->a()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->e0(Landroid/content/Context;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    const/4 v3, 0x0

    iput-boolean v3, p0, Lcom/roblox/client/appsflyer/a;->e:Z

    iget-boolean v3, v2, Lcom/roblox/client/appsflyer/a$d;->b:Z

    if-eqz v3, :cond_1

    iput-boolean v1, p0, Lcom/roblox/client/appsflyer/a;->f:Z

    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_2

    const-string v0, "Android-AppsFlyer-Eligibility-CacheHit"

    invoke-virtual {p0, v0}, Lcom/roblox/client/appsflyer/a;->A0(Ljava/lang/String;)V

    invoke-virtual {p0, p1, v2}, Lcom/roblox/client/appsflyer/a;->r(Landroid/content/Context;Lcom/roblox/client/appsflyer/a$d;)V

    return-void

    :cond_2
    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->I(Landroid/content/Context;)V

    return-void

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_3
    iget-object v0, p0, Lcom/roblox/client/appsflyer/a;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_2
    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->v0(Landroid/content/Context;)Lcom/roblox/client/appsflyer/a$d;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Lcom/roblox/client/appsflyer/a$d;->a()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->e0(Landroid/content/Context;)V

    goto :goto_2

    :catchall_1
    move-exception p1

    goto :goto_3

    :cond_4
    :goto_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-eqz v2, :cond_5

    const-string v0, "Android-AppsFlyer-Eligibility-CacheHit"

    invoke-virtual {p0, v0}, Lcom/roblox/client/appsflyer/a;->A0(Ljava/lang/String;)V

    iget-boolean v0, v2, Lcom/roblox/client/appsflyer/a$d;->a:Z

    invoke-virtual {p0, p1, v0, v1}, Lcom/roblox/client/appsflyer/a;->s(Landroid/content/Context;ZZ)V

    return-void

    :cond_5
    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->I(Landroid/content/Context;)V

    return-void

    :goto_3
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw p1
.end method

.method public final F0()V
    .locals 6

    iget-object v0, p0, Ldj/d;->a:Landroid/content/Intent;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/roblox/client/appsflyer/a;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lcom/roblox/client/appsflyer/a;->h:Z

    if-eqz v1, :cond_1

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    goto/16 :goto_2

    :cond_1
    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/roblox/client/appsflyer/a;->h:Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Ldj/d;->a:Landroid/content/Intent;

    invoke-virtual {v0}, Landroid/content/Intent;->getDataString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "deep_link_value"

    invoke-static {v0, v1}, Lcom/roblox/client/appsflyer/a;->u0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "af_dp"

    invoke-static {v0, v2}, Lcom/roblox/client/appsflyer/a;->u0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/roblox/client/appsflyer/a;->M([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_2

    :goto_0
    return-void

    :cond_2
    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v2

    invoke-interface {v2}, Lbi/i;->u2()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v2

    invoke-interface {v2}, Lbi/i;->Y5()Z

    move-result v2

    if-eqz v2, :cond_3

    const-string v2, "code"

    invoke-static {v0, v2}, Lcom/roblox/client/appsflyer/a;->u0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/roblox/client/appsflyer/a;->h0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :cond_3
    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v2

    invoke-interface {v2}, Lbi/i;->g1()Z

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    if-eqz v2, :cond_4

    invoke-static {}, Lym/g;->G()Lym/g;

    move-result-object v2

    const-string v5, "android_appsflyer_udl"

    invoke-virtual {v2, v1, v5, v3}, Lym/g;->j(Ljava/lang/String;Ljava/lang/String;Z)Lorg/json/JSONObject;

    move-result-object v2

    goto :goto_1

    :cond_4
    invoke-static {}, Lym/g;->G()Lym/g;

    move-result-object v2

    const-string v5, "android_appsflyer_udl"

    invoke-virtual {v2, v1, v5, v3}, Lym/g;->h(Ljava/lang/String;Ljava/lang/String;Z)V

    move-object v2, v4

    :goto_1
    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v3

    invoke-interface {v3}, Lbi/i;->Y5()Z

    move-result v3

    if-eqz v3, :cond_5

    const-string v3, "code"

    invoke-static {v0, v3}, Lcom/roblox/client/appsflyer/a;->u0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/roblox/client/appsflyer/a;->h0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v2, :cond_5

    invoke-static {}, Lym/g;->G()Lym/g;

    move-result-object v0

    invoke-virtual {v0, v2, v1}, Lym/g;->L(Lorg/json/JSONObject;Ljava/lang/String;)V

    :cond_5
    invoke-static {}, Lym/g;->G()Lym/g;

    move-result-object v0

    invoke-virtual {v0, v1, v4, v4}, Lym/g;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :goto_2
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final G()J
    .locals 4

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->S5()I

    move-result v0

    int-to-long v0, v0

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    return-wide v0
.end method

.method public final G0(Landroid/content/Context;Ljava/lang/String;Z)V
    .locals 0

    invoke-static {p1}, Lcom/roblox/client/appsflyer/a;->Q(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1, p2, p3}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public final H()V
    .locals 2

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->D5()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lnk/c;->c()Lnk/c;

    move-result-object v0

    invoke-virtual {v0}, Lnk/c;->n()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/appsflyer/AppsFlyerLib;->setDisableAdvertisingIdentifiers(Z)V

    :cond_0
    return-void
.end method

.method public final I(Landroid/content/Context;)V
    .locals 2

    invoke-static {}, Lmi/k;->a()Lmi/k;

    move-result-object v0

    invoke-virtual {v0}, Lmi/k;->b()Lmv/d0;

    move-result-object v0

    invoke-static {}, Lcom/roblox/client/appsflyer/a;->F()Lmv/f0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lmv/d0;->a(Lmv/f0;)Lmv/e;

    move-result-object v0

    new-instance v1, Lcom/roblox/client/appsflyer/a$c;

    invoke-direct {v1, p0, p1}, Lcom/roblox/client/appsflyer/a$c;-><init>(Lcom/roblox/client/appsflyer/a;Landroid/content/Context;)V

    invoke-interface {v0, v1}, Lmv/e;->b0(Lmv/f;)V

    return-void
.end method

.method public final I0(Landroid/content/Context;J)V
    .locals 2

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long/2addr p2, v0

    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-gtz v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->J(Landroid/content/Context;)V

    return-void

    :cond_0
    sget-object v0, Lcom/roblox/client/appsflyer/ConsentBackstopWorker;->a:Lcom/roblox/client/appsflyer/ConsentBackstopWorker$a;

    invoke-virtual {v0, p1, p2, p3}, Lcom/roblox/client/appsflyer/ConsentBackstopWorker$a;->b(Landroid/content/Context;J)V

    return-void
.end method

.method public J(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/roblox/client/appsflyer/a;->T0(Landroid/content/Context;Ljava/lang/Boolean;)V

    return-void
.end method

.method public K()V
    .locals 4

    iget-object v0, p0, Lcom/roblox/client/appsflyer/a;->b:Landroid/content/Context;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/roblox/client/appsflyer/a;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lcom/roblox/client/appsflyer/a;->c:Z

    if-eqz v1, :cond_1

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lcom/roblox/client/appsflyer/a;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/roblox/client/appsflyer/a;->Q(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "delayedStartBackstopDeadline"

    const-wide/16 v2, 0x0

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    cmp-long v2, v0, v2

    if-eqz v2, :cond_2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    cmp-long v0, v2, v0

    if-ltz v0, :cond_2

    iget-object v0, p0, Lcom/roblox/client/appsflyer/a;->b:Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/roblox/client/appsflyer/a;->L(Landroid/content/Context;)V

    :cond_2
    :goto_0
    return-void

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public L(Landroid/content/Context;)V
    .locals 5

    iget-object v0, p0, Lcom/roblox/client/appsflyer/a;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lcom/roblox/client/appsflyer/a;->c:Z

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_4

    :cond_0
    invoke-static {p1}, Lcom/roblox/client/appsflyer/a;->Q(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    const-string v2, "delayedStartBackstopEligibilityResolved"

    const/4 v3, 0x1

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_6

    const-string v0, "Android-AppsFlyer-Eligibility-Recheck-Attempted"

    invoke-virtual {p0, v0}, Lcom/roblox/client/appsflyer/a;->A0(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/roblox/client/appsflyer/a;->D0()Lcom/roblox/client/appsflyer/a$d;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v1, p0, Lcom/roblox/client/appsflyer/a;->d:Ljava/lang/Object;

    monitor-enter v1

    :try_start_1
    iget-boolean v2, p0, Lcom/roblox/client/appsflyer/a;->e:Z

    const/4 v4, 0x0

    iput-boolean v4, p0, Lcom/roblox/client/appsflyer/a;->e:Z

    iget-boolean v4, v0, Lcom/roblox/client/appsflyer/a$d;->b:Z

    if-eqz v4, :cond_1

    iput-boolean v3, p0, Lcom/roblox/client/appsflyer/a;->f:Z

    invoke-virtual {p0, p1, v0}, Lcom/roblox/client/appsflyer/a;->w(Landroid/content/Context;Lcom/roblox/client/appsflyer/a$d;)V

    goto :goto_0

    :catchall_1
    move-exception p1

    goto :goto_1

    :cond_1
    if-eqz v2, :cond_2

    iget-boolean v2, v0, Lcom/roblox/client/appsflyer/a$d;->a:Z

    invoke-virtual {p0, p1, v2}, Lcom/roblox/client/appsflyer/a;->i0(Landroid/content/Context;Z)V

    :cond_2
    :goto_0
    monitor-exit v1

    goto :goto_2

    :goto_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    throw p1

    :cond_3
    :goto_2
    if-eqz v0, :cond_4

    iget-boolean v1, v0, Lcom/roblox/client/appsflyer/a$d;->b:Z

    if-eqz v1, :cond_4

    const-string v0, "Android-AppsFlyer-Eligibility-Recheck-Blocked"

    invoke-virtual {p0, v0}, Lcom/roblox/client/appsflyer/a;->A0(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->p(Landroid/content/Context;)V

    return-void

    :cond_4
    if-nez v0, :cond_5

    const/4 v0, 0x0

    goto :goto_3

    :cond_5
    iget-boolean v0, v0, Lcom/roblox/client/appsflyer/a$d;->a:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    :goto_3
    invoke-virtual {p0, p1, v0}, Lcom/roblox/client/appsflyer/a;->l0(Landroid/content/Context;Ljava/lang/Boolean;)V

    return-void

    :cond_6
    const-string v0, "Android-AppsFlyer-Eligibility-Recheck-Skipped"

    invoke-virtual {p0, v0}, Lcom/roblox/client/appsflyer/a;->A0(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->J(Landroid/content/Context;)V

    return-void

    :goto_4
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final N(Landroid/content/Context;Ljava/lang/String;Z)Z
    .locals 0

    invoke-static {p1}, Lcom/roblox/client/appsflyer/a;->Q(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p1

    invoke-interface {p1, p2, p3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    return p1
.end method

.method public P0(Landroid/content/Context;Z)V
    .locals 2

    const-string v0, "disableDeeplinkTracking"

    xor-int/lit8 v1, p2, 0x1

    invoke-virtual {p0, p1, v0, v1}, Lcom/roblox/client/appsflyer/a;->G0(Landroid/content/Context;Ljava/lang/String;Z)V

    invoke-static {p1}, Leh/a0;->C(Landroid/content/Context;)V

    iget-object v0, p0, Lcom/roblox/client/appsflyer/a;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lcom/roblox/client/appsflyer/a;->c:Z

    if-nez v1, :cond_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    if-eqz p2, :cond_1

    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    move-result-object v1

    invoke-virtual {v1}, Lcom/appsflyer/AppsFlyerLib;->isStopped()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 p2, 0x0

    const/4 v1, 0x0

    invoke-virtual {p0, p1, p2, v1}, Lcom/roblox/client/appsflyer/a;->r0(Landroid/content/Context;Ljava/lang/String;Z)V

    goto :goto_0

    :cond_1
    if-nez p2, :cond_2

    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    move-result-object p2

    invoke-virtual {p2}, Lcom/appsflyer/AppsFlyerLib;->isStopped()Z

    move-result p2

    if-nez p2, :cond_2

    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    move-result-object p2

    const/4 v1, 0x1

    invoke-virtual {p2, v1, p1}, Lcom/appsflyer/AppsFlyerLib;->stop(ZLandroid/content/Context;)V

    :cond_2
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final Q0()Z
    .locals 3

    iget-object v0, p0, Lcom/roblox/client/appsflyer/a;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lcom/roblox/client/appsflyer/a;->g:Z

    const/4 v2, 0x0

    if-nez v1, :cond_0

    monitor-exit v0

    return v2

    :catchall_0
    move-exception v1

    goto :goto_0

    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->w0()Z

    move-result v0

    if-nez v0, :cond_1

    return v2

    :cond_1
    const-string v0, "Android-AppsFlyer-DeferredRoute-Skip-ConsentHeld"

    invoke-virtual {p0, v0}, Lcom/roblox/client/appsflyer/a;->A0(Ljava/lang/String;)V

    const/4 v0, 0x1

    return v0

    :goto_0
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final R0(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lcom/roblox/client/appsflyer/a;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lcom/roblox/client/appsflyer/a;->c:Z

    if-nez v1, :cond_1

    invoke-virtual {p0}, Lcom/roblox/client/appsflyer/a;->a0()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->b0(Landroid/content/Context;)Z

    move-result v1

    const/4 v2, 0x1

    iput-boolean v2, p0, Lcom/roblox/client/appsflyer/a;->c:Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0, p1, p2, v1}, Lcom/roblox/client/appsflyer/a;->r0(Landroid/content/Context;Ljava/lang/String;Z)V

    return-void

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    :goto_0
    :try_start_1
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public S(Ljava/util/Map;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "af_dp"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_4

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v1

    invoke-interface {v1}, Lbi/i;->u2()Z

    move-result v1

    const-string v2, "code"

    if-eqz v1, :cond_0

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v1

    invoke-interface {v1}, Lbi/i;->Y5()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/roblox/client/appsflyer/a;->h0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_0
    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v1

    invoke-interface {v1}, Lbi/i;->g1()Z

    move-result v1

    const/4 v3, 0x0

    const-string v4, "android_appsflyer_re_engagement"

    const/4 v5, 0x0

    if-eqz v1, :cond_1

    invoke-static {}, Lym/g;->G()Lym/g;

    move-result-object v1

    invoke-virtual {v1, v0, v4, v3}, Lym/g;->j(Ljava/lang/String;Ljava/lang/String;Z)Lorg/json/JSONObject;

    move-result-object v1

    goto :goto_0

    :cond_1
    invoke-static {}, Lym/g;->G()Lym/g;

    move-result-object v1

    invoke-virtual {v1, v0, v4, v3}, Lym/g;->h(Ljava/lang/String;Ljava/lang/String;Z)V

    move-object v1, v5

    :goto_0
    const-string v3, "link"

    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const-string v4, "af_ad"

    invoke-interface {p1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    const-string v6, "af_adset"

    invoke-interface {p1, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    const-string v7, "adgroup"

    invoke-interface {p1, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    const-string v8, "adset"

    invoke-interface {p1, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    invoke-static {v4, v6, v7, v8}, Lcom/roblox/client/appsflyer/a;->L0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v6

    invoke-interface {v6}, Lbi/i;->Y5()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lcom/roblox/client/appsflyer/a;->h0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v1, :cond_2

    invoke-static {}, Lym/g;->G()Lym/g;

    move-result-object p1

    invoke-virtual {p1, v1, v0}, Lym/g;->L(Lorg/json/JSONObject;Ljava/lang/String;)V

    :cond_2
    if-eqz v3, :cond_3

    invoke-static {}, Lym/g;->G()Lym/g;

    move-result-object p1

    invoke-virtual {p1, v0, v3, v4}, Lym/g;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_3
    const-string p1, "AppsFlyerManager"

    const-string v1, "Received null attribution URL. This should never happen."

    invoke-static {p1, v1}, Lok/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lym/g;->G()Lym/g;

    move-result-object p1

    invoke-virtual {p1, v0, v5, v4}, Lym/g;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    return-void
.end method

.method public final S0(Landroid/content/Context;)V
    .locals 1

    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->b0(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Android-AppsFlyer-Start-AtInit"

    invoke-virtual {p0, p1, v0}, Lcom/roblox/client/appsflyer/a;->R0(Landroid/content/Context;Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/roblox/client/appsflyer/a;->q0()V

    return-void
.end method

.method public T(Ljava/util/Map;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string v0, "media_source"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "media-source: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "AppsFlyerManager"

    invoke-static {v1, v0}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const-string v1, "is_first_launch"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->s0(Ljava/util/Map;)V

    :cond_0
    const/4 v1, 0x1

    const/4 v2, 0x0

    const-string v3, "Android-AppsFlyer-DeferredRoute-Skip-Gcd"

    const-string v4, "code"

    const-string v5, "android_appsflyer_gcd"

    const/4 v6, 0x0

    if-eqz v0, :cond_6

    const-string v7, "af_dp"

    invoke-interface {p1, v7}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6

    invoke-virtual {p0}, Lcom/roblox/client/appsflyer/a;->Q0()Z

    move-result v0

    if-eqz v0, :cond_1

    goto/16 :goto_6

    :cond_1
    invoke-virtual {p0, v3}, Lcom/roblox/client/appsflyer/a;->y(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->Y5()Z

    move-result v0

    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/Map$Entry;

    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v9

    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    if-nez v9, :cond_2

    if-eqz v0, :cond_2

    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    move-object v8, v6

    goto :goto_1

    :cond_2
    invoke-static {v9}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    :goto_1
    invoke-interface {v3, v10, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_3
    invoke-interface {v3, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_5

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->g1()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {}, Lym/g;->G()Lym/g;

    move-result-object v0

    invoke-virtual {v0, p1, v5, v2}, Lym/g;->j(Ljava/lang/String;Ljava/lang/String;Z)Lorg/json/JSONObject;

    goto :goto_2

    :cond_4
    invoke-static {}, Lym/g;->G()Lym/g;

    move-result-object v0

    invoke-virtual {v0, p1, v5, v1}, Lym/g;->h(Ljava/lang/String;Ljava/lang/String;Z)V

    :cond_5
    :goto_2
    invoke-virtual {p0, v3}, Lcom/roblox/client/appsflyer/a;->S(Ljava/util/Map;)V

    return-void

    :cond_6
    if-eqz v0, :cond_d

    const-string v7, "deep_link_value"

    invoke-interface {p1, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    instance-of v8, v8, Ljava/lang/String;

    if-eqz v8, :cond_d

    invoke-interface {p1, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    invoke-virtual {v8}, Ljava/lang/String;->isEmpty()Z

    move-result v8

    if-nez v8, :cond_d

    invoke-interface {p1, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0}, Lcom/roblox/client/appsflyer/a;->Q0()Z

    move-result v7

    if-eqz v7, :cond_7

    goto/16 :goto_6

    :cond_7
    invoke-virtual {p0, v3}, Lcom/roblox/client/appsflyer/a;->y(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_e

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v3

    invoke-interface {v3}, Lbi/i;->u2()Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v3

    invoke-interface {v3}, Lbi/i;->Y5()Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-interface {p1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    instance-of v7, v3, Ljava/lang/String;

    if-eqz v7, :cond_8

    check-cast v3, Ljava/lang/String;

    goto :goto_3

    :cond_8
    move-object v3, v6

    :goto_3
    invoke-static {v0, v3}, Lcom/roblox/client/appsflyer/a;->h0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_9
    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v3

    invoke-interface {v3}, Lbi/i;->g1()Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-static {}, Lym/g;->G()Lym/g;

    move-result-object v1

    invoke-virtual {v1, v0, v5, v2}, Lym/g;->j(Ljava/lang/String;Ljava/lang/String;Z)Lorg/json/JSONObject;

    move-result-object v1

    goto :goto_4

    :cond_a
    invoke-static {}, Lym/g;->G()Lym/g;

    move-result-object v2

    invoke-virtual {v2, v0, v5, v1}, Lym/g;->h(Ljava/lang/String;Ljava/lang/String;Z)V

    move-object v1, v6

    :goto_4
    invoke-static {p1}, Lcom/roblox/client/appsflyer/a;->M0(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v3

    invoke-interface {v3}, Lbi/i;->Y5()Z

    move-result v3

    if-eqz v3, :cond_c

    invoke-interface {p1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of v3, p1, Ljava/lang/String;

    if-eqz v3, :cond_b

    check-cast p1, Ljava/lang/String;

    goto :goto_5

    :cond_b
    move-object p1, v6

    :goto_5
    invoke-static {v0, p1}, Lcom/roblox/client/appsflyer/a;->h0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v1, :cond_c

    invoke-static {}, Lym/g;->G()Lym/g;

    move-result-object p1

    invoke-virtual {p1, v1, v0}, Lym/g;->L(Lorg/json/JSONObject;Ljava/lang/String;)V

    :cond_c
    invoke-static {}, Lym/g;->G()Lym/g;

    move-result-object p1

    invoke-virtual {p1, v0, v6, v2}, Lym/g;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_d
    if-eqz v0, :cond_e

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->S()Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-static {p1}, Lcom/roblox/client/appsflyer/a;->M0(Ljava/util/Map;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_e

    invoke-virtual {p0}, Lcom/roblox/client/appsflyer/a;->Q0()Z

    move-result v0

    if-nez v0, :cond_e

    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->t0(Ljava/lang/String;)V

    :cond_e
    :goto_6
    return-void
.end method

.method public final T0(Landroid/content/Context;Ljava/lang/Boolean;)V
    .locals 4

    iget-object v0, p0, Lcom/roblox/client/appsflyer/a;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lcom/roblox/client/appsflyer/a;->c:Z

    if-nez v1, :cond_6

    invoke-virtual {p0}, Lcom/roblox/client/appsflyer/a;->a0()Z

    move-result v1

    if-nez v1, :cond_6

    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->W(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_4

    :cond_0
    const/4 v1, 0x1

    if-eqz p2, :cond_2

    invoke-static {p1}, Lcom/roblox/client/appsflyer/a;->Q(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v2

    const-string v3, "delayedStartBackstopEligibilityResolved"

    invoke-interface {v2, v3, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    invoke-virtual {p0, p1, v3}, Lcom/roblox/client/appsflyer/a;->x(Landroid/content/Context;Z)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_5

    :cond_1
    :goto_0
    invoke-static {v2, p2}, Lcom/roblox/client/appsflyer/a;->o(ZLjava/lang/Boolean;)Z

    move-result p2

    goto :goto_1

    :cond_2
    move p2, v1

    :goto_1
    if-eqz p2, :cond_3

    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    move-result-object v2

    const-string v3, "all"

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/appsflyer/AppsFlyerLib;->setSharingFilterForPartners([Ljava/lang/String;)V

    const/4 v2, 0x0

    invoke-virtual {p0, p1, v1, v2}, Lcom/roblox/client/appsflyer/a;->v(Landroid/content/Context;ZLorg/json/JSONObject;)V

    :cond_3
    if-eqz p2, :cond_4

    invoke-static {p1}, Leh/a0;->y(Landroid/content/Context;)V

    goto :goto_2

    :cond_4
    const/4 v2, 0x0

    invoke-virtual {p0, p1, v2}, Lcom/roblox/client/appsflyer/a;->i0(Landroid/content/Context;Z)V

    :goto_2
    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->b0(Landroid/content/Context;)Z

    move-result v2

    iput-boolean v1, p0, Lcom/roblox/client/appsflyer/a;->c:Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p2, :cond_5

    const-string p2, "Android-AppsFlyer-Start-Backstop"

    goto :goto_3

    :cond_5
    const-string p2, "Android-AppsFlyer-Start-BackstopGeoResolved"

    :goto_3
    invoke-virtual {p0, p1, p2, v2}, Lcom/roblox/client/appsflyer/a;->r0(Landroid/content/Context;Ljava/lang/String;Z)V

    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->z(Landroid/content/Context;)V

    return-void

    :cond_6
    :goto_4
    :try_start_1
    monitor-exit v0

    return-void

    :goto_5
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final U(Z)V
    .locals 1

    if-eqz p1, :cond_0

    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/appsflyer/AppsFlyerLib;->anonymizeUser(Z)V

    :cond_0
    return-void
.end method

.method public V(Lcom/appsflyer/share/deeplink/DeepLinkResult;)V
    .locals 9

    invoke-virtual {p1}, Lcom/appsflyer/share/deeplink/DeepLinkResult;->getStatus()Lcom/appsflyer/share/deeplink/DeepLinkResult$Status;

    move-result-object v0

    sget-object v1, Lcom/appsflyer/share/deeplink/DeepLinkResult$Status;->FOUND:Lcom/appsflyer/share/deeplink/DeepLinkResult$Status;

    if-ne v0, v1, :cond_5

    invoke-virtual {p1}, Lcom/appsflyer/share/deeplink/DeepLinkResult;->getDeepLink()Lcom/appsflyer/share/deeplink/DeepLink;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Lcom/appsflyer/share/deeplink/DeepLinkResult;->getDeepLink()Lcom/appsflyer/share/deeplink/DeepLink;

    move-result-object v0

    invoke-virtual {v0}, Lcom/appsflyer/share/deeplink/DeepLink;->getDeepLinkValue()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_5

    invoke-virtual {p1}, Lcom/appsflyer/share/deeplink/DeepLinkResult;->getDeepLink()Lcom/appsflyer/share/deeplink/DeepLink;

    move-result-object v1

    invoke-virtual {v1}, Lcom/appsflyer/share/deeplink/DeepLink;->isDeferred()Ljava/lang/Boolean;

    move-result-object v1

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v2, v1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Lcom/roblox/client/appsflyer/a;->Q0()Z

    move-result v2

    if-nez v2, :cond_5

    const-string v2, "Android-AppsFlyer-DeferredRoute-Skip-Udl"

    invoke-virtual {p0, v2}, Lcom/roblox/client/appsflyer/a;->y(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    goto/16 :goto_2

    :cond_0
    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v2

    invoke-interface {v2}, Lbi/i;->u2()Z

    move-result v2

    const-string v3, "code"

    if-eqz v2, :cond_1

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v2

    invoke-interface {v2}, Lbi/i;->Y5()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p1}, Lcom/appsflyer/share/deeplink/DeepLinkResult;->getDeepLink()Lcom/appsflyer/share/deeplink/DeepLink;

    move-result-object v2

    invoke-virtual {v2, v3}, Lcom/appsflyer/share/deeplink/DeepLink;->getStringValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/roblox/client/appsflyer/a;->h0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_1
    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v2

    invoke-interface {v2}, Lbi/i;->g1()Z

    move-result v2

    const/4 v4, 0x0

    const-string v5, "android_appsflyer_udl"

    if-eqz v2, :cond_2

    invoke-static {}, Lym/g;->G()Lym/g;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v5, v2}, Lym/g;->j(Ljava/lang/String;Ljava/lang/String;Z)Lorg/json/JSONObject;

    move-result-object v1

    goto :goto_1

    :cond_2
    if-eqz v1, :cond_3

    invoke-static {}, Lym/g;->G()Lym/g;

    move-result-object v2

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v2, v0, v5, v1}, Lym/g;->h(Ljava/lang/String;Ljava/lang/String;Z)V

    goto :goto_0

    :cond_3
    invoke-static {}, Lym/g;->G()Lym/g;

    move-result-object v1

    invoke-virtual {v1, v0, v5}, Lym/g;->g(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    move-object v1, v4

    :goto_1
    invoke-virtual {p1}, Lcom/appsflyer/share/deeplink/DeepLinkResult;->getDeepLink()Lcom/appsflyer/share/deeplink/DeepLink;

    move-result-object v2

    const-string v5, "af_ad"

    invoke-virtual {v2, v5}, Lcom/appsflyer/share/deeplink/DeepLink;->getStringValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/appsflyer/share/deeplink/DeepLinkResult;->getDeepLink()Lcom/appsflyer/share/deeplink/DeepLink;

    move-result-object v5

    const-string v6, "af_adset"

    invoke-virtual {v5, v6}, Lcom/appsflyer/share/deeplink/DeepLink;->getStringValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lcom/appsflyer/share/deeplink/DeepLinkResult;->getDeepLink()Lcom/appsflyer/share/deeplink/DeepLink;

    move-result-object v6

    const-string v7, "adgroup"

    invoke-virtual {v6, v7}, Lcom/appsflyer/share/deeplink/DeepLink;->getStringValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1}, Lcom/appsflyer/share/deeplink/DeepLinkResult;->getDeepLink()Lcom/appsflyer/share/deeplink/DeepLink;

    move-result-object v7

    const-string v8, "adset"

    invoke-virtual {v7, v8}, Lcom/appsflyer/share/deeplink/DeepLink;->getStringValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v2, v5, v6, v7}, Lcom/roblox/client/appsflyer/a;->L0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v5

    invoke-interface {v5}, Lbi/i;->Y5()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-virtual {p1}, Lcom/appsflyer/share/deeplink/DeepLinkResult;->getDeepLink()Lcom/appsflyer/share/deeplink/DeepLink;

    move-result-object p1

    invoke-virtual {p1, v3}, Lcom/appsflyer/share/deeplink/DeepLink;->getStringValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/roblox/client/appsflyer/a;->h0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v1, :cond_4

    invoke-static {}, Lym/g;->G()Lym/g;

    move-result-object p1

    invoke-virtual {p1, v1, v0}, Lym/g;->L(Lorg/json/JSONObject;Ljava/lang/String;)V

    :cond_4
    invoke-static {}, Lym/g;->G()Lym/g;

    move-result-object p1

    invoke-virtual {p1, v0, v4, v2}, Lym/g;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_5
    :goto_2
    return-void
.end method

.method public final W(Landroid/content/Context;)Z
    .locals 0

    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->v0(Landroid/content/Context;)Lcom/roblox/client/appsflyer/a$d;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-boolean p1, p1, Lcom/roblox/client/appsflyer/a$d;->b:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final Y()Z
    .locals 1

    invoke-static {}, Lnk/c;->c()Lnk/c;

    move-result-object v0

    invoke-virtual {v0}, Lnk/c;->n()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lwh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final Z()Z
    .locals 2

    iget-object v0, p0, Lcom/roblox/client/appsflyer/a;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Lcom/roblox/client/appsflyer/a;->a0()Z

    move-result v1

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public a(Landroid/content/Context;)V
    .locals 5

    invoke-static {}, Lwh/b;->a()Z

    move-result v0

    xor-int/lit8 v1, v0, 0x1

    const-string v2, "AppsFlyerManager"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "init: initEnabled="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    if-nez v0, :cond_3

    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    move-result-object v0

    const/16 v1, 0x5a

    invoke-virtual {v0, v1}, Lcom/appsflyer/AppsFlyerLib;->setMinTimeBetweenSessions(I)V

    const-string v1, "roblox.onelink.me"

    const-string v2, "ro.blox.com"

    const-string v3, "go.roblox.com"

    filled-new-array {v1, v2, v3}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/appsflyer/AppsFlyerLib;->setOneLinkCustomDomain([Ljava/lang/String;)V

    const-string v1, "enableTracking"

    const/4 v2, 0x1

    invoke-virtual {p0, p1, v1, v2}, Lcom/roblox/client/appsflyer/a;->N(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {p0, v1}, Lcom/roblox/client/appsflyer/a;->U(Z)V

    new-instance v1, Lcom/roblox/client/appsflyer/a$a;

    invoke-direct {v1, p0}, Lcom/roblox/client/appsflyer/a$a;-><init>(Lcom/roblox/client/appsflyer/a;)V

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Lcom/appsflyer/AppsFlyerLib;->setCollectAndroidID(Z)V

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v3

    invoke-interface {v3}, Lbi/i;->D5()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v0, v2}, Lcom/appsflyer/AppsFlyerLib;->setDisableAdvertisingIdentifiers(Z)V

    :cond_0
    const-string v3, "Quwp4RGsFwE6rVnyTFm6jQ"

    invoke-virtual {v0, v3, v1, p1}, Lcom/appsflyer/AppsFlyerLib;->init(Ljava/lang/String;Lcom/appsflyer/share/AppsFlyerConversionListener;Landroid/content/Context;)Lcom/appsflyer/AppsFlyerLib;

    new-instance v1, Lhh/a;

    invoke-direct {v1, p0}, Lhh/a;-><init>(Lcom/roblox/client/appsflyer/a;)V

    invoke-virtual {v0, v1}, Lcom/appsflyer/AppsFlyerLib;->registerSessionReadyListener(Lcom/appsflyer/share/SessionReadyListener;)V

    new-instance v1, Lcom/roblox/client/appsflyer/a$b;

    invoke-direct {v1, p0}, Lcom/roblox/client/appsflyer/a$b;-><init>(Lcom/roblox/client/appsflyer/a;)V

    invoke-virtual {v0, v1}, Lcom/appsflyer/AppsFlyerLib;->subscribeForDeepLink(Lcom/appsflyer/share/deeplink/DeepLinkListener;)V

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v1

    invoke-interface {v1}, Lbi/i;->K1()Z

    move-result v1

    iget-object v3, p0, Lcom/roblox/client/appsflyer/a;->d:Ljava/lang/Object;

    monitor-enter v3

    if-eqz v1, :cond_1

    :try_start_0
    iput-boolean v2, p0, Lcom/roblox/client/appsflyer/a;->e:Z

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    :goto_0
    iput-object p1, p0, Lcom/roblox/client/appsflyer/a;->b:Landroid/content/Context;

    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    new-instance v1, Lhh/b;

    invoke-direct {v1, p0}, Lhh/b;-><init>(Lcom/roblox/client/appsflyer/a;)V

    invoke-static {v1}, Leh/a0;->G(Ljava/util/function/BooleanSupplier;)V

    invoke-static {}, Lym/g;->G()Lym/g;

    move-result-object v1

    new-instance v2, Lhh/c;

    invoke-direct {v2, p0}, Lhh/c;-><init>(Lcom/roblox/client/appsflyer/a;)V

    invoke-virtual {v1, v2}, Lym/g;->x(Lym/g$h;)V

    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->E0(Landroid/content/Context;)V

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v1

    invoke-interface {v1}, Lbi/i;->p4()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-static {}, Lym/g;->G()Lym/g;

    move-result-object v1

    new-instance v2, Lhh/d;

    invoke-direct {v2, p0}, Lhh/d;-><init>(Lcom/roblox/client/appsflyer/a;)V

    invoke-virtual {v1, v2}, Lym/g;->y(Lym/g$i;)V

    :cond_2
    invoke-static {}, Lym/g;->G()Lym/g;

    move-result-object v1

    invoke-virtual {v0, p1}, Lcom/appsflyer/AppsFlyerLib;->getAppsFlyerUID(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lym/g;->F(Ljava/lang/String;)V

    return-void

    :goto_1
    :try_start_1
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_3
    return-void
.end method

.method public final a0()Z
    .locals 1

    iget-boolean v0, p0, Lcom/roblox/client/appsflyer/a;->e:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/roblox/client/appsflyer/a;->f:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public b()V
    .locals 3

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->D5()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/appsflyer/AppsFlyerLib;->setDisableAdvertisingIdentifiers(Z)V

    :cond_0
    iget-object v0, p0, Lcom/roblox/client/appsflyer/a;->b:Landroid/content/Context;

    if-nez v0, :cond_1

    return-void

    :cond_1
    iget-object v1, p0, Lcom/roblox/client/appsflyer/a;->d:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    invoke-static {}, Leh/a0;->r()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {p0, v0}, Lcom/roblox/client/appsflyer/a;->A(Landroid/content/Context;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_2
    :goto_0
    invoke-static {v0}, Leh/a0;->B(Landroid/content/Context;)V

    monitor-exit v1

    return-void

    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final b0(Landroid/content/Context;)Z
    .locals 2

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->L4()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const-string v0, "disableDeeplinkTracking"

    invoke-virtual {p0, p1, v0, v1}, Lcom/roblox/client/appsflyer/a;->N(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v1
.end method

.method public c(Landroid/content/Context;)V
    .locals 3

    invoke-virtual {p0}, Lcom/roblox/client/appsflyer/a;->Y()Z

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "first play: enabled="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "AppsFlyerManager"

    invoke-static {v2, v1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "firstPlayReported_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lnk/c;->c()Lnk/c;

    move-result-object v1

    invoke-virtual {v1}, Lnk/c;->j()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v0, v1}, Lcom/roblox/client/appsflyer/a;->N(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v1

    if-nez v1, :cond_1

    const/4 v1, 0x1

    invoke-virtual {p0, p1, v0, v1}, Lcom/roblox/client/appsflyer/a;->G0(Landroid/content/Context;Ljava/lang/String;Z)V

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p1

    invoke-interface {p1}, Lbi/i;->T3()Z

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    move-result-object p1

    iget-object v1, p0, Lcom/roblox/client/appsflyer/a;->b:Landroid/content/Context;

    const-string v2, "af_level_achieved"

    invoke-virtual {p1, v1, v2, v0}, Lcom/appsflyer/AppsFlyerLib;->logEvent(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V

    :cond_0
    const-string p1, "firstPlayReported"

    invoke-virtual {p0, p1, v0}, Lcom/roblox/client/appsflyer/a;->C0(Ljava/lang/String;Ljava/util/List;)V

    const-string p1, "Android-AppsFlyer-FirstPlay"

    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->B0(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public final synthetic c0()Z
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/appsflyer/a;->b:Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/roblox/client/appsflyer/a;->b0(Landroid/content/Context;)Z

    move-result v0

    return v0
.end method

.method public d(Landroid/content/Context;)V
    .locals 3

    invoke-virtual {p0}, Lcom/roblox/client/appsflyer/a;->Y()Z

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "login: enabled="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "AppsFlyerManager"

    invoke-static {v2, v1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/roblox/client/appsflyer/a;->H()V

    const-string v0, "loginReported"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/roblox/client/appsflyer/a;->C0(Ljava/lang/String;Ljava/util/List;)V

    const-string v0, "Android-AppsFlyer-Login"

    invoke-virtual {p0, v0}, Lcom/roblox/client/appsflyer/a;->B0(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->z0(Landroid/content/Context;)V

    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->E(Landroid/content/Context;)V

    return-void

    :cond_0
    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->n(Landroid/content/Context;)V

    return-void
.end method

.method public final synthetic d0(Z)V
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/appsflyer/a;->b:Landroid/content/Context;

    invoke-virtual {p0, v0, p1}, Lcom/roblox/client/appsflyer/a;->P0(Landroid/content/Context;Z)V

    return-void
.end method

.method public e(Landroid/content/Context;J)V
    .locals 5

    invoke-virtual {p0}, Lcom/roblox/client/appsflyer/a;->Y()Z

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "playtime: enabled="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "AppsFlyerManager"

    invoke-static {v2, v1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "experiencePlaytimeReported_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lnk/c;->c()Lnk/c;

    move-result-object v1

    invoke-virtual {v1}, Lnk/c;->j()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v0, v1}, Lcom/roblox/client/appsflyer/a;->N(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v1

    if-nez v1, :cond_1

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0xf

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v1, v2, v3, v4}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    move-result-wide v1

    cmp-long p2, p2, v1

    if-ltz p2, :cond_1

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p2

    invoke-interface {p2}, Lbi/i;->P5()Z

    move-result p2

    const/4 p3, 0x0

    if-nez p2, :cond_0

    sget-object p2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    const/16 v1, 0xf

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "af_experience_playtime_%dmin"

    invoke-static {p2, v2, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    move-result-object v1

    iget-object v2, p0, Lcom/roblox/client/appsflyer/a;->b:Landroid/content/Context;

    invoke-virtual {v1, v2, p2, p3}, Lcom/appsflyer/AppsFlyerLib;->logEvent(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V

    :cond_0
    const-string p2, "experiencePlaytimeReported"

    invoke-virtual {p0, p2, p3}, Lcom/roblox/client/appsflyer/a;->C0(Ljava/lang/String;Ljava/util/List;)V

    const-string p2, "Android-AppsFlyer-ExperiencePlaytime"

    invoke-virtual {p0, p2}, Lcom/roblox/client/appsflyer/a;->B0(Ljava/lang/String;)V

    const/4 p2, 0x1

    invoke-virtual {p0, p1, v0, p2}, Lcom/roblox/client/appsflyer/a;->G0(Landroid/content/Context;Ljava/lang/String;Z)V

    :cond_1
    return-void
.end method

.method public final e0(Landroid/content/Context;)V
    .locals 5

    invoke-static {p1}, Lcom/roblox/client/appsflyer/a;->Q(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p1

    const-string v0, "delayedStartBackstopDeadline"

    const-wide/16 v1, 0x0

    invoke-interface {p1, v0, v1, v2}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v3

    cmp-long v0, v3, v1

    if-eqz v0, :cond_0

    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    const-string v0, "delayedStartBackstopEligibilityResolved"

    const/4 v1, 0x1

    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    :cond_0
    return-void
.end method

.method public f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZ)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p0}, Lcom/roblox/client/appsflyer/a;->Y()Z

    move-result p4

    new-instance p5, Ljava/lang/StringBuilder;

    invoke-direct {p5}, Ljava/lang/StringBuilder;-><init>()V

    const-string p6, "Purchase. enabled="

    invoke-virtual {p5, p6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p5, p4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p6, ". Price: "

    invoke-virtual {p5, p6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p6, "."

    invoke-virtual {p5, p6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p5

    const-string p6, "AppsFlyerManager"

    invoke-static {p6, p5}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz p4, :cond_0

    invoke-virtual {p0, p1, p2, p3}, Lcom/roblox/client/appsflyer/a;->y0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final f0(Landroid/content/Context;)Z
    .locals 10

    invoke-static {p1}, Lcom/roblox/client/appsflyer/a;->Q(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "delayedStartConsentTs"

    const-wide/16 v2, 0x0

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    invoke-virtual {p0}, Lcom/roblox/client/appsflyer/a;->G()J

    move-result-wide v8

    invoke-static/range {v4 .. v9}, Lcom/roblox/client/appsflyer/a;->X(JJJ)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return v2

    :cond_0
    const-string v1, "delayedStartConsentApplySharingFilter"

    const/4 v3, 0x1

    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    const-string v4, "delayedStartConsentDma"

    const/4 v5, 0x0

    invoke-interface {v0, v4, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roblox/client/appsflyer/a;->o0(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {p0, p1, v3}, Lcom/roblox/client/appsflyer/a;->i0(Landroid/content/Context;Z)V

    iget-object v4, p0, Lcom/roblox/client/appsflyer/a;->d:Ljava/lang/Object;

    monitor-enter v4

    :try_start_0
    iget-boolean v5, p0, Lcom/roblox/client/appsflyer/a;->c:Z

    if-eqz v5, :cond_1

    monitor-exit v4

    return v3

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/roblox/client/appsflyer/a;->a0()Z

    move-result v5

    if-eqz v5, :cond_2

    monitor-exit v4

    return v2

    :cond_2
    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    move-result-object v2

    invoke-virtual {p0, v2, v0, v1}, Lcom/roblox/client/appsflyer/a;->q(Lcom/appsflyer/AppsFlyerLib;Lorg/json/JSONObject;Z)V

    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->b0(Landroid/content/Context;)Z

    move-result v0

    iput-boolean v3, p0, Lcom/roblox/client/appsflyer/a;->c:Z

    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->z(Landroid/content/Context;)V

    const-string v1, "Android-AppsFlyer-Start-CachedConsent"

    invoke-virtual {p0, p1, v1, v0}, Lcom/roblox/client/appsflyer/a;->r0(Landroid/content/Context;Ljava/lang/String;Z)V

    return v3

    :goto_0
    :try_start_1
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public g(Landroid/content/Context;)V
    .locals 5

    invoke-virtual {p0}, Lcom/roblox/client/appsflyer/a;->Y()Z

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "signup: enabled="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "AppsFlyerManager"

    invoke-static {v2, v1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/roblox/client/appsflyer/a;->H()V

    const-string v0, "signUpReported"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/roblox/client/appsflyer/a;->C0(Ljava/lang/String;Ljava/util/List;)V

    const-string v0, "Android-AppsFlyer-Registration"

    invoke-virtual {p0, v0}, Lcom/roblox/client/appsflyer/a;->B0(Ljava/lang/String;)V

    invoke-static {}, Lnk/c;->c()Lnk/c;

    move-result-object v0

    invoke-virtual {v0}, Lnk/c;->j()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/roblox/client/appsflyer/a;->R(J)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v1, v2, v3, v4}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    move-result-wide v1

    invoke-static {p1, v0, v1, v2}, Lcom/roblox/client/appsflyer/a;->H0(Landroid/content/Context;Ljava/lang/String;J)V

    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->E(Landroid/content/Context;)V

    return-void

    :cond_0
    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->n(Landroid/content/Context;)V

    return-void
.end method

.method public g0(Landroid/content/Context;)Z
    .locals 4

    invoke-static {}, Leh/a0;->r()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->j2()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->b0(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->x0(Landroid/content/Context;)Leh/b0;

    move-result-object v0

    invoke-static {v0}, Leh/c0;->e(Leh/b0;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_2

    :cond_0
    invoke-static {p1}, Lcom/roblox/client/appsflyer/a;->Q(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v2, "delayedStartConsentDma"

    const/4 v3, 0x0

    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roblox/client/appsflyer/a;->o0(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    iget-object v2, p0, Lcom/roblox/client/appsflyer/a;->d:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    iget-boolean v3, p0, Lcom/roblox/client/appsflyer/a;->c:Z

    if-nez v3, :cond_2

    invoke-virtual {p0}, Lcom/roblox/client/appsflyer/a;->a0()Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    move-result-object v1

    const/4 v3, 0x1

    invoke-virtual {p0, v1, v0, v3}, Lcom/roblox/client/appsflyer/a;->q(Lcom/appsflyer/AppsFlyerLib;Lorg/json/JSONObject;Z)V

    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->b0(Landroid/content/Context;)Z

    move-result v0

    iput-boolean v3, p0, Lcom/roblox/client/appsflyer/a;->c:Z

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->z(Landroid/content/Context;)V

    const-string v1, "Android-AppsFlyer-Start-CachedConsent"

    invoke-virtual {p0, p1, v1, v0}, Lcom/roblox/client/appsflyer/a;->r0(Landroid/content/Context;Ljava/lang/String;Z)V

    return v3

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_2
    :goto_0
    :try_start_1
    monitor-exit v2

    return v1

    :goto_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_3
    :goto_2
    return v1
.end method

.method public i(Ljava/lang/String;)V
    .locals 1

    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/appsflyer/AppsFlyerLib;->setCustomerUserId(Ljava/lang/String;)V

    return-void
.end method

.method public final i0(Landroid/content/Context;Z)V
    .locals 1

    invoke-virtual {p0}, Lcom/roblox/client/appsflyer/a;->Z()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->x0(Landroid/content/Context;)Leh/b0;

    move-result-object v0

    invoke-static {p1, p2, v0}, Leh/a0;->A(Landroid/content/Context;ZLeh/b0;)V

    return-void
.end method

.method public k0(Lorg/json/JSONObject;)V
    .locals 6

    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    move-result-object v0

    iget-object v1, p0, Lcom/roblox/client/appsflyer/a;->d:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    const-string v2, "dmaConsent"

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    const-string v3, "applySharingFilter"

    const/4 v4, 0x1

    invoke-virtual {p1, v3, v4}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v3

    const-string v5, "applySharingFilter"

    invoke-virtual {p1, v5}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    :goto_0
    invoke-static {v2}, Lcom/roblox/client/appsflyer/a;->C(Lorg/json/JSONObject;)Ljava/lang/Boolean;

    move-result-object v5

    invoke-virtual {p0, v0, v2, v3}, Lcom/roblox/client/appsflyer/a;->q(Lcom/appsflyer/AppsFlyerLib;Lorg/json/JSONObject;Z)V

    iget-object v0, p0, Lcom/roblox/client/appsflyer/a;->b:Landroid/content/Context;

    invoke-virtual {p0, v0, v3, v2}, Lcom/roblox/client/appsflyer/a;->v(Landroid/content/Context;ZLorg/json/JSONObject;)V

    iget-boolean v0, p0, Lcom/roblox/client/appsflyer/a;->c:Z

    const/4 v2, 0x0

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lcom/roblox/client/appsflyer/a;->a0()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    move v0, v2

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_2
    :goto_1
    move v0, v4

    :goto_2
    iget-boolean v3, p0, Lcom/roblox/client/appsflyer/a;->f:Z

    if-nez v3, :cond_3

    iget-object v3, p0, Lcom/roblox/client/appsflyer/a;->b:Landroid/content/Context;

    invoke-static {v3, p1, v5}, Leh/a0;->z(Landroid/content/Context;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    :cond_3
    if-nez v0, :cond_4

    iget-object p1, p0, Lcom/roblox/client/appsflyer/a;->b:Landroid/content/Context;

    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->b0(Landroid/content/Context;)Z

    move-result v2

    iput-boolean v4, p0, Lcom/roblox/client/appsflyer/a;->c:Z

    :cond_4
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_5

    return-void

    :cond_5
    iget-object p1, p0, Lcom/roblox/client/appsflyer/a;->b:Landroid/content/Context;

    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->z(Landroid/content/Context;)V

    iget-object p1, p0, Lcom/roblox/client/appsflyer/a;->b:Landroid/content/Context;

    const-string v0, "Android-AppsFlyer-Start-Attribution"

    invoke-virtual {p0, p1, v0, v2}, Lcom/roblox/client/appsflyer/a;->r0(Landroid/content/Context;Ljava/lang/String;Z)V

    return-void

    :goto_3
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public l0(Landroid/content/Context;Ljava/lang/Boolean;)V
    .locals 1

    if-nez p2, :cond_0

    const-string v0, "Android-AppsFlyer-Eligibility-Recheck-Unresolved"

    invoke-virtual {p0, v0}, Lcom/roblox/client/appsflyer/a;->A0(Ljava/lang/String;)V

    goto :goto_1

    :cond_0
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "Android-AppsFlyer-Eligibility-Recheck-Flagged"

    goto :goto_0

    :cond_1
    const-string v0, "Android-AppsFlyer-Eligibility-Recheck-NotFlagged"

    :goto_0
    invoke-virtual {p0, v0}, Lcom/roblox/client/appsflyer/a;->A0(Ljava/lang/String;)V

    :goto_1
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, p2}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->K1()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->f0(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    return-void

    :cond_2
    invoke-virtual {p0, p1, p2}, Lcom/roblox/client/appsflyer/a;->T0(Landroid/content/Context;Ljava/lang/Boolean;)V

    return-void
.end method

.method public final m0(Landroid/content/Context;Lcom/roblox/client/appsflyer/a$d;)V
    .locals 3

    const/4 v0, 0x0

    if-nez p2, :cond_1

    const-string p2, "Android-AppsFlyer-Eligibility-Unresolved"

    invoke-virtual {p0, p2}, Lcom/roblox/client/appsflyer/a;->A0(Ljava/lang/String;)V

    const/4 p2, 0x1

    invoke-virtual {p0, p1, p2, v0}, Lcom/roblox/client/appsflyer/a;->s(Landroid/content/Context;ZZ)V

    invoke-virtual {p0}, Lcom/roblox/client/appsflyer/a;->Z()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/roblox/client/appsflyer/a;->F0()V

    :cond_0
    return-void

    :cond_1
    iget-object v1, p0, Lcom/roblox/client/appsflyer/a;->d:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iput-boolean v0, p0, Lcom/roblox/client/appsflyer/a;->e:Z

    iget-boolean v0, p0, Lcom/roblox/client/appsflyer/a;->f:Z

    iget-boolean v2, p2, Lcom/roblox/client/appsflyer/a$d;->b:Z

    or-int/2addr v0, v2

    iput-boolean v0, p0, Lcom/roblox/client/appsflyer/a;->f:Z

    invoke-virtual {p0, p1, p2}, Lcom/roblox/client/appsflyer/a;->w(Landroid/content/Context;Lcom/roblox/client/appsflyer/a$d;)V

    invoke-virtual {p2}, Lcom/roblox/client/appsflyer/a$d;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->e0(Landroid/content/Context;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_2
    :goto_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-boolean v0, p2, Lcom/roblox/client/appsflyer/a$d;->b:Z

    if-eqz v0, :cond_3

    const-string v0, "Android-AppsFlyer-Eligibility-Blocked"

    invoke-virtual {p0, v0}, Lcom/roblox/client/appsflyer/a;->A0(Ljava/lang/String;)V

    goto :goto_2

    :cond_3
    iget-boolean v0, p2, Lcom/roblox/client/appsflyer/a$d;->a:Z

    if-eqz v0, :cond_4

    const-string v0, "Android-AppsFlyer-Eligibility-Flagged"

    goto :goto_1

    :cond_4
    const-string v0, "Android-AppsFlyer-Eligibility-NotFlagged"

    :goto_1
    invoke-virtual {p0, v0}, Lcom/roblox/client/appsflyer/a;->A0(Ljava/lang/String;)V

    :goto_2
    invoke-virtual {p0, p1, p2}, Lcom/roblox/client/appsflyer/a;->r(Landroid/content/Context;Lcom/roblox/client/appsflyer/a$d;)V

    return-void

    :goto_3
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final n(Landroid/content/Context;)V
    .locals 2

    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/appsflyer/AppsFlyerLib;->anonymizeUser(Z)V

    const-string v0, "enableTracking"

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v0, v1}, Lcom/roblox/client/appsflyer/a;->G0(Landroid/content/Context;Ljava/lang/String;Z)V

    return-void
.end method

.method public n0()V
    .locals 3

    iget-object v0, p0, Lcom/roblox/client/appsflyer/a;->d:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, p0, Lcom/roblox/client/appsflyer/a;->l:Z

    iget-boolean v1, p0, Lcom/roblox/client/appsflyer/a;->m:Z

    if-nez v1, :cond_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/roblox/client/appsflyer/a;->n:Ljava/lang/String;

    const/4 v2, 0x0

    iput-boolean v2, p0, Lcom/roblox/client/appsflyer/a;->m:Z

    const/4 v2, 0x0

    iput-object v2, p0, Lcom/roblox/client/appsflyer/a;->n:Ljava/lang/String;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0, v1}, Lcom/roblox/client/appsflyer/a;->D(Ljava/lang/String;)V

    return-void

    :goto_0
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public p(Landroid/content/Context;)V
    .locals 4

    iget-object v0, p0, Lcom/roblox/client/appsflyer/a;->d:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, p0, Lcom/roblox/client/appsflyer/a;->f:Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {p1}, Leh/a0;->x(Landroid/content/Context;)V

    invoke-static {p1}, Lcom/roblox/client/appsflyer/a;->Q(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "delayedStartBackstopDeadline"

    const-wide/16 v2, 0x0

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->z(Landroid/content/Context;)V

    :cond_0
    invoke-virtual {p0}, Lcom/roblox/client/appsflyer/a;->F0()V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final q(Lcom/appsflyer/AppsFlyerLib;Lorg/json/JSONObject;Z)V
    .locals 5

    if-eqz p2, :cond_2

    const-string v0, "consented"

    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    new-instance v1, Lcom/appsflyer/share/AppsFlyerConsent;

    const-string v3, "isSubjectToGdpr"

    invoke-virtual {p2, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {p2, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result p2

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    :cond_1
    invoke-direct {v1, v2, v0, v0, v0}, Lcom/appsflyer/share/AppsFlyerConsent;-><init>(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    invoke-virtual {p1, v1}, Lcom/appsflyer/AppsFlyerLib;->setConsentData(Lcom/appsflyer/share/AppsFlyerConsent;)V

    :cond_2
    if-eqz p3, :cond_3

    const-string p2, "all"

    filled-new-array {p2}, [Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/appsflyer/AppsFlyerLib;->setSharingFilterForPartners([Ljava/lang/String;)V

    const-string p1, "Android-AppsFlyer-Sharing-Filter-Applied"

    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->A0(Ljava/lang/String;)V

    return-void

    :cond_3
    const-string p2, ""

    filled-new-array {p2}, [Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/appsflyer/AppsFlyerLib;->setSharingFilterForPartners([Ljava/lang/String;)V

    const-string p1, "Android-AppsFlyer-Sharing-Filter-Cleared"

    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->A0(Ljava/lang/String;)V

    return-void
.end method

.method public final q0()V
    .locals 3

    iget-object v0, p0, Ldj/d;->a:Landroid/content/Intent;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/roblox/client/appsflyer/a;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lcom/roblox/client/appsflyer/a;->h:Z

    if-eqz v1, :cond_1

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_1
    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/roblox/client/appsflyer/a;->h:Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Ldj/d;->a:Landroid/content/Intent;

    invoke-virtual {v0}, Landroid/content/Intent;->getDataString()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lcom/appsflyer/AppsFlyerLib;->performDeepLinking(Ljava/lang/String;Z)V

    :cond_2
    :goto_0
    return-void

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final r(Landroid/content/Context;Lcom/roblox/client/appsflyer/a$d;)V
    .locals 1

    iget-boolean v0, p2, Lcom/roblox/client/appsflyer/a$d;->b:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->p(Landroid/content/Context;)V

    return-void

    :cond_0
    iget-boolean p2, p2, Lcom/roblox/client/appsflyer/a$d;->a:Z

    const/4 v0, 0x1

    invoke-virtual {p0, p1, p2, v0}, Lcom/roblox/client/appsflyer/a;->s(Landroid/content/Context;ZZ)V

    return-void
.end method

.method public final r0(Landroid/content/Context;Ljava/lang/String;Z)V
    .locals 1

    const/4 v0, 0x1

    if-eqz p3, :cond_0

    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    move-result-object p2

    invoke-virtual {p2, v0, p1}, Lcom/appsflyer/AppsFlyerLib;->stop(ZLandroid/content/Context;)V

    return-void

    :cond_0
    iget-object p1, p0, Lcom/roblox/client/appsflyer/a;->d:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    iget-boolean p3, p0, Lcom/roblox/client/appsflyer/a;->l:Z

    if-nez p3, :cond_1

    iput-boolean v0, p0, Lcom/roblox/client/appsflyer/a;->m:Z

    iput-object p2, p0, Lcom/roblox/client/appsflyer/a;->n:Ljava/lang/String;

    monitor-exit p1

    return-void

    :catchall_0
    move-exception p2

    goto :goto_0

    :cond_1
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0, p2}, Lcom/roblox/client/appsflyer/a;->D(Ljava/lang/String;)V

    return-void

    :goto_0
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p2
.end method

.method public s(Landroid/content/Context;ZZ)V
    .locals 2

    if-eqz p2, :cond_1

    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->f0(Landroid/content/Context;)Z

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p2, 0x1

    invoke-virtual {p0, p1, p2}, Lcom/roblox/client/appsflyer/a;->i0(Landroid/content/Context;Z)V

    invoke-virtual {p0, p1, p3}, Lcom/roblox/client/appsflyer/a;->t(Landroid/content/Context;Z)V

    return-void

    :cond_1
    const/4 p2, 0x0

    invoke-virtual {p0, p1, p2}, Lcom/roblox/client/appsflyer/a;->i0(Landroid/content/Context;Z)V

    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->g0(Landroid/content/Context;)Z

    move-result p2

    if-nez p2, :cond_2

    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->S0(Landroid/content/Context;)V

    :cond_2
    invoke-static {p1}, Lcom/roblox/client/appsflyer/a;->Q(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p2

    const-string p3, "delayedStartBackstopDeadline"

    const-wide/16 v0, 0x0

    invoke-interface {p2, p3, v0, v1}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide p2

    cmp-long p2, p2, v0

    if-eqz p2, :cond_3

    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->z(Landroid/content/Context;)V

    :cond_3
    :goto_0
    return-void
.end method

.method public s0(Ljava/util/Map;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string v0, "af_status"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "Organic"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    sget-wide v1, Lbh/a1;->u:J

    const-wide/16 v3, 0x0

    cmp-long v3, v1, v3

    if-nez v3, :cond_0

    const-string p1, "Android-AppsFlyer-AttributionContext-Skip-BtidNotReady"

    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->B0(Ljava/lang/String;)V

    return-void

    :cond_0
    :try_start_0
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    const-string v4, "body"

    invoke-virtual {p0, v1, v2, p1}, Lcom/roblox/client/appsflyer/a;->u(JLjava/util/Map;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, v4, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-static {}, Lcom/roblox/universalapp/messagebus/MessageBus;->getInstance()Lcom/roblox/universalapp/messagebus/MessageBus;

    move-result-object p1

    sget-object v1, Lcom/roblox/universalapp/messagebus/MessageBusHelper;->INSTANCE:Lcom/roblox/universalapp/messagebus/MessageBusHelper;

    const-string v2, "Linking"

    const-string v4, "recordAttributionContext"

    invoke-virtual {v1, v2, v4}, Lcom/roblox/universalapp/messagebus/MessageBusHelper;->getMessageId(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1, v3}, Lcom/roblox/universalapp/messagebus/MessageBus;->publish(Ljava/lang/String;Lorg/json/JSONObject;)V

    if-eqz v0, :cond_1

    const-string p1, "Android-AppsFlyer-AttributionContext-Published-Organic"

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_1
    const-string p1, "Android-AppsFlyer-AttributionContext-Published"

    :goto_0
    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->B0(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Failed to publish recordAttributionContext: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "AppsFlyerManager"

    invoke-static {v0, p1}, Lok/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string p1, "Android-AppsFlyer-AttributionContext-Skip-JsonError"

    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->B0(Ljava/lang/String;)V

    return-void
.end method

.method public final t(Landroid/content/Context;Z)V
    .locals 8

    iget-object v0, p0, Lcom/roblox/client/appsflyer/a;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lcom/roblox/client/appsflyer/a;->c:Z

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    invoke-static {p1}, Lcom/roblox/client/appsflyer/a;->Q(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    const-string v2, "delayedStartBackstopDeadline"

    const-wide/16 v3, 0x0

    invoke-interface {v1, v2, v3, v4}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v5

    cmp-long v2, v5, v3

    const/4 v3, 0x1

    if-nez v2, :cond_1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-virtual {p0}, Lcom/roblox/client/appsflyer/a;->B()J

    move-result-wide v6

    add-long v5, v4, v6

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "delayedStartBackstopDeadline"

    invoke-interface {v1, v2, v5, v6}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "delayedStartBackstopEligibilityResolved"

    invoke-interface {v1, v2, p2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object p2

    invoke-interface {p2}, Landroid/content/SharedPreferences$Editor;->apply()V

    goto :goto_0

    :cond_1
    if-eqz p2, :cond_2

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p2

    const-string v1, "delayedStartBackstopEligibilityResolved"

    invoke-interface {p2, v1, v3}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object p2

    invoke-interface {p2}, Landroid/content/SharedPreferences$Editor;->apply()V

    :cond_2
    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    cmp-long p2, v5, v1

    if-lez p2, :cond_3

    iput-boolean v3, p0, Lcom/roblox/client/appsflyer/a;->g:Z

    :cond_3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0, p1, v5, v6}, Lcom/roblox/client/appsflyer/a;->I0(Landroid/content/Context;J)V

    return-void

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public t0(Ljava/lang/String;)V
    .locals 4

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lcom/roblox/client/appsflyer/a;->k:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lcom/roblox/client/appsflyer/a;->j:Z

    if-eqz v1, :cond_1

    const-string p1, "Android-AppsFlyer-DDR-Publish-Skip-Duplicate"

    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->A0(Ljava/lang/String;)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_1
    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/roblox/client/appsflyer/a;->j:Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "attributionAdName"

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-static {}, Lcom/roblox/universalapp/messagebus/MessageBus;->getInstance()Lcom/roblox/universalapp/messagebus/MessageBus;

    move-result-object p1

    sget-object v1, Lcom/roblox/universalapp/messagebus/MessageBusHelper;->INSTANCE:Lcom/roblox/universalapp/messagebus/MessageBusHelper;

    const-string v2, "Linking"

    const-string v3, "resolveAttributionAdName"

    invoke-virtual {v1, v2, v3}, Lcom/roblox/universalapp/messagebus/MessageBusHelper;->getMessageId(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1, v0}, Lcom/roblox/universalapp/messagebus/MessageBus;->publish(Ljava/lang/String;Lorg/json/JSONObject;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v0, "AppsFlyerManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failed to publish resolveAttributionAdName: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lok/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :goto_0
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1

    :cond_2
    :goto_1
    return-void
.end method

.method public u(JLjava/util/Map;)Lorg/json/JSONObject;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lorg/json/JSONObject;"
        }
    .end annotation

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "btid"

    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-static {p3}, Lcom/roblox/client/appsflyer/a;->J0(Ljava/util/Map;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lok/b0;->c(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "afAd"

    invoke-virtual {v0, p2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-static {p3}, Lcom/roblox/client/appsflyer/a;->K0(Ljava/util/Map;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lok/b0;->c(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "afAdset"

    invoke-virtual {v0, p2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p1, "media_source"

    invoke-interface {p3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lok/b0;->c(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "mediaSource"

    invoke-virtual {v0, p2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p1, "country_code"

    invoke-interface {p3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lok/b0;->c(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "country"

    invoke-virtual {v0, p2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p1, "campaign"

    invoke-interface {p3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Lok/b0;->c(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-static {p3}, Lcom/roblox/client/appsflyer/a;->N0(Ljava/util/Map;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lok/b0;->c(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "campaignId"

    invoke-virtual {v0, p2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p1, "is_retargeting"

    invoke-interface {p3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result p1

    const-string p2, "isRetargeting"

    invoke-virtual {v0, p2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    const-string p1, "retargeting_conversion_type"

    invoke-interface {p3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lok/b0;->c(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "retargetingConversionType"

    invoke-virtual {v0, p2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p1, "af_siteid"

    invoke-interface {p3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lok/b0;->c(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "siteId"

    invoke-virtual {v0, p2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p1, "af_channel"

    invoke-interface {p3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lok/b0;->c(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "channel"

    invoke-virtual {v0, p2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    move-result-object p1

    iget-object p2, p0, Lcom/roblox/client/appsflyer/a;->b:Landroid/content/Context;

    invoke-virtual {p1, p2}, Lcom/appsflyer/AppsFlyerLib;->getAppsFlyerUID(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lok/b0;->c(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "appsflyerId"

    invoke-virtual {v0, p2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p1, "deep_link_value"

    invoke-interface {p3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lok/b0;->c(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "deepLinkValue"

    invoke-virtual {v0, p2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p1, "af_dp"

    invoke-interface {p3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lok/b0;->c(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "afDp"

    invoke-virtual {v0, p2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p1, "install_time"

    invoke-interface {p3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/roblox/client/appsflyer/a;->V0(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "installTime"

    invoke-virtual {v0, p2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p1, "platform"

    const-string p2, "ANDROID"

    invoke-virtual {v0, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "requestId"

    invoke-virtual {v0, p2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p1, "clientTime"

    invoke-static {}, Lcom/roblox/client/appsflyer/a;->j0()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    return-object v0
.end method

.method public final v(Landroid/content/Context;ZLorg/json/JSONObject;)V
    .locals 2

    invoke-static {p1}, Lcom/roblox/client/appsflyer/a;->Q(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    const-string v0, "delayedStartConsentApplySharingFilter"

    invoke-interface {p1, v0, p2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    const-string p2, "delayedStartConsentDma"

    if-eqz p3, :cond_0

    invoke-virtual {p3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-interface {p1, p2, p3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    goto :goto_0

    :cond_0
    invoke-interface {p1, p2}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    :goto_0
    const-string p2, "delayedStartConsentTs"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-interface {p1, p2, v0, v1}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    const-string p2, "delayedStartFreshnessTtlMs"

    invoke-virtual {p0}, Lcom/roblox/client/appsflyer/a;->G()J

    move-result-wide v0

    invoke-interface {p1, p2, v0, v1}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public final v0(Landroid/content/Context;)Lcom/roblox/client/appsflyer/a$d;
    .locals 8

    invoke-static {p1}, Lcom/roblox/client/appsflyer/a;->Q(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "delayedStartEligibilityTs"

    const-wide/16 v2, 0x0

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v4

    cmp-long v1, v4, v2

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    sub-long/2addr v6, v4

    invoke-virtual {p0}, Lcom/roblox/client/appsflyer/a;->G()J

    move-result-wide v3

    cmp-long v1, v6, v3

    if-lez v1, :cond_0

    goto :goto_1

    :cond_0
    const-string v1, "delayedStartFlagged"

    const/4 v3, 0x1

    invoke-virtual {p0, p1, v1, v3}, Lcom/roblox/client/appsflyer/a;->N(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result p1

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v1

    invoke-interface {v1}, Lbi/i;->K1()Z

    move-result v1

    const/4 v4, 0x0

    if-eqz v1, :cond_1

    const-string v5, "delayedStartEligibilityBlockAware"

    invoke-interface {v0, v5, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v5

    if-nez v5, :cond_1

    return-object v2

    :cond_1
    new-instance v2, Lcom/roblox/client/appsflyer/a$d;

    if-eqz v1, :cond_2

    const-string v1, "delayedStartAttributionBlocked"

    invoke-interface {v0, v1, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    move v3, v4

    :goto_0
    invoke-direct {v2, p1, v3}, Lcom/roblox/client/appsflyer/a$d;-><init>(ZZ)V

    :cond_3
    :goto_1
    return-object v2
.end method

.method public final w(Landroid/content/Context;Lcom/roblox/client/appsflyer/a$d;)V
    .locals 2

    invoke-static {p1}, Lcom/roblox/client/appsflyer/a;->Q(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    const-string v0, "delayedStartFlagged"

    iget-boolean v1, p2, Lcom/roblox/client/appsflyer/a$d;->a:Z

    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->K1()Z

    move-result v0

    const-string v1, "delayedStartEligibilityBlockAware"

    invoke-interface {p1, v1, v0}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    const-string v0, "delayedStartAttributionBlocked"

    iget-boolean p2, p2, Lcom/roblox/client/appsflyer/a$d;->b:Z

    invoke-interface {p1, v0, p2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    const-string p2, "delayedStartEligibilityTs"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-interface {p1, p2, v0, v1}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    const-string p2, "delayedStartFreshnessTtlMs"

    invoke-virtual {p0}, Lcom/roblox/client/appsflyer/a;->G()J

    move-result-wide v0

    invoke-interface {p1, p2, v0, v1}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public final x(Landroid/content/Context;Z)V
    .locals 2

    new-instance v0, Lcom/roblox/client/appsflyer/a$d;

    const/4 v1, 0x0

    invoke-direct {v0, p2, v1}, Lcom/roblox/client/appsflyer/a$d;-><init>(ZZ)V

    invoke-virtual {p0, p1, v0}, Lcom/roblox/client/appsflyer/a;->w(Landroid/content/Context;Lcom/roblox/client/appsflyer/a$d;)V

    return-void
.end method

.method public final x0(Landroid/content/Context;)Leh/b0;
    .locals 4

    invoke-static {p1}, Lcom/roblox/client/appsflyer/a;->Q(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p0}, Lcom/roblox/client/appsflyer/a;->G()J

    move-result-wide v2

    invoke-static {p1, v0, v1, v2, v3}, Leh/a;->d(Landroid/content/SharedPreferences;JJ)Leh/b0;

    move-result-object p1

    return-object p1
.end method

.method public y(Ljava/lang/String;)Z
    .locals 2

    iget-object v0, p0, Lcom/roblox/client/appsflyer/a;->k:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lcom/roblox/client/appsflyer/a;->i:Z

    if-eqz v1, :cond_0

    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->A0(Ljava/lang/String;)V

    const/4 p1, 0x0

    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/roblox/client/appsflyer/a;->i:Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v0, "Android-AppsFlyer-DeferredRoute"

    invoke-virtual {p0, v0}, Lcom/roblox/client/appsflyer/a;->A0(Ljava/lang/String;)V

    return p1

    :goto_0
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final y0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Lcom/roblox/client/datastructures/NameValuePair;

    const-string v2, "productId"

    invoke-direct {v1, v2, p1}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p1, Lcom/roblox/client/datastructures/NameValuePair;

    const-string v1, "price"

    invoke-direct {p1, v1, p2}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p1, Lcom/roblox/client/datastructures/NameValuePair;

    const-string p2, "currencyCode"

    invoke-direct {p1, p2, p3}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string p1, "purchaseReported"

    invoke-virtual {p0, p1, v0}, Lcom/roblox/client/appsflyer/a;->C0(Ljava/lang/String;Ljava/util/List;)V

    const-string p1, "Android-AppsFlyer-Purchase"

    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->B0(Ljava/lang/String;)V

    return-void
.end method

.method public final z(Landroid/content/Context;)V
    .locals 3

    iget-object v0, p0, Lcom/roblox/client/appsflyer/a;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-static {p1}, Lcom/roblox/client/appsflyer/a;->Q(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "delayedStartBackstopDeadline"

    invoke-interface {v1, v2}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "delayedStartBackstopEligibilityResolved"

    invoke-interface {v1, v2}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget-object v0, Lcom/roblox/client/appsflyer/ConsentBackstopWorker;->a:Lcom/roblox/client/appsflyer/ConsentBackstopWorker$a;

    invoke-virtual {v0, p1}, Lcom/roblox/client/appsflyer/ConsentBackstopWorker$a;->a(Landroid/content/Context;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final z0(Landroid/content/Context;)V
    .locals 10

    invoke-virtual {p0}, Lcom/roblox/client/appsflyer/a;->Y()Z

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Login retention: enabled="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "AppsFlyerManager"

    invoke-static {v2, v1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz v0, :cond_1

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    move-result-wide v1

    invoke-static {}, Lnk/c;->c()Lnk/c;

    move-result-object v3

    invoke-virtual {v3}, Lnk/c;->j()J

    move-result-wide v3

    invoke-static {v3, v4}, Lcom/roblox/client/appsflyer/a;->R(J)Ljava/lang/String;

    move-result-object v5

    const-wide/16 v6, 0x0

    invoke-static {p1, v5, v6, v7}, Lcom/roblox/client/appsflyer/a;->P(Landroid/content/Context;Ljava/lang/String;J)J

    move-result-wide v8

    cmp-long v5, v8, v6

    if-lez v5, :cond_1

    sget-object v5, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    sub-long/2addr v1, v8

    invoke-virtual {v5, v1, v2, v0}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    move-result-wide v0

    const-wide/16 v5, 0x1

    cmp-long v2, v0, v5

    if-ltz v2, :cond_1

    const-wide/16 v5, 0x3

    cmp-long v2, v0, v5

    if-gtz v2, :cond_1

    sget-object v2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    filled-new-array {v5}, [Ljava/lang/Object;

    move-result-object v5

    const-string v6, "af_retention_d%d"

    invoke-static {v2, v6, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    filled-new-array {v6}, [Ljava/lang/Object;

    move-result-object v6

    const-string v7, "Android-AppsFlyer-AppRetention-D%d"

    invoke-static {v2, v7, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "appRetentionReportedD%d"

    invoke-static {v2, v1, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, p1, v1, v2}, Lcom/roblox/client/appsflyer/a;->N(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v2

    if-nez v2, :cond_1

    const/4 v2, 0x1

    invoke-virtual {p0, p1, v1, v2}, Lcom/roblox/client/appsflyer/a;->G0(Landroid/content/Context;Ljava/lang/String;Z)V

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p1

    invoke-interface {p1}, Lbi/i;->c6()Z

    move-result p1

    const/4 v1, 0x0

    if-nez p1, :cond_0

    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    move-result-object p1

    iget-object v2, p0, Lcom/roblox/client/appsflyer/a;->b:Landroid/content/Context;

    invoke-virtual {p1, v2, v5, v1}, Lcom/appsflyer/AppsFlyerLib;->logEvent(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V

    :cond_0
    invoke-virtual {p0, v0, v1}, Lcom/roblox/client/appsflyer/a;->C0(Ljava/lang/String;Ljava/util/List;)V

    invoke-virtual {p0, v6}, Lcom/roblox/client/appsflyer/a;->B0(Ljava/lang/String;)V

    :cond_1
    return-void
.end method
