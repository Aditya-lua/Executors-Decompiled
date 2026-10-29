.class public final Lcom/google/android/gms/measurement/internal/zzoo;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/measurement/internal/zzoo;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final f:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lnb/vd;

    invoke-direct {v0}, Lnb/vd;-><init>()V

    sput-object v0, Lcom/google/android/gms/measurement/internal/zzoo;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzoo;->f:Ljava/util/List;

    return-void
.end method

.method public static varargs a([Lnb/za;)Lcom/google/android/gms/measurement/internal/zzoo;
    .locals 2

    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v1, 0x0

    aget-object p0, p0, v1

    invoke-virtual {p0}, Lnb/za;->zza()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p0, Lcom/google/android/gms/measurement/internal/zzoo;

    invoke-direct {p0, v0}, Lcom/google/android/gms/measurement/internal/zzoo;-><init>(Ljava/util/List;)V

    return-object p0
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/zzoo;->f:Ljava/util/List;

    invoke-static {p1}, Lo9/b;->a(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p1, v1, p2, v2}, Lo9/b;->p(Landroid/os/Parcel;ILjava/util/List;Z)V

    invoke-static {p1, v0}, Lo9/b;->b(Landroid/os/Parcel;I)V

    return-void
.end method
