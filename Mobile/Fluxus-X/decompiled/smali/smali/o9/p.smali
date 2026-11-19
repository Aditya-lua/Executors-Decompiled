.class public Lo9/p;
.super Lp9/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lo9/p;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final f:I

.field public final g:I

.field public final h:I

.field public final i:J

.field public final j:J

.field public final k:Ljava/lang/String;

.field public final l:Ljava/lang/String;

.field public final m:I

.field public final n:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lo9/m0;

    invoke-direct {v0}, Lo9/m0;-><init>()V

    sput-object v0, Lo9/p;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(IIIJJLjava/lang/String;Ljava/lang/String;I)V
    .locals 12
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v11, -0x1

    move-object v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    move-wide/from16 v4, p4

    move-wide/from16 v6, p6

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move/from16 v10, p10

    .line 1
    invoke-direct/range {v0 .. v11}, Lo9/p;-><init>(IIIJJLjava/lang/String;Ljava/lang/String;II)V

    return-void
.end method

.method public constructor <init>(IIIJJLjava/lang/String;Ljava/lang/String;II)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lp9/a;-><init>()V

    iput p1, p0, Lo9/p;->f:I

    iput p2, p0, Lo9/p;->g:I

    iput p3, p0, Lo9/p;->h:I

    iput-wide p4, p0, Lo9/p;->i:J

    iput-wide p6, p0, Lo9/p;->j:J

    iput-object p8, p0, Lo9/p;->k:Ljava/lang/String;

    iput-object p9, p0, Lo9/p;->l:Ljava/lang/String;

    iput p10, p0, Lo9/p;->m:I

    iput p11, p0, Lo9/p;->n:I

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3
    .param p1    # Landroid/os/Parcel;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget p2, p0, Lo9/p;->f:I

    invoke-static {p1}, Lp9/c;->a(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x1

    invoke-static {p1, v1, p2}, Lp9/c;->n(Landroid/os/Parcel;II)V

    const/4 p2, 0x2

    iget v1, p0, Lo9/p;->g:I

    invoke-static {p1, p2, v1}, Lp9/c;->n(Landroid/os/Parcel;II)V

    const/4 p2, 0x3

    iget v1, p0, Lo9/p;->h:I

    invoke-static {p1, p2, v1}, Lp9/c;->n(Landroid/os/Parcel;II)V

    const/4 p2, 0x4

    iget-wide v1, p0, Lo9/p;->i:J

    invoke-static {p1, p2, v1, v2}, Lp9/c;->r(Landroid/os/Parcel;IJ)V

    const/4 p2, 0x5

    iget-wide v1, p0, Lo9/p;->j:J

    invoke-static {p1, p2, v1, v2}, Lp9/c;->r(Landroid/os/Parcel;IJ)V

    iget-object p2, p0, Lo9/p;->k:Ljava/lang/String;

    const/4 v1, 0x6

    const/4 v2, 0x0

    invoke-static {p1, v1, p2, v2}, Lp9/c;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 p2, 0x7

    iget-object v1, p0, Lo9/p;->l:Ljava/lang/String;

    invoke-static {p1, p2, v1, v2}, Lp9/c;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/16 p2, 0x8

    iget v1, p0, Lo9/p;->m:I

    invoke-static {p1, p2, v1}, Lp9/c;->n(Landroid/os/Parcel;II)V

    const/16 p2, 0x9

    iget v1, p0, Lo9/p;->n:I

    invoke-static {p1, p2, v1}, Lp9/c;->n(Landroid/os/Parcel;II)V

    invoke-static {p1, v0}, Lp9/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
