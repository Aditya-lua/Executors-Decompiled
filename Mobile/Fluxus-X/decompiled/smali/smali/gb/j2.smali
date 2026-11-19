.class public final Lgb/j2;
.super Lgb/a;
.source "SourceFile"

# interfaces
.implements Landroid/os/IInterface;


# direct methods
.method public constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "com.google.android.gms.games.internal.connect.IGamesConnectService"

    invoke-direct {p0, p1, v0}, Lgb/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final t2(Lgb/i2;Lgb/d2;)V
    .locals 1

    invoke-virtual {p0}, Lgb/a;->r2()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lgb/l0;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    invoke-static {v0, p2}, Lgb/l0;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/4 p1, 0x2

    invoke-virtual {p0, p1, v0}, Lgb/a;->s2(ILandroid/os/Parcel;)V

    return-void
.end method
