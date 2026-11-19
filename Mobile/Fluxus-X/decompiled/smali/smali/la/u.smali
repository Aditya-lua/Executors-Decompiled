.class public final Lla/u;
.super Lgb/a;
.source "SourceFile"

# interfaces
.implements Landroid/os/IInterface;


# direct methods
.method public constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "com.google.android.gms.games.internal.v2.appshortcuts.IAppShortcutsService"

    invoke-direct {p0, p1, v0}, Lgb/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final t2(Lla/w;Lla/q;Ljava/util/List;Ljava/util/List;)V
    .locals 1

    invoke-virtual {p0}, Lgb/a;->r2()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lgb/l0;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    invoke-static {v0, p2}, Lgb/l0;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-virtual {v0, p3}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    invoke-virtual {v0, p4}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    const/4 p1, 0x3

    invoke-virtual {p0, p1, v0}, Lgb/a;->s2(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final u2(Lla/w;Lla/q;Lla/h;)V
    .locals 1

    invoke-virtual {p0}, Lgb/a;->r2()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lgb/l0;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    invoke-static {v0, p2}, Lgb/l0;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {v0, p3}, Lgb/l0;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/4 p1, 0x4

    invoke-virtual {p0, p1, v0}, Lgb/a;->s2(ILandroid/os/Parcel;)V

    return-void
.end method
