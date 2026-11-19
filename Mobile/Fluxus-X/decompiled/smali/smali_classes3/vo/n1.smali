.class public final synthetic Lvo/n1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lvo/d2;

.field public final synthetic b:Lvo/j0;


# direct methods
.method public synthetic constructor <init>(Lvo/d2;Lvo/j0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvo/n1;->a:Lvo/d2;

    iput-object p2, p0, Lvo/n1;->b:Lvo/j0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lvo/n1;->a:Lvo/d2;

    iget-object v1, p0, Lvo/n1;->b:Lvo/j0;

    check-cast p1, Lln/r$c;

    invoke-static {v0, v1, p1}, Lvo/d2;->P(Lvo/d2;Lvo/j0;Lln/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
