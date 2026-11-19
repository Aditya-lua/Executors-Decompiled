.class public final Lob/g;
.super Lp9/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lob/g;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final f:J

.field public final g:I

.field public final h:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lob/h;

    invoke-direct {v0}, Lob/h;-><init>()V

    sput-object v0, Lob/g;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(JIJ)V
    .locals 0

    invoke-direct {p0}, Lp9/a;-><init>()V

    iput-wide p1, p0, Lob/g;->f:J

    iput p3, p0, Lob/g;->g:I

    iput-wide p4, p0, Lob/g;->h:J

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    iget-wide v0, p0, Lob/g;->f:J

    invoke-static {p1}, Lp9/c;->a(Landroid/os/Parcel;)I

    move-result p2

    const/4 v2, 0x1

    invoke-static {p1, v2, v0, v1}, Lp9/c;->r(Landroid/os/Parcel;IJ)V

    const/4 v0, 0x2

    iget v1, p0, Lob/g;->g:I

    invoke-static {p1, v0, v1}, Lp9/c;->n(Landroid/os/Parcel;II)V

    const/4 v0, 0x3

    iget-wide v1, p0, Lob/g;->h:J

    invoke-static {p1, v0, v1, v2}, Lp9/c;->r(Landroid/os/Parcel;IJ)V

    invoke-static {p1, p2}, Lp9/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
