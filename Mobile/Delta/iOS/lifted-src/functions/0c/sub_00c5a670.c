/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc5a670..0xc5a6c0 (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c5a670_0 {
    unsigned long long field_0;
    long long field_8;
    char padding_10[8];
    unsigned long long field_18;
} st_c5a670_0;


st_c5a670_0 * sub_c5a670(st_c5a670_0 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (a0->field_0)
    {
        if (a0->field_0 != 0x8000000000000000)
        {
            v0 = v5;
            v1 = v6;
            v2 = &v4;
            v3 = v7;
            _free(a0->field_8);
        }
        else
        {
            return a0;
        }
    }
    if (!a0->field_18)
        return a0;
    return _free();
}
