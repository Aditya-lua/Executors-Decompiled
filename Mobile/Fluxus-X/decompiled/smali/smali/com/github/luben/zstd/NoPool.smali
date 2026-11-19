.class public Lcom/github/luben/zstd/NoPool;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/github/luben/zstd/BufferPool;


# static fields
.field public static final INSTANCE:Lcom/github/luben/zstd/BufferPool;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/github/luben/zstd/NoPool;

    invoke-direct {v0}, Lcom/github/luben/zstd/NoPool;-><init>()V

    sput-object v0, Lcom/github/luben/zstd/NoPool;->INSTANCE:Lcom/github/luben/zstd/BufferPool;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public get(I)Ljava/nio/ByteBuffer;
    .locals 0

    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object p1

    return-object p1
.end method

.method public release(Ljava/nio/ByteBuffer;)V
    .locals 0

    return-void
.end method
