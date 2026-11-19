.class public final synthetic Les/b3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Les/s6$d$a;

.field public final synthetic b:Les/h4;


# direct methods
.method public synthetic constructor <init>(Les/s6$d$a;Les/h4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Les/b3;->a:Les/s6$d$a;

    iput-object p2, p0, Les/b3;->b:Les/h4;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Les/b3;->a:Les/s6$d$a;

    iget-object v1, p0, Les/b3;->b:Les/h4;

    invoke-static {v0, v1, p1}, Les/h4;->g(Les/s6$d$a;Les/h4;Landroid/view/View;)V

    return-void
.end method
