.class public final synthetic Ltl/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/BiConsumer;


# instance fields
.field public final synthetic a:Ltl/d0;

.field public final synthetic b:Lmm/m;


# direct methods
.method public synthetic constructor <init>(Ltl/d0;Lmm/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltl/s;->a:Ltl/d0;

    iput-object p2, p0, Ltl/s;->b:Lmm/m;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Ltl/s;->a:Ltl/d0;

    iget-object v1, p0, Ltl/s;->b:Lmm/m;

    check-cast p1, Ljava/lang/Boolean;

    check-cast p2, Ljava/lang/String;

    invoke-static {v0, v1, p1, p2}, Ltl/d0;->a(Ltl/d0;Lmm/m;Ljava/lang/Boolean;Ljava/lang/String;)V

    return-void
.end method
