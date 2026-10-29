.class public final synthetic Lkd/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lkd/w;


# direct methods
.method public synthetic constructor <init>(Lkd/w;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkd/v;->a:Lkd/w;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lkd/v;->a:Lkd/w;

    invoke-static {v0, p1}, Lkd/w;->v(Lkd/w;Landroid/view/View;)V

    return-void
.end method
