.class public final synthetic Lmq/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Loq/a;

.field public final synthetic b:Landroidx/lifecycle/m;

.field public final synthetic c:Lmq/n;

.field public final synthetic d:Lmq/q5$d$c$b;


# direct methods
.method public synthetic constructor <init>(Loq/a;Landroidx/lifecycle/m;Lmq/n;Lmq/q5$d$c$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmq/e;->a:Loq/a;

    iput-object p2, p0, Lmq/e;->b:Landroidx/lifecycle/m;

    iput-object p3, p0, Lmq/e;->c:Lmq/n;

    iput-object p4, p0, Lmq/e;->d:Lmq/q5$d$c$b;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    iget-object v0, p0, Lmq/e;->a:Loq/a;

    iget-object v1, p0, Lmq/e;->b:Landroidx/lifecycle/m;

    iget-object v2, p0, Lmq/e;->c:Lmq/n;

    iget-object v3, p0, Lmq/e;->d:Lmq/q5$d$c$b;

    invoke-static {v0, v1, v2, v3, p1}, Lmq/n;->e(Loq/a;Landroidx/lifecycle/m;Lmq/n;Lmq/q5$d$c$b;Landroid/view/View;)V

    return-void
.end method
