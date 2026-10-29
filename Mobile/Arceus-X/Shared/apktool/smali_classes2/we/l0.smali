.class public final Lwe/l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwe/p0;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lef/a;

.field public final c:Lcom/google/crypto/tink/shaded/protobuf/h;

.field public final d:Laf/f0$c;

.field public final e:Laf/p0;

.field public final f:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lef/a;Lcom/google/crypto/tink/shaded/protobuf/h;Laf/f0$c;Laf/p0;Ljava/lang/Integer;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwe/l0;->a:Ljava/lang/String;

    iput-object p2, p0, Lwe/l0;->b:Lef/a;

    iput-object p3, p0, Lwe/l0;->c:Lcom/google/crypto/tink/shaded/protobuf/h;

    iput-object p4, p0, Lwe/l0;->d:Laf/f0$c;

    iput-object p5, p0, Lwe/l0;->e:Laf/p0;

    iput-object p6, p0, Lwe/l0;->f:Ljava/lang/Integer;

    return-void
.end method

.method public static b(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/h;Laf/f0$c;Laf/p0;Ljava/lang/Integer;)Lwe/l0;
    .locals 7

    sget-object v0, Laf/p0;->e:Laf/p0;

    if-ne p3, v0, :cond_1

    if-nez p4, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "Keys with output prefix type raw should not have an id requirement."

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    if-eqz p4, :cond_2

    :goto_0
    invoke-static {p0}, Lwe/s0;->b(Ljava/lang/String;)Lef/a;

    move-result-object v2

    new-instance v0, Lwe/l0;

    move-object v1, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v0 .. v6}, Lwe/l0;-><init>(Ljava/lang/String;Lef/a;Lcom/google/crypto/tink/shaded/protobuf/h;Laf/f0$c;Laf/p0;Ljava/lang/Integer;)V

    return-object v0

    :cond_2
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "Keys with output prefix type different from raw should have an id requirement."

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public a()Lef/a;
    .locals 1

    iget-object v0, p0, Lwe/l0;->b:Lef/a;

    return-object v0
.end method

.method public c()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lwe/l0;->f:Ljava/lang/Integer;

    return-object v0
.end method

.method public d()Laf/f0$c;
    .locals 1

    iget-object v0, p0, Lwe/l0;->d:Laf/f0$c;

    return-object v0
.end method

.method public e()Laf/p0;
    .locals 1

    iget-object v0, p0, Lwe/l0;->e:Laf/p0;

    return-object v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lwe/l0;->a:Ljava/lang/String;

    return-object v0
.end method

.method public g()Lcom/google/crypto/tink/shaded/protobuf/h;
    .locals 1

    iget-object v0, p0, Lwe/l0;->c:Lcom/google/crypto/tink/shaded/protobuf/h;

    return-object v0
.end method
