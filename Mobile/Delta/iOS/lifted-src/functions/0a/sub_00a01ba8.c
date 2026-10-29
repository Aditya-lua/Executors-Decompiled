/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa01ba8..0xa01c28 (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a01ba8_0 {
    char padding_0[8];
    char field_8;
    char padding_9[175];
    long long field_b8;
    unsigned long long field_c0;
} st_a01ba8_0;


unsigned long long sub_a01ba8(st_a01ba8_0 *a0, int a1, int a2, int a3, long long a4)
{
    unsigned long v3;  // x3
    unsigned long v4;  // x4
    unsigned long long v5;  // x0
    char v0;  // [bp-0x24]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = a2;
    v4 = a3;
    if (a1 == 1)
    {
        v5 = sub_a62e78(a0->field_b8, &a0->field_8, 0, v3, v4, &v0, a4);
        if (1 > (int)v5)
            return v5;
    }
    else
    {
        v5 = sub_a62e5c(a0->field_b8, &a0->field_8, 0, v3, v4, &v0, a4);
        if ((int)v5 < 1)
            return v5;
    }
    a0->field_c0 = a0->field_c0 + 1;
    return v5;
}
