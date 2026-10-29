/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa5a074..0xa5a164 (240 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_a5baec;
extern char g_10002b0;

long long sub_a5a074(long long a0, long long a1)
{
    unsigned long v6;  // cc_op
    unsigned long v9;  // cc_ndep
    unsigned long long v10;  // 4110
    unsigned long long v11;  // 4102
    unsigned long v12;  // cc_dep1
    unsigned long v13;  // cc_dep2
    unsigned long v14;  // x0
    unsigned long long v7;  // 4110
    unsigned long long v8;  // 4102
    unsigned long v0;  // [bp-0x48]
    unsigned long v1;  // [bp-0x40]
    unsigned long v2;  // [bp-0x38]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v2 = *(long long *)&g_10002b0;
    v0 = 0;
    v1 = 0;
    if (sub_a55910(a1, &g_a5baec, &v0))
    {
        v7 = arm64g_calculate_condition(v6 | 16, v12, v13, v9);
        v8 = arm64g_calculate_condition(4, (v7 & 1 ? v1 : 0), 0, 0);
        if (v8 & 1)
            goto LABEL_a5a100;
LABEL_a5a0c8:
        sub_a368c8();
        sub_a369bc("crypto/evp/p_lib.c", 1699, "EVP_PKEY_set_type_by_keymgmt");
        sub_a36abc(6, 0xc0103, 0);
        v14 = 0;
    }
    else
    {
        v10 = arm64g_calculate_condition(v6 | 16, v12, v13, v9);
        v11 = arm64g_calculate_condition(0, (v10 & 1 ? v1 : 0), 0, 0);
        if (!(v11 & 1))
            goto LABEL_a5a0c8;
LABEL_a5a100:
        if (v0)
            _strlen(v0);
        v14 = sub_a5a8d8(a0, 0, 0, v0);
    }
    if (*(long long *)&g_10002b0 == v2)
        return v14;
    ___stack_chk_fail();
}
