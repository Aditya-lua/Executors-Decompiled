/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x14f64..0x14fdc (120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_14f64_1 {
    char padding_0[128];
    long long field_80;
    char padding_88[264];
    unsigned long long field_190;
    unsigned long long field_198;
} st_14f64_1;

typedef struct st_14f64_0 {
    char field_0;
} st_14f64_0;


unsigned long long sub_14f64(st_14f64_1 *a0)
{
    unsigned long long v4;  // x0
    st_14f64_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_14f64_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = sub_10a78();
    sub_16df8(a0, a0->field_198 - a0->field_190 >> 3);
    if (!(int)a0->field_80)
        return v4;
    sub_1b378(a0, 0, 0);
    return v4;
}
