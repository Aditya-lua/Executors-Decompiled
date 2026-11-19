.class public final synthetic Lop/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lop/e;


# direct methods
.method public synthetic constructor <init>(Lop/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lop/a;->a:Lop/e;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lop/a;->a:Lop/e;

    invoke-static {v0, p1}, Lop/e;->A2(Lop/e;Landroid/view/View;)V

    return-void
.end method
