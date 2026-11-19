.class public final synthetic Ly0/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ly0/o;


# direct methods
.method public synthetic constructor <init>(Ly0/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly0/e;->a:Ly0/o;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Ly0/e;->a:Ly0/o;

    invoke-static {v0}, Ly0/o;->h(Ly0/o;)V

    return-void
.end method
