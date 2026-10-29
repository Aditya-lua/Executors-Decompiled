/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x99c008..0x99c024 (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_99c008_0 {
    char padding_0[352];
    unsigned long long field_160;
} st_99c008_0;


int sub_99c008(st_99c008_0 *a0)
{
    if (a0->field_160 >> 9 & 1)
        a0->field_160 = a0->field_160 & 0xfffffffffffffdff | 0x1000;
    return 1;
}
