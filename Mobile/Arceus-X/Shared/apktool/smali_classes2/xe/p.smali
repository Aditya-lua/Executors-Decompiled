.class public final Lxe/p;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/String;

.field public static final b:Laf/q0;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final c:Laf/q0;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final d:Laf/q0;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "type.googleapis.com/google.crypto.tink.HmacKey"

    invoke-static {v0}, Lxe/p;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lxe/p;->a:Ljava/lang/String;

    invoke-static {}, Laf/q0;->a0()Laf/q0;

    move-result-object v0

    sput-object v0, Lxe/p;->b:Laf/q0;

    sput-object v0, Lxe/p;->c:Laf/q0;

    sput-object v0, Lxe/p;->d:Laf/q0;

    :try_start_0
    invoke-static {}, Lxe/p;->a()V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/ExceptionInInitializerError;

    invoke-direct {v1, v0}, Ljava/lang/ExceptionInInitializerError;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public static a()V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {}, Lxe/p;->c()V

    return-void
.end method

.method public static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    return-object p0
.end method

.method public static c()V
    .locals 2

    invoke-static {}, Lxe/t;->d()V

    invoke-static {}, Lxe/h;->d()V

    const/4 v0, 0x1

    invoke-static {v0}, Lxe/n;->e(Z)V

    invoke-static {}, Lte/a;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    invoke-static {v0}, Lxe/e;->h(Z)V

    return-void
.end method
