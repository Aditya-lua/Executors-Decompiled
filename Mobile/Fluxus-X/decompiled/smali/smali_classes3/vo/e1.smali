.class public final synthetic Lvo/e1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lvo/j0;


# direct methods
.method public synthetic constructor <init>(Lvo/j0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvo/e1;->a:Lvo/j0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lvo/e1;->a:Lvo/j0;

    check-cast p1, Lln/r$c;

    invoke-static {v0, p1}, Lvo/d2;->r(Lvo/j0;Lln/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
