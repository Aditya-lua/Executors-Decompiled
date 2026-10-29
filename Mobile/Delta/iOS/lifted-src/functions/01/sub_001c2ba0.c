/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1c2ba0..0x1c2c60 (192 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1c2ba0_0 {
    char field_0;
} st_1c2ba0_0;


char * sub_1c2ba0(unsigned long a0, char *a1, char *a2, int *a3)
{
    unsigned int v4;  // w0
    unsigned long long v5;  // 4112
    char *v6;  // x19
    unsigned int v7;  // w0
    unsigned long long v8;  // 4112
    st_1c2ba0_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_1c2ba0_0 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a1 == a2)
        return a1;
    v4 = sub_1be970(*a1, 10);
    v5 = arm64g_calculate_condition(1, v4, 1, 0);
    if (v5 & 1)
        return a1;
    *a3 = v4;
    v6 = a1 + 1;
    if (v6 == a2)
        return v6;
    while (1)
    {
        v7 = sub_1be970(*v6, 10);
        v8 = arm64g_calculate_condition(1, v7, 1, 0);
        if (v8 & 1)
        {
            return v6;
        }
        else if (214748364 > *a3)
        {
            *a3 = v7 + 10 * *a3;
            v6 += 1;
            if (v6 == a2)
                return v6;
        }
        else
        {
            sub_1bee80();
        }
    }
}
