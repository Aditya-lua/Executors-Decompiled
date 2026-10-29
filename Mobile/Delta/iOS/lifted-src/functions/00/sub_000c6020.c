/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc6020..0xc6134 (276 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c6020_0 {
    char field_0;
} st_c6020_0;


long long sub_c6020(unsigned long long *a0, long long a1)
{
    unsigned long idx;  // x22
    unsigned long long v5;  // x0
    unsigned long long v6;  // x0
    unsigned long long v7;  // x8
    unsigned long v8;  // x10
    st_c6020_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_c6020_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    idx = a0 + 0xe00;
    v1 = &v0;
    v0 = &v1;
    if (a1)
    {
        v5 = sub_c4c40(a1);
        v6 = sub_c4ba8(a1);
        *(unsigned int *)(idx + 1532) = a0[3739] != v5 + v6;
    }
    v7 = 5;
    if (*(int *)(idx + 1432))
        v7 = 1;
    a0[3740] = v7;
    *(uint128_t *)&a0[3736] = 0;
    *(uint128_t *)&a0[3747] = 0;
    *(uint128_t *)&a0[3738] = 0;
    *(unsigned int *)&a0[1287] = 201326604;
    *(unsigned int *)(idx + 1528) = 0;
    *(uint128_t *)(idx + 1320) = 3;
    *(unsigned int *)(idx + 1504) = 1;
    v8 = (char *)&a0[3335] + 4;
    *(unsigned long long *)v8 = 17179869185;
    *(unsigned int *)(v8 + 8) = 8;
    *a0 = a0 + 4;
    a0[1] = a0 + 774;
    a0[2] = a0 + 517;
    a0[3] = a0 + 1287;
    if (a1)
        sub_c4bb0(a0, a1);
    return 0;
}
