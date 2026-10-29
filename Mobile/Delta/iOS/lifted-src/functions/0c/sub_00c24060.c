/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc24060..0xc240cc (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c24060_1 {
    unsigned long long field_0;
    struct st_c24060_0 *field_8;
    unsigned long long field_10;
} st_c24060_1;

typedef struct st_c24060_0 {
    char padding_0[24];
    unsigned long long field_18;
} st_c24060_0;

extern long long g_efc118;

long long sub_c24060(unsigned long a0, unsigned long a1, unsigned int a2)
{
    unsigned long v3;  // x8
    st_c24060_1 *v4;  // x8
    unsigned long v13;  // 4110
    unsigned long long v14;  // 4105
    unsigned long long v15;  // x30
    unsigned long long v5;  // x8
    unsigned long v6;  // x9
    unsigned long v7;  // cc_dep1
    unsigned long v8;  // x8
    unsigned long v9;  // 4110
    unsigned long v10;  // cc_op
    unsigned long v11;  // cc_dep1
    unsigned long v12;  // cc_dep2
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    v3 = a2;
    if (a1 > v3)
    {
        v4 = a0 + v3 * 32;
        if (v4->field_0 != 0x8000000000000000)
        {
            if (v4->field_10)
            {
                v5 = v4->field_8->field_18;
                v6 = v5 - 12;
                v7 = v5;
                v8 = 9;
                if (11 >= v5)
                    v6 = v8;
                if (v6 != 10)
                {
                    v9 = arm64g_calculate_condition(20, v7, 11, 0);
                    v10 = 4;
                    v11 = (v9 & 1 ? v6 : 0x40000000);
                    v12 = (v9 & 1 ? 13 : 0);
                }
                else
                {
                    v13 = arm64g_calculate_condition(20, v7, 11, 0);
                    v10 = 0;
                    v11 = (v13 & 1 ? 10 : 0x40000000);
                    v12 = (v13 & 1 ? 13 : 0);
                }
                v14 = arm64g_calculate_condition(v10 | 16, v11, v12, 0);
                return !(v14 & 1);
            }
            else
            {
                return 0;
            }
        }
    }
    v0 = &v2;
    v1 = v15;
    sub_c73c64(&g_efc118);
}
