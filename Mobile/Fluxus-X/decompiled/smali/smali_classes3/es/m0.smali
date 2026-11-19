.class public final synthetic Les/m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/ui/network/b$b;

.field public final synthetic b:Les/i4$a;

.field public final synthetic c:Lqr/x5;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/ui/network/b$b;Les/i4$a;Lqr/x5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Les/m0;->a:Lcom/withpersona/sdk2/inquiry/ui/network/b$b;

    iput-object p2, p0, Les/m0;->b:Les/i4$a;

    iput-object p3, p0, Les/m0;->c:Lqr/x5;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Les/m0;->a:Lcom/withpersona/sdk2/inquiry/ui/network/b$b;

    iget-object v1, p0, Les/m0;->b:Les/i4$a;

    iget-object v2, p0, Les/m0;->c:Lqr/x5;

    check-cast p1, Lln/r$c;

    invoke-static {v0, v1, v2, p1}, Les/k1;->j0(Lcom/withpersona/sdk2/inquiry/ui/network/b$b;Les/i4$a;Lqr/x5;Lln/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
