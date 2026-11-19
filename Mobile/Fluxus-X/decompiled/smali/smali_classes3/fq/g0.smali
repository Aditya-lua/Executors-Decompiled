.class public final synthetic Lfq/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lgq/c;

.field public final synthetic b:Lfq/l0;


# direct methods
.method public synthetic constructor <init>(Lgq/c;Lfq/l0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfq/g0;->a:Lgq/c;

    iput-object p2, p0, Lfq/g0;->b:Lfq/l0;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lfq/g0;->a:Lgq/c;

    iget-object v1, p0, Lfq/g0;->b:Lfq/l0;

    invoke-static {v0, v1}, Lfq/l0;->e(Lgq/c;Lfq/l0;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
