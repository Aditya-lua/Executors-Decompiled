.class public final Lfb/w4;
.super Lfb/a;
.source "SourceFile"

# interfaces
.implements Landroid/os/IInterface;


# direct methods
.method public constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService"

    invoke-direct {p0, p1, v0}, Lfb/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final t2(Lfb/v4;Lda/r;)V
    .locals 2

    invoke-virtual {p0}, Lfb/a;->r2()Landroid/os/Parcel;

    move-result-object v0

    sget-object v1, Lfb/b1;->a:Ljava/lang/ClassLoader;

    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    invoke-static {v0, p2}, Lfb/b1;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/4 p1, 0x1

    invoke-virtual {p0, p1, v0}, Lfb/a;->s2(ILandroid/os/Parcel;)V

    return-void
.end method
