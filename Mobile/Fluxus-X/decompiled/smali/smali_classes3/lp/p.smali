.class public final synthetic Llp/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Llp/v;

.field public final synthetic b:Llp/v$b;

.field public final synthetic c:Llp/a;

.field public final synthetic d:Llp/v$e$a;


# direct methods
.method public synthetic constructor <init>(Llp/v;Llp/v$b;Llp/a;Llp/v$e$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llp/p;->a:Llp/v;

    iput-object p2, p0, Llp/p;->b:Llp/v$b;

    iput-object p3, p0, Llp/p;->c:Llp/a;

    iput-object p4, p0, Llp/p;->d:Llp/v$e$a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Llp/p;->a:Llp/v;

    iget-object v1, p0, Llp/p;->b:Llp/v$b;

    iget-object v2, p0, Llp/p;->c:Llp/a;

    iget-object v3, p0, Llp/p;->d:Llp/v$e$a;

    check-cast p1, Llp/c$b;

    invoke-static {v0, v1, v2, v3, p1}, Llp/v;->l(Llp/v;Llp/v$b;Llp/a;Llp/v$e$a;Llp/c$b;)Lln/r;

    move-result-object p1

    return-object p1
.end method
