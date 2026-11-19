.class public final synthetic Ld1/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ld1/g;


# direct methods
.method public synthetic constructor <init>(Ld1/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld1/f;->a:Ld1/g;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Ld1/f;->a:Ld1/g;

    invoke-static {v0}, Ld1/g;->a(Ld1/g;)V

    return-void
.end method
