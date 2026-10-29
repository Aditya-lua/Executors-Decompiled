.class public final synthetic Lrb/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lrb/a;


# direct methods
.method public synthetic constructor <init>(Lrb/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrb/b;->a:Lrb/a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lrb/b;->a:Lrb/a;

    invoke-static {v0}, Lrb/a;->e(Lrb/a;)V

    return-void
.end method
