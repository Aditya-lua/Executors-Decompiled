.class public interface abstract Ly5/a0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly5/a0$b;
    }
.end annotation


# static fields
.field public static final a:Ly5/a0$b$c;

.field public static final b:Ly5/a0$b$b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ly5/a0$b$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ly5/a0$b$c;-><init>(Ly5/a0$a;)V

    sput-object v0, Ly5/a0;->a:Ly5/a0$b$c;

    new-instance v0, Ly5/a0$b$b;

    invoke-direct {v0, v1}, Ly5/a0$b$b;-><init>(Ly5/a0$a;)V

    sput-object v0, Ly5/a0;->b:Ly5/a0$b$b;

    return-void
.end method
