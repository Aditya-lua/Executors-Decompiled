.class public final synthetic Lyo/c;
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

    iput-object p1, p0, Lyo/c;->a:Lvo/j0$n;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lyo/c;->a:Lvo/j0$n;

    check-cast p1, Lkotlin/Unit;

    invoke-static {v0, p1}, Lyo/t0;->f(Lvo/j0$n;Lkotlin/Unit;)Lln/r;

    move-result-object p1

    return-object p1
.end method
