.class public final synthetic Loh/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Loh/f;

.field public final synthetic b:Loh/i$a;


# direct methods
.method public synthetic constructor <init>(Loh/f;Loh/i$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Loh/e;->a:Loh/f;

    iput-object p2, p0, Loh/e;->b:Loh/i$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Loh/e;->a:Loh/f;

    iget-object v1, p0, Loh/e;->b:Loh/i$a;

    invoke-static {v0, v1}, Loh/f;->c(Loh/f;Loh/i$a;)V

    return-void
.end method
