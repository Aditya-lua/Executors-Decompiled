.class public Lo9/u;
.super Lp9/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lo9/u;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final f:I

.field public final g:Z

.field public final h:Z

.field public final i:I

.field public final j:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lo9/c1;

    invoke-direct {v0}, Lo9/c1;-><init>()V

    sput-object v0, Lo9/u;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(IZZII)V
    .locals 0

    invoke-direct {p0}, Lp9/a;-><init>()V

    iput p1, p0, Lo9/u;->f:I

    iput-boolean p2, p0, Lo9/u;->g:Z

    iput-boolean p3, p0, Lo9/u;->h:Z

    iput p4, p0, Lo9/u;->i:I

    iput p5, p0, Lo9/u;->j:I

    return-void
.end method


# virtual methods
.method public A3()I
    .locals 1

    iget v0, p0, Lo9/u;->i:I

    return v0
.end method

.method public B3()I
    .locals 1

    iget v0, p0, Lo9/u;->j:I

    return v0
.end method

.method public C3()Z
    .locals 1

    iget-boolean v0, p0, Lo9/u;->g:Z

    return v0
.end method

.method public D3()Z
    .locals 1

    iget-boolean v0, p0, Lo9/u;->h:Z

    return v0
.end method

.method public E3()I
    .locals 1

    iget v0, p0, Lo9/u;->f:I

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2
    .param p1    # Landroid/os/Parcel;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {p1}, Lp9/c;->a(Landroid/os/Parcel;)I

    move-result p2

    const/4 v0, 0x1

    invoke-virtual {p0}, Lo9/u;->E3()I

    move-result v1

    invoke-static {p1, v0, v1}, Lp9/c;->n(Landroid/os/Parcel;II)V

    const/4 v0, 0x2

    invoke-virtual {p0}, Lo9/u;->C3()Z

    move-result v1

    invoke-static {p1, v0, v1}, Lp9/c;->c(Landroid/os/Parcel;IZ)V

    const/4 v0, 0x3

    invoke-virtual {p0}, Lo9/u;->D3()Z

    move-result v1

    invoke-static {p1, v0, v1}, Lp9/c;->c(Landroid/os/Parcel;IZ)V

    const/4 v0, 0x4

    invoke-virtual {p0}, Lo9/u;->A3()I

    move-result v1

    invoke-static {p1, v0, v1}, Lp9/c;->n(Landroid/os/Parcel;II)V

    const/4 v0, 0x5

    invoke-virtual {p0}, Lo9/u;->B3()I

    move-result v1

    invoke-static {p1, v0, v1}, Lp9/c;->n(Landroid/os/Parcel;II)V

    invoke-static {p1, p2}, Lp9/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
