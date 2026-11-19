.class public final synthetic Ltq/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lmq/y0$q;

.field public final synthetic b:Ltq/k2;

.field public final synthetic c:Lmq/q5$b;


# direct methods
.method public synthetic constructor <init>(Lmq/y0$q;Ltq/k2;Lmq/q5$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltq/u;->a:Lmq/y0$q;

    iput-object p2, p0, Ltq/u;->b:Ltq/k2;

    iput-object p3, p0, Ltq/u;->c:Lmq/q5$b;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Ltq/u;->a:Lmq/y0$q;

    iget-object v1, p0, Ltq/u;->b:Ltq/k2;

    iget-object v2, p0, Ltq/u;->c:Lmq/q5$b;

    check-cast p1, Ljs/b$b;

    invoke-static {v0, v1, v2, p1}, Ltq/k2;->p0(Lmq/y0$q;Ltq/k2;Lmq/q5$b;Ljs/b$b;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
