.class public final synthetic Lop/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lop/e;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/internal/l$a;

.field public final synthetic c:Lpp/a;


# direct methods
.method public synthetic constructor <init>(Lop/e;Lcom/withpersona/sdk2/inquiry/internal/l$a;Lpp/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lop/c;->a:Lop/e;

    iput-object p2, p0, Lop/c;->b:Lcom/withpersona/sdk2/inquiry/internal/l$a;

    iput-object p3, p0, Lop/c;->c:Lpp/a;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lop/c;->a:Lop/e;

    iget-object v1, p0, Lop/c;->b:Lcom/withpersona/sdk2/inquiry/internal/l$a;

    iget-object v2, p0, Lop/c;->c:Lpp/a;

    invoke-static {v0, v1, v2}, Lop/e;->y2(Lop/e;Lcom/withpersona/sdk2/inquiry/internal/l$a;Lpp/a;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
