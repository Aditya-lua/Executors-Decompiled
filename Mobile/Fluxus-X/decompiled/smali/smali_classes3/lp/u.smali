.class public final synthetic Llp/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Llp/v$e$a;


# direct methods
.method public synthetic constructor <init>(Llp/v$e$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llp/u;->a:Llp/v$e$a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Llp/u;->a:Llp/v$e$a;

    check-cast p1, Lln/r$c;

    invoke-static {v0, p1}, Llp/v;->n(Llp/v$e$a;Lln/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
