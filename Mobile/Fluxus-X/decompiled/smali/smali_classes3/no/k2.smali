.class public final synthetic Lno/k2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lno/c$b;

.field public final synthetic b:Lno/u2$b;


# direct methods
.method public synthetic constructor <init>(Lno/c$b;Lno/u2$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lno/k2;->a:Lno/c$b;

    iput-object p2, p0, Lno/k2;->b:Lno/u2$b;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lno/k2;->a:Lno/c$b;

    iget-object v1, p0, Lno/k2;->b:Lno/u2$b;

    check-cast p1, Lln/r$c;

    invoke-static {v0, v1, p1}, Lno/u2;->Z(Lno/c$b;Lno/u2$b;Lln/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
