.class public final synthetic Lqo/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lno/u2$d$b;


# direct methods
.method public synthetic constructor <init>(Lno/u2$d$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqo/h;->a:Lno/u2$d$b;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lqo/h;->a:Lno/u2$d$b;

    invoke-static {v0}, Lqo/j;->b(Lno/u2$d$b;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
