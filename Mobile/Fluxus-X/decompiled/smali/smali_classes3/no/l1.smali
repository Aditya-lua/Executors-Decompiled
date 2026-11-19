.class public final synthetic Lno/l1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lno/u2;

.field public final synthetic b:Lno/u2$f$f;

.field public final synthetic c:Lno/e$a;

.field public final synthetic d:Lno/u2$b;


# direct methods
.method public synthetic constructor <init>(Lno/u2;Lno/u2$f$f;Lno/e$a;Lno/u2$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lno/l1;->a:Lno/u2;

    iput-object p2, p0, Lno/l1;->b:Lno/u2$f$f;

    iput-object p3, p0, Lno/l1;->c:Lno/e$a;

    iput-object p4, p0, Lno/l1;->d:Lno/u2$b;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lno/l1;->a:Lno/u2;

    iget-object v1, p0, Lno/l1;->b:Lno/u2$f$f;

    iget-object v2, p0, Lno/l1;->c:Lno/e$a;

    iget-object v3, p0, Lno/l1;->d:Lno/u2$b;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/document/network/c$b;

    invoke-static {v0, v1, v2, v3, p1}, Lno/u2;->K(Lno/u2;Lno/u2$f$f;Lno/e$a;Lno/u2$b;Lcom/withpersona/sdk2/inquiry/document/network/c$b;)Lln/r;

    move-result-object p1

    return-object p1
.end method
