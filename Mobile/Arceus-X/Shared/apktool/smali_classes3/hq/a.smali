.class public final synthetic Lhq/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lym/k$a;


# direct methods
.method public synthetic constructor <init>(Lym/k$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhq/a;->a:Lym/k$a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lhq/a;->a:Lym/k$a;

    check-cast p1, Ljava/io/File;

    invoke-static {v0, p1}, Lhq/j;->f(Lym/k$a;Ljava/io/File;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
