.class public Lti/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lti/b;->g()Lti/b$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lti/b;


# direct methods
.method public constructor <init>(Lti/b;)V
    .locals 0

    iput-object p1, p0, Lti/b$a;->a:Lti/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    invoke-static {}, Lti/b;->f()Lti/b;

    move-result-object v0

    new-instance v1, Lti/b$b;

    iget-object v2, p0, Lti/b$a;->a:Lti/b;

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lti/b$b;-><init>(Lti/b;Lti/c;)V

    invoke-virtual {v0, v1}, Lsh/b;->b(Lsh/c;)V

    return-void
.end method
