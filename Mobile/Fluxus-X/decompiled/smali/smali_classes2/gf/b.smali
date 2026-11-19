.class public final Lgf/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/math/BigInteger;


# direct methods
.method public constructor <init>(Ljava/math/BigInteger;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgf/b;->a:Ljava/math/BigInteger;

    return-void
.end method

.method public static a(Ljava/math/BigInteger;Lre/d0;)Lgf/b;
    .locals 0

    if-eqz p1, :cond_0

    new-instance p1, Lgf/b;

    invoke-direct {p1, p0}, Lgf/b;-><init>(Ljava/math/BigInteger;)V

    return-object p1

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "SecretKeyAccess required"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public b(Lre/d0;)Ljava/math/BigInteger;
    .locals 1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lgf/b;->a:Ljava/math/BigInteger;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "SecretKeyAccess required"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
