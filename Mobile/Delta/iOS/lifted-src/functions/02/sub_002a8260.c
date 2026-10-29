/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2a8260..0x2a82c8 (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2a8260_1 {
    char padding_0[20];
    unsigned int field_14;
} st_2a8260_1;

typedef struct st_2a8260_0 {
    char field_0;
} st_2a8260_0;


unsigned long long sub_2a8260(st_2a8260_1 *a0)
{
    unsigned long long v4;  // x0
    unsigned long long v5;  // x8
    unsigned long v8;  // cc_dep2
    unsigned long v9;  // cc_ndep
    unsigned long long v10;  // 4110
    unsigned long long v11;  // 4102
    unsigned long v12;  // cc_op
    unsigned long v13;  // cc_dep1
    unsigned long long v6;  // 4110
    unsigned long long v7;  // 4102
    st_2a8260_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_2a8260_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    while (1)
    {
        v4 = sub_2aa6a8(a0);
        v5 = 1 << ((char)a0->field_14 & 63) & 0x100002600;
        if (a0->field_14 <= 32)
        {
            v6 = arm64g_calculate_condition(v12 | 144, v13, v8, v9);
            v7 = arm64g_calculate_condition(20, (v6 & 1 ? v5 : 0x40000000), 0, 0);
            if (!(v7 & 1))
                return v4;
        }
        else
        {
            v10 = arm64g_calculate_condition(v12 | 144, v13, v8, v9);
            v11 = arm64g_calculate_condition(16, (v10 & 1 ? v5 : 0x40000000), 0, 0);
            if (!(v11 & 1))
                return v4;
        }
    }
}
