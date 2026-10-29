package kh;

import android.content.Context;
import com.roblox.client.db.RobloxDatabase;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x4.n;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\nR \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000f¨\u0006\u0011"}, d2 = {"Lkh/c;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "userId", "Lcom/roblox/client/db/RobloxDatabase;", "c", "(Landroid/content/Context;Ljava/lang/String;)Lcom/roblox/client/db/RobloxDatabase;", "b", "(Landroid/content/Context;)Lcom/roblox/client/db/RobloxDatabase;", "a", "", "Ljava/util/Map;", "databaseMap", "database_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c f22315a = new c();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Map<String, RobloxDatabase> databaseMap = new LinkedHashMap();

    public final RobloxDatabase a(Context context, String userId) {
        return (RobloxDatabase) n.a(context, RobloxDatabase.class, "roblox-database-" + userId).e(true).d();
    }

    @Nullable
    public final RobloxDatabase b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return c(context, "default");
    }

    @Nullable
    public final synchronized RobloxDatabase c(@NotNull Context context, @NotNull String userId) {
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
                        RobloxDatabase robloxDatabaseA = f22315a.a(context, userId);
                        map.put(userId, robloxDatabaseA);
                        robloxDatabase = robloxDatabaseA;
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return robloxDatabase;
    }
}
