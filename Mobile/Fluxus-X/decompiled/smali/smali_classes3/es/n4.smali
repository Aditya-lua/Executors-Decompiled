.class public final synthetic Les/n4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Les/s6;

.field public final synthetic b:Les/s6$b;

.field public final synthetic c:Les/i4;

.field public final synthetic d:Lln/k$a;


# direct methods
.method public synthetic constructor <init>(Les/s6;Les/s6$b;Les/i4;Lln/k$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Les/n4;->a:Les/s6;

    iput-object p2, p0, Les/n4;->b:Les/s6$b;

    iput-object p3, p0, Les/n4;->c:Les/i4;

    iput-object p4, p0, Les/n4;->d:Lln/k$a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Les/n4;->a:Les/s6;

    iget-object v1, p0, Les/n4;->b:Les/s6$b;

    iget-object v2, p0, Les/n4;->c:Les/i4;

    iget-object v3, p0, Les/n4;->d:Lln/k$a;

    check-cast p1, Lqr/x5;

    invoke-static {v0, v1, v2, v3, p1}, Les/s6;->T(Les/s6;Les/s6$b;Les/i4;Lln/k$a;Lqr/x5;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
