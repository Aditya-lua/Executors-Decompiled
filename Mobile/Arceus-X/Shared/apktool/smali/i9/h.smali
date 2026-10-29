.class public final Li9/h;
.super Lcb/f;
.source "SourceFile"


# instance fields
.field public final synthetic b:Li9/b;


# direct methods
.method public constructor <init>(Li9/b;Landroid/os/Looper;)V
    .locals 0

    iput-object p1, p0, Li9/h;->b:Li9/b;

    invoke-direct {p0, p2}, Lcb/f;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 1

    iget-object v0, p0, Li9/h;->b:Li9/b;

    invoke-static {v0, p1}, Li9/b;->g(Li9/b;Landroid/os/Message;)V

    return-void
.end method
