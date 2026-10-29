/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa0b498..0xa0b540 (168 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a0b498_0 {
    char padding_0[31];
    char field_1f;
} st_a0b498_0;

extern char g_10002b0;

unsigned long long sub_a0b498(st_a0b498_0 *a0, long long a1)
{
    unsigned long long v7;  // x0
    char v0;  // [bp-0xc0]
    char v1;  // [bp-0x98]
    char v2;  // [bp-0x70]
    char v3;  // [bp-0x48]
    unsigned long v4;  // [bp-0x28]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v4 = *(long long *)&g_10002b0;
    sub_a0ff20(&v2, a1 + 80);
    sub_a10314(&v1, a1, &v2);
    sub_a10314(&v0, a1 + 40, &v2);
    sub_a106a8(a0, &v0);
    v7 = sub_a106a8(&v3, &v1);
    a0->field_1f = a0->field_1f ^ v3 * 128;
    if (*(long long *)&g_10002b0 == v4)
        return v7;
    ___stack_chk_fail();
}
