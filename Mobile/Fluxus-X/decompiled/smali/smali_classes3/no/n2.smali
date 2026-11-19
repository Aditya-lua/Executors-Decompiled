.class public final synthetic Lno/n2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lno/y2$c;

.field public final synthetic b:Lno/u2$b;

.field public final synthetic c:Lno/u2;


# direct methods
.method public synthetic constructor <init>(Lno/y2$c;Lno/u2$b;Lno/u2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lno/n2;->a:Lno/y2$c;

    iput-object p2, p0, Lno/n2;->b:Lno/u2$b;

    iput-object p3, p0, Lno/n2;->c:Lno/u2;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lno/n2;->a:Lno/y2$c;

    iget-object v1, p0, Lno/n2;->b:Lno/u2$b;

    iget-object v2, p0, Lno/n2;->c:Lno/u2;

    check-cast p1, Lln/r$c;

    invoke-static {v0, v1, v2, p1}, Lno/u2;->p0(Lno/y2$c;Lno/u2$b;Lno/u2;Lln/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
