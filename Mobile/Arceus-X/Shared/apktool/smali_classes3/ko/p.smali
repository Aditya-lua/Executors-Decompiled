.class public final synthetic Lko/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lko/u;


# direct methods
.method public synthetic constructor <init>(Lko/u;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lko/p;->a:Lko/u;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lko/p;->a:Lko/u;

    invoke-static {v0}, Lko/u;->g(Lko/u;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
