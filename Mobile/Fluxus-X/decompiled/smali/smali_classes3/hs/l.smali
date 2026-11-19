.class public final synthetic Lhs/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lls/g;

.field public final synthetic b:Lqr/x5;


# direct methods
.method public synthetic constructor <init>(Lls/g;Lqr/x5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhs/l;->a:Lls/g;

    iput-object p2, p0, Lhs/l;->b:Lqr/x5;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lhs/l;->a:Lls/g;

    iget-object v1, p0, Lhs/l;->b:Lqr/x5;

    invoke-static {v0, v1, p1}, Lhs/e0;->t(Lls/g;Lqr/x5;Ljava/lang/Object;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
