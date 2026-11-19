.class public final synthetic Lhs/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lqr/x5;

.field public final synthetic b:Lls/g;

.field public final synthetic c:Les/i4$a;


# direct methods
.method public synthetic constructor <init>(Lqr/x5;Lls/g;Les/i4$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhs/k;->a:Lqr/x5;

    iput-object p2, p0, Lhs/k;->b:Lls/g;

    iput-object p3, p0, Lhs/k;->c:Les/i4$a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lhs/k;->a:Lqr/x5;

    iget-object v1, p0, Lhs/k;->b:Lls/g;

    iget-object v2, p0, Lhs/k;->c:Les/i4$a;

    invoke-static {v0, v1, v2, p1}, Lhs/e0;->i(Lqr/x5;Lls/g;Les/i4$a;Ljava/lang/Object;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
