.class public final synthetic Lop/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lop/e;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/internal/l$a;


# direct methods
.method public synthetic constructor <init>(Lop/e;Lcom/withpersona/sdk2/inquiry/internal/l$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lop/b;->a:Lop/e;

    iput-object p2, p0, Lop/b;->b:Lcom/withpersona/sdk2/inquiry/internal/l$a;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lop/b;->a:Lop/e;

    iget-object v1, p0, Lop/b;->b:Lcom/withpersona/sdk2/inquiry/internal/l$a;

    invoke-static {v0, v1, p1}, Lop/e;->z2(Lop/e;Lcom/withpersona/sdk2/inquiry/internal/l$a;Landroid/view/View;)V

    return-void
.end method
