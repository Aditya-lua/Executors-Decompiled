.class public final synthetic Ltq/x1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lrq/a;

.field public final synthetic b:Lxn/a;

.field public final synthetic c:Ltq/k2;

.field public final synthetic d:Lmq/y0$e;


# direct methods
.method public synthetic constructor <init>(Lrq/a;Lxn/a;Ltq/k2;Lmq/y0$e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltq/x1;->a:Lrq/a;

    iput-object p2, p0, Ltq/x1;->b:Lxn/a;

    iput-object p3, p0, Ltq/x1;->c:Ltq/k2;

    iput-object p4, p0, Ltq/x1;->d:Lmq/y0$e;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Ltq/x1;->a:Lrq/a;

    iget-object v1, p0, Ltq/x1;->b:Lxn/a;

    iget-object v2, p0, Ltq/x1;->c:Ltq/k2;

    iget-object v3, p0, Ltq/x1;->d:Lmq/y0$e;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, v1, v2, v3, p1}, Ltq/k2;->n(Lrq/a;Lxn/a;Ltq/k2;Lmq/y0$e;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
