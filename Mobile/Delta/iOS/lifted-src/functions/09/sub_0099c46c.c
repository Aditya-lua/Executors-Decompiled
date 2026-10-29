/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x99c46c..0x99c480 (20 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_99c46c_0 {
    char padding_0[2876];
    uint128_t field_b3c;
} st_99c46c_0;


int sub_99c46c(st_99c46c_0 *a0)
{
    *(uint128_t *)&(a0->padding_0)[1] = 0;
    return 1;
}
