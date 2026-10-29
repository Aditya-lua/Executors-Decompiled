.class public final Lpe/o;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Laf/h0;

.field public final b:Lpe/x;


# direct methods
.method public constructor <init>(Lpe/x;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lpe/o;->a:Laf/h0;

    iput-object p1, p0, Lpe/o;->b:Lpe/x;

    return-void
.end method

.method public static a(Lpe/x;)Lpe/o;
    .locals 1

    new-instance v0, Lpe/o;

    invoke-direct {v0, p0}, Lpe/o;-><init>(Lpe/x;)V

    return-object v0
.end method


# virtual methods
.method public b()Laf/h0;
    .locals 4

    :try_start_0
    invoke-virtual {p0}, Lpe/o;->c()Laf/h0;

    move-result-object v0
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Lwe/r0;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Parsing parameters failed in getProto(). You probably want to call some Tink register function for "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lpe/o;->b:Lpe/x;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Lwe/r0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public c()Laf/h0;
    .locals 3

    iget-object v0, p0, Lpe/o;->a:Laf/h0;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Lpe/o;->b:Lpe/x;

    instance-of v1, v0, Lwe/q;

    if-eqz v1, :cond_1

    check-cast v0, Lwe/q;

    invoke-virtual {v0}, Lwe/q;->b()Lwe/m0;

    move-result-object v0

    invoke-virtual {v0}, Lwe/m0;->d()Laf/h0;

    move-result-object v0

    return-object v0

    :cond_1
    invoke-static {}, Lwe/d0;->c()Lwe/d0;

    move-result-object v0

    iget-object v1, p0, Lpe/o;->b:Lpe/x;

    const-class v2, Lwe/m0;

    invoke-virtual {v0, v1, v2}, Lwe/d0;->o(Lpe/x;Ljava/lang/Class;)Lwe/p0;

    move-result-object v0

    check-cast v0, Lwe/m0;

    invoke-virtual {v0}, Lwe/m0;->d()Laf/h0;

    move-result-object v0

    return-object v0
.end method

.method public d()Lpe/x;
    .locals 1

    iget-object v0, p0, Lpe/o;->b:Lpe/x;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Lpe/o;->b()Laf/h0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/a;->n()[B

    move-result-object v0

    invoke-static {v0}, Lpe/h0;->a([B)Lpe/x;

    move-result-object v0

    return-object v0
.end method
