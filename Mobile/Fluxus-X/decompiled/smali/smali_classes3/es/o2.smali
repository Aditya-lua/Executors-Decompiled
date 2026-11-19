.class public final synthetic Les/o2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Les/s6$d$a;

.field public final synthetic b:Les/h4;

.field public final synthetic c:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Les/s6$d$a;Les/h4;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Les/o2;->a:Les/s6$d$a;

    iput-object p2, p0, Les/o2;->b:Les/h4;

    iput-object p3, p0, Les/o2;->c:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Les/o2;->a:Les/s6$d$a;

    iget-object v1, p0, Les/o2;->b:Les/h4;

    iget-object v2, p0, Les/o2;->c:Ljava/util/List;

    check-cast p1, Lqr/d6;

    invoke-static {v0, v1, v2, p1}, Les/h4;->k(Les/s6$d$a;Les/h4;Ljava/util/List;Lqr/d6;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
