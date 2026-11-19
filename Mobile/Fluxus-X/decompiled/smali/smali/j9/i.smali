.class public final Lj9/i;
.super Ldb/f;
.source "SourceFile"


# instance fields
.field public final synthetic b:Lj9/c;


# direct methods
.method public constructor <init>(Lj9/c;Landroid/os/Looper;)V
    .locals 0

    iput-object p1, p0, Lj9/i;->b:Lj9/c;

    invoke-direct {p0, p2}, Ldb/f;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 1

    iget-object v0, p0, Lj9/i;->b:Lj9/c;

    invoke-static {v0, p1}, Lj9/c;->g(Lj9/c;Landroid/os/Message;)V

    return-void
.end method
