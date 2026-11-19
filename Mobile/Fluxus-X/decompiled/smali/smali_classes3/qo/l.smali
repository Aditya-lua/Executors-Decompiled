.class public final synthetic Lqo/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lav/p0;

.field public final synthetic b:Lqo/e1;


# direct methods
.method public synthetic constructor <init>(Lav/p0;Lqo/e1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqo/l;->a:Lav/p0;

    iput-object p2, p0, Lqo/l;->b:Lqo/e1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lqo/l;->a:Lav/p0;

    iget-object v1, p0, Lqo/l;->b:Lqo/e1;

    check-cast p1, Lno/u2$f;

    invoke-static {v0, v1, p1}, Lqo/e1;->J(Lav/p0;Lqo/e1;Lno/u2$f;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
