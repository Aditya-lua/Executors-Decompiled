/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97efb8..0x97efdc (36 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_97efb8_0 {
    char padding_0[16];
    unsigned long long field_10;
} st_97efb8_0;


int sub_97efb8(st_97efb8_0 *a0, st_97efb8_0 *a1)
{
    if (a0->field_10 != a1->field_10)
        return 1;
}
