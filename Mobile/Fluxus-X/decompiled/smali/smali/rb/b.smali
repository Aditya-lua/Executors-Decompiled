.class public final Lrb/b;
.super Lp9/a;
.source "SourceFile"

# interfaces
.implements Ll9/p;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lrb/b;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final f:I

.field public g:I

.field public h:Landroid/content/Intent;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lrb/c;

    invoke-direct {v0}, Lrb/c;-><init>()V

    sput-object v0, Lrb/b;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x2

    .line 1
    invoke-direct {p0, v2, v0, v1}, Lrb/b;-><init>(IILandroid/content/Intent;)V

    return-void
.end method

.method public constructor <init>(IILandroid/content/Intent;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lp9/a;-><init>()V

    iput p1, p0, Lrb/b;->f:I

    iput p2, p0, Lrb/b;->g:I

    iput-object p3, p0, Lrb/b;->h:Landroid/content/Intent;

    return-void
.end method


# virtual methods
.method public final n()Lcom/google/android/gms/common/api/Status;
    .locals 1

    iget v0, p0, Lrb/b;->g:I

    if-nez v0, :cond_0

    sget-object v0, Lcom/google/android/gms/common/api/Status;->k:Lcom/google/android/gms/common/api/Status;

    return-object v0

    :cond_0
    sget-object v0, Lcom/google/android/gms/common/api/Status;->o:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    iget v0, p0, Lrb/b;->f:I

    invoke-static {p1}, Lp9/c;->a(Landroid/os/Parcel;)I

    move-result v1

    const/4 v2, 0x1

    invoke-static {p1, v2, v0}, Lp9/c;->n(Landroid/os/Parcel;II)V

    const/4 v0, 0x2

    iget v2, p0, Lrb/b;->g:I

    invoke-static {p1, v0, v2}, Lp9/c;->n(Landroid/os/Parcel;II)V

    iget-object v0, p0, Lrb/b;->h:Landroid/content/Intent;

    const/4 v2, 0x0

    const/4 v3, 0x3

    invoke-static {p1, v3, v0, p2, v2}, Lp9/c;->t(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-static {p1, v1}, Lp9/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
