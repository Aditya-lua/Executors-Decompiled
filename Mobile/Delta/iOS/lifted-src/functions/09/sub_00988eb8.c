/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x988eb8..0x988ecc (20 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_988eb8_0 {
    char padding_0[80];
    char field_50;
} st_988eb8_0;


st_988eb8_0 * sub_988eb8(st_988eb8_0 *a0)
{
    unsigned long v0;  // x8

    v0 = a0->field_50;
    if (!(v0 & 1))
        a0->field_50 = (char)v0 | 1;
    return a0;
}
