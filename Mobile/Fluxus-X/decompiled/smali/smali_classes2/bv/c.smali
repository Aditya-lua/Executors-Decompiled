.class public final synthetic Lbv/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lav/i1;


# instance fields
.field public final synthetic a:Lbv/f;

.field public final synthetic b:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Lbv/f;Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbv/c;->a:Lbv/f;

    iput-object p2, p0, Lbv/c;->b:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lbv/c;->a:Lbv/f;

    iget-object v1, p0, Lbv/c;->b:Ljava/lang/Runnable;

    invoke-static {v0, v1}, Lbv/f;->d0(Lbv/f;Ljava/lang/Runnable;)V

    return-void
.end method
