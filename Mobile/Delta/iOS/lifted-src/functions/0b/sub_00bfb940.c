/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbfb940..0xbfba2c (236 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bfb940_0 {
    unsigned long long field_0;
    long long field_8;
    long long field_10;
    unsigned long long field_18;
    unsigned long long field_20;
    unsigned long long field_28;
} st_bfb940_0;


unsigned long long sub_bfb940(st_bfb940_0 *a0)
{
    unsigned long long v2;  // x20
    unsigned long v3;  // x23
    unsigned long long v4;  // x23
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_bfcc24(a0->field_8, a0->field_10);
    if (a0->field_0)
        _free(a0->field_8);
    v2 = a0->field_20;
    v3 = a0->field_28 + 1;
    while (1)
    {
        v4 = v3 - 1;
        if (v3 == 1)
            break;
        v2 += 64;
        sub_bfcde4();
        v3 = v4;
    }
    if (!a0->field_18)
        return v2;
    return _free();
}
