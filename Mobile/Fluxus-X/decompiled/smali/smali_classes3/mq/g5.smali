.class public final synthetic Lmq/g5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lmq/y0$r;


# direct methods
.method public synthetic constructor <init>(Lmq/y0$r;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmq/g5;->a:Lmq/y0$r;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lmq/g5;->a:Lmq/y0$r;

    check-cast p1, Lln/r$c;

    invoke-static {v0, p1}, Lmq/q5;->X(Lmq/y0$r;Lln/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
