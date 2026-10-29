.class public final synthetic Lgk/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgk/a$a;


# instance fields
.field public final synthetic a:Lgk/c;

.field public final synthetic b:Lgk/a$a;


# direct methods
.method public synthetic constructor <init>(Lgk/c;Lgk/a$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgk/b;->a:Lgk/c;

    iput-object p2, p0, Lgk/b;->b:Lgk/a$a;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lgk/b;->a:Lgk/c;

    iget-object v1, p0, Lgk/b;->b:Lgk/a$a;

    invoke-static {v0, v1, p1}, Lgk/c;->b(Lgk/c;Lgk/a$a;Ljava/lang/String;)V

    return-void
.end method
