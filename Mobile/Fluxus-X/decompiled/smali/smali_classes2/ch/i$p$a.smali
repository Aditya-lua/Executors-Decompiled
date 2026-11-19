.class public final Lch/i$p$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhm/k;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lch/i$p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J!\u0010\r\u001a\u00020\u00062\u0008\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0017"
    }
    d2 = {
        "ch/i$p$a",
        "Lhm/k;",
        "Ljm/c;",
        "status",
        "",
        "watchDuration",
        "",
        "d",
        "(Ljm/c;F)V",
        "",
        "gmaAdType",
        "",
        "isEndCardVisible",
        "c",
        "(Ljava/lang/String;Z)V",
        "Ljm/b;",
        "progressData",
        "a",
        "(Ljm/b;)V",
        "reasonKey",
        "description",
        "b",
        "(Ljava/lang/String;Ljava/lang/String;)V",
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

.field public final synthetic b:I


# direct methods
.method public constructor <init>(Lch/i;I)V
    .locals 0

    iput-object p1, p0, Lch/i$p$a;->a:Lch/i;

    iput p2, p0, Lch/i$p$a;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljm/b;)V
    .locals 3

    const-string v0, "progressData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lch/i$p$a;->a:Lch/i;

    new-instance v1, Lch/i$p$a$a;

    const/4 v2, 0x0

    invoke-direct {v1, v0, p1, v2}, Lch/i$p$a$a;-><init>(Lch/i;Ljm/b;Leu/b;)V

    invoke-static {v0, v1}, Lch/i;->c(Lch/i;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    const-string v0, "reasonKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "description"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lch/i$p$a;->a:Lch/i;

    new-instance v1, Lch/i$p$a$d;

    const/4 v2, 0x0

    invoke-direct {v1, v0, p1, p2, v2}, Lch/i$p$a$d;-><init>(Lch/i;Ljava/lang/String;Ljava/lang/String;Leu/b;)V

    invoke-static {v0, v1}, Lch/i;->c(Lch/i;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public c(Ljava/lang/String;Z)V
    .locals 3

    iget-object v0, p0, Lch/i$p$a;->a:Lch/i;

    new-instance v1, Lch/i$p$a$b;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v0, p2, v2}, Lch/i$p$a$b;-><init>(Ljava/lang/String;Lch/i;ZLeu/b;)V

    invoke-static {v0, v1}, Lch/i;->c(Lch/i;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public d(Ljm/c;F)V
    .locals 7

    const-string v0, "status"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lch/i$p$a;->a:Lch/i;

    new-instance v1, Lch/i$p$a$c;

    iget v3, p0, Lch/i$p$a;->b:I

    const/4 v6, 0x0

    move-object v4, p1

    move v5, p2

    invoke-direct/range {v1 .. v6}, Lch/i$p$a$c;-><init>(Lch/i;ILjm/c;FLeu/b;)V

    invoke-static {v2, v1}, Lch/i;->c(Lch/i;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method
