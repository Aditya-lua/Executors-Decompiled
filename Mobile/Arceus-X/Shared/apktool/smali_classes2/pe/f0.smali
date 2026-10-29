.class public final Lpe/f0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ljava/lang/String;)Lpe/p;
    .locals 1

    :try_start_0
    invoke-static {p0}, Lpe/k;->m(Ljava/lang/String;)Lpe/k;

    move-result-object p0

    invoke-static {p0}, Lpe/p;->u(Lpe/r;)Lpe/p;

    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "Parse keyset failed"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
