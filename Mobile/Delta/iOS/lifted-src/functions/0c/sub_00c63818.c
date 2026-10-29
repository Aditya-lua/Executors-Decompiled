/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc63818..0xc638e0 (200 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c63818_0 {
    char padding_0[56];
    char field_38;
} st_c63818_0;

typedef struct st_c63818_1 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
    unsigned long long field_20;
    char padding_28[8];
    unsigned int field_30;
    char field_34;
    char padding_35[3];
    long long field_38;
    char field_40;
    char padding_41[55];
    char field_78;
} st_c63818_1;


st_c63818_0 * sub_c63818(st_c63818_1 *a0)
{
    unsigned long v2;  // x11
    unsigned long long *v3;  // x8
    unsigned long long v4;  // x11
    long long v5;  // x22
    long long v6;  // x21
    st_c63818_0 *v7;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0->field_78 & 1)
        return 0;
    v2 = a0->field_34;
    if (!(v2 >> 1 & 1))
    {
        v3 = a0->field_0 + a0->field_30 * 32 + 552;
        if (!(v2 & 1))
            v4 = a0->field_20;
        else
            v4 = 0;
        v5 = a0->field_8 - (v4 + a0->field_10);
        if (v3[1] - a0->field_18 >= (unsigned long long)v5)
        {
            v6 = *v3 + a0->field_18;
            v7 = &a0->field_40;
            if (sub_c68800(v7, v6))
            {
                if (sub_c68e5c(v7, v5))
                {
                    a0->field_38 = v6;
                    a0->field_78 = a0->field_78 | 1;
                    return v7;
                }
                sub_a6ed4c(v7);
            }
        }
    }
    return 0;
}
