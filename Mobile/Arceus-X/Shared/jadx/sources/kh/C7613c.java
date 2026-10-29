package kh;

import android.content.Context;
import com.roblox.client.p050db.RobloxDatabase;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p535x4.C12675n;

/* JADX INFO: renamed from: kh.c */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\nR \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000f¨\u0006\u0011"}, m31665d2 = {"Lkh/c;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "userId", "Lcom/roblox/client/db/RobloxDatabase;", "c", "(Landroid/content/Context;Ljava/lang/String;)Lcom/roblox/client/db/RobloxDatabase;", "b", "(Landroid/content/Context;)Lcom/roblox/client/db/RobloxDatabase;", "a", "", "Ljava/util/Map;", "databaseMap", "database_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C7613c {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C7613c f29132a = new C7613c();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Map<String, RobloxDatabase> databaseMap = new LinkedHashMap();

    /* JADX INFO: renamed from: a */
    public final RobloxDatabase m31497a(Context context, String userId) {
        return (RobloxDatabase) C12675n.m47228a(context, RobloxDatabase.class, "roblox-database-" + userId).m47288e(true).m47287d();
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final RobloxDatabase m31498b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return m31499c(context, "default");
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final synchronized RobloxDatabase m31499c(@NotNull Context context, @NotNull String userId) {
        RobloxDatabase robloxDatabase;
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(userId, "userId");
            Map<String, RobloxDatabase> map = databaseMap;
            robloxDatabase = map.get(userId);
            if (robloxDatabase == null) {
                synchronized (this) {
                    robloxDatabase = map.get(userId);
                    if (robloxDatabase == null) {
                        RobloxDatabase robloxDatabaseM31497a = f29132a.m31497a(context, userId);
                        map.put(userId, robloxDatabaseM31497a);
                        robloxDatabase = robloxDatabaseM31497a;
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return robloxDatabase;
    }
}
