.class public final synthetic Lx0/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lx0/t;


# direct methods
.method public synthetic constructor <init>(Lx0/t;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx0/q;->a:Lx0/t;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lx0/q;->a:Lx0/t;

    invoke-static {v0}, Lx0/t;->g(Lx0/t;)V

    return-void
.end method
