.class public final synthetic Lf7/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Ljava/io/InputStream;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/io/InputStream;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf7/k;->a:Ljava/io/InputStream;

    iput-object p2, p0, Lf7/k;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lf7/k;->a:Ljava/io/InputStream;

    iget-object v1, p0, Lf7/k;->b:Ljava/lang/String;

    invoke-static {v0, v1}, Lf7/q;->d(Ljava/io/InputStream;Ljava/lang/String;)Lf7/p0;

    move-result-object v0

    return-object v0
.end method
