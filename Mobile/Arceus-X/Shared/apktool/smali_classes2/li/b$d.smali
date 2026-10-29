.class public Lli/b$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lli/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "d"
.end annotation


# instance fields
.field public a:Ljava/lang/String;

.field public b:I

.field public c:Ljava/net/Socket;

.field public d:I

.field public final synthetic e:Lli/b;


# direct methods
.method public constructor <init>(Lli/b;)V
    .locals 0

    iput-object p1, p0, Lli/b$d;->e:Lli/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
