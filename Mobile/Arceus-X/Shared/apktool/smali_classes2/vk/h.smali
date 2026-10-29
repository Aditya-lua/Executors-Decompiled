.class public Lvk/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lvk/d;


# instance fields
.field public a:Lzk/k;

.field public b:Lzk/d;

.field public c:Lzk/e;

.field public d:Lzk/h;

.field public e:Lzk/j;

.field public f:Lzk/i;

.field public g:Lzk/g;

.field public h:Lzk/f;

.field public i:Lzk/n;

.field public j:Lzk/b;

.field public k:Lzk/c;

.field public l:Lzk/a;

.field public m:Lzk/m;

.field public n:Lokhttp3/OkHttpClient;

.field public o:Ljv/e$a;


# direct methods
.method public constructor <init>(Lokhttp3/OkHttpClient;Ljv/e$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvk/h;->n:Lokhttp3/OkHttpClient;

    iput-object p2, p0, Lvk/h;->o:Ljv/e$a;

    return-void
.end method


# virtual methods
.method public a()Lzk/h;
    .locals 2

    iget-object v0, p0, Lvk/h;->d:Lzk/h;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Metrics interface not initialized"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public b()Lzk/f;
    .locals 2

    iget-object v0, p0, Lvk/h;->h:Lzk/f;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Friends interface not initialized"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public c(Lvk/b;)Lzk/i;
    .locals 2

    iget-object v0, p0, Lvk/h;->f:Lzk/i;

    if-nez v0, :cond_0

    new-instance v0, Lzk/l;

    const-string v1, "apis"

    iget-object p1, p1, Lvk/b;->a:Ljava/lang/String;

    invoke-direct {v0, v1, p1}, Lzk/l;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lvk/h;->n:Lokhttp3/OkHttpClient;

    invoke-virtual {v0, p1}, Lzk/l;->f(Lokhttp3/OkHttpClient;)Lzk/l;

    move-result-object p1

    iget-object v0, p0, Lvk/h;->o:Ljv/e$a;

    invoke-virtual {p1, v0}, Lzk/l;->e(Ljv/e$a;)Lzk/l;

    move-result-object p1

    const-class v0, Lzk/i;

    invoke-virtual {p1, v0}, Lzk/l;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lzk/i;

    iput-object p1, p0, Lvk/h;->f:Lzk/i;

    :cond_0
    iget-object p1, p0, Lvk/h;->f:Lzk/i;

    return-object p1
.end method

.method public d()Lzk/k;
    .locals 2

    iget-object v0, p0, Lvk/h;->a:Lzk/k;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "PlatformChat interface not initialized"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public e()Lzk/m;
    .locals 2

    iget-object v0, p0, Lvk/h;->m:Lzk/m;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Thumbnails interface not initialized"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public f(Lokhttp3/OkHttpClient;)Lzk/g;
    .locals 3

    new-instance v0, Lzk/l;

    invoke-static {}, Lvk/g;->c()Lvk/b;

    move-result-object v1

    iget-object v1, v1, Lvk/b;->a:Ljava/lang/String;

    const-string v2, "locale"

    invoke-direct {v0, v2, v1}, Lzk/l;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lzk/l;->f(Lokhttp3/OkHttpClient;)Lzk/l;

    move-result-object p1

    iget-object v0, p0, Lvk/h;->o:Ljv/e$a;

    invoke-virtual {p1, v0}, Lzk/l;->e(Ljv/e$a;)Lzk/l;

    move-result-object p1

    const-class v0, Lzk/g;

    invoke-virtual {p1, v0}, Lzk/l;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lzk/g;

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "Locale interface not initialized"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public g()Lzk/j;
    .locals 2

    iget-object v0, p0, Lvk/h;->e:Lzk/j;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Notifications interface not initialized"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public h()Lzk/b;
    .locals 2

    iget-object v0, p0, Lvk/h;->j:Lzk/b;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "AccountSettings interface not initialized"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public i(Lvk/b;)Lvk/d;
    .locals 3

    iget-object v0, p0, Lvk/h;->a:Lzk/k;

    if-nez v0, :cond_0

    new-instance v0, Lzk/l;

    const-string v1, "apis"

    iget-object v2, p1, Lvk/b;->a:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Lzk/l;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lvk/h;->n:Lokhttp3/OkHttpClient;

    invoke-virtual {v0, v1}, Lzk/l;->f(Lokhttp3/OkHttpClient;)Lzk/l;

    move-result-object v0

    iget-object v1, p0, Lvk/h;->o:Ljv/e$a;

    invoke-virtual {v0, v1}, Lzk/l;->e(Ljv/e$a;)Lzk/l;

    move-result-object v0

    const-class v1, Lzk/k;

    invoke-virtual {v0, v1}, Lzk/l;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzk/k;

    iput-object v0, p0, Lvk/h;->a:Lzk/k;

    :cond_0
    iget-object v0, p0, Lvk/h;->b:Lzk/d;

    if-nez v0, :cond_1

    new-instance v0, Lzk/l;

    const-string v1, "chat"

    iget-object v2, p1, Lvk/b;->a:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Lzk/l;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lvk/h;->n:Lokhttp3/OkHttpClient;

    invoke-virtual {v0, v1}, Lzk/l;->f(Lokhttp3/OkHttpClient;)Lzk/l;

    move-result-object v0

    iget-object v1, p0, Lvk/h;->o:Ljv/e$a;

    invoke-virtual {v0, v1}, Lzk/l;->e(Ljv/e$a;)Lzk/l;

    move-result-object v0

    const-class v1, Lzk/d;

    invoke-virtual {v0, v1}, Lzk/l;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzk/d;

    iput-object v0, p0, Lvk/h;->b:Lzk/d;

    :cond_1
    iget-object v0, p0, Lvk/h;->c:Lzk/e;

    if-nez v0, :cond_2

    new-instance v0, Lzk/l;

    const-string v1, "clientsettings.api"

    iget-object v2, p1, Lvk/b;->a:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Lzk/l;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lvk/h;->n:Lokhttp3/OkHttpClient;

    invoke-virtual {v0, v1}, Lzk/l;->f(Lokhttp3/OkHttpClient;)Lzk/l;

    move-result-object v0

    iget-object v1, p0, Lvk/h;->o:Ljv/e$a;

    invoke-virtual {v0, v1}, Lzk/l;->e(Ljv/e$a;)Lzk/l;

    move-result-object v0

    const-class v1, Lzk/e;

    invoke-virtual {v0, v1}, Lzk/l;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzk/e;

    iput-object v0, p0, Lvk/h;->c:Lzk/e;

    :cond_2
    iget-object v0, p0, Lvk/h;->d:Lzk/h;

    if-nez v0, :cond_3

    new-instance v0, Lzk/l;

    const-string v1, "metrics"

    iget-object v2, p1, Lvk/b;->a:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Lzk/l;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lvk/h;->n:Lokhttp3/OkHttpClient;

    invoke-virtual {v0, v1}, Lzk/l;->f(Lokhttp3/OkHttpClient;)Lzk/l;

    move-result-object v0

    iget-object v1, p0, Lvk/h;->o:Ljv/e$a;

    invoke-virtual {v0, v1}, Lzk/l;->e(Ljv/e$a;)Lzk/l;

    move-result-object v0

    const-class v1, Lzk/h;

    invoke-virtual {v0, v1}, Lzk/l;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzk/h;

    iput-object v0, p0, Lvk/h;->d:Lzk/h;

    :cond_3
    iget-object v0, p0, Lvk/h;->e:Lzk/j;

    if-nez v0, :cond_4

    new-instance v0, Lzk/l;

    const-string v1, "notifications"

    iget-object v2, p1, Lvk/b;->a:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Lzk/l;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lvk/h;->n:Lokhttp3/OkHttpClient;

    invoke-virtual {v0, v1}, Lzk/l;->f(Lokhttp3/OkHttpClient;)Lzk/l;

    move-result-object v0

    iget-object v1, p0, Lvk/h;->o:Ljv/e$a;

    invoke-virtual {v0, v1}, Lzk/l;->e(Ljv/e$a;)Lzk/l;

    move-result-object v0

    const-class v1, Lzk/j;

    invoke-virtual {v0, v1}, Lzk/l;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzk/j;

    iput-object v0, p0, Lvk/h;->e:Lzk/j;

    :cond_4
    iget-object v0, p0, Lvk/h;->g:Lzk/g;

    if-nez v0, :cond_5

    new-instance v0, Lzk/l;

    const-string v1, "locale"

    iget-object v2, p1, Lvk/b;->a:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Lzk/l;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lvk/h;->n:Lokhttp3/OkHttpClient;

    invoke-virtual {v0, v1}, Lzk/l;->f(Lokhttp3/OkHttpClient;)Lzk/l;

    move-result-object v0

    iget-object v1, p0, Lvk/h;->o:Ljv/e$a;

    invoke-virtual {v0, v1}, Lzk/l;->e(Ljv/e$a;)Lzk/l;

    move-result-object v0

    const-class v1, Lzk/g;

    invoke-virtual {v0, v1}, Lzk/l;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzk/g;

    iput-object v0, p0, Lvk/h;->g:Lzk/g;

    :cond_5
    iget-object v0, p0, Lvk/h;->h:Lzk/f;

    if-nez v0, :cond_6

    new-instance v0, Lzk/l;

    const-string v1, "friends"

    iget-object v2, p1, Lvk/b;->a:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Lzk/l;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lvk/h;->n:Lokhttp3/OkHttpClient;

    invoke-virtual {v0, v1}, Lzk/l;->f(Lokhttp3/OkHttpClient;)Lzk/l;

    move-result-object v0

    iget-object v1, p0, Lvk/h;->o:Ljv/e$a;

    invoke-virtual {v0, v1}, Lzk/l;->e(Ljv/e$a;)Lzk/l;

    move-result-object v0

    const-class v1, Lzk/f;

    invoke-virtual {v0, v1}, Lzk/l;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzk/f;

    iput-object v0, p0, Lvk/h;->h:Lzk/f;

    :cond_6
    iget-object v0, p0, Lvk/h;->i:Lzk/n;

    if-nez v0, :cond_7

    new-instance v0, Lzk/l;

    const-string v1, "translations"

    iget-object v2, p1, Lvk/b;->a:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Lzk/l;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lvk/h;->n:Lokhttp3/OkHttpClient;

    invoke-virtual {v0, v1}, Lzk/l;->f(Lokhttp3/OkHttpClient;)Lzk/l;

    move-result-object v0

    iget-object v1, p0, Lvk/h;->o:Ljv/e$a;

    invoke-virtual {v0, v1}, Lzk/l;->e(Ljv/e$a;)Lzk/l;

    move-result-object v0

    const-class v1, Lzk/n;

    invoke-virtual {v0, v1}, Lzk/l;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzk/n;

    iput-object v0, p0, Lvk/h;->i:Lzk/n;

    :cond_7
    iget-object v0, p0, Lvk/h;->j:Lzk/b;

    if-nez v0, :cond_8

    new-instance v0, Lzk/l;

    const-string v1, "accountsettings"

    iget-object v2, p1, Lvk/b;->a:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Lzk/l;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lvk/h;->n:Lokhttp3/OkHttpClient;

    invoke-virtual {v0, v1}, Lzk/l;->f(Lokhttp3/OkHttpClient;)Lzk/l;

    move-result-object v0

    iget-object v1, p0, Lvk/h;->o:Ljv/e$a;

    invoke-virtual {v0, v1}, Lzk/l;->e(Ljv/e$a;)Lzk/l;

    move-result-object v0

    const-class v1, Lzk/b;

    invoke-virtual {v0, v1}, Lzk/l;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzk/b;

    iput-object v0, p0, Lvk/h;->j:Lzk/b;

    :cond_8
    iget-object v0, p0, Lvk/h;->k:Lzk/c;

    if-nez v0, :cond_9

    new-instance v0, Lzk/l;

    const-string v1, "auth"

    iget-object v2, p1, Lvk/b;->a:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Lzk/l;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lvk/h;->n:Lokhttp3/OkHttpClient;

    invoke-virtual {v0, v1}, Lzk/l;->f(Lokhttp3/OkHttpClient;)Lzk/l;

    move-result-object v0

    iget-object v1, p0, Lvk/h;->o:Ljv/e$a;

    invoke-virtual {v0, v1}, Lzk/l;->e(Ljv/e$a;)Lzk/l;

    move-result-object v0

    const-class v1, Lzk/c;

    invoke-virtual {v0, v1}, Lzk/l;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzk/c;

    iput-object v0, p0, Lvk/h;->k:Lzk/c;

    :cond_9
    iget-object v0, p0, Lvk/h;->l:Lzk/a;

    if-nez v0, :cond_a

    new-instance v0, Lzk/l;

    const-string v1, "accountinformation"

    iget-object v2, p1, Lvk/b;->a:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Lzk/l;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lvk/h;->n:Lokhttp3/OkHttpClient;

    invoke-virtual {v0, v1}, Lzk/l;->f(Lokhttp3/OkHttpClient;)Lzk/l;

    move-result-object v0

    iget-object v1, p0, Lvk/h;->o:Ljv/e$a;

    invoke-virtual {v0, v1}, Lzk/l;->e(Ljv/e$a;)Lzk/l;

    move-result-object v0

    const-class v1, Lzk/a;

    invoke-virtual {v0, v1}, Lzk/l;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzk/a;

    iput-object v0, p0, Lvk/h;->l:Lzk/a;

    :cond_a
    iget-object v0, p0, Lvk/h;->m:Lzk/m;

    if-nez v0, :cond_b

    new-instance v0, Lzk/l;

    const-string v1, "thumbnails"

    iget-object p1, p1, Lvk/b;->a:Ljava/lang/String;

    invoke-direct {v0, v1, p1}, Lzk/l;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lvk/h;->n:Lokhttp3/OkHttpClient;

    invoke-virtual {v0, p1}, Lzk/l;->f(Lokhttp3/OkHttpClient;)Lzk/l;

    move-result-object p1

    iget-object v0, p0, Lvk/h;->o:Ljv/e$a;

    invoke-virtual {p1, v0}, Lzk/l;->e(Ljv/e$a;)Lzk/l;

    move-result-object p1

    const-class v0, Lzk/m;

    invoke-virtual {p1, v0}, Lzk/l;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lzk/m;

    iput-object p1, p0, Lvk/h;->m:Lzk/m;

    :cond_b
    return-object p0
.end method
