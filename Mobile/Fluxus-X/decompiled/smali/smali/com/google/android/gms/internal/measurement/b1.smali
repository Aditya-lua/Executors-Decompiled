.class public abstract Lcom/google/android/gms/internal/measurement/b1;
.super Landroid/database/sqlite/SQLiteOpenHelper;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V
    .locals 1

    sget-object p3, Lcom/google/android/gms/internal/measurement/e1;->a:Lcom/google/android/gms/internal/measurement/e1;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/y0;->a()Lcom/google/android/gms/internal/measurement/z0;

    const-string p3, ""

    invoke-virtual {p2, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    const/4 p4, 0x0

    const/4 v0, 0x1

    if-ne v0, p3, :cond_0

    move-object p2, p4

    :cond_0
    invoke-direct {p0, p1, p2, p4, v0}, Landroid/database/sqlite/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V

    return-void
.end method
