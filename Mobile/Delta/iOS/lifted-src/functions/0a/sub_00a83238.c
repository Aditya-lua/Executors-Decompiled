/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa83238..0xa83270 (56 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a83238_1 {
    uint128_t field_0;
    uint128_t field_10;
} st_a83238_1;

typedef struct st_a83238_0 {
    uint128_t field_0;
    uint128_t field_10;
    char padding_20[56];
    struct st_a83238_1 *field_58;
    struct st_a83238_0 *field_60;
} st_a83238_0;


st_a83238_0 * sub_a83238(uint128_t *a0, unsigned long a1, st_a83238_0 *a2)
{
    st_a83238_0 *v0;  // x8
    st_a83238_0 *v1;  // x9
    uint128_t v2;  // q1
    uint128_t v3;  // q1

    v0 = 0;
    if (a2 && a1 == 64)
    {
        v1 = a2->field_60;
        if (v1)
        {
            v2 = v1->field_10;
            *a0 = v1->field_0;
            a0[1] = v2;
            v3 = a2->field_58->field_10;
            a0[2] = a2->field_58->field_0;
            a0[3] = v3;
            v0 = 1;
        }
    }
    return v0;
}
