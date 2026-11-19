.class public final synthetic Ltq/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Ltq/k2;

.field public final synthetic b:Lmq/y0$b;


# direct methods
.method public synthetic constructor <init>(Ltq/k2;Lmq/y0$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltq/e;->a:Ltq/k2;

    iput-object p2, p0, Ltq/e;->b:Lmq/y0$b;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Ltq/e;->a:Ltq/k2;

    iget-object v1, p0, Ltq/e;->b:Lmq/y0$b;

    check-cast p1, Lmq/c0$c;

    invoke-static {v0, v1, p1}, Ltq/k2;->q0(Ltq/k2;Lmq/y0$b;Lmq/c0$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
