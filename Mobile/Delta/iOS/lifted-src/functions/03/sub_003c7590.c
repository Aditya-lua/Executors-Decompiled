/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3c7590..0x3c75b4 (36 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3c7590_0 {
    char padding_0[152];
    unsigned long long field_98;
    char field_a0;
} st_3c7590_0;


long long sub_3c7590(st_3c7590_0 **a0)
{
    if (!(*a0->field_a0 & 1))
        return *a0->field_98 != 0;
    return 1;
}
