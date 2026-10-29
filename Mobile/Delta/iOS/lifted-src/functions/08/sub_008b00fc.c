/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x8b00fc..0x8b0148 (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_8b00fc_1 {
    char padding_0[8];
    unsigned long long field_8;
    unsigned long long field_10;
    char padding_18[8];
    unsigned long long field_20;
} st_8b00fc_1;

typedef struct st_8b00fc_0 {
    char field_0;
} st_8b00fc_0;


long long sub_8b00fc(st_8b00fc_1 *a0)
{
    unsigned long long v2;  // x9
    st_8b00fc_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_8b00fc_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    v2 = a0->field_20 >> 6;
    if (a0->field_10 == a0->field_8)
        return a0->field_8 + v2 * 8;
    return a0->field_8 + v2 * 8;
}
