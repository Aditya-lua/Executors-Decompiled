.class public final synthetic Lhs/m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lqr/g0;

.field public final synthetic b:Lhs/g1;

.field public final synthetic c:Les/i4;


# direct methods
.method public synthetic constructor <init>(Lqr/g0;Lhs/g1;Les/i4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhs/m0;->a:Lqr/g0;

    iput-object p2, p0, Lhs/m0;->b:Lhs/g1;

    iput-object p3, p0, Lhs/m0;->c:Les/i4;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lhs/m0;->a:Lqr/g0;

    iget-object v1, p0, Lhs/m0;->b:Lhs/g1;

    iget-object v2, p0, Lhs/m0;->c:Les/i4;

    invoke-static {v0, v1, v2}, Lhs/g1;->g(Lqr/g0;Lhs/g1;Les/i4;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
