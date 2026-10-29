/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb65bc8..0xb65c48 (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b65bc8_0 {
    unsigned long long field_0;
    long long field_8;
    long long field_10;
    unsigned long long field_18;
    unsigned long long field_20;
} st_b65bc8_0;


unsigned long long sub_b65bc8(st_b65bc8_0 *a0)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0->field_20)
        _free(a0->field_18 - a0->field_20 * 8 - 8);
    v2 = sub_bffb80(a0->field_8, a0->field_10);
    if (!a0->field_0)
        return v2;
    return _free();
}
