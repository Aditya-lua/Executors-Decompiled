.class public final Lwa/q0;
.super Lo9/i;
.source "SourceFile"


# static fields
.field public static final e:Ll9/a$g;

.field public static final f:Ll9/a$a;

.field public static final g:Ll9/a;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ll9/a$g;

    invoke-direct {v0}, Ll9/a$g;-><init>()V

    sput-object v0, Lwa/q0;->e:Ll9/a$g;

    new-instance v1, Lwa/p0;

    invoke-direct {v1}, Lwa/p0;-><init>()V

    sput-object v1, Lwa/q0;->f:Ll9/a$a;

    new-instance v2, Ll9/a;

    const-string v3, "AppIndexing.API"

    invoke-direct {v2, v3, v1, v0}, Ll9/a;-><init>(Ljava/lang/String;Ll9/a$a;Ll9/a$g;)V

    sput-object v2, Lwa/q0;->g:Ll9/a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lo9/f;Lm9/e;Lm9/n;)V
    .locals 7

    const/16 v3, 0x71

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lo9/i;-><init>(Landroid/content/Context;Landroid/os/Looper;ILo9/f;Lm9/e;Lm9/n;)V

    return-void
.end method


# virtual methods
.method public final synthetic createServiceInterface(Landroid/os/IBinder;)Landroid/os/IInterface;
    .locals 0

    invoke-static {p1}, Lnf/d;->s2(Landroid/os/IBinder;)Lnf/e;

    move-result-object p1

    return-object p1
.end method

.method public final getMinApkVersion()I
    .locals 1

    const v0, 0xc042c0

    return v0
.end method

.method public final getServiceDescriptor()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.firebase.appindexing.internal.IAppIndexingService"

    return-object v0
.end method

.method public final getStartServiceAction()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.icing.APP_INDEXING_SERVICE"

    return-object v0
.end method

.method public final usesClientTelemetry()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
