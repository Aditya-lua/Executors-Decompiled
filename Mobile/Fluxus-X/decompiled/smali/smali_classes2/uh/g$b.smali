.class public final Luh/g$b;
.super Ly4/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Luh/g;-><init>(Ly4/u;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ly4/e<",
        "Lvh/a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u0002H\u0014\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "uh/g$b",
        "Ly4/e;",
        "Lvh/a;",
        "",
        "b",
        "()Ljava/lang/String;",
        "Lg5/d;",
        "statement",
        "entity",
        "",
        "e",
        "(Lg5/d;Lvh/a;)V",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ly4/e;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lg5/d;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lvh/a;

    invoke-virtual {p0, p1, p2}, Luh/g$b;->e(Lg5/d;Lvh/a;)V

    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    const-string v0, "DELETE FROM `analytic_event` WHERE `id` = ?"

    return-object v0
.end method

.method public e(Lg5/d;Lvh/a;)V
    .locals 2

    const-string v0, "statement"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "entity"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lvh/a;->e()I

    move-result p2

    int-to-long v0, p2

    const/4 p2, 0x1

    invoke-interface {p1, p2, v0, v1}, Lg5/d;->B(IJ)V

    return-void
.end method
