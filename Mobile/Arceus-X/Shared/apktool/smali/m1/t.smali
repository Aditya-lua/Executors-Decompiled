.class public final synthetic Lm1/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lm1/m;

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/lang/Throwable;


# direct methods
.method public synthetic constructor <init>(Lm1/m;ILjava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm1/t;->a:Lm1/m;

    iput p2, p0, Lm1/t;->b:I

    iput-object p3, p0, Lm1/t;->c:Ljava/lang/String;

    iput-object p4, p0, Lm1/t;->d:Ljava/lang/Throwable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lm1/t;->a:Lm1/m;

    iget v1, p0, Lm1/t;->b:I

    iget-object v2, p0, Lm1/t;->c:Ljava/lang/String;

    iget-object v3, p0, Lm1/t;->d:Ljava/lang/Throwable;

    invoke-static {v0, v1, v2, v3}, Lm1/i0;->r(Lm1/m;ILjava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
