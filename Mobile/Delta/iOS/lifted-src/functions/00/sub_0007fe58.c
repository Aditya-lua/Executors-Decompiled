/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7fe58..0x7fe70 (24 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_7fe58_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
    char padding_20[40];
    unsigned int field_48;
} st_7fe58_0;


st_7fe58_0 * sub_7fe58(st_7fe58_0 *a0)
{
    a0->field_18 = a0->field_10;
    a0->field_8 = a0->field_0;
    a0->field_48 = 0;
    return a0;
}
