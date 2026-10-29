.class public final Ljv/s$o;
.super Ljv/s;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljv/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "o"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljv/s<",
        "Lokhttp3/MultipartBody$Part;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Ljv/s$o;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljv/s$o;

    invoke-direct {v0}, Ljv/s$o;-><init>()V

    sput-object v0, Ljv/s$o;->a:Ljv/s$o;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljv/s;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljv/v;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lokhttp3/MultipartBody$Part;

    invoke-virtual {p0, p1, p2}, Ljv/s$o;->d(Ljv/v;Lokhttp3/MultipartBody$Part;)V

    return-void
.end method

.method public d(Ljv/v;Lokhttp3/MultipartBody$Part;)V
    .locals 0

    if-eqz p2, :cond_0

    invoke-virtual {p1, p2}, Ljv/v;->e(Lokhttp3/MultipartBody$Part;)V

    :cond_0
    return-void
.end method
