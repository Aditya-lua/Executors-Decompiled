.class public final Lhq/c$e;
.super Le/m0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhq/c;->e1(Landroid/view/View;Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "hq/c$e",
        "Le/m0;",
        "",
        "handleOnBackPressed",
        "()V",
        "permissions_release"
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
.field public final synthetic X:Liq/l;

.field public final synthetic Y:Lhq/c;


# direct methods
.method public constructor <init>(Liq/l;Lhq/c;)V
    .locals 0

    iput-object p1, p0, Lhq/c$e;->X:Liq/l;

    iput-object p2, p0, Lhq/c$e;->Y:Lhq/c;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Le/m0;-><init>(Z)V

    return-void
.end method


# virtual methods
.method public handleOnBackPressed()V
    .locals 5

    iget-object v0, p0, Lhq/c$e;->X:Liq/l;

    invoke-virtual {v0}, Lls/d;->a()Ldv/c0;

    move-result-object v0

    new-instance v1, Lfq/n1$a;

    new-instance v2, Lfq/t1;

    iget-object v3, p0, Lhq/c$e;->Y:Lhq/c;

    invoke-static {v3}, Lhq/c;->k2(Lhq/c;)Lhq/c$c;

    move-result-object v3

    invoke-virtual {v3}, Lhq/c$c;->a()Lfq/n1$c;

    move-result-object v3

    invoke-virtual {v3}, Lfq/n1$c;->k()Lfq/n0;

    move-result-object v3

    sget-object v4, Lfq/s1;->b:Lfq/s1;

    invoke-direct {v2, v3, v4}, Lfq/t1;-><init>(Lfq/n0;Lfq/s1;)V

    invoke-direct {v1, v2}, Lfq/n1$a;-><init>(Lfq/t1;)V

    invoke-interface {v0, v1}, Ldv/c0;->setValue(Ljava/lang/Object;)V

    return-void
.end method
