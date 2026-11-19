.class public final Lw0/b$a;
.super Ljava/lang/Exception;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw0/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lw0/b$a$a;
    }
.end annotation


# instance fields
.field public final a:Lw0/b$a$a;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lw0/b$a$a;)V
    .locals 0

    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    iput-object p2, p0, Lw0/b$a;->a:Lw0/b$a$a;

    return-void
.end method
