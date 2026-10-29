.class public Lcom/roblox/client/appsflyer/a;
.super Lvi/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/client/appsflyer/a$d;
    }
.end annotation


# static fields
.field public static final k:Ljava/util/regex/Pattern;


# instance fields
.field public b:Landroid/content/Context;

.field public c:Z

.field public final d:Ljava/lang/Object;

.field public e:Z

.field public f:Z

.field public final g:Ljava/lang/Object;

.field public volatile h:Z

.field public i:Z

.field public j:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "[A-Za-z0-9_-]+"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/roblox/client/appsflyer/a;->k:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lvi/d;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roblox/client/appsflyer/a;->c:Z

    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Lcom/roblox/client/appsflyer/a;->d:Ljava/lang/Object;

    iput-boolean v0, p0, Lcom/roblox/client/appsflyer/a;->e:Z

    iput-boolean v0, p0, Lcom/roblox/client/appsflyer/a;->f:Z

    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Lcom/roblox/client/appsflyer/a;->g:Ljava/lang/Object;

    iput-boolean v0, p0, Lcom/roblox/client/appsflyer/a;->h:Z

    iput-boolean v0, p0, Lcom/roblox/client/appsflyer/a;->i:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roblox/client/appsflyer/a;->j:Ljava/lang/String;

    const-string v0, "AppsFlyerManager"

    const-string v1, "[AppsFlyerManager]: Constructor called."

    invoke-static {v0, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public static B0()Z
    .locals 1

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->C2()Z

    move-result v0

    return v0
.end method

.method public static F0(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;
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

.method public static varargs G([Ljava/lang/String;)Ljava/lang/String;
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

.method public static G0(Ljava/lang/Object;)Ljava/lang/String;
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

.method public static H0(Ljava/util/Map;)Z
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

.method public static I()Lcom/roblox/client/appsflyer/a;
    .locals 1

    invoke-static {}, Lcom/roblox/client/appsflyer/a$d;->a()Lcom/roblox/client/appsflyer/a;

    move-result-object v0

    return-object v0
.end method

.method public static J(Landroid/content/Context;Ljava/lang/String;J)J
    .locals 0

    invoke-static {p0}, Lcom/roblox/client/appsflyer/a;->K(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p0

    invoke-interface {p0, p1, p2, p3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static K(Landroid/content/Context;)Landroid/content/SharedPreferences;
    .locals 2

    const-string v0, "APPS_FLYER_SHARED_PREFS"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0

    return-object p0
.end method

.method public static L(J)Ljava/lang/String;
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

.method public static Q(JJJ)Z
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

.method public static W(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    if-eqz p0, :cond_6

    if-eqz p1, :cond_6

    const-string v0, "://navigation/crossdevice"

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_6

    sget-object v0, Lcom/roblox/client/appsflyer/a;->k:Ljava/util/regex/Pattern;

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

.method public static X()Ljava/lang/String;
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

.method public static c0(Ljava/lang/String;)Lorg/json/JSONObject;
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

.method public static d0(Ljava/lang/String;)Ljava/lang/Boolean;
    .locals 2

    const/4 v0, 0x0

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string p0, "isAdConsentRequired"

    invoke-virtual {v1, p0}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    instance-of v1, p0, Ljava/lang/Boolean;

    if-nez v1, :cond_1

    return-object v0

    :cond_1
    check-cast p0, Ljava/lang/Boolean;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    :cond_2
    :goto_0
    return-object v0
.end method

.method public static synthetic j(Lcom/roblox/client/appsflyer/a;Z)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->T(Z)V

    return-void
.end method

.method public static j0(Lokhttp3/Response;)Ljava/lang/Boolean;
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    move-result-object v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    invoke-virtual {p0}, Lokhttp3/Response;->isSuccessful()Z

    move-result p0

    if-eqz p0, :cond_0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lokhttp3/ResponseBody;->string()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/roblox/client/appsflyer/a;->d0(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {v1}, Lokhttp3/ResponseBody;->close()V

    return-object p0

    :catchall_0
    move-exception p0

    goto :goto_0

    :cond_0
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lokhttp3/ResponseBody;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    :cond_1
    return-object v0

    :goto_0
    if-eqz v1, :cond_2

    :try_start_3
    invoke-virtual {v1}, Lokhttp3/ResponseBody;->close()V
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

.method public static bridge synthetic k(Lcom/roblox/client/appsflyer/a;Landroid/content/Context;Ljava/lang/Boolean;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/roblox/client/appsflyer/a;->a0(Landroid/content/Context;Ljava/lang/Boolean;)V

    return-void
.end method

.method public static bridge synthetic l(Lokhttp3/Response;)Ljava/lang/Boolean;
    .locals 0

    invoke-static {p0}, Lcom/roblox/client/appsflyer/a;->j0(Lokhttp3/Response;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static n(ZLjava/lang/Boolean;)Z
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

.method public static s0(Landroid/content/Context;Ljava/lang/String;J)V
    .locals 0

    invoke-static {p0}, Lcom/roblox/client/appsflyer/a;->K(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p0

    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    invoke-interface {p0, p1, p2, p3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public static u0(Ljava/util/Map;)Ljava/lang/String;
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

    invoke-static {p0, v0}, Lcom/roblox/client/appsflyer/a;->z0(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/roblox/client/appsflyer/a;->B0()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p0}, Lcom/roblox/client/appsflyer/a;->H0(Ljava/util/Map;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "adgroup"

    invoke-static {p0, v1}, Lcom/roblox/client/appsflyer/a;->z0(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    filled-new-array {v0, p0}, [Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/roblox/client/appsflyer/a;->G([Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    :goto_0
    return-object v0
.end method

.method public static v0(Ljava/util/Map;)Ljava/lang/String;
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

    invoke-static {p0, v0}, Lcom/roblox/client/appsflyer/a;->z0(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/roblox/client/appsflyer/a;->B0()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "adset"

    invoke-static {p0, v1}, Lcom/roblox/client/appsflyer/a;->z0(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    filled-new-array {v0, p0}, [Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/roblox/client/appsflyer/a;->G([Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    return-object v0
.end method

.method public static w0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/roblox/client/appsflyer/a;->B0()Z

    move-result v0

    if-eqz v0, :cond_0

    filled-new-array {p0, p1, p2, p3}, [Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/roblox/client/appsflyer/a;->G([Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    filled-new-array {p0, p1}, [Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/roblox/client/appsflyer/a;->G([Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static x0(Ljava/util/Map;)Ljava/lang/String;
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

    invoke-static {p0, v0}, Lcom/roblox/client/appsflyer/a;->F0(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "af_adset"

    invoke-static {p0, v1}, Lcom/roblox/client/appsflyer/a;->F0(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "adgroup"

    invoke-static {p0, v2}, Lcom/roblox/client/appsflyer/a;->F0(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "adset"

    invoke-static {p0, v3}, Lcom/roblox/client/appsflyer/a;->F0(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, v1, v2, p0}, Lcom/roblox/client/appsflyer/a;->w0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static y0(Ljava/util/Map;)Ljava/lang/String;
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

    invoke-static {p0, v0}, Lcom/roblox/client/appsflyer/a;->z0(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/roblox/client/appsflyer/a;->B0()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "campaign_id"

    invoke-static {p0, v1}, Lcom/roblox/client/appsflyer/a;->z0(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    filled-new-array {v0, p0}, [Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/roblox/client/appsflyer/a;->G([Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    return-object v0
.end method

.method public static z()Lokhttp3/Request;
    .locals 2

    new-instance v0, Lokhttp3/Request$Builder;

    invoke-direct {v0}, Lokhttp3/Request$Builder;-><init>()V

    invoke-static {}, Lsg/a1;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lokhttp3/Request$Builder;->url(Ljava/lang/String;)Lokhttp3/Request$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/Request$Builder;->get()Lokhttp3/Request$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    move-result-object v0

    return-object v0
.end method

.method public static z0(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;
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
    invoke-static {p0}, Lgk/b0;->c(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final A()J
    .locals 4

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->Q5()I

    move-result v0

    int-to-long v0, v0

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    return-wide v0
.end method

.method public A0(Landroid/content/Context;Z)V
    .locals 2

    const-string v0, "disableDeeplinkTracking"

    xor-int/lit8 v1, p2, 0x1

    invoke-virtual {p0, p1, v0, v1}, Lcom/roblox/client/appsflyer/a;->r0(Landroid/content/Context;Ljava/lang/String;Z)V

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

    invoke-virtual {p0, p1, p2, v1}, Lcom/roblox/client/appsflyer/a;->f0(Landroid/content/Context;Ljava/lang/String;Z)V

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

.method public final B()V
    .locals 2

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

    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/appsflyer/AppsFlyerLib;->setDisableAdvertisingIdentifiers(Z)V

    :cond_0
    return-void
.end method

.method public final C(Landroid/content/Context;)V
    .locals 2

    invoke-static {}, Lei/k;->a()Lei/k;

    move-result-object v0

    invoke-virtual {v0}, Lei/k;->b()Lokhttp3/OkHttpClient;

    move-result-object v0

    invoke-static {}, Lcom/roblox/client/appsflyer/a;->z()Lokhttp3/Request;

    move-result-object v1

    invoke-virtual {v0, v1}, Lokhttp3/OkHttpClient;->newCall(Lokhttp3/Request;)Lokhttp3/Call;

    move-result-object v0

    new-instance v1, Lcom/roblox/client/appsflyer/a$c;

    invoke-direct {v1, p0, p1}, Lcom/roblox/client/appsflyer/a$c;-><init>(Lcom/roblox/client/appsflyer/a;Landroid/content/Context;)V

    invoke-interface {v0, v1}, Lokhttp3/Call;->enqueue(Lokhttp3/Callback;)V

    return-void
.end method

.method public final C0(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lcom/roblox/client/appsflyer/a;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lcom/roblox/client/appsflyer/a;->c:Z

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->S(Landroid/content/Context;)Z

    move-result v1

    const/4 v2, 0x1

    iput-boolean v2, p0, Lcom/roblox/client/appsflyer/a;->c:Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0, p1, p2, v1}, Lcom/roblox/client/appsflyer/a;->f0(Landroid/content/Context;Ljava/lang/String;Z)V

    return-void

    :goto_0
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public D(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/roblox/client/appsflyer/a;->E0(Landroid/content/Context;Ljava/lang/Boolean;)V

    return-void
.end method

.method public final D0(Landroid/content/Context;)V
    .locals 1

    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->S(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Android-AppsFlyer-Start-AtInit"

    invoke-virtual {p0, p1, v0}, Lcom/roblox/client/appsflyer/a;->C0(Landroid/content/Context;Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/roblox/client/appsflyer/a;->e0()V

    return-void
.end method

.method public E()V
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

    invoke-static {v0}, Lcom/roblox/client/appsflyer/a;->K(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "delayedStartBackstopDeadline"

    const-wide/16 v2, 0x0

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    cmp-long v2, v0, v2

    if-eqz v2, :cond_3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    cmp-long v0, v2, v0

    if-ltz v0, :cond_3

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->l5()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/roblox/client/appsflyer/a;->b:Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/roblox/client/appsflyer/a;->F(Landroid/content/Context;)V

    return-void

    :cond_2
    iget-object v0, p0, Lcom/roblox/client/appsflyer/a;->b:Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/roblox/client/appsflyer/a;->D(Landroid/content/Context;)V

    :cond_3
    :goto_0
    return-void

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final E0(Landroid/content/Context;Ljava/lang/Boolean;)V
    .locals 4

    iget-object v0, p0, Lcom/roblox/client/appsflyer/a;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lcom/roblox/client/appsflyer/a;->c:Z

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    const/4 v1, 0x1

    if-eqz p2, :cond_2

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v2

    invoke-interface {v2}, Lth/i;->l5()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-static {p1}, Lcom/roblox/client/appsflyer/a;->K(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v2

    const-string v3, "delayedStartBackstopEligibilityResolved"

    invoke-interface {v2, v3, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    invoke-virtual {p0, p1, v3}, Lcom/roblox/client/appsflyer/a;->t(Landroid/content/Context;Z)V

    :cond_1
    invoke-static {v2, p2}, Lcom/roblox/client/appsflyer/a;->n(ZLjava/lang/Boolean;)Z

    move-result p2

    goto :goto_0

    :cond_2
    move p2, v1

    :goto_0
    if-eqz p2, :cond_3

    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    move-result-object v2

    const-string v3, "all"

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/appsflyer/AppsFlyerLib;->setSharingFilterForPartners([Ljava/lang/String;)V

    const/4 v2, 0x0

    invoke-virtual {p0, p1, v1, v2}, Lcom/roblox/client/appsflyer/a;->s(Landroid/content/Context;ZLorg/json/JSONObject;)V

    :cond_3
    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->S(Landroid/content/Context;)Z

    move-result v2

    iput-boolean v1, p0, Lcom/roblox/client/appsflyer/a;->c:Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p2, :cond_4

    const-string p2, "Android-AppsFlyer-Start-Backstop"

    goto :goto_1

    :cond_4
    const-string p2, "Android-AppsFlyer-Start-BackstopGeoResolved"

    :goto_1
    invoke-virtual {p0, p1, p2, v2}, Lcom/roblox/client/appsflyer/a;->f0(Landroid/content/Context;Ljava/lang/String;Z)V

    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->v(Landroid/content/Context;)V

    return-void

    :goto_2
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public F(Landroid/content/Context;)V
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

    goto :goto_1

    :cond_0
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v1

    invoke-interface {v1}, Lth/i;->l5()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {p1}, Lcom/roblox/client/appsflyer/a;->K(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v2

    const-string v3, "delayedStartBackstopEligibilityResolved"

    const/4 v4, 0x1

    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v4, :cond_2

    const-string v0, "Android-AppsFlyer-Eligibility-Recheck-Attempted"

    invoke-virtual {p0, v0}, Lcom/roblox/client/appsflyer/a;->m0(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/roblox/client/appsflyer/a;->p0()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/roblox/client/appsflyer/a;->Z(Landroid/content/Context;Ljava/lang/Boolean;)V

    return-void

    :cond_2
    if-eqz v1, :cond_3

    const-string v0, "Android-AppsFlyer-Eligibility-Recheck-Skipped"

    invoke-virtual {p0, v0}, Lcom/roblox/client/appsflyer/a;->m0(Ljava/lang/String;)V

    :cond_3
    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->D(Landroid/content/Context;)V

    return-void

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final H(Landroid/content/Context;Ljava/lang/String;Z)Z
    .locals 0

    invoke-static {p1}, Lcom/roblox/client/appsflyer/a;->K(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p1

    invoke-interface {p1, p2, p3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    return p1
.end method

.method public M(Ljava/util/Map;)V
    .locals 8
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

    if-eqz v0, :cond_3

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v1

    invoke-interface {v1}, Lth/i;->d1()Z

    move-result v1

    const/4 v2, 0x0

    const-string v3, "android_appsflyer_re_engagement"

    const/4 v4, 0x0

    if-eqz v1, :cond_0

    invoke-static {}, Lkm/f;->D()Lkm/f;

    move-result-object v1

    invoke-virtual {v1, v0, v3, v2}, Lkm/f;->h(Ljava/lang/String;Ljava/lang/String;Z)Lorg/json/JSONObject;

    move-result-object v1

    goto :goto_0

    :cond_0
    invoke-static {}, Lkm/f;->D()Lkm/f;

    move-result-object v1

    invoke-virtual {v1, v0, v3, v2}, Lkm/f;->f(Ljava/lang/String;Ljava/lang/String;Z)V

    move-object v1, v4

    :goto_0
    const-string v2, "link"

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const-string v3, "af_ad"

    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const-string v5, "af_adset"

    invoke-interface {p1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    const-string v6, "adgroup"

    invoke-interface {p1, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    const-string v7, "adset"

    invoke-interface {p1, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-static {v3, v5, v6, v7}, Lcom/roblox/client/appsflyer/a;->w0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v5

    invoke-interface {v5}, Lth/i;->X5()Z

    move-result v5

    if-eqz v5, :cond_1

    const-string v5, "code"

    invoke-interface {p1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lcom/roblox/client/appsflyer/a;->W(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v1, :cond_1

    invoke-static {}, Lkm/f;->D()Lkm/f;

    move-result-object p1

    invoke-virtual {p1, v1, v0}, Lkm/f;->I(Lorg/json/JSONObject;Ljava/lang/String;)V

    :cond_1
    if-eqz v2, :cond_2

    invoke-static {}, Lkm/f;->D()Lkm/f;

    move-result-object p1

    invoke-virtual {p1, v0, v2, v3}, Lkm/f;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_2
    const-string p1, "AppsFlyerManager"

    const-string v1, "Received null attribution URL. This should never happen."

    invoke-static {p1, v1}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lkm/f;->D()Lkm/f;

    move-result-object p1

    invoke-virtual {p1, v0, v4, v3}, Lkm/f;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    return-void
.end method

.method public N(Ljava/util/Map;)V
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

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const-string v1, "is_first_launch"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->g0(Ljava/util/Map;)V

    :cond_0
    const/4 v1, 0x1

    const/4 v2, 0x0

    const-string v3, "code"

    const-string v4, "Android-AppsFlyer-DeferredRoute-Skip-Gcd"

    const-string v5, "android_appsflyer_gcd"

    const/4 v6, 0x0

    if-eqz v0, :cond_5

    const-string v7, "af_dp"

    invoke-interface {p1, v7}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5

    invoke-virtual {p0, v4}, Lcom/roblox/client/appsflyer/a;->u(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->X5()Z

    move-result v0

    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/Map$Entry;

    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v9

    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    if-nez v9, :cond_1

    if-eqz v0, :cond_1

    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    move-object v8, v6

    goto :goto_1

    :cond_1
    invoke-static {v9}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    :goto_1
    invoke-interface {v4, v10, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    invoke-interface {v4, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_4

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->d1()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, Lkm/f;->D()Lkm/f;

    move-result-object v0

    invoke-virtual {v0, p1, v5, v2}, Lkm/f;->h(Ljava/lang/String;Ljava/lang/String;Z)Lorg/json/JSONObject;

    goto :goto_2

    :cond_3
    invoke-static {}, Lkm/f;->D()Lkm/f;

    move-result-object v0

    invoke-virtual {v0, p1, v5, v1}, Lkm/f;->f(Ljava/lang/String;Ljava/lang/String;Z)V

    :cond_4
    :goto_2
    invoke-virtual {p0, v4}, Lcom/roblox/client/appsflyer/a;->M(Ljava/util/Map;)V

    return-void

    :cond_5
    if-eqz v0, :cond_9

    const-string v7, "deep_link_value"

    invoke-interface {p1, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    instance-of v8, v8, Ljava/lang/String;

    if-eqz v8, :cond_9

    invoke-interface {p1, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    invoke-virtual {v8}, Ljava/lang/String;->isEmpty()Z

    move-result v8

    if-nez v8, :cond_9

    invoke-interface {p1, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v4}, Lcom/roblox/client/appsflyer/a;->u(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v4

    invoke-interface {v4}, Lth/i;->d1()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-static {}, Lkm/f;->D()Lkm/f;

    move-result-object v1

    invoke-virtual {v1, v0, v5, v2}, Lkm/f;->h(Ljava/lang/String;Ljava/lang/String;Z)Lorg/json/JSONObject;

    move-result-object v1

    goto :goto_3

    :cond_6
    invoke-static {}, Lkm/f;->D()Lkm/f;

    move-result-object v2

    invoke-virtual {v2, v0, v5, v1}, Lkm/f;->f(Ljava/lang/String;Ljava/lang/String;Z)V

    move-object v1, v6

    :goto_3
    invoke-static {p1}, Lcom/roblox/client/appsflyer/a;->x0(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v4

    invoke-interface {v4}, Lth/i;->X5()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of v3, p1, Ljava/lang/String;

    if-eqz v3, :cond_7

    check-cast p1, Ljava/lang/String;

    goto :goto_4

    :cond_7
    move-object p1, v6

    :goto_4
    invoke-static {v0, p1}, Lcom/roblox/client/appsflyer/a;->W(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v1, :cond_8

    invoke-static {}, Lkm/f;->D()Lkm/f;

    move-result-object p1

    invoke-virtual {p1, v1, v0}, Lkm/f;->I(Lorg/json/JSONObject;Ljava/lang/String;)V

    :cond_8
    invoke-static {}, Lkm/f;->D()Lkm/f;

    move-result-object p1

    invoke-virtual {p1, v0, v6, v2}, Lkm/f;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_9
    if-eqz v0, :cond_a

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->R()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-static {p1}, Lcom/roblox/client/appsflyer/a;->x0(Ljava/util/Map;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_a

    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->h0(Ljava/lang/String;)V

    :cond_a
    return-void
.end method

.method public final O(Z)V
    .locals 1

    if-eqz p1, :cond_0

    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/appsflyer/AppsFlyerLib;->anonymizeUser(Z)V

    :cond_0
    return-void
.end method

.method public P(Lcom/appsflyer/share/deeplink/DeepLinkResult;)V
    .locals 8

    invoke-virtual {p1}, Lcom/appsflyer/share/deeplink/DeepLinkResult;->getStatus()Lcom/appsflyer/share/deeplink/DeepLinkResult$Status;

    move-result-object v0

    sget-object v1, Lcom/appsflyer/share/deeplink/DeepLinkResult$Status;->FOUND:Lcom/appsflyer/share/deeplink/DeepLinkResult$Status;

    if-ne v0, v1, :cond_4

    invoke-virtual {p1}, Lcom/appsflyer/share/deeplink/DeepLinkResult;->getDeepLink()Lcom/appsflyer/share/deeplink/DeepLink;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Lcom/appsflyer/share/deeplink/DeepLinkResult;->getDeepLink()Lcom/appsflyer/share/deeplink/DeepLink;

    move-result-object v0

    invoke-virtual {v0}, Lcom/appsflyer/share/deeplink/DeepLink;->getDeepLinkValue()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_4

    invoke-virtual {p1}, Lcom/appsflyer/share/deeplink/DeepLinkResult;->getDeepLink()Lcom/appsflyer/share/deeplink/DeepLink;

    move-result-object v1

    invoke-virtual {v1}, Lcom/appsflyer/share/deeplink/DeepLink;->isDeferred()Ljava/lang/Boolean;

    move-result-object v1

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v2, v1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, "Android-AppsFlyer-DeferredRoute-Skip-Udl"

    invoke-virtual {p0, v2}, Lcom/roblox/client/appsflyer/a;->u(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    goto/16 :goto_2

    :cond_0
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v2

    invoke-interface {v2}, Lth/i;->d1()Z

    move-result v2

    const/4 v3, 0x0

    const-string v4, "android_appsflyer_udl"

    if-eqz v2, :cond_1

    invoke-static {}, Lkm/f;->D()Lkm/f;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v4, v2}, Lkm/f;->h(Ljava/lang/String;Ljava/lang/String;Z)Lorg/json/JSONObject;

    move-result-object v1

    goto :goto_1

    :cond_1
    if-eqz v1, :cond_2

    invoke-static {}, Lkm/f;->D()Lkm/f;

    move-result-object v2

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v2, v0, v4, v1}, Lkm/f;->f(Ljava/lang/String;Ljava/lang/String;Z)V

    goto :goto_0

    :cond_2
    invoke-static {}, Lkm/f;->D()Lkm/f;

    move-result-object v1

    invoke-virtual {v1, v0, v4}, Lkm/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    move-object v1, v3

    :goto_1
    invoke-virtual {p1}, Lcom/appsflyer/share/deeplink/DeepLinkResult;->getDeepLink()Lcom/appsflyer/share/deeplink/DeepLink;

    move-result-object v2

    const-string v4, "af_ad"

    invoke-virtual {v2, v4}, Lcom/appsflyer/share/deeplink/DeepLink;->getStringValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/appsflyer/share/deeplink/DeepLinkResult;->getDeepLink()Lcom/appsflyer/share/deeplink/DeepLink;

    move-result-object v4

    const-string v5, "af_adset"

    invoke-virtual {v4, v5}, Lcom/appsflyer/share/deeplink/DeepLink;->getStringValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lcom/appsflyer/share/deeplink/DeepLinkResult;->getDeepLink()Lcom/appsflyer/share/deeplink/DeepLink;

    move-result-object v5

    const-string v6, "adgroup"

    invoke-virtual {v5, v6}, Lcom/appsflyer/share/deeplink/DeepLink;->getStringValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lcom/appsflyer/share/deeplink/DeepLinkResult;->getDeepLink()Lcom/appsflyer/share/deeplink/DeepLink;

    move-result-object v6

    const-string v7, "adset"

    invoke-virtual {v6, v7}, Lcom/appsflyer/share/deeplink/DeepLink;->getStringValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v2, v4, v5, v6}, Lcom/roblox/client/appsflyer/a;->w0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v4

    invoke-interface {v4}, Lth/i;->X5()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-virtual {p1}, Lcom/appsflyer/share/deeplink/DeepLinkResult;->getDeepLink()Lcom/appsflyer/share/deeplink/DeepLink;

    move-result-object p1

    const-string v4, "code"

    invoke-virtual {p1, v4}, Lcom/appsflyer/share/deeplink/DeepLink;->getStringValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/roblox/client/appsflyer/a;->W(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v1, :cond_3

    invoke-static {}, Lkm/f;->D()Lkm/f;

    move-result-object p1

    invoke-virtual {p1, v1, v0}, Lkm/f;->I(Lorg/json/JSONObject;Ljava/lang/String;)V

    :cond_3
    invoke-static {}, Lkm/f;->D()Lkm/f;

    move-result-object p1

    invoke-virtual {p1, v0, v3, v2}, Lkm/f;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    :goto_2
    return-void
.end method

.method public final R()Z
    .locals 1

    invoke-static {}, Lfk/c;->c()Lfk/c;

    move-result-object v0

    invoke-virtual {v0}, Lfk/c;->n()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lnh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final S(Landroid/content/Context;)Z
    .locals 2

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->D4()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const-string v0, "disableDeeplinkTracking"

    invoke-virtual {p0, p1, v0, v1}, Lcom/roblox/client/appsflyer/a;->H(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v1
.end method

.method public final synthetic T(Z)V
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/appsflyer/a;->b:Landroid/content/Context;

    invoke-virtual {p0, v0, p1}, Lcom/roblox/client/appsflyer/a;->A0(Landroid/content/Context;Z)V

    return-void
.end method

.method public final U(Landroid/content/Context;)V
    .locals 5

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->l5()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lcom/roblox/client/appsflyer/a;->K(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p1

    const-string v0, "delayedStartBackstopDeadline"

    const-wide/16 v1, 0x0

    invoke-interface {p1, v0, v1, v2}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v3

    cmp-long v0, v3, v1

    if-eqz v0, :cond_1

    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    const-string v0, "delayedStartBackstopEligibilityResolved"

    const/4 v1, 0x1

    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    :cond_1
    :goto_0
    return-void
.end method

.method public final V(Landroid/content/Context;)Z
    .locals 10

    invoke-static {p1}, Lcom/roblox/client/appsflyer/a;->K(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "delayedStartConsentTs"

    const-wide/16 v2, 0x0

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    invoke-virtual {p0}, Lcom/roblox/client/appsflyer/a;->A()J

    move-result-wide v8

    invoke-static/range {v4 .. v9}, Lcom/roblox/client/appsflyer/a;->Q(JJJ)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const-string v1, "delayedStartConsentApplySharingFilter"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    const-string v3, "delayedStartConsentDma"

    const/4 v4, 0x0

    invoke-interface {v0, v3, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roblox/client/appsflyer/a;->c0(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    iget-object v3, p0, Lcom/roblox/client/appsflyer/a;->d:Ljava/lang/Object;

    monitor-enter v3

    :try_start_0
    iget-boolean v4, p0, Lcom/roblox/client/appsflyer/a;->c:Z

    if-eqz v4, :cond_1

    monitor-exit v3

    return v2

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    move-result-object v4

    invoke-virtual {p0, v4, v0, v1}, Lcom/roblox/client/appsflyer/a;->o(Lcom/appsflyer/AppsFlyerLib;Lorg/json/JSONObject;Z)V

    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->S(Landroid/content/Context;)Z

    move-result v0

    iput-boolean v2, p0, Lcom/roblox/client/appsflyer/a;->c:Z

    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->v(Landroid/content/Context;)V

    const-string v1, "Android-AppsFlyer-Start-CachedConsent"

    invoke-virtual {p0, p1, v1, v0}, Lcom/roblox/client/appsflyer/a;->f0(Landroid/content/Context;Ljava/lang/String;Z)V

    return v2

    :goto_0
    :try_start_1
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public Y(Lorg/json/JSONObject;)V
    .locals 5

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

    move-result p1

    invoke-virtual {p0, v0, v2, p1}, Lcom/roblox/client/appsflyer/a;->o(Lcom/appsflyer/AppsFlyerLib;Lorg/json/JSONObject;Z)V

    iget-object v0, p0, Lcom/roblox/client/appsflyer/a;->b:Landroid/content/Context;

    invoke-virtual {p0, v0, p1, v2}, Lcom/roblox/client/appsflyer/a;->s(Landroid/content/Context;ZLorg/json/JSONObject;)V

    iget-boolean p1, p0, Lcom/roblox/client/appsflyer/a;->c:Z

    if-nez p1, :cond_0

    iget-object v0, p0, Lcom/roblox/client/appsflyer/a;->b:Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/roblox/client/appsflyer/a;->S(Landroid/content/Context;)Z

    move-result v0

    iput-boolean v4, p0, Lcom/roblox/client/appsflyer/a;->c:Z

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    :goto_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_1

    return-void

    :cond_1
    iget-object p1, p0, Lcom/roblox/client/appsflyer/a;->b:Landroid/content/Context;

    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->v(Landroid/content/Context;)V

    iget-object p1, p0, Lcom/roblox/client/appsflyer/a;->b:Landroid/content/Context;

    const-string v1, "Android-AppsFlyer-Start-Attribution"

    invoke-virtual {p0, p1, v1, v0}, Lcom/roblox/client/appsflyer/a;->f0(Landroid/content/Context;Ljava/lang/String;Z)V

    return-void

    :goto_1
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public Z(Landroid/content/Context;Ljava/lang/Boolean;)V
    .locals 1

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->l5()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->D(Landroid/content/Context;)V

    return-void

    :cond_0
    if-nez p2, :cond_1

    const-string v0, "Android-AppsFlyer-Eligibility-Recheck-Unresolved"

    invoke-virtual {p0, v0}, Lcom/roblox/client/appsflyer/a;->m0(Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "Android-AppsFlyer-Eligibility-Recheck-Flagged"

    goto :goto_0

    :cond_2
    const-string v0, "Android-AppsFlyer-Eligibility-Recheck-NotFlagged"

    :goto_0
    invoke-virtual {p0, v0}, Lcom/roblox/client/appsflyer/a;->m0(Ljava/lang/String;)V

    :goto_1
    invoke-virtual {p0, p1, p2}, Lcom/roblox/client/appsflyer/a;->E0(Landroid/content/Context;Ljava/lang/Boolean;)V

    return-void
.end method

.method public a(Landroid/content/Context;)V
    .locals 4

    invoke-static {}, Lnh/b;->a()Z

    move-result v0

    xor-int/lit8 v1, v0, 0x1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "init: initEnabled="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "AppsFlyerManager"

    invoke-static {v2, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    if-nez v0, :cond_2

    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    move-result-object v0

    const/16 v1, 0x5a

    invoke-virtual {v0, v1}, Lcom/appsflyer/AppsFlyerLib;->setMinTimeBetweenSessions(I)V

    const-string v1, "ro.blox.com"

    const-string v2, "go.roblox.com"

    const-string v3, "roblox.onelink.me"

    filled-new-array {v3, v1, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/appsflyer/AppsFlyerLib;->setOneLinkCustomDomain([Ljava/lang/String;)V

    const-string v1, "enableTracking"

    const/4 v2, 0x1

    invoke-virtual {p0, p1, v1, v2}, Lcom/roblox/client/appsflyer/a;->H(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {p0, v1}, Lcom/roblox/client/appsflyer/a;->O(Z)V

    new-instance v1, Lcom/roblox/client/appsflyer/a$a;

    invoke-direct {v1, p0}, Lcom/roblox/client/appsflyer/a$a;-><init>(Lcom/roblox/client/appsflyer/a;)V

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Lcom/appsflyer/AppsFlyerLib;->setCollectAndroidID(Z)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v3

    invoke-interface {v3}, Lth/i;->A5()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v0, v2}, Lcom/appsflyer/AppsFlyerLib;->setDisableAdvertisingIdentifiers(Z)V

    :cond_0
    const-string v2, "Quwp4RGsFwE6rVnyTFm6jQ"

    invoke-virtual {v0, v2, v1, p1}, Lcom/appsflyer/AppsFlyerLib;->init(Ljava/lang/String;Lcom/appsflyer/share/AppsFlyerConversionListener;Landroid/content/Context;)Lcom/appsflyer/AppsFlyerLib;

    new-instance v1, Lyg/a;

    invoke-direct {v1, p0}, Lyg/a;-><init>(Lcom/roblox/client/appsflyer/a;)V

    invoke-virtual {v0, v1}, Lcom/appsflyer/AppsFlyerLib;->registerSessionReadyListener(Lcom/appsflyer/share/SessionReadyListener;)V

    new-instance v1, Lcom/roblox/client/appsflyer/a$b;

    invoke-direct {v1, p0}, Lcom/roblox/client/appsflyer/a$b;-><init>(Lcom/roblox/client/appsflyer/a;)V

    invoke-virtual {v0, v1}, Lcom/appsflyer/AppsFlyerLib;->subscribeForDeepLink(Lcom/appsflyer/share/deeplink/DeepLinkListener;)V

    iput-object p1, p0, Lcom/roblox/client/appsflyer/a;->b:Landroid/content/Context;

    invoke-static {}, Lkm/f;->D()Lkm/f;

    move-result-object v1

    new-instance v2, Lyg/b;

    invoke-direct {v2, p0}, Lyg/b;-><init>(Lcom/roblox/client/appsflyer/a;)V

    invoke-virtual {v1, v2}, Lkm/f;->u(Lkm/f$h;)V

    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->q0(Landroid/content/Context;)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v1

    invoke-interface {v1}, Lth/i;->g4()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {}, Lkm/f;->D()Lkm/f;

    move-result-object v1

    new-instance v2, Lyg/c;

    invoke-direct {v2, p0}, Lyg/c;-><init>(Lcom/roblox/client/appsflyer/a;)V

    invoke-virtual {v1, v2}, Lkm/f;->v(Lkm/f$i;)V

    :cond_1
    invoke-static {}, Lkm/f;->D()Lkm/f;

    move-result-object v1

    invoke-virtual {v0, p1}, Lcom/appsflyer/AppsFlyerLib;->getAppsFlyerUID(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lkm/f;->C(Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public final a0(Landroid/content/Context;Ljava/lang/Boolean;)V
    .locals 3

    const/4 v0, 0x1

    if-nez p2, :cond_0

    const-string p2, "Android-AppsFlyer-Eligibility-Unresolved"

    invoke-virtual {p0, p2}, Lcom/roblox/client/appsflyer/a;->m0(Ljava/lang/String;)V

    const/4 p2, 0x0

    invoke-virtual {p0, p1, v0, p2}, Lcom/roblox/client/appsflyer/a;->p(Landroid/content/Context;ZZ)V

    return-void

    :cond_0
    iget-object v1, p0, Lcom/roblox/client/appsflyer/a;->d:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    invoke-virtual {p0, p1, v2}, Lcom/roblox/client/appsflyer/a;->t(Landroid/content/Context;Z)V

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->U(Landroid/content/Context;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    :goto_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v1, "Android-AppsFlyer-Eligibility-Flagged"

    goto :goto_1

    :cond_2
    const-string v1, "Android-AppsFlyer-Eligibility-NotFlagged"

    :goto_1
    invoke-virtual {p0, v1}, Lcom/roblox/client/appsflyer/a;->m0(Ljava/lang/String;)V

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-virtual {p0, p1, p2, v0}, Lcom/roblox/client/appsflyer/a;->p(Landroid/content/Context;ZZ)V

    return-void

    :goto_2
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public b()V
    .locals 2

    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/appsflyer/AppsFlyerLib;->setDisableAdvertisingIdentifiers(Z)V

    return-void
.end method

.method public b0()V
    .locals 3

    iget-object v0, p0, Lcom/roblox/client/appsflyer/a;->d:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, p0, Lcom/roblox/client/appsflyer/a;->h:Z

    iget-boolean v1, p0, Lcom/roblox/client/appsflyer/a;->i:Z

    if-nez v1, :cond_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/roblox/client/appsflyer/a;->j:Ljava/lang/String;

    const/4 v2, 0x0

    iput-boolean v2, p0, Lcom/roblox/client/appsflyer/a;->i:Z

    const/4 v2, 0x0

    iput-object v2, p0, Lcom/roblox/client/appsflyer/a;->j:Ljava/lang/String;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0, v1}, Lcom/roblox/client/appsflyer/a;->x(Ljava/lang/String;)V

    return-void

    :goto_0
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public c(Landroid/content/Context;)V
    .locals 3

    invoke-virtual {p0}, Lcom/roblox/client/appsflyer/a;->R()Z

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "first play: enabled="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "AppsFlyerManager"

    invoke-static {v2, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "firstPlayReported_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lfk/c;->c()Lfk/c;

    move-result-object v1

    invoke-virtual {v1}, Lfk/c;->j()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v0, v1}, Lcom/roblox/client/appsflyer/a;->H(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v1

    if-nez v1, :cond_1

    const/4 v1, 0x1

    invoke-virtual {p0, p1, v0, v1}, Lcom/roblox/client/appsflyer/a;->r0(Landroid/content/Context;Ljava/lang/String;Z)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->I3()Z

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

    invoke-virtual {p0, p1, v0}, Lcom/roblox/client/appsflyer/a;->o0(Ljava/lang/String;Ljava/util/List;)V

    const-string p1, "Android-AppsFlyer-FirstPlay"

    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->n0(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public d(Landroid/content/Context;)V
    .locals 3

    invoke-virtual {p0}, Lcom/roblox/client/appsflyer/a;->R()Z

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "login: enabled="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "AppsFlyerManager"

    invoke-static {v2, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/roblox/client/appsflyer/a;->B()V

    const-string v0, "loginReported"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/roblox/client/appsflyer/a;->o0(Ljava/lang/String;Ljava/util/List;)V

    const-string v0, "Android-AppsFlyer-Login"

    invoke-virtual {p0, v0}, Lcom/roblox/client/appsflyer/a;->n0(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->l0(Landroid/content/Context;)V

    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->y(Landroid/content/Context;)V

    return-void

    :cond_0
    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->m(Landroid/content/Context;)V

    return-void
.end method

.method public e(Landroid/content/Context;J)V
    .locals 5

    invoke-virtual {p0}, Lcom/roblox/client/appsflyer/a;->R()Z

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "playtime: enabled="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "AppsFlyerManager"

    invoke-static {v2, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "experiencePlaytimeReported_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lfk/c;->c()Lfk/c;

    move-result-object v1

    invoke-virtual {v1}, Lfk/c;->j()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v0, v1}, Lcom/roblox/client/appsflyer/a;->H(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v1

    if-nez v1, :cond_1

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0xf

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v1, v2, v3, v4}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    move-result-wide v1

    cmp-long p2, p2, v1

    if-ltz p2, :cond_1

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p2

    invoke-interface {p2}, Lth/i;->N5()Z

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

    invoke-virtual {p0, p2, p3}, Lcom/roblox/client/appsflyer/a;->o0(Ljava/lang/String;Ljava/util/List;)V

    const-string p2, "Android-AppsFlyer-ExperiencePlaytime"

    invoke-virtual {p0, p2}, Lcom/roblox/client/appsflyer/a;->n0(Ljava/lang/String;)V

    const/4 p2, 0x1

    invoke-virtual {p0, p1, v0, p2}, Lcom/roblox/client/appsflyer/a;->r0(Landroid/content/Context;Ljava/lang/String;Z)V

    :cond_1
    return-void
.end method

.method public final e0()V
    .locals 3

    iget-object v0, p0, Lvi/d;->a:Landroid/content/Intent;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroid/content/Intent;->getDataString()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lcom/appsflyer/AppsFlyerLib;->performDeepLinking(Ljava/lang/String;Z)V

    :cond_1
    :goto_0
    return-void
.end method

.method public f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZ)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p0}, Lcom/roblox/client/appsflyer/a;->R()Z

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

    invoke-static {p6, p5}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz p4, :cond_0

    invoke-virtual {p0, p1, p2, p3}, Lcom/roblox/client/appsflyer/a;->k0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final f0(Landroid/content/Context;Ljava/lang/String;Z)V
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
    iget-boolean p3, p0, Lcom/roblox/client/appsflyer/a;->h:Z

    if-nez p3, :cond_1

    iput-boolean v0, p0, Lcom/roblox/client/appsflyer/a;->i:Z

    iput-object p2, p0, Lcom/roblox/client/appsflyer/a;->j:Ljava/lang/String;

    monitor-exit p1

    return-void

    :catchall_0
    move-exception p2

    goto :goto_0

    :cond_1
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0, p2}, Lcom/roblox/client/appsflyer/a;->x(Ljava/lang/String;)V

    return-void

    :goto_0
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p2
.end method

.method public g(Landroid/content/Context;)V
    .locals 5

    invoke-virtual {p0}, Lcom/roblox/client/appsflyer/a;->R()Z

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "signup: enabled="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "AppsFlyerManager"

    invoke-static {v2, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/roblox/client/appsflyer/a;->B()V

    const-string v0, "signUpReported"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/roblox/client/appsflyer/a;->o0(Ljava/lang/String;Ljava/util/List;)V

    const-string v0, "Android-AppsFlyer-Registration"

    invoke-virtual {p0, v0}, Lcom/roblox/client/appsflyer/a;->n0(Ljava/lang/String;)V

    invoke-static {}, Lfk/c;->c()Lfk/c;

    move-result-object v0

    invoke-virtual {v0}, Lfk/c;->j()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/roblox/client/appsflyer/a;->L(J)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v1, v2, v3, v4}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    move-result-wide v1

    invoke-static {p1, v0, v1, v2}, Lcom/roblox/client/appsflyer/a;->s0(Landroid/content/Context;Ljava/lang/String;J)V

    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->y(Landroid/content/Context;)V

    return-void

    :cond_0
    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->m(Landroid/content/Context;)V

    return-void
.end method

.method public g0(Ljava/util/Map;)V
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

    sget-wide v1, Lsg/a1;->u:J

    const-wide/16 v3, 0x0

    cmp-long v3, v1, v3

    if-nez v3, :cond_0

    const-string p1, "Android-AppsFlyer-AttributionContext-Skip-BtidNotReady"

    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->n0(Ljava/lang/String;)V

    return-void

    :cond_0
    :try_start_0
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    const-string v4, "body"

    invoke-virtual {p0, v1, v2, p1}, Lcom/roblox/client/appsflyer/a;->r(JLjava/util/Map;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, v4, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-static {}, Lcom/roblox/universalapp/messagebus/MessageBus;->f()Lcom/roblox/universalapp/messagebus/MessageBus;

    move-result-object p1

    sget-object v1, Lmm/f;->a:Lmm/f;

    const-string v2, "Linking"

    const-string v4, "recordAttributionContext"

    invoke-virtual {v1, v2, v4}, Lmm/f;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1, v3}, Lcom/roblox/universalapp/messagebus/MessageBus;->l(Ljava/lang/String;Lorg/json/JSONObject;)V

    if-eqz v0, :cond_1

    const-string p1, "Android-AppsFlyer-AttributionContext-Published-Organic"

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_1
    const-string p1, "Android-AppsFlyer-AttributionContext-Published"

    :goto_0
    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->n0(Ljava/lang/String;)V
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

    invoke-static {v0, p1}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string p1, "Android-AppsFlyer-AttributionContext-Skip-JsonError"

    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->n0(Ljava/lang/String;)V

    return-void
.end method

.method public h0(Ljava/lang/String;)V
    .locals 4

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_2

    :cond_0
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->d3()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/roblox/client/appsflyer/a;->g:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lcom/roblox/client/appsflyer/a;->f:Z

    if-eqz v1, :cond_1

    const-string p1, "Android-AppsFlyer-DDR-Publish-Skip-Duplicate"

    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->m0(Ljava/lang/String;)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_1
    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/roblox/client/appsflyer/a;->f:Z

    monitor-exit v0

    goto :goto_1

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_2
    :goto_1
    :try_start_1
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "attributionAdName"

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-static {}, Lcom/roblox/universalapp/messagebus/MessageBus;->f()Lcom/roblox/universalapp/messagebus/MessageBus;

    move-result-object p1

    sget-object v1, Lmm/f;->a:Lmm/f;

    const-string v2, "Linking"

    const-string v3, "resolveAttributionAdName"

    invoke-virtual {v1, v2, v3}, Lmm/f;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1, v0}, Lcom/roblox/universalapp/messagebus/MessageBus;->l(Ljava/lang/String;Lorg/json/JSONObject;)V
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

    invoke-static {v0, p1}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_3
    :goto_2
    return-void
.end method

.method public i(Ljava/lang/String;)V
    .locals 1

    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/appsflyer/AppsFlyerLib;->setCustomerUserId(Ljava/lang/String;)V

    return-void
.end method

.method public final i0(Landroid/content/Context;)Ljava/lang/Boolean;
    .locals 4

    invoke-static {p1}, Lcom/roblox/client/appsflyer/a;->K(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "delayedStartEligibilityTs"

    const-wide/16 v2, 0x0

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    cmp-long v2, v0, v2

    if-eqz v2, :cond_1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v0

    invoke-virtual {p0}, Lcom/roblox/client/appsflyer/a;->A()J

    move-result-wide v0

    cmp-long v0, v2, v0

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "delayedStartFlagged"

    const/4 v1, 0x1

    invoke-virtual {p0, p1, v0, v1}, Lcom/roblox/client/appsflyer/a;->H(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final k0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
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

    invoke-virtual {p0, p1, v0}, Lcom/roblox/client/appsflyer/a;->o0(Ljava/lang/String;Ljava/util/List;)V

    const-string p1, "Android-AppsFlyer-Purchase"

    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->n0(Ljava/lang/String;)V

    return-void
.end method

.method public final l0(Landroid/content/Context;)V
    .locals 10

    invoke-virtual {p0}, Lcom/roblox/client/appsflyer/a;->R()Z

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Login retention: enabled="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "AppsFlyerManager"

    invoke-static {v2, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz v0, :cond_1

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    move-result-wide v1

    invoke-static {}, Lfk/c;->c()Lfk/c;

    move-result-object v3

    invoke-virtual {v3}, Lfk/c;->j()J

    move-result-wide v3

    invoke-static {v3, v4}, Lcom/roblox/client/appsflyer/a;->L(J)Ljava/lang/String;

    move-result-object v5

    const-wide/16 v6, 0x0

    invoke-static {p1, v5, v6, v7}, Lcom/roblox/client/appsflyer/a;->J(Landroid/content/Context;Ljava/lang/String;J)J

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

    invoke-virtual {p0, p1, v1, v2}, Lcom/roblox/client/appsflyer/a;->H(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v2

    if-nez v2, :cond_1

    const/4 v2, 0x1

    invoke-virtual {p0, p1, v1, v2}, Lcom/roblox/client/appsflyer/a;->r0(Landroid/content/Context;Ljava/lang/String;Z)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->a6()Z

    move-result p1

    const/4 v1, 0x0

    if-nez p1, :cond_0

    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    move-result-object p1

    iget-object v2, p0, Lcom/roblox/client/appsflyer/a;->b:Landroid/content/Context;

    invoke-virtual {p1, v2, v5, v1}, Lcom/appsflyer/AppsFlyerLib;->logEvent(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V

    :cond_0
    invoke-virtual {p0, v0, v1}, Lcom/roblox/client/appsflyer/a;->o0(Ljava/lang/String;Ljava/util/List;)V

    invoke-virtual {p0, v6}, Lcom/roblox/client/appsflyer/a;->n0(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public final m(Landroid/content/Context;)V
    .locals 2

    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/appsflyer/AppsFlyerLib;->anonymizeUser(Z)V

    const-string v0, "enableTracking"

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v0, v1}, Lcom/roblox/client/appsflyer/a;->r0(Landroid/content/Context;Ljava/lang/String;Z)V

    return-void
.end method

.method public final m0(Ljava/lang/String;)V
    .locals 3

    new-instance v0, Lsm/c$a;

    sget-object v1, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;->COUNTER:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;

    invoke-static {v1}, Lwf/k;->a(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Lsm/c$a;-><init>(Ljava/lang/String;Ljava/util/Set;)V

    const/4 p1, 0x7

    const/16 v1, 0x1e

    const/16 v2, 0x7ea

    invoke-virtual {v0, v2, p1, v1}, Lsm/c$a;->j(III)Lsm/c$a;

    move-result-object p1

    invoke-virtual {p1}, Lsm/c$a;->d()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;

    move-result-object p1

    invoke-static {p1}, Lsm/c;->b(Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;)Z

    return-void
.end method

.method public final n0(Ljava/lang/String;)V
    .locals 1

    invoke-static {}, Lvi/g;->b()Lvi/g;

    move-result-object v0

    invoke-virtual {v0, p1}, Lvi/g;->q(Ljava/lang/String;)V

    return-void
.end method

.method public final o(Lcom/appsflyer/AppsFlyerLib;Lorg/json/JSONObject;Z)V
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

    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->m0(Ljava/lang/String;)V

    return-void

    :cond_3
    const-string p2, ""

    filled-new-array {p2}, [Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/appsflyer/AppsFlyerLib;->setSharingFilterForPartners([Ljava/lang/String;)V

    const-string p1, "Android-AppsFlyer-Sharing-Filter-Cleared"

    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->m0(Ljava/lang/String;)V

    return-void
.end method

.method public final o0(Ljava/lang/String;Ljava/util/List;)V
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

    invoke-static {p1, v0, p2}, Lsg/t0;->i(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method

.method public p(Landroid/content/Context;ZZ)V
    .locals 2

    if-eqz p2, :cond_1

    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->V(Landroid/content/Context;)Z

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1, p3}, Lcom/roblox/client/appsflyer/a;->q(Landroid/content/Context;Z)V

    return-void

    :cond_1
    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->D0(Landroid/content/Context;)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p2

    invoke-interface {p2}, Lth/i;->l5()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-static {p1}, Lcom/roblox/client/appsflyer/a;->K(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p2

    const-string p3, "delayedStartBackstopDeadline"

    const-wide/16 v0, 0x0

    invoke-interface {p2, p3, v0, v1}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide p2

    cmp-long p2, p2, v0

    if-eqz p2, :cond_2

    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->v(Landroid/content/Context;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final p0()Ljava/lang/Boolean;
    .locals 2

    :try_start_0
    invoke-static {}, Lei/k;->a()Lei/k;

    move-result-object v0

    invoke-virtual {v0}, Lei/k;->b()Lokhttp3/OkHttpClient;

    move-result-object v0

    invoke-static {}, Lcom/roblox/client/appsflyer/a;->z()Lokhttp3/Request;

    move-result-object v1

    invoke-virtual {v0, v1}, Lokhttp3/OkHttpClient;->newCall(Lokhttp3/Request;)Lokhttp3/Call;

    move-result-object v0

    invoke-interface {v0}, Lokhttp3/Call;->execute()Lokhttp3/Response;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    invoke-static {v0}, Lcom/roblox/client/appsflyer/a;->j0(Lokhttp3/Response;)Ljava/lang/Boolean;

    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v0, :cond_0

    :try_start_2
    invoke-virtual {v0}, Lokhttp3/Response;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    :cond_0
    return-object v1

    :catchall_0
    move-exception v1

    if-eqz v0, :cond_1

    :try_start_3
    invoke-virtual {v0}, Lokhttp3/Response;->close()V
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

.method public final q(Landroid/content/Context;Z)V
    .locals 6

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->l5()Z

    move-result v0

    const-wide/16 v1, 0x0

    if-nez v0, :cond_1

    invoke-static {p1}, Lcom/roblox/client/appsflyer/a;->K(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p2

    const-string v0, "delayedStartBackstopDeadline"

    invoke-interface {p2, v0, v1, v2}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v3

    cmp-long p2, v3, v1

    if-nez p2, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p0}, Lcom/roblox/client/appsflyer/a;->w()J

    move-result-wide v2

    add-long v3, v0, v2

    invoke-static {p1}, Lcom/roblox/client/appsflyer/a;->K(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p2

    invoke-interface {p2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p2

    const-string v0, "delayedStartBackstopDeadline"

    invoke-interface {p2, v0, v3, v4}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object p2

    invoke-interface {p2}, Landroid/content/SharedPreferences$Editor;->apply()V

    :cond_0
    invoke-virtual {p0, p1, v3, v4}, Lcom/roblox/client/appsflyer/a;->t0(Landroid/content/Context;J)V

    return-void

    :cond_1
    iget-object v0, p0, Lcom/roblox/client/appsflyer/a;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v3, p0, Lcom/roblox/client/appsflyer/a;->c:Z

    if-eqz v3, :cond_2

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_2
    invoke-static {p1}, Lcom/roblox/client/appsflyer/a;->K(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v3

    const-string v4, "delayedStartBackstopDeadline"

    invoke-interface {v3, v4, v1, v2}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v4

    cmp-long v1, v4, v1

    if-nez v1, :cond_3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {p0}, Lcom/roblox/client/appsflyer/a;->w()J

    move-result-wide v4

    add-long/2addr v4, v1

    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "delayedStartBackstopDeadline"

    invoke-interface {v1, v2, v4, v5}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "delayedStartBackstopEligibilityResolved"

    invoke-interface {v1, v2, p2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object p2

    invoke-interface {p2}, Landroid/content/SharedPreferences$Editor;->apply()V

    goto :goto_0

    :cond_3
    if-eqz p2, :cond_4

    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p2

    const-string v1, "delayedStartBackstopEligibilityResolved"

    const/4 v2, 0x1

    invoke-interface {p2, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object p2

    invoke-interface {p2}, Landroid/content/SharedPreferences$Editor;->apply()V

    :cond_4
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0, p1, v4, v5}, Lcom/roblox/client/appsflyer/a;->t0(Landroid/content/Context;J)V

    return-void

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final q0(Landroid/content/Context;)V
    .locals 3

    iget-object v0, p0, Lcom/roblox/client/appsflyer/a;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->i0(Landroid/content/Context;)Ljava/lang/Boolean;

    move-result-object v1

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v2, v1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->U(Landroid/content/Context;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_1

    const-string v0, "Android-AppsFlyer-Eligibility-CacheHit"

    invoke-virtual {p0, v0}, Lcom/roblox/client/appsflyer/a;->m0(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v1, 0x1

    invoke-virtual {p0, p1, v0, v1}, Lcom/roblox/client/appsflyer/a;->p(Landroid/content/Context;ZZ)V

    return-void

    :cond_1
    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->C(Landroid/content/Context;)V

    return-void

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public r(JLjava/util/Map;)Lorg/json/JSONObject;
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

    invoke-static {p3}, Lcom/roblox/client/appsflyer/a;->u0(Ljava/util/Map;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lgk/b0;->c(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "afAd"

    invoke-virtual {v0, p2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-static {p3}, Lcom/roblox/client/appsflyer/a;->v0(Ljava/util/Map;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lgk/b0;->c(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "afAdset"

    invoke-virtual {v0, p2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p1, "media_source"

    invoke-interface {p3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lgk/b0;->c(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "mediaSource"

    invoke-virtual {v0, p2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p1, "country_code"

    invoke-interface {p3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lgk/b0;->c(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "country"

    invoke-virtual {v0, p2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p1, "campaign"

    invoke-interface {p3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Lgk/b0;->c(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-static {p3}, Lcom/roblox/client/appsflyer/a;->y0(Ljava/util/Map;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lgk/b0;->c(Ljava/lang/Object;)Ljava/lang/String;

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

    invoke-static {p1}, Lgk/b0;->c(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "retargetingConversionType"

    invoke-virtual {v0, p2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p1, "af_siteid"

    invoke-interface {p3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lgk/b0;->c(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "siteId"

    invoke-virtual {v0, p2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p1, "af_channel"

    invoke-interface {p3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lgk/b0;->c(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "channel"

    invoke-virtual {v0, p2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    move-result-object p1

    iget-object p2, p0, Lcom/roblox/client/appsflyer/a;->b:Landroid/content/Context;

    invoke-virtual {p1, p2}, Lcom/appsflyer/AppsFlyerLib;->getAppsFlyerUID(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lgk/b0;->c(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "appsflyerId"

    invoke-virtual {v0, p2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p1, "deep_link_value"

    invoke-interface {p3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lgk/b0;->c(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "deepLinkValue"

    invoke-virtual {v0, p2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p1, "af_dp"

    invoke-interface {p3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lgk/b0;->c(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "afDp"

    invoke-virtual {v0, p2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p1, "install_time"

    invoke-interface {p3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/roblox/client/appsflyer/a;->G0(Ljava/lang/Object;)Ljava/lang/String;

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

    invoke-static {}, Lcom/roblox/client/appsflyer/a;->X()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    return-object v0
.end method

.method public final r0(Landroid/content/Context;Ljava/lang/String;Z)V
    .locals 0

    invoke-static {p1}, Lcom/roblox/client/appsflyer/a;->K(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1, p2, p3}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public final s(Landroid/content/Context;ZLorg/json/JSONObject;)V
    .locals 2

    invoke-static {p1}, Lcom/roblox/client/appsflyer/a;->K(Landroid/content/Context;)Landroid/content/SharedPreferences;

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

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public final t(Landroid/content/Context;Z)V
    .locals 2

    invoke-static {p1}, Lcom/roblox/client/appsflyer/a;->K(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    const-string v0, "delayedStartFlagged"

    invoke-interface {p1, v0, p2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    const-string p2, "delayedStartEligibilityTs"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-interface {p1, p2, v0, v1}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public final t0(Landroid/content/Context;J)V
    .locals 2

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long/2addr p2, v0

    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-gtz v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->D(Landroid/content/Context;)V

    return-void

    :cond_0
    sget-object v0, Lcom/roblox/client/appsflyer/ConsentBackstopWorker;->a:Lcom/roblox/client/appsflyer/ConsentBackstopWorker$a;

    invoke-virtual {v0, p1, p2, p3}, Lcom/roblox/client/appsflyer/ConsentBackstopWorker$a;->b(Landroid/content/Context;J)V

    return-void
.end method

.method public u(Ljava/lang/String;)Z
    .locals 3

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->d3()Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lcom/roblox/client/appsflyer/a;->g:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v2, p0, Lcom/roblox/client/appsflyer/a;->e:Z

    if-eqz v2, :cond_1

    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->m0(Ljava/lang/String;)V

    const/4 p1, 0x0

    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_1
    iput-boolean v1, p0, Lcom/roblox/client/appsflyer/a;->e:Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string p1, "Android-AppsFlyer-DeferredRoute"

    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->m0(Ljava/lang/String;)V

    return v1

    :goto_0
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final v(Landroid/content/Context;)V
    .locals 3

    iget-object v0, p0, Lcom/roblox/client/appsflyer/a;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-static {p1}, Lcom/roblox/client/appsflyer/a;->K(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "delayedStartBackstopDeadline"

    invoke-interface {v1, v2}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v2

    invoke-interface {v2}, Lth/i;->l5()Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, "delayedStartBackstopEligibilityResolved"

    invoke-interface {v1, v2}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget-object v0, Lcom/roblox/client/appsflyer/ConsentBackstopWorker;->a:Lcom/roblox/client/appsflyer/ConsentBackstopWorker$a;

    invoke-virtual {v0, p1}, Lcom/roblox/client/appsflyer/ConsentBackstopWorker$a;->a(Landroid/content/Context;)V

    return-void

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final w()J
    .locals 4

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->x4()I

    move-result v0

    int-to-long v0, v0

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    return-wide v0
.end method

.method public final x(Ljava/lang/String;)V
    .locals 1

    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    move-result-object v0

    invoke-virtual {v0}, Lcom/appsflyer/AppsFlyerLib;->start()V

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Lcom/roblox/client/appsflyer/a;->m0(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p0}, Lcom/roblox/client/appsflyer/a;->e0()V

    return-void
.end method

.method public final y(Landroid/content/Context;)V
    .locals 2

    const-string v0, "enableTracking"

    const/4 v1, 0x1

    invoke-virtual {p0, p1, v0, v1}, Lcom/roblox/client/appsflyer/a;->r0(Landroid/content/Context;Ljava/lang/String;Z)V

    invoke-virtual {p0, v1}, Lcom/roblox/client/appsflyer/a;->O(Z)V

    return-void
.end method
