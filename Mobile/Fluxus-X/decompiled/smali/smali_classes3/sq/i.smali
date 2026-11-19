.class public final synthetic Lsq/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lmq/q5$d$c;


# direct methods
.method public synthetic constructor <init>(Lmq/q5$d$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsq/i;->a:Lmq/q5$d$c;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lsq/i;->a:Lmq/q5$d$c;

    check-cast p1, Lsn/k;

    invoke-static {v0, p1}, Lsq/h$e;->b(Lmq/q5$d$c;Lsn/k;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
