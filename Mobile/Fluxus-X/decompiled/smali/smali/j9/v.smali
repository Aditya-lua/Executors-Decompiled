.class public final synthetic Lj9/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lj9/x;

.field public final synthetic b:Lj9/a0;


# direct methods
.method public synthetic constructor <init>(Lj9/x;Lj9/a0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj9/v;->a:Lj9/x;

    iput-object p2, p0, Lj9/v;->b:Lj9/a0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lj9/v;->a:Lj9/x;

    iget-object v1, p0, Lj9/v;->b:Lj9/a0;

    iget v1, v1, Lj9/a0;->a:I

    invoke-virtual {v0, v1}, Lj9/x;->e(I)V

    return-void
.end method
