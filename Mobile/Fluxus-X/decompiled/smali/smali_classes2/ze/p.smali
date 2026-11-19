.class public final Lze/p;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/String;

.field public static final b:Lcf/q0;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final c:Lcf/q0;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final d:Lcf/q0;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "type.googleapis.com/google.crypto.tink.HmacKey"

    invoke-static {v0}, Lze/p;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lze/p;->a:Ljava/lang/String;

    invoke-static {}, Lcf/q0;->a0()Lcf/q0;

    move-result-object v0

    sput-object v0, Lze/p;->b:Lcf/q0;

    sput-object v0, Lze/p;->c:Lcf/q0;

    sput-object v0, Lze/p;->d:Lcf/q0;

    :try_start_0
    invoke-static {}, Lze/p;->a()V
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

    invoke-static {}, Lze/p;->c()V

    return-void
.end method

.method public static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    return-object p0
.end method

.method public static c()V
    .locals 2

    invoke-static {}, Lze/t;->d()V

    invoke-static {}, Lze/h;->d()V

    const/4 v0, 0x1

    invoke-static {v0}, Lze/n;->e(Z)V

    invoke-static {}, Lve/a;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    invoke-static {v0}, Lze/e;->h(Z)V

    return-void
.end method
