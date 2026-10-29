.class public final Ltd/t0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ltd/n0;


# direct methods
.method public constructor <init>(Ltd/n0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltd/t0;->a:Ltd/n0;

    return-void
.end method


# virtual methods
.method public final synthetic a(JJILtd/c$d;)Lcom/google/android/gms/tasks/Task;
    .locals 7

    iget-object v0, p0, Ltd/t0;->a:Ltd/n0;

    const/4 v6, 0x0

    move-wide v2, p1

    move-wide v4, p3

    move-object v1, p6

    invoke-virtual/range {v0 .. v6}, Ltd/n0;->c(Ltd/c$d;JJI)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
