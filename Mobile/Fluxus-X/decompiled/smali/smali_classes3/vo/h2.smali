.class public final synthetic Lvo/h2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lfq/n1$a;

.field public final synthetic b:Lln/k$a;


# direct methods
.method public synthetic constructor <init>(Lfq/n1$a;Lln/k$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvo/h2;->a:Lfq/n1$a;

    iput-object p2, p0, Lvo/h2;->b:Lln/k$a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lvo/h2;->a:Lfq/n1$a;

    iget-object v1, p0, Lvo/h2;->b:Lln/k$a;

    check-cast p1, Lln/r$c;

    invoke-static {v0, v1, p1}, Lvo/b3;->r(Lfq/n1$a;Lln/k$a;Lln/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
