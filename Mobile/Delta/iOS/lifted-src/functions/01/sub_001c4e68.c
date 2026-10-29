/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1c4e68..0x1c4f5c (244 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1c4e68_1 {
    char padding_0[24];
    unsigned int field_18;
} st_1c4e68_1;

typedef struct st_1c4e68_0 {
    char field_0;
} st_1c4e68_0;


char * sub_1c4e68(st_1c4e68_1 *a0, char *a1, char *a2)
{
    char *v4;  // x1
    unsigned int v5;  // w8
    unsigned long long v14;  // x8
    unsigned long v6;  // cc_dep1
    unsigned int v7;  // w9
    unsigned int v8;  // w10
    unsigned long long v9;  // x10
    unsigned long long v10;  // 4110
    unsigned long long v11;  // 4102
    unsigned long long v12;  // 4110
    unsigned long long v13;  // 4102
    st_1c4e68_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_1c4e68_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a1 == a2)
        return a1;
    v4 = a1 + 1;
    if (v4 == a2)
        return a1;
    v5 = *a1;
    v6 = v5 & 0xff;
    if (v5 != 92)
        return a1;
    v7 = *v4;
    v8 = v7 - 36;
    v9 = 1 << ((char)v8 & 63) & 396316767342822641;
    if (v8 <= 58)
    {
        v10 = arm64g_calculate_condition(147, v6, 92, 0);
        v11 = arm64g_calculate_condition(20, (v10 & 1 ? v9 : 0x40000000), 0, 0);
        if (!(v11 & 1))
            goto LABEL_1c4edc;
    }
    else
    {
        v12 = arm64g_calculate_condition(147, v6, 92, 0);
        v13 = arm64g_calculate_condition(16, (v12 & 1 ? v9 : 0x40000000), 0, 0);
        if (!(v13 & 1))
        {
LABEL_1c4edc:
            if (3 <= v7 - 123)
            {
                if ((a0->field_18 & 496) == 64)
                    return sub_1b4794();
                v14 = 2;
                if (!sub_1c29b8())
                    v14 = 0;
                return &a1[v14];
            }
        }
    }
    sub_1bbad0();
    return a1 + 2;
}
