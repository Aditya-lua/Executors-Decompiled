.class public final Lza/a0;
.super Lza/a;
.source "SourceFile"

# interfaces
.implements Landroid/os/IInterface;


# direct methods
.method public constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService"

    invoke-direct {p0, p1, v0}, Lza/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final t2(Lza/g0;La9/g;)V
    .locals 1

    invoke-virtual {p0}, Lza/a;->r2()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lza/t;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    invoke-static {v0, p2}, Lza/t;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/4 p1, 0x2

    invoke-virtual {p0, p1, v0}, Lza/a;->s2(ILandroid/os/Parcel;)V

    return-void
.end method
