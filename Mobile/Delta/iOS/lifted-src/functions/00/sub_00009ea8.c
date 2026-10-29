/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9ea8..0x9f64 (188 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9ea8_0 {
    char field_0;
} st_9ea8_0;


uint128_t * sub_9ea8(unsigned long long *a0, uint128_t *a1)
{
    uint128_t *v4;  // x22
    unsigned long long v5;  // x0
    uint128_t *v6;  // x23
    unsigned long long v7;  // x25
    uint128_t *v8;  // x21
    st_9ea8_0 **v0;  // [bp-0x60], Other Possible Types: char
    st_9ea8_0 *v1;  // [bp-0x58]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = a0[1] - 1;
    v5 = sub_af64();
    v6 = 0;
    while (1)
    {
        v7 = v5 & v4;
        v8 = *a0 + v7 * 16;
        if (sub_cdcc(v8, a0 + 3))
        {
            *v8 = *a1;
            a0[2] = a0[2] + 1;
            return v8;
        }
        else if (!sub_cdcc(v8, a1))
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
