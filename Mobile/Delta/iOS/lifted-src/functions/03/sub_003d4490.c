/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3d4490..0x3d44fc (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3d4490_1 {
    unsigned int field_0[4];
    char field_8;
} st_3d4490_1;

typedef struct st_3d4490_0 {
    unsigned int field_0;
    char padding_4[8];
    uint128_t field_c;
    char field_14;
} st_3d4490_0;


double sub_3d4490(st_3d4490_0 *a0, unsigned int a1)
{
    st_3d4490_1 *v0;  // x8

    switch (a1)
    {
    case 3:
        return 1;
    case 0:
        v0 = (a0->padding_4)[1];
        if (a0->field_0 == 32)
        {
            *(uint128_t *)(a0->padding_4)[1] = 0xff000000000000ff0000ff0000ff0000;
            *(unsigned int *)((char *)&a0->field_c + 12) = 0;
            return 1;
        }
        else if (a0->field_0 == 16)
        {
            *(double *)(a0->padding_4)[1] = 2.105019840321e-311;
            *(unsigned int *)((char *)&a0->field_c + 4) = 31;
            return 1;
        }
        else
        {
            *(unsigned long long *)&v0->field_0[0] = 0;
            *(unsigned long long *)&v0->field_0[2] = 0;
            return 1;
        }
    default:
        return 0;
    }
}
