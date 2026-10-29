.class public final Ljv/b$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljv/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljv/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljv/h<",
        "Ljava/lang/Object;",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Ljv/b$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljv/b$d;

    invoke-direct {v0}, Ljv/b$d;-><init>()V

    sput-object v0, Ljv/b$d;->a:Ljv/b$d;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Ljv/b$d;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
