/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x989bd4..0x989c00 (44 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_989bd4_0 {
    char padding_0[256];
    unsigned long long field_100;
} st_989bd4_0;


int sub_989bd4(unsigned long a0, st_989bd4_0 *a1)
{
    if ((a1->field_100 & 0xff0000) != 0x50000)
        return 0;
    a1->field_100 = a1->field_100 & 0xffffffffff00ffff | 0x60000;
    return 1;
}
