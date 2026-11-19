.class public final synthetic Lfq/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lfq/u;

.field public final synthetic b:Lfq/u$c;


# direct methods
.method public synthetic constructor <init>(Lfq/u;Lfq/u$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfq/o;->a:Lfq/u;

    iput-object p2, p0, Lfq/o;->b:Lfq/u$c;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lfq/o;->a:Lfq/u;

    iget-object v1, p0, Lfq/o;->b:Lfq/u$c;

    check-cast p1, Lfq/j$b;

    invoke-static {v0, v1, p1}, Lfq/u;->h(Lfq/u;Lfq/u$c;Lfq/j$b;)Lln/r;

    move-result-object p1

    return-object p1
.end method
