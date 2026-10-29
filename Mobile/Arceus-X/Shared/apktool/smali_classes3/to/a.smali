.class public final synthetic Lto/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lno/i;


# direct methods
.method public synthetic constructor <init>(Lno/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lto/a;->a:Lno/i;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lto/a;->a:Lno/i;

    invoke-static {v0}, Lto/j;->c(Lno/i;)V

    return-void
.end method
