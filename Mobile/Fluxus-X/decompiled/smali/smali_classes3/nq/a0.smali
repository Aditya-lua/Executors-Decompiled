.class public final synthetic Lnq/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lmq/q5$d$a;

.field public final synthetic b:Lnq/k0;


# direct methods
.method public synthetic constructor <init>(Lmq/q5$d$a;Lnq/k0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnq/a0;->a:Lmq/q5$d$a;

    iput-object p2, p0, Lnq/a0;->b:Lnq/k0;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lnq/a0;->a:Lmq/q5$d$a;

    iget-object v1, p0, Lnq/a0;->b:Lnq/k0;

    invoke-static {v0, v1}, Lnq/k0;->i(Lmq/q5$d$a;Lnq/k0;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
