.class public final synthetic Ln0/t1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ln0/u1;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ln0/u1;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln0/t1;->a:Ln0/u1;

    iput-object p2, p0, Ln0/t1;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ln0/t1;->a:Ln0/u1;

    iget-object v1, p0, Ln0/t1;->b:Ljava/lang/String;

    invoke-static {v0, v1}, Ln0/u1;->c(Ln0/u1;Ljava/lang/String;)V

    return-void
.end method
