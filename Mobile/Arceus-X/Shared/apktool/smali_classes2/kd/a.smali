.class public final synthetic Lkd/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lkd/f;


# direct methods
.method public synthetic constructor <init>(Lkd/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkd/a;->a:Lkd/f;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lkd/a;->a:Lkd/f;

    invoke-static {v0, p1}, Lkd/f;->v(Lkd/f;Landroid/view/View;)V

    return-void
.end method
