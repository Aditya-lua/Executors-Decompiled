.class public final synthetic Lcd/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/window/OnBackInvokedCallback;


# instance fields
.field public final synthetic a:Lcd/b;


# direct methods
.method public synthetic constructor <init>(Lcd/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcd/d;->a:Lcd/b;

    return-void
.end method


# virtual methods
.method public final onBackInvoked()V
    .locals 1

    iget-object v0, p0, Lcd/d;->a:Lcd/b;

    invoke-interface {v0}, Lcd/b;->d()V

    return-void
.end method
