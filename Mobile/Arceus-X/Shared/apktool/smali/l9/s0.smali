.class public final synthetic Ll9/s0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ll9/k;

.field public final synthetic b:Ll9/k$b;


# direct methods
.method public synthetic constructor <init>(Ll9/k;Ll9/k$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll9/s0;->a:Ll9/k;

    iput-object p2, p0, Ll9/s0;->b:Ll9/k$b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ll9/s0;->a:Ll9/k;

    iget-object v1, p0, Ll9/s0;->b:Ll9/k$b;

    invoke-virtual {v0, v1}, Ll9/k;->d(Ll9/k$b;)V

    return-void
.end method
