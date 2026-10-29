/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa7d710..0xa7d734 (36 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a7d710_0 {
    uint128_t field_0;
    char field_10;
    char padding_11[59];
    int field_4c;
} st_a7d710_0;


int sub_a7d710(st_a7d710_0 *a0)
{
    *(uint128_t *)&a0->field_4c = 0;
    memset(&a0->field_10, 0, 64);
    a0->field_0 = 0x1032547698badcfeefcdab8967452301;
    return 1;
}
