.class public final synthetic Lfq/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lfq/l0;


# direct methods
.method public synthetic constructor <init>(Lfq/l0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfq/f0;->a:Lfq/l0;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lfq/f0;->a:Lfq/l0;

    invoke-static {v0}, Lfq/l0;->h(Lfq/l0;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
