.class public final synthetic Luo/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lym/k$a;


# direct methods
.method public synthetic constructor <init>(Lym/k$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Luo/c;->a:Lym/k$a;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Luo/c;->a:Lym/k$a;

    invoke-static {v0}, Luo/j;->g(Lym/k$a;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
