.class public final synthetic Lhs/s0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Les/i4$b;

.field public final synthetic b:Lhs/g1;

.field public final synthetic c:Les/i4$a;


# direct methods
.method public synthetic constructor <init>(Les/i4$b;Lhs/g1;Les/i4$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhs/s0;->a:Les/i4$b;

    iput-object p2, p0, Lhs/s0;->b:Lhs/g1;

    iput-object p3, p0, Lhs/s0;->c:Les/i4$a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lhs/s0;->a:Les/i4$b;

    iget-object v1, p0, Lhs/s0;->b:Lhs/g1;

    iget-object v2, p0, Lhs/s0;->c:Les/i4$a;

    check-cast p1, Les/o1$b;

    invoke-static {v0, v1, v2, p1}, Lhs/g1;->z(Les/i4$b;Lhs/g1;Les/i4$a;Les/o1$b;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
