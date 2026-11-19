.class public final Lrb/h;
.super Lp9/a;
.source "SourceFile"

# interfaces
.implements Ll9/p;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lrb/h;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final f:Ljava/util/List;

.field public final g:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lrb/i;

    invoke-direct {v0}, Lrb/i;-><init>()V

    sput-object v0, Lrb/h;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Lp9/a;-><init>()V

    iput-object p1, p0, Lrb/h;->f:Ljava/util/List;

    iput-object p2, p0, Lrb/h;->g:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final n()Lcom/google/android/gms/common/api/Status;
    .locals 1

    iget-object v0, p0, Lrb/h;->g:Ljava/lang/String;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/android/gms/common/api/Status;->k:Lcom/google/android/gms/common/api/Status;

    return-object v0

    :cond_0
    sget-object v0, Lcom/google/android/gms/common/api/Status;->o:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    iget-object p2, p0, Lrb/h;->f:Ljava/util/List;

    invoke-static {p1}, Lp9/c;->a(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p1, v1, p2, v2}, Lp9/c;->x(Landroid/os/Parcel;ILjava/util/List;Z)V

    const/4 p2, 0x2

    iget-object v1, p0, Lrb/h;->g:Ljava/lang/String;

    invoke-static {p1, p2, v1, v2}, Lp9/c;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    invoke-static {p1, v0}, Lp9/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
