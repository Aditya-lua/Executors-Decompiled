.class public final synthetic Les/q6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpu/n;


# instance fields
.field public final synthetic a:Les/s6;

.field public final synthetic b:Les/i4;

.field public final synthetic c:Les/s6$b;

.field public final synthetic d:Lln/k$a;


# direct methods
.method public synthetic constructor <init>(Les/s6;Les/i4;Les/s6$b;Lln/k$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Les/q6;->a:Les/s6;

    iput-object p2, p0, Les/q6;->b:Les/i4;

    iput-object p3, p0, Les/q6;->c:Les/s6$b;

    iput-object p4, p0, Les/q6;->d:Lln/k$a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Les/q6;->a:Les/s6;

    iget-object v1, p0, Les/q6;->b:Les/i4;

    iget-object v2, p0, Les/q6;->c:Les/s6$b;

    iget-object v3, p0, Les/q6;->d:Lln/k$a;

    move-object v4, p1

    check-cast v4, Lqr/x5;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    move-object v6, p3

    check-cast v6, Ljava/util/Map;

    invoke-static/range {v0 .. v6}, Les/s6;->b0(Les/s6;Les/i4;Les/s6$b;Lln/k$a;Lqr/x5;ZLjava/util/Map;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
