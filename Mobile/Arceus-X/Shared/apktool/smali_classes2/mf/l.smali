.class public final synthetic Lmf/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lyf/b;


# instance fields
.field public final synthetic a:Lmf/o;

.field public final synthetic b:Lmf/c;


# direct methods
.method public synthetic constructor <init>(Lmf/o;Lmf/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmf/l;->a:Lmf/o;

    iput-object p2, p0, Lmf/l;->b:Lmf/c;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lmf/l;->a:Lmf/o;

    iget-object v1, p0, Lmf/l;->b:Lmf/c;

    invoke-static {v0, v1}, Lmf/o;->h(Lmf/o;Lmf/c;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
