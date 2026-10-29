.class public Lwk/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwk/f;


# instance fields
.field public a:Lokhttp3/CookieJar;

.field public b:I

.field public c:I

.field public d:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lwk/c;-><init>(Lokhttp3/CookieJar;)V

    return-void
.end method

.method public constructor <init>(Lokhttp3/CookieJar;)V
    .locals 2

    const/16 v0, 0x1e

    .line 2
    invoke-static {}, Lvk/g;->e()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, p1, v0, v0, v1}, Lwk/c;-><init>(Lokhttp3/CookieJar;IILjava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Lokhttp3/CookieJar;IILjava/lang/String;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Lwk/c;->a:Lokhttp3/CookieJar;

    .line 5
    iput p2, p0, Lwk/c;->b:I

    .line 6
    iput p3, p0, Lwk/c;->c:I

    .line 7
    iput-object p4, p0, Lwk/c;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Lokhttp3/OkHttpClient;
    .locals 4

    new-instance v0, Lokhttp3/logging/HttpLoggingInterceptor;

    new-instance v1, Lwk/c$a;

    invoke-direct {v1, p0}, Lwk/c$a;-><init>(Lwk/c;)V

    invoke-direct {v0, v1}, Lokhttp3/logging/HttpLoggingInterceptor;-><init>(Lokhttp3/logging/HttpLoggingInterceptor$Logger;)V

    sget-object v1, Lokhttp3/logging/HttpLoggingInterceptor$Level;->BODY:Lokhttp3/logging/HttpLoggingInterceptor$Level;

    invoke-virtual {v0, v1}, Lokhttp3/logging/HttpLoggingInterceptor;->setLevel(Lokhttp3/logging/HttpLoggingInterceptor$Level;)Lokhttp3/logging/HttpLoggingInterceptor;

    new-instance v1, Lokhttp3/OkHttpClient$Builder;

    invoke-direct {v1}, Lokhttp3/OkHttpClient$Builder;-><init>()V

    invoke-virtual {v1, v0}, Lokhttp3/OkHttpClient$Builder;->addInterceptor(Lokhttp3/Interceptor;)Lokhttp3/OkHttpClient$Builder;

    iget-object v0, p0, Lwk/c;->d:Ljava/lang/String;

    if-eqz v0, :cond_0

    new-instance v2, Lyk/a;

    invoke-direct {v2, v0}, Lyk/a;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lokhttp3/OkHttpClient$Builder;->addNetworkInterceptor(Lokhttp3/Interceptor;)Lokhttp3/OkHttpClient$Builder;

    :cond_0
    new-instance v0, Lyk/b;

    invoke-direct {v0}, Lyk/b;-><init>()V

    invoke-virtual {v1, v0}, Lokhttp3/OkHttpClient$Builder;->addNetworkInterceptor(Lokhttp3/Interceptor;)Lokhttp3/OkHttpClient$Builder;

    iget v0, p0, Lwk/c;->b:I

    int-to-long v2, v0

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v1, v2, v3, v0}, Lokhttp3/OkHttpClient$Builder;->connectTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    iget v2, p0, Lwk/c;->c:I

    int-to-long v2, v2

    invoke-virtual {v1, v2, v3, v0}, Lokhttp3/OkHttpClient$Builder;->readTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    iget-object v0, p0, Lwk/c;->a:Lokhttp3/CookieJar;

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {}, Lwk/j;->c()Lwk/j;

    move-result-object v0

    :goto_0
    invoke-virtual {v1, v0}, Lokhttp3/OkHttpClient$Builder;->cookieJar(Lokhttp3/CookieJar;)Lokhttp3/OkHttpClient$Builder;

    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Lokhttp3/OkHttpClient$Builder;->followRedirects(Z)Lokhttp3/OkHttpClient$Builder;

    invoke-virtual {v1}, Lokhttp3/OkHttpClient$Builder;->build()Lokhttp3/OkHttpClient;

    move-result-object v0

    return-object v0
.end method
