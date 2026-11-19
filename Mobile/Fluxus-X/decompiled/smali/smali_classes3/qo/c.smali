.class public final synthetic Lqo/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lqo/g;


# direct methods
.method public synthetic constructor <init>(Lqo/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqo/c;->a:Lqo/g;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lqo/c;->a:Lqo/g;

    check-cast p1, Landroidx/lifecycle/l0;

    invoke-static {v0, p1}, Lqo/g;->j2(Lqo/g;Landroidx/lifecycle/l0;)Lqo/h1;

    move-result-object p1

    return-object p1
.end method
