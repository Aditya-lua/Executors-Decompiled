.class public final synthetic Lfh/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lfh/f;

.field public final synthetic b:Lfh/i$a;


# direct methods
.method public synthetic constructor <init>(Lfh/f;Lfh/i$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfh/e;->a:Lfh/f;

    iput-object p2, p0, Lfh/e;->b:Lfh/i$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lfh/e;->a:Lfh/f;

    iget-object v1, p0, Lfh/e;->b:Lfh/i$a;

    invoke-static {v0, v1}, Lfh/f;->c(Lfh/f;Lfh/i$a;)V

    return-void
.end method
