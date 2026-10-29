/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x991e20..0x991e48 (40 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_991e20_0 {
    char padding_0[3296];
    struct st_991e20_1 *field_ce0;
} st_991e20_0;

typedef struct st_991e20_1 {
    unsigned short field_0;
    unsigned short field_2;
} st_991e20_1;


st_991e20_0 * sub_991e20(st_991e20_0 *a0, unsigned long a1)
{
    unsigned short *v0;  // x8

    v0 = &a0->field_ce0->field_0;
    if (!(a1 & 1))
    {
        v0[1] = v0[1] + 1;
        return a0;
    }
    *v0 = *v0 + 1;
}
