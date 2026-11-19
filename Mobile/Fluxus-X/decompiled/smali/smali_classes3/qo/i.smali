.class public final synthetic Lqo/i;
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

    iput-object p1, p0, Lqo/i;->a:Lno/u2$d$b;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lqo/i;->a:Lno/u2$d$b;

    invoke-static {v0}, Lqo/j;->a(Lno/u2$d$b;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
