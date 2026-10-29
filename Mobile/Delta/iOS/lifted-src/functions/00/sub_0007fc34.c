/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7fc34..0x7fc60 (44 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_7fc34_0 {
    char padding_0[8];
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
    char padding_20[8];
    unsigned long long field_28;
    char padding_30[8];
    char field_38;
    char padding_39[7];
    unsigned int field_40;
} st_7fc34_0;


st_7fc34_0 * sub_7fc34(st_7fc34_0 *a0)
{
    unsigned long long v0;  // x9

    v0 = a0->field_8;
    a0->field_18 = a0->field_10;
    a0->field_28 = v0 & 0xffffffffffffffc0;
    a0->field_38 = 0;
    if (a0->field_40 >= 2)
        a0->field_40 = 1;
    return a0;
}
