.class public final synthetic Lbh/z1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lbh/y1$i;


# direct methods
.method public synthetic constructor <init>(Lbh/y1$i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbh/z1;->a:Lbh/y1$i;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lbh/z1;->a:Lbh/y1$i;

    invoke-static {v0}, Lbh/y1$i;->c(Lbh/y1$i;)V

    return-void
.end method
