.class public Lda/a0;
.super Lp9/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lda/a0$a;,
        Lda/a0$b;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lda/a0;",
            ">;"
        }
    .end annotation
.end field

.field public static final h:Lda/a0;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public static final i:Lda/a0;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# instance fields
.field public final f:Lda/a0$a;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final g:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lda/d1;

    invoke-direct {v0}, Lda/d1;-><init>()V

    sput-object v0, Lda/a0;->CREATOR:Landroid/os/Parcelable$Creator;

    new-instance v0, Lda/a0;

    sget-object v1, Lda/a0$a;->c:Lda/a0$a;

    invoke-virtual {v1}, Lda/a0$a;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lda/a0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lda/a0;->h:Lda/a0;

    new-instance v0, Lda/a0;

    sget-object v1, Lda/a0$a;->d:Lda/a0$a;

    invoke-virtual {v1}, Lda/a0$a;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, v2}, Lda/a0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lda/a0;->i:Lda/a0;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Lp9/a;-><init>()V

    invoke-static {p1}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    invoke-static {p1}, Lda/a0$a;->a(Ljava/lang/String;)Lda/a0$a;

    move-result-object p1

    iput-object p1, p0, Lda/a0;->f:Lda/a0$a;
    :try_end_0
    .catch Lda/a0$b; {:try_start_0 .. :try_end_0} :catch_0

    iput-object p2, p0, Lda/a0;->g:Ljava/lang/String;

    return-void

    :catch_0
    move-exception p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method


# virtual methods
.method public A3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lda/a0;->g:Ljava/lang/String;

    return-object v0
.end method

.method public B3()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lda/a0;->f:Lda/a0$a;

    invoke-virtual {v0}, Lda/a0$a;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lda/a0;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lda/a0;

    iget-object v0, p0, Lda/a0;->f:Lda/a0$a;

    iget-object v2, p1, Lda/a0;->f:Lda/a0$a;

    invoke-static {v0, v2}, Lfb/l0;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lda/a0;->g:Ljava/lang/String;

    iget-object p1, p1, Lda/a0;->g:Ljava/lang/String;

    invoke-static {v0, p1}, Lfb/l0;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lda/a0;->f:Lda/a0$a;

    iget-object v1, p0, Lda/a0;->g:Ljava/lang/String;

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 3
    .param p1    # Landroid/os/Parcel;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {p1}, Lp9/c;->a(Landroid/os/Parcel;)I

    move-result p2

    invoke-virtual {p0}, Lda/a0;->B3()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p1, v1, v0, v2}, Lp9/c;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v0, 0x3

    invoke-virtual {p0}, Lda/a0;->A3()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v0, v1, v2}, Lp9/c;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    invoke-static {p1, p2}, Lp9/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
