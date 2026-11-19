.class public final synthetic Llj/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Llj/d;


# direct methods
.method public synthetic constructor <init>(Llj/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llj/b;->a:Llj/d;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Llj/b;->a:Llj/d;

    invoke-static {v0}, Llj/d;->e(Llj/d;)V

    return-void
.end method
