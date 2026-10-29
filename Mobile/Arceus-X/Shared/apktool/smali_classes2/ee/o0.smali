.class public final Lee/o0;
.super Lee/a;
.source "SourceFile"

# interfaces
.implements Lee/q0;


# direct methods
.method public constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "com.google.android.play.core.integrity.protocol.IIntegrityService"

    invoke-direct {p0, p1, v0}, Lee/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final F1(Landroid/os/Bundle;Lee/s0;)V
    .locals 1

    invoke-virtual {p0}, Lee/a;->r2()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lee/f0;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    const/4 p1, 0x2

    invoke-virtual {p0, p1, v0}, Lee/a;->s2(ILandroid/os/Parcel;)V

    return-void
.end method
