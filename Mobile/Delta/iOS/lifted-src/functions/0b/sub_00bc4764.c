/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbc4764..0xbc47ec (136 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bc4764_0 {
    unsigned long long field_0;
    long long field_8;
    long long field_10;
    unsigned long long field_18;
    unsigned long long field_20;
} st_bc4764_0;


unsigned long long sub_bc4764(st_bc4764_0 *a0)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0->field_20)
        _free(a0->field_18 - (a0->field_20 * 8 + 15 & 0xfffffffffffffff8));
    v2 = sub_b9eec8(a0->field_8, a0->field_10);
    if (!a0->field_0)
        return v2;
    return _free();
}
