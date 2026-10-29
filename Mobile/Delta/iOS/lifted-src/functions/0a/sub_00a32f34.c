/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa32f34..0xa33004 (208 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_a32f08;
extern long long g_f086d8;
extern unsigned int g_f0d558;

long long sub_a32f34(void)
{
    unsigned long v3;  // cc_op
    unsigned long v6;  // cc_ndep
    unsigned long long v7;  // 4112
    unsigned long long v8;  // 4102
    unsigned long v9;  // cc_dep1
    unsigned long v10;  // cc_dep2
    long long v11;  // x0
    long long v12;  // x19
    unsigned long long v4;  // 4112
    unsigned long long v5;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_a7c208(&g_f086d8, &g_a32f08))
    {
        v4 = arm64g_calculate_condition(v3 | 16, v9, v10, v6);
        v5 = arm64g_calculate_condition(19, (v4 & 1 ? g_f0d558 : 0x40000000), 0, 0);
        if (v5 & 1)
            goto LABEL_a32fa0;
LABEL_a32f68:
        sub_a368c8();
        sub_a369bc("crypto/engine/eng_lib.c", 33, "ENGINE_new");
        sub_a36abc(38, 0x8000f, 0);
    }
    else
    {
        v7 = arm64g_calculate_condition(v3 | 16, v9, v10, v6);
        v8 = arm64g_calculate_condition(16, (v7 & 1 ? g_f0d558 : 0x40000000), 0, 0);
        if (!(v8 & 1))
            goto LABEL_a32f68;
LABEL_a32fa0:
        v11 = sub_a6bffc(224, "crypto/engine/eng_lib.c", 36);
        if (!v11)
            return v11;
        /* unsupported instruction */;
        *(unsigned int *)(v11 + 156) = 1;
        v12 = v11;
        if (sub_a6a660(10, v12, v11 + 168))
            return v12;
        sub_a6c2e4(v12, "crypto/engine/eng_lib.c", 45);
    }
    return 0;
}
