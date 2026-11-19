.class public final synthetic Ltq/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Ltq/k2;

.field public final synthetic b:Lmq/q5$b;

.field public final synthetic c:Lmq/y0$g;


# direct methods
.method public synthetic constructor <init>(Ltq/k2;Lmq/q5$b;Lmq/y0$g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltq/k;->a:Ltq/k2;

    iput-object p2, p0, Ltq/k;->b:Lmq/q5$b;

    iput-object p3, p0, Ltq/k;->c:Lmq/y0$g;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Ltq/k;->a:Ltq/k2;

    iget-object v1, p0, Ltq/k;->b:Lmq/q5$b;

    iget-object v2, p0, Ltq/k;->c:Lmq/y0$g;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, v1, v2, p1}, Ltq/k2;->G(Ltq/k2;Lmq/q5$b;Lmq/y0$g;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
