/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a7f50..0x1a7fac (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1a7f50_1 {
    char padding_0[8];
    unsigned long long field_8;
} st_1a7f50_1;

typedef struct st_1a7f50_0 {
    char field_0;
} st_1a7f50_0;


long long sub_1a7f50(st_1a7f50_1 *a0)
{
    st_1a7f50_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_1a7f50_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (!sub_6b08(a0 + 2))
        return a0->field_8;
    return sub_a0c8(a0 + 2);
}
