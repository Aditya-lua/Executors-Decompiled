/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xab8cf8..0xab8d0c (20 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ab8cf8_0 {
    char padding_0[16];
    unsigned int field_10;
} st_ab8cf8_0;


int sub_ab8cf8(st_ab8cf8_0 *a0)
{
    if (!a0)
        return 1;
    return a0->field_10;
}
