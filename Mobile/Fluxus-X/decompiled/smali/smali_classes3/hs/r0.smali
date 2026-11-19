.class public final synthetic Lhs/r0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lhs/g1;

.field public final synthetic b:Les/s6$b;

.field public final synthetic c:Les/i4;


# direct methods
.method public synthetic constructor <init>(Lhs/g1;Les/s6$b;Les/i4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhs/r0;->a:Lhs/g1;

    iput-object p2, p0, Lhs/r0;->b:Les/s6$b;

    iput-object p3, p0, Lhs/r0;->c:Les/i4;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lhs/r0;->a:Lhs/g1;

    iget-object v1, p0, Lhs/r0;->b:Les/s6$b;

    iget-object v2, p0, Lhs/r0;->c:Les/i4;

    check-cast p1, Lqr/x5;

    invoke-static {v0, v1, v2, p1}, Lhs/g1;->A(Lhs/g1;Les/s6$b;Les/i4;Lqr/x5;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
