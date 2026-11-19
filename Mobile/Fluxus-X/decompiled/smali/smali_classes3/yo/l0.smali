.class public final synthetic Lyo/l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lks/a;


# direct methods
.method public synthetic constructor <init>(Lks/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyo/l0;->a:Lks/a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lyo/l0;->a:Lks/a;

    check-cast p1, Lln/r$c;

    invoke-static {v0, p1}, Lyo/t0;->t(Lks/a;Lln/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
