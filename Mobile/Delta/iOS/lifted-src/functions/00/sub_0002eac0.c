/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2eac0..0x2eb84 (196 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2eac0_0 {
    char field_0;
} st_2eac0_0;


uint128_t * sub_2eac0(unsigned long long *a0, void* a1)
{
    uint128_t *v4;  // x22
    unsigned long long v5;  // x0
    uint128_t *v6;  // x23
    unsigned long long v7;  // x26
    uint128_t *v8;  // x21
    st_2eac0_0 **v0;  // [bp-0x60], Other Possible Types: char
    st_2eac0_0 *v1;  // [bp-0x58]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = a0[1] - 1;
    v5 = sub_320e0(*(long long *)a1, (long long)a1[8]);
    v6 = 0;
    while (1)
    {
        v7 = v5 & v4;
        v8 = *a0 + 24 * v7;
        if (sub_2a6e0(v8, a0 + 3))
        {
            *v8 = *(int128_t *)a1;
            a0[2] = a0[2] + 1;
            return v8;
        }
        else if (!sub_2a6e0(v8, a1))
        {
            v6 = (char *)v6 + 1;
            v5 = (char *)v6 + v7;
            if (v6 > v4)
                return 0;
        }
        else
        {
            return v8;
        }
    }
}
