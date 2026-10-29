/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d3d68..0x9d3d74 (12 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9d3d68_0 {
    char padding_0[48];
    unsigned int field_30;
} st_9d3d68_0;


unsigned int sub_9d3d68(st_9d3d68_0 *a0, unsigned int a1)
{
    return a0->field_30 & a1;
}
