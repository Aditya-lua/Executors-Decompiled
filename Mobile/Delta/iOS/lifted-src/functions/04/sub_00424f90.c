/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x424f90..0x424fd8 (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_424f90_0 {
    char padding_0[24];
    uint128_t field_18;
    unsigned long long field_28;
} st_424f90_0;


st_424f90_0 * sub_424f90(st_424f90_0 *a0, st_424f90_0 *a1)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_5ccc();
    sub_41cf2c((a0->padding_0)[1]);
    *(int128_t *)&(a0->padding_0)[1] = *(int128_t *)&(a1->padding_0)[1];
    *(long long *)((char *)&a0->field_18 + 8) = *(long long *)((char *)&a1->field_18 + 8);
    memset((a1->padding_0)[1], 0, 24);
    return a0;
}
