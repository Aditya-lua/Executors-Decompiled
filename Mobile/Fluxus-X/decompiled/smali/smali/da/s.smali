.class public Lda/s;
.super Lp9/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lda/s;",
            ">;"
        }
    .end annotation
.end field

.field public static final i:Lfb/h1;


# instance fields
.field public final f:Lda/v;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final g:Lfb/m3;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final h:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Lfb/p3;->a:Lfb/c4;

    sget-object v1, Lfb/p3;->b:Lfb/c4;

    invoke-static {v0, v1}, Lfb/h1;->n(Ljava/lang/Object;Ljava/lang/Object;)Lfb/h1;

    move-result-object v0

    sput-object v0, Lda/s;->i:Lfb/h1;

    new-instance v0, Lda/u0;

    invoke-direct {v0}, Lda/u0;-><init>()V

    sput-object v0, Lda/s;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lfb/m3;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lfb/m3;",
            "Ljava/util/List<",
            "Lcom/google/android/gms/fido/common/Transport;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lp9/a;-><init>()V

    .line 2
    invoke-static {p1}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    :try_start_0
    invoke-static {p1}, Lda/v;->a(Ljava/lang/String;)Lda/v;

    move-result-object p1

    iput-object p1, p0, Lda/s;->f:Lda/v;
    :try_end_0
    .catch Lda/v$a; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    invoke-static {p2}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lfb/m3;

    iput-object p1, p0, Lda/s;->g:Lfb/m3;

    iput-object p3, p0, Lda/s;->h:Ljava/util/List;

    return-void

    :catch_0
    move-exception p1

    .line 5
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 6
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method

.method public constructor <init>(Ljava/lang/String;[BLjava/util/List;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # [B
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "[B",
            "Ljava/util/List<",
            "Lcom/google/android/gms/fido/common/Transport;",
            ">;)V"
        }
    .end annotation

    .line 7
    sget-object v0, Lfb/m3;->b:Lfb/m3;

    const/4 v0, 0x0

    .line 8
    array-length v1, p2

    invoke-static {p2, v0, v1}, Lfb/m3;->m([BII)Lfb/m3;

    move-result-object p2

    .line 9
    invoke-direct {p0, p1, p2, p3}, Lda/s;-><init>(Ljava/lang/String;Lfb/m3;Ljava/util/List;)V

    return-void
.end method

.method public static D3(Lorg/json/JSONObject;)Lda/s;
    .locals 4
    .param p0    # Lorg/json/JSONObject;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const-string v0, "type"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "id"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0xb

    invoke-static {v1, v2}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v1

    const-string v2, "transports"

    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/gms/fido/common/Transport;->k(Lorg/json/JSONArray;)Ljava/util/List;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    new-instance v2, Lda/s;

    invoke-direct {v2, v0, v1, p0}, Lda/s;-><init>(Ljava/lang/String;[BLjava/util/List;)V

    return-object v2
.end method


# virtual methods
.method public A3()[B
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lda/s;->g:Lfb/m3;

    invoke-virtual {v0}, Lfb/m3;->n()[B

    move-result-object v0

    return-object v0
.end method

.method public B3()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/android/gms/fido/common/Transport;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lda/s;->h:Ljava/util/List;

    return-object v0
.end method

.method public C3()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lda/s;->f:Lda/v;

    invoke-virtual {v0}, Lda/v;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    instance-of v0, p1, Lda/s;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lda/s;

    iget-object v0, p0, Lda/s;->f:Lda/v;

    iget-object v2, p1, Lda/s;->f:Lda/v;

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    return v1

    :cond_1
    iget-object v0, p0, Lda/s;->g:Lfb/m3;

    iget-object v2, p1, Lda/s;->g:Lfb/m3;

    invoke-static {v0, v2}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    return v1

    :cond_2
    iget-object v0, p0, Lda/s;->h:Ljava/util/List;

    const/4 v2, 0x1

    if-nez v0, :cond_4

    iget-object v3, p1, Lda/s;->h:Ljava/util/List;

    if-eqz v3, :cond_3

    goto :goto_0

    :cond_3
    return v2

    :cond_4
    :goto_0
    if-eqz v0, :cond_6

    iget-object v3, p1, Lda/s;->h:Ljava/util/List;

    if-nez v3, :cond_5

    goto :goto_1

    :cond_5
    invoke-interface {v0, v3}, Ljava/util/List;->containsAll(Ljava/util/Collection;)Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object p1, p1, Lda/s;->h:Ljava/util/List;

    iget-object v0, p0, Lda/s;->h:Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->containsAll(Ljava/util/Collection;)Z

    move-result p1

    if-eqz p1, :cond_6

    return v2

    :cond_6
    :goto_1
    return v1
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lda/s;->f:Lda/v;

    iget-object v1, p0, Lda/s;->g:Lfb/m3;

    iget-object v2, p0, Lda/s;->h:Ljava/util/List;

    filled-new-array {v0, v1, v2}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lo9/q;->c([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lda/s;->f:Lda/v;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lda/s;->A3()[B

    move-result-object v1

    invoke-static {v1}, Lv9/c;->b([B)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lda/s;->h:Ljava/util/List;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "PublicKeyCredentialDescriptor{\n type="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", \n id="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", \n transports="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "}"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 3
    .param p1    # Landroid/os/Parcel;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {p1}, Lp9/c;->a(Landroid/os/Parcel;)I

    move-result p2

    invoke-virtual {p0}, Lda/s;->C3()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p1, v1, v0, v2}, Lp9/c;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v0, 0x3

    invoke-virtual {p0}, Lda/s;->A3()[B

    move-result-object v1

    invoke-static {p1, v0, v1, v2}, Lp9/c;->g(Landroid/os/Parcel;I[BZ)V

    const/4 v0, 0x4

    invoke-virtual {p0}, Lda/s;->B3()Ljava/util/List;

    move-result-object v1

    invoke-static {p1, v0, v1, v2}, Lp9/c;->z(Landroid/os/Parcel;ILjava/util/List;Z)V

    invoke-static {p1, p2}, Lp9/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
