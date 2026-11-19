.class public final synthetic Lno/i2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lno/e$a;

.field public final synthetic b:Lno/u2$f$f;

.field public final synthetic c:Lcom/withpersona/sdk2/inquiry/document/network/c$b;

.field public final synthetic d:Lno/u2;

.field public final synthetic e:Lno/u2$b;


# direct methods
.method public synthetic constructor <init>(Lno/e$a;Lno/u2$f$f;Lcom/withpersona/sdk2/inquiry/document/network/c$b;Lno/u2;Lno/u2$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lno/i2;->a:Lno/e$a;

    iput-object p2, p0, Lno/i2;->b:Lno/u2$f$f;

    iput-object p3, p0, Lno/i2;->c:Lcom/withpersona/sdk2/inquiry/document/network/c$b;

    iput-object p4, p0, Lno/i2;->d:Lno/u2;

    iput-object p5, p0, Lno/i2;->e:Lno/u2$b;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lno/i2;->a:Lno/e$a;

    iget-object v1, p0, Lno/i2;->b:Lno/u2$f$f;

    iget-object v2, p0, Lno/i2;->c:Lcom/withpersona/sdk2/inquiry/document/network/c$b;

    iget-object v3, p0, Lno/i2;->d:Lno/u2;

    iget-object v4, p0, Lno/i2;->e:Lno/u2$b;

    move-object v5, p1

    check-cast v5, Lln/r$c;

    invoke-static/range {v0 .. v5}, Lno/u2;->z(Lno/e$a;Lno/u2$f$f;Lcom/withpersona/sdk2/inquiry/document/network/c$b;Lno/u2;Lno/u2$b;Lln/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
