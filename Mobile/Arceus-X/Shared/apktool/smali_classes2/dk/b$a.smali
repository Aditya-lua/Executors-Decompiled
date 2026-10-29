.class public Ldk/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldk/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldk/b;->b(Ldk/b$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ldk/b;


# direct methods
.method public constructor <init>(Ldk/b;)V
    .locals 0

    iput-object p1, p0, Ldk/b$a;->a:Ldk/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 1

    invoke-static {p1}, Lol/a;->b(Ljava/lang/String;)Lol/a;

    move-result-object p1

    invoke-static {}, Lfk/c;->c()Lfk/c;

    move-result-object v0

    invoke-virtual {v0, p1}, Lfk/c;->u(Lol/a;)V

    iget-object v0, p0, Ldk/b$a;->a:Ldk/b;

    invoke-static {v0, p1}, Ldk/b;->a(Ldk/b;Lol/a;)V

    return-void
.end method
