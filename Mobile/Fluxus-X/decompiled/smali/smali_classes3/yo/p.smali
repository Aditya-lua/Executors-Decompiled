.class public final synthetic Lyo/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcp/d;


# direct methods
.method public synthetic constructor <init>(Lcp/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyo/p;->a:Lcp/d;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lyo/p;->a:Lcp/d;

    check-cast p1, Lln/r$c;

    invoke-static {v0, p1}, Lyo/t0;->g(Lcp/d;Lln/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
