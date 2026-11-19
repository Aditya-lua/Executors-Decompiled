.class public final synthetic Lrr/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lbr/d;


# direct methods
.method public synthetic constructor <init>(Lbr/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrr/l;->a:Lbr/d;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lrr/l;->a:Lbr/d;

    invoke-static {v0}, Lrr/n;->g(Lbr/d;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
