.class public final Lch/i$g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhm/j;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lch/i$g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "ch/i$g$a",
        "Lhm/j;",
        "",
        "queryInfo",
        "",
        "onSuccess",
        "(Ljava/lang/String;)V",
        "Lim/a;",
        "error",
        "a",
        "(Lim/a;)V",
        "NativeShell_googleProdRelease"
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
.field public final synthetic a:Lch/i;

.field public final synthetic b:Z

.field public final synthetic c:I


# direct methods
.method public constructor <init>(Lch/i;ZI)V
    .locals 0

    iput-object p1, p0, Lch/i$g$a;->a:Lch/i;

    iput-boolean p2, p0, Lch/i$g$a;->b:Z

    iput p3, p0, Lch/i$g$a;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lim/a;)V
    .locals 7

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, p0, Lch/i$g$a;->a:Lch/i;

    new-instance v1, Lch/i$g$a$a;

    iget-boolean v2, p0, Lch/i$g$a;->b:Z

    iget v5, p0, Lch/i$g$a;->c:I

    const/4 v6, 0x0

    move-object v3, p1

    invoke-direct/range {v1 .. v6}, Lch/i$g$a$a;-><init>(ZLim/a;Lch/i;ILeu/b;)V

    invoke-static {v4, v1}, Lch/i;->c(Lch/i;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public onSuccess(Ljava/lang/String;)V
    .locals 6

    iget-object v2, p0, Lch/i$g$a;->a:Lch/i;

    new-instance v0, Lch/i$g$a$b;

    iget-boolean v1, p0, Lch/i$g$a;->b:Z

    iget v3, p0, Lch/i$g$a;->c:I

    const/4 v5, 0x0

    move-object v4, p1

    invoke-direct/range {v0 .. v5}, Lch/i$g$a$b;-><init>(ZLch/i;ILjava/lang/String;Leu/b;)V

    invoke-static {v2, v0}, Lch/i;->c(Lch/i;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method
