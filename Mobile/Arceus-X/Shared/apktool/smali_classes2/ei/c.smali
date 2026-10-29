.class public Lei/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lei/c$a;
    }
.end annotation


# static fields
.field public static a:Lwk/j;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static a()V
    .locals 1

    const/4 v0, 0x0

    sput-object v0, Lei/c;->a:Lwk/j;

    invoke-static {v0}, Ljava/net/CookieHandler;->setDefault(Ljava/net/CookieHandler;)V

    return-void
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;[Lei/c$a;Ljava/lang/String;)Lei/j;
    .locals 1

    invoke-static {}, Lvk/g;->b()Lokhttp3/OkHttpClient;

    move-result-object v0

    invoke-static {v0, p0, p1, p2, p3}, Lei/c;->d(Lokhttp3/OkHttpClient;Ljava/lang/String;Ljava/lang/String;[Lei/c$a;Ljava/lang/String;)Lei/j;

    move-result-object p0

    return-object p0
.end method

.method public static c(Ljava/lang/String;Ljava/lang/String;[Lei/c$a;Ljava/lang/String;II)Lei/j;
    .locals 3

    invoke-static {}, Lvk/g;->b()Lokhttp3/OkHttpClient;

    move-result-object v0

    if-gez p4, :cond_0

    if-ltz p5, :cond_3

    :cond_0
    invoke-virtual {v0}, Lokhttp3/OkHttpClient;->newBuilder()Lokhttp3/OkHttpClient$Builder;

    move-result-object v0

    if-ltz p4, :cond_1

    int-to-long v1, p4

    sget-object p4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, p4}, Lokhttp3/OkHttpClient$Builder;->connectTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    :cond_1
    if-ltz p5, :cond_2

    int-to-long p4, p5

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, p4, p5, v1}, Lokhttp3/OkHttpClient$Builder;->readTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    :cond_2
    invoke-virtual {v0}, Lokhttp3/OkHttpClient$Builder;->build()Lokhttp3/OkHttpClient;

    move-result-object v0

    :cond_3
    invoke-static {v0, p0, p1, p2, p3}, Lei/c;->d(Lokhttp3/OkHttpClient;Ljava/lang/String;Ljava/lang/String;[Lei/c$a;Ljava/lang/String;)Lei/j;

    move-result-object p0

    return-object p0
.end method

.method public static d(Lokhttp3/OkHttpClient;Ljava/lang/String;Ljava/lang/String;[Lei/c$a;Ljava/lang/String;)Lei/j;
    .locals 11

    const-string v1, ", exception = "

    const-string v2, "rbx.httpagent"

    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    if-eqz p3, :cond_1

    array-length v0, p3

    if-gtz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    aget-object p0, p3, p0

    const/4 p0, 0x0

    throw p0

    :cond_1
    :goto_0
    new-instance p3, Lei/j;

    invoke-direct {p3}, Lei/j;-><init>()V

    if-nez p2, :cond_2

    sget-object v0, Lei/j$a;->a:Lei/j$a;

    goto :goto_1

    :cond_2
    sget-object v0, Lei/j$a;->b:Lei/j$a;

    :goto_1
    iput-object v0, p3, Lei/j;->a:Lei/j$a;

    iput-object p1, p3, Lei/j;->c:Ljava/lang/String;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    :try_start_0
    new-instance v3, Lwk/g;

    invoke-direct {v3}, Lwk/g;-><init>()V
    :try_end_0
    .catch Ljavax/net/ssl/SSLHandshakeException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_4

    move-object v4, p0

    move-object v5, p1

    move-object v6, p2

    move-object v8, p4

    :try_start_1
    invoke-virtual/range {v3 .. v8}, Lwk/g;->a(Lokhttp3/OkHttpClient;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)Lokhttp3/Response;

    move-result-object p0

    invoke-virtual {p0}, Lokhttp3/Response;->code()I

    move-result p1

    iput p1, p3, Lei/j;->e:I

    invoke-virtual {p0}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    move-result-object p1

    invoke-virtual {p1}, Lokhttp3/ResponseBody;->string()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Lei/j;->d(Ljava/lang/String;)V

    const-string p1, "Last-Modified"

    const-string p2, ""

    invoke-virtual {p0, p1, p2}, Lokhttp3/Response;->header(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p3, p0}, Lei/j;->c(Ljava/lang/String;)V
    :try_end_1
    .catch Ljavax/net/ssl/SSLHandshakeException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_4

    goto :goto_6

    :catch_0
    move-exception v0

    :goto_2
    move-object p0, v0

    goto :goto_4

    :catch_1
    move-exception v0

    :goto_3
    move-object p0, v0

    goto :goto_5

    :catch_2
    move-exception v0

    move-object v5, p1

    goto :goto_2

    :catch_3
    move-exception v0

    move-object v5, p1

    goto :goto_3

    :catch_4
    const-string p0, "null url in newCall()"

    invoke-static {v2, p0}, Lgk/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_6

    :goto_4
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "IOException initial newCall(): url = "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v2, p0}, Lgk/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_6

    :goto_5
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "SSLHandshakeException initial newCall(): url = "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v2, p0}, Lgk/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p0, 0x1

    iput-boolean p0, p3, Lei/j;->g:Z

    :goto_6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p0

    sub-long/2addr p0, v9

    iput-wide p0, p3, Lei/j;->f:J

    return-object p3
.end method

.method public static e(Landroid/content/Context;)V
    .locals 0

    sget-object p0, Lei/c;->a:Lwk/j;

    if-nez p0, :cond_0

    invoke-static {}, Lwk/j;->c()Lwk/j;

    move-result-object p0

    sput-object p0, Lei/c;->a:Lwk/j;

    invoke-static {p0}, Ljava/net/CookieHandler;->setDefault(Ljava/net/CookieHandler;)V

    :cond_0
    return-void
.end method

.method public static f(Ljava/io/File;Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public static g()V
    .locals 0

    return-void
.end method

.method public static h()V
    .locals 0

    return-void
.end method

.method public static i(Ljava/lang/String;Ljava/lang/String;[Lei/c$a;)Lei/j;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, p1, p2, v0}, Lei/c;->k(Ljava/lang/String;Ljava/lang/String;[Lei/c$a;Ljava/lang/String;)Lei/j;

    move-result-object p0

    return-object p0
.end method

.method public static j(Ljava/lang/String;Ljava/lang/String;[Lei/c$a;Ljava/lang/String;)Lei/j;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lei/c;->k(Ljava/lang/String;Ljava/lang/String;[Lei/c$a;Ljava/lang/String;)Lei/j;

    move-result-object p0

    return-object p0
.end method

.method public static k(Ljava/lang/String;Ljava/lang/String;[Lei/c$a;Ljava/lang/String;)Lei/j;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lei/c;->b(Ljava/lang/String;Ljava/lang/String;[Lei/c$a;Ljava/lang/String;)Lei/j;

    move-result-object p0

    return-object p0
.end method

.method public static l(Ljava/lang/String;Ljava/lang/String;[Lei/c$a;Ljava/lang/String;II)Lei/j;
    .locals 0

    invoke-static/range {p0 .. p5}, Lei/c;->c(Ljava/lang/String;Ljava/lang/String;[Lei/c$a;Ljava/lang/String;II)Lei/j;

    move-result-object p0

    return-object p0
.end method
