/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa12894..0xa128b0 (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a12894_0 {
    char padding_0[64];
    long long field_40;
} st_a12894_0;


int sub_a12894(st_a12894_0 *a0)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    return sub_9e46a8(a0->field_40) - 1;
}
