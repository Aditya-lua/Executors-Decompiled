.class public final Laf/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lze/g;


# static fields
.field public static final b:Lwe/b$b;


# instance fields
.field public final a:Lze/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lwe/b$b;->a:Lwe/b$b;

    sput-object v0, Laf/g;->b:Lwe/b$b;

    return-void
.end method

.method public constructor <init>(Lze/a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Laf/g;->b:Lwe/b$b;

    invoke-virtual {v0}, Lwe/b$b;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Laf/g;->a:Lze/a;

    return-void

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Can not use AES-CMAC in FIPS-mode."

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
