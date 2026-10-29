/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x98052c..0x980540 (20 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_98052c_0 {
    char padding_0[16];
    unsigned long long field_10;
} st_98052c_0;


long long sub_98052c(st_98052c_0 *a0, st_98052c_0 *a1)
{
    return a0->field_10 != a1->field_10;
}
