.class public final synthetic Lvo/e2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lvo/d2;


# direct methods
.method public synthetic constructor <init>(Lvo/d2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvo/e2;->a:Lvo/d2;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lvo/e2;->a:Lvo/d2;

    check-cast p1, Lln/r$c;

    invoke-static {v0, p1}, Lvo/d2$e;->m(Lvo/d2;Lln/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
