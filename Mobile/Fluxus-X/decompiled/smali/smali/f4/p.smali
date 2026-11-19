.class public final synthetic Lf4/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lf4/q;


# direct methods
.method public synthetic constructor <init>(Lf4/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf4/p;->a:Lf4/q;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lf4/p;->a:Lf4/q;

    invoke-static {v0}, Lf4/q;->i(Lf4/q;)V

    return-void
.end method
