.class public final Lmb/b0;
.super Lp9/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lmb/b0;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public f:Z

.field public g:J

.field public h:F

.field public i:J

.field public j:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lmb/c0;

    invoke-direct {v0}, Lmb/c0;-><init>()V

    sput-object v0, Lmb/b0;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 8

    const-wide v5, 0x7fffffffffffffffL

    const v7, 0x7fffffff

    const/4 v1, 0x1

    const-wide/16 v2, 0x32

    const/4 v4, 0x0

    move-object v0, p0

    .line 1
    invoke-direct/range {v0 .. v7}, Lmb/b0;-><init>(ZJFJI)V

    return-void
.end method

.method public constructor <init>(ZJFJI)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lp9/a;-><init>()V

    iput-boolean p1, p0, Lmb/b0;->f:Z

    iput-wide p2, p0, Lmb/b0;->g:J

    iput p4, p0, Lmb/b0;->h:F

    iput-wide p5, p0, Lmb/b0;->i:J

    iput p7, p0, Lmb/b0;->j:I

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lmb/b0;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lmb/b0;

    iget-boolean v1, p0, Lmb/b0;->f:Z

    iget-boolean v3, p1, Lmb/b0;->f:Z

    if-ne v1, v3, :cond_2

    iget-wide v3, p0, Lmb/b0;->g:J

    iget-wide v5, p1, Lmb/b0;->g:J

    cmp-long v1, v3, v5

    if-nez v1, :cond_2

    iget v1, p0, Lmb/b0;->h:F

    iget v3, p1, Lmb/b0;->h:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-nez v1, :cond_2

    iget-wide v3, p0, Lmb/b0;->i:J

    iget-wide v5, p1, Lmb/b0;->i:J

    cmp-long v1, v3, v5

    if-nez v1, :cond_2

    iget v1, p0, Lmb/b0;->j:I

    iget p1, p1, Lmb/b0;->j:I

    if-ne v1, p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 5

    iget-boolean v0, p0, Lmb/b0;->f:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iget-wide v1, p0, Lmb/b0;->g:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    iget v2, p0, Lmb/b0;->h:F

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    iget-wide v3, p0, Lmb/b0;->i:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    iget v4, p0, Lmb/b0;->j:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    filled-new-array {v0, v1, v2, v3, v4}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lo9/q;->c([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DeviceOrientationRequest[mShouldUseMag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lmb/b0;->f:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, " mMinimumSamplingPeriodMs="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lmb/b0;->g:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, " mSmallestAngleChangeRadians="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lmb/b0;->h:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lmb/b0;->i:J

    const-wide v3, 0x7fffffffffffffffL

    cmp-long v3, v1, v3

    if-eqz v3, :cond_0

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v3

    const-string v5, " expireIn="

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sub-long/2addr v1, v3

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, "ms"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    iget v1, p0, Lmb/b0;->j:I

    const v2, 0x7fffffff

    if-eq v1, v2, :cond_1

    const-string v1, " num="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lmb/b0;->j:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :cond_1
    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    invoke-static {p1}, Lp9/c;->a(Landroid/os/Parcel;)I

    move-result p2

    const/4 v0, 0x1

    iget-boolean v1, p0, Lmb/b0;->f:Z

    invoke-static {p1, v0, v1}, Lp9/c;->c(Landroid/os/Parcel;IZ)V

    const/4 v0, 0x2

    iget-wide v1, p0, Lmb/b0;->g:J

    invoke-static {p1, v0, v1, v2}, Lp9/c;->r(Landroid/os/Parcel;IJ)V

    const/4 v0, 0x3

    iget v1, p0, Lmb/b0;->h:F

    invoke-static {p1, v0, v1}, Lp9/c;->k(Landroid/os/Parcel;IF)V

    const/4 v0, 0x4

    iget-wide v1, p0, Lmb/b0;->i:J

    invoke-static {p1, v0, v1, v2}, Lp9/c;->r(Landroid/os/Parcel;IJ)V

    const/4 v0, 0x5

    iget v1, p0, Lmb/b0;->j:I

    invoke-static {p1, v0, v1}, Lp9/c;->n(Landroid/os/Parcel;II)V

    invoke-static {p1, p2}, Lp9/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
