/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc5f0c..0xc5ff0 (228 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c5f0c_0 {
    char field_0;
} st_c5f0c_0;


unsigned long long sub_c5f0c(unsigned long long *a0, unsigned long long a1, unsigned long long a2)
{
    unsigned long idx;  // x8
    unsigned long long v5;  // x9
    unsigned long v6;  // x8
    unsigned long long v7;  // 4106
    st_c5f0c_0 **v0;  // [bp-0x20], Other Possible Types: char
    st_c5f0c_0 *v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    idx = a0 + 0xe00;
    v5 = 5;
    if (*(int *)(idx + 1432))
        v5 = 1;
    a0[3740] = v5;
    *(uint128_t *)&a0[3736] = 0;
    *(uint128_t *)&a0[3738] = 0;
    *(uint128_t *)&a0[3747] = 0;
    *(unsigned int *)&a0[1287] = 201326604;
    *(unsigned int *)(idx + 1528) = 0;
    *(uint128_t *)&a0[3749] = 3;
    *(unsigned int *)(idx + 1504) = 1;
    v6 = (char *)&a0[3335] + 4;
    *(unsigned long long *)v6 = 17179869185;
    *(unsigned int *)(v6 + 8) = 8;
    *a0 = a0 + 4;
    a0[1] = a0 + 774;
    a0[2] = a0 + 517;
    a0[3] = a0 + 1287;
    if (!a1)
    {
        return 0;
    }
    else if (a2)
    {
        v7 = arm64g_calculate_condition(130, sub_c582c(), 120, 0);
        if (v7 & 1)
            return 0xffffffffffffffe2;
        return 0;
    }
    else
    {
        return 0;
    }
}
