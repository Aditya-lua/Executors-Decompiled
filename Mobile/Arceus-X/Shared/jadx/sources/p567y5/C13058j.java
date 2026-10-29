package p567y5;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p006a5.AbstractC0072b;
import p145g5.InterfaceC6008c;

/* JADX INFO: renamed from: y5.j */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"Ly5/j;", "La5/b;", "<init>", "()V", "Lg5/c;", "db", "", "b", "(Lg5/c;)V", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C13058j extends AbstractC0072b {

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final C13058j f46220c = new C13058j();

    public C13058j() {
        super(1, 2);
    }

    @Override // p006a5.AbstractC0072b
    /* JADX INFO: renamed from: b */
    public void mo176b(@NotNull InterfaceC6008c db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        db2.mo6899R("\n    CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id`\n    INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
        db2.mo6899R("\n    INSERT INTO SystemIdInfo(work_spec_id, system_id)\n    SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo\n    ");
        db2.mo6899R("DROP TABLE IF EXISTS alarmInfo");
        db2.mo6899R("\n                INSERT OR IGNORE INTO worktag(tag, work_spec_id)\n                SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec\n                ");
    }
}
