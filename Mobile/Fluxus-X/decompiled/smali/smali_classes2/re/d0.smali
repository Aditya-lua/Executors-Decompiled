.class public final Lre/d0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lre/d0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lre/d0;

    invoke-direct {v0}, Lre/d0;-><init>()V

    sput-object v0, Lre/d0;->a:Lre/d0;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lre/d0;
    .locals 1

    sget-object v0, Lre/d0;->a:Lre/d0;

    return-object v0
.end method

.method public static b(Lre/d0;)Lre/d0;
    .locals 1

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "SecretKeyAccess is required"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
