.class public final synthetic Lz/x3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly1/c$c;


# instance fields
.field public final synthetic a:Lz/h4;

.field public final synthetic b:Lg0/m0;

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(Lz/h4;Lg0/m0;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz/x3;->a:Lz/h4;

    iput-object p2, p0, Lz/x3;->b:Lg0/m0;

    iput-wide p3, p0, Lz/x3;->c:J

    return-void
.end method


# virtual methods
.method public final a(Ly1/c$a;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lz/x3;->a:Lz/h4;

    iget-object v1, p0, Lz/x3;->b:Lg0/m0;

    iget-wide v2, p0, Lz/x3;->c:J

    invoke-static {v0, v1, v2, v3, p1}, Lz/h4;->c(Lz/h4;Lg0/m0;JLy1/c$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
