.class public final Lpe/h0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a([B)Lpe/x;
    .locals 2

    :try_start_0
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->b()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v0

    invoke-static {p0, v0}, Laf/h0;->j0([BLcom/google/crypto/tink/shaded/protobuf/p;)Laf/h0;

    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-static {}, Lwe/d0;->c()Lwe/d0;

    move-result-object v0

    invoke-static {p0}, Lwe/m0;->b(Laf/h0;)Lwe/m0;

    move-result-object p0

    invoke-virtual {v0, p0}, Lwe/d0;->i(Lwe/m0;)Lpe/x;

    move-result-object p0

    return-object p0

    :catch_0
    move-exception p0

    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Failed to parse proto"

    invoke-direct {v0, v1, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static b(Lpe/x;)[B
    .locals 2

    instance-of v0, p0, Lwe/q;

    if-eqz v0, :cond_0

    check-cast p0, Lwe/q;

    invoke-virtual {p0}, Lwe/q;->b()Lwe/m0;

    move-result-object p0

    invoke-virtual {p0}, Lwe/m0;->d()Laf/h0;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/a;->n()[B

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {}, Lwe/d0;->c()Lwe/d0;

    move-result-object v0

    const-class v1, Lwe/m0;

    invoke-virtual {v0, p0, v1}, Lwe/d0;->o(Lpe/x;Ljava/lang/Class;)Lwe/p0;

    move-result-object p0

    check-cast p0, Lwe/m0;

    invoke-virtual {p0}, Lwe/m0;->d()Laf/h0;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/a;->n()[B

    move-result-object p0

    return-object p0
.end method
