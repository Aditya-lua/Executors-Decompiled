.class public final synthetic Lkq/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lkq/p;


# direct methods
.method public synthetic constructor <init>(Lkq/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkq/l;->a:Lkq/p;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lkq/l;->a:Lkq/p;

    check-cast p1, Landroidx/core/view/WindowInsetsCompat;

    invoke-static {v0, p1}, Lkq/p;->d(Lkq/p;Landroidx/core/view/WindowInsetsCompat;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
