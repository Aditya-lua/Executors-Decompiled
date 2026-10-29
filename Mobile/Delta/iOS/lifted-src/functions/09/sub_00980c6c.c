/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x980c6c..0x980d2c (192 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_980c6c_1 {
    char field_0[21];
    char field_d;
} st_980c6c_1;

typedef struct st_980c6c_0 {
    long long field_0;
    char field_8;
    char padding_9[15];
    long long field_18;
    char padding_20[8];
    long long field_28;
} st_980c6c_0;

extern char g_10002b0;

unsigned int sub_980c6c(st_980c6c_0 *a0, st_980c6c_1 *a1)
{
    unsigned int v5;  // w22
    unsigned int v6;  // w22
    uint168_t v0;  // [bp-0x70]
    unsigned long long *v1;  // [bp-0x50]
    unsigned long v2;  // [bp-0x38]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v2 = *(long long *)&g_10002b0;
    v5 = 10;
    while (1)
    {
        v6 = v5;
        if (sub_98e30c(a0->field_0, a0->field_28, a1) && !(*(int128_t *)&v0 = *(int128_t *)&a1->field_0[0], *(long long *)((char *)&v0 + 13) = *(long long *)&a1->field_0[13], v1 = &a0->field_8, 21 > *(char *)&v0 && sub_a66b6c(a0->field_18, &v0)))
            break;
        v5 = v6 - 1;
        if (v6 == 1)
        {
            if (*(long long *)&g_10002b0 == v2)
                return 0;
            ___stack_chk_fail();
        }
    }
    if (*(long long *)&g_10002b0 == v2)
        return 1;
    ___stack_chk_fail();
}
