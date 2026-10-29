.class public Lhm/b$e;
.super Ljava/util/TimerTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhm/b;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lhm/b;


# direct methods
.method public constructor <init>(Lhm/b;)V
    .locals 0

    iput-object p1, p0, Lhm/b$e;->a:Lhm/b;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lhm/b$e;->a:Lhm/b;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lhm/b;->c(Lhm/b;Z)V

    iget-object v0, p0, Lhm/b$e;->a:Lhm/b;

    invoke-virtual {v0}, Lhm/b;->q()V

    return-void
.end method
