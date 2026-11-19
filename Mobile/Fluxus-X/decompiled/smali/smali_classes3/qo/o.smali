.class public final synthetic Lqo/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lqo/e1;


# direct methods
.method public synthetic constructor <init>(Lqo/e1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqo/o;->a:Lqo/e1;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lqo/o;->a:Lqo/e1;

    invoke-static {v0}, Lqo/e1;->R(Lqo/e1;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
