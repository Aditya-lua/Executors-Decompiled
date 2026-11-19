.class public final synthetic Lhs/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpu/n;


# instance fields
.field public final synthetic a:Lhs/g1;

.field public final synthetic b:Les/i4;

.field public final synthetic c:Les/s6$b;


# direct methods
.method public synthetic constructor <init>(Lhs/g1;Les/i4;Les/s6$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhs/h0;->a:Lhs/g1;

    iput-object p2, p0, Lhs/h0;->b:Les/i4;

    iput-object p3, p0, Lhs/h0;->c:Les/s6$b;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lhs/h0;->a:Lhs/g1;

    iget-object v1, p0, Lhs/h0;->b:Les/i4;

    iget-object v2, p0, Lhs/h0;->c:Les/s6$b;

    move-object v3, p1

    check-cast v3, Lqr/x5;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    move-object v5, p3

    check-cast v5, Ljava/util/Map;

    invoke-static/range {v0 .. v5}, Lhs/g1;->i(Lhs/g1;Les/i4;Les/s6$b;Lqr/x5;ZLjava/util/Map;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
