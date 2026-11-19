.class public final Lnf/c;
.super Lwa/a;
.source "SourceFile"

# interfaces
.implements Lnf/e;


# direct methods
.method public constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "com.google.firebase.appindexing.internal.IAppIndexingService"

    invoke-direct {p0, p1, v0}, Lwa/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final i2(Lm9/g;Lnf/g;)Lnf/a;
    .locals 1

    invoke-virtual {p0}, Lwa/a;->r2()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lwa/x;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    invoke-static {v0, p2}, Lwa/x;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/16 p1, 0x8

    invoke-virtual {p0, p1, v0}, Lwa/a;->s2(ILandroid/os/Parcel;)Landroid/os/Parcel;

    move-result-object p1

    sget-object p2, Lnf/a;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p1, p2}, Lwa/x;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p2

    check-cast p2, Lnf/a;

    invoke-virtual {p1}, Landroid/os/Parcel;->recycle()V

    return-object p2
.end method
