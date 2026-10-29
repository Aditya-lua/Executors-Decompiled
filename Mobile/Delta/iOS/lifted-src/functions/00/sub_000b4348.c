/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4348..0xb4368 (32 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b4348_0 {
    unsigned int field_0;
    char padding_4[8];
    unsigned int field_c;
} st_b4348_0;


long long sub_b4348(st_b4348_0 *a0, unsigned long long a1)
{
    if (a0->field_0 != 1)
        return 0;
    return a1 / a0->field_c;
}
