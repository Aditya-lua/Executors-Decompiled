.class public final synthetic Lkd/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lkd/p;


# direct methods
.method public synthetic constructor <init>(Lkd/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkd/o;->a:Lkd/p;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lkd/o;->a:Lkd/p;

    invoke-static {v0}, Lkd/p;->v(Lkd/p;)V

    return-void
.end method
