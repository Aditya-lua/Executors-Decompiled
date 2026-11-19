.class public final synthetic Lno/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lno/z;

.field public final synthetic b:Lno/z$a;


# direct methods
.method public synthetic constructor <init>(Lno/z;Lno/z$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lno/y;->a:Lno/z;

    iput-object p2, p0, Lno/y;->b:Lno/z$a;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lno/y;->a:Lno/z;

    iget-object v1, p0, Lno/y;->b:Lno/z$a;

    invoke-static {v0, v1, p1}, Lno/z;->D(Lno/z;Lno/z$a;Landroid/view/View;)V

    return-void
.end method
