.class public final synthetic Ltq/c1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lls/g;

.field public final synthetic b:Lmq/q5$b;

.field public final synthetic c:Lmq/y0$f;


# direct methods
.method public synthetic constructor <init>(Lls/g;Lmq/q5$b;Lmq/y0$f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltq/c1;->a:Lls/g;

    iput-object p2, p0, Ltq/c1;->b:Lmq/q5$b;

    iput-object p3, p0, Ltq/c1;->c:Lmq/y0$f;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Ltq/c1;->a:Lls/g;

    iget-object v1, p0, Ltq/c1;->b:Lmq/q5$b;

    iget-object v2, p0, Ltq/c1;->c:Lmq/y0$f;

    invoke-static {v0, v1, v2}, Ltq/k2;->i0(Lls/g;Lmq/q5$b;Lmq/y0$f;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
