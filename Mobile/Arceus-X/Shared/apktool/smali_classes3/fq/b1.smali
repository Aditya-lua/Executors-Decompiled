.class public final synthetic Lfq/b1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lvr/f;


# direct methods
.method public synthetic constructor <init>(Lvr/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfq/b1;->a:Lvr/f;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lfq/b1;->a:Lvr/f;

    check-cast p1, Ljava/io/File;

    invoke-static {v0, p1}, Lfq/k2;->O(Lvr/f;Ljava/io/File;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
