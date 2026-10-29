/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa225c..0xaa2294 (56 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aa225c_0 {
    long long field_0;
    unsigned long long field_8;
} st_aa225c_0;


long long sub_aa225c(st_aa225c_0 *a0)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_a99eac(a0->field_0) != 150)
        return 0;
    return a0->field_8;
}
