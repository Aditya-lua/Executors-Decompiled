.class public final synthetic Li8/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk8/b$a;


# instance fields
.field public final synthetic a:Li8/r;


# direct methods
.method public synthetic constructor <init>(Li8/r;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li8/o;->a:Li8/r;

    return-void
.end method


# virtual methods
.method public final execute()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Li8/o;->a:Li8/r;

    invoke-static {v0}, Li8/r;->c(Li8/r;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
