.class public final synthetic Lhr/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lhr/j;


# direct methods
.method public synthetic constructor <init>(Lhr/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhr/f;->a:Lhr/j;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lhr/f;->a:Lhr/j;

    invoke-static {v0, p1}, Lhr/j;->a(Lhr/j;Landroid/view/View;)V

    return-void
.end method
