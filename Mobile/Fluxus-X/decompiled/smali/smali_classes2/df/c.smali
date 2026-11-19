.class public final Ldf/c;
.super Ldf/c1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldf/c$b;
    }
.end annotation


# instance fields
.field public final a:Ldf/a;

.field public final b:Ljava/security/spec/ECPoint;

.field public final c:Lgf/a;

.field public final d:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Ldf/a;Ljava/security/spec/ECPoint;Lgf/a;Ljava/lang/Integer;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ldf/c1;-><init>()V

    .line 3
    iput-object p1, p0, Ldf/c;->a:Ldf/a;

    .line 4
    iput-object p2, p0, Ldf/c;->b:Ljava/security/spec/ECPoint;

    .line 5
    iput-object p3, p0, Ldf/c;->c:Lgf/a;

    .line 6
    iput-object p4, p0, Ldf/c;->d:Ljava/lang/Integer;

    return-void
.end method

.method public synthetic constructor <init>(Ldf/a;Ljava/security/spec/ECPoint;Lgf/a;Ljava/lang/Integer;Ldf/c$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Ldf/c;-><init>(Ldf/a;Ljava/security/spec/ECPoint;Lgf/a;Ljava/lang/Integer;)V

    return-void
.end method

.method public static c()Ldf/c$b;
    .locals 2

    new-instance v0, Ldf/c$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ldf/c$b;-><init>(Ldf/c$a;)V

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Ldf/c;->d:Ljava/lang/Integer;

    return-object v0
.end method

.method public b()Lgf/a;
    .locals 1

    iget-object v0, p0, Ldf/c;->c:Lgf/a;

    return-object v0
.end method

.method public d()Ldf/a;
    .locals 1

    iget-object v0, p0, Ldf/c;->a:Ldf/a;

    return-object v0
.end method

.method public e()Ljava/security/spec/ECPoint;
    .locals 1

    iget-object v0, p0, Ldf/c;->b:Ljava/security/spec/ECPoint;

    return-object v0
.end method
