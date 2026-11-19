.class public final synthetic Lik/s0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Ljava/io/File;

.field public final synthetic b:Landroid/content/Context;

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(Ljava/io/File;Landroid/content/Context;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lik/s0;->a:Ljava/io/File;

    iput-object p2, p0, Lik/s0;->b:Landroid/content/Context;

    iput-wide p3, p0, Lik/s0;->c:J

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lik/s0;->a:Ljava/io/File;

    iget-object v1, p0, Lik/s0;->b:Landroid/content/Context;

    iget-wide v2, p0, Lik/s0;->c:J

    invoke-static {v0, v1, v2, v3}, Lik/w0;->c(Ljava/io/File;Landroid/content/Context;J)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
