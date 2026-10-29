/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a587c..0x1a590c (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1a587c_1 {
    char padding_0[8];
    long long field_8;
} st_1a587c_1;

typedef struct st_1a587c_0 {
    char field_0;
} st_1a587c_0;


long long sub_1a587c(long long a0, long long a1, st_1a587c_1 *a2)
{
    long long v4;  // x0
    unsigned long long ptr;  // x0
    unsigned long v8;  // cc_dep2
    unsigned long v9;  // cc_ndep
    unsigned long long v10;  // 4110
    unsigned long long v11;  // 4102
    unsigned long v12;  // cc_op
    unsigned long v13;  // cc_dep1
    unsigned long long v6;  // 4110
    unsigned long long v7;  // 4102
    st_1a587c_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_1a587c_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a0 == a1)
        return 1;
    while (1)
    {
        v4 = sub_a0c8(a0);
        ptr = _strstr(a2->field_8, v4);
        a0 += 24;
        if (!ptr)
        {
            v6 = arm64g_calculate_condition(v12, v13, v8, v9);
            v7 = arm64g_calculate_condition(20, (v6 & 1 ? a0 : 0x40000000), (v6 & 1 ? a1 : 0), 0);
            if (!(v7 & 1))
                break;
        }
        else
        {
            v10 = arm64g_calculate_condition(v12, v13, v8, v9);
            v11 = arm64g_calculate_condition(16, (v10 & 1 ? a0 : 0x40000000), (v10 & 1 ? a1 : 0), 0);
            if (!(v11 & 1))
                break;
        }
    }
    return !ptr;
}
