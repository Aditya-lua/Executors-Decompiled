.class public Le9/a;
.super Lp9/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Le9/a;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final f:I

.field public g:I

.field public h:Landroid/os/Bundle;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Le9/d;

    invoke-direct {v0}, Le9/d;-><init>()V

    sput-object v0, Le9/a;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(IILandroid/os/Bundle;)V
    .locals 0

    invoke-direct {p0}, Lp9/a;-><init>()V

    iput p1, p0, Le9/a;->f:I

    iput p2, p0, Le9/a;->g:I

    iput-object p3, p0, Le9/a;->h:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public getType()I
    .locals 1

    iget v0, p0, Le9/a;->g:I

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3
    .param p1    # Landroid/os/Parcel;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {p1}, Lp9/c;->a(Landroid/os/Parcel;)I

    move-result p2

    const/4 v0, 0x1

    iget v1, p0, Le9/a;->f:I

    invoke-static {p1, v0, v1}, Lp9/c;->n(Landroid/os/Parcel;II)V

    const/4 v0, 0x2

    invoke-virtual {p0}, Le9/a;->getType()I

    move-result v1

    invoke-static {p1, v0, v1}, Lp9/c;->n(Landroid/os/Parcel;II)V

    iget-object v0, p0, Le9/a;->h:Landroid/os/Bundle;

    const/4 v1, 0x0

    const/4 v2, 0x3

    invoke-static {p1, v2, v0, v1}, Lp9/c;->f(Landroid/os/Parcel;ILandroid/os/Bundle;Z)V

    invoke-static {p1, p2}, Lp9/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
