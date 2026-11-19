.class public final synthetic Lqo/y0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lqo/e1;

.field public final synthetic b:Lno/u2$f;


# direct methods
.method public synthetic constructor <init>(Lqo/e1;Lno/u2$f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqo/y0;->a:Lqo/e1;

    iput-object p2, p0, Lqo/y0;->b:Lno/u2$f;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lqo/y0;->a:Lqo/e1;

    iget-object v1, p0, Lqo/y0;->b:Lno/u2$f;

    invoke-static {v0, v1}, Lqo/e1;->F(Lqo/e1;Lno/u2$f;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
