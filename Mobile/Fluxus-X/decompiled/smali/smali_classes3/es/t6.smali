.class public final synthetic Les/t6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Les/i4;

.field public final synthetic b:Lqr/i;


# direct methods
.method public synthetic constructor <init>(Les/i4;Lqr/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Les/t6;->a:Les/i4;

    iput-object p2, p0, Les/t6;->b:Lqr/i;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Les/t6;->a:Les/i4;

    iget-object v1, p0, Les/t6;->b:Lqr/i;

    check-cast p1, Lln/r$c;

    invoke-static {v0, v1, p1}, Les/s6$g;->m(Les/i4;Lqr/i;Lln/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
