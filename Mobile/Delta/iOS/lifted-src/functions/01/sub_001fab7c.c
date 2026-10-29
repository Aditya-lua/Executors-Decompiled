/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1fab7c..0x1fac4c (208 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1fab7c_3 {
    char padding_0[8];
    unsigned long long field_8;
} st_1fab7c_3;

typedef struct st_1fab7c_1 {
    char padding_0[24];
    struct st_1fab7c_2 *field_18;
    unsigned long long field_20;
} st_1fab7c_1;

typedef struct st_1fab7c_2 {
    unsigned int field_0;
} st_1fab7c_2;

typedef struct st_1fab7c_0 {
    char field_0;
} st_1fab7c_0;


unsigned long long sub_1fab7c(st_1fab7c_1 *a0, st_1fab7c_3 *a1)
{
    unsigned long long v4;  // x8
    unsigned long long v5;  // x21
    unsigned long long v6;  // x9
    unsigned long v7;  // x22
    st_1fab7c_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_1fab7c_0 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = a0->field_20;
    if (a0->field_20 < 2)
        return 0;
    v5 = 0;
    v6 = 1;
    while (1)
    {
        v7 = *(int *)&a0->field_18[v6];
        if (a1->field_8 == v7)
        {
            if (!(sub_1f12c4(a0, v5 & 0xffffffff, a1) & 1))
                v4 = a0->field_20;
            else
                return &a0->field_18[1 + v6];
        }
        v6 = v6 + 1 + *(int *)&a0->field_18[1 + v6] + 1;
        v5 += v7;
        if (v4 <= v6)
            return 0;
    }
}
