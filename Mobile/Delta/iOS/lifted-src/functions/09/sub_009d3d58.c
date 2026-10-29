/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d3d58..0x9d3d68 (16 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9d3d58_0 {
    char padding_0[48];
    unsigned int field_30;
} st_9d3d58_0;


st_9d3d58_0 * sub_9d3d58(st_9d3d58_0 *a0, unsigned int a1)
{
    a0->field_30 = a0->field_30 & ~a1;
    return a0;
}
