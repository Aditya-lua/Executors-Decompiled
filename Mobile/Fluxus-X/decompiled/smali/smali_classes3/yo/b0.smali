.class public final synthetic Lyo/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lln/k$a;

.field public final synthetic b:Lks/a;


# direct methods
.method public synthetic constructor <init>(Lln/k$a;Lks/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyo/b0;->a:Lln/k$a;

    iput-object p2, p0, Lyo/b0;->b:Lks/a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lyo/b0;->a:Lln/k$a;

    iget-object v1, p0, Lyo/b0;->b:Lks/a;

    check-cast p1, Lln/r$c;

    invoke-static {v0, v1, p1}, Lyo/t0;->n(Lln/k$a;Lks/a;Lln/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
