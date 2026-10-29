.class public final synthetic Lor/v1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lor/a2;


# direct methods
.method public synthetic constructor <init>(Lor/a2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lor/v1;->a:Lor/a2;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lor/v1;->a:Lor/a2;

    invoke-static {v0}, Lor/a2;->d(Lor/a2;)V

    return-void
.end method
