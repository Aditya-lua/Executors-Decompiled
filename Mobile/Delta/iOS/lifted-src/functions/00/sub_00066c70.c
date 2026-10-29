/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x66c70..0x66d5c (236 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_66c70_1 {
    char padding_0[40];
    struct st_66c70_1 *field_28;
} st_66c70_1;

typedef struct st_66c70_0 {
    char field_0;
} st_66c70_0;


unsigned long long sub_66c70(long long a0, unsigned int a1, long long a2, long long a3)
{
    st_66c70_1 *v7;  // x21
    st_66c70_1 *v8;  // x21
    unsigned long long v9;  // x0
    unsigned long long v10;  // 4112
    st_66c70_0 **v0;  // [bp-0x68], Other Possible Types: char
    st_66c70_0 *v1;  // [bp-0x60]
    char v2;  // [bp-0x58]
    unsigned long v3;  // [bp-0x48]
    unsigned int v4;  // [bp-0x34]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v1 = &v0;
    v0 = &v1;
    v4 = a1;
    sub_66adc(&v2, a0, &v4);
    sub_61094(v3, a2, a3, 1);
    v7 = (st_66c70_1 *)v2;
    if (v7)
    {
        do
        {
            v8 = v7;
            v9 = sub_66e64(v8, a2, a3);
            v10 = arm64g_calculate_condition(0x11, v9 & 0xffffffff, 1, 0);
            if (v10 & 1)
            {
                sub_60b78(&v2);
                sub_60b78(&v3);
                return v9;
            }
        } while ((v7 = v8->field_28, v8->field_28));
    }
    sub_60b78(&v2);
    sub_60b78(&v3);
    return 0xffffffff;
}
