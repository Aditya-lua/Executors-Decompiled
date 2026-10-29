/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1c1650..0x1c16bc (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1c1650_0 {
    uint128_t field_0;
} st_1c1650_0;


uint128_t * sub_1c1650(unsigned long a0, uint128_t *i, uint128_t *a2, uint128_t *a3)
{
    uint128_t *iter;  // x19
    uint128_t *v9;  // x1
    unsigned long v0;  // [bp-0x50]
    st_1c1650_0 **v1;  // [bp-0x48]
    st_1c1650_0 **v2;  // [bp-0x40]
    char v3;  // [bp-0x38]
    uint128_t *v4;  // [bp-0x30]
    uint128_t *v5;  // [bp-0x28]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    iter = a3;
    v5 = a3;
    v4 = a3;
    v0 = a0;
    v1 = &v4;
    v2 = &v5;
    if (i != a2)
    {
        do
        {
            v9 = i + 1;
            *iter = *i;
            iter += 1;
            i = v9;
        } while (i != a2);
        v5 = iter;
    }
    v3 = 1;
    sub_1bb380(&v0);
    return iter;
}
