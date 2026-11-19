.class public Lda/k;
.super Lp9/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lda/k$a;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lda/k;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final f:Lda/b;

.field public final g:Ljava/lang/Boolean;

.field public final h:Lda/c0;

.field public final i:Lda/z;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lda/u1;

    invoke-direct {v0}, Lda/u1;-><init>()V

    sput-object v0, Lda/k;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Lp9/a;-><init>()V

    const/4 v0, 0x0

    if-nez p1, :cond_0

    move-object p1, v0

    goto :goto_0

    :cond_0
    :try_start_0
    invoke-static {p1}, Lda/b;->a(Ljava/lang/String;)Lda/b;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lda/k;->f:Lda/b;

    iput-object p2, p0, Lda/k;->g:Ljava/lang/Boolean;

    if-nez p3, :cond_1

    move-object p1, v0

    goto :goto_1

    :cond_1
    invoke-static {p3}, Lda/c0;->a(Ljava/lang/String;)Lda/c0;

    move-result-object p1

    :goto_1
    iput-object p1, p0, Lda/k;->h:Lda/c0;

    if-nez p4, :cond_2

    goto :goto_2

    :cond_2
    invoke-static {p4}, Lda/z;->a(Ljava/lang/String;)Lda/z;

    move-result-object v0

    :goto_2
    iput-object v0, p0, Lda/k;->i:Lda/z;
    :try_end_0
    .catch Lda/b$a; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lda/h1; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lda/z$a; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    goto :goto_3

    :catch_1
    move-exception p1

    goto :goto_3

    :catch_2
    move-exception p1

    :goto_3
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method


# virtual methods
.method public A3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lda/k;->f:Lda/b;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {v0}, Lda/b;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public B3()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lda/k;->g:Ljava/lang/Boolean;

    return-object v0
.end method

.method public C3()Lda/z;
    .locals 2

    iget-object v0, p0, Lda/k;->i:Lda/z;

    if-nez v0, :cond_2

    iget-object v0, p0, Lda/k;->g:Ljava/lang/Boolean;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    sget-object v0, Lda/z;->d:Lda/z;

    return-object v0

    :cond_1
    return-object v1

    :cond_2
    return-object v0
.end method

.method public D3()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lda/k;->C3()Lda/z;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {v0}, Lda/z;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lda/k;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lda/k;

    iget-object v0, p0, Lda/k;->f:Lda/b;

    iget-object v2, p1, Lda/k;->f:Lda/b;

    invoke-static {v0, v2}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lda/k;->g:Ljava/lang/Boolean;

    iget-object v2, p1, Lda/k;->g:Ljava/lang/Boolean;

    invoke-static {v0, v2}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lda/k;->h:Lda/c0;

    iget-object v2, p1, Lda/k;->h:Lda/c0;

    invoke-static {v0, v2}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lda/k;->C3()Lda/z;

    move-result-object v0

    invoke-virtual {p1}, Lda/k;->C3()Lda/z;

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
    .locals 4

    iget-object v0, p0, Lda/k;->f:Lda/b;

    iget-object v1, p0, Lda/k;->g:Ljava/lang/Boolean;

    iget-object v2, p0, Lda/k;->h:Lda/c0;

    invoke-virtual {p0}, Lda/k;->C3()Lda/z;

    move-result-object v3

    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lo9/q;->c([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lda/k;->i:Lda/z;

    iget-object v1, p0, Lda/k;->h:Lda/c0;

    iget-object v2, p0, Lda/k;->f:Lda/b;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "AuthenticatorSelectionCriteria{\n attachment="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", \n requireResidentKey="

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lda/k;->g:Ljava/lang/Boolean;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", \n requireUserVerification="

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", \n residentKeyRequirement="

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\n }"

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

    invoke-virtual {p0}, Lda/k;->A3()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p1, v1, v0, v2}, Lp9/c;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v0, 0x3

    invoke-virtual {p0}, Lda/k;->B3()Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {p1, v0, v1, v2}, Lp9/c;->e(Landroid/os/Parcel;ILjava/lang/Boolean;Z)V

    iget-object v0, p0, Lda/k;->h:Lda/c0;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lda/c0;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    const/4 v1, 0x4

    invoke-static {p1, v1, v0, v2}, Lp9/c;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v0, 0x5

    invoke-virtual {p0}, Lda/k;->D3()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v0, v1, v2}, Lp9/c;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    invoke-static {p1, p2}, Lp9/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
