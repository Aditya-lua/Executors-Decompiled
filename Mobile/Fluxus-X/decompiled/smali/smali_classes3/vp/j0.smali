.class public final synthetic Lvp/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lpp/c;


# direct methods
.method public synthetic constructor <init>(Lpp/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvp/j0;->a:Lpp/c;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lvp/j0;->a:Lpp/c;

    check-cast p1, Landroidx/core/view/WindowInsetsCompat;

    invoke-static {v0, p1}, Lvp/n0;->e(Lpp/c;Landroidx/core/view/WindowInsetsCompat;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
