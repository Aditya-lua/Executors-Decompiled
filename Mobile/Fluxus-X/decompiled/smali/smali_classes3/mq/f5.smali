.class public final synthetic Lmq/f5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lmq/q5;

.field public final synthetic b:Lmq/q5$b;

.field public final synthetic c:Lmq/y0$g;

.field public final synthetic d:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lmq/q5;Lmq/q5$b;Lmq/y0$g;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmq/f5;->a:Lmq/q5;

    iput-object p2, p0, Lmq/f5;->b:Lmq/q5$b;

    iput-object p3, p0, Lmq/f5;->c:Lmq/y0$g;

    iput-object p4, p0, Lmq/f5;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lmq/f5;->a:Lmq/q5;

    iget-object v1, p0, Lmq/f5;->b:Lmq/q5$b;

    iget-object v2, p0, Lmq/f5;->c:Lmq/y0$g;

    iget-object v3, p0, Lmq/f5;->d:Ljava/lang/String;

    check-cast p1, Lln/r$c;

    invoke-static {v0, v1, v2, v3, p1}, Lmq/q5;->a1(Lmq/q5;Lmq/q5$b;Lmq/y0$g;Ljava/lang/String;Lln/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
