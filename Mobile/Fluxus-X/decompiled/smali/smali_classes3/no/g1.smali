.class public final synthetic Lno/g1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lno/u2;

.field public final synthetic b:Lno/u2$b;


# direct methods
.method public synthetic constructor <init>(Lno/u2;Lno/u2$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lno/g1;->a:Lno/u2;

    iput-object p2, p0, Lno/g1;->b:Lno/u2$b;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lno/g1;->a:Lno/u2;

    iget-object v1, p0, Lno/g1;->b:Lno/u2$b;

    check-cast p1, Lno/c$b;

    invoke-static {v0, v1, p1}, Lno/u2;->r0(Lno/u2;Lno/u2$b;Lno/c$b;)Lln/r;

    move-result-object p1

    return-object p1
.end method
