.class public final synthetic Lxo/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lxo/m;

.field public final synthetic b:Lqr/z5;

.field public final synthetic c:Lap/b;


# direct methods
.method public synthetic constructor <init>(Lxo/m;Lqr/z5;Lap/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxo/a;->a:Lxo/m;

    iput-object p2, p0, Lxo/a;->b:Lqr/z5;

    iput-object p3, p0, Lxo/a;->c:Lap/b;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lxo/a;->a:Lxo/m;

    iget-object v1, p0, Lxo/a;->b:Lqr/z5;

    iget-object v2, p0, Lxo/a;->c:Lap/b;

    invoke-static {v0, v1, v2}, Lxo/m;->l(Lxo/m;Lqr/z5;Lap/b;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
