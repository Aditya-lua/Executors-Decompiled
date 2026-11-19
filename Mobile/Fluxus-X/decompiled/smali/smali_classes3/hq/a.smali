.class public final synthetic Lhq/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lhq/c;


# direct methods
.method public synthetic constructor <init>(Lhq/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhq/a;->a:Lhq/c;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lhq/a;->a:Lhq/c;

    check-cast p1, Landroidx/lifecycle/l0;

    invoke-static {v0, p1}, Lhq/c;->i2(Lhq/c;Landroidx/lifecycle/l0;)Lhq/f;

    move-result-object p1

    return-object p1
.end method
