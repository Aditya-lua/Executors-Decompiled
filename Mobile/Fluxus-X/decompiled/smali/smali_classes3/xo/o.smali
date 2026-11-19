.class public final synthetic Lxo/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lxo/u;

.field public final synthetic b:Lvo/y3$b;

.field public final synthetic c:Landroidx/lifecycle/m;


# direct methods
.method public synthetic constructor <init>(Lxo/u;Lvo/y3$b;Landroidx/lifecycle/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxo/o;->a:Lxo/u;

    iput-object p2, p0, Lxo/o;->b:Lvo/y3$b;

    iput-object p3, p0, Lxo/o;->c:Landroidx/lifecycle/m;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lxo/o;->a:Lxo/u;

    iget-object v1, p0, Lxo/o;->b:Lvo/y3$b;

    iget-object v2, p0, Lxo/o;->c:Landroidx/lifecycle/m;

    invoke-static {v0, v1, v2}, Lxo/u;->d(Lxo/u;Lvo/y3$b;Landroidx/lifecycle/m;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
