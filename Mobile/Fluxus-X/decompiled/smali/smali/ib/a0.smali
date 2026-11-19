.class public final Lib/a0;
.super Lp9/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lib/a0;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final f:I

.field public final g:Lib/y;

.field public final h:Lmb/l;

.field public final i:Lib/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lib/b0;

    invoke-direct {v0}, Lib/b0;-><init>()V

    sput-object v0, Lib/a0;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ILib/y;Landroid/os/IBinder;Landroid/os/IBinder;)V
    .locals 0

    invoke-direct {p0}, Lp9/a;-><init>()V

    iput p1, p0, Lib/a0;->f:I

    iput-object p2, p0, Lib/a0;->g:Lib/y;

    const/4 p1, 0x0

    if-nez p3, :cond_0

    move-object p2, p1

    goto :goto_0

    :cond_0
    invoke-static {p3}, Lmb/k;->s2(Landroid/os/IBinder;)Lmb/l;

    move-result-object p2

    :goto_0
    iput-object p2, p0, Lib/a0;->h:Lmb/l;

    if-nez p4, :cond_1

    goto :goto_1

    :cond_1
    const-string p1, "com.google.android.gms.location.internal.IFusedLocationProviderCallback"

    invoke-interface {p4, p1}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object p1

    instance-of p2, p1, Lib/d;

    if-eqz p2, :cond_2

    check-cast p1, Lib/d;

    goto :goto_1

    :cond_2
    new-instance p1, Lib/c;

    invoke-direct {p1, p4}, Lib/c;-><init>(Landroid/os/IBinder;)V

    :goto_1
    iput-object p1, p0, Lib/a0;->i:Lib/d;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Lp9/c;->a(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x1

    iget v2, p0, Lib/a0;->f:I

    invoke-static {p1, v1, v2}, Lp9/c;->n(Landroid/os/Parcel;II)V

    iget-object v1, p0, Lib/a0;->g:Lib/y;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, p2, v3}, Lp9/c;->t(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object p2, p0, Lib/a0;->h:Lmb/l;

    const/4 v1, 0x0

    if-nez p2, :cond_0

    move-object p2, v1

    goto :goto_0

    :cond_0
    invoke-interface {p2}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object p2

    :goto_0
    const/4 v2, 0x3

    invoke-static {p1, v2, p2, v3}, Lp9/c;->m(Landroid/os/Parcel;ILandroid/os/IBinder;Z)V

    iget-object p2, p0, Lib/a0;->i:Lib/d;

    if-nez p2, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {p2}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v1

    :goto_1
    const/4 p2, 0x4

    invoke-static {p1, p2, v1, v3}, Lp9/c;->m(Landroid/os/Parcel;ILandroid/os/IBinder;Z)V

    invoke-static {p1, v0}, Lp9/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
