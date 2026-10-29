/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa7d998..0xa7d9b8 (32 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a7d998_0 {
    unsigned int field_0;
    char padding_4[8];
    uint128_t field_c;
    unsigned int field_1c;
} st_a7d998_0;


int sub_a7d998(st_a7d998_0 *a0)
{
    a0->field_0 = 0;
    *(unsigned int *)((char *)&a0->field_c + 12) = 1;
    *(uint128_t *)(a0->padding_4)[1] = 0x25252525252525255252525252525252;
    return 1;
}
