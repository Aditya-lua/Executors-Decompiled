.class public final synthetic Lfq/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lfq/h;


# direct methods
.method public synthetic constructor <init>(Lfq/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfq/b;->a:Lfq/h;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lfq/b;->a:Lfq/h;

    invoke-static {v0, p1}, Lfq/h;->b(Lfq/h;Landroid/view/View;)V

    return-void
.end method
