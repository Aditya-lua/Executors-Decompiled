/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xab8cd0..0xab8ce4 (20 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ab8cd0_0 {
    char padding_0[8];
    unsigned int field_8;
} st_ab8cd0_0;


int sub_ab8cd0(st_ab8cd0_0 *a0)
{
    if (!a0)
        return 64;
    return a0->field_8;
}
