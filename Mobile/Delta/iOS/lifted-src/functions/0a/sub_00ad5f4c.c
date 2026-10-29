/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xad5f4c..0xad6020 (212 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ad5f4c_0 {
    struct st_ad5f4c_0 *field_0;
    struct st_ad5f4c_0 *field_8;
    struct st_ad5f4c_0 *field_10;
    struct st_ad5f4c_0 *field_14;
    struct st_ad5f4c_0 *field_18;
} st_ad5f4c_0;


st_ad5f4c_0 * sub_ad5f4c(st_ad5f4c_0 *a0)
{
    st_ad5f4c_0 *v2;  // x0
    uint128_t v3;  // q1
    st_ad5f4c_0 *v4;  // x0
    st_ad5f4c_0 *v5;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bf4c(32, "crypto/stack/stack.c", 52);
    if (!v2)
        return v2;
    if (a0)
    {
        v3 = *(int128_t *)&a0->field_10;
        *(int128_t *)&v2->field_0 = *(int128_t *)&a0->field_0;
        *(uint128_t *)&v2->field_10 = v3;
        if ((int)a0->field_0)
        {
            v4 = sub_a6bf4c(*(int *)((char *)&a0->field_10 + 4) * 8, "crypto/stack/stack.c", 72);
            v5 = v2;
            v5->field_8 = v4;
            if (!v4)
            {
                sub_a6c2e4();
                sub_a6c2e4(v5, "crypto/stack/stack.c", 449);
                return 0;
            }
            _memcpy();
            return v5;
        }
    }
    else
    {
        *(unsigned int *)&v2->field_0 = 0;
        *(unsigned int *)&v2->field_10 = 0;
        v2->field_14 = 0;
    }
    v2->field_8 = 0;
    *(unsigned int *)((char *)&v2->field_10 + 4) = 0;
    return v2;
}
