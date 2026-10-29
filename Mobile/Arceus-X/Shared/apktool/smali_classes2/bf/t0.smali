.class public final Lbf/t0;
.super Lbf/c1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbf/t0$b;
    }
.end annotation


# instance fields
.field public final a:Lbf/r0;

.field public final b:Ljava/math/BigInteger;

.field public final c:Lef/a;

.field public final d:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Lbf/r0;Ljava/math/BigInteger;Lef/a;Ljava/lang/Integer;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lbf/c1;-><init>()V

    .line 3
    iput-object p1, p0, Lbf/t0;->a:Lbf/r0;

    .line 4
    iput-object p2, p0, Lbf/t0;->b:Ljava/math/BigInteger;

    .line 5
    iput-object p3, p0, Lbf/t0;->c:Lef/a;

    .line 6
    iput-object p4, p0, Lbf/t0;->d:Ljava/lang/Integer;

    return-void
.end method

.method public synthetic constructor <init>(Lbf/r0;Ljava/math/BigInteger;Lef/a;Ljava/lang/Integer;Lbf/t0$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lbf/t0;-><init>(Lbf/r0;Ljava/math/BigInteger;Lef/a;Ljava/lang/Integer;)V

    return-void
.end method

.method public static c()Lbf/t0$b;
    .locals 2

    new-instance v0, Lbf/t0$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lbf/t0$b;-><init>(Lbf/t0$a;)V

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lbf/t0;->d:Ljava/lang/Integer;

    return-object v0
.end method

.method public b()Lef/a;
    .locals 1

    iget-object v0, p0, Lbf/t0;->c:Lef/a;

    return-object v0
.end method

.method public d()Ljava/math/BigInteger;
    .locals 1

    iget-object v0, p0, Lbf/t0;->b:Ljava/math/BigInteger;

    return-object v0
.end method

.method public e()Lbf/r0;
    .locals 1

    iget-object v0, p0, Lbf/t0;->a:Lbf/r0;

    return-object v0
.end method
