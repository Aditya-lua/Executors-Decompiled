.class public Lda/d;
.super Lp9/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lda/d$a;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lda/d;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final f:Lda/o;

.field public final g:Lda/y1;

.field public final h:Lda/b0;

.field public final i:Lda/e2;

.field public final j:Lda/h0;

.field public final k:Lda/j0;

.field public final l:Lda/a2;

.field public final m:Lda/m0;

.field public final n:Lda/p;

.field public final o:Lda/q0;

.field public final p:Lda/a1;

.field public final q:Lda/o0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lda/l1;

    invoke-direct {v0}, Lda/l1;-><init>()V

    sput-object v0, Lda/d;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lda/o;Lda/y1;Lda/b0;Lda/e2;Lda/h0;Lda/j0;Lda/a2;Lda/m0;Lda/p;Lda/q0;Lda/a1;Lda/o0;)V
    .locals 0

    invoke-direct {p0}, Lp9/a;-><init>()V

    iput-object p1, p0, Lda/d;->f:Lda/o;

    iput-object p3, p0, Lda/d;->h:Lda/b0;

    iput-object p2, p0, Lda/d;->g:Lda/y1;

    iput-object p4, p0, Lda/d;->i:Lda/e2;

    iput-object p5, p0, Lda/d;->j:Lda/h0;

    iput-object p6, p0, Lda/d;->k:Lda/j0;

    iput-object p7, p0, Lda/d;->l:Lda/a2;

    iput-object p8, p0, Lda/d;->m:Lda/m0;

    iput-object p9, p0, Lda/d;->n:Lda/p;

    iput-object p10, p0, Lda/d;->o:Lda/q0;

    iput-object p11, p0, Lda/d;->p:Lda/a1;

    iput-object p12, p0, Lda/d;->q:Lda/o0;

    return-void
.end method

.method public static C3(Lorg/json/JSONObject;)Lda/d;
    .locals 12
    .param p0    # Lorg/json/JSONObject;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lda/d$a;

    invoke-direct {v0}, Lda/d$a;-><init>()V

    const-string v1, "fidoAppIdExtension"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    const-string v3, "appid"

    if-eqz v2, :cond_0

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    new-instance v2, Lda/o;

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Lda/o;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Lda/d$a;->b(Lda/o;)Lda/d$a;

    :cond_0
    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lda/o;

    invoke-direct {v2, v1}, Lda/o;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Lda/d$a;->b(Lda/o;)Lda/d$a;

    :cond_1
    const-string v1, "prf"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    const/4 v3, 0x0

    const-string v4, "prfAlreadyHashed"

    if-eqz v2, :cond_3

    invoke-virtual {p0, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    invoke-static {v1, v3}, Lda/q0;->a(Lorg/json/JSONObject;Z)Lda/q0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lda/d$a;->k(Lda/q0;)Lda/d$a;

    goto :goto_0

    :cond_2
    new-instance p0, Lorg/json/JSONException;

    const-string v0, "both prf and prfAlreadyHashed extensions found"

    invoke-direct {p0, v0}, Lorg/json/JSONException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    invoke-virtual {p0, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {p0, v4}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v1, v2}, Lda/q0;->a(Lorg/json/JSONObject;Z)Lda/q0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lda/d$a;->k(Lda/q0;)Lda/d$a;

    :cond_4
    :goto_0
    const-string v1, "cableAuthenticationExtension"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    :goto_1
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v4

    if-ge v3, v4, :cond_5

    invoke-virtual {v1, v3}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v4

    new-instance v5, Lda/w1;

    const-string v6, "version"

    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v6

    const-string v8, "clientEid"

    invoke-virtual {v4, v8}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const/16 v9, 0xb

    invoke-static {v8, v9}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v8

    const-string v10, "authenticatorEid"

    invoke-virtual {v4, v10}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v9}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v10

    const-string v11, "sessionPreKey"

    invoke-virtual {v4, v11}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v9}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v4

    move-object v9, v10

    move-object v10, v4

    invoke-direct/range {v5 .. v10}, Lda/w1;-><init>(J[B[B[B)V

    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_5
    new-instance v1, Lda/y1;

    invoke-direct {v1, v2}, Lda/y1;-><init>(Ljava/util/List;)V

    invoke-virtual {v0, v1}, Lda/d$a;->e(Lda/y1;)Lda/d$a;

    :cond_6
    const-string v1, "userVerificationMethodExtension"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    new-instance v2, Lda/b0;

    const-string v3, "uvm"

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    invoke-direct {v2, v1}, Lda/b0;-><init>(Z)V

    invoke-virtual {v0, v2}, Lda/d$a;->d(Lda/b0;)Lda/d$a;

    :cond_7
    const-string v1, "google_multiAssertionExtension"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    new-instance v2, Lda/e2;

    const-string v3, "requestForMultiAssertion"

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    invoke-direct {v2, v1}, Lda/e2;-><init>(Z)V

    invoke-virtual {v0, v2}, Lda/d$a;->g(Lda/e2;)Lda/d$a;

    :cond_8
    const-string v1, "google_sessionIdExtension"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    new-instance v2, Lda/h0;

    const-string v3, "sessionId"

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    int-to-long v3, v1

    invoke-direct {v2, v3, v4}, Lda/h0;-><init>(J)V

    invoke-virtual {v0, v2}, Lda/d$a;->h(Lda/h0;)Lda/d$a;

    :cond_9
    const-string v1, "google_silentVerificationExtension"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    new-instance v2, Lda/j0;

    const-string v3, "silentVerification"

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    invoke-direct {v2, v1}, Lda/j0;-><init>(Z)V

    invoke-virtual {v0, v2}, Lda/d$a;->i(Lda/j0;)Lda/d$a;

    :cond_a
    const-string v1, "devicePublicKeyExtension"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_b

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    new-instance v2, Lda/a2;

    const-string v3, "devicePublicKey"

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    invoke-direct {v2, v1}, Lda/a2;-><init>(Z)V

    invoke-virtual {v0, v2}, Lda/d$a;->f(Lda/a2;)Lda/d$a;

    :cond_b
    const-string v1, "google_tunnelServerIdExtension"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_c

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    new-instance v2, Lda/m0;

    const-string v3, "tunnelServerId"

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Lda/m0;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Lda/d$a;->j(Lda/m0;)Lda/d$a;

    :cond_c
    const-string v1, "google_thirdPartyPaymentExtension"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_d

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    new-instance v2, Lda/p;

    const-string v3, "thirdPartyPayment"

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    invoke-direct {v2, v1}, Lda/p;-><init>(Z)V

    invoke-virtual {v0, v2}, Lda/d$a;->c(Lda/p;)Lda/d$a;

    :cond_d
    const-string v1, "txAuthSimple"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_e

    new-instance v2, Lda/a1;

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v2, p0}, Lda/a1;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Lda/d$a;->l(Lda/a1;)Lda/d$a;

    :cond_e
    invoke-virtual {v0}, Lda/d$a;->a()Lda/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public A3()Lda/o;
    .locals 1

    iget-object v0, p0, Lda/d;->f:Lda/o;

    return-object v0
.end method

.method public B3()Lda/b0;
    .locals 1

    iget-object v0, p0, Lda/d;->h:Lda/b0;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lda/d;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lda/d;

    iget-object v0, p0, Lda/d;->f:Lda/o;

    iget-object v2, p1, Lda/d;->f:Lda/o;

    invoke-static {v0, v2}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lda/d;->g:Lda/y1;

    iget-object v2, p1, Lda/d;->g:Lda/y1;

    invoke-static {v0, v2}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lda/d;->h:Lda/b0;

    iget-object v2, p1, Lda/d;->h:Lda/b0;

    invoke-static {v0, v2}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lda/d;->i:Lda/e2;

    iget-object v2, p1, Lda/d;->i:Lda/e2;

    invoke-static {v0, v2}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lda/d;->j:Lda/h0;

    iget-object v2, p1, Lda/d;->j:Lda/h0;

    invoke-static {v0, v2}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lda/d;->k:Lda/j0;

    iget-object v2, p1, Lda/d;->k:Lda/j0;

    invoke-static {v0, v2}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lda/d;->l:Lda/a2;

    iget-object v2, p1, Lda/d;->l:Lda/a2;

    invoke-static {v0, v2}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lda/d;->m:Lda/m0;

    iget-object v2, p1, Lda/d;->m:Lda/m0;

    invoke-static {v0, v2}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lda/d;->n:Lda/p;

    iget-object v2, p1, Lda/d;->n:Lda/p;

    invoke-static {v0, v2}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lda/d;->o:Lda/q0;

    iget-object v2, p1, Lda/d;->o:Lda/q0;

    invoke-static {v0, v2}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lda/d;->p:Lda/a1;

    iget-object v2, p1, Lda/d;->p:Lda/a1;

    invoke-static {v0, v2}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lda/d;->q:Lda/o0;

    iget-object p1, p1, Lda/d;->q:Lda/o0;

    invoke-static {v0, p1}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public hashCode()I
    .locals 12

    iget-object v0, p0, Lda/d;->f:Lda/o;

    iget-object v1, p0, Lda/d;->g:Lda/y1;

    iget-object v2, p0, Lda/d;->h:Lda/b0;

    iget-object v3, p0, Lda/d;->i:Lda/e2;

    iget-object v4, p0, Lda/d;->j:Lda/h0;

    iget-object v5, p0, Lda/d;->k:Lda/j0;

    iget-object v6, p0, Lda/d;->l:Lda/a2;

    iget-object v7, p0, Lda/d;->m:Lda/m0;

    iget-object v8, p0, Lda/d;->n:Lda/p;

    iget-object v9, p0, Lda/d;->o:Lda/q0;

    iget-object v10, p0, Lda/d;->p:Lda/a1;

    iget-object v11, p0, Lda/d;->q:Lda/o0;

    filled-new-array/range {v0 .. v11}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lo9/q;->c([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 13
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lda/d;->p:Lda/a1;

    iget-object v1, p0, Lda/d;->o:Lda/q0;

    iget-object v2, p0, Lda/d;->n:Lda/p;

    iget-object v3, p0, Lda/d;->m:Lda/m0;

    iget-object v4, p0, Lda/d;->l:Lda/a2;

    iget-object v5, p0, Lda/d;->k:Lda/j0;

    iget-object v6, p0, Lda/d;->j:Lda/h0;

    iget-object v7, p0, Lda/d;->i:Lda/e2;

    iget-object v8, p0, Lda/d;->h:Lda/b0;

    iget-object v9, p0, Lda/d;->g:Lda/y1;

    iget-object v10, p0, Lda/d;->f:Lda/o;

    invoke-static {v10}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v9}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "AuthenticationExtensions{\n fidoAppIdExtension="

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v10, ", \n cableAuthenticationExtension="

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, ", \n userVerificationMethodExtension="

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, ", \n googleMultiAssertionExtension="

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, ", \n googleSessionIdExtension="

    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, ", \n googleSilentVerificationExtension="

    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ", \n devicePublicKeyExtension="

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ", \n googleTunnelServerIdExtension="

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", \n googleThirdPartyPaymentExtension="

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", \n prfExtension="

    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", \n simpleTransactionAuthorizationExtension="

    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "}"

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 4
    .param p1    # Landroid/os/Parcel;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {p1}, Lp9/c;->a(Landroid/os/Parcel;)I

    move-result v0

    invoke-virtual {p0}, Lda/d;->A3()Lda/o;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, p2, v3}, Lp9/c;->t(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/4 v1, 0x3

    iget-object v2, p0, Lda/d;->g:Lda/y1;

    invoke-static {p1, v1, v2, p2, v3}, Lp9/c;->t(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/4 v1, 0x4

    invoke-virtual {p0}, Lda/d;->B3()Lda/b0;

    move-result-object v2

    invoke-static {p1, v1, v2, p2, v3}, Lp9/c;->t(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/4 v1, 0x5

    iget-object v2, p0, Lda/d;->i:Lda/e2;

    invoke-static {p1, v1, v2, p2, v3}, Lp9/c;->t(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/4 v1, 0x6

    iget-object v2, p0, Lda/d;->j:Lda/h0;

    invoke-static {p1, v1, v2, p2, v3}, Lp9/c;->t(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/4 v1, 0x7

    iget-object v2, p0, Lda/d;->k:Lda/j0;

    invoke-static {p1, v1, v2, p2, v3}, Lp9/c;->t(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/16 v1, 0x8

    iget-object v2, p0, Lda/d;->l:Lda/a2;

    invoke-static {p1, v1, v2, p2, v3}, Lp9/c;->t(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/16 v1, 0x9

    iget-object v2, p0, Lda/d;->m:Lda/m0;

    invoke-static {p1, v1, v2, p2, v3}, Lp9/c;->t(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/16 v1, 0xa

    iget-object v2, p0, Lda/d;->n:Lda/p;

    invoke-static {p1, v1, v2, p2, v3}, Lp9/c;->t(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/16 v1, 0xb

    iget-object v2, p0, Lda/d;->o:Lda/q0;

    invoke-static {p1, v1, v2, p2, v3}, Lp9/c;->t(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/16 v1, 0xc

    iget-object v2, p0, Lda/d;->p:Lda/a1;

    invoke-static {p1, v1, v2, p2, v3}, Lp9/c;->t(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/16 v1, 0xd

    iget-object v2, p0, Lda/d;->q:Lda/o0;

    invoke-static {p1, v1, v2, p2, v3}, Lp9/c;->t(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-static {p1, v0}, Lp9/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
