.class public final synthetic Ly0/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ly0/r;


# direct methods
.method public synthetic constructor <init>(Ly0/r;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly0/p;->a:Ly0/r;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Ly0/p;->a:Ly0/r;

    invoke-static {v0}, Ly0/r;->a(Ly0/r;)V

    return-void
.end method
