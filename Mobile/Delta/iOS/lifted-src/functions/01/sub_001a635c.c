/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a635c..0x1a6374 (24 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1a635c_0 {
    char padding_0[24];
    unsigned int field_18;
} st_1a635c_0;


long long sub_1a635c(st_1a635c_0 *a0)
{
    return (a0->field_18 & 1520) == 0x400;
}
