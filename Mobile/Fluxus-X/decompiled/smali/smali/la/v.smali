.class public abstract Lla/v;
.super Lgb/r;
.source "SourceFile"

# interfaces
.implements Lla/w;


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "com.google.android.gms.games.internal.v2.appshortcuts.IAppShortcutsServiceCallback"

    invoke-direct {p0, v0}, Lgb/r;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final r2(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 0

    const/4 p3, 0x1

    if-eq p1, p3, :cond_2

    const/4 p4, 0x2

    if-eq p1, p4, :cond_1

    const/4 p4, 0x3

    if-eq p1, p4, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    sget-object p1, Landroid/content/Intent;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lgb/l0;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroid/content/Intent;

    invoke-static {p2}, Lgb/l0;->e(Landroid/os/Parcel;)V

    invoke-interface {p0, p1}, Lla/w;->g(Landroid/content/Intent;)V

    goto :goto_0

    :cond_1
    sget-object p1, Lla/f;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lgb/l0;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lla/f;

    invoke-static {p2}, Lgb/l0;->e(Landroid/os/Parcel;)V

    invoke-interface {p0, p1}, Lla/w;->E(Lla/f;)V

    goto :goto_0

    :cond_2
    sget-object p1, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lgb/l0;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/api/Status;

    invoke-static {p2}, Lgb/l0;->e(Landroid/os/Parcel;)V

    invoke-interface {p0, p1}, Lla/w;->P0(Lcom/google/android/gms/common/api/Status;)V

    :goto_0
    return p3
.end method
