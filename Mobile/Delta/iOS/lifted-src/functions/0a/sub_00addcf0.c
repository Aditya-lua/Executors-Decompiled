/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaddcf0..0xaddd10 (32 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_addcf0_0 {
    char padding_0[56];
    char field_38;
} st_addcf0_0;


st_addcf0_0 * sub_addcf0(st_addcf0_0 *a0)
{
    unsigned long long v0;  // x8
    unsigned long long v1;  // x9

    if (!a0)
        return a0;
    v0 = 40;
    v1 = 48;
    if (!(a0->field_38 & 2))
        v0 = v1;
    return *(long long *)&a0->padding_0[v0];
}
