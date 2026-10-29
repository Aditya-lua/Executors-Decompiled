/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x982bf4..0x982c74 (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_982bf4_0 {
    char padding_0[32];
    unsigned long long field_20;
    unsigned long long field_28;
    unsigned long long field_30;
    unsigned long long field_38;
    char field_40;
    char padding_41[7];
    unsigned long long field_48;
    char padding_50[8];
    char field_58;
} st_982bf4_0;


unsigned long long sub_982bf4(st_982bf4_0 *a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long a4, unsigned long a5)
{
    char v2;  // x8
    char v3;  // x8
    unsigned long long v4;  // x0
    unsigned long long v5;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    *(unsigned int *)&a0->padding_0[0] = 0;
    *(unsigned int *)&a0->padding_0[16] = 0;
    v2 = a0->field_58;
    a0->field_58 = v2 & 240;
    a0->field_20 = a4;
    a0->field_28 = a1;
    a0->field_30 = a2;
    a0->field_38 = a3;
    *(unsigned long long *)a0->padding_50 = 0;
    if (!(a5 & 1))
    {
        v3 = v2 & 224;
    }
    else
    {
        v4 = sub_99a4a0(&a0->field_40);
        if (!(unsigned int)v4)
            return v4;
        v5 = sub_ad9428();
        a0->field_48 = v5;
        if (!v5)
        {
            sub_99a5b8(&a0->field_40);
            return 0;
        }
        v3 = a0->field_58 | 16;
    }
    a0->field_58 = v3;
    return 1;
}
