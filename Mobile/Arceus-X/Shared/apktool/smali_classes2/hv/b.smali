.class public final synthetic Lhv/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lhv/e;


# direct methods
.method public synthetic constructor <init>(Lhv/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhv/b;->a:Lhv/e;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lhv/b;->a:Lhv/e;

    invoke-virtual {v0}, Lhv/e;->q()V

    return-void
.end method
