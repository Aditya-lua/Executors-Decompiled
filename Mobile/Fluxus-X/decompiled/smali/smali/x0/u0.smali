.class public final synthetic Lx0/u0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lx0/v0;


# direct methods
.method public synthetic constructor <init>(Lx0/v0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx0/u0;->a:Lx0/v0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lx0/u0;->a:Lx0/v0;

    invoke-static {v0}, Lx0/v0;->c(Lx0/v0;)V

    return-void
.end method
