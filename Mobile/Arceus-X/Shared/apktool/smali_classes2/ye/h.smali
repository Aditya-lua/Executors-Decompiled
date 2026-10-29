.class public final Lye/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxe/g;


# static fields
.field public static final b:Lue/b$b;


# instance fields
.field public final a:Lxe/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lue/b$b;->b:Lue/b$b;

    sput-object v0, Lye/h;->b:Lue/b$b;

    return-void
.end method

.method public constructor <init>(Lxe/i;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lye/h;->b:Lue/b$b;

    invoke-virtual {v0}, Lue/b$b;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lye/h;->a:Lxe/i;

    return-void

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Can not use HMAC in FIPS-mode, as BoringCrypto module is not available."

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
