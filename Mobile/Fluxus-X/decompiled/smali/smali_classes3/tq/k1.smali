.class public final synthetic Ltq/k1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Ltq/k2;

.field public final synthetic b:Lmq/y0$k;


# direct methods
.method public synthetic constructor <init>(Ltq/k2;Lmq/y0$k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltq/k1;->a:Ltq/k2;

    iput-object p2, p0, Ltq/k1;->b:Lmq/y0$k;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Ltq/k1;->a:Ltq/k2;

    iget-object v1, p0, Ltq/k1;->b:Lmq/y0$k;

    invoke-static {v0, v1}, Ltq/k2;->h(Ltq/k2;Lmq/y0$k;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
