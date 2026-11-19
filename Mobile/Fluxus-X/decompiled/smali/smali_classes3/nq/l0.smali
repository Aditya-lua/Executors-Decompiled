.class public final synthetic Lnq/l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lmq/q5$d$a;


# direct methods
.method public synthetic constructor <init>(Lmq/q5$d$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnq/l0;->a:Lmq/q5$d$a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lnq/l0;->a:Lmq/q5$d$a;

    check-cast p1, Lsn/k;

    invoke-static {v0, p1}, Lnq/k0$b;->b(Lmq/q5$d$a;Lsn/k;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
