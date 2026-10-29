/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc0d718..0xc0d740 (40 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c0d718_0 {
    char field_0;
    char padding_1[7];
    unsigned long long field_8;
} st_c0d718_0;


void sub_c0d718(st_c0d718_0 *a0)
{
    unsigned int v0;  // w8

    v0 = a0->field_0;
    if (v0 != 5 && v0 != 8)
        return;
    if (!a0->field_8)
        return;
}
