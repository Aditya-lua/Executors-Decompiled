.class public final synthetic Lff/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lyf/b;


# instance fields
.field public final synthetic a:Lff/e;

.field public final synthetic b:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Lff/e;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lff/c;->a:Lff/e;

    iput-object p2, p0, Lff/c;->b:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lff/c;->a:Lff/e;

    iget-object v1, p0, Lff/c;->b:Landroid/content/Context;

    invoke-static {v0, v1}, Lff/e;->b(Lff/e;Landroid/content/Context;)Leg/a;

    move-result-object v0

    return-object v0
.end method
