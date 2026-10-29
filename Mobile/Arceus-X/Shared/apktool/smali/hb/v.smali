.class public Lhb/v;
.super Ln9/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ln9/e<",
        "Lhb/f;",
        ">;"
    }
.end annotation


# instance fields
.field public final e:Ljava/lang/String;

.field public final f:Lhb/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhb/r<",
            "Lhb/f;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lk9/f$a;Lk9/f$b;Ljava/lang/String;Ln9/d;)V
    .locals 7

    const/16 v3, 0x17

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v5, p3

    move-object v6, p4

    move-object v4, p6

    invoke-direct/range {v0 .. v6}, Ln9/e;-><init>(Landroid/content/Context;Landroid/os/Looper;ILn9/d;Lk9/f$a;Lk9/f$b;)V

    new-instance p1, Lhb/u;

    invoke-direct {p1, p0}, Lhb/u;-><init>(Lhb/v;)V

    iput-object p1, v0, Lhb/v;->f:Lhb/r;

    iput-object p5, v0, Lhb/v;->e:Ljava/lang/String;

    return-void
.end method

.method public static synthetic g(Lhb/v;)V
    .locals 0

    invoke-virtual {p0}, Ln9/c;->checkConnected()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic createServiceInterface(Landroid/os/IBinder;)Landroid/os/IInterface;
    .locals 2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const-string v0, "com.google.android.gms.location.internal.IGoogleLocationManagerService"

    invoke-interface {p1, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, Lhb/f;

    if-eqz v1, :cond_1

    check-cast v0, Lhb/f;

    return-object v0

    :cond_1
    new-instance v0, Lhb/e;

    invoke-direct {v0, p1}, Lhb/e;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method

.method public final getApiFeatures()[Lcom/google/android/gms/common/Feature;
    .locals 1

    sget-object v0, Llb/a0;->f:[Lcom/google/android/gms/common/Feature;

    return-object v0
.end method

.method public final getGetServiceRequestExtraArgs()Landroid/os/Bundle;
    .locals 3

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "client_name"

    iget-object v2, p0, Lhb/v;->e:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getMinApkVersion()I
    .locals 1

    const v0, 0xb2c988

    return v0
.end method

.method public final getServiceDescriptor()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.location.internal.IGoogleLocationManagerService"

    return-object v0
.end method

.method public final getStartServiceAction()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.location.internal.GoogleLocationManagerService.START"

    return-object v0
.end method
