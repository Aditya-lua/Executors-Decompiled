.class public final synthetic Lno/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lno/z;


# direct methods
.method public synthetic constructor <init>(Lno/z;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lno/x;->a:Lno/z;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lno/x;->a:Lno/z;

    invoke-static {v0, p1}, Lno/z;->C(Lno/z;Landroid/view/View;)V

    return-void
.end method
