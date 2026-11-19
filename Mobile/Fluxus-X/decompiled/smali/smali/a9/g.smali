.class public La9/g;
.super Lp9/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La9/g$a;
    }
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "La9/g;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final f:La9/k;

.field public final g:Ljava/lang/String;

.field public final h:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, La9/v;

    invoke-direct {v0}, La9/v;-><init>()V

    sput-object v0, La9/g;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(La9/k;Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0}, Lp9/a;-><init>()V

    invoke-static {p1}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, La9/k;

    iput-object p1, p0, La9/g;->f:La9/k;

    iput-object p2, p0, La9/g;->g:Ljava/lang/String;

    iput p3, p0, La9/g;->h:I

    return-void
.end method

.method public static A3()La9/g$a;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, La9/g$a;

    invoke-direct {v0}, La9/g$a;-><init>()V

    return-object v0
.end method

.method public static C3(La9/g;)La9/g$a;
    .locals 2
    .param p0    # La9/g;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-static {p0}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, La9/g;->A3()La9/g$a;

    move-result-object v0

    invoke-virtual {p0}, La9/g;->B3()La9/k;

    move-result-object v1

    invoke-virtual {v0, v1}, La9/g$a;->b(La9/k;)La9/g$a;

    iget v1, p0, La9/g;->h:I

    invoke-virtual {v0, v1}, La9/g$a;->d(I)La9/g$a;

    iget-object p0, p0, La9/g;->g:Ljava/lang/String;

    if-eqz p0, :cond_0

    invoke-virtual {v0, p0}, La9/g$a;->c(Ljava/lang/String;)La9/g$a;

    :cond_0
    return-object v0
.end method


# virtual methods
.method public B3()La9/k;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, La9/g;->f:La9/k;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, La9/g;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, La9/g;

    iget-object v0, p0, La9/g;->f:La9/k;

    iget-object v2, p1, La9/g;->f:La9/k;

    invoke-static {v0, v2}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, La9/g;->g:Ljava/lang/String;

    iget-object v2, p1, La9/g;->g:Ljava/lang/String;

    invoke-static {v0, v2}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget v0, p0, La9/g;->h:I

    iget p1, p1, La9/g;->h:I

    if-ne v0, p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, La9/g;->f:La9/k;

    iget-object v1, p0, La9/g;->g:Ljava/lang/String;

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lo9/q;->c([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 4
    .param p1    # Landroid/os/Parcel;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {p1}, Lp9/c;->a(Landroid/os/Parcel;)I

    move-result v0

    invoke-virtual {p0}, La9/g;->B3()La9/k;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, p2, v3}, Lp9/c;->t(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/4 p2, 0x2

    iget-object v1, p0, La9/g;->g:Ljava/lang/String;

    invoke-static {p1, p2, v1, v3}, Lp9/c;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 p2, 0x3

    iget v1, p0, La9/g;->h:I

    invoke-static {p1, p2, v1}, Lp9/c;->n(Landroid/os/Parcel;II)V

    invoke-static {p1, v0}, Lp9/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
