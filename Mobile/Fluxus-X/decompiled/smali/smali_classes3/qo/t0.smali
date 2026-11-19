.class public final synthetic Lqo/t0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lqo/e1;

.field public final synthetic b:Lno/u2$f$f;

.field public final synthetic c:Lno/e$a;

.field public final synthetic d:Lno/u2$b;


# direct methods
.method public synthetic constructor <init>(Lqo/e1;Lno/u2$f$f;Lno/e$a;Lno/u2$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqo/t0;->a:Lqo/e1;

    iput-object p2, p0, Lqo/t0;->b:Lno/u2$f$f;

    iput-object p3, p0, Lqo/t0;->c:Lno/e$a;

    iput-object p4, p0, Lqo/t0;->d:Lno/u2$b;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lqo/t0;->a:Lqo/e1;

    iget-object v1, p0, Lqo/t0;->b:Lno/u2$f$f;

    iget-object v2, p0, Lqo/t0;->c:Lno/e$a;

    iget-object v3, p0, Lqo/t0;->d:Lno/u2$b;

    invoke-static {v0, v1, v2, v3, p1}, Lqo/e1;->p(Lqo/e1;Lno/u2$f$f;Lno/e$a;Lno/u2$b;Ljava/lang/Object;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
