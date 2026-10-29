/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb455a0..0xb45670 (208 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b455a0_0 {
    char padding_0[8];
    uint128_t field_8;
    uint128_t field_18;
    uint128_t field_28;
    uint128_t field_38;
    uint128_t field_48;
    uint128_t field_58;
    uint128_t field_68;
    uint128_t field_78;
    unsigned int field_88;
    unsigned int field_8c;
} st_b455a0_0;


double sub_b455a0(st_b455a0_0 *a0, unsigned long a1, unsigned long a2, long long a3)
{
    uint128_t v2;  // q0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_a2f9e0() && sub_b457d8(a0, a3))
    {
        if (!a1)
        {
            *(int128_t *)(a0->padding_0)[1] = *(int128_t *)((char *)&a0->field_38 + 8);
            *(int128_t *)((char *)&a0->field_8 + 8) = *(int128_t *)((char *)&a0->field_48 + 8);
            *(int128_t *)((char *)&a0->field_18 + 8) = *(int128_t *)((char *)&a0->field_58 + 8);
            v2 = *(int128_t *)((char *)&a0->field_68 + 8);
            *(uint128_t *)((char *)&a0->field_28 + 8) = v2;
        }
        else if (a2 == 16 && sub_ac2860())
        {
            *(int128_t *)((char *)&a0->field_38 + 8) = *(int128_t *)(a0->padding_0)[1];
            *(int128_t *)((char *)&a0->field_48 + 8) = *(int128_t *)((char *)&a0->field_8 + 8);
            *(int128_t *)((char *)&a0->field_58 + 8) = *(int128_t *)((char *)&a0->field_18 + 8);
            v2 = *(int128_t *)((char *)&a0->field_28 + 8);
            *(uint128_t *)((char *)&a0->field_68 + 8) = v2;
        }
    }
    return (unsigned long long)v2;
}
