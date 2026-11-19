.class public final synthetic Lj8/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lj8/v;


# direct methods
.method public synthetic constructor <init>(Lj8/v;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj8/t;->a:Lj8/v;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lj8/t;->a:Lj8/v;

    invoke-static {v0}, Lj8/v;->b(Lj8/v;)V

    return-void
.end method
