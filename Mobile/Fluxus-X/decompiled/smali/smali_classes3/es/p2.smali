.class public final synthetic Les/p2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Les/s6$d$a;

.field public final synthetic b:Lqr/g5;


# direct methods
.method public synthetic constructor <init>(Les/s6$d$a;Lqr/g5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Les/p2;->a:Les/s6$d$a;

    iput-object p2, p0, Les/p2;->b:Lqr/g5;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Les/p2;->a:Les/s6$d$a;

    iget-object v1, p0, Les/p2;->b:Lqr/g5;

    check-cast p1, Lqr/x5;

    invoke-static {v0, v1, p1}, Les/h4;->B(Les/s6$d$a;Lqr/g5;Lqr/x5;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
