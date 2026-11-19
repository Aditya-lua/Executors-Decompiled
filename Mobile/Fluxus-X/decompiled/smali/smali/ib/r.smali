.class public final Lib/r;
.super Lp9/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lib/r;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final f:I

.field public final g:Lib/p;

.field public final h:Lmb/r;

.field public final i:Landroid/app/PendingIntent;

.field public final j:Lmb/o;

.field public final k:Lib/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lib/s;

    invoke-direct {v0}, Lib/s;-><init>()V

    sput-object v0, Lib/r;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ILib/p;Landroid/os/IBinder;Landroid/app/PendingIntent;Landroid/os/IBinder;Landroid/os/IBinder;)V
    .locals 0

    invoke-direct {p0}, Lp9/a;-><init>()V

    iput p1, p0, Lib/r;->f:I

    iput-object p2, p0, Lib/r;->g:Lib/p;

    const/4 p1, 0x0

    if-nez p3, :cond_0

    move-object p2, p1

    goto :goto_0

    :cond_0
    invoke-static {p3}, Lmb/q;->s2(Landroid/os/IBinder;)Lmb/r;

    move-result-object p2

    :goto_0
    iput-object p2, p0, Lib/r;->h:Lmb/r;

    iput-object p4, p0, Lib/r;->i:Landroid/app/PendingIntent;

    if-nez p5, :cond_1

    move-object p2, p1

    goto :goto_1

    :cond_1
    invoke-static {p5}, Lmb/n;->s2(Landroid/os/IBinder;)Lmb/o;

    move-result-object p2

    :goto_1
    iput-object p2, p0, Lib/r;->j:Lmb/o;

    if-nez p6, :cond_2

    goto :goto_2

    :cond_2
    const-string p1, "com.google.android.gms.location.internal.IFusedLocationProviderCallback"

    invoke-interface {p6, p1}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object p1

    instance-of p2, p1, Lib/d;

    if-eqz p2, :cond_3

    check-cast p1, Lib/d;

    goto :goto_2

    :cond_3
    new-instance p1, Lib/c;

    invoke-direct {p1, p6}, Lib/c;-><init>(Landroid/os/IBinder;)V

    :goto_2
    iput-object p1, p0, Lib/r;->k:Lib/d;

    return-void
.end method

.method public static A3(Lmb/o;Lib/d;)Lib/r;
    .locals 7

    new-instance v0, Lib/r;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    :cond_0
    move-object v6, p1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v1, 0x2

    const/4 v2, 0x0

    move-object v5, p0

    invoke-direct/range {v0 .. v6}, Lib/r;-><init>(ILib/p;Landroid/os/IBinder;Landroid/app/PendingIntent;Landroid/os/IBinder;Landroid/os/IBinder;)V

    return-object v0
.end method

.method public static a(Lmb/r;Lib/d;)Lib/r;
    .locals 7

    new-instance v0, Lib/r;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    :cond_0
    move-object v6, p1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v1, 0x2

    const/4 v2, 0x0

    move-object v3, p0

    invoke-direct/range {v0 .. v6}, Lib/r;-><init>(ILib/p;Landroid/os/IBinder;Landroid/app/PendingIntent;Landroid/os/IBinder;Landroid/os/IBinder;)V

    return-object v0
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 5

    invoke-static {p1}, Lp9/c;->a(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x1

    iget v2, p0, Lib/r;->f:I

    invoke-static {p1, v1, v2}, Lp9/c;->n(Landroid/os/Parcel;II)V

    iget-object v1, p0, Lib/r;->g:Lib/p;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, p2, v3}, Lp9/c;->t(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v1, p0, Lib/r;->h:Lmb/r;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move-object v1, v2

    goto :goto_0

    :cond_0
    invoke-interface {v1}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v1

    :goto_0
    const/4 v4, 0x3

    invoke-static {p1, v4, v1, v3}, Lp9/c;->m(Landroid/os/Parcel;ILandroid/os/IBinder;Z)V

    const/4 v1, 0x4

    iget-object v4, p0, Lib/r;->i:Landroid/app/PendingIntent;

    invoke-static {p1, v1, v4, p2, v3}, Lp9/c;->t(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object p2, p0, Lib/r;->j:Lmb/o;

    if-nez p2, :cond_1

    move-object p2, v2

    goto :goto_1

    :cond_1
    invoke-interface {p2}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object p2

    :goto_1
    const/4 v1, 0x5

    invoke-static {p1, v1, p2, v3}, Lp9/c;->m(Landroid/os/Parcel;ILandroid/os/IBinder;Z)V

    iget-object p2, p0, Lib/r;->k:Lib/d;

    if-nez p2, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {p2}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v2

    :goto_2
    const/4 p2, 0x6

    invoke-static {p1, p2, v2, v3}, Lp9/c;->m(Landroid/os/Parcel;ILandroid/os/IBinder;Z)V

    invoke-static {p1, v0}, Lp9/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
