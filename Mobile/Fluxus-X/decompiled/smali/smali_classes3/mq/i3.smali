.class public final synthetic Lmq/i3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lrq/a;

.field public final synthetic b:Lxn/a;

.field public final synthetic c:Lln/k$a;

.field public final synthetic d:Lmq/q5;

.field public final synthetic e:Lmq/y0$b;


# direct methods
.method public synthetic constructor <init>(Lrq/a;Lxn/a;Lln/k$a;Lmq/q5;Lmq/y0$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmq/i3;->a:Lrq/a;

    iput-object p2, p0, Lmq/i3;->b:Lxn/a;

    iput-object p3, p0, Lmq/i3;->c:Lln/k$a;

    iput-object p4, p0, Lmq/i3;->d:Lmq/q5;

    iput-object p5, p0, Lmq/i3;->e:Lmq/y0$b;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lmq/i3;->a:Lrq/a;

    iget-object v1, p0, Lmq/i3;->b:Lxn/a;

    iget-object v2, p0, Lmq/i3;->c:Lln/k$a;

    iget-object v3, p0, Lmq/i3;->d:Lmq/q5;

    iget-object v4, p0, Lmq/i3;->e:Lmq/y0$b;

    move-object v5, p1

    check-cast v5, Ljava/lang/String;

    invoke-static/range {v0 .. v5}, Lmq/q5;->n(Lrq/a;Lxn/a;Lln/k$a;Lmq/q5;Lmq/y0$b;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
