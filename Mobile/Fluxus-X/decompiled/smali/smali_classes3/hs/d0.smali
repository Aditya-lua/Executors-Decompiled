.class public final synthetic Lhs/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lls/g;

.field public final synthetic b:Les/i4$a;

.field public final synthetic c:Lqr/x5;

.field public final synthetic d:Lhs/e0;


# direct methods
.method public synthetic constructor <init>(Lls/g;Les/i4$a;Lqr/x5;Lhs/e0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhs/d0;->a:Lls/g;

    iput-object p2, p0, Lhs/d0;->b:Les/i4$a;

    iput-object p3, p0, Lhs/d0;->c:Lqr/x5;

    iput-object p4, p0, Lhs/d0;->d:Lhs/e0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lhs/d0;->a:Lls/g;

    iget-object v1, p0, Lhs/d0;->b:Les/i4$a;

    iget-object v2, p0, Lhs/d0;->c:Lqr/x5;

    iget-object v3, p0, Lhs/d0;->d:Lhs/e0;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, v1, v2, v3, p1}, Lhs/e0;->u(Lls/g;Les/i4$a;Lqr/x5;Lhs/e0;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
