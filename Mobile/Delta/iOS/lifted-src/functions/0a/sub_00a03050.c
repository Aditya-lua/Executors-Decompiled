/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa03050..0xa030f4 (164 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a03050_1 {
    char padding_0[136];
    long long field_88;
    char padding_90[8];
    struct st_a03050_0 *field_98;
} st_a03050_1;

typedef struct st_a03050_0 {
    char padding_0[24];
    long long field_18;
} st_a03050_0;


long long sub_a03050(st_a03050_1 *a0, long long a1, unsigned long long *a2, long long a3, long long a4)
{
    long long v3;  // x0
    long long v4;  // w0
    unsigned long v8;  // cc_dep1
    unsigned long v9;  // cc_dep2
    unsigned long v10;  // cc_ndep
    unsigned long long v11;  // 4110
    unsigned long long v12;  // 4102
    unsigned long v13;  // cc_op
    unsigned long v5;  // x8
    long long v14;  // w0
    unsigned long long v6;  // 4110
    unsigned long long v7;  // 4102
    char v0;  // [bp-0x44], Other Possible Types: unsigned int
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = sub_a5ace4(a0->field_88);
    if (a0->field_98->field_18)
    {
        v4 = (unsigned int)sub_a50ac8(a0->field_98->field_18);
        v5 = v4;
        if (1 <= v4)
        {
            v6 = arm64g_calculate_condition(v13 | 160, v8, v9, v10);
            v7 = arm64g_calculate_condition(4, (v6 & 1 ? v5 : 0), (v6 & 1 ? a4 : 0), 0);
            if (!(v7 & 1))
                return 0;
        }
        else
        {
            v11 = arm64g_calculate_condition(v13 | 160, v8, v9, v10);
            v12 = arm64g_calculate_condition(0, (v11 & 1 ? v5 : 0), (v11 & 1 ? a4 : 0), 0);
            if (!(v12 & 1))
                return 0;
        }
    }
    v14 = (unsigned int)sub_a03898(0, a3, a4, a1, &v0, v3);
    if (v14 < 1)
        return v14;
    *a2 = v0;
    return 1;
}
