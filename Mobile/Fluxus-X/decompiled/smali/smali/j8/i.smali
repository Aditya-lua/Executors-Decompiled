.class public final synthetic Lj8/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll8/b$a;


# instance fields
.field public final synthetic a:Lk8/d;


# direct methods
.method public synthetic constructor <init>(Lk8/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj8/i;->a:Lk8/d;

    return-void
.end method


# virtual methods
.method public final j()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lj8/i;->a:Lk8/d;

    invoke-interface {v0}, Lk8/d;->cleanUp()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
