/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4eed8..0x4eefc (36 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4eed8_0 {
    char padding_0[64];
    unsigned long long field_40;
    unsigned long long field_48;
} st_4eed8_0;


int sub_4eed8(st_4eed8_0 *a0)
{
    unsigned long v0;  // x8

    v0 = a0->field_40 + 1;
    a0->field_40 = (v0 & 0x8080808080808080) - ((v0 & 0x8080808080808080) >> 7) | v0 & 0x7f7f7f7f7f7f7f7f;
    a0->field_48 = 0;
    return 0;
}
