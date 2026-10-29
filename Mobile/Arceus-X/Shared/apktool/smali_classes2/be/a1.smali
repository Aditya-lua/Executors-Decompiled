.class public final Lbe/a1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/nio/ByteBuffer;

.field public final b:J

.field public final c:J

.field public final d:J

.field public final e:Ljava/nio/ByteBuffer;


# direct methods
.method public synthetic constructor <init>(Ljava/nio/ByteBuffer;JJJLjava/nio/ByteBuffer;Lbe/z0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbe/a1;->a:Ljava/nio/ByteBuffer;

    iput-wide p2, p0, Lbe/a1;->b:J

    iput-wide p4, p0, Lbe/a1;->c:J

    iput-wide p6, p0, Lbe/a1;->d:J

    iput-object p8, p0, Lbe/a1;->e:Ljava/nio/ByteBuffer;

    return-void
.end method

.method public static bridge synthetic a(Lbe/a1;)J
    .locals 2

    iget-wide v0, p0, Lbe/a1;->b:J

    return-wide v0
.end method

.method public static bridge synthetic b(Lbe/a1;)J
    .locals 2

    iget-wide v0, p0, Lbe/a1;->c:J

    return-wide v0
.end method

.method public static bridge synthetic c(Lbe/a1;)J
    .locals 2

    iget-wide v0, p0, Lbe/a1;->d:J

    return-wide v0
.end method

.method public static bridge synthetic d(Lbe/a1;)Ljava/nio/ByteBuffer;
    .locals 0

    iget-object p0, p0, Lbe/a1;->e:Ljava/nio/ByteBuffer;

    return-object p0
.end method

.method public static bridge synthetic e(Lbe/a1;)Ljava/nio/ByteBuffer;
    .locals 0

    iget-object p0, p0, Lbe/a1;->a:Ljava/nio/ByteBuffer;

    return-object p0
.end method
