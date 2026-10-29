.class public final synthetic Ljp/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ljp/b;


# direct methods
.method public synthetic constructor <init>(Ljp/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljp/a;->a:Ljp/b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Ljp/a;->a:Ljp/b;

    invoke-static {v0}, Ljp/b;->g2(Ljp/b;)V

    return-void
.end method
