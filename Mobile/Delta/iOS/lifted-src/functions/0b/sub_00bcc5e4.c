/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbcc5e4..0xbcc6e0 (252 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bcc5e4_0 {
    unsigned long long field_0;
    long long field_8;
    char padding_10[8];
    unsigned long long field_18;
    unsigned long long field_20;
    unsigned long long field_28;
    long long field_30;
} st_bcc5e4_0;


unsigned long long sub_bcc5e4(st_bcc5e4_0 *a0)
{
    unsigned long long v2;  // x21
    unsigned long v3;  // x23
    unsigned long long v4;  // x23
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_bcad60(a0->field_30);
    _free(a0->field_30);
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
        sub_b9b2c4();
        v3 = v4;
    }
    if (!a0->field_18)
        return v2;
    return _free();
}
