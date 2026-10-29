.class public final synthetic La0/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:La0/p0$a;


# direct methods
.method public synthetic constructor <init>(La0/p0$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La0/n0;->a:La0/p0$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, La0/n0;->a:La0/p0$a;

    invoke-static {v0}, La0/p0$a;->b(La0/p0$a;)V

    return-void
.end method
