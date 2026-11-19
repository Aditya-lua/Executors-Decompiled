.class public final synthetic Lvo/m1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lvo/d2;

.field public final synthetic b:Lln/k$a;

.field public final synthetic c:Lvo/j$a;


# direct methods
.method public synthetic constructor <init>(Lvo/d2;Lln/k$a;Lvo/j$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvo/m1;->a:Lvo/d2;

    iput-object p2, p0, Lvo/m1;->b:Lln/k$a;

    iput-object p3, p0, Lvo/m1;->c:Lvo/j$a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lvo/m1;->a:Lvo/d2;

    iget-object v1, p0, Lvo/m1;->b:Lln/k$a;

    iget-object v2, p0, Lvo/m1;->c:Lvo/j$a;

    check-cast p1, Lln/r$c;

    invoke-static {v0, v1, v2, p1}, Lvo/d2;->p(Lvo/d2;Lln/k$a;Lvo/j$a;Lln/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
