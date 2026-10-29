.class public final synthetic Ltl/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lmm/m;

.field public final synthetic b:Ljava/lang/Boolean;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lmm/m;Ljava/lang/Boolean;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltl/t;->a:Lmm/m;

    iput-object p2, p0, Ltl/t;->b:Ljava/lang/Boolean;

    iput-object p3, p0, Ltl/t;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Ltl/t;->a:Lmm/m;

    iget-object v1, p0, Ltl/t;->b:Ljava/lang/Boolean;

    iget-object v2, p0, Ltl/t;->c:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ltl/d0;->d(Lmm/m;Ljava/lang/Boolean;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
