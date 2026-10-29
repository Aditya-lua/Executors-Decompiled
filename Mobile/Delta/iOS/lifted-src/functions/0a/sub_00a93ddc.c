/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa93ddc..0xa94058 (636 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a93ddc_0 {
    char field_0;
    char field_1;
    char padding_2[13];
    char field_f;
    char padding_10[24];
    struct st_a93ddc_1 *field_28;
} st_a93ddc_0;

typedef struct st_a93ddc_1 {
    unsigned long long field_0;
} st_a93ddc_1;


unsigned int sub_a93ddc(st_a93ddc_0 *a0, unsigned long a1, unsigned long a2, unsigned long long a3, unsigned long long *a4)
{
    unsigned long v2;  // x26
    unsigned long long *v3;  // x27
    unsigned long v13;  // x9
    unsigned long long v4;  // x8
    unsigned long v5;  // x28
    unsigned long long v6;  // x8
    st_a93ddc_0 *iter;  // x9
    unsigned long long v8;  // x10
    unsigned long long i;  // x10
    unsigned long long v10;  // x10
    unsigned long v11;  // x11
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_0;
    v3 = a0->field_28;
    if (!(v2 >> 6 & 1))
        v3();
    v4 = v2 & 7;
    a0->field_0 = v4;
    v5 = v4 ^ 15;
    if ((unsigned int)v4)
    {
        v6 = 0;
        iter = &(&a0->field_0)[v5];
        v8 = 14 - v5;
        if (14 < v5)
            v8 = 0;
        i = v8 + 1;
        do
        {
            v10 = i;
            v11 = iter->field_0;
            iter->field_0 = 0;
            iter = &iter->field_1;
            v6 = (v6 | v11) * 0x100;
            i = v10 - 1;
        } while (i);
    }
    else
    {
        v6 = 0;
    }
    v13 = a0->field_f;
    a0->field_f = 1;
    if ((v6 | v13) != a3)
    {
        return 0xffffffff;
    }
    else if (16 <= a3)
    {
        a4();
    }
    else if (a3)
    {
        v3();
    }
    else
    {
        _bzero(&(&a0->field_0)[v5 & 0xffffffff], 16 - v5);
        v3();
    }
}
