.class public final Ldf/t0;
.super Ldf/c1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldf/t0$b;
    }
.end annotation


# instance fields
.field public final a:Ldf/r0;

.field public final b:Ljava/math/BigInteger;

.field public final c:Lgf/a;

.field public final d:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Ldf/r0;Ljava/math/BigInteger;Lgf/a;Ljava/lang/Integer;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ldf/c1;-><init>()V

    .line 3
    iput-object p1, p0, Ldf/t0;->a:Ldf/r0;

    .line 4
    iput-object p2, p0, Ldf/t0;->b:Ljava/math/BigInteger;

    .line 5
    iput-object p3, p0, Ldf/t0;->c:Lgf/a;

    .line 6
    iput-object p4, p0, Ldf/t0;->d:Ljava/lang/Integer;

    return-void
.end method

.method public synthetic constructor <init>(Ldf/r0;Ljava/math/BigInteger;Lgf/a;Ljava/lang/Integer;Ldf/t0$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Ldf/t0;-><init>(Ldf/r0;Ljava/math/BigInteger;Lgf/a;Ljava/lang/Integer;)V

    return-void
.end method

.method public static c()Ldf/t0$b;
    .locals 2

    new-instance v0, Ldf/t0$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ldf/t0$b;-><init>(Ldf/t0$a;)V

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Ldf/t0;->d:Ljava/lang/Integer;

    return-object v0
.end method

.method public b()Lgf/a;
    .locals 1

    iget-object v0, p0, Ldf/t0;->c:Lgf/a;

    return-object v0
.end method

.method public d()Ljava/math/BigInteger;
    .locals 1

    iget-object v0, p0, Ldf/t0;->b:Ljava/math/BigInteger;

    return-object v0
.end method

.method public e()Ldf/r0;
    .locals 1

    iget-object v0, p0, Ldf/t0;->a:Ldf/r0;

    return-object v0
.end method
