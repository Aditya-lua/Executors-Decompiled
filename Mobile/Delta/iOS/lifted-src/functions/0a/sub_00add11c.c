/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xadd11c..0xadd204 (232 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_add11c(long long a0, long long a1, unsigned long a2, long long a3, unsigned long a4, long long a5, long long a6)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    long long v12;  // x0
    long long v13;  // w0
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (a1 != 1)
        return 0;
    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    switch (a3)
    {
    case 1:
        v13 = (unsigned int)sub_adcf50();
        break;
    case 3:
        v12 = sub_a6ac44(sub_af2694());
        if (!v12)
            v12 = sub_af267c();
        if (!sub_adcf50(a0, v12, 1, a5, a6))
        {
            sub_a368c8();
            sub_a369bc("crypto/x509/by_file.c", 0x44, "by_file_ctrl_ex");
            sub_a36abc(11, 104, 0);
            return 0;
        }
        return 1;
    default:
        v13 = (unsigned int)sub_adca18();
    }
    return v13 != 0;
}
