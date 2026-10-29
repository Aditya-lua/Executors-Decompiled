.class public final Lpe/d0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lpe/d0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lpe/d0;

    invoke-direct {v0}, Lpe/d0;-><init>()V

    sput-object v0, Lpe/d0;->a:Lpe/d0;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lpe/d0;
    .locals 1

    sget-object v0, Lpe/d0;->a:Lpe/d0;

    return-object v0
.end method

.method public static b(Lpe/d0;)Lpe/d0;
    .locals 1

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "SecretKeyAccess is required"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
