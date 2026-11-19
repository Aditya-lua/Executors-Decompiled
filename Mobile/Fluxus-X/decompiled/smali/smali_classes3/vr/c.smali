.class public final synthetic Lvr/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lqr/i2;

.field public final synthetic b:Lkotlin/jvm/internal/c0;

.field public final synthetic c:Lvr/j;


# direct methods
.method public synthetic constructor <init>(Lqr/i2;Lkotlin/jvm/internal/c0;Lvr/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvr/c;->a:Lqr/i2;

    iput-object p2, p0, Lvr/c;->b:Lkotlin/jvm/internal/c0;

    iput-object p3, p0, Lvr/c;->c:Lvr/j;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lvr/c;->a:Lqr/i2;

    iget-object v1, p0, Lvr/c;->b:Lkotlin/jvm/internal/c0;

    iget-object v2, p0, Lvr/c;->c:Lvr/j;

    check-cast p1, Lqr/l4;

    invoke-static {v0, v1, v2, p1}, Lvr/j;->d(Lqr/i2;Lkotlin/jvm/internal/c0;Lvr/j;Lqr/l4;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
