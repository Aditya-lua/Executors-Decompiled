.class public final synthetic Ljv/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ljv/i$b$a;

.field public final synthetic b:Ljv/f;

.field public final synthetic c:Ljava/lang/Throwable;


# direct methods
.method public synthetic constructor <init>(Ljv/i$b$a;Ljv/f;Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljv/k;->a:Ljv/i$b$a;

    iput-object p2, p0, Ljv/k;->b:Ljv/f;

    iput-object p3, p0, Ljv/k;->c:Ljava/lang/Throwable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Ljv/k;->a:Ljv/i$b$a;

    iget-object v1, p0, Ljv/k;->b:Ljv/f;

    iget-object v2, p0, Ljv/k;->c:Ljava/lang/Throwable;

    invoke-static {v0, v1, v2}, Ljv/i$b$a;->c(Ljv/i$b$a;Ljv/f;Ljava/lang/Throwable;)V

    return-void
.end method
