.class public Lei/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lei/k$a;
    }
.end annotation


# instance fields
.field public a:Lokhttp3/OkHttpClient;

.field public b:I

.field public c:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x5

    iput v0, p0, Lei/k;->b:I

    iput v0, p0, Lei/k;->c:I

    return-void
.end method

.method public static a()Lei/k;
    .locals 1

    invoke-static {}, Lei/k$a;->a()Lei/k;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public b()Lokhttp3/OkHttpClient;
    .locals 5

    iget-object v0, p0, Lei/k;->a:Lokhttp3/OkHttpClient;

    if-nez v0, :cond_0

    new-instance v0, Lwk/c;

    iget v1, p0, Lei/k;->b:I

    iget v2, p0, Lei/k;->c:I

    invoke-static {}, Lvk/g;->e()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-direct {v0, v4, v1, v2, v3}, Lwk/c;-><init>(Lokhttp3/CookieJar;IILjava/lang/String;)V

    invoke-virtual {v0}, Lwk/c;->a()Lokhttp3/OkHttpClient;

    move-result-object v0

    iput-object v0, p0, Lei/k;->a:Lokhttp3/OkHttpClient;

    :cond_0
    iget-object v0, p0, Lei/k;->a:Lokhttp3/OkHttpClient;

    return-object v0
.end method
