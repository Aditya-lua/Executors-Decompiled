.class public final synthetic Lvn/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lvn/b;


# direct methods
.method public synthetic constructor <init>(Lvn/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvn/a;->a:Lvn/b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lvn/a;->a:Lvn/b;

    invoke-static {v0}, Lvn/b;->a(Lvn/b;)V

    return-void
.end method
