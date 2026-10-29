.class public final synthetic Lkd/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lkd/p;


# direct methods
.method public synthetic constructor <init>(Lkd/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkd/l;->a:Lkd/p;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lkd/l;->a:Lkd/p;

    invoke-static {v0, p1}, Lkd/p;->B(Lkd/p;Landroid/view/View;)V

    return-void
.end method
