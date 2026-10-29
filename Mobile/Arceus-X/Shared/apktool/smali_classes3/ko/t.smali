.class public final synthetic Lko/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lko/u;


# direct methods
.method public synthetic constructor <init>(Lko/u;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lko/t;->a:Lko/u;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lko/t;->a:Lko/u;

    invoke-static {v0}, Lko/u$a;->a(Lko/u;)V

    return-void
.end method
