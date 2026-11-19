.class public final Lrb/g;
.super Lcb/a;
.source "SourceFile"

# interfaces
.implements Landroid/os/IInterface;


# direct methods
.method public constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "com.google.android.gms.signin.internal.ISignInService"

    invoke-direct {p0, p1, v0}, Lcb/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final u2(Lrb/j;Lrb/f;)V
    .locals 1

    invoke-virtual {p0}, Lcb/a;->r2()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lcb/c;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {v0, p2}, Lcb/c;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/16 p1, 0xc

    invoke-virtual {p0, p1, v0}, Lcb/a;->s2(ILandroid/os/Parcel;)V

    return-void
.end method
