.class public final synthetic Ldr/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lnq/d;


# direct methods
.method public synthetic constructor <init>(Lnq/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldr/l;->a:Lnq/d;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ldr/l;->a:Lnq/d;

    invoke-static {v0}, Ldr/n;->g(Lnq/d;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
