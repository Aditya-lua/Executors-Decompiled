.class public final Luh/g$c;
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
        "uh/g$c",
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

    invoke-virtual {p0, p1, p2}, Luh/g$c;->e(Lg5/d;Lvh/a;)V

    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    const-string v0, "UPDATE OR ABORT `analytic_event` SET `id` = ?,`serialized_event` = ?,`event_name` = ?,`event_context` = ?,`serialized_params` = ?,`retry_attempt_count` = ? WHERE `id` = ?"

    return-object v0
.end method

.method public e(Lg5/d;Lvh/a;)V
    .locals 4

    const-string v0, "statement"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "entity"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lvh/a;->e()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x1

    invoke-interface {p1, v2, v0, v1}, Lg5/d;->B(IJ)V

    const/4 v0, 0x2

    invoke-virtual {p2}, Lvh/a;->g()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lg5/d;->m0(ILjava/lang/String;)V

    invoke-virtual {p2}, Lvh/a;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    if-nez v0, :cond_0

    invoke-interface {p1, v1}, Lg5/d;->F(I)V

    goto :goto_0

    :cond_0
    invoke-interface {p1, v1, v0}, Lg5/d;->m0(ILjava/lang/String;)V

    :goto_0
    invoke-virtual {p2}, Lvh/a;->c()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    if-nez v0, :cond_1

    invoke-interface {p1, v1}, Lg5/d;->F(I)V

    goto :goto_1

    :cond_1
    invoke-interface {p1, v1, v0}, Lg5/d;->m0(ILjava/lang/String;)V

    :goto_1
    invoke-virtual {p2}, Lvh/a;->h()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x5

    if-nez v0, :cond_2

    invoke-interface {p1, v1}, Lg5/d;->F(I)V

    goto :goto_2

    :cond_2
    invoke-interface {p1, v1, v0}, Lg5/d;->m0(ILjava/lang/String;)V

    :goto_2
    invoke-virtual {p2}, Lvh/a;->f()Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x6

    if-nez v0, :cond_3

    invoke-interface {p1, v1}, Lg5/d;->F(I)V

    goto :goto_3

    :cond_3
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, Lg5/d;->B(IJ)V

    :goto_3
    invoke-virtual {p2}, Lvh/a;->e()I

    move-result p2

    int-to-long v0, p2

    const/4 p2, 0x7

    invoke-interface {p1, p2, v0, v1}, Lg5/d;->B(IJ)V

    return-void
.end method
