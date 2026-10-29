/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9796d4..0x9796e0 (12 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9796d4_0 {
    char padding_0[1568];
    unsigned long long field_620;
} st_9796d4_0;


unsigned long long sub_9796d4(st_9796d4_0 *a0)
{
    return (a0->field_620 * 0x8000000 | a0->field_620 >> 37) & 0xfffffffff8000001 & 1;
}
