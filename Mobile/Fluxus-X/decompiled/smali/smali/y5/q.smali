.class public final synthetic Ly5/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lav/d2;


# direct methods
.method public synthetic constructor <init>(Lav/d2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly5/q;->a:Lav/d2;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Ly5/q;->a:Lav/d2;

    invoke-static {v0}, Ly5/u;->e(Lav/d2;)V

    return-void
.end method
