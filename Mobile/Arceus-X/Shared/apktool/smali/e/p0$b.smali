.class public final Le/p0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/p;
.implements Ljava/lang/AutoCloseable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le/p0;->d(Landroidx/lifecycle/s;Le/m0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0005*\u0001\u0000\u0008\n\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003J\u001f\u0010\t\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "e/p0$b",
        "Landroidx/lifecycle/p;",
        "Ljava/lang/AutoCloseable;",
        "Lkotlin/AutoCloseable;",
        "Landroidx/lifecycle/s;",
        "source",
        "Landroidx/lifecycle/l$a;",
        "event",
        "",
        "g",
        "(Landroidx/lifecycle/s;Landroidx/lifecycle/l$a;)V",
        "close",
        "()V",
        "activity"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic a:Lo4/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo4/e<",
            "*>;"
        }
    .end annotation
.end field

.field public final synthetic b:Le/m0;

.field public final synthetic c:Le/p0;

.field public final synthetic d:Landroidx/lifecycle/l;


# direct methods
.method public constructor <init>(Lo4/e;Le/m0;Le/p0;Landroidx/lifecycle/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo4/e<",
            "*>;",
            "Le/m0;",
            "Le/p0;",
            "Landroidx/lifecycle/l;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Le/p0$b;->a:Lo4/e;

    iput-object p2, p0, Le/p0$b;->b:Le/m0;

    iput-object p3, p0, Le/p0$b;->c:Le/p0;

    iput-object p4, p0, Le/p0$b;->d:Landroidx/lifecycle/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public close()V
    .locals 1

    iget-object v0, p0, Le/p0$b;->d:Landroidx/lifecycle/l;

    invoke-virtual {v0, p0}, Landroidx/lifecycle/l;->d(Landroidx/lifecycle/r;)V

    return-void
.end method

.method public g(Landroidx/lifecycle/s;Landroidx/lifecycle/l$a;)V
    .locals 4

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "event"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-boolean p1, Le/a;->b:Z

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    iget-object p1, p0, Le/p0$b;->a:Lo4/e;

    invoke-virtual {p2}, Landroidx/lifecycle/l$a;->b()Landroidx/lifecycle/l$b;

    move-result-object v1

    sget-object v2, Landroidx/lifecycle/l$b;->d:Landroidx/lifecycle/l$b;

    invoke-virtual {v1, v2}, Landroidx/lifecycle/l$b;->b(Landroidx/lifecycle/l$b;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Le/p0$b;->b:Le/m0;

    invoke-virtual {v1}, Le/m0;->isEnabled()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    :cond_0
    invoke-virtual {p1, v0}, Lo4/e;->x(Z)V

    goto :goto_0

    :cond_1
    sget-object p1, Landroidx/lifecycle/l$a;->ON_START:Landroidx/lifecycle/l$a;

    if-ne p2, p1, :cond_2

    iget-object p1, p0, Le/p0$b;->c:Le/p0;

    invoke-virtual {p1}, Le/p0;->g()Lo4/c;

    move-result-object p1

    iget-object v1, p0, Le/p0$b;->a:Lo4/e;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v1, v0, v2, v3}, Lo4/c;->b(Lo4/c;Lo4/e;IILjava/lang/Object;)V

    goto :goto_0

    :cond_2
    sget-object p1, Landroidx/lifecycle/l$a;->ON_STOP:Landroidx/lifecycle/l$a;

    if-ne p2, p1, :cond_3

    iget-object p1, p0, Le/p0$b;->a:Lo4/e;

    invoke-virtual {p1}, Lo4/e;->w()V

    :cond_3
    :goto_0
    sget-object p1, Landroidx/lifecycle/l$a;->ON_DESTROY:Landroidx/lifecycle/l$a;

    if-ne p2, p1, :cond_4

    iget-object p1, p0, Le/p0$b;->a:Lo4/e;

    invoke-virtual {p1}, Lo4/e;->w()V

    iget-object p1, p0, Le/p0$b;->d:Landroidx/lifecycle/l;

    invoke-virtual {p1, p0}, Landroidx/lifecycle/l;->d(Landroidx/lifecycle/r;)V

    :cond_4
    return-void
.end method
