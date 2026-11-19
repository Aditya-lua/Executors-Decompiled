.class public final synthetic Lcom/google/firebase/messaging/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroid/content/Context;

.field public final synthetic b:Z

.field public final synthetic c:Ltb/k;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;ZLtb/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/messaging/j0;->a:Landroid/content/Context;

    iput-boolean p2, p0, Lcom/google/firebase/messaging/j0;->b:Z

    iput-object p3, p0, Lcom/google/firebase/messaging/j0;->c:Ltb/k;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/firebase/messaging/j0;->a:Landroid/content/Context;

    iget-boolean v1, p0, Lcom/google/firebase/messaging/j0;->b:Z

    iget-object v2, p0, Lcom/google/firebase/messaging/j0;->c:Ltb/k;

    invoke-static {v0, v1, v2}, Lcom/google/firebase/messaging/k0;->a(Landroid/content/Context;ZLtb/k;)V

    return-void
.end method
