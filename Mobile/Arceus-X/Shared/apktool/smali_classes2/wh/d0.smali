.class public final synthetic Lwh/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lwh/i0;


# direct methods
.method public synthetic constructor <init>(Lwh/i0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwh/d0;->a:Lwh/i0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lwh/d0;->a:Lwh/i0;

    invoke-static {v0}, Lwh/i0;->e(Lwh/i0;)V

    return-void
.end method
