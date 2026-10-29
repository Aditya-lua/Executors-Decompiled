.class public final Lf6/h0$a;
.super Lx4/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf6/h0;-><init>(Lx4/u;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lx4/f<",
        "Lf6/c0;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u0002H\u0014\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "f6/h0$a",
        "Lx4/f;",
        "Lf6/c0;",
        "",
        "b",
        "()Ljava/lang/String;",
        "Lf5/d;",
        "statement",
        "entity",
        "",
        "g",
        "(Lf5/d;Lf6/c0;)V",
        "work-runtime_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lx4/f;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lf5/d;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lf6/c0;

    invoke-virtual {p0, p1, p2}, Lf6/h0$a;->g(Lf5/d;Lf6/c0;)V

    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)"

    return-object v0
.end method

.method public g(Lf5/d;Lf6/c0;)V
    .locals 2

    const-string v0, "statement"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "entity"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-virtual {p2}, Lf6/c0;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lf5/d;->k0(ILjava/lang/String;)V

    sget-object v0, Landroidx/work/b;->b:Landroidx/work/b$b;

    invoke-virtual {p2}, Lf6/c0;->a()Landroidx/work/b;

    move-result-object p2

    invoke-virtual {v0, p2}, Landroidx/work/b$b;->e(Landroidx/work/b;)[B

    move-result-object p2

    const/4 v0, 0x2

    invoke-interface {p1, v0, p2}, Lf5/d;->A(I[B)V

    return-void
.end method
