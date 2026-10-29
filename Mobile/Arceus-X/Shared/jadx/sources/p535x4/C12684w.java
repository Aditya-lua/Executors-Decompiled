package p535x4;

import hu.InterfaceC6567c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p006a5.AbstractC0072b;
import p006a5.InterfaceC0071a;

/* JADX INFO: renamed from: x4.w */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000 \n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a+\u0010\u0005\u001a\u00020\u00042\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\n\u001a\u00020\u0004*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\f\u001a\u00020\u0004*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\f\u0010\u000b¨\u0006\r"}, m31665d2 = {"", "", "migrationStartAndEndVersions", "migrationsNotRequiredFrom", "", "b", "(Ljava/util/Set;Ljava/util/Set;)V", "Lx4/u;", "Lx4/c;", "configuration", "a", "(Lx4/u;Lx4/c;)V", "c", "room-runtime"}, m31666k = 5, m31667mv = {2, 1, 0}, m31669xi = 48, m31670xs = "androidx/room/RoomDatabaseKt")
public final /* synthetic */ class C12684w {
    /* JADX INFO: renamed from: a */
    public static final void m47313a(@NotNull AbstractC12682u abstractC12682u, @NotNull C12654c configuration) {
        Intrinsics.checkNotNullParameter(abstractC12682u, "<this>");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Set<InterfaceC6567c<? extends InterfaceC0071a>> setMo6376w = abstractC12682u.mo6376w();
        int size = configuration.autoMigrationSpecs.size();
        boolean[] zArr = new boolean[size];
        Iterator<InterfaceC6567c<? extends InterfaceC0071a>> it = setMo6376w.iterator();
        while (true) {
            int i10 = -1;
            if (!it.hasNext()) {
                int size2 = configuration.autoMigrationSpecs.size() - 1;
                if (size2 >= 0) {
                    while (true) {
                        int i11 = size2 - 1;
                        if (size2 >= size || !zArr[size2]) {
                            throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                        }
                        if (i11 < 0) {
                            break;
                        } else {
                            size2 = i11;
                        }
                    }
                }
                for (AbstractC0072b abstractC0072b : abstractC12682u.mo6372j(linkedHashMap)) {
                    if (!configuration.migrationContainer.m47300c(abstractC0072b.startVersion, abstractC0072b.endVersion)) {
                        configuration.migrationContainer.m47298a(abstractC0072b);
                    }
                }
                return;
            }
            InterfaceC6567c<? extends InterfaceC0071a> next = it.next();
            int size3 = configuration.autoMigrationSpecs.size() - 1;
            if (size3 >= 0) {
                while (true) {
                    int i12 = size3 - 1;
                    if (next.mo28425b(configuration.autoMigrationSpecs.get(size3))) {
                        zArr[size3] = true;
                        i10 = size3;
                        break;
                    } else if (i12 < 0) {
                        break;
                    } else {
                        size3 = i12;
                    }
                }
            }
            if (i10 < 0) {
                throw new IllegalArgumentException(("A required auto migration spec (" + next.mo28426f() + ") is missing in the database configuration.").toString());
            }
            linkedHashMap.put(next, configuration.autoMigrationSpecs.get(i10));
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m47314b(@NotNull Set<Integer> migrationStartAndEndVersions, @NotNull Set<Integer> migrationsNotRequiredFrom) {
        Intrinsics.checkNotNullParameter(migrationStartAndEndVersions, "migrationStartAndEndVersions");
        Intrinsics.checkNotNullParameter(migrationsNotRequiredFrom, "migrationsNotRequiredFrom");
        if (migrationStartAndEndVersions.isEmpty()) {
            return;
        }
        Iterator<Integer> it = migrationStartAndEndVersions.iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            if (migrationsNotRequiredFrom.contains(Integer.valueOf(iIntValue))) {
                throw new IllegalArgumentException(("Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: " + iIntValue).toString());
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m47315c(@NotNull AbstractC12682u abstractC12682u, @NotNull C12654c configuration) {
        Intrinsics.checkNotNullParameter(abstractC12682u, "<this>");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Map<InterfaceC6567c<?>, List<InterfaceC6567c<?>>> mapM47283z = abstractC12682u.m47283z();
        boolean[] zArr = new boolean[configuration.typeConverters.size()];
        for (Map.Entry<InterfaceC6567c<?>, List<InterfaceC6567c<?>>> entry : mapM47283z.entrySet()) {
            InterfaceC6567c<?> key = entry.getKey();
            for (InterfaceC6567c<?> interfaceC6567c : entry.getValue()) {
                int size = configuration.typeConverters.size() - 1;
                if (size < 0) {
                    size = -1;
                    break;
                }
                while (true) {
                    int i10 = size - 1;
                    if (interfaceC6567c.mo28425b(configuration.typeConverters.get(size))) {
                        zArr[size] = true;
                        break;
                    } else {
                        if (i10 < 0) {
                            size = -1;
                            break;
                        }
                        size = i10;
                    }
                }
                if (size < 0) {
                    throw new IllegalArgumentException(("A required type converter (" + interfaceC6567c.mo28426f() + ") for " + key.mo28426f() + " is missing in the database configuration.").toString());
                }
                abstractC12682u.m47269f(interfaceC6567c, configuration.typeConverters.get(size));
            }
        }
        int size2 = configuration.typeConverters.size() - 1;
        if (size2 < 0) {
            return;
        }
        while (true) {
            int i11 = size2 - 1;
            if (!zArr[size2]) {
                throw new IllegalArgumentException("Unexpected type converter " + configuration.typeConverters.get(size2) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
            }
            if (i11 < 0) {
                return;
            } else {
                size2 = i11;
            }
        }
    }
}
