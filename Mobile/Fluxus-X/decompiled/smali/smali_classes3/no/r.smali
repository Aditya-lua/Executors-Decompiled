.class public final synthetic Lno/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lno/u2$d$c;


# direct methods
.method public synthetic constructor <init>(Lno/u2$d$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lno/r;->a:Lno/u2$d$c;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lno/r;->a:Lno/u2$d$c;

    check-cast p1, Lno/e;

    invoke-static {v0, p1}, Lno/v;->c(Lno/u2$d$c;Lno/e;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
