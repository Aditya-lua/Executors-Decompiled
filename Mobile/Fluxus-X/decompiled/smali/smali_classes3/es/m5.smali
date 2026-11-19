.class public final synthetic Les/m5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Les/i4;

.field public final synthetic b:Lqr/g0;


# direct methods
.method public synthetic constructor <init>(Les/i4;Lqr/g0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Les/m5;->a:Les/i4;

    iput-object p2, p0, Les/m5;->b:Lqr/g0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Les/m5;->a:Les/i4;

    iget-object v1, p0, Les/m5;->b:Lqr/g0;

    check-cast p1, Lln/r$c;

    invoke-static {v0, v1, p1}, Les/s6;->N(Les/i4;Lqr/g0;Lln/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
