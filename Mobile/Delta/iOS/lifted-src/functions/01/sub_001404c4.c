/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1404c4..0x140514 (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1404c4_1 {
    char padding_0[84];
    int field_54;
} st_1404c4_1;

typedef struct st_1404c4_0 {
    char field_0;
} st_1404c4_0;


unsigned long long sub_1404c4(unsigned long long a0, st_1404c4_1 **a1, unsigned long long i)
{
    unsigned long long v2;  // x9
    st_1404c4_1 **v3;  // x10
    unsigned long v4;  // cc_dep1
    unsigned long v5;  // cc_dep2
    unsigned long long v6;  // 4105
    unsigned long long v7;  // 4105
    st_1404c4_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_1404c4_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    if (!i)
        return a0;
    do
    {
        v2 = i >> 1;
        v3 = a0 + v2 * 8;
        i += ~v2;
        v4 = *v3->field_54;
        v5 = *a1->field_54;
        if (*v3->field_54 < *a1->field_54)
        {
            a0 = v3 + 1;
            v6 = arm64g_calculate_condition(179, v4, v5, 0);
            if (!(v6 & 1))
                goto LABEL_140506;
            goto LABEL_140505;
        }
        else
        {
            a0 = a0;
            v7 = arm64g_calculate_condition(179, v4, v5, 0);
            if (v7 & 1)
            {
LABEL_140505:
                continue;
            }
            else
            {
LABEL_140506:
                i = v2;
            }
        }
    } while (i);
    return a0;
}
