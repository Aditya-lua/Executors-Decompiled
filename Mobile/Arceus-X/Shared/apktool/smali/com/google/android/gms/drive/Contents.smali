.class public Lcom/google/android/gms/drive/Contents;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;
.source "SourceFile"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/drive/Contents;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final f:Landroid/os/ParcelFileDescriptor;

.field public final g:I

.field public final h:I

.field public final i:Lcom/google/android/gms/drive/DriveId;

.field public final j:Z

.field public final k:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lx9/a;

    invoke-direct {v0}, Lx9/a;-><init>()V

    sput-object v0, Lcom/google/android/gms/drive/Contents;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/ParcelFileDescriptor;IILcom/google/android/gms/drive/DriveId;ZLjava/lang/String;)V
    .locals 0
    .param p1    # Landroid/os/ParcelFileDescriptor;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lcom/google/android/gms/drive/DriveId;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/drive/Contents;->f:Landroid/os/ParcelFileDescriptor;

    iput p2, p0, Lcom/google/android/gms/drive/Contents;->g:I

    iput p3, p0, Lcom/google/android/gms/drive/Contents;->h:I

    iput-object p4, p0, Lcom/google/android/gms/drive/Contents;->i:Lcom/google/android/gms/drive/DriveId;

    iput-boolean p5, p0, Lcom/google/android/gms/drive/Contents;->j:Z

    iput-object p6, p0, Lcom/google/android/gms/drive/Contents;->k:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4
    .param p1    # Landroid/os/Parcel;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/google/android/gms/drive/Contents;->f:Landroid/os/ParcelFileDescriptor;

    invoke-static {p1}, Lo9/b;->a(Landroid/os/Parcel;)I

    move-result v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v2, v0, p2, v3}, Lo9/b;->t(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/4 v0, 0x3

    iget v2, p0, Lcom/google/android/gms/drive/Contents;->g:I

    invoke-static {p1, v0, v2}, Lo9/b;->n(Landroid/os/Parcel;II)V

    const/4 v0, 0x4

    iget v2, p0, Lcom/google/android/gms/drive/Contents;->h:I

    invoke-static {p1, v0, v2}, Lo9/b;->n(Landroid/os/Parcel;II)V

    const/4 v0, 0x5

    iget-object v2, p0, Lcom/google/android/gms/drive/Contents;->i:Lcom/google/android/gms/drive/DriveId;

    invoke-static {p1, v0, v2, p2, v3}, Lo9/b;->t(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/4 p2, 0x7

    iget-boolean v0, p0, Lcom/google/android/gms/drive/Contents;->j:Z

    invoke-static {p1, p2, v0}, Lo9/b;->c(Landroid/os/Parcel;IZ)V

    const/16 p2, 0x8

    iget-object v0, p0, Lcom/google/android/gms/drive/Contents;->k:Ljava/lang/String;

    invoke-static {p1, p2, v0, v3}, Lo9/b;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    invoke-static {p1, v1}, Lo9/b;->b(Landroid/os/Parcel;I)V

    return-void
.end method
