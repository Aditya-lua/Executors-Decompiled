.class public final synthetic Lrj/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lrj/c;


# direct methods
.method public synthetic constructor <init>(Lrj/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrj/a;->a:Lrj/c;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lrj/a;->a:Lrj/c;

    invoke-static {v0, p1}, Lrj/c;->c2(Lrj/c;Landroid/view/View;)V

    return-void
.end method
