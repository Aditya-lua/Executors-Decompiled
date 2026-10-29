/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa229c..0xaa22d4 (56 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aa229c_0 {
    long long field_0;
    unsigned long long field_8;
} st_aa229c_0;


long long sub_aa229c(st_aa229c_0 *a0)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_a99eac(a0->field_0) != 155)
        return 0;
    return a0->field_8;
}
