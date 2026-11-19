.class public final synthetic Lno/q2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lno/e$b;

.field public final synthetic b:Lno/u2$f$f;

.field public final synthetic c:Lpo/a$b;


# direct methods
.method public synthetic constructor <init>(Lno/e$b;Lno/u2$f$f;Lpo/a$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lno/q2;->a:Lno/e$b;

    iput-object p2, p0, Lno/q2;->b:Lno/u2$f$f;

    iput-object p3, p0, Lno/q2;->c:Lpo/a$b;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lno/q2;->a:Lno/e$b;

    iget-object v1, p0, Lno/q2;->b:Lno/u2$f$f;

    iget-object v2, p0, Lno/q2;->c:Lpo/a$b;

    check-cast p1, Lln/r$c;

    invoke-static {v0, v1, v2, p1}, Lno/u2;->x(Lno/e$b;Lno/u2$f$f;Lpo/a$b;Lln/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
