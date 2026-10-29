/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa50868..0xa50904 (156 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a50868_0 {
    long long field_0;
    char padding_8[80];
    unsigned int field_58;
    char padding_5c[84];
    long long field_b0;
} st_a50868_0;

extern char g_10002b0;

long long sub_a50868(st_a50868_0 *a0, unsigned int a1)
{
    unsigned int v9;  // w0
    unsigned int v0;  // [bp-0x84]
    uint128_t v1;  // [bp-0x80]
    uint128_t v2;  // [bp-0x70]
    uint128_t v3;  // [bp-0x60]
    uint128_t v4;  // [bp-0x50]
    uint128_t v5;  // [bp-0x40]
    unsigned long v6;  // [bp-0x28]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v6 = *(long long *)&g_10002b0;
    v0 = a1;
    v4 = 0;
    v5 = 0;
    v2 = 0;
    v3 = 0;
    v1 = 0;
    sub_a70404("num", &v0);
    v9 = sub_a52694(a0->field_0, a0->field_b0, &v1);
    if (v9)
        a0->field_58 = v0;
    if (*(long long *)&g_10002b0 == v6)
        return v9 != 0;
    ___stack_chk_fail(v9 != 0);
}
