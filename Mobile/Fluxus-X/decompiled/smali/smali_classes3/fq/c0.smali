.class public final synthetic Lfq/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnn/k;


# instance fields
.field public final synthetic b:Lfq/l0;

.field public final synthetic c:Lgq/c;


# direct methods
.method public synthetic constructor <init>(Lfq/l0;Lgq/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfq/c0;->b:Lfq/l0;

    iput-object p2, p0, Lfq/c0;->c:Lgq/c;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Lnn/z;)V
    .locals 2

    iget-object v0, p0, Lfq/c0;->b:Lfq/l0;

    iget-object v1, p0, Lfq/c0;->c:Lgq/c;

    check-cast p1, Lfq/l0;

    invoke-static {v0, v1, p1, p2}, Lfq/l0;->i(Lfq/l0;Lgq/c;Lfq/l0;Lnn/z;)V

    return-void
.end method
