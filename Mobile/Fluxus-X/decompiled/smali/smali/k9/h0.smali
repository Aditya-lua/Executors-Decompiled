.class public final Lk9/h0;
.super Lp9/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lk9/h0;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final f:Z

.field public final g:Ljava/lang/String;

.field public final h:I

.field public final i:I

.field public final j:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lk9/i0;

    invoke-direct {v0}, Lk9/i0;-><init>()V

    sput-object v0, Lk9/h0;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ZLjava/lang/String;IIJ)V
    .locals 0

    invoke-direct {p0}, Lp9/a;-><init>()V

    iput-boolean p1, p0, Lk9/h0;->f:Z

    iput-object p2, p0, Lk9/h0;->g:Ljava/lang/String;

    invoke-static {p3}, Lk9/p0;->a(I)I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lk9/h0;->h:I

    invoke-static {p4}, Lk9/s;->a(I)I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lk9/h0;->i:I

    iput-wide p5, p0, Lk9/h0;->j:J

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    invoke-static {p1}, Lp9/c;->a(Landroid/os/Parcel;)I

    move-result p2

    const/4 v0, 0x1

    iget-boolean v1, p0, Lk9/h0;->f:Z

    invoke-static {p1, v0, v1}, Lp9/c;->c(Landroid/os/Parcel;IZ)V

    iget-object v0, p0, Lk9/h0;->g:Ljava/lang/String;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p1, v2, v0, v1}, Lp9/c;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v0, 0x3

    iget v1, p0, Lk9/h0;->h:I

    invoke-static {p1, v0, v1}, Lp9/c;->n(Landroid/os/Parcel;II)V

    const/4 v0, 0x4

    iget v1, p0, Lk9/h0;->i:I

    invoke-static {p1, v0, v1}, Lp9/c;->n(Landroid/os/Parcel;II)V

    const/4 v0, 0x5

    iget-wide v1, p0, Lk9/h0;->j:J

    invoke-static {p1, v0, v1, v2}, Lp9/c;->r(Landroid/os/Parcel;IJ)V

    invoke-static {p1, p2}, Lp9/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method

.method public final zza()Z
    .locals 1

    iget-boolean v0, p0, Lk9/h0;->f:Z

    return v0
.end method

.method public final zzb()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lk9/h0;->g:Ljava/lang/String;

    return-object v0
.end method

.method public final zzc()J
    .locals 2

    iget-wide v0, p0, Lk9/h0;->j:J

    return-wide v0
.end method

.method public final zzd()I
    .locals 1

    iget v0, p0, Lk9/h0;->h:I

    invoke-static {v0}, Lk9/p0;->a(I)I

    move-result v0

    return v0
.end method

.method public final zze()I
    .locals 1

    iget v0, p0, Lk9/h0;->i:I

    invoke-static {v0}, Lk9/s;->a(I)I

    move-result v0

    return v0
.end method
