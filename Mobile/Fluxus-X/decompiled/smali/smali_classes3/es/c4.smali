.class public final synthetic Les/c4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lor/j;

.field public final synthetic b:Les/h4;


# direct methods
.method public synthetic constructor <init>(Lor/j;Les/h4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Les/c4;->a:Lor/j;

    iput-object p2, p0, Les/c4;->b:Les/h4;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Les/c4;->a:Lor/j;

    iget-object v1, p0, Les/c4;->b:Les/h4;

    check-cast p1, Landroidx/core/view/WindowInsetsCompat;

    invoke-static {v0, v1, p1}, Les/h4;->M(Lor/j;Les/h4;Landroidx/core/view/WindowInsetsCompat;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
