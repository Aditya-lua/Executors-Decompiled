.class public abstract Lt9/j;
.super Lcb/b;
.source "SourceFile"

# interfaces
.implements Lt9/k;


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "com.google.android.gms.common.moduleinstall.internal.IModuleInstallStatusListener"

    invoke-direct {p0, v0}, Lcb/b;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final r2(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 0

    const/4 p3, 0x1

    if-ne p1, p3, :cond_0

    sget-object p1, Ls9/h;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lcb/c;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Ls9/h;

    invoke-static {p2}, Lcb/c;->b(Landroid/os/Parcel;)V

    invoke-interface {p0, p1}, Lt9/k;->K1(Ls9/h;)V

    return p3

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
