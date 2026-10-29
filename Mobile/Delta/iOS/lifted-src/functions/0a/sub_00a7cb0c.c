/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa7cb0c..0xa7cb40 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a7cb0c_0 {
    uint128_t field_0;
    char field_10;
    char padding_11[59];
    int field_4c;
} st_a7cb0c_0;


int sub_a7cb0c(st_a7cb0c_0 *a0)
{
    *(uint128_t *)&a0->field_4c = 0;
    memset(&a0->field_10, 0, 64);
    a0->field_0 = 0x1032547698badcfeefcdab8967452301;
    return 1;
}
