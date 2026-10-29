.class public final synthetic Lrp/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lrp/g0;


# direct methods
.method public synthetic constructor <init>(Lrp/g0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrp/c0;->a:Lrp/g0;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lrp/c0;->a:Lrp/g0;

    invoke-static {v0}, Lrp/g0;->f(Lrp/g0;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
