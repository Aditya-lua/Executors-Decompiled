/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa97ff8..0xa98010 (24 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a97ff8_0 {
    char padding_0[60];
    unsigned int field_3c;
} st_a97ff8_0;


int sub_a97ff8(st_a97ff8_0 *a0, unsigned int a1)
{
    unsigned int v0;  // w8

    if (a1 == 1)
        v0 = 0xffffffff;
    else
        v0 = 0;
    a0->field_3c = v0;
    return 1;
}
