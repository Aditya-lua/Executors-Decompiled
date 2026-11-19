.class public final synthetic Lmq/x4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lmq/q5$c;


# direct methods
.method public synthetic constructor <init>(Lmq/q5$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmq/x4;->a:Lmq/q5$c;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lmq/x4;->a:Lmq/q5$c;

    check-cast p1, Lln/r$c;

    invoke-static {v0, p1}, Lmq/q5;->W0(Lmq/q5$c;Lln/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
