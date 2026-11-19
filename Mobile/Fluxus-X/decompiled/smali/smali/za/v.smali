.class public final Lza/v;
.super Lo9/i;
.source "SourceFile"


# instance fields
.field public final e:Lz8/g;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lo9/f;Lz8/g;Ll9/h$a;Ll9/h$b;)V
    .locals 7

    const/16 v3, 0x44

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lo9/i;-><init>(Landroid/content/Context;Landroid/os/Looper;ILo9/f;Ll9/h$a;Ll9/h$b;)V

    new-instance p1, Lz8/f;

    if-nez p4, :cond_0

    sget-object p4, Lz8/g;->d:Lz8/g;

    :cond_0
    invoke-direct {p1, p4}, Lz8/f;-><init>(Lz8/g;)V

    invoke-static {}, Lza/r;->a()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lz8/f;->a(Ljava/lang/String;)Lz8/f;

    new-instance p2, Lz8/g;

    invoke-direct {p2, p1}, Lz8/g;-><init>(Lz8/f;)V

    iput-object p2, v0, Lza/v;->e:Lz8/g;

    return-void
.end method


# virtual methods
.method public final synthetic createServiceInterface(Landroid/os/IBinder;)Landroid/os/IInterface;
    .locals 2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const-string v0, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService"

    invoke-interface {p1, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, Lza/w;

    if-eqz v1, :cond_1

    check-cast v0, Lza/w;

    return-object v0

    :cond_1
    new-instance v0, Lza/w;

    invoke-direct {v0, p1}, Lza/w;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method

.method public final getGetServiceRequestExtraArgs()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Lza/v;->e:Lz8/g;

    invoke-virtual {v0}, Lz8/g;->a()Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method

.method public final getMinApkVersion()I
    .locals 1

    const v0, 0xc35000

    return v0
.end method

.method public final getServiceDescriptor()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService"

    return-object v0
.end method

.method public final getStartServiceAction()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.auth.api.credentials.service.START"

    return-object v0
.end method
