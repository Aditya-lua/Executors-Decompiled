.class public final synthetic Lhp/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lap/i;


# direct methods
.method public synthetic constructor <init>(Lap/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhp/a;->a:Lap/i;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lhp/a;->a:Lap/i;

    invoke-static {v0}, Lhp/j;->c(Lap/i;)V

    return-void
.end method
