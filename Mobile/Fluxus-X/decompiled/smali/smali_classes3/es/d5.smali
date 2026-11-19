.class public final synthetic Les/d5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Les/i4;

.field public final synthetic b:Lqr/d6;

.field public final synthetic c:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(Les/i4;Lqr/d6;Ljava/util/Map;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Les/d5;->a:Les/i4;

    iput-object p2, p0, Les/d5;->b:Lqr/d6;

    iput-object p3, p0, Les/d5;->c:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Les/d5;->a:Les/i4;

    iget-object v1, p0, Les/d5;->b:Lqr/d6;

    iget-object v2, p0, Les/d5;->c:Ljava/util/Map;

    check-cast p1, Lln/r$c;

    invoke-static {v0, v1, v2, p1}, Les/s6;->f0(Les/i4;Lqr/d6;Ljava/util/Map;Lln/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
