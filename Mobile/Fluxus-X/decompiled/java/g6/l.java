package g6;

import com.github.luben.zstd.BuildConfig;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00142\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0012¨\u0006\u0015"}, d2 = {"Lg6/l;", "Lg6/i;", "Ly4/u;", "__db", "<init>", "(Ly4/u;)V", "Lg6/h;", "preference", BuildConfig.FLAVOR, "a", "(Lg6/h;)V", BuildConfig.FLAVOR, "key", BuildConfig.FLAVOR, "b", "(Ljava/lang/String;)Ljava/lang/Long;", "Ly4/u;", "Ly4/f;", "Ly4/f;", "__insertAdapterOfPreference", "c", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l implements i {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final y4.u __db;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final y4.f<Preference> __insertAdapterOfPreference;

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"g6/l$a", "Ly4/f;", "Lg6/h;", BuildConfig.FLAVOR, "b", "()Ljava/lang/String;", "Lg5/d;", "statement", "entity", BuildConfig.FLAVOR, "g", "(Lg5/d;Lg6/h;)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends y4.f<Preference> {
        @Override // y4.f
        public String b() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        @Override // y4.f
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void a(g5.d statement, Preference entity) {
            Intrinsics.checkNotNullParameter(statement, "statement");
            Intrinsics.checkNotNullParameter(entity, "entity");
            statement.m0(1, entity.getKey());
            Long value = entity.getValue();
            if (value == null) {
                statement.F(2);
            } else {
                statement.B(2, value.longValue());
            }
        }
    }

    /* JADX INFO: renamed from: g6.l$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lg6/l$b;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "Lxu/c;", "a", "()Ljava/util/List;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<xu.c<?>> a() {
            return p001kotlin.collections.p.k();
        }

        public Companion() {
        }
    }

    public l(@NotNull y4.u __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.__db = __db;
        this.__insertAdapterOfPreference = new a();
    }

    public static final Long e(String str, String str2, g5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        g5.d dVarW3 = _connection.w3(str);
        try {
            dVarW3.m0(1, str2);
            Long lValueOf = null;
            if (dVarW3.n3() && !dVarW3.isNull(0)) {
                lValueOf = Long.valueOf(dVarW3.getLong(0));
            }
            return lValueOf;
        } finally {
            dVarW3.close();
        }
    }

    public static final Unit f(l lVar, Preference preference, g5.b _connection) throws Exception {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        lVar.__insertAdapterOfPreference.d(_connection, preference);
        return Unit.f21506a;
    }

    @Override // g6.i
    public void a(@NotNull final Preference preference) {
        Intrinsics.checkNotNullParameter(preference, "preference");
        d5.a.c(this.__db, false, true, new Function1() { // from class: g6.j
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l.f(this.f17319a, preference, (g5.b) obj);
            }
        });
    }

    @Override // g6.i
    @Nullable
    public Long b(@NotNull final String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        final String str = "SELECT long_value FROM Preference where `key`=?";
        return (Long) d5.a.c(this.__db, true, false, new Function1() { // from class: g6.k
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l.e(str, key, (g5.b) obj);
            }
        });
    }
}
