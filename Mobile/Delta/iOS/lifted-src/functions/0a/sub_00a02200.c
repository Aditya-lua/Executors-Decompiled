/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa02200..0xa02234 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a02200_0 {
    char padding_0[192];
    unsigned long long field_c0;
} st_a02200_0;


unsigned long long sub_a02200(st_a02200_0 *a0)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a60188(&a0->padding_0[8]);
    if (!(unsigned int)v2)
        return v2;
    a0->field_c0 = a0->field_c0 + 1;
    return v2;
}
