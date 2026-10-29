.class public final synthetic Lo4/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/window/OnBackInvokedCallback;


# instance fields
.field public final synthetic a:Lo4/o;


# direct methods
.method public synthetic constructor <init>(Lo4/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo4/n;->a:Lo4/o;

    return-void
.end method


# virtual methods
.method public final onBackInvoked()V
    .locals 1

    iget-object v0, p0, Lo4/n;->a:Lo4/o;

    invoke-static {v0}, Lo4/o;->m(Lo4/o;)V

    return-void
.end method
