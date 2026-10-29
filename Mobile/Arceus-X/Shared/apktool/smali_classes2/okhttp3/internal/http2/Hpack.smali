.class public final Lokhttp3/internal/http2/Hpack;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokhttp3/internal/http2/Hpack$Reader;,
        Lokhttp3/internal/http2/Hpack$Writer;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u000c\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u00c6\u0002\u0018\u00002\u00020\u0001:\u0002\u001c\u001dB\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u0014\u0010\u000c\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\rR\u0014\u0010\u0012\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\rR\u001d\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R#\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u0008\u00a8\u0006\u001e"
    }
    d2 = {
        "Lokhttp3/internal/http2/Hpack;",
        "",
        "<init>",
        "()V",
        "",
        "Lxu/h;",
        "",
        "nameToFirstIndex",
        "()Ljava/util/Map;",
        "name",
        "checkLowercase",
        "(Lxu/h;)Lxu/h;",
        "PREFIX_4_BITS",
        "I",
        "PREFIX_5_BITS",
        "PREFIX_6_BITS",
        "PREFIX_7_BITS",
        "SETTINGS_HEADER_TABLE_SIZE",
        "SETTINGS_HEADER_TABLE_SIZE_LIMIT",
        "",
        "Lokhttp3/internal/http2/Header;",
        "STATIC_HEADER_TABLE",
        "[Lokhttp3/internal/http2/Header;",
        "getSTATIC_HEADER_TABLE",
        "()[Lokhttp3/internal/http2/Header;",
        "NAME_TO_FIRST_INDEX",
        "Ljava/util/Map;",
        "getNAME_TO_FIRST_INDEX",
        "Reader",
        "Writer",
        "okhttp"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lokhttp3/internal/http2/Hpack;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final NAME_TO_FIRST_INDEX:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lxu/h;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final PREFIX_4_BITS:I = 0xf

.field private static final PREFIX_5_BITS:I = 0x1f

.field private static final PREFIX_6_BITS:I = 0x3f

.field private static final PREFIX_7_BITS:I = 0x7f

.field private static final SETTINGS_HEADER_TABLE_SIZE:I = 0x1000

.field private static final SETTINGS_HEADER_TABLE_SIZE_LIMIT:I = 0x4000

.field private static final STATIC_HEADER_TABLE:[Lokhttp3/internal/http2/Header;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 64

    new-instance v0, Lokhttp3/internal/http2/Hpack;

    invoke-direct {v0}, Lokhttp3/internal/http2/Hpack;-><init>()V

    sput-object v0, Lokhttp3/internal/http2/Hpack;->INSTANCE:Lokhttp3/internal/http2/Hpack;

    new-instance v1, Lokhttp3/internal/http2/Header;

    sget-object v2, Lokhttp3/internal/http2/Header;->TARGET_AUTHORITY:Lxu/h;

    const-string v3, ""

    invoke-direct {v1, v2, v3}, Lokhttp3/internal/http2/Header;-><init>(Lxu/h;Ljava/lang/String;)V

    new-instance v2, Lokhttp3/internal/http2/Header;

    sget-object v4, Lokhttp3/internal/http2/Header;->TARGET_METHOD:Lxu/h;

    const-string v5, "GET"

    invoke-direct {v2, v4, v5}, Lokhttp3/internal/http2/Header;-><init>(Lxu/h;Ljava/lang/String;)V

    new-instance v5, Lokhttp3/internal/http2/Header;

    const-string v6, "POST"

    invoke-direct {v5, v4, v6}, Lokhttp3/internal/http2/Header;-><init>(Lxu/h;Ljava/lang/String;)V

    new-instance v4, Lokhttp3/internal/http2/Header;

    sget-object v6, Lokhttp3/internal/http2/Header;->TARGET_PATH:Lxu/h;

    const-string v7, "/"

    invoke-direct {v4, v6, v7}, Lokhttp3/internal/http2/Header;-><init>(Lxu/h;Ljava/lang/String;)V

    move-object v7, v5

    new-instance v5, Lokhttp3/internal/http2/Header;

    const-string v8, "/index.html"

    invoke-direct {v5, v6, v8}, Lokhttp3/internal/http2/Header;-><init>(Lxu/h;Ljava/lang/String;)V

    new-instance v6, Lokhttp3/internal/http2/Header;

    sget-object v8, Lokhttp3/internal/http2/Header;->TARGET_SCHEME:Lxu/h;

    const-string v9, "http"

    invoke-direct {v6, v8, v9}, Lokhttp3/internal/http2/Header;-><init>(Lxu/h;Ljava/lang/String;)V

    move-object v9, v7

    new-instance v7, Lokhttp3/internal/http2/Header;

    const-string v10, "https"

    invoke-direct {v7, v8, v10}, Lokhttp3/internal/http2/Header;-><init>(Lxu/h;Ljava/lang/String;)V

    new-instance v8, Lokhttp3/internal/http2/Header;

    sget-object v10, Lokhttp3/internal/http2/Header;->RESPONSE_STATUS:Lxu/h;

    const-string v11, "200"

    invoke-direct {v8, v10, v11}, Lokhttp3/internal/http2/Header;-><init>(Lxu/h;Ljava/lang/String;)V

    move-object v11, v9

    new-instance v9, Lokhttp3/internal/http2/Header;

    const-string v12, "204"

    invoke-direct {v9, v10, v12}, Lokhttp3/internal/http2/Header;-><init>(Lxu/h;Ljava/lang/String;)V

    new-instance v12, Lokhttp3/internal/http2/Header;

    const-string v13, "206"

    invoke-direct {v12, v10, v13}, Lokhttp3/internal/http2/Header;-><init>(Lxu/h;Ljava/lang/String;)V

    move-object v13, v11

    new-instance v11, Lokhttp3/internal/http2/Header;

    const-string v14, "304"

    invoke-direct {v11, v10, v14}, Lokhttp3/internal/http2/Header;-><init>(Lxu/h;Ljava/lang/String;)V

    move-object v14, v12

    new-instance v12, Lokhttp3/internal/http2/Header;

    const-string v15, "400"

    invoke-direct {v12, v10, v15}, Lokhttp3/internal/http2/Header;-><init>(Lxu/h;Ljava/lang/String;)V

    move-object v15, v13

    new-instance v13, Lokhttp3/internal/http2/Header;

    move-object/from16 v62, v0

    const-string v0, "404"

    invoke-direct {v13, v10, v0}, Lokhttp3/internal/http2/Header;-><init>(Lxu/h;Ljava/lang/String;)V

    move-object v0, v14

    new-instance v14, Lokhttp3/internal/http2/Header;

    move-object/from16 v16, v0

    const-string v0, "500"

    invoke-direct {v14, v10, v0}, Lokhttp3/internal/http2/Header;-><init>(Lxu/h;Ljava/lang/String;)V

    move-object v0, v15

    new-instance v15, Lokhttp3/internal/http2/Header;

    const-string v10, "accept-charset"

    invoke-direct {v15, v10, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v10, Lokhttp3/internal/http2/Header;

    move-object/from16 v17, v0

    const-string v0, "accept-encoding"

    move-object/from16 v18, v1

    const-string v1, "gzip, deflate"

    invoke-direct {v10, v0, v1}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lokhttp3/internal/http2/Header;

    const-string v1, "accept-language"

    invoke-direct {v0, v1, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Lokhttp3/internal/http2/Header;

    move-object/from16 v19, v0

    const-string v0, "accept-ranges"

    invoke-direct {v1, v0, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lokhttp3/internal/http2/Header;

    move-object/from16 v20, v1

    const-string v1, "accept"

    invoke-direct {v0, v1, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Lokhttp3/internal/http2/Header;

    move-object/from16 v21, v0

    const-string v0, "access-control-allow-origin"

    invoke-direct {v1, v0, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lokhttp3/internal/http2/Header;

    move-object/from16 v22, v1

    const-string v1, "age"

    invoke-direct {v0, v1, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Lokhttp3/internal/http2/Header;

    move-object/from16 v23, v0

    const-string v0, "allow"

    invoke-direct {v1, v0, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lokhttp3/internal/http2/Header;

    move-object/from16 v24, v1

    const-string v1, "authorization"

    invoke-direct {v0, v1, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Lokhttp3/internal/http2/Header;

    move-object/from16 v25, v0

    const-string v0, "cache-control"

    invoke-direct {v1, v0, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lokhttp3/internal/http2/Header;

    move-object/from16 v26, v1

    const-string v1, "content-disposition"

    invoke-direct {v0, v1, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Lokhttp3/internal/http2/Header;

    move-object/from16 v27, v0

    const-string v0, "content-encoding"

    invoke-direct {v1, v0, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lokhttp3/internal/http2/Header;

    move-object/from16 v28, v1

    const-string v1, "content-language"

    invoke-direct {v0, v1, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Lokhttp3/internal/http2/Header;

    move-object/from16 v29, v0

    const-string v0, "content-length"

    invoke-direct {v1, v0, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lokhttp3/internal/http2/Header;

    move-object/from16 v30, v1

    const-string v1, "content-location"

    invoke-direct {v0, v1, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Lokhttp3/internal/http2/Header;

    move-object/from16 v31, v0

    const-string v0, "content-range"

    invoke-direct {v1, v0, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lokhttp3/internal/http2/Header;

    move-object/from16 v32, v1

    const-string v1, "content-type"

    invoke-direct {v0, v1, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Lokhttp3/internal/http2/Header;

    move-object/from16 v33, v0

    const-string v0, "cookie"

    invoke-direct {v1, v0, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lokhttp3/internal/http2/Header;

    move-object/from16 v34, v1

    const-string v1, "date"

    invoke-direct {v0, v1, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Lokhttp3/internal/http2/Header;

    move-object/from16 v35, v0

    const-string v0, "etag"

    invoke-direct {v1, v0, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lokhttp3/internal/http2/Header;

    move-object/from16 v36, v1

    const-string v1, "expect"

    invoke-direct {v0, v1, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Lokhttp3/internal/http2/Header;

    move-object/from16 v37, v0

    const-string v0, "expires"

    invoke-direct {v1, v0, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lokhttp3/internal/http2/Header;

    move-object/from16 v38, v1

    const-string v1, "from"

    invoke-direct {v0, v1, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Lokhttp3/internal/http2/Header;

    move-object/from16 v39, v0

    const-string v0, "host"

    invoke-direct {v1, v0, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lokhttp3/internal/http2/Header;

    move-object/from16 v40, v1

    const-string v1, "if-match"

    invoke-direct {v0, v1, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Lokhttp3/internal/http2/Header;

    move-object/from16 v41, v0

    const-string v0, "if-modified-since"

    invoke-direct {v1, v0, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lokhttp3/internal/http2/Header;

    move-object/from16 v42, v1

    const-string v1, "if-none-match"

    invoke-direct {v0, v1, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Lokhttp3/internal/http2/Header;

    move-object/from16 v43, v0

    const-string v0, "if-range"

    invoke-direct {v1, v0, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lokhttp3/internal/http2/Header;

    move-object/from16 v44, v1

    const-string v1, "if-unmodified-since"

    invoke-direct {v0, v1, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Lokhttp3/internal/http2/Header;

    move-object/from16 v45, v0

    const-string v0, "last-modified"

    invoke-direct {v1, v0, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lokhttp3/internal/http2/Header;

    move-object/from16 v46, v1

    const-string v1, "link"

    invoke-direct {v0, v1, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Lokhttp3/internal/http2/Header;

    move-object/from16 v47, v0

    const-string v0, "location"

    invoke-direct {v1, v0, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lokhttp3/internal/http2/Header;

    move-object/from16 v48, v1

    const-string v1, "max-forwards"

    invoke-direct {v0, v1, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Lokhttp3/internal/http2/Header;

    move-object/from16 v49, v0

    const-string v0, "proxy-authenticate"

    invoke-direct {v1, v0, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lokhttp3/internal/http2/Header;

    move-object/from16 v50, v1

    const-string v1, "proxy-authorization"

    invoke-direct {v0, v1, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Lokhttp3/internal/http2/Header;

    move-object/from16 v51, v0

    const-string v0, "range"

    invoke-direct {v1, v0, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lokhttp3/internal/http2/Header;

    move-object/from16 v52, v1

    const-string v1, "referer"

    invoke-direct {v0, v1, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Lokhttp3/internal/http2/Header;

    move-object/from16 v53, v0

    const-string v0, "refresh"

    invoke-direct {v1, v0, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lokhttp3/internal/http2/Header;

    move-object/from16 v54, v1

    const-string v1, "retry-after"

    invoke-direct {v0, v1, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Lokhttp3/internal/http2/Header;

    move-object/from16 v55, v0

    const-string v0, "server"

    invoke-direct {v1, v0, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lokhttp3/internal/http2/Header;

    move-object/from16 v56, v1

    const-string v1, "set-cookie"

    invoke-direct {v0, v1, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Lokhttp3/internal/http2/Header;

    move-object/from16 v57, v0

    const-string v0, "strict-transport-security"

    invoke-direct {v1, v0, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lokhttp3/internal/http2/Header;

    move-object/from16 v58, v1

    const-string v1, "transfer-encoding"

    invoke-direct {v0, v1, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Lokhttp3/internal/http2/Header;

    move-object/from16 v59, v0

    const-string v0, "user-agent"

    invoke-direct {v1, v0, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lokhttp3/internal/http2/Header;

    move-object/from16 v60, v1

    const-string v1, "vary"

    invoke-direct {v0, v1, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Lokhttp3/internal/http2/Header;

    move-object/from16 v61, v0

    const-string v0, "via"

    invoke-direct {v1, v0, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lokhttp3/internal/http2/Header;

    move-object/from16 v63, v1

    const-string v1, "www-authenticate"

    invoke-direct {v0, v1, v3}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v1, v16

    move-object/from16 v16, v10

    move-object v10, v1

    move-object/from16 v3, v17

    move-object/from16 v1, v18

    move-object/from16 v17, v19

    move-object/from16 v18, v20

    move-object/from16 v19, v21

    move-object/from16 v20, v22

    move-object/from16 v21, v23

    move-object/from16 v22, v24

    move-object/from16 v23, v25

    move-object/from16 v24, v26

    move-object/from16 v25, v27

    move-object/from16 v26, v28

    move-object/from16 v27, v29

    move-object/from16 v28, v30

    move-object/from16 v29, v31

    move-object/from16 v30, v32

    move-object/from16 v31, v33

    move-object/from16 v32, v34

    move-object/from16 v33, v35

    move-object/from16 v34, v36

    move-object/from16 v35, v37

    move-object/from16 v36, v38

    move-object/from16 v37, v39

    move-object/from16 v38, v40

    move-object/from16 v39, v41

    move-object/from16 v40, v42

    move-object/from16 v41, v43

    move-object/from16 v42, v44

    move-object/from16 v43, v45

    move-object/from16 v44, v46

    move-object/from16 v45, v47

    move-object/from16 v46, v48

    move-object/from16 v47, v49

    move-object/from16 v48, v50

    move-object/from16 v49, v51

    move-object/from16 v50, v52

    move-object/from16 v51, v53

    move-object/from16 v52, v54

    move-object/from16 v53, v55

    move-object/from16 v54, v56

    move-object/from16 v55, v57

    move-object/from16 v56, v58

    move-object/from16 v57, v59

    move-object/from16 v58, v60

    move-object/from16 v59, v61

    move-object/from16 v60, v63

    move-object/from16 v61, v0

    filled-new-array/range {v1 .. v61}, [Lokhttp3/internal/http2/Header;

    move-result-object v0

    sput-object v0, Lokhttp3/internal/http2/Hpack;->STATIC_HEADER_TABLE:[Lokhttp3/internal/http2/Header;

    invoke-direct/range {v62 .. v62}, Lokhttp3/internal/http2/Hpack;->nameToFirstIndex()Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lokhttp3/internal/http2/Hpack;->NAME_TO_FIRST_INDEX:Ljava/util/Map;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final nameToFirstIndex()Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lxu/h;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/LinkedHashMap;

    sget-object v1, Lokhttp3/internal/http2/Hpack;->STATIC_HEADER_TABLE:[Lokhttp3/internal/http2/Header;

    array-length v2, v1

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-direct {v0, v2, v3}, Ljava/util/LinkedHashMap;-><init>(IF)V

    array-length v1, v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    sget-object v3, Lokhttp3/internal/http2/Hpack;->STATIC_HEADER_TABLE:[Lokhttp3/internal/http2/Header;

    aget-object v4, v3, v2

    iget-object v4, v4, Lokhttp3/internal/http2/Header;->name:Lxu/h;

    invoke-virtual {v0, v4}, Ljava/util/AbstractMap;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    aget-object v3, v3, v2

    iget-object v3, v3, Lokhttp3/internal/http2/Header;->name:Lxu/h;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v0, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    const-string v1, "unmodifiableMap(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public final checkLowercase(Lxu/h;)Lxu/h;
    .locals 4
    .param p1    # Lxu/h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lxu/h;->I()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    invoke-virtual {p1, v1}, Lxu/h;->j(I)B

    move-result v2

    const/16 v3, 0x41

    if-gt v3, v2, :cond_1

    const/16 v3, 0x5b

    if-lt v2, v3, :cond_0

    goto :goto_1

    :cond_0
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "PROTOCOL_ERROR response malformed: mixed case name: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lxu/h;->P()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-object p1
.end method

.method public final getNAME_TO_FIRST_INDEX()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lxu/h;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lokhttp3/internal/http2/Hpack;->NAME_TO_FIRST_INDEX:Ljava/util/Map;

    return-object v0
.end method

.method public final getSTATIC_HEADER_TABLE()[Lokhttp3/internal/http2/Header;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lokhttp3/internal/http2/Hpack;->STATIC_HEADER_TABLE:[Lokhttp3/internal/http2/Header;

    return-object v0
.end method
