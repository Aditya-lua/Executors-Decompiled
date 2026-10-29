.class public final synthetic Lcr/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lgr/i;


# direct methods
.method public synthetic constructor <init>(Lgr/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcr/g0;->a:Lgr/i;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lcr/g0;->a:Lgr/i;

    invoke-static {v0, p1}, Lcr/i0;->b(Lgr/i;Landroid/view/View;)V

    return-void
.end method
