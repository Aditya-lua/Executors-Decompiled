/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x83dc..0x842c (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_83dc_1 {
    unsigned short field_0;
    char field_2;
} st_83dc_1;

typedef struct st_83dc_0 {
    char field_0;
} st_83dc_0;


unsigned long long sub_83dc(unsigned long long a0, unsigned int *a1, unsigned long long i)
{
    unsigned long long v2;  // x9
    st_83dc_1 *v3;  // x10
    unsigned int v4;  // w11
    unsigned long v5;  // cc_dep1
    unsigned long v6;  // cc_dep2
    unsigned long long v7;  // 4105
    unsigned long long v8;  // 4105
    st_83dc_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_83dc_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    if (!i)
        return a0;
    do
    {
        v2 = i >> 1;
        v3 = a0 + v2 * 8;
        v4 = v3->field_0 | v3->field_2 * 0x10000;
        i += ~v2;
        v5 = *a1;
        v6 = v4;
        if (v4 < *a1)
        {
            a0 = &v3[2].field_2;
            v7 = arm64g_calculate_condition(131, v5, v6, 0);
            if (!(v7 & 1))
                goto LABEL_841e;
            goto LABEL_841d;
        }
        else
        {
            a0 = a0;
            v8 = arm64g_calculate_condition(131, v5, v6, 0);
            if (v8 & 1)
            {
LABEL_841d:
                continue;
            }
            else
            {
LABEL_841e:
                i = v2;
            }
        }
    } while (i);
    return a0;
}
