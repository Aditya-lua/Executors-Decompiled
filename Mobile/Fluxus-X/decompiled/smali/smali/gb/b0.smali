.class public final synthetic Lgb/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lgb/c0;

.field public final synthetic b:Lgb/u;


# direct methods
.method public synthetic constructor <init>(Lgb/c0;Lgb/u;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgb/b0;->a:Lgb/c0;

    iput-object p2, p0, Lgb/b0;->b:Lgb/u;

    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 2

    iget-object v0, p0, Lgb/b0;->a:Lgb/c0;

    iget-object v1, p0, Lgb/b0;->b:Lgb/u;

    invoke-virtual {v0, v1}, Lgb/c0;->b(Lgb/u;)V

    return-void
.end method
