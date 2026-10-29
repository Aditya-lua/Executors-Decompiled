/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc68e5c..0xc68eb8 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c68e5c_0 {
    struct st_c68e5c_0 *field_0;
    char padding_8[8];
    struct st_c68e5c_0 *field_10;
} st_c68e5c_0;

typedef struct st_c68e5c_1 {
    char padding_0[24];
    unsigned long long field_18;
    unsigned long long field_20;
    struct st_c68e5c_0 *field_28;
} st_c68e5c_1;


long long sub_c68e5c(st_c68e5c_1 *a0, unsigned long a1)
{
    st_c68e5c_0 *v0;  // x8
    st_c68e5c_0 *v1;  // x8
    unsigned long long v10;  // 4102
    st_c68e5c_0 *v3;  // x8
    unsigned long v4;  // cc_dep1
    st_c68e5c_0 *v5;  // x9
    unsigned long v6;  // x9
    unsigned long long v7;  // 4110
    unsigned long long v8;  // 4102
    unsigned long long v9;  // 4110

    v0 = a0->field_28;
    if (a0->field_28)
    {
        do
        {
            v1 = v0;
            v0 = v1->field_0;
        } while (v1->field_0);
        v3 = v1->field_10;
        v4 = v3;
        v5 = 8;
        if (!v3)
            v3 = v5;
        v6 = (char *)v3 + ~(0xffffffffffffffff << ((char)v3 * 8 & 63));
        if (v3 <= 7)
        {
            v7 = arm64g_calculate_condition(148, v4, 0, 0);
            v8 = arm64g_calculate_condition(52, (v7 & 1 ? v6 : 0x20000000), (v7 & 1 ? a1 : 0), 0);
            if (!(v8 & 1))
                goto LABEL_c68ea0;
        }
        else
        {
            v9 = arm64g_calculate_condition(148, v4, 0, 0);
            v10 = arm64g_calculate_condition(48, (v9 & 1 ? v6 : 0x20000000), (v9 & 1 ? a1 : 0), 0);
            if (!(v10 & 1))
            {
LABEL_c68ea0:
                if (a0->field_18 <= a1)
                    a0->field_20 = a1;
            }
        }
    }
}
