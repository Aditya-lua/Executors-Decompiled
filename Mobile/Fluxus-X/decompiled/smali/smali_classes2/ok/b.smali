.class public final synthetic Lok/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lok/a$a;


# instance fields
.field public final synthetic a:Lok/c;

.field public final synthetic b:Lok/a$a;


# direct methods
.method public synthetic constructor <init>(Lok/c;Lok/a$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lok/b;->a:Lok/c;

    iput-object p2, p0, Lok/b;->b:Lok/a$a;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lok/b;->a:Lok/c;

    iget-object v1, p0, Lok/b;->b:Lok/a$a;

    invoke-static {v0, v1, p1}, Lok/c;->b(Lok/c;Lok/a$a;Ljava/lang/String;)V

    return-void
.end method
