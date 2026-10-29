.class public final Lae/j;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lae/j;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final a()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lae/j;->a:Landroid/content/Context;

    return-object v0
.end method

.method public final b()Lae/a1;
    .locals 1

    iget-object v0, p0, Lae/j;->a:Landroid/content/Context;

    invoke-static {v0}, Lae/a1;->h(Landroid/content/Context;)Lae/a1;

    move-result-object v0

    return-object v0
.end method
