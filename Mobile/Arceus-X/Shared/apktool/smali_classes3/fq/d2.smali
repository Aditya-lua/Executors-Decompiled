.class public final synthetic Lfq/d2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lvr/f;

.field public final synthetic b:Lfq/k2;

.field public final synthetic c:Z


# direct methods
.method public synthetic constructor <init>(Lvr/f;Lfq/k2;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfq/d2;->a:Lvr/f;

    iput-object p2, p0, Lfq/d2;->b:Lfq/k2;

    iput-boolean p3, p0, Lfq/d2;->c:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lfq/d2;->a:Lvr/f;

    iget-object v1, p0, Lfq/d2;->b:Lfq/k2;

    iget-boolean v2, p0, Lfq/d2;->c:Z

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, v1, v2, p1}, Lfq/k2;->L0(Lvr/f;Lfq/k2;ZLjava/lang/Throwable;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
