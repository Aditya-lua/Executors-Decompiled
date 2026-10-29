/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x96ede8..0x96ee98 (176 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_96ede8_0 {
    char padding_0[8];
    struct st_96ede8_1 *field_8;
} st_96ede8_0;

typedef struct st_96ede8_1 {
    long long field_0;
    char padding_8[1128];
    long long field_470;
} st_96ede8_1;


unsigned long long sub_96ede8(st_96ede8_0 *a0, long long a1, long long a2, long long a3, long long a4, long long a5, long long a6, long long a7, unsigned long a8, long long a9)
{
    unsigned long long v2;  // x0
    unsigned long v3;  // cc_op
    unsigned long v6;  // cc_ndep
    unsigned long long v7;  // 4112
    unsigned long long v8;  // 4102
    unsigned long v9;  // cc_dep1
    unsigned long v10;  // cc_dep2
    unsigned long long v4;  // 4112
    unsigned long long v5;  // 4102
    long long v0;  // [bp-0x30]
    char *v1;  // [bp-0x10]

    v1 = &a8;
    *(unsigned int *)&v0 = !a9;
    v2 = sub_96eae0(a0->field_8->field_0, a0->field_8->field_470, a1, a2, a3, a4, a5, a6, a7, a8, v0);
    if (a9)
    {
        v4 = arm64g_calculate_condition(v3 | 16, v9, v10, v6);
        v5 = arm64g_calculate_condition(19, (v4 & 1 ? v2 & 0xffffffff : 0), 0, 0);
        if (v5 & 1)
            return v2;
    }
    else
    {
        v7 = arm64g_calculate_condition(v3 | 16, v9, v10, v6);
        v8 = arm64g_calculate_condition(16, (v7 & 1 ? v2 & 0xffffffff : 0), 0, 0);
        if (v8 & 1)
            return v2;
    }
    sub_a368c8();
    sub_a369bc("ssl/tls13_enc.c", 113, "tls13_hkdf_expand");
    sub_9a58a4(a0, 80, 0xc0103, 0);
    return v2;
}
