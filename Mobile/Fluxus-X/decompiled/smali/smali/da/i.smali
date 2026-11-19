.class public Lda/i;
.super Lda/j;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lda/i;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final f:Lda/n;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final g:Ljava/lang/String;

.field public final h:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lda/t1;

    invoke-direct {v0}, Lda/t1;-><init>()V

    sput-object v0, Lda/i;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;I)V
    .locals 0

    invoke-direct {p0}, Lda/j;-><init>()V

    :try_start_0
    invoke-static {p1}, Lda/n;->k(I)Lda/n;

    move-result-object p1

    iput-object p1, p0, Lda/i;->f:Lda/n;
    :try_end_0
    .catch Lda/n$a; {:try_start_0 .. :try_end_0} :catch_0

    iput-object p2, p0, Lda/i;->g:Ljava/lang/String;

    iput p3, p0, Lda/i;->h:I

    return-void

    :catch_0
    move-exception p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method


# virtual methods
.method public A3()Lda/n;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lda/i;->f:Lda/n;

    return-object v0
.end method

.method public B3()I
    .locals 1

    iget-object v0, p0, Lda/i;->f:Lda/n;

    invoke-virtual {v0}, Lda/n;->a()I

    move-result v0

    return v0
.end method

.method public C3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lda/i;->g:Ljava/lang/String;

    return-object v0
.end method

.method public final D3()Lorg/json/JSONObject;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "code"

    iget-object v2, p0, Lda/i;->f:Lda/n;

    invoke-virtual {v2}, Lda/n;->a()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    iget-object v1, p0, Lda/i;->g:Ljava/lang/String;

    if-eqz v1, :cond_0

    const-string v2, "message"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    goto :goto_0

    :cond_0
    return-object v0

    :goto_0
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Error encoding AuthenticatorErrorResponse to JSON object"

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lda/i;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lda/i;

    iget-object v0, p0, Lda/i;->f:Lda/n;

    iget-object v2, p1, Lda/i;->f:Lda/n;

    invoke-static {v0, v2}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lda/i;->g:Ljava/lang/String;

    iget-object v2, p1, Lda/i;->g:Ljava/lang/String;

    invoke-static {v0, v2}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget v0, p0, Lda/i;->h:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget p1, p1, Lda/i;->h:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {v0, p1}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lda/i;->f:Lda/n;

    iget-object v1, p0, Lda/i;->g:Ljava/lang/String;

    iget v2, p0, Lda/i;->h:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {v0, v1, v2}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lo9/q;->c([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-static {p0}, Lfb/k0;->a(Ljava/lang/Object;)Lfb/j0;

    move-result-object v0

    iget-object v1, p0, Lda/i;->f:Lda/n;

    const-string v2, "errorCode"

    invoke-virtual {v1}, Lda/n;->a()I

    move-result v1

    invoke-virtual {v0, v2, v1}, Lfb/j0;->a(Ljava/lang/String;I)Lfb/j0;

    iget-object v1, p0, Lda/i;->g:Ljava/lang/String;

    if-eqz v1, :cond_0

    const-string v2, "errorMessage"

    invoke-virtual {v0, v2, v1}, Lfb/j0;->b(Ljava/lang/String;Ljava/lang/Object;)Lfb/j0;

    :cond_0
    invoke-virtual {v0}, Lfb/j0;->toString()Ljava/lang/String;

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

    const/4 v0, 0x2

    invoke-virtual {p0}, Lda/i;->B3()I

    move-result v1

    invoke-static {p1, v0, v1}, Lp9/c;->n(Landroid/os/Parcel;II)V

    invoke-virtual {p0}, Lda/i;->C3()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x3

    invoke-static {p1, v2, v0, v1}, Lp9/c;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v0, 0x4

    iget v1, p0, Lda/i;->h:I

    invoke-static {p1, v0, v1}, Lp9/c;->n(Landroid/os/Parcel;II)V

    invoke-static {p1, p2}, Lp9/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
