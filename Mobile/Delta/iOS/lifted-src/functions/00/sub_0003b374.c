/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3b374..0x3b3b0 (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3b374_1 {
    char padding_0[8];
    struct st_3b374_0 *field_8;
} st_3b374_1;

typedef struct st_3b374_0 {
    uint128_t field_0;
    uint128_t field_10;
    unsigned short field_20[8];
    char field_28;
} st_3b374_0;


st_3b374_1 * sub_3b374(st_3b374_1 *a0, unsigned long a1)
{
    st_3b374_0 *iter;  // x8
    st_3b374_0 *v1;  // x9

    iter = a0->field_8;
    if (a1)
    {
        v1 = &(&iter->field_0)[3 * a1];
        do
        {
            iter->field_10 = 0;
            *(uint128_t *)iter->field_20 = 0;
            iter->field_0 = 0;
            iter->field_20[4] = 0xffff;
            iter = &iter->field_28;
        } while (iter != v1);
        iter = v1;
    }
    a0->field_8 = iter;
    return a0;
}
