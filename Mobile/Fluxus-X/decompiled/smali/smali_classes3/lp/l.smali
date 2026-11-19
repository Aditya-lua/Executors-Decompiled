.class public final synthetic Llp/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Llp/m;


# direct methods
.method public synthetic constructor <init>(Llp/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llp/l;->a:Llp/m;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Llp/l;->a:Llp/m;

    invoke-static {v0}, Llp/m;->i(Llp/m;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
