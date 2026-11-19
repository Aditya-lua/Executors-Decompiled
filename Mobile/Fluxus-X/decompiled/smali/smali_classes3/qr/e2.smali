.class public final synthetic Lqr/e2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lur/b;


# direct methods
.method public synthetic constructor <init>(Lur/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqr/e2;->a:Lur/b;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lqr/e2;->a:Lur/b;

    invoke-static {v0, p1}, Lqr/h2;->c(Lur/b;Landroid/view/View;)V

    return-void
.end method
