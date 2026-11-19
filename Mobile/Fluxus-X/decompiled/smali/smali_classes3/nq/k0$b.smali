.class public final Lnq/k0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsn/z;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnq/k0;->D(Lmq/q5$d$a;Z)Lsn/i;
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
        "nq/k0$b",
        "Lsn/z;",
        "",
        "a",
        "()V",
        "selfie_release"
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
.field public final synthetic a:Lnq/k0;

.field public final synthetic b:Lmq/q5$d$a;

.field public final synthetic c:Z


# direct methods
.method public constructor <init>(Lnq/k0;Lmq/q5$d$a;Z)V
    .locals 0

    iput-object p1, p0, Lnq/k0$b;->a:Lnq/k0;

    iput-object p2, p0, Lnq/k0$b;->b:Lmq/q5$d$a;

    iput-boolean p3, p0, Lnq/k0$b;->c:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic b(Lmq/q5$d$a;Lsn/k;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lnq/k0$b;->c(Lmq/q5$d$a;Lsn/k;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lmq/q5$d$a;Lsn/k;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lmq/q5$d$a;->r()Lkotlin/jvm/functions/Function1;

    move-result-object p0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public a()V
    .locals 8

    iget-object v0, p0, Lnq/k0$b;->a:Lnq/k0;

    invoke-static {v0}, Lnq/k0;->p(Lnq/k0;)Lsn/t;

    move-result-object v1

    iget-object v0, p0, Lnq/k0$b;->a:Lnq/k0;

    invoke-static {v0}, Lnq/k0;->w(Lnq/k0;)Lnq/r0;

    move-result-object v0

    invoke-interface {v0}, Lnq/r0;->k()Landroidx/camera/view/PreviewView;

    move-result-object v2

    iget-object v0, p0, Lnq/k0$b;->a:Lnq/k0;

    iget-object v3, p0, Lnq/k0$b;->b:Lmq/q5$d$a;

    invoke-virtual {v3}, Lmq/q5$d$a;->j()Lsn/v$b;

    move-result-object v3

    invoke-static {v0, v3}, Lnq/k0;->B(Lnq/k0;Lsn/v$b;)Lsn/t$a;

    move-result-object v3

    iget-object v0, p0, Lnq/k0$b;->a:Lnq/k0;

    invoke-static {v0}, Lnq/k0;->u(Lnq/k0;)Lsn/b1;

    move-result-object v4

    iget-boolean v6, p0, Lnq/k0$b;->c:Z

    iget-object v0, p0, Lnq/k0$b;->b:Lmq/q5$d$a;

    new-instance v7, Lnq/l0;

    invoke-direct {v7, v0}, Lnq/l0;-><init>(Lmq/q5$d$a;)V

    const/4 v5, 0x1

    invoke-virtual/range {v1 .. v7}, Lsn/t;->f(Landroidx/camera/view/PreviewView;Lsn/t$a;Lg0/u0$a;ZZLkotlin/jvm/functions/Function1;)V

    return-void
.end method
