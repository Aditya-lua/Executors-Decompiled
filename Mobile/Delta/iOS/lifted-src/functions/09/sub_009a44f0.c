/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a44f0..0x9a45d8 (232 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9a44f0_0 {
    char padding_0[768];
    struct st_9a44f0_1 *field_300;
    char padding_308[2060];
    long long field_b14;
} st_9a44f0_0;

typedef struct st_9a44f0_1 {
    char padding_0[36];
    unsigned int field_24;
    unsigned int field_28;
} st_9a44f0_1;

extern unsigned int g_400000;
extern unsigned int g_800000;

long long sub_9a44f0(st_9a44f0_0 *a0, long long a1)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned int v8;  // w8
    unsigned long long v9;  // 4102
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!*(int *)&(a0->padding_308)[1])
        return 2;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    if (a0->field_300->field_28 != 64)
    {
        v8 = a0->field_300->field_24;
        if ((int)v8 >= 0x40000)
        {
            v9 = arm64g_calculate_condition(3, v8, 0x40000, 0);
            if (!(v9 & 1) && v8 != &g_800000 && v8 != &g_400000)
                goto LABEL_9a4564;
        }
        else if (v8 != 4 && v8 != 0x400)
        {
LABEL_9a4564:
            if (sub_c68d5c(a1, 22, 2) && sub_c68d5c(a1, 0, 2))
                return 1;
            sub_a368c8();
            sub_a369bc("ssl/statem/extensions_srvr.c", 1890, "tls_construct_stoc_etm");
            sub_9a58a4(a0, 80, 0xc0103, 0);
            return 0;
        }
    }
    *(unsigned int *)&(a0->padding_308)[1] = 0;
    return 2;
}
