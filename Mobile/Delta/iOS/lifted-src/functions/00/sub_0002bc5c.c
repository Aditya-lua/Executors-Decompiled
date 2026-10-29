/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2bc5c..0x2bc74 (24 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2bc5c_0 {
    char padding_0[8];
    unsigned long long field_8;
    char padding_10[16];
    unsigned int field_20;
} st_2bc5c_0;


st_2bc5c_0 * sub_2bc5c(st_2bc5c_0 *a0, unsigned int a1)
{
    *(unsigned int *)(a0->field_8 + a0->field_20 * 0x88 + 32) = a1;
    return a0;
}
