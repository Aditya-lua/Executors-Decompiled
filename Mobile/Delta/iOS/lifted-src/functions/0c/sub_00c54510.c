/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc54510..0xc54568 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c54510_0 {
    char padding_0[16];
    unsigned long long field_10;
    char padding_18[16];
    long long field_28;
} st_c54510_0;


unsigned long long sub_c54510(st_c54510_0 *a0)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_c54460(a0->field_28);
    if (!a0->field_10)
        return v2;
    return _free();
}
