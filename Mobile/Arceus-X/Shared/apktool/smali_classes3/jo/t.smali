.class public final synthetic Ljo/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Ljo/y;

.field public final synthetic b:Lcr/w1;

.field public final synthetic c:Lcom/withpersona/sdk2/inquiry/governmentid/Screen$a;


# direct methods
.method public synthetic constructor <init>(Ljo/y;Lcr/w1;Lcom/withpersona/sdk2/inquiry/governmentid/Screen$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljo/t;->a:Ljo/y;

    iput-object p2, p0, Ljo/t;->b:Lcr/w1;

    iput-object p3, p0, Ljo/t;->c:Lcom/withpersona/sdk2/inquiry/governmentid/Screen$a;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    iget-object v0, p0, Ljo/t;->a:Ljo/y;

    iget-object v1, p0, Ljo/t;->b:Lcr/w1;

    iget-object v2, p0, Ljo/t;->c:Lcom/withpersona/sdk2/inquiry/governmentid/Screen$a;

    invoke-static {v0, v1, v2, p1}, Ljo/y;->i(Ljo/y;Lcr/w1;Lcom/withpersona/sdk2/inquiry/governmentid/Screen$a;Landroid/view/View;)V

    return-void
.end method
