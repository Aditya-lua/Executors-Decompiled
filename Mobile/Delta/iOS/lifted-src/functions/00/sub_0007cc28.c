/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7cc28..0x7ccdc (180 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_7cc28_1 {
    char padding_0[3224];
    unsigned long long field_c98;
} st_7cc28_1;

typedef struct st_7cc28_0 {
    char field_0;
} st_7cc28_0;


unsigned long long sub_7cc28(st_7cc28_1 *a0, long long a1, long long a2, long long a3, long long a4, unsigned long a5)
{
    unsigned long long v4;  // x5
    unsigned long long v5;  // 4110
    unsigned long long v6;  // x0
    unsigned long long v7;  // 4110
    st_7cc28_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_7cc28_0 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = sub_814e8();
    v5 = arm64g_calculate_condition(130, v4, 120, 0);
    if (v5 & 1)
        return v4;
    v6 = sub_81b5c(a0, a1, a2, a3, a4);
    v7 = arm64g_calculate_condition(130, v6, 120, 0);
    if (v7 & 1)
    {
        return v6;
    }
    else if (*(int *)(a0->field_c98 + 5604) == 2)
    {
        *(unsigned int *)(a0->field_c98 + 5604) = 1;
        return v6;
    }
    else
    {
        return v6;
    }
}
