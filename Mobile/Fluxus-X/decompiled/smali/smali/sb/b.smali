.class public final synthetic Lsb/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lsb/a;


# direct methods
.method public synthetic constructor <init>(Lsb/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsb/b;->a:Lsb/a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lsb/b;->a:Lsb/a;

    invoke-static {v0}, Lsb/a;->e(Lsb/a;)V

    return-void
.end method
