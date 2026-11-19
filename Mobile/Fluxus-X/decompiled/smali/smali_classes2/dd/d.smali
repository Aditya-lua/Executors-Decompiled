.class public final synthetic Ldd/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/window/OnBackInvokedCallback;


# instance fields
.field public final synthetic a:Ldd/b;


# direct methods
.method public synthetic constructor <init>(Ldd/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldd/d;->a:Ldd/b;

    return-void
.end method


# virtual methods
.method public final onBackInvoked()V
    .locals 1

    iget-object v0, p0, Ldd/d;->a:Ldd/b;

    invoke-interface {v0}, Ldd/b;->d()V

    return-void
.end method
