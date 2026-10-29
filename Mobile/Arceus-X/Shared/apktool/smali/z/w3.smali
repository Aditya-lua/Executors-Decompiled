.class public final synthetic Lz/w3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz/y$c;


# instance fields
.field public final synthetic a:Lz/h4;

.field public final synthetic b:J

.field public final synthetic c:Ly1/c$a;


# direct methods
.method public synthetic constructor <init>(Lz/h4;JLy1/c$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz/w3;->a:Lz/h4;

    iput-wide p2, p0, Lz/w3;->b:J

    iput-object p4, p0, Lz/w3;->c:Ly1/c$a;

    return-void
.end method


# virtual methods
.method public final a(Landroid/hardware/camera2/TotalCaptureResult;)Z
    .locals 4

    iget-object v0, p0, Lz/w3;->a:Lz/h4;

    iget-wide v1, p0, Lz/w3;->b:J

    iget-object v3, p0, Lz/w3;->c:Ly1/c$a;

    invoke-static {v0, v1, v2, v3, p1}, Lz/h4;->h(Lz/h4;JLy1/c$a;Landroid/hardware/camera2/TotalCaptureResult;)Z

    move-result p1

    return p1
.end method
