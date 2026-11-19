.class public final synthetic Lmq/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Loq/a;

.field public final synthetic b:Lmq/q5$d$c$b;


# direct methods
.method public synthetic constructor <init>(Loq/a;Lmq/q5$d$c$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmq/f;->a:Loq/a;

    iput-object p2, p0, Lmq/f;->b:Lmq/q5$d$c$b;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lmq/f;->a:Loq/a;

    iget-object v1, p0, Lmq/f;->b:Lmq/q5$d$c$b;

    invoke-static {v0, v1, p1}, Lmq/n;->g(Loq/a;Lmq/q5$d$c$b;Landroid/view/View;)V

    return-void
.end method
