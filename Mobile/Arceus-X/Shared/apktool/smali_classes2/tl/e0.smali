.class public final synthetic Ltl/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lkotlin/jvm/internal/y;

.field public final synthetic b:Ltl/d0;

.field public final synthetic c:Lmm/m;

.field public final synthetic d:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/internal/y;Ltl/d0;Lmm/m;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltl/e0;->a:Lkotlin/jvm/internal/y;

    iput-object p2, p0, Ltl/e0;->b:Ltl/d0;

    iput-object p3, p0, Ltl/e0;->c:Lmm/m;

    iput-object p4, p0, Ltl/e0;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Ltl/e0;->a:Lkotlin/jvm/internal/y;

    iget-object v1, p0, Ltl/e0;->b:Ltl/d0;

    iget-object v2, p0, Ltl/e0;->c:Lmm/m;

    iget-object v3, p0, Ltl/e0;->d:Ljava/lang/String;

    invoke-static {v0, v1, v2, v3}, Ltl/d0$c;->c(Lkotlin/jvm/internal/y;Ltl/d0;Lmm/m;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
