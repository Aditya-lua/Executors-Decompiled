.class public final synthetic Lfq/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lfq/k2;


# direct methods
.method public synthetic constructor <init>(Lfq/k2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfq/b0;->a:Lfq/k2;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lfq/b0;->a:Lfq/k2;

    invoke-static {v0}, Lfq/k2;->v(Lfq/k2;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
