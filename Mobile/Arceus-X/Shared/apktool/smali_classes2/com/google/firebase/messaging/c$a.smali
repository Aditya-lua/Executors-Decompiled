.class public Lcom/google/firebase/messaging/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/firebase/messaging/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:Lk2/k$f;

.field public final b:Ljava/lang/String;

.field public final c:I


# direct methods
.method public constructor <init>(Lk2/k$f;Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/messaging/c$a;->a:Lk2/k$f;

    iput-object p2, p0, Lcom/google/firebase/messaging/c$a;->b:Ljava/lang/String;

    iput p3, p0, Lcom/google/firebase/messaging/c$a;->c:I

    return-void
.end method
