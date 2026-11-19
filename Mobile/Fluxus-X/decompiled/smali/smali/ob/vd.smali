.class public final Lob/vd;
.super Lp9/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lob/vd;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final f:Ljava/lang/String;

.field public final g:J

.field public final h:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lob/wd;

    invoke-direct {v0}, Lob/wd;-><init>()V

    sput-object v0, Lob/vd;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;JI)V
    .locals 0

    invoke-direct {p0}, Lp9/a;-><init>()V

    iput-object p1, p0, Lob/vd;->f:Ljava/lang/String;

    iput-wide p2, p0, Lob/vd;->g:J

    iput p4, p0, Lob/vd;->h:I

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    iget-object p2, p0, Lob/vd;->f:Ljava/lang/String;

    invoke-static {p1}, Lp9/c;->a(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p1, v1, p2, v2}, Lp9/c;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 p2, 0x2

    iget-wide v1, p0, Lob/vd;->g:J

    invoke-static {p1, p2, v1, v2}, Lp9/c;->r(Landroid/os/Parcel;IJ)V

    const/4 p2, 0x3

    iget v1, p0, Lob/vd;->h:I

    invoke-static {p1, p2, v1}, Lp9/c;->n(Landroid/os/Parcel;II)V

    invoke-static {p1, v0}, Lp9/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
