package x4;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a+\u0010\u0005\u001a\u00020\u00042\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\n\u001a\u00020\u0004*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\f\u001a\u00020\u0004*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"", "", "migrationStartAndEndVersions", "migrationsNotRequiredFrom", "", "b", "(Ljava/util/Set;Ljava/util/Set;)V", "Lx4/u;", "Lx4/c;", "configuration", "a", "(Lx4/u;Lx4/c;)V", "c", "room-runtime"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "androidx/room/RoomDatabaseKt")
public final /* synthetic */ class w {
    public static final void a(@NotNull u uVar, @NotNull c configuration) {
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Set<hu.c<? extends a5.a>> setW = uVar.w();
        int size = configuration.autoMigrationSpecs.size();
        boolean[] zArr = new boolean[size];
        Iterator<hu.c<? extends a5.a>> it = setW.iterator();
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
                for (a5.b bVar : uVar.j(linkedHashMap)) {
                    if (!configuration.migrationContainer.c(bVar.startVersion, bVar.endVersion)) {
                        configuration.migrationContainer.a(bVar);
                    }
                }
                return;
            }
            hu.c<? extends a5.a> next = it.next();
            int size3 = configuration.autoMigrationSpecs.size() - 1;
            if (size3 >= 0) {
                while (true) {
                    int i12 = size3 - 1;
                    if (next.b(configuration.autoMigrationSpecs.get(size3))) {
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
                throw new IllegalArgumentException(("A required auto migration spec (" + next.f() + ") is missing in the database configuration.").toString());
            }
            linkedHashMap.put(next, configuration.autoMigrationSpecs.get(i10));
        }
    }

    public static final void b(@NotNull Set<Integer> migrationStartAndEndVersions, @NotNull Set<Integer> migrationsNotRequiredFrom) {
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

    public static final void c(@NotNull u uVar, @NotNull c configuration) {
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Map<hu.c<?>, List<hu.c<?>>> mapZ = uVar.z();
        boolean[] zArr = new boolean[configuration.typeConverters.size()];
        for (Map.Entry<hu.c<?>, List<hu.c<?>>> entry : mapZ.entrySet()) {
            hu.c<?> key = entry.getKey();
            for (hu.c<?> cVar : entry.getValue()) {
                int size = configuration.typeConverters.size() - 1;
                if (size < 0) {
                    size = -1;
                    break;
                }
                while (true) {
                    int i10 = size - 1;
                    if (cVar.b(configuration.typeConverters.get(size))) {
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
                    throw new IllegalArgumentException(("A required type converter (" + cVar.f() + ") for " + key.f() + " is missing in the database configuration.").toString());
                }
                uVar.f(cVar, configuration.typeConverters.get(size));
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
