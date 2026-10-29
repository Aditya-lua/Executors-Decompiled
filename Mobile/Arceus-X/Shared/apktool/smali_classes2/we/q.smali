.class public final Lwe/q;
.super Lpe/x;
.source "SourceFile"


# instance fields
.field public final a:Lwe/m0;


# direct methods
.method public constructor <init>(Lwe/m0;)V
    .locals 0

    invoke-direct {p0}, Lpe/x;-><init>()V

    iput-object p1, p0, Lwe/q;->a:Lwe/m0;

    return-void
.end method

.method public static c(Laf/p0;)Ljava/lang/String;
    .locals 1

    sget-object v0, Lwe/q$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_3

    const/4 v0, 0x2

    if-eq p0, v0, :cond_2

    const/4 v0, 0x3

    if-eq p0, v0, :cond_1

    const/4 v0, 0x4

    if-eq p0, v0, :cond_0

    const-string p0, "UNKNOWN"

    return-object p0

    :cond_0
    const-string p0, "CRUNCHY"

    return-object p0

    :cond_1
    const-string p0, "RAW"

    return-object p0

    :cond_2
    const-string p0, "LEGACY"

    return-object p0

    :cond_3
    const-string p0, "TINK"

    return-object p0
.end method


# virtual methods
.method public a()Z
    .locals 2

    iget-object v0, p0, Lwe/q;->a:Lwe/m0;

    invoke-virtual {v0}, Lwe/m0;->d()Laf/h0;

    move-result-object v0

    invoke-virtual {v0}, Laf/h0;->e0()Laf/p0;

    move-result-object v0

    sget-object v1, Laf/p0;->e:Laf/p0;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public b()Lwe/m0;
    .locals 1

    iget-object v0, p0, Lwe/q;->a:Lwe/m0;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lwe/q;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lwe/q;

    iget-object p1, p1, Lwe/q;->a:Lwe/m0;

    iget-object v0, p0, Lwe/q;->a:Lwe/m0;

    invoke-virtual {v0}, Lwe/m0;->d()Laf/h0;

    move-result-object v0

    invoke-virtual {v0}, Laf/h0;->e0()Laf/p0;

    move-result-object v0

    invoke-virtual {p1}, Lwe/m0;->d()Laf/h0;

    move-result-object v2

    invoke-virtual {v2}, Laf/h0;->e0()Laf/p0;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lwe/q;->a:Lwe/m0;

    invoke-virtual {v0}, Lwe/m0;->d()Laf/h0;

    move-result-object v0

    invoke-virtual {v0}, Laf/h0;->f0()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lwe/m0;->d()Laf/h0;

    move-result-object v2

    invoke-virtual {v2}, Laf/h0;->f0()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lwe/q;->a:Lwe/m0;

    invoke-virtual {v0}, Lwe/m0;->d()Laf/h0;

    move-result-object v0

    invoke-virtual {v0}, Laf/h0;->g0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    invoke-virtual {p1}, Lwe/m0;->d()Laf/h0;

    move-result-object p1

    invoke-virtual {p1}, Laf/h0;->g0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lwe/q;->a:Lwe/m0;

    invoke-virtual {v0}, Lwe/m0;->d()Laf/h0;

    move-result-object v0

    iget-object v1, p0, Lwe/q;->a:Lwe/m0;

    invoke-virtual {v1}, Lwe/m0;->a()Lef/a;

    move-result-object v1

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lwe/q;->a:Lwe/m0;

    invoke-virtual {v0}, Lwe/m0;->d()Laf/h0;

    move-result-object v0

    invoke-virtual {v0}, Laf/h0;->f0()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lwe/q;->a:Lwe/m0;

    invoke-virtual {v1}, Lwe/m0;->d()Laf/h0;

    move-result-object v1

    invoke-virtual {v1}, Laf/h0;->e0()Laf/p0;

    move-result-object v1

    invoke-static {v1}, Lwe/q;->c(Laf/p0;)Ljava/lang/String;

    move-result-object v1

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "(typeUrl=%s, outputPrefixType=%s)"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
