.class public final synthetic Lhs/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lhs/g1;

.field public final synthetic b:Les/i4;

.field public final synthetic c:Les/s6$b;


# direct methods
.method public synthetic constructor <init>(Lhs/g1;Les/i4;Les/s6$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhs/j0;->a:Lhs/g1;

    iput-object p2, p0, Lhs/j0;->b:Les/i4;

    iput-object p3, p0, Lhs/j0;->c:Les/s6$b;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lhs/j0;->a:Lhs/g1;

    iget-object v1, p0, Lhs/j0;->b:Les/i4;

    iget-object v2, p0, Lhs/j0;->c:Les/s6$b;

    invoke-static {v0, v1, v2}, Lhs/g1;->k(Lhs/g1;Les/i4;Les/s6$b;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
