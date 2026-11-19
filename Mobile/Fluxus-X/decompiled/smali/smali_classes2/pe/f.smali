.class public final synthetic Lpe/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lpe/g;

.field public final synthetic b:Lke/r;


# direct methods
.method public synthetic constructor <init>(Lpe/g;Lke/r;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpe/f;->a:Lpe/g;

    iput-object p2, p0, Lpe/f;->b:Lke/r;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lpe/f;->a:Lpe/g;

    iget-object v1, p0, Lpe/f;->b:Lke/r;

    invoke-static {v0, v1}, Lpe/g;->O(Lpe/g;Lke/r;)V

    return-void
.end method
