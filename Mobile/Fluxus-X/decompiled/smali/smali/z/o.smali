.class public final synthetic Lz/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly1/c$c;


# instance fields
.field public final synthetic a:Lz/y;

.field public final synthetic b:J


# direct methods
.method public synthetic constructor <init>(Lz/y;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz/o;->a:Lz/y;

    iput-wide p2, p0, Lz/o;->b:J

    return-void
.end method


# virtual methods
.method public final a(Ly1/c$a;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lz/o;->a:Lz/y;

    iget-wide v1, p0, Lz/o;->b:J

    invoke-static {v0, v1, v2, p1}, Lz/y;->v(Lz/y;JLy1/c$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
