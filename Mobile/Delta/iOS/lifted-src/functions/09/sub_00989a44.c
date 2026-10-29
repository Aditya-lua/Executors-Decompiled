/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x989a44..0x989a70 (44 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_989a44_0 {
    char padding_0[256];
    unsigned long long field_100;
} st_989a44_0;


int sub_989a44(unsigned long a0, st_989a44_0 *a1)
{
    if ((a1->field_100 & 0xff0000) != 0x10000)
        return 0;
    a1->field_100 = a1->field_100 & 0xffffffffff00ffff | 0x20000;
    return 1;
}
