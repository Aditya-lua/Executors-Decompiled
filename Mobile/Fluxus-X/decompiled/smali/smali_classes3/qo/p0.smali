.class public final synthetic Lqo/p0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lqo/e1;

.field public final synthetic b:Lno/u2$b;


# direct methods
.method public synthetic constructor <init>(Lqo/e1;Lno/u2$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqo/p0;->a:Lqo/e1;

    iput-object p2, p0, Lqo/p0;->b:Lno/u2$b;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lqo/p0;->a:Lqo/e1;

    iget-object v1, p0, Lqo/p0;->b:Lno/u2$b;

    check-cast p1, Lno/c$b;

    invoke-static {v0, v1, p1}, Lqo/e1;->n(Lqo/e1;Lno/u2$b;Lno/c$b;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
