.class public Lo9/g;
.super Lp9/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lo9/g;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final f:Lo9/u;

.field public final g:Z

.field public final h:Z

.field public final i:[I

.field public final j:I

.field public final k:[I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lo9/n1;

    invoke-direct {v0}, Lo9/n1;-><init>()V

    sput-object v0, Lo9/g;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lo9/u;ZZ[II[I)V
    .locals 0
    .param p1    # Lo9/u;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Lp9/a;-><init>()V

    iput-object p1, p0, Lo9/g;->f:Lo9/u;

    iput-boolean p2, p0, Lo9/g;->g:Z

    iput-boolean p3, p0, Lo9/g;->h:Z

    iput-object p4, p0, Lo9/g;->i:[I

    iput p5, p0, Lo9/g;->j:I

    iput-object p6, p0, Lo9/g;->k:[I

    return-void
.end method


# virtual methods
.method public A3()I
    .locals 1

    iget v0, p0, Lo9/g;->j:I

    return v0
.end method

.method public B3()[I
    .locals 1

    iget-object v0, p0, Lo9/g;->i:[I

    return-object v0
.end method

.method public C3()[I
    .locals 1

    iget-object v0, p0, Lo9/g;->k:[I

    return-object v0
.end method

.method public D3()Z
    .locals 1

    iget-boolean v0, p0, Lo9/g;->g:Z

    return v0
.end method

.method public E3()Z
    .locals 1

    iget-boolean v0, p0, Lo9/g;->h:Z

    return v0
.end method

.method public final F3()Lo9/u;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lo9/g;->f:Lo9/u;

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4
    .param p1    # Landroid/os/Parcel;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {p1}, Lp9/c;->a(Landroid/os/Parcel;)I

    move-result v0

    iget-object v1, p0, Lo9/g;->f:Lo9/u;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, p2, v3}, Lp9/c;->t(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/4 p2, 0x2

    invoke-virtual {p0}, Lo9/g;->D3()Z

    move-result v1

    invoke-static {p1, p2, v1}, Lp9/c;->c(Landroid/os/Parcel;IZ)V

    const/4 p2, 0x3

    invoke-virtual {p0}, Lo9/g;->E3()Z

    move-result v1

    invoke-static {p1, p2, v1}, Lp9/c;->c(Landroid/os/Parcel;IZ)V

    const/4 p2, 0x4

    invoke-virtual {p0}, Lo9/g;->B3()[I

    move-result-object v1

    invoke-static {p1, p2, v1, v3}, Lp9/c;->o(Landroid/os/Parcel;I[IZ)V

    const/4 p2, 0x5

    invoke-virtual {p0}, Lo9/g;->A3()I

    move-result v1

    invoke-static {p1, p2, v1}, Lp9/c;->n(Landroid/os/Parcel;II)V

    const/4 p2, 0x6

    invoke-virtual {p0}, Lo9/g;->C3()[I

    move-result-object v1

    invoke-static {p1, p2, v1, v3}, Lp9/c;->o(Landroid/os/Parcel;I[IZ)V

    invoke-static {p1, v0}, Lp9/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
