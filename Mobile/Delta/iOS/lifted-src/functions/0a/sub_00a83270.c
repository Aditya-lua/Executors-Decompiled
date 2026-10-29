/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa83270..0xa832c8 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a83270_0 {
    char padding_0[64];
    struct st_a83270_0 *field_40;
    char padding_48[16];
    unsigned long long field_58;
    struct st_a83270_0 *field_60;
    char padding_68[4];
    uint128_t field_6c;
    uint128_t field_7c;
    uint128_t field_8c;
    uint128_t field_9c;
} st_a83270_0;


st_a83270_0 * sub_a83270(uint128_t *a0, unsigned long a1, st_a83270_0 *a2)
{
    uint128_t v0;  // q0
    uint128_t v1;  // q0

    if (!a2)
    {
        return 0;
    }
    else if (a2->field_40)
    {
        return 0;
    }
    else
    {
        if (a1 != 64 || a2->field_60)
            return 0;
        a2->field_58 = (a2->padding_68)[1];
        a2->field_60 = (char *)&a2->field_7c + 12;
        v0 = *a0;
        *(uint128_t *)((char *)&a2->field_8c + 12) = a0[1];
        *(uint128_t *)((char *)&a2->field_7c + 12) = v0;
        v1 = a0[2];
        *(uint128_t *)((char *)&a2->field_6c + 12) = a0[3];
        *(uint128_t *)(a2->padding_68)[1] = v1;
        return 0;
    }
}
