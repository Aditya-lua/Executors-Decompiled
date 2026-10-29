/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x13d10c..0x13d164 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_13d10c_1 {
    char padding_0[84];
    int field_54;
} st_13d10c_1;

typedef struct st_13d10c_0 {
    char field_0;
} st_13d10c_0;


unsigned long long sub_13d10c(unsigned long long a0, unsigned long long a1, st_13d10c_1 **a2)
{
    unsigned long long i;  // x9
    unsigned long long v3;  // x10
    st_13d10c_1 **v4;  // x11
    unsigned long v5;  // cc_dep1
    unsigned long v6;  // cc_dep2
    unsigned long long v7;  // 4105
    unsigned long long v8;  // 4105
    st_13d10c_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_13d10c_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    if (a1 == a0)
        return a0;
    i = (long long)(a1 - a0) >> 3;
    do
    {
        v3 = i >> 1;
        v4 = a0 + v3 * 8;
        i += ~v3;
        v5 = *a2->field_54;
        v6 = *v4->field_54;
        if (*a2->field_54 < *v4->field_54)
        {
            a0 = a0;
            v7 = arm64g_calculate_condition(179, v5, v6, 0);
            if (!(v7 & 1))
                goto LABEL_13d156;
            goto LABEL_13d155;
        }
        else
        {
            a0 = v4 + 1;
            v8 = arm64g_calculate_condition(179, v5, v6, 0);
            if (v8 & 1)
            {
LABEL_13d155:
                i = v3;
                continue;
            }
            else
            {
LABEL_13d156:
            }
        }
    } while (i);
    return a0;
}
