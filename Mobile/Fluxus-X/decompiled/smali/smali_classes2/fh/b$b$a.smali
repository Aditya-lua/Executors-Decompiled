.class public Lfh/b$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfh/b$b;->onItemSet(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lfh/b$b;


# direct methods
.method public constructor <init>(Lfh/b$b;)V
    .locals 0

    iput-object p1, p0, Lfh/b$b$a;->a:Lfh/b$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lfh/b$b$a;->a:Lfh/b$b;

    iget-object v0, v0, Lfh/b$b;->a:Lfh/b;

    invoke-static {v0}, Lfh/b;->a(Lfh/b;)Lfh/b$d;

    move-result-object v0

    invoke-interface {v0}, Lfh/b$d;->e()V

    return-void
.end method
