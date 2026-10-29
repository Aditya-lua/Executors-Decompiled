.class public final synthetic Lkd/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lkd/f;


# direct methods
.method public synthetic constructor <init>(Lkd/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkd/d;->a:Lkd/f;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lkd/d;->a:Lkd/f;

    invoke-static {v0}, Lkd/f;->z(Lkd/f;)V

    return-void
.end method
