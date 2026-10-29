.class public final synthetic Li8/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk8/b$a;


# instance fields
.field public final synthetic a:Li8/v;


# direct methods
.method public synthetic constructor <init>(Li8/v;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li8/u;->a:Li8/v;

    return-void
.end method


# virtual methods
.method public final execute()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Li8/u;->a:Li8/v;

    invoke-static {v0}, Li8/v;->a(Li8/v;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
