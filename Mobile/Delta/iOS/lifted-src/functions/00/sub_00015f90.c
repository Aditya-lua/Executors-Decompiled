/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x15f90..0x15fe8 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_15f90_0 {
    long long field_0;
    char padding_8[16];
    unsigned long long field_18;
} st_15f90_0;


st_15f90_0 * sub_15f90(st_15f90_0 *a0)
{
    long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_1cc8c();
    v2 = a0->field_0;
    if (!v2)
        return a0;
    sub_4e14(v2, 10248191152060862009 * ((long long)(a0->field_18 - v2) >> 2), 4);
    return a0;
}
