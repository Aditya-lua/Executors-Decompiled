.class public final Lve/a$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lve/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public a:Landroid/content/Context;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:Lpe/a;

.field public f:Z

.field public g:Lpe/o;

.field public h:Laf/h0;

.field public i:Lpe/q;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lve/a$b;->a:Landroid/content/Context;

    iput-object v0, p0, Lve/a$b;->b:Ljava/lang/String;

    iput-object v0, p0, Lve/a$b;->c:Ljava/lang/String;

    iput-object v0, p0, Lve/a$b;->d:Ljava/lang/String;

    iput-object v0, p0, Lve/a$b;->e:Lpe/a;

    const/4 v1, 0x1

    iput-boolean v1, p0, Lve/a$b;->f:Z

    iput-object v0, p0, Lve/a$b;->g:Lpe/o;

    iput-object v0, p0, Lve/a$b;->h:Laf/h0;

    return-void
.end method

.method public static synthetic a(Lve/a$b;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lve/a$b;->a:Landroid/content/Context;

    return-object p0
.end method

.method public static synthetic b(Lve/a$b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lve/a$b;->b:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic c(Lve/a$b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lve/a$b;->c:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic d(Lve/a$b;)Lpe/a;
    .locals 0

    iget-object p0, p0, Lve/a$b;->e:Lpe/a;

    return-object p0
.end method

.method public static synthetic e(Lve/a$b;)Lpe/q;
    .locals 0

    iget-object p0, p0, Lve/a$b;->i:Lpe/q;

    return-object p0
.end method

.method public static h(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)[B
    .locals 1

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    if-nez p2, :cond_0

    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, p2, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0

    :goto_0
    const/4 p2, 0x0

    :try_start_0
    invoke-interface {p0, p1, p2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_1

    return-object p2

    :cond_1
    invoke-static {p0}, Ldf/p;->a(Ljava/lang/String;)[B

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    new-instance p0, Ljava/io/CharConversionException;

    const-string p2, "can\'t read keyset; the pref value %s is not a valid hex string"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/CharConversionException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "keysetName cannot be null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public declared-synchronized f()Lve/a;
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lve/a$b;->b:Ljava/lang/String;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lve/a$b;->h:Laf/h0;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lve/a$b;->g:Lpe/o;

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/a;->n()[B

    move-result-object v0

    invoke-static {v0}, Lpe/h0;->a([B)Lpe/x;

    move-result-object v0

    invoke-static {v0}, Lpe/o;->a(Lpe/x;)Lpe/o;

    move-result-object v0

    iput-object v0, p0, Lve/a$b;->g:Lpe/o;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_5

    :cond_0
    :goto_0
    invoke-static {}, Lve/a;->a()Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v1, p0, Lve/a$b;->a:Landroid/content/Context;

    iget-object v2, p0, Lve/a$b;->b:Ljava/lang/String;

    iget-object v3, p0, Lve/a$b;->c:Ljava/lang/String;

    invoke-static {v1, v2, v3}, Lve/a$b;->h(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)[B

    move-result-object v1

    if-nez v1, :cond_2

    iget-object v1, p0, Lve/a$b;->d:Ljava/lang/String;

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lve/a$b;->k()Lpe/a;

    move-result-object v1

    iput-object v1, p0, Lve/a$b;->e:Lpe/a;

    goto :goto_1

    :catchall_1
    move-exception v1

    goto :goto_4

    :cond_1
    :goto_1
    invoke-virtual {p0}, Lve/a$b;->g()Lpe/q;

    move-result-object v1

    iput-object v1, p0, Lve/a$b;->i:Lpe/q;

    goto :goto_3

    :cond_2
    iget-object v2, p0, Lve/a$b;->d:Ljava/lang/String;

    if-eqz v2, :cond_4

    invoke-static {}, Lve/a;->b()Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {p0, v1}, Lve/a$b;->j([B)Lpe/q;

    move-result-object v1

    iput-object v1, p0, Lve/a$b;->i:Lpe/q;

    goto :goto_3

    :cond_4
    :goto_2
    invoke-virtual {p0, v1}, Lve/a$b;->i([B)Lpe/q;

    move-result-object v1

    iput-object v1, p0, Lve/a$b;->i:Lpe/q;

    :goto_3
    new-instance v1, Lve/a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lve/a;-><init>(Lve/a$b;Lve/a$a;)V

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    monitor-exit p0

    return-object v1

    :goto_4
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    throw v1

    :cond_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "keysetName cannot be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_5
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0
.end method

.method public final g()Lpe/q;
    .locals 5

    iget-object v0, p0, Lve/a$b;->g:Lpe/o;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lpe/p;->k(Lpe/o;)Lpe/p;

    move-result-object v0

    new-instance v1, Lve/e;

    iget-object v2, p0, Lve/a$b;->a:Landroid/content/Context;

    iget-object v3, p0, Lve/a$b;->b:Ljava/lang/String;

    iget-object v4, p0, Lve/a$b;->c:Ljava/lang/String;

    invoke-direct {v1, v2, v3, v4}, Lve/e;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v2, p0, Lve/a$b;->e:Lpe/a;

    invoke-static {v0, v1, v2}, Lve/a;->d(Lpe/p;Lpe/s;Lpe/a;)V

    invoke-static {v0}, Lpe/q;->b(Lpe/p;)Lpe/q;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "cannot read or generate keyset"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final i([B)Lpe/q;
    .locals 1

    invoke-static {p1}, Lpe/b;->b([B)Lpe/r;

    move-result-object p1

    invoke-static {}, Lpe/j;->a()Lpe/d0;

    move-result-object v0

    invoke-static {p1, v0}, Lpe/v;->b(Lpe/r;Lpe/d0;)Lpe/p;

    move-result-object p1

    invoke-static {p1}, Lpe/q;->b(Lpe/p;)Lpe/q;

    move-result-object p1

    return-object p1
.end method

.method public final j([B)Lpe/q;
    .locals 3

    :try_start_0
    new-instance v0, Lve/d;

    invoke-direct {v0}, Lve/d;-><init>()V

    iget-object v1, p0, Lve/a$b;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lve/d;->b(Ljava/lang/String;)Lpe/a;

    move-result-object v0

    iput-object v0, p0, Lve/a$b;->e:Lpe/a;
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/security/ProviderException; {:try_start_0 .. :try_end_0} :catch_3

    const/4 v0, 0x0

    :try_start_1
    new-array v0, v0, [B

    invoke-static {p1}, Lpe/b;->b([B)Lpe/r;

    move-result-object v1

    iget-object v2, p0, Lve/a$b;->e:Lpe/a;

    invoke-static {v1, v2, v0}, Lpe/v;->a(Lpe/r;Lpe/a;[B)Lpe/p;

    move-result-object v0

    invoke-static {v0}, Lpe/q;->b(Lpe/p;)Lpe/q;

    move-result-object p1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/security/GeneralSecurityException; {:try_start_1 .. :try_end_1} :catch_0

    return-object p1

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    :goto_0
    :try_start_2
    invoke-virtual {p0, p1}, Lve/a$b;->i([B)Lpe/q;

    move-result-object p1
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    return-object p1

    :catch_2
    throw v0

    :catch_3
    move-exception v0

    goto :goto_1

    :catch_4
    move-exception v0

    :goto_1
    :try_start_3
    invoke-virtual {p0, p1}, Lve/a$b;->i([B)Lpe/q;

    move-result-object p1

    invoke-static {}, Lve/a;->c()Ljava/lang/String;

    move-result-object v1

    const-string v2, "cannot use Android Keystore, it\'ll be disabled"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_5

    return-object p1

    :catch_5
    throw v0
.end method

.method public final k()Lpe/a;
    .locals 5

    const-string v0, "cannot use Android Keystore, it\'ll be disabled"

    invoke-static {}, Lve/a;->b()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    invoke-static {}, Lve/a;->c()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Android Keystore requires at least Android M"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-object v2

    :cond_0
    new-instance v1, Lve/d;

    invoke-direct {v1}, Lve/d;-><init>()V

    :try_start_0
    iget-object v3, p0, Lve/a$b;->d:Ljava/lang/String;

    invoke-static {v3}, Lve/d;->d(Ljava/lang/String;)Z

    move-result v3
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/security/ProviderException; {:try_start_0 .. :try_end_0} :catch_2

    :try_start_1
    iget-object v4, p0, Lve/a$b;->d:Ljava/lang/String;

    invoke-virtual {v1, v4}, Lve/d;->b(Ljava/lang/String;)Lpe/a;

    move-result-object v0
    :try_end_1
    .catch Ljava/security/GeneralSecurityException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/security/ProviderException; {:try_start_1 .. :try_end_1} :catch_0

    return-object v0

    :catch_0
    move-exception v1

    goto :goto_0

    :catch_1
    move-exception v1

    :goto_0
    if-eqz v3, :cond_1

    invoke-static {}, Lve/a;->c()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-object v2

    :cond_1
    new-instance v0, Ljava/security/KeyStoreException;

    iget-object v2, p0, Lve/a$b;->d:Ljava/lang/String;

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    const-string v3, "the master key %s exists but is unusable"

    invoke-static {v3, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v1}, Ljava/security/KeyStoreException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :catch_2
    move-exception v1

    goto :goto_1

    :catch_3
    move-exception v1

    :goto_1
    invoke-static {}, Lve/a;->c()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-object v2
.end method

.method public l(Lpe/o;)Lve/a$b;
    .locals 0

    iput-object p1, p0, Lve/a$b;->g:Lpe/o;

    return-object p0
.end method

.method public m(Ljava/lang/String;)Lve/a$b;
    .locals 1

    const-string v0, "android-keystore://"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lve/a$b;->f:Z

    if-eqz v0, :cond_0

    iput-object p1, p0, Lve/a$b;->d:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "cannot call withMasterKeyUri() after calling doNotUseKeystore()"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "key URI must start with android-keystore://"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public n(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lve/a$b;
    .locals 0

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    iput-object p1, p0, Lve/a$b;->a:Landroid/content/Context;

    iput-object p2, p0, Lve/a$b;->b:Ljava/lang/String;

    iput-object p3, p0, Lve/a$b;->c:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "need a keyset name"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "need an Android context"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
