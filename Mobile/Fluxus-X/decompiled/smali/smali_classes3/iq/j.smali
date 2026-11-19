.class public final synthetic Liq/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Liq/l;


# direct methods
.method public synthetic constructor <init>(Liq/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Liq/j;->a:Liq/l;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Liq/j;->a:Liq/l;

    invoke-static {v0}, Liq/l;->n(Liq/l;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
