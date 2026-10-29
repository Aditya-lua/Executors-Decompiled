/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xab8ce4..0xab8cf8 (20 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ab8ce4_0 {
    char padding_0[12];
    unsigned int field_c;
} st_ab8ce4_0;


int sub_ab8ce4(st_ab8ce4_0 *a0)
{
    if (!a0)
        return 20;
    return a0->field_c;
}
