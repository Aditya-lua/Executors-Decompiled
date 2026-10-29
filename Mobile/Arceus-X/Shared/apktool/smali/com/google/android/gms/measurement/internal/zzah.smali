.class public final Lcom/google/android/gms/measurement/internal/zzah;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/measurement/internal/zzah;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public f:Ljava/lang/String;

.field public g:Ljava/lang/String;

.field public h:Lcom/google/android/gms/measurement/internal/zzpl;

.field public i:J

.field public j:Z

.field public k:Ljava/lang/String;

.field public final l:Lcom/google/android/gms/measurement/internal/zzbg;

.field public m:J

.field public n:Lcom/google/android/gms/measurement/internal/zzbg;

.field public final o:J

.field public final p:Lcom/google/android/gms/measurement/internal/zzbg;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lnb/h;

    invoke-direct {v0}, Lnb/h;-><init>()V

    sput-object v0, Lcom/google/android/gms/measurement/internal/zzah;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/measurement/internal/zzah;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    .line 2
    invoke-static {p1}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzah;->f:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/zzah;->f:Ljava/lang/String;

    .line 4
    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzah;->g:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/zzah;->g:Ljava/lang/String;

    .line 5
    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzah;->h:Lcom/google/android/gms/measurement/internal/zzpl;

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/zzah;->h:Lcom/google/android/gms/measurement/internal/zzpl;

    .line 6
    iget-wide v0, p1, Lcom/google/android/gms/measurement/internal/zzah;->i:J

    iput-wide v0, p0, Lcom/google/android/gms/measurement/internal/zzah;->i:J

    .line 7
    iget-boolean v0, p1, Lcom/google/android/gms/measurement/internal/zzah;->j:Z

    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/zzah;->j:Z

    .line 8
    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzah;->k:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/zzah;->k:Ljava/lang/String;

    .line 9
    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzah;->l:Lcom/google/android/gms/measurement/internal/zzbg;

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/zzah;->l:Lcom/google/android/gms/measurement/internal/zzbg;

    .line 10
    iget-wide v0, p1, Lcom/google/android/gms/measurement/internal/zzah;->m:J

    iput-wide v0, p0, Lcom/google/android/gms/measurement/internal/zzah;->m:J

    .line 11
    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzah;->n:Lcom/google/android/gms/measurement/internal/zzbg;

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/zzah;->n:Lcom/google/android/gms/measurement/internal/zzbg;

    .line 12
    iget-wide v0, p1, Lcom/google/android/gms/measurement/internal/zzah;->o:J

    iput-wide v0, p0, Lcom/google/android/gms/measurement/internal/zzah;->o:J

    .line 13
    iget-object p1, p1, Lcom/google/android/gms/measurement/internal/zzah;->p:Lcom/google/android/gms/measurement/internal/zzbg;

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzah;->p:Lcom/google/android/gms/measurement/internal/zzbg;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzpl;JZLjava/lang/String;Lcom/google/android/gms/measurement/internal/zzbg;JLcom/google/android/gms/measurement/internal/zzbg;JLcom/google/android/gms/measurement/internal/zzbg;)V
    .locals 0

    .line 14
    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzah;->f:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/zzah;->g:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/measurement/internal/zzah;->h:Lcom/google/android/gms/measurement/internal/zzpl;

    iput-wide p4, p0, Lcom/google/android/gms/measurement/internal/zzah;->i:J

    iput-boolean p6, p0, Lcom/google/android/gms/measurement/internal/zzah;->j:Z

    iput-object p7, p0, Lcom/google/android/gms/measurement/internal/zzah;->k:Ljava/lang/String;

    iput-object p8, p0, Lcom/google/android/gms/measurement/internal/zzah;->l:Lcom/google/android/gms/measurement/internal/zzbg;

    iput-wide p9, p0, Lcom/google/android/gms/measurement/internal/zzah;->m:J

    iput-object p11, p0, Lcom/google/android/gms/measurement/internal/zzah;->n:Lcom/google/android/gms/measurement/internal/zzbg;

    iput-wide p12, p0, Lcom/google/android/gms/measurement/internal/zzah;->o:J

    iput-object p14, p0, Lcom/google/android/gms/measurement/internal/zzah;->p:Lcom/google/android/gms/measurement/internal/zzbg;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 6

    invoke-static {p1}, Lo9/b;->a(Landroid/os/Parcel;)I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzah;->f:Ljava/lang/String;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, v3}, Lo9/b;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/zzah;->g:Ljava/lang/String;

    invoke-static {p1, v1, v2, v3}, Lo9/b;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/zzah;->h:Lcom/google/android/gms/measurement/internal/zzpl;

    invoke-static {p1, v1, v2, p2, v3}, Lo9/b;->t(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/4 v1, 0x5

    iget-wide v4, p0, Lcom/google/android/gms/measurement/internal/zzah;->i:J

    invoke-static {p1, v1, v4, v5}, Lo9/b;->r(Landroid/os/Parcel;IJ)V

    const/4 v1, 0x6

    iget-boolean v2, p0, Lcom/google/android/gms/measurement/internal/zzah;->j:Z

    invoke-static {p1, v1, v2}, Lo9/b;->c(Landroid/os/Parcel;IZ)V

    const/4 v1, 0x7

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/zzah;->k:Ljava/lang/String;

    invoke-static {p1, v1, v2, v3}, Lo9/b;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/16 v1, 0x8

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/zzah;->l:Lcom/google/android/gms/measurement/internal/zzbg;

    invoke-static {p1, v1, v2, p2, v3}, Lo9/b;->t(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/16 v1, 0x9

    iget-wide v4, p0, Lcom/google/android/gms/measurement/internal/zzah;->m:J

    invoke-static {p1, v1, v4, v5}, Lo9/b;->r(Landroid/os/Parcel;IJ)V

    const/16 v1, 0xa

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/zzah;->n:Lcom/google/android/gms/measurement/internal/zzbg;

    invoke-static {p1, v1, v2, p2, v3}, Lo9/b;->t(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/16 v1, 0xb

    iget-wide v4, p0, Lcom/google/android/gms/measurement/internal/zzah;->o:J

    invoke-static {p1, v1, v4, v5}, Lo9/b;->r(Landroid/os/Parcel;IJ)V

    const/16 v1, 0xc

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/zzah;->p:Lcom/google/android/gms/measurement/internal/zzbg;

    invoke-static {p1, v1, v2, p2, v3}, Lo9/b;->t(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-static {p1, v0}, Lo9/b;->b(Landroid/os/Parcel;I)V

    return-void
.end method
