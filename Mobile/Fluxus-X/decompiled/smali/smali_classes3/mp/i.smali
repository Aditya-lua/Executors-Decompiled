.class public final synthetic Lmp/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lmp/j;

.field public final synthetic b:Llp/v$b;

.field public final synthetic c:Llp/a;


# direct methods
.method public synthetic constructor <init>(Lmp/j;Llp/v$b;Llp/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmp/i;->a:Lmp/j;

    iput-object p2, p0, Lmp/i;->b:Llp/v$b;

    iput-object p3, p0, Lmp/i;->c:Llp/a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lmp/i;->a:Lmp/j;

    iget-object v1, p0, Lmp/i;->b:Llp/v$b;

    iget-object v2, p0, Lmp/i;->c:Llp/a;

    check-cast p1, Llp/c$b;

    invoke-static {v0, v1, v2, p1}, Lmp/j;->h(Lmp/j;Llp/v$b;Llp/a;Llp/c$b;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
