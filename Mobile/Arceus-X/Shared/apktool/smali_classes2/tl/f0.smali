.class public final synthetic Ltl/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lul/a;

.field public final synthetic b:Lkotlin/jvm/internal/y;

.field public final synthetic c:Ltl/d0;

.field public final synthetic d:Lmm/m;


# direct methods
.method public synthetic constructor <init>(Lul/a;Lkotlin/jvm/internal/y;Ltl/d0;Lmm/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltl/f0;->a:Lul/a;

    iput-object p2, p0, Ltl/f0;->b:Lkotlin/jvm/internal/y;

    iput-object p3, p0, Ltl/f0;->c:Ltl/d0;

    iput-object p4, p0, Ltl/f0;->d:Lmm/m;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Ltl/f0;->a:Lul/a;

    iget-object v1, p0, Ltl/f0;->b:Lkotlin/jvm/internal/y;

    iget-object v2, p0, Ltl/f0;->c:Ltl/d0;

    iget-object v3, p0, Ltl/f0;->d:Lmm/m;

    invoke-static {v0, v1, v2, v3}, Ltl/d0$c;->b(Lul/a;Lkotlin/jvm/internal/y;Ltl/d0;Lmm/m;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
