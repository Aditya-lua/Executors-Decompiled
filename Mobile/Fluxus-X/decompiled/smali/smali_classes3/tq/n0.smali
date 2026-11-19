.class public final synthetic Ltq/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lrq/a;

.field public final synthetic b:Ltq/k2;

.field public final synthetic c:Lmq/y0$m;


# direct methods
.method public synthetic constructor <init>(Lrq/a;Ltq/k2;Lmq/y0$m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltq/n0;->a:Lrq/a;

    iput-object p2, p0, Ltq/n0;->b:Ltq/k2;

    iput-object p3, p0, Ltq/n0;->c:Lmq/y0$m;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Ltq/n0;->a:Lrq/a;

    iget-object v1, p0, Ltq/n0;->b:Ltq/k2;

    iget-object v2, p0, Ltq/n0;->c:Lmq/y0$m;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, v1, v2, p1}, Ltq/k2;->E0(Lrq/a;Ltq/k2;Lmq/y0$m;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
