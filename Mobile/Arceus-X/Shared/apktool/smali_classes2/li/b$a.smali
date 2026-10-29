.class public Lli/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lli/b;->g()Lli/b$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lli/b;


# direct methods
.method public constructor <init>(Lli/b;)V
    .locals 0

    iput-object p1, p0, Lli/b$a;->a:Lli/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    invoke-static {}, Lli/b;->f()Lli/b;

    move-result-object v0

    new-instance v1, Lli/b$b;

    iget-object v2, p0, Lli/b$a;->a:Lli/b;

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lli/b$b;-><init>(Lli/b;Lli/c;)V

    invoke-virtual {v0, v1}, Ljh/b;->b(Ljh/c;)V

    return-void
.end method
