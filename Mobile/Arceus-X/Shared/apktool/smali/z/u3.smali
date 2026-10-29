.class public final synthetic Lz/u3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lz/h4;

.field public final synthetic b:Ly1/c$a;

.field public final synthetic c:Lg0/m0;

.field public final synthetic d:J


# direct methods
.method public synthetic constructor <init>(Lz/h4;Ly1/c$a;Lg0/m0;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz/u3;->a:Lz/h4;

    iput-object p2, p0, Lz/u3;->b:Ly1/c$a;

    iput-object p3, p0, Lz/u3;->c:Lg0/m0;

    iput-wide p4, p0, Lz/u3;->d:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lz/u3;->a:Lz/h4;

    iget-object v1, p0, Lz/u3;->b:Ly1/c$a;

    iget-object v2, p0, Lz/u3;->c:Lg0/m0;

    iget-wide v3, p0, Lz/u3;->d:J

    invoke-static {v0, v1, v2, v3, v4}, Lz/h4;->m(Lz/h4;Ly1/c$a;Lg0/m0;J)V

    return-void
.end method
