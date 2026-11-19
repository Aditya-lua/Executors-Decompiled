.class public final Lno/j$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lno/j;-><init>(Lor/i;Ljava/util/List;Lir/a;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lor/s;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function1<",
        "Lbr/b;",
        "Lnn/k<",
        "Lno/j;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic a:Lor/i;

.field public final synthetic b:Lkotlin/jvm/functions/Function2;

.field public final synthetic c:Z

.field public final synthetic d:Lpu/n;


# direct methods
.method public constructor <init>(Lor/i;Lkotlin/jvm/functions/Function2;ZLpu/n;)V
    .locals 0

    iput-object p1, p0, Lno/j$b;->a:Lor/i;

    iput-object p2, p0, Lno/j$b;->b:Lkotlin/jvm/functions/Function2;

    iput-boolean p3, p0, Lno/j$b;->c:Z

    iput-object p4, p0, Lno/j$b;->d:Lpu/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lbr/b;)Lnn/k;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbr/b;",
            ")",
            "Lnn/k<",
            "Lno/j;",
            ">;"
        }
    .end annotation

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lor/v;->a:Lor/v;

    iget-object v1, p0, Lno/j$b;->a:Lor/i;

    iget-object v2, p0, Lno/j$b;->b:Lkotlin/jvm/functions/Function2;

    iget-boolean v3, p0, Lno/j$b;->c:Z

    invoke-virtual {v0, p1, v1, v2, v3}, Lor/v;->l(Lbr/b;Lor/i;Lkotlin/jvm/functions/Function2;Z)Lor/j;

    move-result-object v0

    new-instance v1, Lno/j$b$a;

    iget-object v2, p0, Lno/j$b;->a:Lor/i;

    iget-object v3, p0, Lno/j$b;->d:Lpu/n;

    invoke-direct {v1, v2, p1, v3, v0}, Lno/j$b$a;-><init>(Lor/i;Lbr/b;Lpu/n;Lor/j;)V

    return-object v1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lbr/b;

    invoke-virtual {p0, p1}, Lno/j$b;->a(Lbr/b;)Lnn/k;

    move-result-object p1

    return-object p1
.end method
