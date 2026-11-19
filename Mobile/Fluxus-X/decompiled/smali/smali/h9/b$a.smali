.class public abstract Lh9/b$a;
.super Lbb/d;
.source "SourceFile"

# interfaces
.implements Lh9/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh9/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "com.google.android.gms.auth.blockstore.restorecredential.internal.IGetRestoreCredentialCallback"

    invoke-direct {p0, v0}, Lbb/d;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public r2(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 0
    .param p2    # Landroid/os/Parcel;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Landroid/os/Parcel;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 p3, 0x1

    if-ne p1, p3, :cond_0

    sget-object p1, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lbb/e;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/api/Status;

    sget-object p4, Lg9/g;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p4}, Lbb/e;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p4

    check-cast p4, Lg9/g;

    invoke-virtual {p0, p2}, Lbb/d;->s2(Landroid/os/Parcel;)V

    invoke-interface {p0, p1, p4}, Lh9/b;->y0(Lcom/google/android/gms/common/api/Status;Lg9/g;)V

    return p3

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
