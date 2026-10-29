.class public final synthetic Lwh/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lwh/i;


# direct methods
.method public synthetic constructor <init>(Lwh/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwh/g;->a:Lwh/i;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lwh/g;->a:Lwh/i;

    invoke-static {v0}, Lwh/i;->a(Lwh/i;)V

    return-void
.end method
