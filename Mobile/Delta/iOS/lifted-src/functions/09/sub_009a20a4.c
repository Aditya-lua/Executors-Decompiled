/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a20a4..0x9a20bc (24 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9a20a4_0 {
    char padding_0[2482];
    char field_9b2;
    char padding_9b3[353];
    unsigned int field_b14;
} st_9a20a4_0;


int sub_9a20a4(st_9a20a4_0 *a0)
{
    if (!(a0->field_9b2 >> 3 & 1))
        a0->field_b14 = 1;
    return 1;
}
