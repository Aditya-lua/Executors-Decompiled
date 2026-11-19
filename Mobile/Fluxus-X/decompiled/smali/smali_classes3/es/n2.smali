.class public final synthetic Les/n2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Les/s6$d$a;

.field public final synthetic b:Les/h4;

.field public final synthetic c:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Les/s6$d$a;Les/h4;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Les/n2;->a:Les/s6$d$a;

    iput-object p2, p0, Les/n2;->b:Les/h4;

    iput-object p3, p0, Les/n2;->c:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Les/n2;->a:Les/s6$d$a;

    iget-object v1, p0, Les/n2;->b:Les/h4;

    iget-object v2, p0, Les/n2;->c:Ljava/util/List;

    check-cast p1, Lqr/x5;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-static {v0, v1, v2, p1, p2}, Les/h4;->V(Les/s6$d$a;Les/h4;Ljava/util/List;Lqr/x5;Z)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
