.class public final synthetic Lno/c2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lno/u2$a;


# direct methods
.method public synthetic constructor <init>(Lno/u2$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lno/c2;->a:Lno/u2$a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lno/c2;->a:Lno/u2$a;

    check-cast p1, Lln/r$c;

    invoke-static {v0, p1}, Lno/u2;->L(Lno/u2$a;Lln/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
