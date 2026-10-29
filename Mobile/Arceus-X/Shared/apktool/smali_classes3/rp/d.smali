.class public final synthetic Lrp/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lrp/h;


# direct methods
.method public synthetic constructor <init>(Lrp/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrp/d;->a:Lrp/h;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lrp/d;->a:Lrp/h;

    invoke-static {v0}, Lrp/h;->a(Lrp/h;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
