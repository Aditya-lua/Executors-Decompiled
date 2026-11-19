.class public final synthetic Lyp/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lyp/d;


# direct methods
.method public synthetic constructor <init>(Lyp/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyp/c;->a:Lyp/d;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lyp/c;->a:Lyp/d;

    check-cast p1, Landroidx/lifecycle/l0;

    invoke-static {v0, p1}, Lyp/d;->g2(Lyp/d;Landroidx/lifecycle/l0;)Lyp/i;

    move-result-object p1

    return-object p1
.end method
