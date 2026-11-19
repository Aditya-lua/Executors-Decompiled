.class public final synthetic Ltq/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lav/p0;

.field public final synthetic b:Ltq/k2;


# direct methods
.method public synthetic constructor <init>(Lav/p0;Ltq/k2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltq/a;->a:Lav/p0;

    iput-object p2, p0, Ltq/a;->b:Ltq/k2;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Ltq/a;->a:Lav/p0;

    iget-object v1, p0, Ltq/a;->b:Ltq/k2;

    check-cast p1, Lmq/y0;

    invoke-static {v0, v1, p1}, Ltq/k2;->N(Lav/p0;Ltq/k2;Lmq/y0;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
