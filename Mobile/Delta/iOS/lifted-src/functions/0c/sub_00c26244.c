/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc26244..0xc2636c (296 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c26244_0 {
    unsigned long long field_0;
    long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
    unsigned long long field_20;
    unsigned long long field_28;
} st_c26244_0;


unsigned long long sub_c26244(st_c26244_0 *a0)
{
    unsigned long v2;  // x23
    unsigned long long v3;  // x23
    unsigned long long v4;  // x21
    unsigned long v5;  // x23
    unsigned long v6;  // x23
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_10 + 1;
    while (1)
    {
        v3 = v2 - 1;
        if (v2 == 1)
            break;
        sub_c26704();
        v2 = v3;
    }
    if (a0->field_0)
        _free(a0->field_8);
    v4 = a0->field_20;
    v5 = a0->field_28 + 1;
    while (1)
    {
        v6 = v5 - 1;
        if (v5 == 1)
            break;
        v4 += 64;
        sub_c2636c();
        v5 = v6;
    }
    if (!a0->field_18)
        return v4;
    return _free();
}
