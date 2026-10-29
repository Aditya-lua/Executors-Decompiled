.class public final synthetic Lfb/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lfb/b0;

.field public final synthetic b:Lfb/t;


# direct methods
.method public synthetic constructor <init>(Lfb/b0;Lfb/t;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfb/a0;->a:Lfb/b0;

    iput-object p2, p0, Lfb/a0;->b:Lfb/t;

    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 2

    iget-object v0, p0, Lfb/a0;->a:Lfb/b0;

    iget-object v1, p0, Lfb/a0;->b:Lfb/t;

    invoke-virtual {v0, v1}, Lfb/b0;->b(Lfb/t;)V

    return-void
.end method
