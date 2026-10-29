.class public final synthetic Lsg/p1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lsg/y1;


# direct methods
.method public synthetic constructor <init>(Lsg/y1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsg/p1;->a:Lsg/y1;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lsg/p1;->a:Lsg/y1;

    invoke-static {v0, p1}, Lsg/y1;->c2(Lsg/y1;Landroid/view/View;)V

    return-void
.end method
