/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9882a8..0x9882bc (20 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9882a8_0 {
    char padding_0[16];
    unsigned long long field_10;
} st_9882a8_0;


long long sub_9882a8(st_9882a8_0 *a0, st_9882a8_0 *a1)
{
    return a0->field_10 != a1->field_10;
}
