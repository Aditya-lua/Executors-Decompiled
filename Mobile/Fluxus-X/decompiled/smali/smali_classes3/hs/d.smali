.class public final synthetic Lhs/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lls/g;

.field public final synthetic b:Les/i4$a;

.field public final synthetic c:Lqr/x5;


# direct methods
.method public synthetic constructor <init>(Lls/g;Les/i4$a;Lqr/x5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhs/d;->a:Lls/g;

    iput-object p2, p0, Lhs/d;->b:Les/i4$a;

    iput-object p3, p0, Lhs/d;->c:Lqr/x5;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lhs/d;->a:Lls/g;

    iget-object v1, p0, Lhs/d;->b:Les/i4$a;

    iget-object v2, p0, Lhs/d;->c:Lqr/x5;

    check-cast p1, Lsr/i;

    invoke-static {v0, v1, v2, p1}, Lhs/e0;->r(Lls/g;Les/i4$a;Lqr/x5;Lsr/i;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
