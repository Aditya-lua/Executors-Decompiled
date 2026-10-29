/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6e990..0xa6e9d8 (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a6e990_0 {
    unsigned long long field_0;
    char padding_8[8];
    unsigned long long field_10;
    char padding_18[8];
    unsigned long long field_20;
    char padding_28[8];
    char field_30;
} st_a6e990_0;


char sub_a6e990(st_a6e990_0 *a0)
{
    char v0;  // x8

    v0 = (char)a0->padding_8;
    if (!a0->padding_8)
    {
        if (a0->field_0)
        {
            v0 = *(long long *)(a0->field_0 + 8);
            if (!*(long long *)(a0->field_0 + 8))
                return 0;
        }
        else
        {
            return 0;
        }
    }
    if (a0->field_30 & 1)
        return v0 + a0->field_20 - a0->field_10;
    return v0 + a0->field_10;
}
