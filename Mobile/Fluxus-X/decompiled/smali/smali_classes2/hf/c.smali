.class public final synthetic Lhf/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lag/b;


# instance fields
.field public final synthetic a:Lhf/e;

.field public final synthetic b:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Lhf/e;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhf/c;->a:Lhf/e;

    iput-object p2, p0, Lhf/c;->b:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lhf/c;->a:Lhf/e;

    iget-object v1, p0, Lhf/c;->b:Landroid/content/Context;

    invoke-static {v0, v1}, Lhf/e;->b(Lhf/e;Landroid/content/Context;)Lgg/a;

    move-result-object v0

    return-object v0
.end method
