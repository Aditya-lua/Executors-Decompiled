.class public final Lo9/w1;
.super Leb/a;
.source "SourceFile"

# interfaces
.implements Lo9/y1;


# direct methods
.method public constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "com.google.android.gms.common.internal.ICertData"

    invoke-direct {p0, p1, v0}, Leb/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final zzd()Lz9/a;
    .locals 2

    const/4 v0, 0x1

    invoke-virtual {p0}, Leb/a;->s2()Landroid/os/Parcel;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Leb/a;->r2(ILandroid/os/Parcel;)Landroid/os/Parcel;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v1

    invoke-static {v1}, Lz9/a$a;->s2(Landroid/os/IBinder;)Lz9/a;

    move-result-object v1

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-object v1
.end method

.method public final zze()I
    .locals 2

    const/4 v0, 0x2

    invoke-virtual {p0}, Leb/a;->s2()Landroid/os/Parcel;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Leb/a;->r2(ILandroid/os/Parcel;)Landroid/os/Parcel;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v1

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return v1
.end method
