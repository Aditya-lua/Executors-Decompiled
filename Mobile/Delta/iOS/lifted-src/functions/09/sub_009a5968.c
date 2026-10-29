/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a5968..0x9a5980 (24 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9a5968_0 {
    char padding_0[188];
    unsigned int field_bc;
} st_9a5968_0;


st_9a5968_0 * sub_9a5968(st_9a5968_0 *a0, unsigned int a1)
{
    unsigned int v0;  // w8

    if (!a1)
        v0 = a0->field_bc - 1;
    else
        v0 = a0->field_bc + 1;
    a0->field_bc = v0;
    return a0;
}
