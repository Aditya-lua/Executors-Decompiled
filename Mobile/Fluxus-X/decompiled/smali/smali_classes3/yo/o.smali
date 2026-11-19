.class public final synthetic Lyo/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lvo/j0$n;


# direct methods
.method public synthetic constructor <init>(Lvo/j0$n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyo/o;->a:Lvo/j0$n;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lyo/o;->a:Lvo/j0$n;

    check-cast p1, Lln/r$c;

    invoke-static {v0, p1}, Lyo/t0;->q(Lvo/j0$n;Lln/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
