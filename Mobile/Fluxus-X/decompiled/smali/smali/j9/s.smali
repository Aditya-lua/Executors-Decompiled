.class public final synthetic Lj9/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lj9/x;


# direct methods
.method public synthetic constructor <init>(Lj9/x;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj9/s;->a:Lj9/x;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lj9/s;->a:Lj9/x;

    invoke-virtual {v0}, Lj9/x;->d()V

    return-void
.end method
