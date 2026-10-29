.class public final synthetic Lzn/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/document/f;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/document/f$a;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/document/f;Lcom/withpersona/sdk2/inquiry/document/f$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzn/p;->a:Lcom/withpersona/sdk2/inquiry/document/f;

    iput-object p2, p0, Lzn/p;->b:Lcom/withpersona/sdk2/inquiry/document/f$a;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lzn/p;->a:Lcom/withpersona/sdk2/inquiry/document/f;

    iget-object v1, p0, Lzn/p;->b:Lcom/withpersona/sdk2/inquiry/document/f$a;

    invoke-static {v0, v1, p1}, Lcom/withpersona/sdk2/inquiry/document/f;->D(Lcom/withpersona/sdk2/inquiry/document/f;Lcom/withpersona/sdk2/inquiry/document/f$a;Landroid/view/View;)V

    return-void
.end method
