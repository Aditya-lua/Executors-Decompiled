.class public final synthetic Lqo/q0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lqo/e1;

.field public final synthetic b:Lno/u2$b;

.field public final synthetic c:Lno/u2$f;


# direct methods
.method public synthetic constructor <init>(Lqo/e1;Lno/u2$b;Lno/u2$f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqo/q0;->a:Lqo/e1;

    iput-object p2, p0, Lqo/q0;->b:Lno/u2$b;

    iput-object p3, p0, Lqo/q0;->c:Lno/u2$f;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lqo/q0;->a:Lqo/e1;

    iget-object v1, p0, Lqo/q0;->b:Lno/u2$b;

    iget-object v2, p0, Lqo/q0;->c:Lno/u2$f;

    check-cast p1, Lno/y2$c;

    invoke-static {v0, v1, v2, p1}, Lqo/e1;->w(Lqo/e1;Lno/u2$b;Lno/u2$f;Lno/y2$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
