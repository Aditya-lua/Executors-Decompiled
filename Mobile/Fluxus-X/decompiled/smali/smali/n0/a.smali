.class public final synthetic Ln0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ljava/lang/Throwable;

.field public final synthetic b:Ln0/b$a;

.field public final synthetic c:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Throwable;Ln0/b$a;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln0/a;->a:Ljava/lang/Throwable;

    iput-object p2, p0, Ln0/a;->b:Ln0/b$a;

    iput-object p3, p0, Ln0/a;->c:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Ln0/a;->a:Ljava/lang/Throwable;

    iget-object v1, p0, Ln0/a;->b:Ln0/b$a;

    iget-object v2, p0, Ln0/a;->c:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ln0/b;->a(Ljava/lang/Throwable;Ln0/b$a;Ljava/util/List;)V

    return-void
.end method
