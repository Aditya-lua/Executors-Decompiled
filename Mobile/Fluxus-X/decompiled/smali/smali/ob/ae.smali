.class public final Lob/ae;
.super Lp9/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lob/ae;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final f:J

.field public g:[B

.field public final h:Ljava/lang/String;

.field public final i:Landroid/os/Bundle;

.field public final j:I

.field public final k:J

.field public l:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lob/be;

    invoke-direct {v0}, Lob/be;-><init>()V

    sput-object v0, Lob/ae;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(J[BLjava/lang/String;Landroid/os/Bundle;IJLjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Lp9/a;-><init>()V

    iput-wide p1, p0, Lob/ae;->f:J

    iput-object p3, p0, Lob/ae;->g:[B

    iput-object p4, p0, Lob/ae;->h:Ljava/lang/String;

    iput-object p5, p0, Lob/ae;->i:Landroid/os/Bundle;

    iput p6, p0, Lob/ae;->j:I

    iput-wide p7, p0, Lob/ae;->k:J

    iput-object p9, p0, Lob/ae;->l:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 5

    iget-wide v0, p0, Lob/ae;->f:J

    invoke-static {p1}, Lp9/c;->a(Landroid/os/Parcel;)I

    move-result p2

    const/4 v2, 0x1

    invoke-static {p1, v2, v0, v1}, Lp9/c;->r(Landroid/os/Parcel;IJ)V

    iget-object v0, p0, Lob/ae;->g:[B

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p1, v1, v0, v2}, Lp9/c;->g(Landroid/os/Parcel;I[BZ)V

    const/4 v0, 0x3

    iget-object v1, p0, Lob/ae;->h:Ljava/lang/String;

    invoke-static {p1, v0, v1, v2}, Lp9/c;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v0, 0x4

    iget-object v1, p0, Lob/ae;->i:Landroid/os/Bundle;

    invoke-static {p1, v0, v1, v2}, Lp9/c;->f(Landroid/os/Parcel;ILandroid/os/Bundle;Z)V

    const/4 v0, 0x5

    iget v1, p0, Lob/ae;->j:I

    invoke-static {p1, v0, v1}, Lp9/c;->n(Landroid/os/Parcel;II)V

    const/4 v0, 0x6

    iget-wide v3, p0, Lob/ae;->k:J

    invoke-static {p1, v0, v3, v4}, Lp9/c;->r(Landroid/os/Parcel;IJ)V

    const/4 v0, 0x7

    iget-object v1, p0, Lob/ae;->l:Ljava/lang/String;

    invoke-static {p1, v0, v1, v2}, Lp9/c;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    invoke-static {p1, p2}, Lp9/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
