.class public final Lcom/google/firebase/appindexing/internal/zza;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/firebase/appindexing/internal/zza;",
            ">;"
        }
    .end annotation
.end field

.field public static final g:Lcom/google/firebase/appindexing/internal/zza;

.field public static final h:Lcom/google/firebase/appindexing/internal/zza;

.field public static final i:Lcom/google/firebase/appindexing/internal/zza;


# instance fields
.field public final f:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/firebase/appindexing/internal/zza;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/google/firebase/appindexing/internal/zza;-><init>(I)V

    sput-object v0, Lcom/google/firebase/appindexing/internal/zza;->g:Lcom/google/firebase/appindexing/internal/zza;

    new-instance v0, Lcom/google/firebase/appindexing/internal/zza;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lcom/google/firebase/appindexing/internal/zza;-><init>(I)V

    sput-object v0, Lcom/google/firebase/appindexing/internal/zza;->h:Lcom/google/firebase/appindexing/internal/zza;

    new-instance v0, Lcom/google/firebase/appindexing/internal/zza;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lcom/google/firebase/appindexing/internal/zza;-><init>(I)V

    sput-object v0, Lcom/google/firebase/appindexing/internal/zza;->i:Lcom/google/firebase/appindexing/internal/zza;

    new-instance v0, Llf/a;

    invoke-direct {v0}, Llf/a;-><init>()V

    sput-object v0, Lcom/google/firebase/appindexing/internal/zza;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/firebase/appindexing/internal/zza;->f:I

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    invoke-static {p1}, Lo9/b;->a(Landroid/os/Parcel;)I

    move-result p2

    const/4 v0, 0x1

    iget v1, p0, Lcom/google/firebase/appindexing/internal/zza;->f:I

    invoke-static {p1, v0, v1}, Lo9/b;->n(Landroid/os/Parcel;II)V

    invoke-static {p1, p2}, Lo9/b;->b(Landroid/os/Parcel;I)V

    return-void
.end method
