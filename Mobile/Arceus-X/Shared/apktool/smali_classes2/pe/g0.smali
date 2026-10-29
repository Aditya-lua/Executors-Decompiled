.class public final Lpe/g0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a([BLpe/d0;)Lpe/p;
    .locals 0

    if-eqz p1, :cond_0

    :try_start_0
    invoke-static {p0}, Lpe/b;->b([B)Lpe/r;

    move-result-object p0

    invoke-static {p0}, Lpe/d;->a(Lpe/r;)Lpe/p;

    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "Parse keyset failed"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "SecretKeyAccess cannot be null"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static b(Lpe/p;Lpe/d0;)[B
    .locals 1

    if-eqz p1, :cond_0

    :try_start_0
    new-instance p1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {p1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    invoke-static {p1}, Lpe/c;->c(Ljava/io/OutputStream;)Lpe/s;

    move-result-object v0

    invoke-static {p0, v0}, Lpe/d;->b(Lpe/p;Lpe/s;)V

    invoke-virtual {p1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "Serialize keyset failed"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "SecretKeyAccess cannot be null"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
