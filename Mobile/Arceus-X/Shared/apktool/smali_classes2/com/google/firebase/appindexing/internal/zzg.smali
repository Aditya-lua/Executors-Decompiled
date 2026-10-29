.class public final Lcom/google/firebase/appindexing/internal/zzg;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/firebase/appindexing/internal/zzg;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final f:I

.field public final g:[Lcom/google/firebase/appindexing/internal/Thing;

.field public final h:[Ljava/lang/String;

.field public final i:[Ljava/lang/String;

.field public final j:Lcom/google/android/gms/internal/appindex/zzk;

.field public final k:Ljava/lang/String;

.field public final l:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Llf/f;

    invoke-direct {v0}, Llf/f;-><init>()V

    sput-object v0, Lcom/google/firebase/appindexing/internal/zzg;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(I[Lcom/google/firebase/appindexing/internal/Thing;[Ljava/lang/String;[Ljava/lang/String;Lcom/google/android/gms/internal/appindex/zzk;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    const/4 v0, 0x3

    if-eq p1, v0, :cond_0

    const/4 v0, 0x4

    if-eq p1, v0, :cond_0

    const/4 v0, 0x6

    if-eq p1, v0, :cond_0

    const/4 v0, 0x7

    if-eq p1, v0, :cond_0

    const/4 p1, 0x0

    :cond_0
    iput p1, p0, Lcom/google/firebase/appindexing/internal/zzg;->f:I

    iput-object p2, p0, Lcom/google/firebase/appindexing/internal/zzg;->g:[Lcom/google/firebase/appindexing/internal/Thing;

    iput-object p3, p0, Lcom/google/firebase/appindexing/internal/zzg;->h:[Ljava/lang/String;

    iput-object p4, p0, Lcom/google/firebase/appindexing/internal/zzg;->i:[Ljava/lang/String;

    iput-object p5, p0, Lcom/google/firebase/appindexing/internal/zzg;->j:Lcom/google/android/gms/internal/appindex/zzk;

    iput-object p6, p0, Lcom/google/firebase/appindexing/internal/zzg;->k:Ljava/lang/String;

    iput-object p7, p0, Lcom/google/firebase/appindexing/internal/zzg;->l:Ljava/lang/String;

    return-void
.end method

.method public static v3()Lcom/google/firebase/appindexing/internal/zzg;
    .locals 8

    new-instance v0, Lcom/google/firebase/appindexing/internal/zzg;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v1, 0x4

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v7}, Lcom/google/firebase/appindexing/internal/zzg;-><init>(I[Lcom/google/firebase/appindexing/internal/Thing;[Ljava/lang/String;[Ljava/lang/String;Lcom/google/android/gms/internal/appindex/zzk;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static varargs w3([Lcom/google/firebase/appindexing/internal/Thing;)Lcom/google/firebase/appindexing/internal/zzg;
    .locals 8

    new-instance v0, Lcom/google/firebase/appindexing/internal/zzg;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v1, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v2, p0

    invoke-direct/range {v0 .. v7}, Lcom/google/firebase/appindexing/internal/zzg;-><init>(I[Lcom/google/firebase/appindexing/internal/Thing;[Ljava/lang/String;[Ljava/lang/String;Lcom/google/android/gms/internal/appindex/zzk;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Lo9/b;->a(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x1

    iget v2, p0, Lcom/google/firebase/appindexing/internal/zzg;->f:I

    invoke-static {p1, v1, v2}, Lo9/b;->n(Landroid/os/Parcel;II)V

    iget-object v1, p0, Lcom/google/firebase/appindexing/internal/zzg;->g:[Lcom/google/firebase/appindexing/internal/Thing;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, p2, v3}, Lo9/b;->y(Landroid/os/Parcel;I[Landroid/os/Parcelable;IZ)V

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/google/firebase/appindexing/internal/zzg;->h:[Ljava/lang/String;

    invoke-static {p1, v1, v2, v3}, Lo9/b;->w(Landroid/os/Parcel;I[Ljava/lang/String;Z)V

    const/4 v1, 0x5

    iget-object v2, p0, Lcom/google/firebase/appindexing/internal/zzg;->i:[Ljava/lang/String;

    invoke-static {p1, v1, v2, v3}, Lo9/b;->w(Landroid/os/Parcel;I[Ljava/lang/String;Z)V

    const/4 v1, 0x6

    iget-object v2, p0, Lcom/google/firebase/appindexing/internal/zzg;->j:Lcom/google/android/gms/internal/appindex/zzk;

    invoke-static {p1, v1, v2, p2, v3}, Lo9/b;->t(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/4 p2, 0x7

    iget-object v1, p0, Lcom/google/firebase/appindexing/internal/zzg;->k:Ljava/lang/String;

    invoke-static {p1, p2, v1, v3}, Lo9/b;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/16 p2, 0x8

    iget-object v1, p0, Lcom/google/firebase/appindexing/internal/zzg;->l:Ljava/lang/String;

    invoke-static {p1, p2, v1, v3}, Lo9/b;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    invoke-static {p1, v0}, Lo9/b;->b(Landroid/os/Parcel;I)V

    return-void
.end method
