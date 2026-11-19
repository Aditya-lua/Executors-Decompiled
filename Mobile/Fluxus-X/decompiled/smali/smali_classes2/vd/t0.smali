.class public final Lvd/t0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lvd/n0;


# direct methods
.method public constructor <init>(Lvd/n0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvd/t0;->a:Lvd/n0;

    return-void
.end method


# virtual methods
.method public final synthetic a(JJILvd/c$d;)Lcom/google/android/gms/tasks/Task;
    .locals 7

    iget-object v0, p0, Lvd/t0;->a:Lvd/n0;

    const/4 v6, 0x0

    move-wide v2, p1

    move-wide v4, p3

    move-object v1, p6

    invoke-virtual/range {v0 .. v6}, Lvd/n0;->c(Lvd/c$d;JJI)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
