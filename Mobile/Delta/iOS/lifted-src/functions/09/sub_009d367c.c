/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d367c..0x9d36ac (48 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9d367c_0 {
    char padding_0[1];
    char field_1;
} st_9d367c_0;


long long sub_9d367c(st_9d367c_0 *a0)
{
    unsigned int v0;  // w8
    unsigned int v1;  // w11

    v0 = a0->field_1;
    if (v0 != 30)
        v1 = 108;
    else
        v1 = 28;
    if (v0 == 2)
        v1 = 16;
    if (v0 != 1)
        return v1;
    return 106;
}
