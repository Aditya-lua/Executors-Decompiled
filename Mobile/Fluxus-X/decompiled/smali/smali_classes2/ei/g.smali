.class public final synthetic Lei/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lei/i;


# direct methods
.method public synthetic constructor <init>(Lei/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lei/g;->a:Lei/i;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lei/g;->a:Lei/i;

    invoke-static {v0}, Lei/i;->a(Lei/i;)V

    return-void
.end method
