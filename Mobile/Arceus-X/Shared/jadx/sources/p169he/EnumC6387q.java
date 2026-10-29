package p169he;

/* JADX INFO: renamed from: he.q */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC6387q {
    JAVA_VERSION("java.version"),
    JAVA_VENDOR("java.vendor"),
    JAVA_VENDOR_URL("java.vendor.url"),
    JAVA_HOME("java.home"),
    JAVA_VM_SPECIFICATION_VERSION("java.vm.specification.version"),
    JAVA_VM_SPECIFICATION_VENDOR("java.vm.specification.vendor"),
    JAVA_VM_SPECIFICATION_NAME("java.vm.specification.name"),
    JAVA_VM_VERSION("java.vm.version"),
    JAVA_VM_VENDOR("java.vm.vendor"),
    JAVA_VM_NAME("java.vm.name"),
    JAVA_SPECIFICATION_VERSION("java.specification.version"),
    JAVA_SPECIFICATION_VENDOR("java.specification.vendor"),
    JAVA_SPECIFICATION_NAME("java.specification.name"),
    JAVA_CLASS_VERSION("java.class.version"),
    JAVA_CLASS_PATH("java.class.path"),
    JAVA_LIBRARY_PATH("java.library.path"),
    JAVA_IO_TMPDIR("java.io.tmpdir"),
    JAVA_COMPILER("java.compiler"),
    JAVA_EXT_DIRS("java.ext.dirs"),
    OS_NAME("os.name"),
    OS_ARCH("os.arch"),
    OS_VERSION("os.version"),
    FILE_SEPARATOR("file.separator"),
    PATH_SEPARATOR("path.separator"),
    LINE_SEPARATOR("line.separator"),
    USER_NAME("user.name"),
    USER_HOME("user.home"),
    USER_DIR("user.dir");


    /* JADX INFO: renamed from: a */
    public final String f24312a;

    EnumC6387q(String str) {
        this.f24312a = str;
    }

    /* JADX INFO: renamed from: b */
    public String m27953b() {
        return this.f24312a;
    }

    /* JADX INFO: renamed from: c */
    public String m27954c() {
        return System.getProperty(this.f24312a);
    }

    @Override // java.lang.Enum
    public String toString() {
        String strM27953b = m27953b();
        String strM27954c = m27954c();
        StringBuilder sb2 = new StringBuilder(String.valueOf(strM27953b).length() + 1 + String.valueOf(strM27954c).length());
        sb2.append(strM27953b);
        sb2.append("=");
        sb2.append(strM27954c);
        return sb2.toString();
    }
}
