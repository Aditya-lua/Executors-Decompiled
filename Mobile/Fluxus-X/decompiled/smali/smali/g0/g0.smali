.class public final Lg0/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls0/q;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg0/g0$a;,
        Lg0/g0$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ls0/q<",
        "Lg0/f0;",
        ">;"
    }
.end annotation


# static fields
.field public static final Q:Ln0/n1$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/n1$a<",
            "Ln0/n0$a;",
            ">;"
        }
    .end annotation
.end field

.field public static final R:Ln0/n1$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/n1$a<",
            "Ln0/m0$a;",
            ">;"
        }
    .end annotation
.end field

.field public static final S:Ln0/n1$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/n1$a<",
            "Ln0/j4$c;",
            ">;"
        }
    .end annotation
.end field

.field public static final T:Ln0/n1$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/n1$a<",
            "Ljava/util/concurrent/Executor;",
            ">;"
        }
    .end annotation
.end field

.field public static final U:Ln0/n1$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/n1$a<",
            "Landroid/os/Handler;",
            ">;"
        }
    .end annotation
.end field

.field public static final V:Ln0/n1$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/n1$a<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final W:Ln0/n1$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/n1$a<",
            "Lg0/v;",
            ">;"
        }
    .end annotation
.end field

.field public static final X:Ln0/n1$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/n1$a<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field public static final Y:Ln0/n1$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/n1$a<",
            "Lg0/c2;",
            ">;"
        }
    .end annotation
.end field

.field public static final Z:Ln0/n1$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/n1$a<",
            "Ln0/h3;",
            ">;"
        }
    .end annotation
.end field

.field public static final a0:Ln0/n1$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/n1$a<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final b0:Ln0/n1$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/n1$a<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final P:Ln0/c3;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "camerax.core.appConfig.cameraFactoryProvider"

    const-class v1, Ln0/n0$a;

    invoke-static {v0, v1}, Ln0/n1$a;->a(Ljava/lang/String;Ljava/lang/Class;)Ln0/n1$a;

    move-result-object v0

    sput-object v0, Lg0/g0;->Q:Ln0/n1$a;

    const-string v0, "camerax.core.appConfig.deviceSurfaceManagerProvider"

    const-class v1, Ln0/m0$a;

    invoke-static {v0, v1}, Ln0/n1$a;->a(Ljava/lang/String;Ljava/lang/Class;)Ln0/n1$a;

    move-result-object v0

    sput-object v0, Lg0/g0;->R:Ln0/n1$a;

    const-string v0, "camerax.core.appConfig.useCaseConfigFactoryProvider"

    const-class v1, Ln0/j4$c;

    invoke-static {v0, v1}, Ln0/n1$a;->a(Ljava/lang/String;Ljava/lang/Class;)Ln0/n1$a;

    move-result-object v0

    sput-object v0, Lg0/g0;->S:Ln0/n1$a;

    const-string v0, "camerax.core.appConfig.cameraExecutor"

    const-class v1, Ljava/util/concurrent/Executor;

    invoke-static {v0, v1}, Ln0/n1$a;->a(Ljava/lang/String;Ljava/lang/Class;)Ln0/n1$a;

    move-result-object v0

    sput-object v0, Lg0/g0;->T:Ln0/n1$a;

    const-string v0, "camerax.core.appConfig.schedulerHandler"

    const-class v1, Landroid/os/Handler;

    invoke-static {v0, v1}, Ln0/n1$a;->a(Ljava/lang/String;Ljava/lang/Class;)Ln0/n1$a;

    move-result-object v0

    sput-object v0, Lg0/g0;->U:Ln0/n1$a;

    const-string v0, "camerax.core.appConfig.minimumLoggingLevel"

    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v0, v1}, Ln0/n1$a;->a(Ljava/lang/String;Ljava/lang/Class;)Ln0/n1$a;

    move-result-object v0

    sput-object v0, Lg0/g0;->V:Ln0/n1$a;

    const-string v0, "camerax.core.appConfig.availableCamerasLimiter"

    const-class v2, Lg0/v;

    invoke-static {v0, v2}, Ln0/n1$a;->a(Ljava/lang/String;Ljava/lang/Class;)Ln0/n1$a;

    move-result-object v0

    sput-object v0, Lg0/g0;->W:Ln0/n1$a;

    const-string v0, "camerax.core.appConfig.cameraOpenRetryMaxTimeoutInMillisWhileResuming"

    sget-object v2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    invoke-static {v0, v2}, Ln0/n1$a;->a(Ljava/lang/String;Ljava/lang/Class;)Ln0/n1$a;

    move-result-object v0

    sput-object v0, Lg0/g0;->X:Ln0/n1$a;

    const-string v0, "camerax.core.appConfig.cameraProviderInitRetryPolicy"

    const-class v2, Lg0/c2;

    invoke-static {v0, v2}, Ln0/n1$a;->a(Ljava/lang/String;Ljava/lang/Class;)Ln0/n1$a;

    move-result-object v0

    sput-object v0, Lg0/g0;->Y:Ln0/n1$a;

    const-string v0, "camerax.core.appConfig.quirksSettings"

    const-class v2, Ln0/h3;

    invoke-static {v0, v2}, Ln0/n1$a;->a(Ljava/lang/String;Ljava/lang/Class;)Ln0/n1$a;

    move-result-object v0

    sput-object v0, Lg0/g0;->Z:Ln0/n1$a;

    const-string v0, "camerax.core.appConfig.configImplType"

    invoke-static {v0, v1}, Ln0/n1$a;->a(Ljava/lang/String;Ljava/lang/Class;)Ln0/n1$a;

    move-result-object v0

    sput-object v0, Lg0/g0;->a0:Ln0/n1$a;

    const-string v0, "camerax.core.appConfig.repeatingStreamForced"

    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-static {v0, v1}, Ln0/n1$a;->a(Ljava/lang/String;Ljava/lang/Class;)Ln0/n1$a;

    move-result-object v0

    sput-object v0, Lg0/g0;->b0:Ln0/n1$a;

    return-void
.end method

.method public constructor <init>(Ln0/c3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg0/g0;->P:Ln0/c3;

    return-void
.end method


# virtual methods
.method public h0(Lg0/v;)Lg0/v;
    .locals 2

    iget-object v0, p0, Lg0/g0;->P:Ln0/c3;

    sget-object v1, Lg0/g0;->W:Ln0/n1$a;

    invoke-virtual {v0, v1, p1}, Ln0/c3;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lg0/v;

    return-object p1
.end method

.method public i0(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;
    .locals 2

    iget-object v0, p0, Lg0/g0;->P:Ln0/c3;

    sget-object v1, Lg0/g0;->T:Ln0/n1$a;

    invoke-virtual {v0, v1, p1}, Ln0/c3;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/concurrent/Executor;

    return-object p1
.end method

.method public j0(Ln0/n0$a;)Ln0/n0$a;
    .locals 2

    iget-object v0, p0, Lg0/g0;->P:Ln0/c3;

    sget-object v1, Lg0/g0;->Q:Ln0/n1$a;

    invoke-virtual {v0, v1, p1}, Ln0/c3;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ln0/n0$a;

    return-object p1
.end method

.method public k0()J
    .locals 4

    iget-object v0, p0, Lg0/g0;->P:Ln0/c3;

    sget-object v1, Lg0/g0;->X:Ln0/n1$a;

    const-wide/16 v2, -0x1

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ln0/c3;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public l0()Lg0/c2;
    .locals 3

    iget-object v0, p0, Lg0/g0;->P:Ln0/c3;

    sget-object v1, Lg0/g0;->Y:Ln0/n1$a;

    sget-object v2, Lg0/c2;->b:Lg0/c2;

    invoke-virtual {v0, v1, v2}, Ln0/c3;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg0/c2;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, Lg0/c2;

    return-object v0
.end method

.method public m0()I
    .locals 3

    iget-object v0, p0, Lg0/g0;->P:Ln0/c3;

    sget-object v1, Lg0/g0;->a0:Ln0/n1$a;

    const/4 v2, -0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ln0/c3;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public n()Ln0/n1;
    .locals 1

    iget-object v0, p0, Lg0/g0;->P:Ln0/c3;

    return-object v0
.end method

.method public n0(Ln0/m0$a;)Ln0/m0$a;
    .locals 2

    iget-object v0, p0, Lg0/g0;->P:Ln0/c3;

    sget-object v1, Lg0/g0;->R:Ln0/n1$a;

    invoke-virtual {v0, v1, p1}, Ln0/c3;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ln0/m0$a;

    return-object p1
.end method

.method public o0()Ln0/h3;
    .locals 3

    iget-object v0, p0, Lg0/g0;->P:Ln0/c3;

    sget-object v1, Lg0/g0;->Z:Ln0/n1$a;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ln0/c3;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln0/h3;

    return-object v0
.end method

.method public p0(Landroid/os/Handler;)Landroid/os/Handler;
    .locals 2

    iget-object v0, p0, Lg0/g0;->P:Ln0/c3;

    sget-object v1, Lg0/g0;->U:Ln0/n1$a;

    invoke-virtual {v0, v1, p1}, Ln0/c3;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/Handler;

    return-object p1
.end method

.method public q0(Ln0/j4$c;)Ln0/j4$c;
    .locals 2

    iget-object v0, p0, Lg0/g0;->P:Ln0/c3;

    sget-object v1, Lg0/g0;->S:Ln0/n1$a;

    invoke-virtual {v0, v1, p1}, Ln0/c3;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ln0/j4$c;

    return-object p1
.end method

.method public r0()Z
    .locals 3

    iget-object v0, p0, Lg0/g0;->P:Ln0/c3;

    sget-object v1, Lg0/g0;->b0:Ln0/n1$a;

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1, v2}, Ln0/c3;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method
