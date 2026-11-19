.class public final synthetic Lof/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lag/b;


# instance fields
.field public final synthetic a:Lof/o;

.field public final synthetic b:Lof/c;


# direct methods
.method public synthetic constructor <init>(Lof/o;Lof/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lof/l;->a:Lof/o;

    iput-object p2, p0, Lof/l;->b:Lof/c;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lof/l;->a:Lof/o;

    iget-object v1, p0, Lof/l;->b:Lof/c;

    invoke-static {v0, v1}, Lof/o;->h(Lof/o;Lof/c;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
