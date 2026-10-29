.class public final Lbf/c;
.super Lbf/c1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbf/c$b;
    }
.end annotation


# instance fields
.field public final a:Lbf/a;

.field public final b:Ljava/security/spec/ECPoint;

.field public final c:Lef/a;

.field public final d:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Lbf/a;Ljava/security/spec/ECPoint;Lef/a;Ljava/lang/Integer;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lbf/c1;-><init>()V

    .line 3
    iput-object p1, p0, Lbf/c;->a:Lbf/a;

    .line 4
    iput-object p2, p0, Lbf/c;->b:Ljava/security/spec/ECPoint;

    .line 5
    iput-object p3, p0, Lbf/c;->c:Lef/a;

    .line 6
    iput-object p4, p0, Lbf/c;->d:Ljava/lang/Integer;

    return-void
.end method

.method public synthetic constructor <init>(Lbf/a;Ljava/security/spec/ECPoint;Lef/a;Ljava/lang/Integer;Lbf/c$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lbf/c;-><init>(Lbf/a;Ljava/security/spec/ECPoint;Lef/a;Ljava/lang/Integer;)V

    return-void
.end method

.method public static c()Lbf/c$b;
    .locals 2

    new-instance v0, Lbf/c$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lbf/c$b;-><init>(Lbf/c$a;)V

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lbf/c;->d:Ljava/lang/Integer;

    return-object v0
.end method

.method public b()Lef/a;
    .locals 1

    iget-object v0, p0, Lbf/c;->c:Lef/a;

    return-object v0
.end method

.method public d()Lbf/a;
    .locals 1

    iget-object v0, p0, Lbf/c;->a:Lbf/a;

    return-object v0
.end method

.method public e()Ljava/security/spec/ECPoint;
    .locals 1

    iget-object v0, p0, Lbf/c;->b:Ljava/security/spec/ECPoint;

    return-object v0
.end method
