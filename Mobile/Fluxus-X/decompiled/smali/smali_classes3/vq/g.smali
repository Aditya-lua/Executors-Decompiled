.class public final synthetic Lvq/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lmq/y0$f;


# direct methods
.method public synthetic constructor <init>(Lmq/y0$f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvq/g;->a:Lmq/y0$f;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lvq/g;->a:Lmq/y0$f;

    check-cast p1, Lln/r$c;

    invoke-static {v0, p1}, Lvq/j;->a(Lmq/y0$f;Lln/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
