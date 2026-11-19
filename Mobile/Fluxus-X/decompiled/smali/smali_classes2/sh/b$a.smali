.class public Lsh/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lsh/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lsh/b;


# direct methods
.method public constructor <init>(Lsh/b;)V
    .locals 0

    iput-object p1, p0, Lsh/b$a;->a:Lsh/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lsh/b$a;->a:Lsh/b;

    sget-object v1, Lsh/b$c;->a:Lsh/b$c;

    invoke-static {v0, v1}, Lsh/b;->a(Lsh/b;Lsh/b$c;)V

    iget-object v0, p0, Lsh/b$a;->a:Lsh/b;

    invoke-virtual {v0}, Lsh/b;->c()V

    return-void
.end method
