.class public final synthetic Lvo/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lvo/y3$e;


# direct methods
.method public synthetic constructor <init>(Lvo/y3$e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvo/s;->a:Lvo/y3$e;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lvo/s;->a:Lvo/y3$e;

    check-cast p1, Lvo/d3;

    invoke-static {v0, p1}, Lvo/w;->b(Lvo/y3$e;Lvo/d3;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
