.class public final Lo9/l1;
.super Lp9/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lo9/l1;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public f:Landroid/os/Bundle;

.field public g:[Lk9/d;

.field public h:I

.field public i:Lo9/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lo9/m1;

    invoke-direct {v0}, Lo9/m1;-><init>()V

    sput-object v0, Lo9/l1;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lp9/a;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/os/Bundle;[Lk9/d;ILo9/g;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lp9/a;-><init>()V

    iput-object p1, p0, Lo9/l1;->f:Landroid/os/Bundle;

    iput-object p2, p0, Lo9/l1;->g:[Lk9/d;

    iput p3, p0, Lo9/l1;->h:I

    iput-object p4, p0, Lo9/l1;->i:Lo9/g;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Lp9/c;->a(Landroid/os/Parcel;)I

    move-result v0

    iget-object v1, p0, Lo9/l1;->f:Landroid/os/Bundle;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, v3}, Lp9/c;->f(Landroid/os/Parcel;ILandroid/os/Bundle;Z)V

    const/4 v1, 0x2

    iget-object v2, p0, Lo9/l1;->g:[Lk9/d;

    invoke-static {p1, v1, v2, p2, v3}, Lp9/c;->y(Landroid/os/Parcel;I[Landroid/os/Parcelable;IZ)V

    const/4 v1, 0x3

    iget v2, p0, Lo9/l1;->h:I

    invoke-static {p1, v1, v2}, Lp9/c;->n(Landroid/os/Parcel;II)V

    const/4 v1, 0x4

    iget-object v2, p0, Lo9/l1;->i:Lo9/g;

    invoke-static {p1, v1, v2, p2, v3}, Lp9/c;->t(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-static {p1, v0}, Lp9/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
