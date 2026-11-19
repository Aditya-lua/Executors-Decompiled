.class public final synthetic Lmd/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lmd/f;


# direct methods
.method public synthetic constructor <init>(Lmd/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmd/a;->a:Lmd/f;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lmd/a;->a:Lmd/f;

    invoke-static {v0, p1}, Lmd/f;->v(Lmd/f;Landroid/view/View;)V

    return-void
.end method
