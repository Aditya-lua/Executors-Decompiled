.class public final synthetic Lmd/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lmd/p;


# direct methods
.method public synthetic constructor <init>(Lmd/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmd/l;->a:Lmd/p;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lmd/l;->a:Lmd/p;

    invoke-static {v0, p1}, Lmd/p;->B(Lmd/p;Landroid/view/View;)V

    return-void
.end method
