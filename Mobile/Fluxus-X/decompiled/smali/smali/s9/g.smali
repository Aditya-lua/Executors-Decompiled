.class public Ls9/g;
.super Lp9/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Ls9/g;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final f:I

.field public final g:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ls9/l;

    invoke-direct {v0}, Ls9/l;-><init>()V

    sput-object v0, Ls9/g;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Ls9/g;-><init>(IZ)V

    return-void
.end method

.method public constructor <init>(IZ)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lp9/a;-><init>()V

    iput p1, p0, Ls9/g;->f:I

    iput-boolean p2, p0, Ls9/g;->g:Z

    return-void
.end method


# virtual methods
.method public A3()I
    .locals 1

    iget v0, p0, Ls9/g;->f:I

    return v0
.end method

.method public final B3()Z
    .locals 1

    iget-boolean v0, p0, Ls9/g;->g:Z

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2
    .param p1    # Landroid/os/Parcel;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {p1}, Lp9/c;->a(Landroid/os/Parcel;)I

    move-result p2

    const/4 v0, 0x1

    invoke-virtual {p0}, Ls9/g;->A3()I

    move-result v1

    invoke-static {p1, v0, v1}, Lp9/c;->n(Landroid/os/Parcel;II)V

    const/4 v0, 0x2

    iget-boolean v1, p0, Ls9/g;->g:Z

    invoke-static {p1, v0, v1}, Lp9/c;->c(Landroid/os/Parcel;IZ)V

    invoke-static {p1, p2}, Lp9/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
