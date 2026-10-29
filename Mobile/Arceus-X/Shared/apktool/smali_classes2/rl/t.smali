.class public final synthetic Lrl/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lrl/u;


# direct methods
.method public synthetic constructor <init>(Lrl/u;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrl/t;->a:Lrl/u;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lrl/t;->a:Lrl/u;

    invoke-static {v0}, Lrl/u;->a(Lrl/u;)V

    return-void
.end method
