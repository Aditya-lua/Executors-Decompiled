.class public Lda/r;
.super Lda/y;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lda/r$a;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lda/r;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final f:Lda/u;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final g:Lda/w;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final h:[B
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final i:Ljava/util/List;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final j:Ljava/lang/Double;

.field public final k:Ljava/util/List;

.field public final l:Lda/k;

.field public final m:Ljava/lang/Integer;

.field public final n:Lda/a0;

.field public final o:Lda/c;

.field public final p:Lda/d;

.field public final q:Ljava/lang/String;

.field public r:Landroid/os/ResultReceiver;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lda/s0;

    invoke-direct {v0}, Lda/s0;-><init>()V

    sput-object v0, Lda/r;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lda/u;Lda/w;[BLjava/util/List;Ljava/lang/Double;Ljava/util/List;Lda/k;Ljava/lang/Integer;Lda/a0;Ljava/lang/String;Lda/d;Ljava/lang/String;Landroid/os/ResultReceiver;)V
    .locals 0
    .param p1    # Lda/u;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lda/w;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # [B
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Ljava/util/List;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Lda/y;-><init>()V

    iput-object p13, p0, Lda/r;->r:Landroid/os/ResultReceiver;

    if-eqz p12, :cond_0

    .line 2
    :try_start_0
    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1, p12}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lda/r;->M3(Lorg/json/JSONObject;)Lda/r;

    move-result-object p1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object p2, p1, Lda/r;->f:Lda/u;

    iput-object p2, p0, Lda/r;->f:Lda/u;

    iget-object p2, p1, Lda/r;->g:Lda/w;

    iput-object p2, p0, Lda/r;->g:Lda/w;

    iget-object p2, p1, Lda/r;->h:[B

    iput-object p2, p0, Lda/r;->h:[B

    iget-object p2, p1, Lda/r;->i:Ljava/util/List;

    iput-object p2, p0, Lda/r;->i:Ljava/util/List;

    iget-object p2, p1, Lda/r;->j:Ljava/lang/Double;

    iput-object p2, p0, Lda/r;->j:Ljava/lang/Double;

    iget-object p2, p1, Lda/r;->k:Ljava/util/List;

    iput-object p2, p0, Lda/r;->k:Ljava/util/List;

    iget-object p2, p1, Lda/r;->l:Lda/k;

    iput-object p2, p0, Lda/r;->l:Lda/k;

    iget-object p2, p1, Lda/r;->m:Ljava/lang/Integer;

    iput-object p2, p0, Lda/r;->m:Ljava/lang/Integer;

    iget-object p2, p1, Lda/r;->n:Lda/a0;

    iput-object p2, p0, Lda/r;->n:Lda/a0;

    iget-object p2, p1, Lda/r;->o:Lda/c;

    iput-object p2, p0, Lda/r;->o:Lda/c;

    iget-object p1, p1, Lda/r;->p:Lda/d;

    iput-object p1, p0, Lda/r;->p:Lda/d;

    iput-object p12, p0, Lda/r;->q:Ljava/lang/String;

    return-void

    :catch_0
    move-exception p1

    .line 3
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 4
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    .line 5
    :cond_0
    invoke-static {p1}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lda/u;

    iput-object p1, p0, Lda/r;->f:Lda/u;

    .line 6
    invoke-static {p2}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lda/w;

    iput-object p1, p0, Lda/r;->g:Lda/w;

    .line 7
    invoke-static {p3}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    iput-object p1, p0, Lda/r;->h:[B

    .line 8
    invoke-static {p4}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    iput-object p1, p0, Lda/r;->i:Ljava/util/List;

    iput-object p5, p0, Lda/r;->j:Ljava/lang/Double;

    iput-object p6, p0, Lda/r;->k:Ljava/util/List;

    iput-object p7, p0, Lda/r;->l:Lda/k;

    iput-object p8, p0, Lda/r;->m:Ljava/lang/Integer;

    iput-object p9, p0, Lda/r;->n:Lda/a0;

    const/4 p1, 0x0

    if-eqz p10, :cond_1

    .line 9
    :try_start_1
    invoke-static {p10}, Lda/c;->a(Ljava/lang/String;)Lda/c;

    move-result-object p2

    iput-object p2, p0, Lda/r;->o:Lda/c;
    :try_end_1
    .catch Lda/c$a; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    move-exception p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 10
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    .line 11
    :cond_1
    iput-object p1, p0, Lda/r;->o:Lda/c;

    .line 12
    :goto_0
    iput-object p11, p0, Lda/r;->p:Lda/d;

    iput-object p1, p0, Lda/r;->q:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 13
    invoke-direct {p0}, Lda/y;-><init>()V

    .line 14
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lda/r;->M3(Lorg/json/JSONObject;)Lda/r;

    move-result-object v0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    iget-object v1, v0, Lda/r;->f:Lda/u;

    iput-object v1, p0, Lda/r;->f:Lda/u;

    iget-object v1, v0, Lda/r;->g:Lda/w;

    iput-object v1, p0, Lda/r;->g:Lda/w;

    iget-object v1, v0, Lda/r;->h:[B

    iput-object v1, p0, Lda/r;->h:[B

    iget-object v1, v0, Lda/r;->i:Ljava/util/List;

    iput-object v1, p0, Lda/r;->i:Ljava/util/List;

    iget-object v1, v0, Lda/r;->j:Ljava/lang/Double;

    iput-object v1, p0, Lda/r;->j:Ljava/lang/Double;

    iget-object v1, v0, Lda/r;->k:Ljava/util/List;

    iput-object v1, p0, Lda/r;->k:Ljava/util/List;

    iget-object v1, v0, Lda/r;->l:Lda/k;

    iput-object v1, p0, Lda/r;->l:Lda/k;

    iget-object v1, v0, Lda/r;->m:Ljava/lang/Integer;

    iput-object v1, p0, Lda/r;->m:Ljava/lang/Integer;

    iget-object v1, v0, Lda/r;->n:Lda/a0;

    iput-object v1, p0, Lda/r;->n:Lda/a0;

    iget-object v1, v0, Lda/r;->o:Lda/c;

    iput-object v1, p0, Lda/r;->o:Lda/c;

    iget-object v0, v0, Lda/r;->p:Lda/d;

    iput-object v0, p0, Lda/r;->p:Lda/d;

    iput-object p1, p0, Lda/r;->q:Ljava/lang/String;

    return-void

    :catch_0
    move-exception p1

    .line 16
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 17
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static M3(Lorg/json/JSONObject;)Lda/r;
    .locals 10
    .param p0    # Lorg/json/JSONObject;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lda/r$a;

    invoke-direct {v0}, Lda/r$a;-><init>()V

    const-string v1, "rp"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    sget-object v2, Lda/u;->CREATOR:Landroid/os/Parcelable$Creator;

    const-string v2, "id"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "name"

    invoke-virtual {v1, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "icon"

    invoke-virtual {v1, v6}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v7

    const/4 v8, 0x0

    if-eqz v7, :cond_0

    invoke-virtual {v1, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v8

    :goto_0
    new-instance v7, Lda/u;

    invoke-direct {v7, v3, v5, v1}, Lda/u;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v7}, Lda/r$a;->h(Lda/u;)Lda/r$a;

    const-string v1, "user"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    sget-object v3, Lda/w;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lv9/c;->a(Ljava/lang/String;)[B

    move-result-object v2

    invoke-virtual {v1, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "displayName"

    invoke-virtual {v1, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v6}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-virtual {v1, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_1
    move-object v1, v8

    :goto_1
    new-instance v5, Lda/w;

    invoke-direct {v5, v2, v3, v1, v4}, Lda/w;-><init>([BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v5}, Lda/r$a;->j(Lda/w;)Lda/r$a;

    const-string v1, "challenge"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lv9/c;->a(Ljava/lang/String;)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lda/r$a;->e([B)Lda/r$a;

    const-string v1, "pubKeyCredParams"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    const/4 v3, 0x0

    move v4, v3

    :goto_2
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v5

    if-ge v4, v5, :cond_3

    invoke-virtual {v1, v4}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v5

    :try_start_0
    new-instance v6, Lda/t;

    const-string v7, "type"

    invoke-virtual {v5, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v9, "alg"

    invoke-virtual {v5, v9}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v5

    invoke-direct {v6, v7, v5}, Lda/t;-><init>(Ljava/lang/String;I)V

    invoke-static {v6}, Lfb/m0;->d(Ljava/lang/Object;)Lfb/m0;

    move-result-object v5
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    invoke-static {}, Lfb/m0;->c()Lfb/m0;

    move-result-object v5

    :goto_3
    invoke-virtual {v5}, Lfb/m0;->b()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-virtual {v5}, Lfb/m0;->a()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_3
    invoke-virtual {v0, v2}, Lda/r$a;->g(Ljava/util/List;)Lda/r$a;

    const-string v1, "timeout"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    move-result-wide v1

    const-wide v4, 0x408f400000000000L    # 1000.0

    div-double/2addr v1, v4

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v0, v1}, Lda/r$a;->i(Ljava/lang/Double;)Lda/r$a;

    :cond_4
    const-string v1, "excludeCredentials"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    :goto_4
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v4

    if-ge v3, v4, :cond_5

    invoke-virtual {v1, v3}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v4

    invoke-static {v4}, Lda/s;->D3(Lorg/json/JSONObject;)Lda/s;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    :cond_5
    invoke-virtual {v0, v2}, Lda/r$a;->f(Ljava/util/List;)Lda/r$a;

    :cond_6
    const-string v1, "authenticatorSelection"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_b

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    sget-object v2, Lda/k;->CREATOR:Landroid/os/Parcelable$Creator;

    const-string v2, "authenticatorAttachment"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto :goto_5

    :cond_7
    move-object v2, v8

    :goto_5
    const-string v3, "residentKey"

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    goto :goto_6

    :cond_8
    move-object v3, v8

    :goto_6
    const-string v4, "requireResidentKey"

    invoke-virtual {v1, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_9

    invoke-virtual {v1, v4}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v4

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    goto :goto_7

    :cond_9
    move-object v4, v8

    :goto_7
    const-string v5, "userVerification"

    invoke-virtual {v1, v5}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_a

    invoke-virtual {v1, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    :cond_a
    new-instance v1, Lda/k;

    invoke-direct {v1, v2, v4, v8, v3}, Lda/k;-><init>(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lda/r$a;->d(Lda/k;)Lda/r$a;

    :cond_b
    const-string v1, "extensions"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_c

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    invoke-static {v1}, Lda/d;->C3(Lorg/json/JSONObject;)Lda/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lda/r$a;->c(Lda/d;)Lda/r$a;

    :cond_c
    const-string v1, "attestation"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_d

    :try_start_1
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lda/c;->a(Ljava/lang/String;)Lda/c;

    move-result-object p0

    invoke-virtual {v0, p0}, Lda/r$a;->b(Lda/c;)Lda/r$a;
    :try_end_1
    .catch Lda/c$a; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_8

    :catch_1
    move-exception p0

    const-string v1, "PKCCreationOptions"

    const-string v2, "Invalid AttestationConveyancePreference"

    invoke-static {v1, v2, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    sget-object p0, Lda/c;->b:Lda/c;

    invoke-virtual {v0, p0}, Lda/r$a;->b(Lda/c;)Lda/r$a;

    :cond_d
    :goto_8
    invoke-virtual {v0}, Lda/r$a;->a()Lda/r;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public A3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lda/r;->o:Lda/c;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {v0}, Lda/c;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public B3()Lda/d;
    .locals 1

    iget-object v0, p0, Lda/r;->p:Lda/d;

    return-object v0
.end method

.method public C3()Lda/k;
    .locals 1

    iget-object v0, p0, Lda/r;->l:Lda/k;

    return-object v0
.end method

.method public D3()[B
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lda/r;->h:[B

    return-object v0
.end method

.method public E3()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lda/s;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lda/r;->k:Ljava/util/List;

    return-object v0
.end method

.method public F3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lda/r;->q:Ljava/lang/String;

    return-object v0
.end method

.method public G3()Ljava/util/List;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lda/t;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lda/r;->i:Ljava/util/List;

    return-object v0
.end method

.method public H3()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lda/r;->m:Ljava/lang/Integer;

    return-object v0
.end method

.method public I3()Lda/u;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lda/r;->f:Lda/u;

    return-object v0
.end method

.method public J3()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lda/r;->j:Ljava/lang/Double;

    return-object v0
.end method

.method public K3()Lda/a0;
    .locals 1

    iget-object v0, p0, Lda/r;->n:Lda/a0;

    return-object v0
.end method

.method public L3()Lda/w;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lda/r;->g:Lda/w;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    instance-of v0, p1, Lda/r;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lda/r;

    iget-object v0, p0, Lda/r;->f:Lda/u;

    iget-object v2, p1, Lda/r;->f:Lda/u;

    invoke-static {v0, v2}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lda/r;->g:Lda/w;

    iget-object v2, p1, Lda/r;->g:Lda/w;

    invoke-static {v0, v2}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lda/r;->h:[B

    iget-object v2, p1, Lda/r;->h:[B

    invoke-static {v0, v2}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lda/r;->j:Ljava/lang/Double;

    iget-object v2, p1, Lda/r;->j:Ljava/lang/Double;

    invoke-static {v0, v2}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lda/r;->i:Ljava/util/List;

    iget-object v2, p1, Lda/r;->i:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->containsAll(Ljava/util/Collection;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p1, Lda/r;->i:Ljava/util/List;

    iget-object v2, p0, Lda/r;->i:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->containsAll(Ljava/util/Collection;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lda/r;->k:Ljava/util/List;

    if-nez v0, :cond_1

    iget-object v2, p1, Lda/r;->k:Ljava/util/List;

    if-eqz v2, :cond_2

    :cond_1
    if-eqz v0, :cond_3

    iget-object v2, p1, Lda/r;->k:Ljava/util/List;

    if-eqz v2, :cond_3

    invoke-interface {v0, v2}, Ljava/util/List;->containsAll(Ljava/util/Collection;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p1, Lda/r;->k:Ljava/util/List;

    iget-object v2, p0, Lda/r;->k:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->containsAll(Ljava/util/Collection;)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    iget-object v0, p0, Lda/r;->l:Lda/k;

    iget-object v2, p1, Lda/r;->l:Lda/k;

    invoke-static {v0, v2}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lda/r;->m:Ljava/lang/Integer;

    iget-object v2, p1, Lda/r;->m:Ljava/lang/Integer;

    invoke-static {v0, v2}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lda/r;->n:Lda/a0;

    iget-object v2, p1, Lda/r;->n:Lda/a0;

    invoke-static {v0, v2}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lda/r;->o:Lda/c;

    iget-object v2, p1, Lda/r;->o:Lda/c;

    invoke-static {v0, v2}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lda/r;->p:Lda/d;

    iget-object v2, p1, Lda/r;->p:Lda/d;

    invoke-static {v0, v2}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lda/r;->q:Ljava/lang/String;

    iget-object p1, p1, Lda/r;->q:Ljava/lang/String;

    invoke-static {v0, p1}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    const/4 p1, 0x1

    return p1

    :cond_3
    return v1
.end method

.method public hashCode()I
    .locals 12

    iget-object v0, p0, Lda/r;->f:Lda/u;

    iget-object v1, p0, Lda/r;->g:Lda/w;

    iget-object v2, p0, Lda/r;->h:[B

    invoke-static {v2}, Ljava/util/Arrays;->hashCode([B)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget-object v3, p0, Lda/r;->i:Ljava/util/List;

    iget-object v4, p0, Lda/r;->j:Ljava/lang/Double;

    iget-object v5, p0, Lda/r;->k:Ljava/util/List;

    iget-object v6, p0, Lda/r;->l:Lda/k;

    iget-object v7, p0, Lda/r;->m:Ljava/lang/Integer;

    iget-object v8, p0, Lda/r;->n:Lda/a0;

    iget-object v9, p0, Lda/r;->o:Lda/c;

    iget-object v10, p0, Lda/r;->p:Lda/d;

    iget-object v11, p0, Lda/r;->q:Ljava/lang/String;

    filled-new-array/range {v0 .. v11}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lo9/q;->c([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 11
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lda/r;->p:Lda/d;

    iget-object v1, p0, Lda/r;->o:Lda/c;

    iget-object v2, p0, Lda/r;->n:Lda/a0;

    iget-object v3, p0, Lda/r;->l:Lda/k;

    iget-object v4, p0, Lda/r;->k:Ljava/util/List;

    iget-object v5, p0, Lda/r;->i:Ljava/util/List;

    iget-object v6, p0, Lda/r;->h:[B

    iget-object v7, p0, Lda/r;->g:Lda/w;

    iget-object v8, p0, Lda/r;->f:Lda/u;

    invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v6}, Lv9/c;->b([B)Ljava/lang/String;

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

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "PublicKeyCredentialCreationOptions{\n rp="

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, ", \n user="

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, ", \n challenge="

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, ", \n parameters="

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ", \n timeoutSeconds="

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Lda/r;->j:Ljava/lang/Double;

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, ", \n excludeList="

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ", \n authenticatorSelection="

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", \n requestId="

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lda/r;->m:Ljava/lang/Integer;

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ", \n tokenBinding="

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", \n attestationConveyancePreference="

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", \n authenticationExtensions="

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "}"

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

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

    invoke-virtual {p0}, Lda/r;->I3()Lda/u;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, p2, v3}, Lp9/c;->t(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/4 v1, 0x3

    invoke-virtual {p0}, Lda/r;->L3()Lda/w;

    move-result-object v2

    invoke-static {p1, v1, v2, p2, v3}, Lp9/c;->t(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/4 v1, 0x4

    invoke-virtual {p0}, Lda/r;->D3()[B

    move-result-object v2

    invoke-static {p1, v1, v2, v3}, Lp9/c;->g(Landroid/os/Parcel;I[BZ)V

    const/4 v1, 0x5

    invoke-virtual {p0}, Lda/r;->G3()Ljava/util/List;

    move-result-object v2

    invoke-static {p1, v1, v2, v3}, Lp9/c;->z(Landroid/os/Parcel;ILjava/util/List;Z)V

    const/4 v1, 0x6

    invoke-virtual {p0}, Lda/r;->J3()Ljava/lang/Double;

    move-result-object v2

    invoke-static {p1, v1, v2, v3}, Lp9/c;->j(Landroid/os/Parcel;ILjava/lang/Double;Z)V

    const/4 v1, 0x7

    invoke-virtual {p0}, Lda/r;->E3()Ljava/util/List;

    move-result-object v2

    invoke-static {p1, v1, v2, v3}, Lp9/c;->z(Landroid/os/Parcel;ILjava/util/List;Z)V

    const/16 v1, 0x8

    invoke-virtual {p0}, Lda/r;->C3()Lda/k;

    move-result-object v2

    invoke-static {p1, v1, v2, p2, v3}, Lp9/c;->t(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/16 v1, 0x9

    invoke-virtual {p0}, Lda/r;->H3()Ljava/lang/Integer;

    move-result-object v2

    invoke-static {p1, v1, v2, v3}, Lp9/c;->q(Landroid/os/Parcel;ILjava/lang/Integer;Z)V

    const/16 v1, 0xa

    invoke-virtual {p0}, Lda/r;->K3()Lda/a0;

    move-result-object v2

    invoke-static {p1, v1, v2, p2, v3}, Lp9/c;->t(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/16 v1, 0xb

    invoke-virtual {p0}, Lda/r;->A3()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v1, v2, v3}, Lp9/c;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/16 v1, 0xc

    invoke-virtual {p0}, Lda/r;->B3()Lda/d;

    move-result-object v2

    invoke-static {p1, v1, v2, p2, v3}, Lp9/c;->t(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/16 v1, 0xd

    invoke-virtual {p0}, Lda/r;->F3()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v1, v2, v3}, Lp9/c;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/16 v1, 0xe

    iget-object v2, p0, Lda/r;->r:Landroid/os/ResultReceiver;

    invoke-static {p1, v1, v2, p2, v3}, Lp9/c;->t(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-static {p1, v0}, Lp9/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
