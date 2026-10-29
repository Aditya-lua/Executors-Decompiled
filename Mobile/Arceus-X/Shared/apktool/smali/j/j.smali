.class public final synthetic Lj/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/window/OnBackInvokedCallback;


# instance fields
.field public final synthetic a:Lj/g;


# direct methods
.method public synthetic constructor <init>(Lj/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj/j;->a:Lj/g;

    return-void
.end method


# virtual methods
.method public final onBackInvoked()V
    .locals 1

    iget-object v0, p0, Lj/j;->a:Lj/g;

    invoke-virtual {v0}, Lj/g;->A0()Z

    return-void
.end method
