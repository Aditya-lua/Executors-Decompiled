/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa4f0b8..0xa4f0d8 (32 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a4f0b8_0 {
    unsigned int field_0;
    char padding_4[4];
    unsigned long long field_8;
} st_a4f0b8_0;


void sub_a4f0b8(char a0, unsigned long a1, st_a4f0b8_0 *a2)
{
    if (a2->field_0 != a0)
        return;
    goto *((void *)(a2->field_8));
}
