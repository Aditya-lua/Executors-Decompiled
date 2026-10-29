/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa4dbd4..0xa4dc90 (188 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a4dbd4_0 {
    char padding_0[120];
    struct st_a4dbd4_0 *field_78;
} st_a4dbd4_0;

typedef struct st_a4dbd4_1 {
    struct st_a4dbd4_0 *field_0;
    char padding_8[104];
    unsigned long long field_70;
    char padding_78[56];
    long long field_b0;
} st_a4dbd4_1;

extern char g_10002b0;

unsigned long long sub_a4dbd4(st_a4dbd4_1 *a0, st_a4dbd4_0 *a1)
{
    unsigned long long v9;  // x0
    st_a4dbd4_0 *v0;  // [bp-0x84]
    st_a4dbd4_0 *v1;  // [bp-0x80]
    st_a4dbd4_0 *v2;  // [bp-0x70]
    st_a4dbd4_0 *v3;  // [bp-0x60]
    st_a4dbd4_0 *v4;  // [bp-0x50]
    st_a4dbd4_0 *v5;  // [bp-0x40]
    unsigned long v6;  // [bp-0x28]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v6 = *(long long *)&g_10002b0;
    v4 = (st_a4dbd4_0 *)0;
    v5 = (st_a4dbd4_0 *)0;
    v2 = (st_a4dbd4_0 *)0;
    v3 = (st_a4dbd4_0 *)0;
    v1 = (st_a4dbd4_0 *)0;
    v0 = a1;
    a0->field_70 = a0->field_70 & 0xfffffffffffffe00 | (a0->field_70 & 0xfffffffffffffeff | ((!a1) * 0x100 | (char)(!a1) >> 56) & 0x100) & 0x1ff;
    if (!a0->field_0 || a0->field_0->field_78)
    {
        sub_a70404("padding", &v0);
        v9 = sub_a52694(a0->field_0, a0->field_b0, &v1) != 0;
    }
    else
    {
        v9 = 1;
    }
    if (*(long long *)&g_10002b0 == v6)
        return v9;
    ___stack_chk_fail();
}
