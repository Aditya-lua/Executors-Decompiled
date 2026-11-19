.class public final synthetic Lp4/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/window/OnBackInvokedCallback;


# instance fields
.field public final synthetic a:Lp4/o;


# direct methods
.method public synthetic constructor <init>(Lp4/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp4/n;->a:Lp4/o;

    return-void
.end method


# virtual methods
.method public final onBackInvoked()V
    .locals 1

    iget-object v0, p0, Lp4/n;->a:Lp4/o;

    invoke-static {v0}, Lp4/o;->m(Lp4/o;)V

    return-void
.end method
