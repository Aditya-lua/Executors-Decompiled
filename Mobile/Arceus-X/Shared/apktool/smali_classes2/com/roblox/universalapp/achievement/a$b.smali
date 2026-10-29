.class public final Lcom/roblox/universalapp/achievement/a$b;
.super Lx4/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/universalapp/achievement/a;-><init>(Lx4/u;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lx4/f<",
        "Lsl/u;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u0002H\u0014\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "com/roblox/universalapp/achievement/a$b",
        "Lx4/f;",
        "Lsl/u;",
        "",
        "b",
        "()Ljava/lang/String;",
        "Lf5/d;",
        "statement",
        "entity",
        "",
        "g",
        "(Lf5/d;Lsl/u;)V",
        "database_googleProdRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic a:Lcom/roblox/universalapp/achievement/a;


# direct methods
.method public constructor <init>(Lcom/roblox/universalapp/achievement/a;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/universalapp/achievement/a$b;->a:Lcom/roblox/universalapp/achievement/a;

    invoke-direct {p0}, Lx4/f;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lf5/d;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lsl/u;

    invoke-virtual {p0, p1, p2}, Lcom/roblox/universalapp/achievement/a$b;->g(Lf5/d;Lsl/u;)V

    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR IGNORE INTO `achievements` (`code_name`,`synced_ts`,`origin`,`created_ts`) VALUES (?,?,?,?)"

    return-object v0
.end method

.method public g(Lf5/d;Lsl/u;)V
    .locals 4

    const-string v0, "statement"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "entity"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-virtual {p2}, Lsl/u;->a()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lf5/d;->k0(ILjava/lang/String;)V

    iget-object v0, p0, Lcom/roblox/universalapp/achievement/a$b;->a:Lcom/roblox/universalapp/achievement/a;

    invoke-static {v0}, Lcom/roblox/universalapp/achievement/a;->s(Lcom/roblox/universalapp/achievement/a;)Lsl/j;

    move-result-object v0

    invoke-virtual {p2}, Lsl/u;->d()Ljava/time/Instant;

    move-result-object v1

    invoke-virtual {v0, v1}, Lsl/j;->b(Ljava/time/Instant;)Ljava/lang/Long;

    move-result-object v0

    const/4 v1, 0x2

    if-nez v0, :cond_0

    invoke-interface {p1, v1}, Lf5/d;->C(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-interface {p1, v1, v2, v3}, Lf5/d;->z(IJ)V

    :goto_0
    iget-object v0, p0, Lcom/roblox/universalapp/achievement/a$b;->a:Lcom/roblox/universalapp/achievement/a;

    invoke-virtual {p2}, Lsl/u;->c()Lsl/m;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roblox/universalapp/achievement/a;->r(Lcom/roblox/universalapp/achievement/a;Lsl/m;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    invoke-interface {p1, v1, v0}, Lf5/d;->k0(ILjava/lang/String;)V

    iget-object v0, p0, Lcom/roblox/universalapp/achievement/a$b;->a:Lcom/roblox/universalapp/achievement/a;

    invoke-static {v0}, Lcom/roblox/universalapp/achievement/a;->s(Lcom/roblox/universalapp/achievement/a;)Lsl/j;

    move-result-object v0

    invoke-virtual {p2}, Lsl/u;->b()Ljava/time/Instant;

    move-result-object p2

    invoke-virtual {v0, p2}, Lsl/j;->b(Ljava/time/Instant;)Ljava/lang/Long;

    move-result-object p2

    const/4 v0, 0x4

    if-nez p2, :cond_1

    invoke-interface {p1, v0}, Lf5/d;->C(I)V

    return-void

    :cond_1
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Lf5/d;->z(IJ)V

    return-void
.end method
