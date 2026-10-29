/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x78620..0x78690 (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_78620_0 {
    unsigned long long field_0;
    unsigned int field_8;
    char padding_c[4];
    unsigned long long field_10;
    unsigned long long field_18;
    unsigned long long field_20;
} st_78620_0;


unsigned long long sub_78620(st_78620_0 *a0)
{
    unsigned int v2;  // w8
    unsigned long long v3;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_8;
    a0->field_0 = 1 << ((char)v2 & 63) | a0->field_0;
    a0->field_8 = v2 + 1;
    sub_783b4();
    if (a0->field_20 <= a0->field_18)
        return 0;
    v3 = a0->field_18 - a0->field_10;
    if (a0->field_8)
        return v3 + 1;
    return v3;
}
