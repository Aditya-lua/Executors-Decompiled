.class public Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;
.super Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorResponse;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final f:Leb/m3;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final g:Leb/m3;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final h:Leb/m3;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final i:[Ljava/lang/String;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lca/c0;

    invoke-direct {v0}, Lca/c0;-><init>()V

    sput-object v0, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>([B[B[B[Ljava/lang/String;)V
    .locals 2
    .param p1    # [B
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # [B
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # [B
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # [Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {p1}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    sget-object v0, Leb/m3;->b:Leb/m3;

    array-length v0, p1

    const/4 v1, 0x0

    invoke-static {p1, v1, v0}, Leb/m3;->m([BII)Leb/m3;

    move-result-object p1

    invoke-static {p2}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [B

    array-length v0, p2

    invoke-static {p2, v1, v0}, Leb/m3;->m([BII)Leb/m3;

    move-result-object p2

    invoke-static {p3}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, [B

    array-length v0, p3

    invoke-static {p3, v1, v0}, Leb/m3;->m([BII)Leb/m3;

    move-result-object p3

    invoke-direct {p0}, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorResponse;-><init>()V

    invoke-static {p1}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Leb/m3;

    iput-object p1, p0, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;->f:Leb/m3;

    invoke-static {p2}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Leb/m3;

    iput-object p1, p0, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;->g:Leb/m3;

    invoke-static {p3}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Leb/m3;

    iput-object p1, p0, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;->h:Leb/m3;

    invoke-static {p4}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    iput-object p1, p0, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;->i:[Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;

    iget-object v0, p0, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;->f:Leb/m3;

    iget-object v2, p1, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;->f:Leb/m3;

    invoke-static {v0, v2}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;->g:Leb/m3;

    iget-object v2, p1, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;->g:Leb/m3;

    invoke-static {v0, v2}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;->h:Leb/m3;

    iget-object p1, p1, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;->h:Leb/m3;

    invoke-static {v0, p1}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;->f:Leb/m3;

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ln9/k;->c([Ljava/lang/Object;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;->g:Leb/m3;

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ln9/k;->c([Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;->h:Leb/m3;

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Ln9/k;->c([Ljava/lang/Object;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {v0, v1, v2}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ln9/k;->c([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-static {p0}, Leb/k0;->a(Ljava/lang/Object;)Leb/j0;

    move-result-object v0

    invoke-static {}, Leb/u2;->d()Leb/u2;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;->x3()[B

    move-result-object v2

    array-length v3, v2

    const/4 v4, 0x0

    invoke-virtual {v1, v2, v4, v3}, Leb/u2;->e([BII)Ljava/lang/String;

    move-result-object v1

    const-string v2, "keyHandle"

    invoke-virtual {v0, v2, v1}, Leb/j0;->b(Ljava/lang/String;Ljava/lang/Object;)Leb/j0;

    invoke-static {}, Leb/u2;->d()Leb/u2;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;->w3()[B

    move-result-object v2

    array-length v3, v2

    invoke-virtual {v1, v2, v4, v3}, Leb/u2;->e([BII)Ljava/lang/String;

    move-result-object v1

    const-string v2, "clientDataJSON"

    invoke-virtual {v0, v2, v1}, Leb/j0;->b(Ljava/lang/String;Ljava/lang/Object;)Leb/j0;

    invoke-static {}, Leb/u2;->d()Leb/u2;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;->v3()[B

    move-result-object v2

    array-length v3, v2

    invoke-virtual {v1, v2, v4, v3}, Leb/u2;->e([BII)Ljava/lang/String;

    move-result-object v1

    const-string v2, "attestationObject"

    invoke-virtual {v0, v2, v1}, Leb/j0;->b(Ljava/lang/String;Ljava/lang/Object;)Leb/j0;

    iget-object v1, p0, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;->i:[Ljava/lang/String;

    const-string v2, "transports"

    invoke-static {v1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Leb/j0;->b(Ljava/lang/String;Ljava/lang/Object;)Leb/j0;

    invoke-virtual {v0}, Leb/j0;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public v3()[B
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;->h:Leb/m3;

    invoke-virtual {v0}, Leb/m3;->p()[B

    move-result-object v0

    return-object v0
.end method

.method public w3()[B
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;->g:Leb/m3;

    invoke-virtual {v0}, Leb/m3;->p()[B

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 3
    .param p1    # Landroid/os/Parcel;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {p1}, Lo9/b;->a(Landroid/os/Parcel;)I

    move-result p2

    invoke-virtual {p0}, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;->x3()[B

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p1, v1, v0, v2}, Lo9/b;->g(Landroid/os/Parcel;I[BZ)V

    const/4 v0, 0x3

    invoke-virtual {p0}, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;->w3()[B

    move-result-object v1

    invoke-static {p1, v0, v1, v2}, Lo9/b;->g(Landroid/os/Parcel;I[BZ)V

    const/4 v0, 0x4

    invoke-virtual {p0}, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;->v3()[B

    move-result-object v1

    invoke-static {p1, v0, v1, v2}, Lo9/b;->g(Landroid/os/Parcel;I[BZ)V

    const/4 v0, 0x5

    invoke-virtual {p0}, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;->y3()[Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v0, v1, v2}, Lo9/b;->w(Landroid/os/Parcel;I[Ljava/lang/String;Z)V

    invoke-static {p1, p2}, Lo9/b;->b(Landroid/os/Parcel;I)V

    return-void
.end method

.method public x3()[B
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;->f:Leb/m3;

    invoke-virtual {v0}, Leb/m3;->p()[B

    move-result-object v0

    return-object v0
.end method

.method public y3()[Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;->i:[Ljava/lang/String;

    return-object v0
.end method

.method public final z3()Lorg/json/JSONObject;
    .locals 19
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    move-object/from16 v1, p0

    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    iget-object v2, v1, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;->g:Leb/m3;

    if-eqz v2, :cond_0

    const-string v2, "clientDataJSON"

    invoke-virtual {v1}, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;->w3()[B

    move-result-object v3

    invoke-static {v3}, Lu9/c;->b([B)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_0

    :catch_0
    move-exception v0

    goto/16 :goto_a

    :cond_0
    :goto_0
    iget-object v2, v1, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;->h:Leb/m3;

    if-eqz v2, :cond_1

    const-string v2, "attestationObject"

    invoke-virtual {v1}, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;->v3()[B

    move-result-object v3

    invoke-static {v3}, Lu9/c;->b([B)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_1
    new-instance v2, Lorg/json/JSONArray;

    invoke-direct {v2}, Lorg/json/JSONArray;-><init>()V

    const/4 v3, 0x0

    move v4, v3

    :goto_1
    iget-object v5, v1, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;->i:[Ljava/lang/String;

    array-length v6, v5

    if-ge v4, v6, :cond_3

    aget-object v5, v5, v4

    sget-object v6, Lcom/google/android/gms/fido/common/Transport;->g:Lcom/google/android/gms/fido/common/Transport;

    invoke-virtual {v6}, Lcom/google/android/gms/fido/common/Transport;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const-string v5, "hybrid"

    invoke-virtual {v2, v4, v5}, Lorg/json/JSONArray;->put(ILjava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_2

    :cond_2
    iget-object v5, v1, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;->i:[Ljava/lang/String;

    aget-object v5, v5, v4

    invoke-virtual {v2, v4, v5}, Lorg/json/JSONArray;->put(ILjava/lang/Object;)Lorg/json/JSONArray;

    :goto_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_3
    const-string v4, "transports"

    invoke-virtual {v0, v4, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {v1}, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;->v3()[B

    move-result-object v2
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    invoke-static {v2}, Leb/e4;->n([B)Leb/e4;

    move-result-object v2

    invoke-virtual {v2}, Leb/e4;->j()Leb/b4;

    move-result-object v2
    :try_end_1
    .catch Leb/d4; {:try_start_1 .. :try_end_1} :catch_7
    .catch Leb/y3; {:try_start_1 .. :try_end_1} :catch_6
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    :try_start_2
    invoke-virtual {v2}, Leb/b4;->q()Leb/l1;

    move-result-object v2

    const-string v4, "authData"

    invoke-static {v4}, Leb/e4;->l(Ljava/lang/String;)Leb/c4;

    move-result-object v4

    invoke-virtual {v2, v4}, Leb/l1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Leb/e4;

    if-eqz v2, :cond_f

    invoke-virtual {v2}, Leb/e4;->d()Leb/x3;

    move-result-object v2

    invoke-virtual {v2}, Leb/x3;->q()Leb/m3;

    move-result-object v2
    :try_end_2
    .catch Leb/d4; {:try_start_2 .. :try_end_2} :catch_5
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0

    :try_start_3
    invoke-virtual {v2}, Leb/m3;->i()Ljava/nio/ByteBuffer;

    move-result-object v4
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_0

    :try_start_4
    invoke-virtual {v4}, Ljava/nio/Buffer;->position()I

    move-result v5

    const/16 v6, 0x20

    add-int/2addr v5, v6

    invoke-virtual {v4, v5}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    invoke-virtual {v4}, Ljava/nio/ByteBuffer;->get()B

    move-result v5

    and-int/lit8 v5, v5, 0x40

    if-eqz v5, :cond_e

    invoke-virtual {v4}, Ljava/nio/Buffer;->position()I

    move-result v5

    add-int/lit8 v5, v5, 0x4

    invoke-virtual {v4, v5}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    invoke-virtual {v4}, Ljava/nio/Buffer;->position()I

    move-result v5

    add-int/lit8 v5, v5, 0x10

    invoke-virtual {v4, v5}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    invoke-virtual {v4}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v5

    invoke-virtual {v4}, Ljava/nio/Buffer;->position()I

    move-result v7

    add-int/2addr v7, v5

    invoke-virtual {v4, v7}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;
    :try_end_4
    .catch Ljava/lang/IllegalArgumentException; {:try_start_4 .. :try_end_4} :catch_4
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_0

    :try_start_5
    invoke-virtual {v4}, Ljava/nio/Buffer;->position()I

    move-result v4

    invoke-virtual {v2}, Leb/m3;->d()I

    move-result v5

    invoke-virtual {v2, v4, v5}, Leb/m3;->g(II)Leb/m3;

    move-result-object v4

    invoke-virtual {v4}, Leb/m3;->h()Ljava/io/InputStream;

    move-result-object v4

    invoke-static {v4}, Leb/e4;->o(Ljava/io/InputStream;)Leb/e4;

    move-result-object v4

    invoke-virtual {v4}, Leb/e4;->j()Leb/b4;

    move-result-object v4
    :try_end_5
    .catch Leb/d4; {:try_start_5 .. :try_end_5} :catch_3
    .catch Leb/y3; {:try_start_5 .. :try_end_5} :catch_2
    .catch Lorg/json/JSONException; {:try_start_5 .. :try_end_5} :catch_0

    :try_start_6
    invoke-virtual {v4}, Leb/b4;->q()Leb/l1;

    move-result-object v5

    const-wide/16 v7, 0x3

    invoke-static {v7, v8}, Leb/e4;->h(J)Leb/z3;

    move-result-object v7

    invoke-virtual {v5, v7}, Leb/l1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Leb/e4;

    invoke-virtual {v4}, Leb/b4;->q()Leb/l1;

    move-result-object v7

    const-wide/16 v8, 0x1

    invoke-static {v8, v9}, Leb/e4;->h(J)Leb/z3;

    move-result-object v10

    invoke-virtual {v7, v10}, Leb/l1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Leb/e4;
    :try_end_6
    .catch Lorg/json/JSONException; {:try_start_6 .. :try_end_6} :catch_0

    const-string v10, "COSE key missing required fields"

    if-eqz v5, :cond_d

    if-eqz v7, :cond_d

    :try_start_7
    invoke-virtual {v5}, Leb/e4;->e()Leb/z3;

    move-result-object v5

    invoke-virtual {v5}, Leb/z3;->q()J

    move-result-wide v11

    invoke-virtual {v7}, Leb/e4;->e()Leb/z3;

    move-result-object v5

    invoke-virtual {v5}, Leb/z3;->q()J

    move-result-wide v13

    cmp-long v5, v13, v8

    const-wide/16 v15, 0x2

    if-eqz v5, :cond_5

    cmp-long v5, v13, v15

    if-nez v5, :cond_4

    move-wide v13, v15

    goto :goto_3

    :cond_4
    const/4 v7, 0x0

    goto/16 :goto_4

    :cond_5
    :goto_3
    invoke-virtual {v4}, Leb/b4;->q()Leb/l1;

    move-result-object v5

    const-wide/16 v17, -0x1

    invoke-static/range {v17 .. v18}, Leb/e4;->h(J)Leb/z3;

    move-result-object v7

    invoke-virtual {v5, v7}, Leb/l1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Leb/e4;

    if-eqz v5, :cond_c

    invoke-virtual {v5}, Leb/e4;->e()Leb/z3;

    move-result-object v5

    invoke-virtual {v5}, Leb/z3;->q()J

    move-result-wide v17
    :try_end_7
    .catch Leb/d4; {:try_start_7 .. :try_end_7} :catch_1
    .catch Lorg/json/JSONException; {:try_start_7 .. :try_end_7} :catch_0

    cmp-long v5, v13, v15

    const-string v7, "COSE coordinates are the wrong size"

    const-wide/16 v15, -0x2

    if-nez v5, :cond_8

    cmp-long v5, v17, v8

    if-nez v5, :cond_8

    :try_start_8
    invoke-virtual {v4}, Leb/b4;->q()Leb/l1;

    move-result-object v5

    invoke-static/range {v15 .. v16}, Leb/e4;->h(J)Leb/z3;

    move-result-object v8

    invoke-virtual {v5, v8}, Leb/l1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Leb/e4;

    invoke-virtual {v4}, Leb/b4;->q()Leb/l1;

    move-result-object v4

    const-wide/16 v8, -0x3

    invoke-static {v8, v9}, Leb/e4;->h(J)Leb/z3;

    move-result-object v8

    invoke-virtual {v4, v8}, Leb/l1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Leb/e4;

    if-eqz v5, :cond_7

    if-eqz v4, :cond_7

    invoke-virtual {v5}, Leb/e4;->d()Leb/x3;

    move-result-object v5

    invoke-virtual {v5}, Leb/x3;->q()Leb/m3;

    move-result-object v5

    invoke-virtual {v4}, Leb/e4;->d()Leb/x3;

    move-result-object v4

    invoke-virtual {v4}, Leb/x3;->q()Leb/m3;

    move-result-object v4

    invoke-virtual {v5}, Leb/m3;->d()I

    move-result v8

    if-ne v8, v6, :cond_6

    invoke-virtual {v4}, Leb/m3;->d()I

    move-result v8

    if-ne v8, v6, :cond_6

    const-string v6, "MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAE"

    invoke-static {v6, v3}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v3

    invoke-virtual {v5}, Leb/m3;->p()[B

    move-result-object v5

    invoke-virtual {v4}, Leb/m3;->p()[B

    move-result-object v4

    filled-new-array {v3, v5, v4}, [[B

    move-result-object v3

    invoke-static {v3}, Leb/y2;->a([[B)[B

    move-result-object v7

    goto :goto_4

    :catch_1
    move-exception v0

    goto/16 :goto_5

    :cond_6
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v7}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v10}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    cmp-long v5, v13, v8

    if-nez v5, :cond_4

    const-wide/16 v8, 0x6

    cmp-long v5, v17, v8

    if-nez v5, :cond_4

    invoke-virtual {v4}, Leb/b4;->q()Leb/l1;

    move-result-object v4

    invoke-static/range {v15 .. v16}, Leb/e4;->h(J)Leb/z3;

    move-result-object v5

    invoke-virtual {v4, v5}, Leb/l1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Leb/e4;

    if-eqz v4, :cond_a

    invoke-virtual {v4}, Leb/e4;->d()Leb/x3;

    move-result-object v4

    invoke-virtual {v4}, Leb/x3;->q()Leb/m3;

    move-result-object v4

    invoke-virtual {v4}, Leb/m3;->d()I

    move-result v5

    if-ne v5, v6, :cond_9

    const-string v5, "MCowBQYDK2VwAyEA"

    invoke-static {v5, v3}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v3

    invoke-virtual {v4}, Leb/m3;->p()[B

    move-result-object v4

    filled-new-array {v3, v4}, [[B

    move-result-object v3

    invoke-static {v3}, Leb/y2;->a([[B)[B

    move-result-object v7

    goto :goto_4

    :cond_9
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v7}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_a
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v10}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_8
    .catch Leb/d4; {:try_start_8 .. :try_end_8} :catch_1
    .catch Lorg/json/JSONException; {:try_start_8 .. :try_end_8} :catch_0

    :goto_4
    :try_start_9
    const-string v3, "authenticatorData"

    invoke-virtual {v2}, Leb/m3;->p()[B

    move-result-object v2

    invoke-static {v2}, Lu9/c;->b([B)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "publicKeyAlgorithm"

    invoke-virtual {v0, v2, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    if-eqz v7, :cond_b

    const-string v2, "publicKey"

    invoke-static {v7}, Lu9/c;->b([B)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_9
    .catch Lorg/json/JSONException; {:try_start_9 .. :try_end_9} :catch_0

    :cond_b
    return-object v0

    :cond_c
    :try_start_a
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v10}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_a
    .catch Leb/d4; {:try_start_a .. :try_end_a} :catch_1
    .catch Lorg/json/JSONException; {:try_start_a .. :try_end_a} :catch_0

    :goto_5
    :try_start_b
    new-instance v2, Ljava/lang/IllegalArgumentException;

    const-string v3, "COSE key ill-formed"

    invoke-direct {v2, v3, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :cond_d
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v10}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :catch_2
    move-exception v0

    goto :goto_6

    :catch_3
    move-exception v0

    :goto_6
    new-instance v2, Ljava/lang/IllegalArgumentException;

    const-string v3, "failed to parse COSE key"

    invoke-direct {v2, v3, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
    :try_end_b
    .catch Lorg/json/JSONException; {:try_start_b .. :try_end_b} :catch_0

    :catch_4
    move-exception v0

    goto :goto_7

    :cond_e
    :try_start_c
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v2, "authData does not include credential data"

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_c
    .catch Ljava/lang/IllegalArgumentException; {:try_start_c .. :try_end_c} :catch_4
    .catch Lorg/json/JSONException; {:try_start_c .. :try_end_c} :catch_0

    :goto_7
    :try_start_d
    new-instance v2, Ljava/lang/IllegalArgumentException;

    const-string v3, "ill-formed authenticator data"

    invoke-direct {v2, v3, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
    :try_end_d
    .catch Lorg/json/JSONException; {:try_start_d .. :try_end_d} :catch_0

    :catch_5
    move-exception v0

    goto :goto_8

    :cond_f
    :try_start_e
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v2, "attestation object missing authData"

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_e
    .catch Leb/d4; {:try_start_e .. :try_end_e} :catch_5
    .catch Lorg/json/JSONException; {:try_start_e .. :try_end_e} :catch_0

    :goto_8
    :try_start_f
    new-instance v2, Ljava/lang/IllegalArgumentException;

    const-string v3, "authData value has wrong type"

    invoke-direct {v2, v3, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :catch_6
    move-exception v0

    goto :goto_9

    :catch_7
    move-exception v0

    :goto_9
    new-instance v2, Ljava/lang/IllegalArgumentException;

    const-string v3, "failed to parse attestation object"

    invoke-direct {v2, v3, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
    :try_end_f
    .catch Lorg/json/JSONException; {:try_start_f .. :try_end_f} :catch_0

    :goto_a
    new-instance v2, Ljava/lang/RuntimeException;

    const-string v3, "Error encoding AuthenticatorAttestationResponse to JSON object"

    invoke-direct {v2, v3, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
.end method
