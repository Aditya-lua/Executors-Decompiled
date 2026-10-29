.class public final Lbf/l0;
.super Lbf/c1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbf/l0$b;
    }
.end annotation


# instance fields
.field public final a:Lbf/j0;

.field public final b:Ljava/math/BigInteger;

.field public final c:Lef/a;

.field public final d:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Lbf/j0;Ljava/math/BigInteger;Lef/a;Ljava/lang/Integer;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lbf/c1;-><init>()V

    .line 3
    iput-object p1, p0, Lbf/l0;->a:Lbf/j0;

    .line 4
    iput-object p2, p0, Lbf/l0;->b:Ljava/math/BigInteger;

    .line 5
    iput-object p3, p0, Lbf/l0;->c:Lef/a;

    .line 6
    iput-object p4, p0, Lbf/l0;->d:Ljava/lang/Integer;

    return-void
.end method

.method public synthetic constructor <init>(Lbf/j0;Ljava/math/BigInteger;Lef/a;Ljava/lang/Integer;Lbf/l0$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lbf/l0;-><init>(Lbf/j0;Ljava/math/BigInteger;Lef/a;Ljava/lang/Integer;)V

    return-void
.end method

.method public static c()Lbf/l0$b;
    .locals 2

    new-instance v0, Lbf/l0$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lbf/l0$b;-><init>(Lbf/l0$a;)V

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lbf/l0;->d:Ljava/lang/Integer;

    return-object v0
.end method

.method public b()Lef/a;
    .locals 1

    iget-object v0, p0, Lbf/l0;->c:Lef/a;

    return-object v0
.end method

.method public d()Ljava/math/BigInteger;
    .locals 1

    iget-object v0, p0, Lbf/l0;->b:Ljava/math/BigInteger;

    return-object v0
.end method

.method public e()Lbf/j0;
    .locals 1

    iget-object v0, p0, Lbf/l0;->a:Lbf/j0;

    return-object v0
.end method
