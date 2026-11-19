.class public final synthetic Lmq/m1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lmq/q5;

.field public final synthetic b:Lmq/y0$m;

.field public final synthetic c:Lmq/b0$b;


# direct methods
.method public synthetic constructor <init>(Lmq/q5;Lmq/y0$m;Lmq/b0$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmq/m1;->a:Lmq/q5;

    iput-object p2, p0, Lmq/m1;->b:Lmq/y0$m;

    iput-object p3, p0, Lmq/m1;->c:Lmq/b0$b;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lmq/m1;->a:Lmq/q5;

    iget-object v1, p0, Lmq/m1;->b:Lmq/y0$m;

    iget-object v2, p0, Lmq/m1;->c:Lmq/b0$b;

    check-cast p1, Lln/r$c;

    invoke-static {v0, v1, v2, p1}, Lmq/q5;->x0(Lmq/q5;Lmq/y0$m;Lmq/b0$b;Lln/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
