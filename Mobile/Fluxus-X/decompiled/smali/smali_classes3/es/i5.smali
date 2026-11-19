.class public final synthetic Les/i5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Ljava/util/Map;

.field public final synthetic b:Lqr/x5;

.field public final synthetic c:Les/s6;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Map;Lqr/x5;Les/s6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Les/i5;->a:Ljava/util/Map;

    iput-object p2, p0, Les/i5;->b:Lqr/x5;

    iput-object p3, p0, Les/i5;->c:Les/s6;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Les/i5;->a:Ljava/util/Map;

    iget-object v1, p0, Les/i5;->b:Lqr/x5;

    iget-object v2, p0, Les/i5;->c:Les/s6;

    check-cast p1, Lln/r$c;

    invoke-static {v0, v1, v2, p1}, Les/s6;->A(Ljava/util/Map;Lqr/x5;Les/s6;Lln/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
